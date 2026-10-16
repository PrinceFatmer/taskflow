package com.taskflow.backend.repository;

import com.taskflow.backend.entity.BoardMember;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BoardMemberRepository extends JpaRepository<BoardMember, Long> {
    List<BoardMember> findByUserId(Long userId);
    List<BoardMember> findByBoardId(Long boardId);
    Optional<BoardMember> findByBoardIdAndUserId(Long boardId, Long userId);
}