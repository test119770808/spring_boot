package com.thehecklers.planefinder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data  // Getter, Setter, toString, hashcode, equals
public class Aircraft {
    @Id
    @GeneratedValue
    private Long id;
}
