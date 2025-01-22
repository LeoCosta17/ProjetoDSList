package com.projetospring.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.projetospring.dslist.repositories.GameRepository;
import com.projetospring.dslist.dto.GameMinDTO;
import com.projetospring.dslist.entities.Game;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> listDto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
        return listDto;
    }
}
