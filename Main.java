public class Main {
    static double pounds;
    final static double kiloConversion = 0.45359237;
    public static void main(String[] args) {
        pound2Kilo(200);
        
    }

    public static double converter(double pounds){
      double kilo = pounds * kiloConversion;
      return kilo;
    }

    public static void pound2Kilo(double pounds){
        System.out.println(converter(pounds));
    }
}