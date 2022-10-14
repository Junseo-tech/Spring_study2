package hello.hellospring.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    //자바 뜰 때 생성되어 같이 올라감.

    public static SingletonService getInstance() {
        return instance; //instance를 꺼낼 수 있는 유일한 방법
    }

    private SingletonService(){

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
