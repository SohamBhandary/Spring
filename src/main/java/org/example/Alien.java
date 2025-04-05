package org.example;

public class Alien {
   private int age=21;



   public Alien(){
       System.out.println("object created");
   }
public Alien(int age){
    System.out.println("para constructor called");
       this.age=age;
}
    public Alien(int age, Laptop lap){
        System.out.println("para constructor called2");
        this.age=age;
        this.lap=lap;
    }
    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }
    private Laptop lap;

    public void code(){
        System.out.println("coding");
        lap.complile();
    }

}
