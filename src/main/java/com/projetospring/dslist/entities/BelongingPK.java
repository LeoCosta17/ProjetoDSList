package com.projetospring.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    public BelongingPK(){

    }

    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public Game getGame() {
        return game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }
}
