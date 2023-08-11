package factory;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 17:15
 */
public class BDogFactory implements DogFactory {
    @Override
    public Dog creatDog() {
        return new BDog();
    }

    public static void main(String[] args) {
        DogFactory dogFactory = new ADogDogFactory();
        Dog dog = dogFactory.creatDog();
        DogFactory bDogFactory = new BDogFactory();
        Dog dog1 = bDogFactory.creatDog();
       dog1.eat();
       dog.eat();
    }
}
