package eric.playaround.initialization;

public class Child extends Parent{
    static int staticConstantInChild = 10;
    static {System.out.println("Child is initialized");}
}
