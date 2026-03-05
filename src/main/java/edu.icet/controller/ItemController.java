package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/get-all-items")
    public List<Item> getItem(){
        return itemService.getItm();
    }
}
