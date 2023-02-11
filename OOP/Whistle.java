public class CreatingClass { // the CreatingClass class

    public static void main(String[] args) { // main method

        // Creates two instances of the CreatingClass class
        Whistle duckWhistle = new Whistle("Kvaak");            
        Whistle roosterWhistle = new Whistle("Peef");

        // Calls the sound method on each whistle object
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    } // end main method
} // end CreatingClass class

class Whistle { // Whistle class

    // the sound of the whistle
    private String sound;

    // constructor that sets the sound of the whistle
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    // method that outputs the sound of the whistle
    public void sound() {
        // print sound
        System.out.println(this.sound);
    }
} // end Whistle class
