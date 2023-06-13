package br.ecommerce.caesdaeliza.common.actors.impl;

import br.ecommerce.caesdaeliza.common.actors.PersonBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends PersonBase {

    private final List<Integer> adoptions;
    private String address;
    private LocalDate dateOfBirth;

    public Client(int id) {
        super(id);
        this.adoptions = new ArrayList<>();
    }

    public Client(int id, String name) {
        super(id, name);
        this.adoptions = new ArrayList<>();
    }

    public Client(int id, String name, String address) {
        super(id, name);
        this.adoptions = new ArrayList<>();
        this.address = address;
    }

    public Client(int id, String name, String address, LocalDate dateOfBirth) {
        super(id, name);
        this.adoptions = new ArrayList<>();
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public void addAdoption(int id) {
        if (!this.hasAdoption(id)) {
            this.adoptions.add(id);
        }
    }

    public void removeAdoption(int id) {
        if (this.hasAdoption(id)) {
            this.adoptions.remove(id);
        }
    }

    public boolean hasAdoption(int id) {
        return this.adoptions.contains(id);
    }

    public boolean hasAdoptions() {
        return !this.adoptions.isEmpty();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
