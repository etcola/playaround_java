package eric.playaround.initialization.hierarchyClass;

public class Child extends Parent {
    static int staticConstantInChild = 5;
    static {System.out.println("Child is initialized");}
}
