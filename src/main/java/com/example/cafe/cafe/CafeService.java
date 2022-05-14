package com.example.cafe.cafe;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CafeService {
    private final CafeRepository cafeRepository;

    public List<Cafe> getAllCafes(){
        return cafeRepository.findAll();
    }

    public List<Cafe> getCafesByName(String name){
        return cafeRepository.getCafesByName(name);
    }
}
