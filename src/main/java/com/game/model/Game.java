package com.game.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    LocalDateTime startTime;

    LocalDateTime duration;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> usersThatPlayedGame;

    protected Game() {
    }

    public Game(LocalDateTime startTim, LocalDateTime duration) {
        this.startTime = startTim;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getDuration() {
        return duration;
    }
}
