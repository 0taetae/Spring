package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="myFood")
public class MyFoodMgr {
	
	
	// Qualifier를 사용하려면 Autowired와 같이 사용 
	@Autowired
	@Qualifier(value="unfavoriteFood")
	private Food favoriteFood;
	@Autowired
	private Food unfavoriteFood;
	
	@Override
	public String toString() {
		return "MyFoodMgr [좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
}


/*
//setter, toString 추가
@Component
public class MyFoodMgr {
	
	//xml에서 bean과 연결 
	@Autowired
	private Food favoriteFood;
	@Autowired
	private Food unfavoriteFood;
	
//	public void setFavoriteFood(Food favoriteFood) {
//		this.favoriteFood = favoriteFood;
//	}
//	
//	public void setUnfavoriteFood(Food unfavoriteFood) {
//		this.unfavoriteFood = unfavoriteFood;
//	}
	
	@Override
	public String toString() {
		return "MyFoodMgr [좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
}
*/