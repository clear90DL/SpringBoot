package com.informaticonfig.spring.app1.springboot_application.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.app1.springboot_application.models.Empleados;

@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")
    
    
    public String info(Model modelo) {
      
         Empleados empleado1=new Empleados("Claudio", "Dejesus","Mirasol", "Desarrollador", 30, "123456789", 001);

      
        modelo.addAttribute("Empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute ("Empleados")
public List<Empleados> ListaEmpleados(){
    return Arrays.asList(
        new Empleados("Maria","Perez","calle segunda",
        "desarrollador",20,"123145",02),
         new Empleados("Juan","De Jesus","calle Altamirano",
        "Programador",20,"123145",01),
         new Empleados("Josefina","Vegas","calle miranda",
        "Tester",21,"123145",07),
         new Empleados("Tiburcio","Torres","calle segunda",
        "Gerente",20,"123145",03),
         new Empleados("David","Lopez","calle segunda",
        "CEO",21,"123145",04)

        
    );
}

}
