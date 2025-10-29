package com.projectleap.javaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.projectleap.javaproject.entity.Inventory;
import com.projectleap.javaproject.service.InventoryService;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping
    public List<Inventory> getAllInventory() {
        return service.getAllInventory();
    }

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inv) {
        return service.addInventory(inv);
    }

    @PutMapping("/{id}")
    public Inventory updateInventory(@PathVariable Long id, @RequestBody Inventory inv) {
        return service.updateInventory(id, inv);
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable Long id) {
        service.deleteInventory(id);
    }
}
