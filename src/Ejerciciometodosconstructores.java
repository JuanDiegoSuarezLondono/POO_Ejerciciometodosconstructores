import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejerciciometodosconstructores {
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el alto y ancho");
        Rectangulo Rectan=new Rectangulo(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
        System.out.println("Perimetro: "+Rectan.perimetro(Rectan.getAlto(),Rectan.getAncho())+" cm");
        System.out.println("Area: "+Rectan.area(Rectan.getAlto(),Rectan.getAncho())+" cm^2");
        System.out.println("Cuadrado: "+ Rectan.verificar(Rectan.getAlto(),Rectan.getAncho()));
    }
}
