package com.example.hotel.Person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public void createPersona(Person person) {
        personRepository.save(person);

    }

    public Person BuscarPersona(int id) {
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> ConsultarPersonas() {
        return personRepository.findAll();
    }

    public void EliminarPersona(int id) {
        personRepository.deleteById(id);
    }

    public Person ModificarPersona(Person person){

        personRepository.save(person);
        return person;
    }



}
