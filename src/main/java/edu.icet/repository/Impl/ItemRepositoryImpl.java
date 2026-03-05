package edu.icet.repository.Impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public List<Item> getItem() {
        return List.of();
    }

    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public boolean updateItem(Item item) {
        return false;
    }

    @Override
    public boolean deleteItem(String id) {
        return false;
    }

    @Override
    public Item searchById(String id) {
        return null;
    }
}
