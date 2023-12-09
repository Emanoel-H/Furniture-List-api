package house.furniturelist.api.furniture;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "furnitures")
@Entity(name = "Furnitures")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Furnitures {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localCompra;

    @Enumerated(EnumType.STRING)
    private LocalCasa localCasa;

    public Furnitures(CreateFurnitureData data) {
        this.nome = data.nome();
        this.localCompra = data.localCompra();
        this.localCasa = data.localCasa();
    }

    public void updateInfo(UpdateFurnitureData data) {
        if(data.nome() != null){
            this.nome = data.nome();
        }
        if (data.localCompra() != null){
            this.localCompra = data.localCompra();
        }
    }
}
