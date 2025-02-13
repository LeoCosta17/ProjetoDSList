package com.projetospring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetospring.dslist.dto.GameListDTO;
import com.projetospring.dslist.entities.GameList;
import com.projetospring.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
