package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;

    public ArrayList<Survey> getAllSurveys() {
        return repository.getAllSurveys();
    }

    public void addSurvey(Survey survey) {
        repository.save(survey);
    }

    public void editSurvey(Survey survey, Long id) {
        Survey oldSurvey = repository.getSurveyFromId(id.intValue());
    }

    public void deleteSurvey(Long id) {
        repository.delete(id);

    }
}
