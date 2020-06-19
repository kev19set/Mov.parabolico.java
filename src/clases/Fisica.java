
package clases;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.text.DecimalFormat;



public class Fisica {
    private double altura;
    private double vinicial;
    private double angulo;
    private double despla;
   double aceleracion=9.81;
    public double tiempo;
    double vhori;

    public Fisica() {
    }

    public Fisica(double altura, double vinicial, double angulo) {
        this.altura = altura;
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

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
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
 
public String vhorizontal(){// hallando la componenete horizontal
  double anguloRadianes = Math.toRadians(angulo); 
  vhori=vinicial*Math.cos(anguloRadianes);
  DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(vhori);
     return value;

                        }
public String vvertical(){// hallando la componenete vertical 
    double anguloRadianes = Math.toRadians(angulo);    
     double vverti=vinicial*Math.sin(anguloRadianes);
     DecimalFormat df= new DecimalFormat("#.00");
     String value= df.format(vverti);
     return value;
}

       public String mru(){
          
          
         despla=Double.parseDouble(vhorizontal())*Double.parseDouble(cuadratica()); 
        DecimalFormat df= new DecimalFormat("#.00");
       String despla2= df.format(despla);
       return despla2;
       
     
    }
  
   
   public String mostrar(){
       return "El tiempo de Vuelo es : "+cuadratica()+
               "\nComponente de La Velocidad Vertical: "+vvertical()+
               "\nComponente de La Velocidad Horizontal: "+vhorizontal()+
               "\nLa distancia recorrida es: "+mru();
   }
  public String despla(){
      return "La distancia recorrida es "+mru();
  }
  public String tvuelo(){
      return "El tiemoi de Vuelo es : "+cuadratica()+"s";
  }
}
