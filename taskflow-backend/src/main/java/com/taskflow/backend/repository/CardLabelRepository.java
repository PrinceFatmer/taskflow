package com.taskflow.backend.repository;

import com.taskflow.backend.entity.CardLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CardLabelRepository extends JpaRepository<CardLabel, Long> {
    List<CardLabel> findByCardId(Long cardId);
}