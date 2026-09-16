/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamantenimientovehicular;

import java.util.Scanner;

/**
 * @author Ariadna Rodríguez 
 *  Proyecto final de clase de programación I Q3
 * 
 * ====== Presentamos lo que es un sistema de mantenimiento vehicular preventivo ======
 * Con este proyecto haremos uso de todo lo visto a lo largo del periodo, permitiendo al sistema evaluar el kilometraje 
 * de un vehiculo e identificar cuando necesita mantenimiento.
 * Nombre de la empresa para la que realizaremos el proyecto (ficticia):
 *      DRIVEENGINE 
 * 
 *  Tareas a realizar en el proyecto:

     * Tarea 1: Implementar el menú de gestión vehicular utilizando el ciclo do-while y la 
    estructura switch para navegar entre registro, consulta y evaluación de servicios. 
    
    * Tarea 2: Registrar los kilometrajes actuales del vehículo y del último servicio 
    efectuado capturando datos desde consola mediante variables numéricas 
    básicas. 
    
    * Tarea 3: Determinar la necesidad de cambios preventivos (aceite, filtros, frenos) 
    comparando el rango de kilometraje con una estructura condicional if-else. 
    
    * Tarea 4: Notificar si un servicio está atrasado aplicando un condicional if que 
    verifique si la diferencia de kilometraje excede el límite máximo recomendado para 
    la pieza.
 
    * Tarea 5: Registrar múltiples mantenimientos programados para el vehículo 
    procesando la cantidad de revisiones a ingresar a través de un ciclo contable for. 
    
    * Tarea 6: Consultar el catálogo de recomendaciones técnicas por tipo de vehículo 
    (Sedán, Camioneta, Motocicleta) empleando la sentencia condicional switch. 
    
    * Tarea 7: Calcular el costo estimado total del próximo mantenimiento requerido 
    mediante acumuladores numéricos dentro de un ciclo while. 
    
    * Tarea 8: Generar un diagnóstico general de salud del vehículo (Óptimo, 
    Precaución, Crítico) contabilizando las alertas de mantenimientos pendientes 
    mediante un ciclo for y selecciones anidadas if / else if. 
 *
 */
