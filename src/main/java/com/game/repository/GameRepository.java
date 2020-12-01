package com.game.repository;

import java.util.List;

import com.game.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    List<Game> findById(String id);
}
