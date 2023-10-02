import java.util.Scanner;

public class Vista {
    Controlador controlador = new Controlador();
    Scanner scn = new Scanner(System.in);
    public void mostrarMenu() {
        while (true) {
            System.out.println("M E N Ú");
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Registrar nuevo espécimen \n2. Mostrar todos los especímenes catalogados \n3. Top 3 dinosaurios más grandes del museo \n4. Resumen de especímenes descubiertos por cada descubridor \n0. Para salir del programa");
            int opcion = scn.nextInt();
            switch (opcion) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("¿Qué desea registrar? 1. Dinosaurio 2. Planta 3. Mamífero");
                    int op = scn.nextInt();
                    scn = new Scanner(System.in);
                    switch (op){
                        case 1:
                        System.out.println("D I N O S A U R I O ");
                        System.out.print("Descubridor: ");
                        String descubridorDino = scn.nextLine();
                        System.out.print("Fecha del descubrimiento: ");
                        String fechaDino = scn.nextLine();
                        System.out.print("Era Geológica: ");
                        String eraGeologicaDino = scn.nextLine(); 
                        System.out.print("Ubicación del hallazgo: ");
                        String ubicacionHallazgoDino = scn.nextLine();
                        System.out.print("Tipo de dinosaurio: ");
                        String tipodeDinosaurio = scn.nextLine();
                        System.out.print("Tamaño del dinosaurio: ");
                        String tamaño = scn.nextLine();
                        System.out.print("Peso estimado: ");
                        String pesoEstimado = scn.nextLine();
                        controlador.agregarDinosaurio(descubridorDino, fechaDino, "Dinosaurio", eraGeologicaDino,
                        ubicacionHallazgoDino, tipodeDinosaurio, tamaño, pesoEstimado);
                        break;
                        case 2:
                        System.out.print("Descubridor: ");
                        String descubridorPlanta = scn.nextLine();
                        System.out.print("Fecha del descubrimiento: ");
                        String fechaPlanta = scn.nextLine();
                        System.out.print("Era Geológica: ");
                        String eraGeologicaPlanta = scn.nextLine(); 
                        System.out.print("Ubicación del hallazgo: ");
                        String ubicacionHallazgoPlanta = scn.nextLine();
                        System.out.print("Tipo de planta: ");
                        String tipodePlanta = scn.nextLine();
                        System.out.print("Periodo de existencia: ");
                        String periododeExistencia = scn.nextLine();
                        controlador.agregarPlanta(descubridorPlanta, fechaPlanta, "Planta", eraGeologicaPlanta,
                        ubicacionHallazgoPlanta, tipodePlanta, periododeExistencia);
                        break;
                        case 3:
                        System.out.print("Descubridor: ");
                        String descubridorMamifero = scn.nextLine();
                        System.out.print("Fecha del desubrimiento: ");
                        String fechaMamifero = scn.nextLine();
                        System.out.print("Era geológica: ");
                        String eraGeologicaMamifero = scn.nextLine(); 
                        System.out.print("Ubicación del hallazgo: ");
                        String ubicacionHallazgoMamifero = scn.nextLine();
                        System.out.print("Dieta: ");
                        String dieta = scn.nextLine();
                        System.out.print("Habitat: ");
                        String habitat = scn.nextLine();
                        controlador.agregarMamifero(descubridorMamifero, fechaMamifero, "Mamifero", eraGeologicaMamifero, 
                        ubicacionHallazgoMamifero, dieta, habitat);
                        break;
                    }
                    break;
                case 2:
                    controlador.mostrarEspecimenesCatalogados();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida 😊.");
                    break;
            }
        }
    }
}
