package game;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 17:07
 */
public class AGameZ {
    private AGame aGame;

    public AGameZ(AGame aGame) {
        this.aGame = aGame;
    }

    public void move(){
        aGame.move();
        System.out.println("攻击");
    }

    public static void main(String[] args) {
        AGameZ aGameZ = new AGameZ(new AGame());
        aGameZ.move();
    }
}
