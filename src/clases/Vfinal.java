
package clases;

import java.text.DecimalFormat;


public class Vfinal {
    private double vinicial;
    private double angulo;
    private double altura;
    private double altfinal;
    private double tiempo;
     double aceleracion=9.81;

    public Vfinal() {
    }

    public Vfinal(double vinicial, double angulo, double altura, double altfinal) {
        this.vinicial = vinicial;
        this.angulo = angulo;
        this.altura = altura;
        this.altfinal = altfinal;
    }

    
    public double getViniial() {
        return vinicial;
    }

    public void setViniial(double viniial) {
        this.vinicial = viniial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
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
    
     public String cuadratica(){
     //funcion para convertir a radianes el angulo ingresado 
     //recien convertido se puede aplicar la funcion math.cos / math.sin
     double anguloRadianes = Math.toRadians(angulo);   
     double a=-(aceleracion)/2;
     double b=vinicial*Math.sin(anguloRadianes);
     double c=altura;
     double determinante=(b*b)-(4*a*c);
   
        double t1=(-b+Math.sqrt(determinante))/(2*a);
        double t2=(-b-Math.sqrt(determinante))/(2*a);
        if(t1>0 ){
            if(t1>t2){
               tiempo=t1;
            }
            else {
               tiempo=t2;
            }
        }else if (t1==t2){
            tiempo=t1;
        }else{ tiempo=t2;
        }  
     

 
    
     DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(tiempo);
     return value;
 }
 
         public String vfinal(){
           double vf=(-aceleracion*Double.parseDouble(cuadratica()))-vinicial;
           DecimalFormat df= new DecimalFormat("#.00");
       String vfinal2= df.format(vf);
       return vfinal2;
       }
    

   public String mostrarvfinal(){
       return "La veocidad antes de llegar al suelo es : "+vfinal()+"m/s"
               +"El tiempo de vuelo es :" +cuadratica();
       
   }
}
