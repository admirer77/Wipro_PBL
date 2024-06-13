/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. 
The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities. */

public class ClassBox {
    public static void main(String[] args) {
        Box b = new Box(5,10,2);
        System.out.println(b.getVolume(5,10,2));
    }
}

class Box{
    private int length;
    private int width;
    private int height;

    Box (int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int getVolume(int length, int width, int height){
        int area = length * width * height;
        return area;
    }

}
