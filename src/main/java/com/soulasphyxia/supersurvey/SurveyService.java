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
        System.out.println("All Surveys");
        return new ArrayList<>();
    }

    public void addSurvey(Survey id) {
        System.out.println("Survey was added successfully");
    }

    public void editSurvey(Survey id) {
        System.out.println("Survey was edited successfully");
    }

    public void deleteSurvey(Survey id) {
        System.out.println("Survey was deleted successfull");
    }
}
