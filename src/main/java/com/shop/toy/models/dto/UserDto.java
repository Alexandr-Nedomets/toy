package com.shop.toy.models.dto;

import com.shop.toy.models.entity.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto  {
    private Long id;
    @Email(message = "bad email")
    private String username;
    @Size(min = 3, max = 10, message = "password contains from 3 to 10 signs")
    private String password;
    private Role role;
}
