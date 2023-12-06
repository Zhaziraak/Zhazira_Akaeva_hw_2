import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ABC(10, -2));
        System.out.println(ABC(22, -5));
        System.out.println(ABC(19, -16));
        System.out.println(ABC(37, 21));
        System.out.println(ABC(45, 30));
        System.out.println();


        System.out.println(ABC(generateRandomAge(), 15));
        System.out.println(ABC(generateRandomAge(), -50));
        System.out.println(ABC(generateRandomAge(), 25));
        System.out.println(ABC(generateRandomAge(), 3));
        System.out.println(ABC(generateRandomAge(), -10));

    }

    public static String ABC (int ageOfHuman, int streetTemperature) {
        if (ageOfHuman > 20 && ageOfHuman < 45 && streetTemperature > -20 &&
                streetTemperature < 30)
            return "Можно идти гулять";

        else if (ageOfHuman < 20 && streetTemperature > 0 &&
                streetTemperature < 28)
            return "Можно идти гулять";

        else if (ageOfHuman > 45 && streetTemperature > -10 && streetTemperature < 25)
            return "Можно идти гулять";

        else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge(){
        Random randAge = new Random();
        int limit = 100;
        return randAge.nextInt(limit);

    }
}
