
package clases;

import java.text.DecimalFormat;


public class arregloF {
      private double altura;
    private double vinicial;
    private double angulo;
  private double sec;
   double vhori;
   double gravedad=9.81;

    public arregloF(double altura, double vinicial, double angulo, double sec) {
        this.altura = altura;
        this.vinicial = vinicial;
        this.angulo = angulo;
        this.sec = sec;
    }

    public arregloF() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVinicial() {
        return vinicial;
    }

    public void setVinicial(double vinicial) {
        this.vinicial = vinicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getSec() {
        return sec;
    }

    public void setSec(double sec) {
        this.sec = sec;
    }
  public String vhorizontal(){// hallando la componenete horizontal
  double anguloRadianes = Math.toRadians(angulo); 
  vhori=vinicial*Math.cos(anguloRadianes);
  DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(vhori);
     return value;

                        }
public String vvertical(){// hallando la componenete vertical 
    double anguloRadianes = Math.toRadians(angulo);    
     double vverti=vinicial*Math.sin(anguloRadianes)-(gravedad*sec);
     DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(vverti);
     return value;
}
 public String pos(){
     
     double  despla=Double.parseDouble(vhorizontal())*sec; 
        DecimalFormat df= new DecimalFormat("#.00");
       String despla2= df.format(despla);
       return despla2;
 }   
}
