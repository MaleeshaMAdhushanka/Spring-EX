package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);

    ItemDTO getItemById(String id);

    void updateItem(ItemDTO itemDTO);

    void deleteItem(String id);

    List<ItemDTO> getAllItems();

}
