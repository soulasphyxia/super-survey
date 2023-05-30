package com.soulasphyxia.supersurvey.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
public class Survey {
      private int id;
      //private String name;
      //private String startDate;
      //private String endDate;
      private ArrayList<Question> listOfQuestions;
      //private Boolean activity;
}
