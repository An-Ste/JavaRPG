package RPG;

public class Ally extends Character {
	public Ally() {
		this.name = "ああああ";
	    this.hp = 20;
	    this.power = 10;
	    this.defense = 6;
	    this.speed = 8;
	    this.item_num = 3;
	}
	
//	Enemy enemy = new Enemy();
//	
//	public int enemy_attack(int hp, int defense) {
//		int damage = enemy.power - defense;
//		hp -= damage;
//    	System.out.println(damage + " のダメージ！");
//    	System.out.println(name + " のHP：" + hp);
//		return hp;
//	}
}
