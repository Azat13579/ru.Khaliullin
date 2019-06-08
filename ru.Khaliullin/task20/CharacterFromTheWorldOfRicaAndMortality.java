package task20;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterFromTheWorldOfRicaAndMortality {
    int id;
    String name;
    String status;
    String species;
    String type;
    String gender;
    String  url;


    public CharacterFromTheWorldOfRicaAndMortality() {

    }

    public CharacterFromTheWorldOfRicaAndMortality(int id, String nsme, String status,
                                                   String species, String type, String gender) {
        this.id = id;
        this.name = nsme;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "CharacterFromTheWorldOfRicaAndMortality{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
