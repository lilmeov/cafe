package com.example.cafe.rating;

import com.example.cafe.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository<Comment, Long> {
}
