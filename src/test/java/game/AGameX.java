package game;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 17:09
 */
public class AGameX extends AGame {
    @Override
    public void move() {
        super.move();
        System.out.println("攻击2");
    }

    public static void main(String[] args) {
        AGameX aGameX = new AGameX();
        aGameX.move();
    }
}
