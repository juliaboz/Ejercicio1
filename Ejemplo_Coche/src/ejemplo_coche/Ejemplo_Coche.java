/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_coche;

/**
 *
 * @author salacomputocentro.ba
 */
public class Ejemplo_Coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    CocheConGPS coche = new CocheConGPS();
    coche.cambiarCoordenadas (0.01 , 0.02);
    coche.printInfo();
    
    coche.vender (" Julian Navarro ");
    coche.matricular(" BBC 422 ");
    coche.printInfo();
    
    Taxi miTaxi = new Taxi();
    miTaxi.vender("Pedro");
    miTaxi.matricular("DDD 111");
    miTaxi.recorrer(10);
          
    }
    static public class coche {
        
        private String propietario;
        private String matricula;
        private double cuentaKilometros;
        
        public void vender (String elPropietario){
            propietario = elPropietario;
        }
   
        public void matricular(String laMatricula){
            matricula = laMatricula;
        }
   
        public void recorrer (double kms){
            cuentaKilometros = cuentaKilometros + kms;
        }
    
        public void printInfo(){
            String tmp =
                "Propietario: " + propietario  + " ; " +
                "Matricula: "   + matricula + " ; " +
                "Kms recorridos" + cuentaKilometros + " ; " ;
            System.out.println(tmp);
        }
     
}

static public class CocheConGPS extends coche{
    private double latitud = 0;
    private double longitud = 0;
    
    public void cambiarCoordenadas (double deltaLatitud , double deltaLongitud){
    
    latitud = latitud+deltaLatitud;
    longitud = longitud+deltaLongitud;
}
    public double latitud (){
        return  latitud;
    }                                  
    
    public double longitud (){
        return longitud;
    }
    
    public void printInfoPosicion(){
        String tmp = " Latitud: " + latitud + "; Longitud: " + longitud;
        System.out.println(tmp);
    }
   

}

static public class Taxi extends coche{
    public void recorrer (double kms){
        System.out.println("Taxi: inicia carrera");
        printInfo();
        super.recorrer(kms);
        System.out.println("Taxi: fin de carrera");
        printInfo();
    }
}

public class FactoriaDeCoches{
    private int n = 0;
    
    
    public coche FabricarCocheuevo()
    {
     coche elcoche = null;
     if (n==0){
         elcoche = new coche();
     } else if (n==1){
         CocheConGPS cocheConGPS = new CocheConGPS();
         elcoche = cocheConGPS;
     } else {
         Taxi taxi = new Taxi();
         elcoche = taxi;
         
     } 
    n = (n+1) %3;
    return elcoche;
}

}
}