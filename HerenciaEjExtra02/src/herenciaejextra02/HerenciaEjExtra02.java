/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejextra02;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.PoliDeportivo;
import java.util.ArrayList;

/**
 *
 * @author jupac
 */
public class HerenciaEjExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int cantTechado=0;
        int cantAbierto=0;
        ArrayList<Edificio> listaEdificios=new ArrayList<>();
        
        PoliDeportivo poli1=new PoliDeportivo("Club sports", "techado", 20, 30, 15);
        PoliDeportivo poli2=new PoliDeportivo("Club sports de la esquina", "Abierto", 20, 20, 15);
        
        EdificioDeOficinas ed1=new EdificioDeOficinas(40, 30, 20);
        EdificioDeOficinas ed2=new EdificioDeOficinas(60, 50, 30);
        
        listaEdificios.add(ed2);
        listaEdificios.add(poli1);
        listaEdificios.add(poli2);
        listaEdificios.add(ed1);
        
        
        for (Edificio listaEdificio : listaEdificios) {
            
            
            if(listaEdificio instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) listaEdificio).cantPersonas();
            }else{
                if( ((PoliDeportivo)listaEdificio).getTipoInstalacion().equalsIgnoreCase("techado")   ){
                    cantTechado++;
                }
                
                else if( ((PoliDeportivo)listaEdificio).getTipoInstalacion().equalsIgnoreCase("abierto")  ){
                    cantAbierto++;
                }
                
            } 
            
            System.out.println("Superficie: "+listaEdificio.calcularSuperficie());
            System.out.println("Volumen: "+listaEdificio.calcularVolumen());
            listaEdificio.toString();
        }
        
        System.out.println("Cantidad de polideportivos techados: "+cantTechado);
        System.out.println("Cantidad de polideportivos abiertos: "+cantAbierto);
        
//        if(tipoInstalacion.equalsIgnoreCase("techado")){
//            cantTechado++;
//        }
//        else if(tipoInstalacion.equalsIgnoreCase("abierto")){
//            cantAbierto++;
//        }
        
        
    }
    
}
