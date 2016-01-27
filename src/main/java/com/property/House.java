package com.property;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by D on 1/24/2016.
 */
@Entity // this tells JPA that this object can be persisted. Each object will be a new raw in the database table
@Table(name = "house") // the name of the table where the object will be persisted
public class House {
    @Id // tells JPA that this is a Primary key
    @GeneratedValue // tells JPA to autogenerate this field in the table
    @Column(name = "id")    // the name of the column where this field will be persisted
    @Getter
    @Setter
    private int id;

    @Column(name = "cluj_area") // the name of the column where this field will be persisted
    @Getter
    @Setter
    private int clujArea;

    @Column(name = "square_meters") // the name of the column where this field will be persisted
    @Getter
    @Setter
    private int squareMeters;

    @Column(name = "utilities") // the name of the column where this field will be persisted
    @Getter
    @Setter
    private int utilities;

    @Column(name = "front")
    @Getter
    @Setter
    private boolean front;

    @Column(name = "finishings") // the name of the column where this field will be persisted
    @Getter
    @Setter
    private int finishings;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", clujArea=" + clujArea +
                ", squareMeters=" + squareMeters +
                ", utilities=" + utilities +
                ", front=" + front +
                ", finishings=" + finishings +
                '}';
    }
}
