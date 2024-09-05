package RPG;

public class Item {
    public int potion(int hp) {
        hp += 10;
        System.out.println("ポーションを使用した！");
        System.out.println("HPが 10 回復した！");
        System.out.println("現在のHP：" + hp);
        return hp;
    }
}
