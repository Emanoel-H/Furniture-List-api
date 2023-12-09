package house.furniturelist.api.furniture;

public record FurnitureDataToList(Long id, String nome, String localCompra, LocalCasa localCasa) {
    public FurnitureDataToList(Furnitures furnitures){
        this(furnitures.getId(), furnitures.getNome(),
                furnitures.getLocalCompra(),
                furnitures.getLocalCasa());
    }
}
