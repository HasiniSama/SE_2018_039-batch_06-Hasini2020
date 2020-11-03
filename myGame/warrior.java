package myGame;

public class Warrior {
    String name;
    int age;
    Boolean isImmobile;

    Warrior(String name, int age){
        this.name = name;
        this.age = age;
        this.isImmobile = false;
    }

    void walking(){
        System.out.println(this.name+" is walking.");
    }

    void becomeImmobile(){
        this.isImmobile = true;
    }

    void checkMobility(){
        System.out.print(this.name+" ");
        System.out.println(this.isImmobile?"is immobile.":"is not immobile.");
    }
}
