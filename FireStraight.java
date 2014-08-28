package chapterOneExercise;

import chapterOneExercise.Interface.IFire;

public class FireStraight implements IFire{
	String string = "I fire straight";
	@Override
	public String fireLikeThis() {
		return string;
	}
	
	

}
