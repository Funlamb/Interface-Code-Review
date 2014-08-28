package chapterOneExercise;

import chapterOneExercise.Interface.IDamage;
import chapterOneExercise.Interface.IFire;
import chapterOneExercise.Interface.IProjectile;

public class Projectile implements IProjectile {
	IFire fire;
	IDamage damage;
	
	int strength;
	
	public String showFire(){
		return fire.fireLikeThis();
	}
	
	public String showDamage(){
		return Integer.toString((damage.causeDamage()));
	}

	@Override
	public int damage() {
		return damage.causeDamage();
	}
}
