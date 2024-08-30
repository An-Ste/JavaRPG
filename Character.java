public class Weapon {
    String w_name;
}

public class Character {
    private String name;
    private int hp;
    private int power;
    private int defense;
    private int speed;

    public static void attack() {

    }

    public static void defense() {

    }

    public static void use_item() {

    }

    public static void stay() {

    }
}

public class Ally extends Character {
    this.name = "ああああ";
    this.hp = 20;
    this.power = 10;
    this.defense = 6;
    this.speed = 8;
}

public class Enemy extends Character {
    this.name = "敵だよ！";
    this.hp = 23;
    this.power = 8;
    this.defense = 9;
    this.speed = 5;
}