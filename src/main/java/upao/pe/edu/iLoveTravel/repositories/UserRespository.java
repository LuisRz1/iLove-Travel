package upao.pe.edu.iLoveTravel.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upao.pe.edu.iLoveTravel.models.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

}
