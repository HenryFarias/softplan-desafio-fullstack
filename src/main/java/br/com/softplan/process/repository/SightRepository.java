package br.com.softplan.process.repository;

import br.com.softplan.process.model.Sight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "sights", path = "sight")
public interface SightRepository extends JpaRepository<Sight, Long> {

}