package pokemon.battle;

import java.util.Scanner;
import java.util.Random;

public class Pokemon {

    // Atributos
    private String nome, tipo;
    private float forca, defesa, level, vida;

    // Constructor
    public Pokemon(String nome, float level) {
        this.nome = nome;
        this.level = level;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public float getForca() {
        return forca;
    }

    public float getDefesa() {
        return defesa;
    }

    public float getLevel() {
        return level;
    }

    public float getVida() {
        return vida;
    }

    public String getTipo() {
        return tipo;
    }

    // Calcula atributos dos pokemons
    public void calculaAtributos() {
        switch (tipo) {
            // fogo
            case "fogo":
                forca = 60f + (0.7f * level);
                defesa = 35f + (0.3f * level);
                vida = 100f + (0.1f * level);
                break;

            // agua
            case "agua":
                forca = 50f + (0.4f * level);
                defesa = 50f + (0.5f * level);
                vida = 100f + (0.6f * level);
                break;

            // ar   
            case "ar":
                forca = 40f + (0.6f * level);
                defesa = 60f + (0.6f * level);
                vida = 100f + (0.6f * level);
                break;

            //terra    
            case "terra":
                forca = 35f + (0.5f * level);
                defesa = 80f + (0.8f * level);
                vida = 100f + (0.1f * level);
                break;

            //normal    
            case "normal":
                forca = 60f + (0.6f * level);
                defesa = 60f + (0.6f * level);
                vida = 100f + (0.6f * level);
                break;

            //choque    
            case "choque":
                forca = 75f + (0.7f * level);
                defesa = 25f + (0.4f * level);
                vida = 100f + (0.4f * level);
                break;

            //planta    
            case "planta":
                forca = 55f + (0.2f * level);
                defesa = 65f + (0.5f * level);
                vida = 100f + (0.7f * level);
                break;
        }
    }

    // imprime as informações do pokemon
    public void imprimePokemon() {
        System.out.println("");
        System.out.println("Nome: " + nome + " | "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + forca + " | "
                + "Defesa: " + defesa + " | ");
        System.out.println("");
    }

    public void tipo() {

        // escolha do tipo do pokemon
        Scanner scan = new Scanner(System.in);
        int escolha = 0;

        System.out.println("");
        System.out.println("Escolha o tipo do seu Pokemon");
        System.out.println("");

        while (escolha <= 0 || escolha >= 8) {
            System.out.println("Tipos de Pokemon:");
            System.out.println("1: Fogo");
            System.out.println("2: Água");
            System.out.println("3: Ar");
            System.out.println("4: Terra");
            System.out.println("5: Normal");
            System.out.println("6: Choque");
            System.out.println("7: Planta");
            System.out.println("");
            System.out.print("Escolha o tipo do seu Pokemon: ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    tipo = "fogo";
                    break;
                case 2:
                    tipo = "agua";
                    break;
                case 3:
                    tipo = "ar";
                    break;
                case 4:
                    tipo = "terra";
                    break;
                case 5:
                    tipo = "normal";
                    break;
                case 6:
                    tipo = "choque";
                    break;
                case 7:
                    tipo = "planta";
                    break;
                default:
                    tipo = "normal";
                    break;
            }
        }

    }

    public void tipoAdv() {

        // escolha do tipo do pokemon adversário
        Random random = new Random();
        int ran = 1 + random.nextInt(7);
        switch (ran) {
            case 1:
                tipo = "fogo";
                break;
            case 2:
                tipo = "agua";
                break;
            case 3:
                tipo = "ar";
                break;
            case 4:
                tipo = "terra";
                break;
            case 5:
                tipo = "normal";
                break;
            case 6:
                tipo = "choque";
                break;
            case 7:
                tipo = "planta";
                break;
            default:
                tipo = "normal";
                break;
        }
    }
}
