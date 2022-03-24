package com.vs.riderregistration.model;

import com.vs.riderregistration.enums.BikeBrand;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Rider {
    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    @NotBlank
    @Size(max=12, min=2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private int raceNum;
    private BikeBrand bikeBrand;

}
