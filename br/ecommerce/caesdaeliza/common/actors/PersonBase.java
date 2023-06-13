package br.ecommerce.caesdaeliza.common.actors;

public abstract class PersonBase {

    private final int id;
    private String name;

    public PersonBase(int id) {
        this.id = id;
    }

    public PersonBase(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
