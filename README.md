# Membership 프로젝트

## TDD를 통한 설계
1. 의존성(pom.xml)
    - junit5
    - mockito
    - servlet-api
    - servlet.jsp-api
    - jstl-api
    - jstl-implementation
    - lmbok
    - maven-sure-fire plugin



2. 톰캣 서버 설정



3. 회원 가입 기능 설계(JoinService)
   - models/member/JoinService.java
   - 필수 항목 검증(아이디, 비밀번호, 비밀번호 확인, 회원명, 이메일, 가입 약관 동의)
   - 아이디(6자리 이상),비밀번호(8자리 이상) 체크
   - '비밀번호'와 '비밀번호 확인' 입력 데이터 일치 체크
   - 아이디 중복 여부 체크(중복 된 경우 가입 불가)   
   - 회원 정보 저장

4. 로그인 기능 설계(LoginService)
   - models/member/LoginService.java
   - 필수 항목 검증(아이디, 비밀번호)
   - 아이디에 해당하는 회원 정보가 있는지 체크
   - 로그인 처리(세션에 회원 정보를 저장)

5. 기능 통합
   - 회원 가입
     - Controller : /member/join
       - controllers/member/joinController 
       - Get : 회원 가입 양식
       - POST : 회원 가입 처리
     - View : WEB-INF/templates/member/join.jsp

   - 로그인
     - Controller : /member/login
       - controllers/member/LoginController.java
       - Get : 로그인 양식
       - POST : 로그인 처리
     - View : WEB-INF/templates/member/login.jsp
   - 메인페이지
     - 로그인 상태
       - 사용자명(아이디)님 로그인 메시지 출력
       - 로그아웃(/member/logout), 마이페이지(/mypage) 링크
     - 미로그인 상태
       - 회원가입(/member/join), 로그인(/member/logi) 링크
     - 로그아웃
       - /member/logout
       - Controller
         - controllers/member/LogoutController.java
         - GET, POST 메서드 상관 없이 기능할 수 있도록 처리

## 완성 화면
### 회원가입

![메인페이지](https://raw.githubusercontent.com/DaniParkHoJin/memberShip/master/images/join.png)


### 로그인

![메인페이지](https://raw.githubusercontent.com/DaniParkHoJin/memberShip/master/images/login.png)


### 메인페이지

![메인페이지](https://raw.githubusercontent.com/DaniParkHoJin/memberShip/master/images/main.png)
