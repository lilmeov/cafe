package com.example.cafe.comment;

import com.example.cafe.cafe.Cafe;
import com.example.cafe.cafe.CafeRepository;
import com.example.cafe.cafe.CafeService;
import com.example.cafe.user.User;
import com.example.cafe.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final CafeService cafeService;
    private final UserService userService;

    public void saveComment(Long cafeId, String userName, String comment){
        Cafe cafe = cafeService.getCafeById(cafeId);
        User user = userService.getUserByName(userName);
        Comment comment1 = new Comment(comment, cafe, user);
        commentRepository.save(comment1);
    }

    public List<Comment> getCommentsByCafeId(Long cafeId){
        return commentRepository.getCommentsByCafeId(cafeId);
    }
}
