package pokemon.battle;

public class Batalha {

    // Atributos
    private float vidaMeuPoke, vidaOutroPoke, atkMeuPoke, atkOutroPoke, defesaMeuPoke, defesaOutroPoke;
    private String resultado;

    // Constructor
    public Batalha(float vidaMeuPoke, float vidaOutroPoke, float atkMeuPoke, float atkOutroPoke, float defesaMeuPoke, float defesaOutroPoke) {
        this.vidaMeuPoke = vidaMeuPoke;
        this.vidaOutroPoke = vidaOutroPoke;
        this.atkMeuPoke = atkMeuPoke;
        this.atkOutroPoke = atkOutroPoke;
        this.defesaMeuPoke = defesaMeuPoke;
        this.defesaOutroPoke = defesaOutroPoke;
    }

    // Métodos
    public void combate() {
        float meupokemon = (vidaMeuPoke + defesaMeuPoke) - (atkOutroPoke);
        float outropokemon = (vidaOutroPoke + defesaOutroPoke) - (atkMeuPoke);
        if (meupokemon > outropokemon) {
            resultado = "Seu Pokemon venceu";
        } else if (meupokemon < outropokemon) {
            resultado = "Seu Pokemon perdeu";
        } else if (meupokemon == outropokemon) {
            resultado = "Houve um empate";
        }
        System.out.println("Combate acaba de começar !");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(resultado);
    }
}
