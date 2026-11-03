package test;

public class test3 extends test2 {
    private String name1;

    public String getName1(){
        return name1;
    }

    public void setName1(String name1){
        this.name1=name1;
    }

    public test3(String name,int age,String name1){
        super(name,age);
        this.name1=name1;
    }

    @Override
    public void method1(){
        System.out.println("Метод 1");
    }

    @Override
    public void method2(){
        System.out.println("Метод 2");}
}
