import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		// Add business logic if needed
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		// Add business logic if needed
		return productRepository.findAll();
	}

	public Product getProductById(Long productId) {
		// Add business logic if needed
		return productRepository.findById(productId).orElse(null);
	}

	// Other methods for updating, deleting, searching, filtering, etc. can be added here
}