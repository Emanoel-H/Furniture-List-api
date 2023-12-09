package house.furniturelist.api.furniture;

import jakarta.validation.constraints.NotNull;

public record UpdateFurnitureData(
                                    @NotNull
                                    Long id,
                                  String nome,
                                  String localCompra) {
}
