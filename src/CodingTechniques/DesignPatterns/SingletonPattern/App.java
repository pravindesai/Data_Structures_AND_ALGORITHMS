package CodingTechniques.DesignPatterns.SingletonPattern;

public class App {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.ObjectsCreated();

        {
            singletonClass.ObjectsCreated();
        }


    }
}
