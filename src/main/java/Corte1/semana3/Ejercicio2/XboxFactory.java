package Corte1.semana3.Ejercicio2;

public class XboxFactory implements ConsoleFactory{
    @Override
    public Controller createControl() {
        return new XboxControler();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    public UI createUI(){
        return new XboxUI();
    }
}