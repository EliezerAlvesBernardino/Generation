package triatleta;

public class TestaAtleta {
    public static void main(String[] args){

        Triatleta triatleta = new Triatleta("Kelvin");

        triatleta.aquecer();
        triatleta.correr();
        triatleta.nadar();
        triatleta.pedala();
        triatleta.cansou();
    }
}
