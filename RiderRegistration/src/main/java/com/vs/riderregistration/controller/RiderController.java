package com.vs.riderregistration.controller;


import com.vs.riderregistration.enums.BikeBrand;
import com.vs.riderregistration.model.Rider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/rider")
public class RiderController {

    @GetMapping("/register")
    public String getRiderRegistration(Model model) {

        model.addAttribute("rider",
                new Rider("Vasya",
                        "Pupkin",
                        LocalDate.of(2000, 1, 1),
                        007,
                        BikeBrand.KTM
                        ));

        return "/rider/rider-register";
    }


}
