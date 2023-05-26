package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@Slf4j
@RestController("/survey")
@AllArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/all")
    public ArrayList<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @PostMapping("/add")
    public void addSurvey(@RequestBody Survey survey) {
        surveyService.addSurvey(survey);
    }

    @PostMapping("/edit")
    public void editSurvey(@RequestBody Survey survey) {
        surveyService.editSurvey(survey);
    }

    @PostMapping("/delete")
    public void deleteSurvey(@RequestBody Survey survey) {
        surveyService.deleteSurvey(survey);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Something went wrong";
    }

}
