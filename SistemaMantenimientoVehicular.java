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
    
     
     // Arreglo para el registro de kilometrajes 
     double [ ] km = new double [4];
     
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
            double recorridoAceite ;
            double recorridoFiltros ;
            double recorridoFrenos ;
            
     
            
            // Para el menu se usara ciclo do - while 
            do {
            System.out.println("\n------------ DriveEngine ------------ "); // Nombre de la empresa (para darle realismo)
            System.out.println(" \n ===== MENU DE GESTION VEHICULAR ======"); // menu principal 
            
            System.out.println("Selecciona una opcion (1-7) para poder ayudarte o seleccione la opcion 8 para salir:");
            System.out.println("1. Registrar kilometrajes.");
            System.out.println("2. Consultar kilometrajes.");
            System.out.println("3. Evaluar si mi vehiculo necesita mantenimiento.");
            System.out.println("4. Programar mantenimientos para su vehiculo.");
            System.out.println("5. Catalogo de recomendaciones.");
            System.out.println("6. Cotice sus costos de mantenimientos.");
            System.out.println("7. Diagnostico general del vehiculo.");
            System.out.println("8. Salir.");
            
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
                    
                    km[0] = kmActual;
                    km[1] = kmUltimoAceite;
                    km[2] = kmUltimoFiltros;
                    km[3] = kmUltimoFrenos;
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
                        recorridoAceite = kmActual - kmUltimoAceite;
                        recorridoFiltros = kmActual - kmUltimoFiltros;
                        recorridoFrenos = kmActual - kmUltimoFrenos;
                      
                        System.out.println("Kilometros recorridos desde el ultimo servicio que realizo:");
                        System.out.println("- Aceite: " + recorridoAceite + " km");
                        System.out.println("- Filtros: " + recorridoFiltros + " km");
                        System.out.println("- Frenos: " + recorridoFrenos + " km");
                        System.out.println("------------------------------------------------");
                      
                        //****************************************************************************************************************************
                        System.out.println("A continuacion se evaluara el estado del aceite de el vehiculo y que tan urgente requiere un servicio de cambio.\n");
                        System.out.println(" === Estado del aceite === ");
                    
                        
                        if (recorridoAceite > limiteMaxAceite) {
                            System.out.println("ALERTA: El cambio de aceite esta ATRASADO por " 
                                    + (recorridoAceite - limiteMaxAceite) + " km excedidos sobre el limite maximo.");
                        } // Fin del if 
                        else if (recorridoAceite >= limiteAceite) {
                            System.out.println("RECOMENDACION: Se requiere realizar cambio preventivo de aceite.");
                        } else {
                            System.out.println("ESTADO OPTIMO: El servicio de aceite esta al dia.");
                        }    // Fin del else del else-if 
                      
                  
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
                  } 
                            break;
                            
                  // ==================================================================================================
                   //  Tarea 5 = Para que el usuario sea capaz de registrar multiples mantenimientos y pudiendolos programar a futuro 
                 case 4:
                    System.out.println("\n === Seccion de Mantenimientos Programados ===");
                     System.out.println("\nContamos con con servicios de mantenimientos de:"
                             + " Llantas,"
                             + "Bujias,."
                             + "AireAcondicionado"
                             + "Carburador, "
                             + "Motor "
                             + "CambioDeAceite");
                    System.out.print(" Cuantos mantenimientos futuros desea programar?: ");
                    int cantidadMantenimientos = input.nextInt();

                    // Ciclo FOR: arranca en 1 y se repite hasta llegar a 'cantidadMantenimientos' que el usuario agrego que quería 
                    for (int i = 1; i <= cantidadMantenimientos; i++) {
                        System.out.println("\n--- Mantenimiento #" + i + " ---");

                        System.out.print("Ingrese el nombre del servicio: ");
                        String nombreServicio = input.next(); 

                        System.out.print("Ingrese el kilometraje en que le toca realizarlo: ");
                        double kmProgramado = input.nextDouble();

                        System.out.println("-> Registrado: Mantenimiento de " + nombreServicio + " programado a los " + kmProgramado + " km.");
                    } 

                    System.out.println("\nTodos los mantenimientos fueron registrados con exito!");
                    break;
                    
                   // ==============================================================================================================
                    // Tarea 6 = Aqui se le presenta un catalogo de recomendaciones según el vehiculo que tenga el usuario 
                 case 5:   
                    int tipoVehiculo = 0;
                   // Aqui estoy usando el do para mantener al usuario dentro de este submenú de recomendaciones si se equivoca o selecciona otro numero que no es de la opciones disponibles 
                       do {
                       System.out.println("\n===== Catalogo de Recomendaciones para su vehiculo =====");
                       System.out.println("Seleccione el tipo de su vehiculo:");
                       System.out.println("1. Turismo");
                       System.out.println("2. Camioneta / SUV");
                       System.out.println("3. Motocicleta");
                       System.out.print("Opcion: ");
                       tipoVehiculo = input.nextInt();

                       switch (tipoVehiculo) {
                           case 1:
                               System.out.println("\n ==== Recomendaciones para vehiculo turismo ====");
                               System.out.println("- Cambio de aceite de motor: Cada 5,000 km a 7,500 km.");
                               System.out.println("- Presion de llantas recomendada: 30 a 32 PSI.");
                               System.out.println("- Rotacion de llantas: Cada 10,000 km.");
                               break;

                           case 2:
                               System.out.println("\n==== Recomendaciones para vehiculo tipo Camioneta ====");
                               System.out.println("- Cambio de aceite de motor: Cada 7,000 km a 10,000 km.");
                               System.out.println("- Revision de suspension y amortiguadores: Cada 15,000 km.");
                               System.out.println("- Presion de llantas recomendada: 35 a 40 PSI.");
                               break;

                           case 3:
                               System.out.println("\n==== Recomendaciones para motocicleta ====");
                               System.out.println("- Cambio de aceite de motor: Cada 2,500 km a 3,000 km.");
                               System.out.println("- Lubricacion y tension de cadena: Cada 500 km.");
                               System.out.println("- Revision del sistema de frenos: Cada 4,000 km.");
                               break;

                           default:
                               System.out.println("\nNumero de opcion no valida. Por favor seleccione entre las opciones 1, 2 o 3.");
                               break;
                       }

                   // Si la opción no es 1, 2 ni 3, la condición se cumple y vuelve a repetir la pregunta para que el usuario no sea llevado hasta el menu principal otra vez 
                   } while (tipoVehiculo < 1 || tipoVehiculo > 3);

                   break;
                  
                    // =======================================================================================================
                   // Tarea 7 = aqui el usuario va a poder cotizar o calcular los costos estimados según el tipo o cantidad de mantenimientos que desee realizar 
                   case 6:
                    System.out.println("\n ===== Calculo de Costo Estimado de Mantenimiento =====");

                 System.out.println("\n ===== Tabla de precios de los servicios que ofrecemos en DriveEngine =====");
                 System.out.println("Servicios de mantenimiento disponibles:");
                 System.out.println("1. Cambio de Aceite y Filtro ----- Lps. 700.00");
                 System.out.println("2. Alineacion y Balanceo --------- Lps. 1,200.00");
                 System.out.println("3. Revision del Sistema de Frenos ---- Lps. 450.00");
                 System.out.println("4. Afinado Mayor del Motor ------- Lps. 2,300.00");
                 System.out.println("5. Finalizar cotizacion y ver total");

                 double costoTotal = 0;   // Esta funciona como acumulador donde se suma el precio de cada servicio que va eligiendo y agregando el usuario 
                 int opcionServicio = 0; // Esta es una variable de control para el ciclo while

                 // El ciclo while se repite agregando servicios hasta que el usuario digite 5 (siendo la opción 5 finalizar para ver su total)
                 while (opcionServicio != 5) {
                     System.out.print("\nSeleccione el numero de servicio a agregar (1-4) o 5 para calcular: ");
                     opcionServicio = input.nextInt();

                     if (opcionServicio == 1) {
                         costoTotal = costoTotal + 700.00;
                         System.out.println("-> [Agregado]: Cambio de Aceite y Filtro (Lps.700.00)");
                     } else if (opcionServicio == 2) {
                         costoTotal = costoTotal + 1200.00;
                         System.out.println("-> [Agregado]: Alineacion y Balanceo (Lps.1,200.00)");
                     } else if (opcionServicio == 3) {
                         costoTotal = costoTotal + 450.00;
                         System.out.println("-> [Agregado]: Revision del Sistema de Frenos (Lps.450.00)");
                     } else if (opcionServicio == 4) {
                         costoTotal = costoTotal + 2300.00;
                         System.out.println("-> [Agregado]: Afinado Mayor del Motor (Lps.2,300.00)");
                     } else if (opcionServicio == 5) {
                         System.out.println("-> Calculando total de servicios seleccionados...");
                     } else {
                         System.out.println("Opcion no valida. Por favor seleccione un numero entre 1 y 5.");
                     }
                 }

                 System.out.println("\n------------------------------------------------------------------------------------------");
                 System.out.println("El costo total estimado de sus servicios es de: Lps." + costoTotal);
                 System.out.println("---------------------------------------------------------------------------------------------");
                 break;
                 
                   // ========================================================================================================
                 // Tarea 8 = en esta sección el usuario podra generar un diagnostico general de su vehiculo, le va a indicar si esta en estado optimo, si debe tener precaución
                 // o si definitivamente se encuentra en un estado crítico y necesita un servicio de mantenimiento urgente. 
                 // Si el usuario tiene 0 servicios atrasados su vehiculo esta en un estado OPTIMO, si tiene 1 o 2 atrasados es motivo de PRECAUCIÓN
                 // pero si tiene más de 2 o 3 servicios atrasados ya se encuentra en un estado crítico. 
                 
                   case 7:
                       System.out.println("\n ===== Diagnostico general del vehiculo =====");

                    // Verificamos primero si ya se ingresaron los datos en la Opción 1 del menu general (donde tiene que registrar los kilometrajes del vehiculo)
                    if (!datosRegistrados) {
                        System.out.println("Atencion: Primero debe registrar los kilometrajes en la opcion 1 del menu principal !!!!");
                    } else {
                        int serviciosAtrasados = 0; // Contador de alertas criticas

                        // el ciclo for revisa los 3 servicios principales (1: Aceite, 2: Filtros, 3: Frenos)
                        for (int i = 1; i <= 3; i++) {
                            double recorrido = 0;
                            double limiteMaximo = 0;
                            String nombreServicio = "";

                            if (i == 1) {
                                recorrido = kmActual - kmUltimoAceite;
                                limiteMaximo = 6000; // Limite maximo de aceite
                                nombreServicio = "Cambio de Aceite";
                                
                            } else if (i == 2) {
                                recorrido = kmActual - kmUltimoFiltros;
                                limiteMaximo = 12000; // Limite maximo de filtros
                                nombreServicio = "Cambio de Filtros";
                            } else if (i == 3) {
                                recorrido = kmActual - kmUltimoFrenos;
                                limiteMaximo = 22000; // Limite maximo de frenos
                                nombreServicio = "Revision de Frenos";
                            }

                            // Si el recorrido supero el limite permitido, se va a sumar una alerta de servicio atrasado 
                            if (recorrido > limiteMaximo) {
                                serviciosAtrasados++;
                                System.out.println(" -> [REQUIERE ATENCION]: " + nombreServicio 
                            + " (Lleva " + recorrido + " km recorridos / Limite maximo: " + limiteMaximo + " km)");
                            }
                        }

                        System.out.println("Servicios con mantenimiento atrasado: " + serviciosAtrasados + " de 3");
                        System.out.print("ESTADO GENERAL DEL VEHICULO: ");

                        // las selecciones van a ser para clasificar el estado del vehiculo
                        if (serviciosAtrasados == 0) {
                            System.out.println(" -> [AL DIA]: Todos los servicios principales se encuentran dentro de los limites.");
                        }
                        System.out.println("\nServicios con mantenimiento atrasado: " + serviciosAtrasados + " de 3");
                        System.out.print("ESTADO GENERAL DEL VEHICULO: ");

                        if (serviciosAtrasados == 0) {
                            System.out.println("[OPTIMO] Su vehiculo se encuentra al dia con todos sus mantenimientos.");
                        } else if (serviciosAtrasados == 1) {
                            System.out.println("[PRECAUCION] Su vehiculo requiere atencion preventiva en uno o más servicio, maneje con cuidado.");
                        } else {
                            System.out.println("[CRITICO] Su vehiculo requiere revision mecanica e intervencion inmediata, tanto la seguridad de su persona como la de el vehiculo peligran.");
                        }
                    }
                    break;

                // ===============================================================================================================================
                   
                   case 8:
                  System.out.println(" ===== Salida ===== ");
                    System.out.println(" Gracias por usar el sistema DriveEngine, te esperamos pronto nuevamente, ten buen dia estimado !!!!!");
                  break;  
                  
                  default:
                    System.out.println("Opcion incorrecta. Por favor ingrese un numero entre 1 y 7, para ingresar a una de las opciones que le ofrecemos en nuestro menu.");
                    break;
                      
            } // fin del switch, que permite al usuario ingresar a cada opción del menú general y seleccionar esas opciones. 
            
        } while (opcionMenu != 9); // Se mantendra en el menu principal hasta que el usuario presione salir 
        
    } // Fin del main 
    
  
} // Fin de Class 