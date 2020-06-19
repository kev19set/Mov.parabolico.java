
package grafica;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GrafParabola {
    JFreeChart grafica;
    XYSeriesCollection datos= new XYSeriesCollection();
    String xplain;
    String etix;
    String etiy;
    public GrafParabola(String t, String x ,String y){
        xplain=t;
        etix=x;
        etiy=y;
        grafica=ChartFactory.createXYLineChart(xplain, x, y, datos,PlotOrientation.VERTICAL,true,true,true);
        
    
    }
    public GrafParabola(){
        this("Sin titulo","x","y");
    }
  public void crearGraf(String idx,double[]x,double[]y){
      //para verificar la serie 
      XYSeries xy=new XYSeries(idx);
      int n =x.length;
      for(int i=0;i<n;i++){
      xy.add(x[i],y[i]);
  }
      datos.addSeries(xy);
  }   
  public void crearGrafica(String id,double[]x,double[]y){
    datos.removeAllSeries();
    crearGraf(id, x, y);
}
  public JPanel makepanel(){
     
      return new ChartPanel(grafica);
  }
}
