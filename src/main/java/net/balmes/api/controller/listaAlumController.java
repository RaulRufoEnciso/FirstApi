package net.balmes.api.controller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.balmes.api.objects.Alumnos;


@RestController
public class listaAlumController {

	@GetMapping("listaAlum/{nlistaAlum}")
	public Alumnos getClient(@PathVariable int nlistaAlum) {
		List<Alumnos> listaAlumnos = new ArrayList<>();
        
		/*DAW 1 */      
        Alumnos Javi = new Alumnos("null", "null", LocalDate.of(200,06,18), "null", "null");
        Alumnos Raul = new Alumnos("Raul", "Rufo", LocalDate.of(2002, 06, 18), "24547458C", "rrufo@ejemlo.net");
        Alumnos Miguel = new Alumnos("Miguel", "Lopez", LocalDate.of(2003, 06, 18), "24547458X", "mlopez@ejemplo.net");
        Alumnos Felipe = new Alumnos("Felipe", "Garcia", LocalDate.of(2004, 06, 18), "24547458Z", "fgarcia@ejemlo.net");
        /*DAW 2 */
        Alumnos David = new Alumnos("David", "Lopez", LocalDate.of(2005, 06, 18), "24547458Ñ", "dlopez@ejemlo.net");
        Alumnos Matias = new Alumnos("Matias", "Rodriguez", LocalDate.of(2006, 06, 18), "24547458L", "mrodriguez@ejemlo.net");
        Alumnos Claudia = new Alumnos("Claudia", "Rodriguez", LocalDate.of(2007, 06, 18), "24547458K", "crodriguez@ejemplo.net");
        Alumnos Naiara = new Alumnos("Naiara", "Garcia", LocalDate.of(2008, 06, 18), "24547458J",  "ngarcia@ejemlo.net");
        /*DAM 1 */
        Alumnos Mireia = new Alumnos("Mireia", "Lopez", LocalDate.of(2009, 06, 18), "24547458H", "mlopez@ejemlo.net");
        Alumnos Laura = new Alumnos("Laura", "Ferrer", LocalDate.of(2010, 06, 18), "24547458G", "lferrer@ejemlo.net");
        Alumnos Entrique = new Alumnos("Entrique", "Sanchez", LocalDate.of(2011, 06, 18), "24547458F", "esanchez@ejemplo.net");
        Alumnos Pol = new Alumnos("Pol", "Mejia", LocalDate.of(2012, 06, 18), "24547458D",  "pmejia@ejemlo.net");
        /*DAM 2 */
        Alumnos Santi = new Alumnos("Santi", "Santos", LocalDate.of(2013, 06, 18), "24547458S", "ssantos@ejemlo.net");
        Alumnos Carla = new Alumnos("Carla", "Merida", LocalDate.of(2014, 06, 18), "24547458A", "carlamerida@ejemlo.net");
        Alumnos Sergi = new Alumnos("Sergi", "Castillo", LocalDate.of(2015, 06, 18), "24547458P", "scastillo@ejemplo.net");
        Alumnos Carlos = new Alumnos("Carlos", "Garcia", LocalDate.of(2016, 06, 18), "24547458O",  "cgarcia@ejemlo.net");
		/*ASIX 1 */
        Alumnos Daniel = new Alumnos("Daniel", "Garcia", LocalDate.of(2017, 06, 18), "24547458I", "dgarcia@ejemlo.net");
        Alumnos Cintia = new Alumnos("Cintia", "Iglesias", LocalDate.of(2018, 06, 18), "24547458U", "ciglesias@ejemlo.net");
        Alumnos Marta = new Alumnos("Marta", "Valhondo", LocalDate.of(2019, 06, 18), "24547458Y", "mvalhondo@ejemplo.net");
        Alumnos Marina = new Alumnos("Marina", "Garcia", LocalDate.of(2020, 06, 18), "24547458T",  "mgarcia@ejemlo.net");
        /*ASIX 2 */
        Alumnos Andrea = new Alumnos("Andrea", "Toledano", LocalDate.of(2021, 06, 18), "24547458R", "atoledano@ejemlo.net");
        Alumnos Edu = new Alumnos("Edu", "Creus", LocalDate.of(2022, 06, 18), "24547458E", "ecreus@ejemlo.net");
        Alumnos Xavi = new Alumnos("Xavi", "Lopez", LocalDate.of(2023, 06, 18), "24547458W", "xlopez@ejemplo.net");
        Alumnos Arnau = new Alumnos("Arnau", "Garcia", LocalDate.of(2024, 06, 18), "24547458Q",  "agarcia@ejemlo.net");
        
        /*DAW 1 */
        listaAlumnos.add(Javi);
        listaAlumnos.add(Raul);
        listaAlumnos.add(Miguel);
        listaAlumnos.add(Felipe);
        /*DAW 2 */
        listaAlumnos.add(David);
        listaAlumnos.add(Matias);
        listaAlumnos.add(Claudia);
        listaAlumnos.add(Naiara);
        /*DAM 1 */
        listaAlumnos.add(Mireia);
        listaAlumnos.add(Laura);
        listaAlumnos.add(Entrique);
        listaAlumnos.add(Pol);
        /*DAM 2 */
        listaAlumnos.add(Santi);
        listaAlumnos.add(Carla);
        listaAlumnos.add(Sergi);
        listaAlumnos.add(Carlos);
        /*ASIX 1 */
        listaAlumnos.add(Daniel);
        listaAlumnos.add(Cintia);
        listaAlumnos.add(Marta);
        listaAlumnos.add(Marina);
        /*ASIX 2 */
        listaAlumnos.add(Andrea);
        listaAlumnos.add(Edu);
        listaAlumnos.add(Xavi);
        listaAlumnos.add(Arnau);

		return listaAlumnos.get(nlistaAlum -1);
	}

