package com.taskflow.backend.repository;

import com.taskflow.backend.entity.CardAssignee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CardAssigneeRepository extends JpaRepository<CardAssignee, Long> {
    List<CardAssignee> findByCardId(Long cardId);
}