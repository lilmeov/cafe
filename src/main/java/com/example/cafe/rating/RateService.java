package com.example.cafe.rating;

import com.example.cafe.cafe.Cafe;
import com.example.cafe.cafe.CafeRepository;
import com.example.cafe.user.User;
import com.example.cafe.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateService {
    private final RateRepository rateRepository;
    private final CafeRepository cafeRepository;
    private final UserRepository userRepository;


    public List<Rate> getRatingsByCafeId(Long id){
        return rateRepository.getRatesByCafeId(id);
    }

    public void saveRating(Integer rate, Long cafeId, String userName){
        Cafe cafe = cafeRepository.getCafeById(cafeId);
        User user = userRepository.getUserByUsername(userName);
        Rate rate1 = new Rate(rate, cafe, user);
        rateRepository.save(rate1);
    }

}
