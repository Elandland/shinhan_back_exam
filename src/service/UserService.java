package service;
import dao.UserDAO;
import domain.User;
import view.Output;

public class UserService {

    private final static UserDAO userDao = new UserDAO();
    private final static Output output = new Output();

    public void join(User user){
        try{
            userDao.insert(user);
        }catch (Exception e){
            System.out.println("글러 먹으셨습니다.");
            return;
        }
        output.printSignupMsg(user);
    }
    public void login(User user){
        try{
            userDao.login(user);
        }catch(Exception e){
            System.out.println("글러 먹으셨습니다.");
        }
    }

}
