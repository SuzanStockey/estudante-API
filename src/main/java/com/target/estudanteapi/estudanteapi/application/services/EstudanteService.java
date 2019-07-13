package com.target.estudanteapi.estudanteapi.application.services;

import com.target.estudanteapi.estudanteapi.application.estudanteDTO.EstudanteDTO;
import com.target.estudanteapi.estudanteapi.domain.model.Estudante;
import com.target.estudanteapi.estudanteapi.infra.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    EstudanteRepository estudanteRepository;

    public EstudanteDTO getEstudanteById(Long id){
        Optional<Estudante> estudanteOptional = estudanteRepository.findById(id);

        EstudanteDTO estudanteDTO = null;

        if(estudanteOptional.isPresent()){
            //existe um estudante
            Estudante estudante = estudanteOptional.get();
            estudanteDTO = new EstudanteDTO(estudante.getNomeEstudante(), estudante.getMatricula(), estudante.getIdade(), estudante.getTurma(), estudante.getMateriasNomes())
        }
    }


//    public List<EstudanteDTO> getAllEstudantes(){
//       List<Estudante> estudantes = (List<Estudante>) estudanteRepository.findAll();
//
//       List<EstudanteDTO> estudanteDTOS = new ArrayList<>();
//
//        for (Estudante estudante : estudantes) {
//            EstudanteDTO estudanteDTO = new EstudanteDTO();
//
//            estudanteDTO.setIdade(estudante.getIdade());
//
//            // mais atributos
//
//            estudanteDTOS.add(estudanteDTO);
//        }
//
//        return  estudanteDTOS;
//    }
}
