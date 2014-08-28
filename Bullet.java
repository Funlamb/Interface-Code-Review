package chapterOneExercise;

public class Bullet extends Projectile {
	
	public Bullet() {
		fire = new FireStraight();
		damage = new DamageLittle();
	}
}
