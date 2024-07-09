package dao;

import domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    //Data Access Object => Repository , DB에 접근할 수 있는 애는 DAO(Repository 만 가지고 있음)

    private final static Map<Integer,User> db = new HashMap<>();
    static int i =1;        //여따 넣어야 전역 변수로 관리 해서 증가할 때 한 번씩만 체크 함
    public void insert(User user){
        db.put(i++, user);
        System.out.println(db);
    }

    public void login(User user) {
        for (User storedUser : db.values()) {
            if (user.equals(storedUser)) {
                System.out.println("로그인을 성공했습니다.");
                return;
            }
        }
        System.out.println("로그인을 실패했습니다.");
    }
}
