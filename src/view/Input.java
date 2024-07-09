package view;

import domain.User;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    public int InputMenu(){
        return sc.nextInt();
    }

    public User InputUserInfo(){
        return new User(sc.next(), sc.next(),sc.next());
    }

    public User InputUserLogin(){
        return new User(sc.next(),sc.next(),"");
    }

}
