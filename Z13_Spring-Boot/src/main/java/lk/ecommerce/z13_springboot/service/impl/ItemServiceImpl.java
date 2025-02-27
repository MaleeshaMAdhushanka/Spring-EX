package lk.ecommerce.z13_springboot.service.impl;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.entity.Item;
import lk.ecommerce.z13_springboot.repo.ItemRepo;
import lk.ecommerce.z13_springboot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    public void save(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getCode())) {
            throw new RuntimeException("Item already exists");
        }
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
//        Item item = new Item(itemDTO.getCode(), itemDTO.getName(), itemDTO.getQuantity(), itemDTO.getPrice());
//        itemRepo.save(item);
//        return true;
    }

    public List<ItemDTO> getAll() {
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>() {
        }.getType());
//        return itemRepo.findAll().stream()
//                .map(item -> new ItemDTO(item.getCode(), item.getName(), item.getQuantity(), item.getPrice()))
//                .collect(Collectors.toList());
    }

    public void update(ItemDTO itemDTO) {
        if (!itemRepo.existsById(itemDTO.getCode())) {
            throw new RuntimeException("Item does not exit");

        }
        itemRepo.save(modelMapper.map(itemDTO, Item.class));

//        if (itemRepo.existsById(itemDTO.getCode())){
//            Item item = new Item(itemDTO.getCode(), itemDTO.getName(), itemDTO.getQuantity(), itemDTO.getPrice());
//            itemRepo.save(item);
//            return true;
//
//        }else {
//            return false;
//        }

    }

    public void delete(int id) {
//        if (itemRepo.existsById(id)) {
//            itemRepo.deleteById(id);
//            return true;
//        }
//        return false;
//    }
        itemRepo.deleteById((id));

    }
}