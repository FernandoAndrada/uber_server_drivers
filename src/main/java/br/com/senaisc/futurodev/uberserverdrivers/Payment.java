package br.com.senaisc.futurodev.uberserverdrivers;

// MVC - Model View Controller
// Model = Entidades --> Classes base
// DAO(REpository) --> Conexão com o Banco de Dados
// Service --> Regra de negócio

// Controller --> Endpoints

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class Payment {

    @PostMapping("/list-all-payment")
    public String payment() {
        return "ola mundo";
    }

    @GetMapping
    public String payments() {
        return payment();
    }
}