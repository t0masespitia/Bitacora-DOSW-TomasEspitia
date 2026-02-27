package Corte1.semana2.Ejercicio3;

public interface ToyDollBuilder {

    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    void buildAccessories();

    ToyDoll getToyDoll();
}