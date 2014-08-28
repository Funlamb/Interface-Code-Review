package chapterOneExercise;

import chapterOneExercise.Interface.IDamage;

public class DamageALot implements IDamage{
	int damage = 5;
	@Override
	public int causeDamage() {
		return damage;
	}

}
