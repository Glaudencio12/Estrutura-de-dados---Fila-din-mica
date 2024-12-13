public class Queue {
    Node front;
    Node rear;
    int size;


    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void enqueue(String value){
        Node no = new Node(value);
        if (isEmpty()) {
            this.front = no;
            this.rear = no;
        }else{
            this.rear.next = no;
            this.rear = no;
        }
        size++;
    }

    public String dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }else{
            String vartemp = front.element;
            this.front = this.front.next;
            size--;
            return vartemp;
        }
    }

    public String printQueue(){
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }else {
            String p = "[" + this.front.element;
            Node no = this.front.next;
            while (no != null) {
                p += ", " + no.element;
                no = no.next;
            }
            return p +  "]";
        }
    }
}
