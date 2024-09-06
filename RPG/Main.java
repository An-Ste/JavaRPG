package RPG;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		System.out.println("Enemy が現れた！");
		
		Ally ally = new Ally();
		Enemy enemy = new Enemy();
		
		// ポーションを使う処理
//		while (ally.item_num >= 1 || enemy.item_num >= 1) {
//			if (0 < ally.item_num) {
//				ally.use_potion();
//			} else {
//				System.out.println(ally.name + " のポーションは無くなりました！使えませんね！");
//			}
			
//			if (0 < enemy.item_num) {
//				enemy.use_potion();
//			} else {
//				System.out.println(enemy.name + " のポーションは無くなりました！使えませんね！");
//			}
//		}
		
		// 攻撃の為の前処理
		Character ally_attack  = new Character();
		Character enemy_attack  = new Character();
		
		// 攻撃する処理
//		ally_attack = ally.attack(enemy);
//		enemy_attack = enemy.attack(ally);
		
		Scanner scanner = new Scanner(System.in);
		// RPG のターン構造
		while (ally.hp > 0 && enemy.hp > 0) {
			// 自分のターン
			System.out.println("行動を選択して下さい！");
			System.out.println("1. 攻撃");
			System.out.println("2. 回復");
			
			int ally_action = scanner.nextInt();
			
			switch (ally_action) {
				case 1: //攻撃を行う
					ally_attack = ally.attack(enemy);
					break;
				
				case 2: //回復を行う
					if (0 < ally.item_num) {
						ally.use_potion();
					} else {
						System.out.println(ally.name + " のポーションは無くなりました！使えませんね！");
					}
					break;
			}
			
			// 敵のターン
			int used_count = 0;
			// アイテム残数があり、HPが10以下の時に回復を行う
			if (enemy.item_num > 0 && enemy.hp <= 10) {
				// 回復を行う
				if (0 < enemy.item_num) {
					enemy.use_potion();
					used_count += 1;
				}
			}
			
			// 回復されなかった場合に、攻撃を行う
			if (used_count != 1) {
				enemy_attack = enemy.attack(ally);
			}

		}
		
		// どちらが敗北したか
		if (ally.hp <= 0) {
			System.out.println(ally.name + " は倒れた！");
		} else if (enemy.hp <= 0) {
			System.out.println(enemy.name + " は倒れた！");
		}


	}
}
