package test;

public interface test1 {
int MAX=100;
void metod();
default void defaultMethod(){
        System.out.println("Дефолтные метод");
        privateMethod();
    }
static void staticMethod(){
    System.out.println("Статический метод");
}

private void privateMethod(){
    System.out.println("Приватный метод");
}
}
