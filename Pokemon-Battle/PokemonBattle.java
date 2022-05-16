package pokemon.battle;

import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int lvl, escolha = 0;
        String nome;

        // nome do pokemon
        System.out.print("Digite o nome do seu pokemon: ");
        nome = scan.nextLine();

        // lvl do pokemon
        System.out.print("Digite o level do seu pokemon: ");
        lvl = scan.nextInt();

        // Spawn pokemon
        Pokemon meuPokemon = new Pokemon(nome, lvl);
        meuPokemon.tipo();
        meuPokemon.calculaAtributos();

        // Spawn adversário
        int ranLevel = 1 + random.nextInt(lvl + 2);
        Pokemon outroPokemon = new Pokemon("Adversário", ranLevel);
        outroPokemon.tipoAdv();
        outroPokemon.calculaAtributos();

        // Batalha
        meuPokemon.imprimePokemon();
        System.out.println("---------vs--------");
        outroPokemon.imprimePokemon();

        Batalha pvp = new Batalha(meuPokemon.getVida(), outroPokemon.getVida(), meuPokemon.getForca(), outroPokemon.getForca(), meuPokemon.getDefesa(), outroPokemon.getDefesa());
        pvp.combate();
    }
}
