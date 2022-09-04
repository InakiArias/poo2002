package modelo;

public class Cuadratica {

    double a, b, c;

    public Cuadratica() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }

    public Cuadratica(double a, double b, double c) {
        if (a != 0) {
            this.a = a;
            this.b = b;
            this.c = c;
        } 
        else {
            this.a = 1;
            this.b = 0;
            this.c = 0; //??
        }
    }
    
    public double getXv() {
        return -b / (2 * a);
    }

    public double getYv() {
        double xv = this.getXv();
        
        return a * xv * xv + b * xv + c;
    }
    
    private double determinante() {
        return b * b - 4 * a * c;
    }
    
    public double[] raices() {
        double det = this.determinante();
        
        if (det == 0) {
            return new double[]{this.getXv()};
        }
        else if (det > 0) {
            double r1 = (-b + Math.sqrt(det)) / (2 * a);
            double r2 = (-b - Math.sqrt(det)) / (2 * a);
            
            return new double[]{r1, r2};
        }
        else {
            return null;
        }
    }
    
    public Complejo[] raicesComplejas() {
        double det = this.determinante();
        
        if (det == 0) {
            return new Complejo[]{new Complejo(this.getXv(),0)};
        }
        else if (det > 0) {
            double r1 = (-b + Math.sqrt(det)) / (2 * a);
            double r2 = (-b - Math.sqrt(det)) / (2 * a);
            
            return new Complejo[]{new Complejo(r1,0), new Complejo(r2,0)};
        }
        else {
            double r = this.getXv();
            double c = Math.sqrt(-det) / (2*a);
            
            return new Complejo[]{new Complejo(r,c), new Complejo(r,-c)};
        }
    }
}
