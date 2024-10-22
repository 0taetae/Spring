package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myFoodMgr")
public class MyFoodMgr {
	@Autowired
	private Food favoriteFood;
	@Autowired
	private Food unfavoriteFood;

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public void setUnfavoriteFood(Food unfavoriteFood) {
		this.unfavoriteFood = unfavoriteFood;
	}

	@Override
	public String toString() {
		return "MyFoodMgr [favoriteFood=" + favoriteFood + ", unfavoriteFood=" + unfavoriteFood + "]";
	}

}
