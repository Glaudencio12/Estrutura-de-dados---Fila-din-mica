public class Mian {
    public static void main(String[] args) {
        Queue fila = new Queue();

        fila.enqueue("Bola");
        fila.enqueue("Galo");
        fila.enqueue("Boca");
        fila.enqueue("Bico");

        System.out.println("Fila: " + fila.printQueue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Fila alterada: " +fila.printQueue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Fila alterada: " + fila.printQueue());
    }
}
