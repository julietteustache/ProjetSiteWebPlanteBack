package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Participants;

public interface ParticipantsRepository extends CrudRepository<Participants, Long> {

}
