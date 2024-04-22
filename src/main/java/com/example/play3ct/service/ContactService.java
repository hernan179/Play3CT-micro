package com.example.play3ct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.play3ct.model.Person;
import com.example.play3ct.repository.ContactRepository;

@Service
public class ContactService {
    @Autowired
	ContactRepository contactRepository;

    public Person retrieve(Integer id){
        return contactRepository.findById(id).get();
    }

    public Person save(Person person){
        return contactRepository.save(person);
    }
}
