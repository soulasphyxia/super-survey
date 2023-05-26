package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class SurveyRepository {
    ArrayList<Survey> storage = new ArrayList<>();


}
