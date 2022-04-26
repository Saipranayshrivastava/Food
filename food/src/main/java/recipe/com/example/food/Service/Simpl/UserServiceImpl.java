package recipe.com.example.food.Service.Simpl;

import java.util.Set;

import recipe.com.example.food.Service.UserService;
import recipe.com.example.food.entity.user;
import recipe.com.example.food.entity.userRole;
import recipe.com.example.food.repository.RoleRepository;
import recipe.com.example.food.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;

	@Override
	public user createUser(user user, Set<userRole> userRoles) throws Exception {
		user local = this.userRepository.findByUserName(user.getUserName());
		if(local!=null) {
			System.out.println("User is already present!!");
			throw new Exception("User is already present!!");
		}
		else {
			for(userRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRole().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public user getUser(String userName) {
		return this.userRepository.findByUserName(userName);
	}

}
