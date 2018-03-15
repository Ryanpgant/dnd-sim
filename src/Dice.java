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
        return boy.nextInt(20) + 1;
    }

    public static int rollD4() {
        return boy.nextInt(4) + 1;
    }

    public static int rollD6() {
        return boy.nextInt(6) + 1;
    }

    public static int rollD8() {
        return boy.nextInt(8) + 1;
    }

    public static int rollD10() {
        return boy.nextInt(10) + 1;
    }

    public static int rollD12() {
        return boy.nextInt(12) + 1;
    }
}
