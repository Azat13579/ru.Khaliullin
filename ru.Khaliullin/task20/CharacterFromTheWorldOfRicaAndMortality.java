package task20;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;

@JsonAutoDetect
public class CharacterFromTheWorldOfRicaAndMortality {
    int id;
    String name;
    String status;
    String species;
    String type;
    String gender;
    String origin;
    String location;
    String image;
    String episode;
    String  url;
    String created;

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
    @JsonIgnore
    public String getOrigin() {
        return origin;
    }
    @JsonIgnore
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    @JsonIgnore
    public String getLocation() {
        return location;
    }
    @JsonIgnore
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonIgnore
    public String getImage() {
        return image;
    }
    @JsonIgnore
    public void setImage(String image) {
        this.image = image;
    }
    @JsonIgnore
    public String getEpisode() {
        return episode;
    }
    @JsonIgnore
    public void setEpisode(String episode) {
        this.episode = episode;
    }
    @JsonIgnore
    public String getUrl() {
        return url;
    }
    @JsonIgnore
    public void setUrl(String url) {
        this.url = url;
    }
    @JsonIgnore
    public String getCreated() {
        return created;
    }
    @JsonIgnore
    public void setCreated(String created) {
        this.created = created;
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
                ", origin='" + origin + '\'' +
                ", location='" + location + '\'' +
                ", image='" + image + '\'' +
                ", episode='" + episode + '\'' +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
