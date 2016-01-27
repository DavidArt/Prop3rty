package com.property;

import java.util.List;

/**
 * Created by D on 1/24/2016.
 */
public interface HouseDao {
    void create(House house);
    void update(House house);
    List<House> find(int houseId);
    void delete(House house);
}
