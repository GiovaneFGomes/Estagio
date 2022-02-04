package br.com.apresentacoes.sprint01.estruturadedados.apresentados.example03;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> carros = new PriorityQueue<>();

        Carro[] carros1 = {new Carro(1974, "Fusca"),
                new Carro(2014, "Hilux"),
                new Carro(2000, "Uno"),
                new Carro(1998, "Gol"),
                new Carro(1900, "Fiat")};

        carros.add(carros1[0]);
        carros.add(carros1[1]);
        carros.add(carros1[2]);
        carros.add(carros1[3]);

        Arrays.sort(carros1);
        for(Carro car : carros1)
            System.out.println(car.getNome() + "\t" + car.getAno());

        System.out.println(carros.peek());

        Arrays.sort(carros1);
        for(Carro car : carros1)
            System.out.println(car.getNome() + "\t" + car.getAno());

    }

}
