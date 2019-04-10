package boletin29;

public class Yates extends Barco {
    
    private int cV;
    private int numCamarotes;

    public Yates() {
    }

    public Yates(int cV, int numCamarotes, int matricula, int eslora) {
        super(matricula, eslora);
        this.cV = cV;
        this.numCamarotes = numCamarotes;
    }

    public int getcV() {
        return cV;
    }

    public void setcV(int cV) {
        this.cV = cV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + " cV=" + cV + ", numCamarotes=" + numCamarotes;
    }
    
     public float calcularAlquiler(){
        return (super.getEslora() + 2*cV + numCamarotes*25);
    }
    
    
    
}
