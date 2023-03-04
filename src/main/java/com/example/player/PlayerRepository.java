// Write your code here

package com.example.player;
import java.util.*;
import com.example.player.Player;


public interface PlayerRepository{
     ArrayList<Player> getPlayers();

     Player createPlayer(Player player);

     Player getPlayerById(int playerId);

     Player updatePlayer(int playerId,Player player);

     void deletePlayer(int playerId);
}
