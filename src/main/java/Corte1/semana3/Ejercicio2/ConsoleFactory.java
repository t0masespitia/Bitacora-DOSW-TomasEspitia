package Corte1.semana3.Ejercicio2;

public interface ConsoleFactory {
    Controller createControl();
    Game createGame();
    UI createUI();
}