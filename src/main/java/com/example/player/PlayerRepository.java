// Write your code here
package com.example.player;
import java.util.*;

public interface PlayerRepository{
    ArrayList<Player>getPlayers();
    Player getPlayerbyId(int playerId);
}