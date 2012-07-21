package eric.playaround.initialization.hierarchyClass;

public class RunMeToLearn2 {
    public static void main(String[] args) {
        System.out.println("When we refer the static constant field in parent class, " +
                "even we call it via the child, " +
                "it's the actual class that declare the static contant field will be initialized." );
        System.out.println(Child.staticConstantInParent);
    }
}
