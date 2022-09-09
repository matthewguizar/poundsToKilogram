public class Main {
    static double pounds;
    final static double kiloConversion = 0.45359237;
    public static void main(String[] args) {
        pound2Kilo(200);
        printConversion(25.42);
        
    }

    public static double converter(double pounds){
      double kilo = pounds * kiloConversion;
      return kilo;
    }

    public static void pound2Kilo(double pounds){
        System.out.println(converter(pounds));
    }

    public static long toMilesPerHour(double kilometerPerHour){
        double result;
        if (kilometerPerHour < 0){
            result = -1;
        } else {
           result = (kilometerPerHour / 1.609);
        }
        return Math.round(result);
    }

    public static void printConversion(double kilometerPerHour){
        if (kilometerPerHour < 0)
        System.out.println("Invalid Value");
        else {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) +" mi/h");
        }
    }
}