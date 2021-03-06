package dev.neko.nekorpg.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//STATIC STUFF
	
	public static Tile[] tiles = new Tile[256];
	public static Tile floorTile = new FloorTile(0);
	public static Tile topWall = new TopWall(1);
	public static Tile bottomWall = new BottomWall(2);
	public static Tile leftWall = new LeftWall(3);
	public static Tile rightWall = new RightWall(4);
	public static Tile topLeftWall= new TopLeftWall(5);
	public static Tile topRightWall = new TopRightWall(6);
	public static Tile bottomLeftWall = new BottomLeftWall(7);
	public static Tile bottomRightWall = new BottomRightWall(8);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;

	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getId(){
		return id;
	}

}
