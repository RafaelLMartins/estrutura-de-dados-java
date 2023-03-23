package Filas;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        /*minhaFila.enqueue(new No("primeiro"));foi alteradi na classe fila os metodos não recebem mais o nó apenas o atributo do objeto(onde era No agora é obj)
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));*/

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");


        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

/*
        System.out.println(minhaFila);
*/
    }
}
