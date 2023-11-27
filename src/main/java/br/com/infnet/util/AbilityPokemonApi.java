package br.com.infnet.util;

import br.com.infnet.model.Ability;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AbilityPokemonApi {
    public Ability GetAbility(String name){
        name = name.toLowerCase();
        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI("https://pokeapi.co/api/v2/ability/" + name + "/"))
                    .version(HttpClient.Version.HTTP_2)
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            Ability ability = objectMapper.readValue(response.body(), Ability.class);
            return ability;
        }catch(URISyntaxException | IOException | InterruptedException e){
            throw new AbilityNotFound("Ability Not Found!");
        }
    }
}
