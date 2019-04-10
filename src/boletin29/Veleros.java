package boletin29;

public class Veleros extends Barco {

    private int nMastiles;
    
    @Override
    public float calcularAlquiler(){
       return (super.getEslora()*10 + nMastiles*8);
    }

    public Veleros() {
    }

    public Veleros(int nMastiles, int matricula, int eslora) {
        super(matricula, eslora);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return  super.toString() + " nMastiles=" + nMastiles;
    }

    
    
    
}
