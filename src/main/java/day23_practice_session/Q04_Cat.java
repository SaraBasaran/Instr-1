package day23_practice_session;

public class Q04_Cat extends Q04_Animal {

    public void meow(){

        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat meat");
    }
}
