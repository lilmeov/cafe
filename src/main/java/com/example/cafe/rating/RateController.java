package com.example.cafe.rating;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rates")
@RequiredArgsConstructor
public class RateController {
    private final RateService rateService;


    @GetMapping("/save")
    public String saveComment(@RequestParam(value = "cafeId") Long cafeId,
                              @RequestParam(value = "rate") Integer rate,
                              @RequestParam(value = "userName") String userName){

        rateService.saveRating(rate, cafeId, userName);

        return "redirect:/cafes/cafe/"+cafeId;
    }

}
