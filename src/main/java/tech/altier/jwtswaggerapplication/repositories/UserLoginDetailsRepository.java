package tech.altier.jwtswaggerapplication.repositories;

import org.springframework.stereotype.Repository;
import tech.altier.jwtswaggerapplication.jpa.UserLoginDetails;

@Repository
public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, Long> {
    List<UserLoginDetails> findByUserId(Long userId);
}
