import domain.User;
import service.UserService;
import view.Input;
import view.Output;



public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        Output output = new Output();
        Input input = new Input();

        output.printMenu();
        output.startMenu();

        int choose = output.inputMsg();

        while(choose!=0) {
            if (choose == 1) {
                output.signup();
                userService.join(input.InputUserInfo());
                output.startMenu();
                choose = output.inputMsg();
            }
            else if(choose ==2){
                output.signin();;
                userService.login(input.InputUserLogin());
                output.startMenu();
                choose = output.inputMsg();
            }

        }
    }
}