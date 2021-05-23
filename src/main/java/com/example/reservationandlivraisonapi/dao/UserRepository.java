package com.example.reservationandlivraisonapi.dao;

import com.example.reservationandlivraisonapi.entity.acteurs.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //diagrame de navigation

    @Query("SELECT l from Livreur l")
    Collection<Livreur> findAllLivreurs();

    @Query("SELECT c from Client c")
    Collection<Client> findAllClients();

    @Query("SELECT d from Directeur d")
    Collection<Directeur> findAllDirecteurs();

    @Query("SELECT a from Administrateur a")
    Collection<Administrateur> findAllAdministrateurs();

    @Query("SELECT r from Restaurant r")
    Collection<Restaurant> findAllRestaurants();

}
