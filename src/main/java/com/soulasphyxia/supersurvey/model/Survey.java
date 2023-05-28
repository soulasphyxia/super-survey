package com.soulasphyxia.supersurvey.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Survey {
    private ArrayList<Question> listOfQuestions = new ArrayList<>();
    private Date startDate;
    private Date endDate;
    private Boolean activity;
    @Data
    static
    class Question{
        private Long orderId;
        private String text;
    }



}