	@GetMapping("listaAlum")
	public List<Alumnos> getAlumnos() {
		List<Alumnos> alumno = new ArrayList<>();
        /*DAW 1 */
        alumno.add(new Alumnos("Javi", "Miranda", LocalDate.of(2001, 06, 18), "24547458V", "jmirando@ejemlo.net"));
        alumno.add(new Alumnos("Raul", "Rufo", LocalDate.of(2002, 06, 18), "24547458C", "rrufo@ejemlo.net"));
        alumno.add(new Alumnos("Miguel", "Lopez", LocalDate.of(2003, 06, 18), "24547458X", "mlopez@ejemplo.net"));
        alumno.add(new Alumnos("Felipe", "Garcia", LocalDate.of(2004, 06, 18), "24547458Z", "fgarcia@ejemlo.net"));
        /*DAW 2 */
        alumno.add(new Alumnos("David", "Lopez", LocalDate.of(2005, 06, 18), "24547458Ñ", "dlopez@ejemlo.net"));
        alumno.add(new Alumnos("Matias", "Rodriguez", LocalDate.of(2006, 06, 18), "24547458L", "mrodriguez@ejemlo.net"));
        alumno.add(new Alumnos("Claudia", "Rodriguez", LocalDate.of(2007, 06, 18), "24547458K", "crodriguez@ejemplo.net"));
        alumno.add(new Alumnos("Naiara", "Garcia", LocalDate.of(2008, 06, 18), "24547458J",  "ngarcia@ejemlo.net"));
        /*DAM 1 */
        alumno.add(new Alumnos("Mireia", "Lopez", LocalDate.of(2009, 06, 18), "24547458H", "mlopez@ejemlo.net"));
        alumno.add(new Alumnos("Laura", "Ferrer", LocalDate.of(2010, 06, 18), "24547458G", "lferrer@ejemlo.net"));
        alumno.add(new Alumnos("Entrique", "Sanchez", LocalDate.of(2011, 06, 18), "24547458F", "esanchez@ejemplo.net"));
        alumno.add(new Alumnos("Pol", "Mejia", LocalDate.of(2012, 06, 18), "24547458D",  "pmejia@ejemlo.net"));
        /*DAM 2 */
        alumno.add(new Alumnos("Santi", "Santos", LocalDate.of(2013, 06, 18), "24547458S", "ssantos@ejemlo.net"));
        alumno.add(new Alumnos("Carla", "Merida", LocalDate.of(2014, 06, 18), "24547458A", "carlamerida@ejemlo.net"));
        alumno.add(new Alumnos("Sergi", "Castillo", LocalDate.of(2015, 06, 18), "24547458P", "scastillo@ejemplo.net"));
        alumno.add(new Alumnos("Carlos", "Garcia", LocalDate.of(2016, 06, 18), "24547458O",  "cgarcia@ejemlo.net"));
		/*ASIX 1 */
        alumno.add(new Alumnos("Daniel", "Garcia", LocalDate.of(2017, 06, 18), "24547458I", "dgarcia@ejemlo.net"));
        alumno.add(new Alumnos("Cintia", "Iglesias", LocalDate.of(2018, 06, 18), "24547458U", "ciglesias@ejemlo.net"));
        alumno.add(new Alumnos("Marta", "Valhondo", LocalDate.of(2019, 06, 18), "24547458Y", "mvalhondo@ejemplo.net"));
        alumno.add(new Alumnos("Marina", "Garcia", LocalDate.of(2020, 06, 18), "24547458T",  "mgarcia@ejemlo.net"));
        /*ASIX 2 */
        alumno.add(new Alumnos("Andrea", "Toledano", LocalDate.of(2021, 06, 18), "24547458R", "atoledano@ejemlo.net"));
        alumno.add(new Alumnos("Edu", "Creus", LocalDate.of(2022, 06, 18), "24547458E", "ecreus@ejemlo.net"));
        alumno.add(new Alumnos("Xavi", "Lopez", LocalDate.of(2023, 06, 18), "24547458W", "xlopez@ejemplo.net"));
        alumno.add(new Alumnos("Arnau", "Garcia", LocalDate.of(2024, 06, 18), "24547458Q",  "agarcia@ejemlo.net"));
        
		return alumno;
	}

}
