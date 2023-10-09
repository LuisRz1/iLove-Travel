package upao.pe.edu.iLoveTravel.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import upao.pe.edu.iLoveTravel.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByEmail(String email);
}
