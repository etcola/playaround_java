package eric.playaround.initialization;

public interface MiddleInterface extends SuperInterface{
    int constantFromMiddleInterface = RunMeToLearn3.returnSecondArgumentAfterPrint("constantFromMiddleInterface", 3);
    int ifInitialized = RunMeToLearn3.returnSecondArgumentAfterPrint("MiddleInterface.ifInitialized", 4);
}
