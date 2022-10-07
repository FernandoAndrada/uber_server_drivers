package br.com.senaisc.futurodev.uberserverdrivers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travels")
public class Travels {

    @GetMapping
    public String travels() {
        return "Rotas: ";
    }

}
