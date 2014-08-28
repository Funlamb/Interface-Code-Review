package chapterOneExercise;

import chapterOneExercise.Interface.IFire;

public class FireHoming implements IFire {
	String string = "I follow my target";
	@Override
	public String fireLikeThis() {
		//System.out.println("I follow my target");
		return string;
	}

}
