package eric.playaround.initialization.instance;

public class Parent {
    static {System.out.println("The static field in Parent will be initialized before it's constructor is called.");}
    int x;
    int y;
    Parent() {
        System.out.println("Parent class constructor is being called. " +
                "The initial value of x, y is the default value:\n" +
                x + ", " + y);
        x = 1;
        y = 1;
        System.out.println("Now x and y are signed to: " + x + ", " + y);
    }
}
