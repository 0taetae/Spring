package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Food {
	private String foodName;
	private int foodPrice;

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}

}
