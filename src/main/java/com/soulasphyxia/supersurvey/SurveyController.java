package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/all")
    public List<Survey> allSurveys() {
        return surveyService.getAllSurveys();
    }

    @PostMapping("/add")
    public void addSurvey(@RequestBody Survey survey) {
    }

    @PutMapping("/edit")
    public void editSurvey(@RequestBody Survey survey) {

    }

    @DeleteMapping("/delete")
    public void deleteSurvey(@RequestParam(value = "surveyId") String stringSurveyId) {

    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Something went wrong";
    }


}
