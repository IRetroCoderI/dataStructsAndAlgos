package classes_and_objects;

public class Person {
    String name;
    String personality;
    boolean isSitting;
    Robo robotOwned;

    Person(String name, String personality, boolean isSitting){
        this.name = name;
        this.personality = personality;
        this.isSitting = isSitting;
    }
    void sitDown(){
        isSitting = true;
    }
    void standUp(){
        isSitting = false;
    }
}
