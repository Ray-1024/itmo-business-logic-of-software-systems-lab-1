package ray1024.labs.blps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ray1024.labs.blps.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, String> {
}