package eric.playaround.initialization.instance;

public class RunMeToLearn4 {
    public static void main(String[] args) {
        System.out.println("When we first declare a class without referring to an instance, as:\nParent a;");
        Parent a;
        System.out.println("But nothing happened since the Class is not active yet.\n");

        System.out.println("Then we create an instance using new,");
        Child b = new Child();
        System.out.println();
    }
}
