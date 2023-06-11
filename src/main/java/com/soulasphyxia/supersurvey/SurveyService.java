package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class SurveyService {
    private final SurveyRepository repository;

    public List<Survey> getAllSurveys() {
        return repository.findAll();
    }

}
