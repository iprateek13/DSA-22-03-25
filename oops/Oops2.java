package oops;

public class Oops2 {
    public static void main(String[] args) {
        AccessAnimal ac = new AccessAnimal();
        ac.checkRun();
        ac.run();
        MeraAnimal an = new MeraAnimal();
        an.setHuga("hugooo");
        System.out.println(an.getHugs());
        MeraAnimal anc = new AccessAnimal();
        anc.eat(); // Method Override
        ac.eats();
    }
}

class MeraAnimal {
    private String hugs;

    void eat() {
        System.out.println("eatssss. Animal.");
    }

    void setHuga(String hugs) {
        this.hugs = hugs;
    }

    String getHugs() {
        return this.hugs;
    }

    protected void run() {
        System.out.println("runnnnn............");
    }
}

class AccessAnimal extends MeraAnimal {
    void checkRun() {
        System.out.println("Animal is runnning...........");
    }

    void eat() {
        System.out.println("eatssss. Access animal.");
    }

    void eats() {
        System.out.println("eattssss what ........");
    }
}