public class SistemaMantenimientoVehicular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner input = new Scanner (System.in); 
     
     // Tarea 1 - implementar el menu de opciones para el usuario =======================================================
        
        int opcionMenu = 0; 
          // Declaración de variables CASE1 y CASE2
         double kmActual = 0;
            double kmUltimoAceite = 0;
            double kmUltimoFiltros = 0;
            double kmUltimoFrenos = 0; 
            boolean datosRegistrados = false; 
            
            // Declaración de variables CASE3
            // Limite preventivo que se recomienda 
            double limiteAceite = 5000;
            double limiteFiltros = 10000;
            double limiteFrenos = 20000;
            
            //Declaración de variables CASE3 y CASE4
            // Limite máximo antes de considerar un servicio atrasado 
            double limiteMaxAceite = 6000;
            double limiteMaxFiltros = 12000;
            double limiteMaxFrenos = 22000;
            // Para poder calcular la diferencia de kilometraje desde la ultima vez que se lo realizo 
            double recorridoAceite = kmActual - kmUltimoAceite;
            double recorridoFiltros = kmActual - kmUltimoFiltros;
            double recorridoFrenos = kmActual - kmUltimoFrenos;
     
            
            // Para el menu se usara ciclo do - while 
            do {
            System.out.println("\n------------ DriveEngine ------------ "); // Nombre de la empresa (para darle realismo)
            System.out.println(" \n ===== MENU DE GESTION VEHICULAR ======"); // menu principal 
            
            System.out.println("Selecciona una opcion (1-4) para poder ayudarte:");
            System.out.println("1. Registrar kilometrajes.");
            System.out.println("2. Consultar kilometrajes");
            System.out.println("3. Evaluar si mi vehiculo necesita mantenimiento");
            System.out.println("4. Salir");
            
            opcionMenu = input.nextInt (); 
            
            // Estructura switch para que se muestre el desgloce de lo que el usuario eligio en el menu principal
            switch (opcionMenu) {
                // Tarea 2 - registro y consulta del kilometraje  ==========================================
                case 1:
                  System.out.println(" ===== Seccion de registro de kilometrajes =====");
                    System.out.println("Ingrese el kilometraje actual de su vehiculo: ");
                    kmActual = input.nextDouble ();
                    
                    System.out.println("Ingrese el kilometraje que tenia su vehiculo en el ultimo cambio de aceite que le realizo:");
                    kmUltimoAceite = input.nextDouble ();
                    
                    System.out.println("Ingrese el kilometraje que tenia su vehiculo en el ultimo cambio de filtros que le realizo:");
                    kmUltimoFiltros = input.nextDouble ();
                    
                    System.out.println("Ingrese el kilometraje que tenia su vehiculo en la ultima revision de frenos que le realizo: ");
                    kmUltimoFrenos = input.nextDouble ();
                    
                    datosRegistrados = true;
                    System.out.println("Los datos de su vehiculo fueron registrados de forma exitosa.");
                  break;  
                  
                case 2:
                  System.out.println(" \n ===== Seccion de consulta de kilometrajes ===== ");
                    if (datosRegistrados) {
                        System.out.println("Kilometraje actual de su vehiculo: " + kmActual + " km");
                        System.out.println("Ultimo cambio de aceite de su vehiculo: " + kmUltimoAceite + " km");
                        System.out.println("Ultimo cambio de filtros de su vehiculo: " + kmUltimoFiltros + " km");
                        System.out.println("Ultima revision de frenos de su vehiculo: " + kmUltimoFrenos + " km");
                    } else {
                        System.out.println("Atencion: Primero debe registrar los kilometrajes en la opcion 1 del menu principal !!!!");
                    }
                  break;
                  
                  /* Tarea 3 ==============================================================================================
                  Saber cuando se necesita mantenimiento, aqui se compararan con los kilometros recorridos por el usuario 
                  con la cantidad de kilometros en la que se recomienda ya hacer mantenimientos o cambios de aceite al vehiculo. 
                  Se indica si el estado es optimo 
                  Se indica si se recomienda o es necesario realizar un servicio de mantenimiento 
                  Se indicara una alerta en caso de que el servicio sea urgente 
                  */
                case 3:
                  System.out.println(" ===== Seccion de evaluacion de mantenimiento =====");
             
                  if (!datosRegistrados) {
                      System.out.println("Atencion: Primero debe registrar los kilometrajes en la opcion 1 del menu principal !!!!");
                  
                  } else { 

                        System.out.println("Kilometros recorridos desde el ultimo servicio que realizo:");
                        System.out.println("- Aceite: " + recorridoAceite + " km");
                        System.out.println("- Filtros: " + recorridoFiltros + " km");
                        System.out.println("- Frenos: " + recorridoFrenos + " km");
                        System.out.println("------------------------------------------------");
                      
                        //****************************************************************************************************************************
                        System.out.println(" === Estado del aceite === ");
                        System.out.println("A continuacion se evaluara el estado del aceite de el vehiculo y que tan urgente requiere un servicio de cambio.\n");
                        
                        if (recorridoAceite > limiteMaxAceite) {
                            System.out.println("ALERTA: El cambio de aceite esta ATRASADO por " 
                                    + (recorridoAceite - limiteMaxAceite) + " km excedidos sobre el limite maximo.");
                        } // Fin del if 
                        else if (recorridoAceite >= limiteAceite) {
                            System.out.println("RECOMENDACION: Se requiere realizar cambio preventivo de aceite.");
                        } else {
                            System.out.println("ESTADO OPTIMO: El servicio de aceite esta al dia.");
                        }    // Fin del else del else-if 
                      
                  }
                  //*************************************************************************************************************************************
                    System.out.println("\n === Estado de filtros === ");
                    if (recorridoFiltros > limiteMaxFiltros) {
                            System.out.println("ALERTA: El cambio de filtros esta ATRASADO por " 
                                    + (recorridoFiltros - limiteMaxFiltros) + " km excedidos sobre el limite maximo.");
                        } // Fin del if 
                    else if (recorridoFiltros >= limiteFiltros) {
                            System.out.println("RECOMENDACION: Se requiere realizar cambio preventivo a sus filtros.");
                        } else {
                            System.out.println("ESTADO OPTIMO: Los filtros estan en buen estado.");
                        } // Fin del else del else-if 
           
                  //****************************************************************************************************************************************  
                    System.out.println("\n === Estado del aceite de frenos ===");
                    if (recorridoFrenos > limiteMaxFrenos) {
                            System.out.println("ALERTA: La revision de frenos esta ATRASADA por " 
                                    + (recorridoFrenos - limiteMaxFrenos) + " km excedidos sobre el limite maximo.");     
                        } // Fin del if 
                    else if (recorridoAceite >= limiteAceite) {
                            System.out.println("RECOMENDACION: Se requiere realizar un cambio preventivo de aceite.");
                        } else {
                            System.out.println("ESTADO OPTIMO: El servicio de aceite esta al dia y en optimas condiciones.");
                        } // Fin del else de else-if 
                    
                  // ****************************************************************************************************************************************   
                  break;
                  
                  
                case 4:
                  System.out.println(" ===== Salida ===== ");
                  break;  
                  
                  default:
                    System.out.println("Opcion incorrecta. Por favor ingrese un numero entre 1 y 4, para ingresar a una de las opciones que le ofrecemos en nuestro menú.");
                    break;
                      
            } // fin del switch que encapsula la tarea 1, 2, 3 y 4, que permite al usuario ingresar a cada opción del menú general y seleccionar esas opciones.
            
        } while (opcionMenu != 4); // Se mantendra hasta que el usuario presione salir 
        
         
        
        
        
        
    } // Fin del main 
    
} // Fin de Class 
