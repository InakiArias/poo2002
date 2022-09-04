package modelo;

public class AutomovilAutomatico extends Automovil {

    public AutomovilAutomatico(String patente, double velocidadmaxima) {
        super(patente, velocidadmaxima);
    }

    public AutomovilAutomatico(String patente) {
        super(patente);
    }
    
    private static int calcularMarcha(double vel) {
        if (vel == 0)
            return 0;
        else if (vel < 10)
            return 1;
        else if (vel < 35)
            return 2;
        else if (vel < 50)
            return 3;
        else if (vel < 90)
            return 4;
        else
            return 5;
    }

    @Override
    public void acelerar(double vel) {
        if (vel > 0) {
            this.velocidad += vel;
            
            if (this.velocidad > this.getVelocidadmaxima()) {
                this.velocidad = this.getVelocidadmaxima();
            }
            if (this.getMarcha() == -1 && this.velocidad > this.getVelocidadmaxima() / 3)
                this.velocidad = this.getVelocidadmaxima() / 3;
            
            if (this.getMarcha() != -1)
                this.setMarcha(AutomovilAutomatico.calcularMarcha(this.velocidad));
        }
    }

    @Override
    public void frenar(double vel) {
        if (vel > 0) {
            this.velocidad -= vel;

            if (this.velocidad < 0) {
                this.velocidad = 0;
            }
            
            if (this.getMarcha() != -1)
                this.setMarcha(AutomovilAutomatico.calcularMarcha(this.velocidad));
        }
    }
    
    public void activarReversa() {
        if (this.velocidad == 0)
            this.setMarcha(-1);
    }
    
    public void desactivarReversa() {
        if (this.velocidad == 0)
            this.setMarcha(0);
    }

}
