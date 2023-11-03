package org.example.Services.Objectif;

import org.example.Entities.Objectif;

import java.util.List;
import java.util.Optional;

public interface ObjectifService {

        Objectif saveObjectif(Objectif departments);
        Objectif updateObjectif(Objectif departments);
        List<Objectif> findAllObjectif();
        Optional<Objectif> findByIdObjectif(Long id);
        void deleteObjectif(Objectif departments);
    }

