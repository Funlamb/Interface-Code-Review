package chapterOneExercise;

public class ShipShooter {
	public static void main(String[] args){
		Bullet b = new Bullet();
		Missile m = new Missile();
		BulletHoming bh = new BulletHoming();
		System.out.println(b.showDamage());
		System.out.println(b.showFire());
		System.out.println(m.showDamage());
		System.out.println(m.showFire());
		System.out.println(bh.showDamage());
		System.out.println(bh.showFire());
	}
}
