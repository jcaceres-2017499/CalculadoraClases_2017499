/*
Nombre: Juan Pablo Caceres Enriquez
Carne: 2017499
Codigo Tecnico: IN5AV
Fecha de creacion: 14/03/2022
Fecha de modificacion:
 */
package org.juancaceres.system;

import javax.swing.JOptionPane;
import org.juancaceres.bean.Division;
import org.juancaceres.bean.Multiplicacion;
import org.juancaceres.bean.Resta;
import org.juancaceres.bean.Salir;
import org.juancaceres.bean.Suma;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Suma suma= new Suma(0,0);
        Resta resta= new Resta(0,0);
        Multiplicacion multiplicacion= new Multiplicacion(0,0);
        Division division= new Division(0,0);
        Salir salir=new Salir(0);
        
        do{
            salir.setOpcion(Integer.parseInt(JOptionPane.showInputDialog(null,"1.....Suma"+"\n"+"2.....Resta"+"\n"+"3.....Multiplicacion"+"\n"+"4.....Division"+"\n"+"5.....Salir")));
            switch(salir.getOpcion()){
                case 1:
                    JOptionPane.showMessageDialog(null,"Programador: Juan Caceres");
                    suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero a sumar")));
                    suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero a sumar")));
                    JOptionPane.showMessageDialog(null, "La sumamatoria de sus valores es: "+ String.valueOf(suma.sumatorias(suma.getNum1(),suma.getNum2())));     
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Programador: Juan Caceres");
                    resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor al que le quiere restar")));
                    resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor a restar")));
                    JOptionPane.showMessageDialog(null, "El residuo de sus valores es es: "+ String.valueOf(resta.restas(resta.getNum1(),resta.getNum2())));      
                    break;
    
                case 3:
                    JOptionPane.showMessageDialog(null,"Programador: Juan Caceres");
                    multiplicacion.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor a multiplicar")));
                    multiplicacion.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor a multiplicar")));
                    JOptionPane.showMessageDialog(null, "El producto de sus valores es: "+ String.valueOf(multiplicacion.multiplicaciones(multiplicacion.getNum1(),multiplicacion.getNum2())));     
                    break;
           
                case 4:
                    JOptionPane.showMessageDialog(null,"Programador: Juan Caceres");
                    division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el dividendo")));       
                    division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el divisor")));
                    JOptionPane.showMessageDialog(null, "El cociente de los valores es: "+ String.valueOf(division.divisiones(division.getNum1(),division.getNum2())));    
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null,"Programador: Juan Caceres");
                    JOptionPane.showMessageDialog(null,"¿Esta seguro que quiere salir?");
             
                    break;          
                }
           }while((salir.getOpcion())!=5);
        }
    
}

    
