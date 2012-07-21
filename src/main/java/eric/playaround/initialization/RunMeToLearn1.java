package eric.playaround.initialization;

public class RunMeToLearn1 {
    public static void main(String[] args) {
        System.out.println("Parent will be initialized before child being initialized." );
        System.out.println(Child.staticConstantInChild);
    }
}
