package RPG;

public class Main {
	public static void main (String args[]) {
		System.out.println("Enemy が現れた！");
		
		Ally ally = new Ally();
		Enemy enemy = new Enemy();
		
		// ポーションを使う処理
		while (ally.item_num >= 1 || enemy.item_num >= 1) {
			if (0 < ally.item_num) {
				ally.use_potion();
			} else {
				System.out.println(ally.name + " のポーションは無くなりました！使えませんね！");
			}
			
			if (0 < enemy.item_num) {
				enemy.use_potion();
			} else {
				System.out.println(enemy.name + " のポーションは無くなりました！使えませんね！");
			}
		}
		
		// 攻撃の為の前処理
		Character ally_attack  = new Character();
		Character enemy_attack  = new Character();
		
		
		// RPG のターン構造
		while (ally.hp >= 0 && enemy.hp >= 0) {
			
			// 攻撃する処理
			ally_attack = enemy.attack(ally);
			enemy_attack = ally.attack(enemy);
		}


	}
}
