package com.vs.riderregistration.model;

import com.vs.riderregistration.enums.BikeBrand;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Rider {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int raceNum;
    private BikeBrand bikeBrand;

}
