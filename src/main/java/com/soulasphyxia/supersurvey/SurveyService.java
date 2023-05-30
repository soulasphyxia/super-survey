package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;

    public ArrayList<Survey> getAllSurveys(String filter) {
        if(filter == null) return repository.getAllSurveys();
        return repository.getAllSurveys();
    }

    public void addSurvey(Survey survey) {
        repository.save(survey);
    }

    public void editSurvey(Survey survey) {
        repository.edit(survey);

    }

    public void deleteSurvey(int id) {
        repository.delete(id);

    }
}
