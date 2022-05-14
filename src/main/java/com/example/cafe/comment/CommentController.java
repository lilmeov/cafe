package com.example.cafe.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;


    @GetMapping("/save")
    public String saveComment(@RequestParam(value = "cafeId") Long cafeId,
                              @RequestParam(value = "comment") String comment,
                              @RequestParam(value = "userName") String userName){
        commentService.saveComment(cafeId, userName, comment);

        return "redirect:/cafes/cafe/"+cafeId;
    }

}
