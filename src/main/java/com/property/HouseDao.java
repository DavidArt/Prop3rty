package com.property;

/**
 * Created by D on 1/24/2016.
 */
public interface HouseDao {
    void create(House house);
    void update(House house);
    House read(int houseId);
    void delete(House house);
}
