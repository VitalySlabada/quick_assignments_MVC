package com.vs.riderregistration.controller;


import com.vs.riderregistration.bootstrap.DataGenerator;
import com.vs.riderregistration.enums.BikeBrand;
import com.vs.riderregistration.model.Rider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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


    @PostMapping ("/register-success")
    public String postRiderInfo (@Valid @ModelAttribute ("rider") Rider rider,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "/rider/rider-register";
        }

        DataGenerator.saveRider(rider);
        return "redirect:/rider/register";


    }
    @GetMapping ("/show-list")
    public String showList (Model model){
        model.addAttribute("riderList", DataGenerator.getRiderList());
        return "/rider/show-list";
    }




}
