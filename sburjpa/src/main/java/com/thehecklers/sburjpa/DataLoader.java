package com.thehecklers.sburjpa;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class DataLoader {
    private final AircraftRepository repository;

//    DataLoader(AircraftRepository repository) {
//        this.repository = repository;
//    }

    @PostConstruct
    private void dataLoad() {
        repository.deleteAll();

        repository.save(new Aircraft(81L,
                "AAL608", "1423","N755NU","AA608","IND-RHX","A319", "A3",
                36000, 255, 423, 0, 36000,
                39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
                true, false,
                Instant.parse("2020-11-27T21:29:35Z"),
                Instant.parse("2020-11-27T21:29:34Z"),
                Instant.parse("2020-11-27T21:29:27Z")));

    }

}
