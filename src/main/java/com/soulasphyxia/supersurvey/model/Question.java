package com.soulasphyxia.supersurvey.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="questions")

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int question_id;
    private String text;
    @Column(name="order")
    private Long order;
    @Column(name="survey_id")
    private Long surveyId;


}
