/*Create a base class Fruit with name, taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste. */

public class Fruit {
    String name;
    String taste;
    int size;

    public Fruit(String name, String taste, int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public void eat(){
        System.out.println("Name of the Fruit: "+name+"\ntaste of the fruit"+taste);
    }
}

class Apple extends Fruit{
    public void eat(){
        System.out.println("The Apple is sweet");
    }    
}

class Orange extends Fruit{
    public void eat(){
        System.out.println("The Orange is sweet and sour");
    }    
}
