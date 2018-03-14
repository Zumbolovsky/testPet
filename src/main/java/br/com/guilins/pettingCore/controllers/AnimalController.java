package br.com.guilins.pettingCore.controllers;

import br.com.guilins.pettingCore.model.dto.AnimalDTO;
import br.com.guilins.pettingCore.model.dto.ListResultDTO;
import br.com.guilins.pettingCore.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pets")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping(method = RequestMethod.GET)
    public ListResultDTO<AnimalDTO> listarTodos(@RequestParam(required = false, name = "nome", defaultValue = "") final String nome,
                                                @RequestParam(required = false, name = "raca", defaultValue = "") final String raca,
                                                @RequestParam(required = false, name = "limit", defaultValue = "0") final int limit,
                                                @RequestParam(required = false, name = "offset", defaultValue = "0") final int offset) {
        return this.animalService.listarTodos(nome, raca, limit, offset);
    }

}
