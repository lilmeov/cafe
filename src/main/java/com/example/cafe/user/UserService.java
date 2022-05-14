package com.example.cafe.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void  saveUser(String userName, String password){
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
        String encoded = encode.encode(password);
        User user = new User(userName, encoded, true, "USER");
        userRepository.save(user);
    }

    public User getUserByName(String name){
        return userRepository.getUserByUsername(name);
    }
}
