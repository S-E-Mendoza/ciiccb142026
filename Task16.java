interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

class Gorilla implements Animal {

    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("It's not time to eat yet.");
            return false;
        }
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.feed(false);
        gorilla.groom();
        gorilla.pet();
    }
}