package br.com.infnet.model;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Pokemon {
    private int id;
    private List<Object> abilities;
    private List<Object> forms;
    private List<Object> game_indices;
    private List<Object> held_items;
    private List<Object> moves;
    private List<Object> past_abilities;
    private List<Object> past_types;
    private Object species;
    private Object sprites;
    private List<Object> stats;
    private List<Object> types;
    private String name;
    private int order;
    private int weight;
    private int height;
    private int base_experience;
    private String is_default;
    private String location_area_encounters;
}
