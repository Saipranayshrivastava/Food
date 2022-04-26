package recipe.com.example.food.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public user(int userId, String username, String password, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;

	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
	@JsonIgnore
	private Set<userRole> userRole = new HashSet<>();
	
	public Set<userRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(Set<userRole> userRole) {
		this.userRole = userRole;
	}
	
	
}
