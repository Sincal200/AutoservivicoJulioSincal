package gt.edu.umg.progra3.colas;

public class AutoServicio {

    int head = 0;  // index of front element in queue
    int tail = 0;  // index of rear element in queue
    public int size;  // number of elements in queue

    private Cola cola;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    public String ingresarAuto(String placa){
        if (size == queue.length) {
            throw new IllegalStateException("Cannot add to full queue");
        }
        queue[tail] = placa;
        tail = (tail + 1) % queue.length;
        size++;
        return null;
    }

    public String proximoAuto(){
        //ingresar codigo aqui
        return null;
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
        //ingresar codigo aqui
        return null;
    }

    public int obtenerAutosEnCola(){
        //ingresar codigo aqui
        return 0;
    }
}
