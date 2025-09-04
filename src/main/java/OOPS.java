import bank.Bank;

class Pen {
  String color;
  String type;
  public void write() {
    System.out.println(this.color + " - " + this.type + " pen se likh diye!");
  }
}

class Student {
  private int age;
  private String name;
  public static String school = "KIC";
  public void set(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void get() {
    System.out.println(this.name + ", " + this.age);
  }
}

class Car {
  String brand;
  String model;
  Car(Car car) {
    System.out.println("[DRIVE]: " + car.brand + " " + car.model);
  }
  Car(){}
}

abstract class Animal {
  abstract void walk();
  abstract void getName();
}

class Horse extends Animal {
  public void walk() {
    System.out.println("Bhag Gaya!");
  }
  @Override
  void getName() {
    System.out.println("Chetak!");
  }
}

public class OOPS {
  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.type = "Gel";
    pen.color = "Blue";
    // pen.write();
    Student.school = "GIC";
    Student student = new Student();
    student.set("Stark", 45);
    // student.get();
    System.out.println(student.school);
    Car car = new Car();
    car.brand = "BMW";
    car.model = "M5";
    // Car love = new Car(car);
    Bank bank = new Bank();
    bank.name = "SBI";
    // Animal animal = new Animal();
    // animal.walk();
    // Horse horse = new Horse();
    // horse.walk();
    // horse.getName();
  }
}
