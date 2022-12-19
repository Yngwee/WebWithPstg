package com.korzh.webwithpstg.service;

import com.korzh.webwithpstg.entity.Presence;
import com.korzh.webwithpstg.repository.PresenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresenceService {
    private final PresenceRepository presenceRepository;
    public PresenceService(PresenceRepository presenceRepository) {
        this.presenceRepository = presenceRepository;
    }

    public List<Presence> findAll() {
        return presenceRepository.findAll();
    }
}
