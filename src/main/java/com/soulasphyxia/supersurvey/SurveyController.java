package com.soulasphyxia.supersurvey;
import com.soulasphyxia.supersurvey.model.Survey;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/all")
    public List<Survey> allSurveys(@RequestParam(value = "sort",defaultValue = "id") String sort,
                                   @RequestParam(value = "name", required = false) String name,
                                   @RequestParam(value = "startDate", required = false) String startDate,
                                   @RequestParam(value = "activity", required = false) String activity) {
        return surveyService.getAllSurveys(sort,name,startDate,activity);
    }

    @GetMapping("/{id}")
    public Survey getSurvey(@PathVariable Long id) {
        return surveyService.getSurvey(id);
    }

    @PostMapping("/add")
    public void addSurvey(@RequestBody Survey survey) {
        surveyService.add(survey);
    }

    @PutMapping("/edit/{id}")
    public void editSurvey(@PathVariable Long id,@RequestBody Survey survey) {
        surveyService.edit(id,survey);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyService.delete(id);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        log.error(e.getMessage());
        return "Something went wrong";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handle(NullPointerException e) {
        log.error(e.getMessage());
        return "No survey with such id!";
    }


}
