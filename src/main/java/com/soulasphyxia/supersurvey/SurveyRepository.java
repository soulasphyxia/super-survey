package com.soulasphyxia.supersurvey;
import com.soulasphyxia.supersurvey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {}
