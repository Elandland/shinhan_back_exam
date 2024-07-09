package view;

import domain.User;

public class Output {

    private final Input input = new Input();

    public void printMenu(){
        System.out.println("메뉴를 사용자에게 입력 받습니다.");
    }
    public void startMenu(){
        System.out.println("1. 회원가입 / 2. 로그인 / 3. 회원정보 수정 / 4. 탈퇴 / 5. 종료");
    }
    public int inputMsg(){
        System.out.print("입력 : ");
        return input.InputMenu();
    }

    public void signup(){
        System.out.println("가입하실 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }
    public void printSignupMsg(User user){
        System.out.println(user.getName()+"님 가입을 환영합니다.");
    }

    public void signin(){
        System.out.println("로그인 하실 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
    }
}
