package factory;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 17:14
 */
public class ADogDogFactory implements DogFactory {
    @Override
    public Dog creatDog() {
        return new ADog();
    }
}
