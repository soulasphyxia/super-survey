package com.soulasphyxia.supersurvey.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
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
      @Column(name="survey_id")
      private Long id;
      private String name;
      @Column(name="start_date")
      private LocalDate startDate;
      @Column(name="end_date")
      private LocalDate endDate;
      private Boolean activity;

      @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
      @JoinColumn(name = "survey_id")
      private List<Question> questions;


}
