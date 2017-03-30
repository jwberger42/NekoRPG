package dev.neko.nekorpg.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage RareBlobby_01, RareBlobby_02, RareBlobby_03, RareBlobby_04, RareBlobby_05,
								TDDO, RDDO, BDDO, LDDO, 
								TDDC, RDDC, BDDC, LDDC,
								TLC, TRC, BLC, BRC,
								BDW, TDW, RDW, LDW,
								DF
								;

	public static void init(){
		SpriteSheet RareBlobbyS = new SpriteSheet(ImageLoader.loadImage("/textures/RareDesertBlobby.png"));
		
		RareBlobby_01 = RareBlobbyS.crop(0, 0, width, height);
		RareBlobby_02 = RareBlobbyS.crop(32, 0, width, height);
		RareBlobby_03 = RareBlobbyS.crop(64, 0, width, height);
		RareBlobby_04 = RareBlobbyS.crop(96, 0, width, height);
		RareBlobby_05 = RareBlobbyS.crop(0, 32, width, height);
		
		SpriteSheet DesertPallet = new SpriteSheet(ImageLoader.loadImage("/textures/DesertPallet.png"));
		//OpenDoors
		TDDO = DesertPallet.crop(0, 0, width, height);
		RDDO = DesertPallet.crop(32, 0, width, height);
		BDDO = DesertPallet.crop(64, 0, width, height);
		LDDO = DesertPallet.crop(96, 0, width, height);
		//ClosedDoors
		TDDC = DesertPallet.crop(0, 32, width, height);
		RDDC = DesertPallet.crop(32, 32, width, height);
		BDDC = DesertPallet.crop(64, 32, width, height);
		LDDC = DesertPallet.crop(96, 32, width, height);
		//Corners
		TLC = DesertPallet.crop(0, 64, width, height);
		TRC = DesertPallet.crop(32, 64, width, height);
		BLC = DesertPallet.crop(64, 64, width, height);
		BRC = DesertPallet.crop(96, 64, width, height);
		//Walls
		BDW = DesertPallet.crop(0, 96, width, height);
		TDW = DesertPallet.crop(32, 96, width, height);
		RDW = DesertPallet.crop(64, 96, width, height);
		LDW = DesertPallet.crop(96, 96, width, height);
		//Floor
		DF = DesertPallet.crop(0, 128, width, height);
	}

}
