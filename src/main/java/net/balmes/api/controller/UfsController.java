package net.balmes.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import net.balmes.api.objects.Ufs;

@RestController
public class UfsController {
    @GetMapping("ufs/{nUf}")
    public Ufs getClient(@PathVariable int nUf) {
        List<Ufs> listaUf = new ArrayList<>();
        Ufs uf1 = new Ufs("M01", 100, 29);
        Ufs uf2 = new Ufs("M01", 50, 25);
        Ufs uf3 = new Ufs("M01", 25, 30);
        Ufs uf4 = new Ufs("M01", 12, 20);

        listaUf.add(uf1);
        listaUf.add(uf2);
        listaUf.add(uf3);
        listaUf.add(uf4);

        return listaUf.get(nUf - 1);
    }

    @GetMapping("ufs")
    public List<Ufs> getClients() {
        List<Ufs> uf = new ArrayList<>();
        uf.add(new Ufs("M01", 100, 29));
        uf.add(new Ufs("M01", 50, 25));
        uf.add(new Ufs("M01", 25, 30));
        uf.add(new Ufs("M01", 12, 20));
        return uf;
    }
}
