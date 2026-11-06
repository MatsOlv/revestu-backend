package com.br.revestu.reciclagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReciclagemService {

    @Autowired
    private ReciclagemRepository reciclagemRepository;

    public Reciclagem salvar (Reciclagem reciclagem) {
        return reciclagemRepository.save(reciclagem);}

    public List<Reciclagem> listaTodasReciclagtem () {return ReciclagemRepository.findAll();}

}
