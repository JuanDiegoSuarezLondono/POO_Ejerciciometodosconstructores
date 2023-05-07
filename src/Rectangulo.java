import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Rectangulo {
    private int alto;
    private int ancho;

    public Rectangulo(int alt, int anc)
    {
        alto=alt;
        ancho=anc;
    }

    public int getAlto() {
        return alto;
    }


    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int perimetro(int alt, int anc)
    {
        int perimetro;
        perimetro=(alt*2)+(anc*2);
        return perimetro;
    }
    public int area( int alt, int anc)
    {
        int area;
        area=alt*anc;
        return area;
    }

    public boolean verificar(int alt, int anc)
    {
        boolean Cuadrado;
        if(alt==anc)
        {
            Cuadrado=true;
        }
        else
        {
            Cuadrado=false;
        }

        return Cuadrado;
    }

}
