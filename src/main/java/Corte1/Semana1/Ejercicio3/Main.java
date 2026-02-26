package Corte1.Semana1.Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> usuarios = Arrays.asList(
                new User(1, "Daniel", 22, true),
                new User(2, "Andres", 19, false),
                new User(3, "Camilo", 30, true),
                new User(4, "Martin", 27, true),
                new User(5, "Joel", 17, false)
        );


        List<String> nombresActivos = usuarios.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Usuarios activos (ordenados y con mayúscula):");
        System.out.println(nombresActivos);
    }
}
