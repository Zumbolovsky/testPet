package br.com.guilins.pettingCore.model.adapters;

import br.com.guilins.pettingCore.model.dto.AnimalDTO;
import br.com.guilins.pettingCore.model.entities.AnimalEntity;

public class AnimalAdapter {

    private AnimalAdapter() {}

    public static AnimalDTO convertEntityToDTO(AnimalEntity animalEntity) {
        if (animalEntity == null) {
            return null;
        }

        return AnimalDTO
                .builder()
                .id(animalEntity.getId())
                .nome(animalEntity.getNome())
                .raca(animalEntity.getRaca())
                .build();
    }

    public static AnimalEntity convertDTOToEntity(AnimalDTO animalDTO) {
        if (animalDTO == null) {
            return null;
        }

        return AnimalEntity
                .builder()
                .id(animalDTO.getId())
                .nome(animalDTO.getNome())
                .raca(animalDTO.getRaca())
                .build();
    }
}
