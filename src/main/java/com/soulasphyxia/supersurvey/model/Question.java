package com.soulasphyxia.supersurvey.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private Long orderId;
    private String text;

}
