package com.example.demo.controlerbis;

import com.example.demo.controller.Test1Controller;
import com.example.demo.dto.EmployeeDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test2Controller.class);

    @GetMapping("/test2")
    List<EmployeeDto> all() {
        LOGGER.info("/test2");
        List<EmployeeDto> liste=new ArrayList<>();
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setNom("nom01");
        employeeDto.setPrenom("prenom01");
        liste.add(employeeDto);
        return liste;
    }

    @GetMapping("/test02")
    String all2() {
        LOGGER.info("/test02");
        return "test02";
    }

}
