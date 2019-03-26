/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import quiz.Quiz.Personal.Docente;



/**
 *
 * @author salacomputocentro.ba
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Docente Personal = new Docente();
    Personal.DNI(112345);
    Personal.nombre("Pedro Perez");
    Personal.fecha("Enero 12 del 2016");
    Personal.AsignaturasDictadas(7);
    Personal.montoXasignatura(20000);
    
    
         
    
    }
    
    static public class Personal {
        private int DNI;
        private String nombre;
        private String fecha;
       
        
        public void DNI (int Identificacion){
            DNI = Identificacion;
        }
    
        public void nombre (String Trabajador){
            nombre = Trabajador;
        }
        
        public void fecha (String FechaIngreso){
            fecha = FechaIngreso;
        }
        
     
    
        public void PrintInfo(){
            String tmp =
                    "DNI: " + DNI + " ; " +
                    "Nombre: " + nombre + " ; " +
                    "Fecha de Ingreso: " + fecha + " ; " ;
                    
            System.out.println(tmp);
          
        }
    
        static public class FuncionarioAdministrativo extends Personal{
            private int Sueldo = 0;
            private double Porcentaje = 0;
            
            
            public void Sueldo (int Basico , double Adicional){
                Sueldo = Sueldo+Basico;
                Porcentaje = Porcentaje+Adicional;
            }
                  
            public int Sueldo(){
                return Sueldo;
            }
            
            public double Porcentaje(){
                return Porcentaje;
            }
             
            
            
            }
         
            static public class Docente extends Personal{
                private int AsignaturasDictadas=0;
                private int montoXasignatura=0;
                private int Sueldo=0;
                
                
                public void Sueldo (int casignaturas , int masignaturas , int SueldoFinal ) {
                SueldoFinal = (casignaturas * masignaturas);
                  
                AsignaturasDictadas=AsignaturasDictadas+casignaturas;
                montoXasignatura=montoXasignatura+masignaturas;
                Sueldo=Sueldo+SueldoFinal;
                }
           
                public int AsignaturasDictadas(){
                    return AsignaturasDictadas;
                }
            
                public int montoXasignatura(){
                    return montoXasignatura;
                } 
            
                public int Sueldo(){
                    return Sueldo;
                
                    
                }
                
                public void PrintInfoAsignaturas(){
                    String tmp = "Asignaturas Dictadas: " + AsignaturasDictadas + "Monto Por Asignatura: " + montoXasignatura + "Sueldo: " + Sueldo;
                    System.out.println(tmp);
                }

            private void AsignaturasDictadas(int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void montoXasignatura(int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            
            
            }
            
                
            
        
        }
        
        static public class SueldoAD{
            
        }
    
    
    
    }
  

