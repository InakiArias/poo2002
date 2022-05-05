package modelo;

public class Complejo {  
    public double real;
    public double imaginario;

    public Complejo(double real, double imaginario) {
        this.imaginario = imaginario;
        this.real = real;
    }

    public Complejo() {}
    
    public double argumento() {              
        return Math.atan2(this.imaginario, this.real);
    }
    
    public Complejo conjugado() {
        return new Complejo(this.real, -this.imaginario);
    }
    
    public Complejo division(Complejo divisor) {
        double denom = divisor.real * divisor.real + divisor.imaginario * divisor.imaginario;
        double rn = this.real * divisor.real + this.imaginario * divisor.imaginario;
        double in = this.imaginario * divisor.real - this.real * divisor.imaginario;
        
        return new Complejo(rn / denom, in / denom);
    }
    
    public double modulo() {
        double x2 = this.real * this.real;       
        double y2 = this.imaginario * this.imaginario;
        
        return Math.sqrt(x2 + y2);
    }
    
    public Complejo opuesto() {
        return new Complejo(-this.real, -this.imaginario);
    }
    
    public Complejo producto(Complejo factor) {
        double r = this.real * factor.real - this.imaginario * factor.imaginario;
        double i = this.real * factor.imaginario + this.imaginario * factor.real;
        
        return new Complejo(r, i);
    }
    
    public Complejo productoPorReal(double factor) {        
        return new Complejo(this.real * factor, this.imaginario * factor);
    }
    
    public Complejo resta(Complejo sustraendo) {
        double r = this.real - sustraendo.real;
        double i = this.imaginario - sustraendo.imaginario;
        
        return new Complejo(r, i);
    } 
    
    public Complejo suma(Complejo sustraendo) {
        double r = this.real + sustraendo.real;
        double i = this.imaginario + sustraendo.imaginario;
        
        return new Complejo(r, i);
    }
            

    @Override
    public String toString() {
        return "Complejo{" + "real=" + real + ", imaginario=" + imaginario + '}';
    }

    
}
