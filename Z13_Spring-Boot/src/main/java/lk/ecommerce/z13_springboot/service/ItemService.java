package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
public interface ItemService {
    public void save(ItemDTO itemDTO);

    public List<ItemDTO> getAll();

    public void update(ItemDTO itemDTO);

    public void delete(int id);
}
