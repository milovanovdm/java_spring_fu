package com.taco_cloud.taco.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;
import com.taco_cloud.taco.Ingredient;
import com.taco_cloud.taco.Ingredient.Type;;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
    
    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
        ingredientMap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
        ingredientMap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
        ingredientMap.put("CARN", new Ingredient("CARN", "Carnitas", Type.VEGGIES));
    }

    @Override
    public Ingredient convert(String id){
        return ingredientMap.get(id);
    }

}
