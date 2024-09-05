package RPG;

public class Character {
    String name;
    int hp;
    int power;
    int defense;
    int speed;
    int item_num;
    
	
    // 攻撃する処理
    // this：攻撃側、 chara：防御側
	public Character attack(Character chara) {
		int damage = this.power - chara.defense;
		chara.hp -= damage;
    	System.out.println(damage + " のダメージ！");
    	System.out.println(chara.name + " のHP：" + chara.hp);
		return chara;
	}


    public void use_potion() {
    	item_num -= 1;
    	Item item = new Item();
    	hp = item.potion(hp);
    }
    
}

