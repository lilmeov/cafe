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

    public List<Cafe> getCafesByDescription(String description){
        return cafeRepository.getCafesByDescription(description);
    }

    public Cafe saveNewCafe (String name, String description){
        Cafe cafe = new Cafe(name, description);
        return cafeRepository.save(cafe);
    }

    public Cafe getCafeById (Long id){
        return cafeRepository.getCafeById(id);
    }
}
