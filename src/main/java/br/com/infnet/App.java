package br.com.infnet;

import br.com.infnet.model.Ability;
import br.com.infnet.model.Pokemon;
import br.com.infnet.util.AbilityPokemonApi;
import br.com.infnet.util.PokemonApi;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Bem-vindo(a) ao Pokedex");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o opção desejada: ");
        System.out.println("1 - Buscar Pokemon pelo nome");
        System.out.println("2 - Buscar Habilidade pelo nome");
        int optionUser = scanner.nextInt();
        switch(optionUser){
            case 1 : {
                System.out.print("Escreva o nome do pokemon: ");
                String namePokemon = scanner.next();
                PokemonApi pokemonApi = new PokemonApi();
                Pokemon pokemon = pokemonApi.GetByName(namePokemon);
                System.out.println(pokemon.getName());
                System.out.println("Id: " + pokemon.getId());
                System.out.println("Experiência Básica: " + pokemon.getBaseExperience());
                System.out.println("Altura: " + pokemon.getHeight());
            }
                break;
            case 2 : {
                System.out.print("Escreva o nome da habilidade: ");
                String nameAbility = scanner.next();
                AbilityPokemonApi abilityPokemonApi = new AbilityPokemonApi();
                Ability ability = abilityPokemonApi.GetAbility(nameAbility);
                System.out.println(ability.getName() + ":");
                System.out.println("Id: " + ability.getId());
                System.out.println("Série: " + ability.getIsMainSeries());
            }
                break;
            default:
                System.out.println("Opção não encontrada.");
        }
        System.out.println("Fim do código.");

    }
}
