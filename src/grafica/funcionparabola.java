
package grafica;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;


public class funcionparabola {
    String definicion;
    IMathParser parser= MathParserFactory.create();
  public funcionparabola(String def){
      definicion=def;
      parser.setExpression(def); // PARA ASIGNAR LA EXPRESION (PARABOLA)
 
  }
  public double evaluart(double x) throws Exception{
      double xs=Double.NaN;
      parser.setX(x);
      xs=parser.getValue();
      //para verificar la expresion 
      return xs;
      
  }
  //evaluar un arreglo
  public double[] evaluart(double[]x)throws Exception{
      int n=x.length;
      double[] xs=new double[n];
      for(int i=0;i<n;i++){
          xs[i]=evaluart(x[i]);
      }
      return xs ;
  }
  public double[] rango(double x0,double xn,double incre){
      int n=(int)(Math.abs(xn-x0)/incre);
      double[] xs=new double[n];
      for(int i=0;i<n;i++){
       xs[i]=x0;
       x0+=incre;
  }
      return xs;
  }
}
