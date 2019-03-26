/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author salacomputocentro.ba
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Figura rectangulo= new Figura("rectangulo", 2*4);
         Figura circulo= new Circulo(2);
         Figura triangulo= new Figura("triangulo", (3*3));
         rectangulo.PrintInfo();
         circulo.PrintInfo();      
         triangulo.PrintInfo();
         
          Figura c1= new Circulo(2);
          Figura c2= new Circulo(3);
         c1.PrintInfo();
         c2.PrintInfo(); 
         
         Figura c= new Poligono("Rectangulo",4,2);
         Figura t= new Poligono("Tringulo",3,2);
         c.PrintInfo();
         t.PrintInfo(); 
         
          Figura t1= new Triangulo(2.0);
         Figura t2= new Triangulo(5.0);
         t1.PrintInfo();    
         t2.PrintInfo();  
        
    }
    
    static public class Figura { 
      String nombre;
      double area; 
       public Figura(String nombre, double _area) {
         this.nombre = nombre; this.area = _area; 
      } 
       public void PrintInfo() {
         System.out.println("Soy un "+nombre+" y mi area es "+area+" m"); 
      } 
      
   }
    
    
    
       static public class Circulo extends Figura {
      double radio;
       
       public Circulo(double radio) {
         super("Circulo", 2*Math.PI*radio);
         this.radio = radio;
      }

        
        
      @Override
       public void PrintInfo() {
         System.out.println("Soy un circulo y mi radio es "+radio);
                          
      }
      
   }
  
            static public class Poligono extends Figura {
           int numeroLados;
           double longitudLado;
           public Poligono(String nombre, int numeroLados, double longitudLado) {
             super(nombre,(numeroLados*longitudLado));
                  this.numeroLados=numeroLados;
                  this.longitudLado=longitudLado;
           }

        
           @Override
           public void PrintInfo() {
             System.out.println("Soy un poligono "+nombre+", tengo "+numeroLados+ " lados de longitud "+longitudLado+ " m, por lo que mi area es "+area+ " m");
           }
           
         }

                 static  public class Triangulo extends Poligono {
       public Triangulo(double longitudLado) {
         super("Triangulo",3,longitudLado);
      }
      
   }

          static  public class Cuadrado extends Poligono {
          public Cuadrado(double longitudLado) {
          super("Cuadrado",4,longitudLado);
      }
       public static void main(String[] args) {
         Figura c1= new Cuadrado(2.0);
         Figura c2= new Cuadrado(5.0);
         c1.PrintInfo();    
         c2.PrintInfo();  
      }
   }

       //La clase poligono la cree para que se me hiciera mas facil calcular el area del rectangulo y del triangulo
       
    
}
