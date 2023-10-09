package upao.pe.edu.iLoveTravel.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import upao.pe.edu.iLoveTravel.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByFirstName(String firstName);
}
