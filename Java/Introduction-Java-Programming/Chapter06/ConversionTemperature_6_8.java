public class ConversionTemperature_6_8 {
    public static void main(String[] args) {
        /*double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter celsius temperature:");
        celsius = scanner.nextDouble();
        fahrenheit = (double) Math.round(celsiusToFahrenheit(celsius) * 10) / 10;
        System.out.println("The fahrenheit temperature is " + fahrenheit);
        System.out.print("Please enter fahrenheit temperature:");
        fahrenheit = scanner.nextDouble();
        celsius = (double) Math.round(fahrenheitToCelsius(fahrenheit) * 10) / 10;
        System.out.println("The celsius temperature is " + celsius);
        scanner.close();*/
//        System.out.println("Celsius      Fahrenheit     |     Fahrenheit      Celsius");
//        System.out.println("---------------------------------------------------------");
        System.out.printf("%s%4s%s%4s%s%-4s%s%-4s%s", "Celsius", " ", "Fahrenheit", " ", "|", " ", "Fahrenheit", " ", "Celsius");
        System.out.println();
        System.out.printf("%s", "-----------------------------------------------------------");
        System.out.println();
        double celsius = 40.0D;
        double fahrenheit = 120.0D;
//        double cTof, fToc;
        for (int i = 1; i <= 10; i++) {
//            cTof = (double) Math.round(celsiusToFahrenheit(celsius)*10)/10;
//            fToc = (double) Math.round(fahrenheitToCelsius(fahrenheit)*100)/100;
//            System.out.println(celsius + "         " + cTof + "           |     " + fahrenheit + "           " + fToc);
            System.out.printf("%-5.1f%6s%-6.1f%9s%-4s%-6.1f%8s%-6.2f%n", celsius, " ", celsiusToFahrenheit(celsius), "|", " ", fahrenheit, " ", fahrenheitToCelsius(fahrenheit));
            celsius -= 1;
            fahrenheit -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
//        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
//        return celsius;
    }
}
