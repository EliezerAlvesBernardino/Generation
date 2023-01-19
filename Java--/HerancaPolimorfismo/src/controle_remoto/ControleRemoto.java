package controle_remoto;

public class ControleRemoto {
    public static void main(String[] args){
        Aviao aviao = new Aviao();
        Automovel automovel = new Automovel();
        Barco barco = new Barco();

        System.out.println("Sobrescrita de métodos\n");
        System.out.println("Avião Mover");
        aviao.mover();

        System.out.println("\nAutomóvel mover");
        automovel.mover();

        System.out.println("\nBarco mover");
        barco.mover();
    }
}
