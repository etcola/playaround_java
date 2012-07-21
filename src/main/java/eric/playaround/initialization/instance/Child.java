package eric.playaround.initialization.instance;

public class Child extends Parent{
    static {System.out.println("Then the static field in Child class is initialized.");}
    int z = 100;
}
