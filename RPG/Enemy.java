package RPG;

public class Enemy extends Character {
	public Enemy() {
	    this.name = "テキダヨ";
	    this.hp = 23;
	    this.power = 8;
	    this.defense = 9;
	    this.speed = 5;
	    this.item_num = 2;
	}
	
//	Ally ally = new Ally();
//	
//	public int ally_attack(int hp, int defense) {
//		int damage = ally.power - defense;
//		hp -= damage;
//    	System.out.println(damage + " のダメージ！");
//    	System.out.println(name + " のHP：" + hp);
//		return hp;
//	}
}
