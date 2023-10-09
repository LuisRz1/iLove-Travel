package upao.pe.edu.iLoveTravel.services;

import org.springframework.stereotype.Service;
import upao.pe.edu.iLoveTravel.models.User;
import upao.pe.edu.iLoveTravel.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserService{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public User verifyAccount(String email, String password) {

        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            // Verificar si la contraseña coincide
            if (user.getPassword().equals(password)) {
                // Las credenciales son válidas
                return user;
            }
        }
        // Si no se encontró el usuario o las credenciales no coinciden, devuelve null
        return null;
    }

}
