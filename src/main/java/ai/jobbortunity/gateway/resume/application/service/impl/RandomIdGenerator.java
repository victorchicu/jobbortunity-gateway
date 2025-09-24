package ai.jobbortunity.gateway.resume.application.service.impl;

import ai.jobbortunity.gateway.resume.application.service.IdGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RandomIdGenerator implements IdGenerator {

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
