
package clases;

import java.text.DecimalFormat;

public class Vinicial{
private double altura;
private double altfinal;
private double angulo;
private double despla;
double aceleracion=981;
public double tiempo;
public double vini;

    public Vinicial() {
    }

    public Vinicial(double altura, double altfinal, double angulo, double despla) {
        this.altura = altura;
        this.altfinal = altfinal;
        this.angulo = angulo;
        this.despla = despla;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltfinal() {
        return altfinal;
    }

    public void setAltfinal(double altfinal) {
        this.altfinal = altfinal;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getDespla() {
        return despla;
    }

    public void setDespla(double despla) {
        this.despla = despla;
    }

    public double tiempo(){
        
        
     double anguloRadianes = Math.toRadians(angulo);   
     tiempo=Math.sqrt((altura-altfinal+(despla*Math.tan(anguloRadianes)))/(9.81/2));
     

     
    
    return tiempo ; 
    }
    public String vinicial(){
        double anguloRadianes = Math.toRadians(angulo); 
         vini=(despla/(Math.cos(anguloRadianes)*tiempo()));
         DecimalFormat df= new DecimalFormat("#.00");
       String despla2= df.format(vini);
       return despla2; 
    }
    public String mostrar(){
        return"El valor de la velocidad inicial es : "+vinicial()+"\nEl tiempo de vuelo es: "+tiempo();
    }
}