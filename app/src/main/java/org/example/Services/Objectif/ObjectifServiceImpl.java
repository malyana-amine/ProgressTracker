package org.example.Services.Objectif;

import org.example.Entities.Objectif;
import org.example.Repositories.ObjectifRepository;

import java.util.List;
import java.util.Optional;

public class ObjectifServiceImpl implements ObjectifService {
    ObjectifRepository objectifRepository;
    public ObjectifServiceImpl(ObjectifRepository objectifRepository) {
    this.objectifRepository = objectifRepository;
    }

    @Override
    public Objectif saveObjectif(Objectif departments) {
        return null;
    }

    @Override
    public Objectif updateObjectif(Objectif departments) {
        return null;
    }

    @Override
    public List<Objectif> findAllObjectif() {
        return null;
    }

    @Override
    public Optional<Objectif> findByIdObjectif(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteObjectif(Objectif departments) {

    }
}
