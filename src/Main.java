public class Main {
    public static void main(String[] args) {
        System.out.println(dannye(21, -10));
        System.out.println(dannye(15, -18));
        System.out.println(dannye(50, 2));
        System.out.println(dannye(39, 31));
        System.out.println(dannye(5, 30));
    }

    public static String dannye (int ageOfHuman, double temperature) {
        if (ageOfHuman > 20 && ageOfHuman < 45 && temperature > -20 && temperature < 30)
            return "Можно идти гулять";

        else if (ageOfHuman < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";

        else if (ageOfHuman > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";

        else
            return "Оставайтесь дома";
    }
    
}