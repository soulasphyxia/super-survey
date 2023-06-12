package com.soulasphyxia.supersurvey;
import com.soulasphyxia.supersurvey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
    List<Survey> findAllByName(String name);
    List<Survey> findAllByStartDate(LocalDate startDate);

    List<Survey> findAllByActivity(Boolean activity);
}
