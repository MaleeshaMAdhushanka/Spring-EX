package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.service.impl.ItemServiceImpl;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;


    @PostMapping(path = "save")
    public ResponseUtil saveItem(@RequestBody ItemDTO itemDTO){
        itemService.saveItem(itemDTO);
        return new ResponseUtil(201, "Item is saved", null);
    }

    @GetMapping("search/{id}")
    public ResponseUtil getItemById(@PathVariable String id){
        return new ResponseUtil(200, "Item is found", itemService.getItemById(id));
    }


    @PutMapping(path = "update")
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
        return  new ResponseUtil(200, "Item is updated Successfully", null);
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteItem(@PathVariable String id){
        itemService.deleteItem(id);
        return  new ResponseUtil(200, "Item is deleted Successfully", null);
    }
    @GetMapping("getAll")
    public ResponseUtil getAllItem(){
        return  new ResponseUtil(200, "Successfully fetched all items", itemService.getAllItems());
    }



}
