package com.example.test_client.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Order implements Serializable {
    private UUID id;
    private float cost;
    private Location start;
    private Location destination;
    private User driver;
    private User customer;

    public Order(Location start, Location destination) {
        this.start = start;
        this.destination = destination;
    }
}
