package com.target.estudanteapi.estudanteapi.application.controller;


import com.target.estudanteapi.estudanteapi.application.estudanteDTO.EstudanteDTO;
import com.target.estudanteapi.estudanteapi.application.services.EstudanteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Api(value="EstudanteController", description="Faz os posts, gets, puts e deletes dos estudantes.")
@RestController
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;


    @ApiOperation(value="Obtém todos os estudantes.", response=ArrayList.class, tags = "getAllEstudantes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|Ok", response = ArrayList.class),
            @ApiResponse(code = 401, message = "Not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not found!")
    })
    @GetMapping("/getAllEstudantes")
    public List<EstudanteDTO> getAllEstudantes(){
        return estudanteService.getAllEstudantes();
    }
}
