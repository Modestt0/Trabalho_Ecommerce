package br.ecommerce.caesdaeliza.common.veterinarian;

import java.util.ArrayList;
import java.util.List;

public class VaccinationCard {

    private int idDog;
    private List<String> vaccineName = new ArrayList<String>();

    public void addVaccine(String newVaccine){
        vaccineName.add(newVaccine);
    }

    public void removeVaccine(String nameOfVaccine){
        for (String vac : vaccineName) {
            if (vac != null && vac.equals(nameOfVaccine)) {
                vaccineName.remove(vac);
                break;
            }
        }

    }

    public int getIdDog() {
        return idDog;
    }

    public void setIdDog(int idDog) {
        this.idDog = idDog;
    }

    public List<String> getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(List<String> vaccineName) {
        this.vaccineName = vaccineName;
    }



}
