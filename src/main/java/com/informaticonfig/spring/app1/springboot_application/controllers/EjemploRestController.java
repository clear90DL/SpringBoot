package com.informaticonfig.spring.app1.springboot_application.controllers;

/*
import java.util.HashMap;
import java.util.Map;
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.informaticonfig.spring.app1.springboot_application.models.Empleados;
import com.informaticonfig.spring.app1.springboot_application.models.dto.ClaseDTO;

@RestController 
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
  
public ClaseDTO detalles_info(){
  ClaseDTO usuario1 =new ClaseDTO();
      usuario1.setTitulo("Administrador");
      usuario1.setUsuario("informaticonfing");
/*      
  public Map<String,Object> detalles_info2() {
      Empleados empleado1=new Empleados("Claudio", "Dejesus", "Mirasol", "Desarrollador", 30, 123456789, 001);

      Map<String,Object> respuesta=new HashMap<>();
        respuesta.put("Empleado", "Datos del empleado");
         respuesta.put("Empleado", empleado1);
*/
        return usuario1;
    }



}
