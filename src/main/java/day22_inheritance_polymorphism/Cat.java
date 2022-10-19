package day22_inheritance_polymorphism;

public class Cat extends Mammal {

    public String name = "Cat";

    public Cat() {
        System.out.println(name);

        System.out.println(super.name);
        System.out.println(this.name);//Cat

    }

    @Override
    public void eat() {//overriding method
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk...");
    }

    @Override
    public Cat create() {
        return create();
    }

    @Override
    public Integer add() {
        return 34;
    }

    @Override
    public int multiply() {
        return 45;
    }


}
