package com.projectleap.javaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectleap.javaproject.entity.Inventory;
import com.projectleap.javaproject.repository.InventoryRepository;
import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory addInventory(Inventory inv) {
        return inventoryRepository.save(inv);
    }

    public Inventory updateInventory(Long id, Inventory inv) {
        Inventory existing = inventoryRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setItemName(inv.getItemName());
            existing.setQuantity(inv.getQuantity());
            existing.setLocation(inv.getLocation());
            return inventoryRepository.save(existing);
        }
        return null;
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}
