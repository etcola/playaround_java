package eric.playaround.initialization;

public class Child extends Parent{
    static int staticConstantInChild = 5;
    static {System.out.println("Child is initialized");}
}
