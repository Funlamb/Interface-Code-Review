package chapterOneExercise;

public class BulletHoming extends Projectile {
	public BulletHoming (){
		fire = new FireHoming();
		damage = new DamageLittle();
	}
}
