public class Mamifero extends Especimen{
    String dieta, habitat;

    public Mamifero(String dieta, String habitat) {
        this.dieta = dieta;
        this.habitat = habitat;
    }

    public Mamifero(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica,
            String ubicacionHallazgo, String dieta, String habitat) {
        super(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo);
        this.dieta = dieta;
        this.habitat = habitat;
    }


    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
