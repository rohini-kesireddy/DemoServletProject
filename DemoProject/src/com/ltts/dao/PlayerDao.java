package com.ltts.dao;

import java.util.List;

import com.ltts.model.Player;
          
public class PlayerDao {
	public List<Player> getAllPlayers(){
		List<player> li = new ArrayList<Player>();
		return li;
	

}
public Player getPlayerById(int id) {
	Player p = new Player();
	return p;
	
}

public boolean insertPlayer(Player p) {
	return true;
}
public boolean updatePlayer(Player p) {
	return true;
	
}
}