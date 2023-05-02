package com.programmingtechie.inventoryservie.controller;

import com.programmingtechie.inventoryservie.dto.InventoryResponse;
import com.programmingtechie.inventoryservie.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // http://locahost:8082//api/inventory?skuCode=iPhone13&skuCode=iPhone13-red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
