package com.shop.toy.models.mappers;

import com.shop.toy.models.dto.EmployeeDto;
import com.shop.toy.models.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(EmployeeMapper.class);

    Employee toEmployee(EmployeeDto employeeDto);

    @Mapping(target="user", ignore = true)
    EmployeeDto toEmployeeDto(Employee employee);
}
