package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

@Service
@AllArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;


    public ArrayList<Survey> getAllSurveys(String sort) {
        ArrayList<Survey> surveys = repository.getAllSurveys();
        switch (sort) {
            case "name" -> surveys.sort(Comparator.comparing(Survey::getName));
            case "id" -> surveys.sort(Comparator.comparing(Survey::getId));
            default -> System.out.println("No option with such parameter.");
        }
        return surveys;
    }

    public void addSurvey(Survey survey) {
        if(!repository.containsSurveyWithId(survey.getId())) {
            repository.save(survey);
        }else {
            throw new IllegalArgumentException("There is already survey with id: " + survey.getId());
        }
    }

    public void editSurvey(Survey survey) {
        if(repository.containsSurveyWithId(survey.getId())){
            repository.edit(survey);
        }else {
            throw new IllegalArgumentException("There is no survey with id: " + survey.getId());
        }

    }

    public void deleteSurvey(int id) {
        if(repository.containsSurveyWithId(id)) {
            repository.delete(id);
        } else{
            throw new IllegalArgumentException("There is no survey with id: " + id);
        }


    }
}
