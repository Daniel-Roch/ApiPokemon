package br.com.infnet;

import br.com.infnet.model.Pokemon;
import br.com.infnet.util.PokemonApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonsTest.class);
    @Test
    @DisplayName("Retorna o id do pokemon, pelo nome")
    public void getIdPokemon(){
        LOGGER.info("Test create search pokemon name and return Id");
        try{
            PokemonApi pokeApi = new PokemonApi();
            Pokemon pokemon = pokeApi.GetByName("Ditto");
            LOGGER.debug("Search Pokemon using name");
            assertEquals(132, pokemon.getId());
        }catch(Exception e){
            LOGGER.error("Error in test" + e);
        }
    }
}
