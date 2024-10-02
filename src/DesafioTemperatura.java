public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelcius = 30.4;
        double temperaturaFarenheit = (temperaturaEmCelcius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celcius e equivalente a %f Fahrenheit" , temperaturaEmCelcius, temperaturaFarenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaFarenheit;
        System.out.println("A temperatura em Fahrenheit inteira e: " +temperaturaEmFahrenheitInteira);
    }
}
