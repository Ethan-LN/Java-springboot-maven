package springbootmaven.springboot.components;

import java.util.List;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation
import lombok.NonNull;

@Data
public class Taco {
    @NonNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @NonNull
    @Size()
    private List<Ingredient> ingredients;
}