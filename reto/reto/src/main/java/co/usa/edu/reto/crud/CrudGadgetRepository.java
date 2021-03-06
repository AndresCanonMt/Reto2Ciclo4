/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.reto.crud;

import co.usa.edu.reto.model.Gadget;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Andre
 */
public interface CrudGadgetRepository extends MongoRepository<Gadget, Integer>{
    
    @Query("{id: ?0}")
    public Optional<Gadget> getById(Integer id);
    
}
