package br.com.infnet;

import br.com.infnet.model.Ability;
import br.com.infnet.util.AbilityNotFound;
import br.com.infnet.util.AbilityPokemonApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilityTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonsTest.class);
    @Test
    @DisplayName("Return Ability, using name")
    public void getAbility(){
        LOGGER.info("Test search ability names");
        assertThrows(AbilityNotFound.class, () ->{
            AbilityPokemonApi abilityPokemonApi = new AbilityPokemonApi();
            LOGGER.debug("Search Ability");
            Ability stench = abilityPokemonApi.GetAbility("stenchh");
            assertEquals(1, stench.getId());
        }, "Ability Not Found!");
    }
}
