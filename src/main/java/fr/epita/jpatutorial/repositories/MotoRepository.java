package fr.epita.jpatutorial.repositories;

import fr.epita.jpatutorial.entities.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {
    List<Moto> findByBrand(String brand);
    List<Moto> findByNumberOfCylinders(int numberOfCylinder);
}



