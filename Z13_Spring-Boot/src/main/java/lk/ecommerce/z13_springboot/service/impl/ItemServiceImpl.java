package lk.ecommerce.z13_springboot.service.impl;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.entity.Item;
import lk.ecommerce.z13_springboot.repository.ItemRepo;
import lk.ecommerce.z13_springboot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getItemCode())) {
            throw new RuntimeException("Item already exists");
        }
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public ItemDTO getItemById(String id) {
     Optional<Item> itemOptional = itemRepo.findById(id);
        if (itemOptional.isPresent()) {
            Item item = itemOptional.get();
            return new ItemDTO(
               item.getItemCode(),
               item.getDescription(),
               item.getQtyOnHand(),
                    item.getUnitPrice()
            );
        }
        return null;

    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getItemCode())) {
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
        } else {
            throw new RuntimeException("No such item for update...!");

        }
    }

    @Override
    public void deleteItem(String id) {
        if (itemRepo.existsById(id)) {
            itemRepo.deleteById(id);
        } else {
            throw new RuntimeException("No such item for delete...!");
        }
    }


    @Override
    public List<ItemDTO> getAllItems() {
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>() {}.getType());
    }
}
