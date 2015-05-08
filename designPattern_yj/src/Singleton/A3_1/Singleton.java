package Singleton.A3_1;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();                             
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private void slowdown() {                   
        try {                                   
            Thread.sleep(1000);                 
        } catch (InterruptedException e) {      
        }                                       
    }                                           
}
