package com.springChat.application.services;

import com.springChat.application.dto.user.UserRestDTO;
import com.springChat.domain.model.User;
import com.userRepository.applications.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDTO mapToRepositoryUserDTO(User user){
        return new UserDTO(user.getId(),user.getNick());
    }
    public com.springChat.application.dto.user.UserDTO mapToUserDTO(User user){
        return new com.springChat.application.dto.user.UserDTO(user.getId(),user.getNick());
    }
    public UserRestDTO meptoUesrRestDTO(User user){
        return new UserRestDTO(user.getId(),user.getNick());
    }
    public User mapToDomainUser(UserDTO userDTO){
        return new User(userDTO.getId(),userDTO.getNick());
    }
}
