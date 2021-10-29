/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.USA.reto5.USA;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura
 */
@Repository
public class ClientRepository {
    
    @Autowired
    private ClientInterface crud;
    
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }
    
    public Optional <Client> getClient (int id){
        return crud.findById(id);
    }
    
    public Client save (Client client){
        return crud.save(client);
    }
    
    public void delete(Client client){
        crud.delete(client);
    }
}
