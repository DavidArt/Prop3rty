package com.property;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by D on 1/24/2016.
 */
@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "cluj_area")
    @Getter
    @Setter
    private int clujArea;

    @Column(name = "square_meters")
    @Getter
    @Setter
    private int squareMeters;

    @Column(name = "utilities")
    @Getter
    @Setter
    private int utilities;

    @Column(name = "front")
    @Getter
    @Setter
    private boolean front;

    @Column(name = "finishings")
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
