package test;

public abstract class test2 {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public test2(String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract void method1();
    public abstract void method2();
}
