package Assigments;

interface Playable {
 void play();
}

class Animal {

 void sound() {
     System.out.println("Animal makes a sound");
 }
}


class Dog extends Animal implements Playable {

 void sound() {
     System.out.println("Dog makes a sound: Woof");
 }


 public void play() {
     System.out.println("Dog can play: Yes");
 }
}


public class Assigment4 {

 public static void main(String[] args) {

     Dog dog = new Dog();

     dog.sound();
     dog.play();

 }
}