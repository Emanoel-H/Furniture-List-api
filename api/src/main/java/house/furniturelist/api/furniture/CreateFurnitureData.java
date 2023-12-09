package house.furniturelist.api.furniture;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateFurnitureData(
                                @NotBlank
                                String nome,
                                @NotBlank
                                String localCompra,
                                @NotNull
                                LocalCasa localCasa) {
}
