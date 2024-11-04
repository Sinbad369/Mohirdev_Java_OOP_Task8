public class Main {
    public static void main(String[] args) {
        System.out.println("GoalKeeper Details below:");
        System.out.println("*****************************");
        Information goalKeeper = new GoalKeeper(100,2,4,200);
        goalKeeper.getInfo();
        System.out.println("*****************************\n");
        System.out.println("Setter Details below:");
        System.out.println("*****************************");
        Information setter = new Setter(90,300);
        setter.getInfo();
        System.out.println("*****************************\n");
        System.out.println("PointGuard Details below:");
        System.out.println("*****************************");
        Information pointGuard = new PointGuard(100, 23);
        pointGuard.getInfo();

        System.out.println("\nBase Converter Test Case below:");
        BaseConverter converter = new ToFahrenheitToKelvin();

        // Cast the BaseConverter to ToFahrenheitToKelvin to access specific methods
        ToFahrenheitToKelvin specificConverter = (ToFahrenheitToKelvin) converter;

        specificConverter.setCelsius(23.0); // Use the specific method
        System.out.println("Celsius: " + specificConverter.getCelsius());
        System.out.println("Fahrenheit: " + specificConverter.getFahrenheit());
        System.out.println("Kelvin: " + specificConverter.getKelvin());

    }
}