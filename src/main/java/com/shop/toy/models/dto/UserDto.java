package com.shop.toy.models.dto;

import com.shop.toy.models.entity.enumeration.Role;
import com.shop.toy.models.entity.enumeration.Status;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class UserDto  {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
    private Status status;
}
