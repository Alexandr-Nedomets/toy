package com.shop.toy.models.dto;

import com.shop.toy.models.entity.User;
import com.shop.toy.models.entity.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private User user;
}
