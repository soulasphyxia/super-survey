package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;

    public List<Survey> getAllSurveys(String sort,String name, String startDate,String activity) {
        List<Survey> surveys;
        if(name != null) {
            surveys = repository.findAllByName(name);
        } else if (startDate != null) {
            surveys = repository.findAllByStartDate(LocalDate.parse(startDate));
        } else if (activity != null) {
            surveys = repository.findAllByActivity(Boolean.parseBoolean(activity));
        }else {
            surveys = repository.findAll();
        }

        switch (sort) {
            case "id" -> surveys = surveys.stream()
                                          .sorted(Comparator.comparingLong(Survey::getId))
                                          .collect(Collectors.toList());
            case "name" -> surveys = surveys.stream()
                                            .sorted(Comparator.comparing(Survey::getName))
                                            .collect(Collectors.toList());
            case "startDate" -> surveys = surveys.stream()
                                                 .sorted(Comparator.comparing(Survey::getStartDate))
                                                 .collect(Collectors.toList());
            case "default" -> throw new NullPointerException("No sort with such parameter");
        }
        return surveys;
    }

    public void add(Survey survey) {
        survey.getQuestions().forEach(x -> x.setSurveyId(x.getSurveyId()));
        repository.save(survey);
    }

    public void edit(Long id,Survey survey) {
        Survey surveyToEdit = getSurvey(id);
        survey.setId(surveyToEdit.getId());
        add(survey);
    }

    public void delete(Long id) {
        Survey surveyToDelete = getSurvey(id);
        repository.delete(surveyToDelete);
    }

    public Survey getSurvey(Long id) {
        Optional<Survey> optionalSurvey = repository.findById(id);
        try {
            return optionalSurvey.get();
        }catch (Exception e) {
            throw new NullPointerException();
        }
    }
}
