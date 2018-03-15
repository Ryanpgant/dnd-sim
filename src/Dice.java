import java.util.Random;

public class Dice {
    public static final Random boy = new Random();

    public static int rollDice(int numberOfDice, int typeOfDie) {
        int sum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            sum += boy.nextInt(typeOfDie) + 1;
        }
        return sum;
    }

    public static int rollD20() {
        return rollDice(1, 20);
    }

    public static int rollD4() {
        return rollDice(1, 4);
    }

    public static int rollD6() {
        return rollDice(1, 6);
    }

    public static int rollD8() {
        return rollDice(1, 8);
    }

    public static int rollD10() {
        return rollDice(1, 10);
    }

    public static int rollD12() {
        return rollDice(1, 12);
    }
}
