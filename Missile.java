package chapterOneExercise;

public class Missile extends Projectile {
	
	public Missile () {
		fire = new FireHoming();
		damage = new DamageALot();
	}
}
