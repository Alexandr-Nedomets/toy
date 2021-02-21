package com.shop.toy.models.dto;

import com.shop.toy.models.entity.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto implements Serializable {
    private Long id;
    @NotNull(message = "Заполните имя")
    private String firstName;
    @NotNull(message = "Заполните отчество")
    private String middleName;
    @NotNull(message = "Заполните фамилию")
    private String lastName;
    @NotNull(message = "Укажите пол")
    private Gender gender;
    private UserDto user;
}
