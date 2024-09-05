package RPG;

public class Character {
    String name;
    int hp;
    int power;
    int defense;
    int speed;
    int item_num;

    
	
	public Character attack(Character chara) {
//		Ally ally = new Ally();
		int damage = this.power - chara.defense;
		chara.hp -= damage;
    	System.out.println(damage + " のダメージ！");
    	System.out.println(chara.name + " のHP：" + chara.hp);
		return chara;
	}
    
//	public int enemy_attack(int hp, int defense) {
//		Enemy enemy = new Enemy();
//		int damage = enemy.power - defense;
//		hp -= damage;
//    	System.out.println(damage + " のダメージ！");
//    	System.out.println(name + " のHP：" + hp);
//		return hp;
//	}

//    public void defense() {
//
//    }

    public void use_potion() {
    	item_num -= 1;
    	Item item = new Item();
    	hp = item.potion(hp);
    }

//    public void stay() {
//
//    }
    
}

