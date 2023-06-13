package br.ecommerce.caesdaeliza.common.veterinarian;

public class Medication {

    private final int id;
    private final String name;
    private String type;
    private String posology;
    private String composition;

    public Medication(int id, String name, String type, String posology, String composition) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.posology = posology;
        this.composition = composition;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosology() {
        return posology;
    }

    public void setPosology(String posology) {
        this.posology = posology;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
