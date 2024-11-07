
class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping in its bed.");
    }
}
public class AnimalBehaviorDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.println("Generic Animal:");
        genericAnimal.eat();   
        genericAnimal.sleep(); 
        Dog dog = new Dog();
        System.out.println("\nDog:");
        dog.eat();   
        dog.sleep(); 
    }
}
