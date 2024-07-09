package domain;

import java.util.Objects;

public class User {
    private final String id;
    private final String password;
    private final String name;

    public User(String id, String password,String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (Objects.equals(user.id, this.id)) {
            if (Objects.equals(user.password, this.password)) {
                System.out.println("환영합니다."+user.name+"님");
                return true;
            }
            else{
                System.out.println("비밀번호가 일치하지 않습니다.");
                return false;
            }
        }
        else{
            System.out.println("입력하신 회원이 없습니다.");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id + this.password);
    }

}
