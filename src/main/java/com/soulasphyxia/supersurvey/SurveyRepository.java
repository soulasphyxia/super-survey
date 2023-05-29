package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import com.soulasphyxia.supersurvey.model.Question;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SurveyRepository {
    ArrayList<Survey> storage = new ArrayList<>(List.of(new Survey(1,"survey1",new ArrayList<>(List.of(new Question(1L,"What's your name?"),new Question(2L,"How old are you?")))),new Survey(2,"survey2",new ArrayList<>(List.of(new Question(1L,"2+2=?"),new Question(2L,"2+2*2?"))))));

    public ArrayList<Survey> getAllSurveys() {
        return new ArrayList<>(List.copyOf(storage));
    }

    public void save(Survey survey) {
        if(!storage.contains(survey)){
            storage.add(survey);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void delete(Survey survey)
    {
        storage.remove(survey);
    }

}
