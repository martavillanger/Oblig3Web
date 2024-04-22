package com.example.oblig3web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketRepository rep;


    @PostMapping("/save")
    public void save(@RequestBody Ticket ticket){
        System.out.println("Save");
        System.out.println(ticket);
        rep.save(ticket);
    }

    @GetMapping("/getAll")
    public List<Ticket> getAll() {
        System.out.println("Get");
        return rep.getAll();
    }

    @GetMapping("/deleteAll")
    public void deleteAll(){
        System.out.println("Delete");
        rep.deleteAll();

    }
}
