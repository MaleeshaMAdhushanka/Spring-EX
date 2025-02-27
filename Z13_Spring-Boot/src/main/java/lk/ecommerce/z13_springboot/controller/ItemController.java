package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(path = "save")
    public ResponseUtil saveItem(@RequestBody ItemDTO  itemDTO){
//     boolean res = itemService.save(itemDTO);
//        System.out.println(itemDTO.getName());
//        return res;
        itemService.save(itemDTO);
        return new ResponseUtil(200, "Item is saved", null);
    }

    @GetMapping(path = "getAll")
    public ResponseUtil getAllItems(){
        return  new ResponseUtil(200, "GetAll Items", itemService.getAll());
    }

    @PutMapping(path = "update")
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
       itemService.update(itemDTO);
       return  new ResponseUtil(200, "Item Updated", null);
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteItem(@PathVariable int id){
       itemService.delete(id);
       return  new ResponseUtil(200, "Item deleted", null);
    }

}
