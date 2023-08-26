package tech.altier.jwtswaggerapplication.jpa;

import jakarta.persistence.Entity;

@Entity
public class UserLoginDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String loginTime;
    // Other login details, getters, and setters
}
