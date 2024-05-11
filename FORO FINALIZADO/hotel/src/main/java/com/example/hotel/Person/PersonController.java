package com.example.hotel.Person;


import com.example.hotel.Person.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
      private final PersonService personService;
    @PostMapping
        public void createPersona(@RequestBody Person person)
        {
            personService.createPersona(person);

        }

    @GetMapping("/{id}")
    public ResponseEntity<Person> BuscarPersona(@PathVariable int id) {
        return ResponseEntity.ok(personService.BuscarPersona(id));
    }

    @DeleteMapping("/{id}")
        public ResponseEntity<Void> EliminarPersona(@PathVariable int id) {
            personService.EliminarPersona(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> ConsultarPersonas() {
        List<Person> personas = personService.ConsultarPersonas();
        if (!personas.isEmpty()) {
            return ResponseEntity.ok(personas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("ModificarPersona")
    public ResponseEntity<Person> ModificarPersona(@RequestBody Person person) {
        Person PersonaModificada = personService.ModificarPersona(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);
    }



    }





