package com.soulasphyxia.supersurvey;

import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@Slf4j
@RestController
@AllArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;
    @GetMapping("/all")
    public ArrayList<Survey> getAllSurveys(@RequestParam(value="sort") String sort,
                                           @RequestParam(required = false) String filter) {

        return surveyService.getAllSurveys(sort);
    }

    @PostMapping("/add")
    public void addSurvey(@RequestBody Survey survey) {
        surveyService.addSurvey(survey);
        log.debug("Survey was added successful");
    }

    @PutMapping("/edit")
    public void editSurvey(@RequestBody Survey survey) {
        surveyService.editSurvey(survey);
    }

    @DeleteMapping("/delete")
    public void deleteSurvey(@RequestParam(value = "surveyId") String stringSurveyId) {
        try{
            int surveyId = Integer.parseInt(stringSurveyId);
            surveyService.deleteSurvey(surveyId);
            log.debug("Survey was deleted successful");
        }catch(Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Something went wrong";
    }


}
