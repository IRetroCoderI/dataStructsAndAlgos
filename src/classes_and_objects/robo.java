package classes_and_objects;

public class robo {
    String color;
    int weight;
    String name;

    robo(){

    }
    robo(String name, int weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }


    void sayHello(){
        System.out.println("Hello there!");
    }
    void introduceSelf(){
        System.out.println("My name is "+name+", let's be friends!!");
    }
    void systemInfo(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);

    }

}
