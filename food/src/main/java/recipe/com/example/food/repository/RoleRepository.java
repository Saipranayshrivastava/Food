package recipe.com.example.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recipe.com.example.food.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

	

}
