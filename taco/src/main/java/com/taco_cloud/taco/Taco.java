package com.taco_cloud.taco;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

    @NotNull
    @Size(min=5, message="Хотя бы 5 символов")
    private String name;

    @NotNull
    @Size(min=1)
    private List<Ingredient> ingredients;

}
