package tech.altier.jwtswaggerapplication.jpa;

import jakarta.persistence.GenerationType;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    // Other user properties, getters, and setters
}
