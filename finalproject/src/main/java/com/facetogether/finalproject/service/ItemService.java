package com.facetogether.finalproject.service;

import com.facetogether.finalproject.repository.entity.Item;
import org.springframework.stereotype.Service;
import com.facetogether.finalproject.repository.itemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private final itemRepository itemRepository;

    public ItemService(itemRepository item) {
        this.itemRepository = item;
    }
    public void delete(Integer id){
        this.itemRepository.deleteById(id);
    }
    public Item save(Item item){
        System.out.println(item);
        return this.itemRepository.save(item);
    }
    public List<Item> all(){
        return this.itemRepository.findAll();
    }
    public Optional<Item> findById(Integer itemId){
        return itemRepository.findById(itemId);
    }

}
