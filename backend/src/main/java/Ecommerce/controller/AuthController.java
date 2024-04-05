import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	// Endpoint for user registration
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User newUser = authService.registerUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

	// Endpoint for user login
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody LoginRequest loginRequest) {
		User user = authService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}

	// Endpoint for secure payment processing
	@PostMapping("/payment")
	public ResponseEntity<String> processPayment(@RequestBody PaymentRequest paymentRequest) {
		boolean paymentSuccessful = authService.processPayment(paymentRequest);
		if (paymentSuccessful) {
			return new ResponseEntity<>("Payment processed successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Payment failed", HttpStatus.BAD_REQUEST);
		}
	}

	// Other endpoints for user profile management, password reset, etc. can be added here
}