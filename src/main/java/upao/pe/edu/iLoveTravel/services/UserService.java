package upao.pe.edu.iLoveTravel.services;

import org.springframework.stereotype.Service;
import upao.pe.edu.iLoveTravel.models.User;
import upao.pe.edu.iLoveTravel.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public List<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

}
