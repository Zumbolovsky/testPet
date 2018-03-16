package br.com.guilins.pettingCore.repositories;


import br.com.guilins.pettingCore.model.entities.AnimalEntity;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<AnimalEntity, Double> {
}
