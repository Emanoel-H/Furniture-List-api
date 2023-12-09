package house.furniturelist.api.repository;

import house.furniturelist.api.furniture.Furnitures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furnitures, Long> {
}
