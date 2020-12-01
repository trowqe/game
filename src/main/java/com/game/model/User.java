package com.game.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String login;

    String password;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usersThatPlayedGame")
    private List<Game> games;

    String apiToken;

    public User() {
    }

    public User(String login, String password, List<Game> games, String apiToken) {
        this.login = login;
        this.password = password;
        this.apiToken = apiToken;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getApiToken() {
        return apiToken;
    }
}
