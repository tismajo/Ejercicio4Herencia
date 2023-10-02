import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List <String> especimenes = new ArrayList<>();
    private List <Dinosaurio> dinosaurios = new ArrayList<>();
    private List <Planta> plantas = new ArrayList<>();
    private List <Mamifero> mamiferos = new ArrayList<>();

    public void agregarDinosaurio(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica, 
    String ubicacionHallazgo, String tipodeDinosaurio, String tamaño, String pesoEstimado){
        Dinosaurio dino = new Dinosaurio(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo, tipodeDinosaurio, tamaño, pesoEstimado);
        dinosaurios.add(dino);
    }

    public void agregarPlanta(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica, 
    String ubicacionHallazgo, String tipodePlanta, String periododeExistencia){
        Planta planta = new Planta(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo, tipodePlanta, periododeExistencia);
        plantas.add(planta);
    }

    public void agregarMamifero(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica, 
    String ubicacionHallazgo, String dieta, String habitat){
        Mamifero mamifero = new Mamifero(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo, dieta, habitat);
        mamiferos.add(mamifero);
    }
}
