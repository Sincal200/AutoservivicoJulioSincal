package gt.edu.umg.progra3.colas;

public class AutoServicio {

    public Node head;
    public Node tail;
    public int size;
    private Cola cola;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }

    public String ingresarAuto(String placa){
        Node newNode = new Node(placa);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return newNode.value;
    }

    public String proximoAuto(){
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public String entregarAuto(){
        if (head == null) {
            return null;
        }

        String placa = head.value;
        head = head.next;
        size--;

        return placa;
    }

    public int obtenerAutosEnCola(){
        return size;
    }
}
