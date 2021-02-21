package com.shop.toy.services;

import com.shop.toy.models.dto.UserDto;
import com.shop.toy.models.entity.User;
import com.shop.toy.repositories.UserRepository;
import org.springframework.stereotype.Service;

import static com.shop.toy.models.mappers.UserMapper.USER_MAPPER;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto save(UserDto userDto) {
        User user = userRepository.save(USER_MAPPER.toUser(userDto));
        return USER_MAPPER.toUserDto(user);
    }
}
