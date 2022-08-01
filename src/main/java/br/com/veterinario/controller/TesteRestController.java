package br.com.veterinario.controller;

import br.com.veterinario.DTO.MensagemDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class TesteRestController {

    @GetMapping(value = "/testar")
    public void testarRest() {
        System.out.println("funcionou");
    }

    @GetMapping(value = "/testar/{id}")
    public void testarRest(@PathVariable Long id) {
        System.out.println(id);
    }

    @PostMapping(value="/testar")
    public void testarRestPost(@RequestBody MensagemDTO mensagem){
        System.out.println(mensagem.getMensagem());
    }
}
