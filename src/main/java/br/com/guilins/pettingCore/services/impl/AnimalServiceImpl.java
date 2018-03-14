package br.com.guilins.pettingCore.services.impl;

import br.com.guilins.pettingCore.model.dto.AnimalDTO;
import br.com.guilins.pettingCore.model.dto.ListResultDTO;
import br.com.guilins.pettingCore.services.AnimalService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Override
    public ListResultDTO<AnimalDTO> listarTodos(String nome, String raca, int limit, int offset) {
        return null;
    }

    @Override
    public AnimalDTO listarPorId(Double id) {
        return null;
    }

    @Override
    public AnimalDTO cadastrar(AnimalDTO animalDTO) {
        return null;
    }

    @Override
    public AnimalDTO atualizar(AnimalDTO animalDTO, Double id) {
        return null;
    }

    @Override
    public void remover(Double id) throws IOException {

    }
}
