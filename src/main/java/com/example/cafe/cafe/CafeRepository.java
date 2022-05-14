package com.example.cafe.cafe;

import com.example.cafe.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {
    List<Cafe> getCafesByName (String name);
    List<Cafe> getCafesByDescription(String description);

    Cafe getCafeById (Long id);
}
