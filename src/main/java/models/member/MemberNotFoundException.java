package models.member;

public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException(){
        super("없는 회원입니다. 가입되지 않은 회원입니다.");
    }
}
