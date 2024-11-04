public class ToFahrenheitToKelvin implements BaseConverter{
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getFahrenheit() {
        return (9.0 / 5) * celsius - 32;
    }

    @Override
    public double getKelvin() {
        return celsius + 273.5;
    }
}
