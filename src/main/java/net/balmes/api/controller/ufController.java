package net.balmes.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.balmes.api.objects.ufs;

@RestController
public class ufController {
	
	@GetMapping("ufs/{nUf}")
	public ufs getClient(@PathVariable int nUf) {
		List<ufs> listaUf = new ArrayList<>();
		ufs uf1 = new ufs("M01", 100, 28);
        ufs uf2 = new ufs("M01", 50, 25);
        ufs uf3 = new ufs("M01", 25, 30);
        ufs uf4 = new ufs("M01", 12, 20);

        listaUf.add(uf1);
        listaUf.add(uf2);
        listaUf.add(uf3);
        listaUf.add(uf4);

		return listaUf.get(nUf -1);
	}

	@GetMapping("ufs")
	public List<ufs> getClients() {
		List<ufs> uf = new ArrayList<>();
		uf.add(new ufs("M01", 100, 29));
		uf.add(new ufs("M01", 50, 25));
		uf.add(new ufs("M01", 25, 30));
		uf.add(new ufs("M01", 12, 20));
		return uf;
	}
}

