package dev.neko.nekorpg.states;

import java.awt.Graphics;

import dev.neko.nekorpg.Game;
import dev.neko.nekorpg.entities.creatures.Player;
import dev.neko.nekorpg.tiles.Tile;
import dev.neko.nekorpg.worlds.World;

public class GameState extends State{
	
	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
		world = new World("res/worlds/world1.txt");
	}
	
	public void tick() {
		world.tick();
		player.tick();
	}

	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}



}
