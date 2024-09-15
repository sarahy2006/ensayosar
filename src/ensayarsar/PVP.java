/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensayarsar;

/**
 *
 * @author Toshiba 14
 */
public class PVP {
    public double resultado,costofab ;
    public void establecerCostofabrica(double costo){
    this.costofab=costo;
    }
    
    public void calcularPreciodeventa(){
    if (costofab < 3000){
    resultado= costofab+(costofab*0.15);
    
    } else if((costofab>=3000)&&(costofab<=6000)){
        resultado= costofab+(costofab*0.20);
    
    } else {
    resultado = costofab+(costofab*0.25);
    
    }
    
   
    
    }
    
    
  public double Obtenerpreciodevente(){
     return resultado;
  }
    
}
