package anno01;

public class MyFoodMgr {
	private Food favoriteFood;
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
