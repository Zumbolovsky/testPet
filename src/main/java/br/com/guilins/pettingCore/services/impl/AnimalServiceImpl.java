package br.com.guilins.pettingCore.services.impl;

import br.com.guilins.pettingCore.model.dto.AnimalDTO;
import br.com.guilins.pettingCore.model.dto.ListResultDTO;
import br.com.guilins.pettingCore.model.entities.AnimalEntity;
import br.com.guilins.pettingCore.repositories.AnimalRepository;
import br.com.guilins.pettingCore.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private static final int MAXLIMIT = 20;

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public ListResultDTO<AnimalDTO> listarTodos(String nome, String raca, int limit, int offset) {
        Iterable<AnimalEntity> iterableAnimalEntity = animalRepository.findAll();

        int thisLimit = limit;
        int thisOffset = offset;

        PageRequest page = null;

        if (thisLimit > 20) {
            thisLimit = MAXLIMIT;
        }

        if (thisOffset < 0) {
            thisOffset = 0;
        }

        if (thisLimit > 0) {
            page = PageRequest.of(thisOffset, thisLimit);
        }

        AnimalEntity

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
