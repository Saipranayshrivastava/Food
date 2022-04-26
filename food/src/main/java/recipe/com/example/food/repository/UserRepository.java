package recipe.com.example.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recipe.com.example.food.entity.user;

public interface UserRepository extends JpaRepository<user,Integer>  {

	public user findByUserName(String userName);
	
	

}
