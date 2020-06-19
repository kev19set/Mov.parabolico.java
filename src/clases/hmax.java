
package clases;

import java.text.DecimalFormat;


public class hmax {
    private double vinicial;
    private double angulo;
    public double aceleracion=9.81;
    public hmax() {
    }

    public hmax(double vinicial, double angulo) {
        this.vinicial = vinicial;
        this.angulo = angulo;
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
    
   public String altmax(){
       double anguloRadianes = Math.toRadians(angulo); 
       double alt=(vinicial*vinicial*(Math.sin(anguloRadianes)*Math.sin(anguloRadianes)))/2*aceleracion;
        DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(alt);
     return value;
   }
   public String mostrar(){
       return "El valor de la altura maxima es : "+altmax()+
               "\nEn caso exista una altura inicial sumar al valor obtenido";
       
   }
}
