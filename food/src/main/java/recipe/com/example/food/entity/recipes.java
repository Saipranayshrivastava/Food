package recipe.com.example.food.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "recipes")
public class recipes {
	
	@Id
	@Column(name = "RecipeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recipeId;
	
	//@Column(name = "Recipe Name")
	private String recipeName;
	
	//@Column(name = "instructions")
	private String instructions;
	
	//@Column(name = "category")
	private Category category;
	
	@OneToMany
	@JoinColumn(name = "RecipeId")
	private List<Ingredient> ingredient = new ArrayList<>();
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private  LocalDate Date;
	
	//@Column(name = "servings")
	private int serving;

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public int getServing() {
		return serving;
	}

	public void setServing(int serving) {
		this.serving = serving;
	}

	public recipes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public recipes(int recipeId, String recipeName, String instructions, Category category, List<Ingredient> ingredient,
			LocalDate date, int serving) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.instructions = instructions;
		this.category = category;
		this.ingredient = ingredient;
		Date = date;
		this.serving = serving;
	}

	@Override
	public String toString() {
		return "recipes [recipeId=" + recipeId + ", recipeName=" + recipeName + ", instructions=" + instructions
				+ ", category=" + category + ", ingredient=" + ingredient + ", Date=" + Date + ", serving=" + serving
				+ "]";
	}
	
	
	
}
