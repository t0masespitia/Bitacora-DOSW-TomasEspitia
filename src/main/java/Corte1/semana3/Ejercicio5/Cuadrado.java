package Corte1.semana3.Ejercicio5;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando cuadrado en ");
        color.aplicarColor();
    }
}