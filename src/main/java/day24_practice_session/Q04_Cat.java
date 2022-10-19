package day24_practice_session;

public class Q04_Cat extends Q04_Animal{

    public void meow(){

        System.out.println("Cats meow...");

    }

    @Override
    public void consume() {
        System.out.println("Cats eat meat...");
    }


}
