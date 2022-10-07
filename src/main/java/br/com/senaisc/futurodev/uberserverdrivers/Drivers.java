package br.com.senaisc.futurodev.uberserverdrivers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivers")
public class Drivers {

    @GetMapping
    public String drivers(){
        return "recurso de motoristas";
    }
}
