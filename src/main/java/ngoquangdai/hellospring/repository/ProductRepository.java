package ngoquangdai.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ngoquangdai.hellospring.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

