package com.example.oblig3web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;

    public void save(Ticket ticket){
        String sql = "insert into Ticket (innFilm, innAmount, innFName, innLName, innPhone, innEmail) values(?,?,?,?,?,?)";
        db.update(sql, ticket.getinnFilm(), ticket.getinnAmount(), ticket.getinnFName(), ticket.getinnLName(), ticket.getinnPhone(), ticket.getinnEmail());
    }
    public List<Ticket> getAll(){
        String sql = "select * from Ticket";
        List<Ticket> allTickets = db.query(sql, new BeanPropertyRowMapper(Ticket.class));
        return allTickets;
    }
    public void deleteAll(){
        String sql = "delete from Ticket";
        db.update(sql);
    }
}
