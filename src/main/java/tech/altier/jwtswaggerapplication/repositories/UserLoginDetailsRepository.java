package tech.altier.jwtswaggerapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.altier.jwtswaggerapplication.jpa.UserLoginDetails;

import java.util.List;

@Repository
public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, Long> {
    List<UserLoginDetails> findByUserId(Long userId);
}
