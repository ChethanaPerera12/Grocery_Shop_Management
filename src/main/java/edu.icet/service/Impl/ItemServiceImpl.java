package edu.icet.service.Impl;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public boolean updateItem(String id) {
        return false;
    }

    @Override
    public boolean deleteItem(String id) {
        return false;
    }

    @Override
    public List<Item> getItm() {
        return List.of();
    }
}
