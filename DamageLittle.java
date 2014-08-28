package chapterOneExercise;

import chapterOneExercise.Interface.IDamage;

public class DamageLittle implements IDamage {
	int damage = 1;
	
	@Override
	public int causeDamage() {
		return damage;
	}

}
