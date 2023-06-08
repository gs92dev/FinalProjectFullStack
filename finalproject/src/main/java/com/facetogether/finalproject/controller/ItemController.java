package com.facetogether.finalproject.controller;

import com.facetogether.finalproject.controller.dto.ItemDto;
import com.facetogether.finalproject.repository.entity.Item;
import com.facetogether.finalproject.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
    final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/all")
    public List<Item> showall(){
        return itemService.all();
    }
    @GetMapping("/{id}")
    public Optional<Item> findbyId(@PathVariable Integer id){
        return itemService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        itemService.delete(id);
    }

    @PostMapping
    public Item save( @RequestBody ItemDto itemDto )
    {
        return itemService.save( new Item( itemDto ) );
    }
    @PutMapping( "/{id}" )
    public Item update(@RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService.findById( id ).orElseThrow();
        item.setName( itemDto.getName() );
        item.setDescription( itemDto.getDescription() );
        item.setImgUrl( itemDto.getImgUrl());
        item.setPrice(itemDto.getPrice());
        return itemService.save( item );
    }

}
