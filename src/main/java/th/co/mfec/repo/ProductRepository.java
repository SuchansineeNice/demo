package th.co.mfec.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import th.co.mfec.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
