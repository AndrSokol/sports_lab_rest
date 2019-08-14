package com.sokol.sportlab.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "activity")
@Getter
@Setter
public class ActivitiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer activity_id;
    private String activity_name;

}
