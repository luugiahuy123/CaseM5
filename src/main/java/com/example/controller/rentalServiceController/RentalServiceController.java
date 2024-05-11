package com.example.controller.rentalServiceController;

import com.example.model.rentalService.RentalAndService;
import com.example.service.rentalService.IAdditionalService;
import com.example.service.rentalService.IRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rental")
public class RentalServiceController  {
    @Autowired
    private IRentalService irentalService;
    @Autowired
    private IAdditionalService iAdditionalService;

    @GetMapping("")
    public String showListUser(@RequestParam(value = "page", defaultValue = "0") int page,
                               @RequestParam(value = "size", defaultValue = "5") int size,
                               Model model) {
        Page<RentalAndService> rentalServices = irentalService.getRental(page,size);
        model.addAttribute("rental", rentalServices);
        return "createRental";
    }

    @GetMapping("/createrental")
    public String showCreateUser(Model model) {
        model.addAttribute("rental", new RentalAndService());
        model.addAttribute("additional", iAdditionalService.getAll());
        return "/createrental";
    }
    @PostMapping("/createrental")
    public String createUser(@ModelAttribute("rental") RentalAndService rental , BindingResult bindingResult , Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("rental", irentalService.getAll());
            return "/createrental";
        }
        irentalService.saveRental(rental);
        return "redirect:/rental";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        irentalService.deleteUser(id);
        return "redirect:/rental";
    }
    @GetMapping("/edit/{id}")
    public String showEditUser(@PathVariable("id") Integer id , Model model){
        RentalAndService rentalAndService = irentalService.getRentalByID(id);
        model.addAttribute("rental" , rentalAndService);
        model.addAttribute("additional",iAdditionalService.getAll());
        return "/updateRental";
    }
    @PostMapping("/edit")
    public  String editUser(@ModelAttribute("rental") RentalAndService rentalAndService , BindingResult bindingResult , Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("additional" , iAdditionalService.getAll());
            model.addAttribute("rental" , rentalAndService);
        }
        irentalService.saveRental(rentalAndService);
        return "redirect:/rental";
    }
    @GetMapping("/detail/{id}")
    public String showUser(@PathVariable("id") Integer id , Model model){
        RentalAndService rentalAndService = irentalService.getRentalByID(id);
        model.addAttribute("rental",rentalAndService);
        return "/rental";
    }
    @GetMapping("/search")
    public String showSearch(@RequestParam("kq") String key, Model model,
                             @RequestParam(name = "page", defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page,5);
        Page<RentalAndService> rentalAndServices = irentalService.findByName(key,pageable);
        model.addAttribute("rentalPage", rentalAndServices);
        return "/rental";
    }}