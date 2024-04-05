import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User registerUser(User user) {
		// Add business logic if needed
		return userRepository.save(user);
	}

	public User loginUser(String username, String password) {
		// Add business logic if needed
		return userRepository.findByUsernameAndPassword(username, password);
	}

	// Other methods for user profile management, password reset, etc. can be added here
}