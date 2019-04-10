package boletin29;

public class Deportivas extends Barco{

    public int cV;

    public Deportivas() {
    }

    public Deportivas(int cV, int matricula, int eslora) {
        super(matricula, eslora);
        this.cV = cV;
    }

    public int getcV() {
        return cV;
    }

    public void setcV(int cV) {
        this.cV = cV;
    }

    @Override
    public String toString() {
        return super.toString() + " cV=" + cV ;
    }
    
    @Override
     public float calcularAlquiler(){
        return (super.getEslora() + 2*cV);
    }

    
}

