package com.example.reservationandlivraisonapi.entity.buyable;

import com.example.reservationandlivraisonapi.entity.acteurs.Restaurant;
import com.example.reservationandlivraisonapi.entity.acteurs.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("MENU")
public class Menu extends Buyable {

    @OneToMany(mappedBy = "menu")
    private Collection<MenuItem> menuItems;

    public Menu(Integer id, String name, float price, String image, Restaurant restaurant) {
        super(id, name, price, image, restaurant);
        this.menuItems = new ArrayList<>();
    }
}