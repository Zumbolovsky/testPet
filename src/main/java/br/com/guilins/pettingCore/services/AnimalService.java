package br.com.guilins.pettingCore.services;

import br.com.guilins.pettingCore.model.dto.AnimalDTO;
import br.com.guilins.pettingCore.model.dto.ListResultDTO;

import java.io.IOException;

public interface AnimalService {

    ListResultDTO<AnimalDTO> listarTodos(String nome, String raca, int limit, int offset);

    AnimalDTO listarPorId(Double id);

    AnimalDTO cadastrar(AnimalDTO animalDTO);

    AnimalDTO atualizar(AnimalDTO animalDTO, Double id);

    void remover(Double id) throws IOException;

}
