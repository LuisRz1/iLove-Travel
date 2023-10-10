package upao.pe.edu.iLoveTravel.services;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import upao.pe.edu.iLoveTravel.models.User;
import upao.pe.edu.iLoveTravel.repositories.UserRespository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRespository userRespository;

    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public List<User> getAllUsers(){
        return userRespository.findAll();
    }

    public Optional<User> getUserById(Long userid){
        return userRespository.findById(userid);
    }

    public User addUser(User user){
        return userRespository.save(user);
    }

    public void deleteUserById(Long userid){
        userRespository.deleteById(userid);
    }
}
