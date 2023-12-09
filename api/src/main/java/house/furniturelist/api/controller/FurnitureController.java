package house.furniturelist.api.controller;

import house.furniturelist.api.furniture.CreateFurnitureData;
import house.furniturelist.api.furniture.FurnitureDataToList;
import house.furniturelist.api.furniture.Furnitures;
import house.furniturelist.api.furniture.UpdateFurnitureData;
import house.furniturelist.api.repository.FurnitureRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("furniture")
public class FurnitureController {

    @Autowired
    private FurnitureRepository repository;


    @PostMapping(path = "/create")
    @Transactional
    public void create(@RequestBody @Valid CreateFurnitureData data) {
        repository.save(new Furnitures(data));
    }

    @GetMapping(path = "/read")
    public Page<FurnitureDataToList> read (Pageable paginacao){
        return repository.findAll(paginacao).map(FurnitureDataToList::new);
    }

    @PutMapping(path = "/update")
    @Transactional
    public void update(@RequestBody @Valid UpdateFurnitureData data) {
        var furnitures = repository.getReferenceById(data.id());

        furnitures.updateInfo(data);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Transactional
    public void delete (@PathVariable Long id){
        repository.deleteById(id);
    }
}
