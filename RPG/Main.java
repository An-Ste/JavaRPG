package RPG;

public class Main {
	public static void main (String args[]) {
		System.out.println("RPG作成中");
		
		Character ally = new Ally();
		Character enemy = new Enemy();
		
		// ポーションの処理
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
		
		// 攻撃処理
//		Character ally = new Character();
//		Character enemy = new Character();
		
		enemy = ally.attack(enemy);
		ally = enemy.attack(ally);


	}
}
