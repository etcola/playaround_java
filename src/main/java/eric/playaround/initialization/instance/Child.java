package eric.playaround.initialization.instance;

public class Child extends Parent{
    static {System.out.println("Then the static field in Child class is initialized.");}
    int z = 100;

    public Child() {
        System.out.println("Here comes the Child constructor.");
        printOutInstanceVariable();
    }

    void printOutInstanceVariable() {
        System.out.println("Method in Child is called. The instance variable z is: " + z);
    }
}
