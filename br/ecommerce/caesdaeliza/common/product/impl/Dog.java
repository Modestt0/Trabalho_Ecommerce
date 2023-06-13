package br.ecommerce.caesdaeliza.common.product.impl;

import br.ecommerce.caesdaeliza.common.product.Pedigree;
import br.ecommerce.caesdaeliza.common.product.ProductBase;

public class Dog extends ProductBase {

    private String name;
    private int idMother;
    private int idFather;
    private int idOwner;
    private int numPedigree;
    private Pedigree pedigree;
    private int numMicrochip;

    public Dog(int id, String name, int idMother, int idFather, int idOwner, int numPedigree, int numMicrochip, String breed) {
        super(id);
        this.name = name;
        this.idMother = idMother;
        this.idFather = idFather;
        this.idOwner = idOwner;
        this.numPedigree = numPedigree;
        this.pedigree = new Pedigree(breed);
        this.numMicrochip = numMicrochip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdMother() {
        return idMother;
    }

    public int getIdFather() {
        return idFather;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getNumPedigree() {
        return numPedigree;
    }

    public int getNumMicrochip() {
        return numMicrochip;
    }

    public void setNumMicrochip(int numMicrochip) {
        this.numMicrochip = numMicrochip;
    }

    public Pedigree getPedigree() {
        return pedigree;
    }
}
