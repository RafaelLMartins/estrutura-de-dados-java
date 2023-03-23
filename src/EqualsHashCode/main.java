package EqualsHashCode;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Carro> listasCarros = new ArrayList<>();

        listasCarros.add(new Carro("Ford"));
        listasCarros.add(new Carro("Chevrolet"));
        listasCarros.add(new Carro("Volkswagen"));

        System.out.println(listasCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford1").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
