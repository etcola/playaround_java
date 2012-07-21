package eric.playaround.initialization.hierarchyInterface;

public class RunMeToLearn3 {
    public static void main(String[] args) {
        System.out.println("If we refer to a constant field in the super interface via the sub interface, " +
                "neither of these two interface will be initialized.");
        System.out.println("All we get is only the constant value: " +
                MiddleInterface.constantFromSuperInterface +
                "\n");

        System.out.println("If we refer to a non-constant filed in the super interface via the sub, " +
                "the super interface will be initialized before we get the value, but not the sub.");
        System.out.println("After the super interface is initialized, we get the value returned: " +
                SubInterface.constantFromMiddleInterface);
    }

    public static int returnSecondArgumentAfterPrint(String parameterFromInterface, int i) {
        System.out.println(parameterFromInterface + " is assigned as " + i);
        return i;
    }
}
