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
        System.out.println("All Surveys: ");
        return repository.getAllSurveys();
    }

    public void addSurvey(Survey survey) {
        repository.save(survey);
        System.out.println("Survey was added successfully");
    }

    public void editSurvey(Survey survey) {}

    public void deleteSurvey(Survey survey) {
        repository.delete(survey);
        System.out.println("Survey was deleted successfully");
    }
}
