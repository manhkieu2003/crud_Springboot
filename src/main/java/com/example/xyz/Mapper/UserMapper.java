package com.example.xyz.Mapper;
// mapping dto sang entity hoặc ngược lại

import com.example.xyz.dto.UserDto;
import com.example.xyz.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    @Autowired
    private  ModelMapper mapper;
    // convert từ dto sang entity
    public  User convertEntity(UserDto userDto)
    {
        User entity = mapper.map(userDto,User.class);
        return entity;
    }
    // convert tu entity sang dto
    public  UserDto convertDto(User entity)
    {
        UserDto userDto = mapper.map(entity,UserDto.class);
        return userDto;
    }



}
