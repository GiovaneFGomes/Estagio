package br.com.apresentacoes.sprint01.equalshashcode.example01;

public class Main {

    public static void main(String[] args) {
        String a = "Giovane";
        String b = "Isabella";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        // Hashcode é mais rápido de ser calculado, porém nao é 100% efetivo, retorna hash.
        // Equals é mais lento, porém é 100% efetivo, retorna true ou false.

    }
}

