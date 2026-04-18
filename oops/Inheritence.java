package oops;


public class Inheritence {
    public static void main(String[] args) {
        laiika toharlaika = new laiika();
        System.out.println(toharlaika.getSpeak());
        System.out.println(toharlaika.sameBolela);
        toharlaika.pitna();
        toharlaika.kam();
    }
}

// Single level Inheritence
class papa {
    private String speak = "sunaba ki apne man k krba";

    public String getSpeak() {
        return speak;
    }

    void pitna() {
        System.out.println("Pitna ab chhod diye hai");
    }

    void smjhana() {
        System.out.println("Smjhana b chhod diye hai");
    }
}

class laiika extends papa {
    String sameBolela = "tohre niyar hi bolella";

    void kam() {
        System.out.println("kam krela par tohse kam");
    }

    void sunela() {
        System.out.println("sunal acha n lgela jb u krela na");
    }
}
