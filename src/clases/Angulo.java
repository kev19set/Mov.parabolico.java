
package clases;


public class Angulo {
    private double vinicial;
    private double  alturafinal;
    private double altura; 
    private double despla;
    double aceleracion=9.81;
    private double ang ;
    public Angulo() {
    }

    public Angulo(double vinicial, double alturafinal, double altura, double despla) {
        this.vinicial = vinicial;
        this.alturafinal = alturafinal;
        this.altura = altura;
        this.despla = despla;
    }
    public double getVinicial() {
        return vinicial;
    }
    public void setVinicial(double vinicial) {
        this.vinicial = vinicial;
    }
    public double getAlturafinal() {
        return alturafinal;
    }
    public void setAlturafinal(double alturafinal) {
        this.alturafinal = alturafinal;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getDespla() {
        return despla;
    }
    public void setDespla(double despla) {
        this.despla = despla;
    }    
    public double calangulo(){
        
        double a=(aceleracion/2)*((despla*despla)/(vinicial*vinicial));
        double b=-despla;
        double c=(aceleracion/2)*((despla*despla)/(vinicial*vinicial))+(alturafinal-altura);
        double determinante=(b*b)-(4*a*c);
        double t1=(-b+Math.sqrt((determinante)))/(2*a);
        double t2=(-b-Math.sqrt((determinante)))/(2*a);
        if(t1>0 ){
            if(t1>t2){
               ang=t2;
            }
            else {
               ang=t2;
            }
        }else if (t1==t2){
            ang=t1;
        }else{ ang=t2;
        }  
  return ang ; 
    }
 public double arctan(){
     double value = Math.atan(calangulo());
                  return Math.toDegrees(value); 
 }
    public String mostrar(){
       
        return"El valor es : "+arctan();
        
    }
}
