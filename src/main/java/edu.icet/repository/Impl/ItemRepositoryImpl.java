package edu.icet.repository.Impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Item> getItem() {
        String sql = "SELECT * FROM item";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Item(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5)

                ));
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
