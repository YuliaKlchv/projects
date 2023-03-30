public class  Animal {
    private String name;
    private int weight;
    private int height ;
    private int legs;

    public Animal(String name, int weight, int height, int legs) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.legs = legs;
    }
    public void eat(String food) {
        System.out.println("The animal is "+food+" eating now...");
    }
    public void move(int speed) {
        System.out.println("The animal is with "+ speed +" km/h"+" moving..");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
