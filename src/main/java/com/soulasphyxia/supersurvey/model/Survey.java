package com.soulasphyxia.supersurvey.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="survey")

public class Survey {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name="id")
      private int id;
      private String name;
      @Column(name="start_date")
      private String startDate;
      @Column(name="end_date")
      private String endDate;
      private Boolean activity;

      @OneToMany
      @JoinColumn(name="survey_id")
      private List<Question> questions;


}
