/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Toshiba 14
 */
public class calcular {
    private double calificaciones[]= new double[5];
    private double promedio, desviacion, max_nota=0,min_nota=5;
    
 public void establecerCalif(double notas[]){
     this.calificaciones=notas;
 }
 public void calcularPromedio(){
 double suma=0;
 for (int i=0; i<5 ; i++){
 suma= suma+calificaciones[i];
 
 }
 promedio= suma/5;
 
 }

 
 public void calcularDesviacion(){
     double media=promedio;
     double diferencia,suma=0,division;
     for (int i=0; i<5 ; i++){
     diferencia= calificaciones[i]-media;
     double base= diferencia, exponente=2 ;
      double resultado = Math.pow(base, exponente);
       suma = suma+resultado;
     }
  division= suma/4;
  desviacion= Math.sqrt(division);
}
 public void calcularMax_nota(){
 max_nota=0;
 for(int i=0;i<5;i++){
 if(max_nota<calificaciones[i]){
 max_nota =calificaciones[i];
 }
 
 
 }
 }
 public void calcularMin_nota(){
  min_nota=5;
  for(int i=0;i<5;i++){
 if(min_nota>calificaciones[i]){
 min_nota =calificaciones[i];
 }
 
 }
  
 }
 
  public double obtenerPromedio(){
     
     return promedio;
 }
 
  public double obtenerDesviacion(){
  return desviacion;
  
  }
  
  public double obtenerMax_nota(){
  return max_nota;
  }
  
  public double obtenerMin_nota(){
  return min_nota;
  }
  
  
 
}



