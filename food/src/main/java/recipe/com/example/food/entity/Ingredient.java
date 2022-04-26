package recipe.com.example.food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ingrediant")
public class Ingredient {
	
	@Id
	@Column(name = "ingrediantId")
	private int ingrediantId;
	
	//@Column(name = "ingrediantName")
	private String ingrediantName;
	
	//@Column(name = "Quantity")
	private String quantity;

	public int getIngrediantId() {
		return ingrediantId;
	}

	public void setIngrediantId(int ingrediantId) {
		this.ingrediantId = ingrediantId;
	}

	public String getIngrediantName() {
		return ingrediantName;
	}

	public void setIngrediantName(String ingrediantName) {
		this.ingrediantName = ingrediantName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Ingredient [ingrediantId=" + ingrediantId + ", ingrediantName=" + ingrediantName + ", quantity="
				+ quantity + "]";
	}

	public Ingredient(int ingrediantId, String ingrediantName, String quantity) {
		super();
		this.ingrediantId = ingrediantId;
		this.ingrediantName = ingrediantName;
		this.quantity = quantity;
	}

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@ManyToOne
	//private recipes recipes;


}
