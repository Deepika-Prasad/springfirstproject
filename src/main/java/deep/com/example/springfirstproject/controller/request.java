package deep.com.example.springfirstproject.controller;


import lombok.Data;

public class request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
