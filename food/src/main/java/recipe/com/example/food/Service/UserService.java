package recipe.com.example.food.Service;

import java.util.Set;

import recipe.com.example.food.entity.user;
import recipe.com.example.food.entity.userRole;

public interface UserService {
	
	public user createUser(user user,Set<userRole>userRole) throws Exception;
	
	public user getUser(String userName);

}
