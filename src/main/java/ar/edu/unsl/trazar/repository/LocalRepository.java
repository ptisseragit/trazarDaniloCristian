package ar.edu.unsl.trazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unsl.trazar.entity.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Integer> {

}
