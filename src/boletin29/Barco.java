package boletin29;

public abstract class Barco {
    
    private int matricula;
    private int eslora;

    public Barco() {
    }

    public Barco(int matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora;
    }

    public abstract float calcularAlquiler();
    
    
}
