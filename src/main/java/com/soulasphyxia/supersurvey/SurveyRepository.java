package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import com.soulasphyxia.supersurvey.model.Question;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SurveyRepository {
    ArrayList<Survey> storage = new ArrayList<>(List.of(new Survey(1,new ArrayList<>(List.of(new Question(1L,"What's your name?"),new Question(2L,"How old are you?")))),new Survey(2,new ArrayList<>(List.of(new Question(1L,"2+2=?"),new Question(2L,"2+2*2?"))))));

    public ArrayList<Survey> getAllSurveys() {
        return new ArrayList<>(List.copyOf(storage));
    }

    public void save(Survey survey) {
        storage.add(survey);
    }

    public Survey getSurveyFromId(int id) {
        return storage.stream().filter(x -> x.getId() == id).toList().get(0);
    }


    public void edit(Survey newSurvey){
        int index = storage.indexOf(getSurveyFromId(newSurvey.getId()));
        storage.set(index,newSurvey);
    }

    public void delete(int id)
    {
        storage.remove(getSurveyFromId(id));
    }

}
