package com.kakarotvg.omega.handlers.tools;

import com.kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import com.kakarotvg.omega.tools.Vgaxe;
import com.kakarotvg.omega.tools.Vghoe;
import com.kakarotvg.omega.tools.Vgpickaxe;
import com.kakarotvg.omega.tools.Vgshovel;
import com.kakarotvg.omega.tools.Vgsword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolHandler {

	// urotark
	public static Item urotarkaxe;
	public static Item urotarkhoe;
	public static Item urotarkshovel;
	public static Item urotarksword;
	public static Item urotarkpickaxe;
	// pearl
	public static Item pearlaxe;
	public static Item pearlhoe;
	public static Item pearlshovel;
	public static Item pearlsword;
	public static Item pearlpickaxe;
	// sapphire
	public static Item sapphireaxe;
	public static Item sapphirehoe;
	public static Item sapphireshovel;
	public static Item sapphiresword;
	public static Item sapphirepickaxe;
	// muscovite
	public static Item muscoviteaxe;
	public static Item muscovitehoe;
	public static Item muscoviteshovel;
	public static Item muscovitesword;
	public static Item muscovitepickaxe;
	// ruby
	public static Item rubyaxe;
	public static Item rubyhoe;
	public static Item rubyshovel;
	public static Item rubysword;
	public static Item rubypickaxe;
	// uriotyke
	public static Item uriotykeaxe;
	public static Item uriotykehoe;
	public static Item uriotykeshovel;
	public static Item uriotykesword;
	public static Item uriotykepickaxe;
	// gilder
	public static Item gilderaxe;
	public static Item gilderhoe;
	public static Item gildershovel;
	public static Item gildersword;
	public static Item gilderpickaxe;
	// selovar
	public static Item selovaraxe;
	public static Item selovarhoe;
	public static Item selovarshovel;
	public static Item selovarsword;
	public static Item selovarpickaxe;
	// parfilian
	public static Item parfilianaxe;
	public static Item parfilianhoe;
	public static Item parfilianshovel;
	public static Item parfiliansword;
	public static Item parfilianpickaxe;
	// barium
	public static Item bariumaxe;
	public static Item bariumhoe;
	public static Item bariumshovel;
	public static Item bariumsword;
	public static Item bariumpickaxe;
	// radium
	public static Item radiumaxe;
	public static Item radiumhoe;
	public static Item radiumshovel;
	public static Item radiumsword;
	public static Item radiumpickaxe;
	// gallum
	public static Item gallumaxe;
	public static Item gallumhoe;
	public static Item gallumshovel;
	public static Item gallumsword;
	public static Item gallumpickaxe;
	// vanadium
	public static Item vanadiumaxe;
	public static Item vanadiumhoe;
	public static Item vanadiumshovel;
	public static Item vanadiumsword;
	public static Item vanadiumpickaxe;
	// scandium
	public static Item scandiumaxe;
	public static Item scandiumhoe;
	public static Item scandiumshovel;
	public static Item scandiumsword;
	public static Item scandiumpickaxe;
	// bismuth
	public static Item bismuthaxe;
	public static Item bismuthhoe;
	public static Item bismuthshovel;
	public static Item bismuthsword;
	public static Item bismuthpickaxe;
	// indium
	public static Item indiumaxe;
	public static Item indiumhoe;
	public static Item indiumshovel;
	public static Item indiumsword;
	public static Item indiumpickaxe;
	// platinum
	public static Item platinumaxe;
	public static Item platinumhoe;
	public static Item platinumshovel;
	public static Item platinumsword;
	public static Item platinumpickaxe;
	// darkness
	public static Item darknessaxe;
	public static Item darknesshoe;
	public static Item darknessshovel;
	public static Item darknesssword;
	public static Item darknesspickaxe;
	// light
	public static Item lightaxe;
	public static Item lighthoe;
	public static Item lightshovel;
	public static Item lightsword;
	public static Item lightpickaxe;
	// omega
	public static Item omegaaxe;
	public static Item omegahoe;
	public static Item omegashovel;
	public static Item omegasword;
	public static Item omegahand;
	public static Item omegapickaxe;
	// Berionvar
	public static Item berionvaraxe;
	public static Item berionvarhoe;
	public static Item berionvarshovel;
	public static Item berionvarsword;
	public static Item berionvarpickaxe;
	// Charviole
	public static Item charvioleaxe;
	public static Item charviolehoe;
	public static Item charvioleshovel;
	public static Item charviolesword;
	public static Item charviolepickaxe;
	// Firlvear
	public static Item firlvearaxe;
	public static Item firlvearhoe;
	public static Item firlvearshovel;
	public static Item firlvearsword;
	public static Item firlvearpickaxe;
	// selmenrer
	public static Item selmenreraxe;
	public static Item selmenrerhoe;
	public static Item selmenrershovel;
	public static Item selmenrersword;
	public static Item selmenrerpickaxe;
	// verilion
	public static Item verilionaxe;
	public static Item verilionhoe;
	public static Item verilionshovel;
	public static Item verilionsword;
	public static Item verilionpickaxe;
	// vielvor
	public static Item vielvoraxe;
	public static Item vielvorhoe;
	public static Item vielvorshovel;
	public static Item vielvorsword;
	public static Item vielvorpickaxe;
	// invisible
	public static Item invisibledagger;

	// urotark
	public static ToolMaterial UROTARKTOOLS = EnumHelper.addToolMaterial("UROTARK TOOLS", 4, 2000, 12, 8, 10);
	public static ToolMaterial UROTARKSWORD = EnumHelper.addToolMaterial("UROTARKSWORD", 4, 2000, 12, 10, 10);
	// pearl
	public static ToolMaterial PEARLTOOLS = EnumHelper.addToolMaterial("PEARL TOOLS", 4, 2100, 13, 10, 10);
	public static ToolMaterial PEARLSWORD = EnumHelper.addToolMaterial("PEARLSWORD", 4, 2100, 13, 12, 10);
	// sapphire
	public static ToolMaterial SAPPHIRETOOLS = EnumHelper.addToolMaterial("SAPPHIRE TOOLS", 4, 2200, 14, 12, 10);
	public static ToolMaterial SAPPHIRESWORD = EnumHelper.addToolMaterial("SAPPHIRESWORD", 4, 2200, 14, 14, 10);
	// muscovite
	public static ToolMaterial MUSCOVITETOOLS = EnumHelper.addToolMaterial("MUSCOVITE TOOLS", 5, 2300, 15, 14, 10);
	public static ToolMaterial MUSCOVITESWORD = EnumHelper.addToolMaterial("MUSCOVITESWORD", 5, 2300, 15, 16, 10);
	// ruby
	public static ToolMaterial RUBYTOOLS = EnumHelper.addToolMaterial("RUBY TOOLS", 5, 2400, 16, 16, 10);
	public static ToolMaterial RUBYSWORD = EnumHelper.addToolMaterial("RUBYSWORD", 5, 2400, 16, 18, 10);
	// uriotyke
	public static ToolMaterial URIOTYKETOOLS = EnumHelper.addToolMaterial("URIOTYKE TOOLS", 5, 2500, 17, 18, 10);
	public static ToolMaterial URIOTYKESWORD = EnumHelper.addToolMaterial("URIOTYKESWORD", 5, 2500, 17, 20, 10);
	// gilder
	public static ToolMaterial GILDERTOOLS = EnumHelper.addToolMaterial("GILDER TOOLS", 6, 2600, 18, 20, 10);
	public static ToolMaterial GILDERSWORD = EnumHelper.addToolMaterial("GILDERSWORD", 6, 2600, 18, 22, 10);
	// selovar
	public static ToolMaterial SELOVARTOOLS = EnumHelper.addToolMaterial("SELOVAR TOOLS", 6, 2700, 18, 22, 10);
	public static ToolMaterial SELOVARSWORD = EnumHelper.addToolMaterial("SELOVARSWORD", 6, 2700, 18, 24, 10);
	// parfilian
	public static ToolMaterial PARFILIANTOOLS = EnumHelper.addToolMaterial("PARFILIAN TOOLS", 6, 2800, 18, 24, 10);
	public static ToolMaterial PARFILIANSWORD = EnumHelper.addToolMaterial("PARFILIANSWORD", 6, 2800, 18, 26, 10);
	// barium
	public static ToolMaterial BARIUMTOOLS = EnumHelper.addToolMaterial("BARIUM TOOLS", 7, 2900, 19, 26, 10);
	public static ToolMaterial BARIUMSWORD = EnumHelper.addToolMaterial("BARIUMSWORD", 7, 2900, 19, 28, 10);
	// radium
	public static ToolMaterial RADIUMTOOLS = EnumHelper.addToolMaterial("RADIUM TOOLS", 7, 3000, 20, 28, 10);
	public static ToolMaterial RADIUMSWORD = EnumHelper.addToolMaterial("RADIUMSWORD", 7, 3000, 20, 30, 10);
	// gallum
	public static ToolMaterial GALLUMTOOLS = EnumHelper.addToolMaterial("GALLUM TOOLS", 7, 3100, 21, 30, 10);
	public static ToolMaterial GALLUMSWORD = EnumHelper.addToolMaterial("GALLUMSWORD", 7, 3100, 21, 32, 10);
	// vanadium
	public static ToolMaterial VANADIUMTOOLS = EnumHelper.addToolMaterial("VANADIUM TOOLS", 8, 3200, 22, 32, 10);
	public static ToolMaterial VANADIUMSWORD = EnumHelper.addToolMaterial("VANADIUMSWORD", 8, 3200, 22, 34, 10);
	// scandium
	public static ToolMaterial SCANDIUMTOOLS = EnumHelper.addToolMaterial("SCANDIUM TOOLS", 8, 3300, 23, 34, 10);
	public static ToolMaterial SCANDIUMSWORD = EnumHelper.addToolMaterial("SCANDIUMSWORD", 8, 3300, 23, 36, 10);
	// bismuth
	public static ToolMaterial BISMUTHTOOLS = EnumHelper.addToolMaterial("BISMUTH TOOLS", 9, 3400, 24, 36, 10);
	public static ToolMaterial BISMUTHSWORD = EnumHelper.addToolMaterial("BISMUTHSWORD", 9, 3400, 24, 38, 10);
	// indium
	public static ToolMaterial INDIUMTOOLS = EnumHelper.addToolMaterial("INDIUM TOOLS", 9, 3500, 25, 38, 10);
	public static ToolMaterial INDIUMSWORD = EnumHelper.addToolMaterial("INDIUMSWORD", 9, 3500, 25, 40, 10);
	// platinum
	public static ToolMaterial PLATINUMTOOLS = EnumHelper.addToolMaterial("PLATINUM TOOLS", 10, 3600, 26, 40, 10);
	public static ToolMaterial PLATINUMSWORD = EnumHelper.addToolMaterial("PLATINUMSWORD", 10, 3600, 26, 42, 10);
	// darkness
	public static ToolMaterial DARKNESSTOOLS = EnumHelper.addToolMaterial("DARKNESS TOOLS", 20, 5000, 40, 65, 10);
	public static ToolMaterial DARKNESSSWORD = EnumHelper.addToolMaterial("DARKNESSSWORD", 20, 5000, 40, 65, 10);
	// light
	public static ToolMaterial LIGHTTOOLS = EnumHelper.addToolMaterial("LIGHT TOOLS", 20, 5000, 40, 65, 10);
	public static ToolMaterial LIGHTSWORD = EnumHelper.addToolMaterial("LIGHTSWORD", 20, 5000, 40, 65, 10);
	// omega
	public static ToolMaterial OMEGATOOLS = EnumHelper.addToolMaterial("OMEGA TOOLS", 30, 6000, 50, 100, 10);
	public static ToolMaterial OMEGASWORD = EnumHelper.addToolMaterial("OMEGASWORD", 30, 6000, 50, 100, 10);
	// Berionvar
	public static ToolMaterial BERIONVARTOOLS = EnumHelper.addToolMaterial("BERIONVAR TOOLS", 11, 3700, 27, 44, 10);
	public static ToolMaterial BERIONVARSWORD = EnumHelper.addToolMaterial("BERIONVARSWORD", 11, 3700, 27, 46, 10);
	// Charviole
	public static ToolMaterial CHARVIOLETOOLS = EnumHelper.addToolMaterial("CHARVIOLE TOOLS", 12, 3800, 28, 46, 10);
	public static ToolMaterial CHARVIOLESWORD = EnumHelper.addToolMaterial("CHARVIOLESWORD", 12, 3800, 28, 48, 10);
	// Firlvear
	public static ToolMaterial FIRLVEARTOOLS = EnumHelper.addToolMaterial("FIRLVEAR TOOLS", 13, 3900, 29, 48, 10);
	public static ToolMaterial FIRLVEARSWORD = EnumHelper.addToolMaterial("FIRLVEARSWORD", 13, 3900, 29, 50, 10);
	// selmenrer
	public static ToolMaterial SELMENRERTOOLS = EnumHelper.addToolMaterial("SELMENRER TOOLS", 14, 4000, 30, 50, 10);
	public static ToolMaterial SELMENRERSWORD = EnumHelper.addToolMaterial("SELMENRERSWORD", 14, 4000, 30, 52, 10);
	// verilion
	public static ToolMaterial VERILIONTOOLS = EnumHelper.addToolMaterial("VERILION TOOLS", 15, 4100, 31, 52, 10);
	public static ToolMaterial VERILIONSWORD = EnumHelper.addToolMaterial("VERILIONSWORD", 15, 4100, 31, 54, 10);
	// vielvor
	public static ToolMaterial VIELVORTOOLS = EnumHelper.addToolMaterial("VIELVOR TOOLS", 16, 4200, 32, 54, 10);
	public static ToolMaterial VIELVORSWORD = EnumHelper.addToolMaterial("VIELVORSWORD", 16, 4200, 32, 56, 10);
	// invisble
	public static ToolMaterial INVISIBLESWORD = EnumHelper.addToolMaterial("INVISIBLESWORD", 20, 5000, 40, 70, 10);

	public static void configureTools() {
		// urotark
		urotarkaxe = new Vgaxe(UROTARKTOOLS).setUnlocalizedName("vgurotarkaxe").setCreativeTab(CreativetabHandler.vgtab3);
		urotarkhoe = new Vghoe(UROTARKTOOLS).setUnlocalizedName("vgurotarkhoe").setCreativeTab(CreativetabHandler.vgtab3);
		urotarkshovel = new Vgshovel(UROTARKTOOLS).setUnlocalizedName("vgurotarkshovel").setCreativeTab(CreativetabHandler.vgtab3);
		urotarksword = new Vgsword(UROTARKSWORD).setUnlocalizedName("vgurotarksword").setCreativeTab(CreativetabHandler.vgtab4);
		urotarkpickaxe = new Vgpickaxe(UROTARKTOOLS).setUnlocalizedName("vgurotarkpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// pearl
		pearlaxe = new Vgaxe(PEARLTOOLS).setUnlocalizedName("vgpearlaxe").setCreativeTab(CreativetabHandler.vgtab3);
		pearlhoe = new Vghoe(PEARLTOOLS).setUnlocalizedName("vgpearlhoe").setCreativeTab(CreativetabHandler.vgtab3);
		pearlshovel = new Vgshovel(PEARLTOOLS).setUnlocalizedName("vgpearlshovel").setCreativeTab(CreativetabHandler.vgtab3);
		pearlsword = new Vgsword(PEARLSWORD).setUnlocalizedName("vgpearlsword").setCreativeTab(CreativetabHandler.vgtab4);
		pearlpickaxe = new Vgpickaxe(PEARLTOOLS).setUnlocalizedName("vgpearlpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// sapphire
		sapphireaxe = new Vgaxe(SAPPHIRETOOLS).setUnlocalizedName("vgsapphireaxe").setCreativeTab(CreativetabHandler.vgtab3);
		sapphirehoe = new Vghoe(SAPPHIRETOOLS).setUnlocalizedName("vgsapphirehoe").setCreativeTab(CreativetabHandler.vgtab3);
		sapphireshovel = new Vgshovel(SAPPHIRETOOLS).setUnlocalizedName("vgsapphireshovel").setCreativeTab(CreativetabHandler.vgtab3);
		sapphiresword = new Vgsword(SAPPHIRESWORD).setUnlocalizedName("vgsapphiresword").setCreativeTab(CreativetabHandler.vgtab4);
		sapphirepickaxe = new Vgpickaxe(SAPPHIRETOOLS).setUnlocalizedName("vgsapphirepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// muscovite
		muscoviteaxe = new Vgaxe(MUSCOVITETOOLS).setUnlocalizedName("vgmuscoviteaxe").setCreativeTab(CreativetabHandler.vgtab3);
		muscovitehoe = new Vghoe(MUSCOVITETOOLS).setUnlocalizedName("vgmuscovitehoe").setCreativeTab(CreativetabHandler.vgtab3);
		muscoviteshovel = new Vgshovel(MUSCOVITETOOLS).setUnlocalizedName("vgmuscoviteshovel").setCreativeTab(CreativetabHandler.vgtab3);
		muscovitesword = new Vgsword(MUSCOVITESWORD).setUnlocalizedName("vgmuscovitesword").setCreativeTab(CreativetabHandler.vgtab4);
		muscovitepickaxe = new Vgpickaxe(MUSCOVITETOOLS).setUnlocalizedName("vgmuscovitepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// ruby
		rubyaxe = new Vgaxe(RUBYTOOLS).setUnlocalizedName("vgrubyaxe").setCreativeTab(CreativetabHandler.vgtab3);
		rubyhoe = new Vghoe(RUBYTOOLS).setUnlocalizedName("vgrubyhoe").setCreativeTab(CreativetabHandler.vgtab3);
		rubyshovel = new Vgshovel(RUBYTOOLS).setUnlocalizedName("vgrubyshovel").setCreativeTab(CreativetabHandler.vgtab3);
		rubysword = new Vgsword(RUBYSWORD).setUnlocalizedName("vgrubysword").setCreativeTab(CreativetabHandler.vgtab4);
		rubypickaxe = new Vgpickaxe(RUBYTOOLS).setUnlocalizedName("vgrubypickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// uriotyke
		uriotykeaxe = new Vgaxe(URIOTYKETOOLS).setUnlocalizedName("vguriotykeaxe").setCreativeTab(CreativetabHandler.vgtab3);
		uriotykehoe = new Vghoe(URIOTYKETOOLS).setUnlocalizedName("vguriotykehoe").setCreativeTab(CreativetabHandler.vgtab3);
		uriotykeshovel = new Vgshovel(URIOTYKETOOLS).setUnlocalizedName("vguriotykeshovel").setCreativeTab(CreativetabHandler.vgtab3);
		uriotykesword = new Vgsword(URIOTYKESWORD).setUnlocalizedName("vguriotykesword").setCreativeTab(CreativetabHandler.vgtab4);
		uriotykepickaxe = new Vgpickaxe(URIOTYKETOOLS).setUnlocalizedName("vguriotykepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// gilder
		gilderaxe = new Vgaxe(GILDERTOOLS).setUnlocalizedName("vggilderaxe").setCreativeTab(CreativetabHandler.vgtab3);
		gilderhoe = new Vghoe(GILDERTOOLS).setUnlocalizedName("vggilderhoe").setCreativeTab(CreativetabHandler.vgtab3);
		gildershovel = new Vgshovel(GILDERTOOLS).setUnlocalizedName("vggildershovel").setCreativeTab(CreativetabHandler.vgtab3);
		gildersword = new Vgsword(GILDERSWORD).setUnlocalizedName("vggildersword").setCreativeTab(CreativetabHandler.vgtab4);
		gilderpickaxe = new Vgpickaxe(GILDERTOOLS).setUnlocalizedName("vggilderpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// selovar
		selovaraxe = new Vgaxe(SELOVARTOOLS).setUnlocalizedName("vgselovaraxe").setCreativeTab(CreativetabHandler.vgtab3);
		selovarhoe = new Vghoe(SELOVARTOOLS).setUnlocalizedName("vgselovarhoe").setCreativeTab(CreativetabHandler.vgtab3);
		selovarshovel = new Vgshovel(SELOVARTOOLS).setUnlocalizedName("vgselovarshovel").setCreativeTab(CreativetabHandler.vgtab3);
		selovarsword = new Vgsword(SELOVARSWORD).setUnlocalizedName("vgselovarsword").setCreativeTab(CreativetabHandler.vgtab4);
		selovarpickaxe = new Vgpickaxe(SELOVARTOOLS).setUnlocalizedName("vgselovarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// parfilian
		parfilianaxe = new Vgaxe(PARFILIANTOOLS).setUnlocalizedName("vgparfilianaxe").setCreativeTab(CreativetabHandler.vgtab3);
		parfilianhoe = new Vghoe(PARFILIANTOOLS).setUnlocalizedName("vgparfilianhoe").setCreativeTab(CreativetabHandler.vgtab3);
		parfilianshovel = new Vgshovel(PARFILIANTOOLS).setUnlocalizedName("vgparfilianshovel").setCreativeTab(CreativetabHandler.vgtab3);
		parfiliansword = new Vgsword(PARFILIANSWORD).setUnlocalizedName("vgparfiliansword").setCreativeTab(CreativetabHandler.vgtab4);
		parfilianpickaxe = new Vgpickaxe(PARFILIANTOOLS).setUnlocalizedName("vgparfilianpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// barium
		bariumaxe = new Vgaxe(BARIUMTOOLS).setUnlocalizedName("vgbariumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		bariumhoe = new Vghoe(BARIUMTOOLS).setUnlocalizedName("vgbariumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		bariumshovel = new Vgshovel(BARIUMTOOLS).setUnlocalizedName("vgbariumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		bariumsword = new Vgsword(BARIUMSWORD).setUnlocalizedName("vgbariumsword").setCreativeTab(CreativetabHandler.vgtab4);
		bariumpickaxe = new Vgpickaxe(BARIUMTOOLS).setUnlocalizedName("vgbariumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// radium
		radiumaxe = new Vgaxe(RADIUMTOOLS).setUnlocalizedName("vgradiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		radiumhoe = new Vghoe(RADIUMTOOLS).setUnlocalizedName("vgradiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		radiumshovel = new Vgshovel(RADIUMTOOLS).setUnlocalizedName("vgradiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		radiumsword = new Vgsword(RADIUMSWORD).setUnlocalizedName("vgradiumsword").setCreativeTab(CreativetabHandler.vgtab4);
		radiumpickaxe = new Vgpickaxe(RADIUMTOOLS).setUnlocalizedName("vgradiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// gallum
		gallumaxe = new Vgaxe(GALLUMTOOLS).setUnlocalizedName("vggallumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		gallumhoe = new Vghoe(GALLUMTOOLS).setUnlocalizedName("vggallumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		gallumshovel = new Vgshovel(GALLUMTOOLS).setUnlocalizedName("vggallumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		gallumsword = new Vgsword(GALLUMSWORD).setUnlocalizedName("vggallumsword").setCreativeTab(CreativetabHandler.vgtab4);
		gallumpickaxe = new Vgpickaxe(GALLUMTOOLS).setUnlocalizedName("vggallumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// vanadium
		vanadiumaxe = new Vgaxe(VANADIUMTOOLS).setUnlocalizedName("vgvanadiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		vanadiumhoe = new Vghoe(VANADIUMTOOLS).setUnlocalizedName("vgvanadiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		vanadiumshovel = new Vgshovel(VANADIUMTOOLS).setUnlocalizedName("vgvanadiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		vanadiumsword = new Vgsword(VANADIUMSWORD).setUnlocalizedName("vgvanadiumsword").setCreativeTab(CreativetabHandler.vgtab4);
		vanadiumpickaxe = new Vgpickaxe(VANADIUMTOOLS).setUnlocalizedName("vgvanadiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// scandium
		scandiumaxe = new Vgaxe(SCANDIUMTOOLS).setUnlocalizedName("vgscandiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		scandiumhoe = new Vghoe(SCANDIUMTOOLS).setUnlocalizedName("vgscandiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		scandiumshovel = new Vgshovel(SCANDIUMTOOLS).setUnlocalizedName("vgscandiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		scandiumsword = new Vgsword(SCANDIUMSWORD).setUnlocalizedName("vgscandiumsword").setCreativeTab(CreativetabHandler.vgtab4);
		scandiumpickaxe = new Vgpickaxe(SCANDIUMTOOLS).setUnlocalizedName("vgscandiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// bismuth
		bismuthaxe = new Vgaxe(BISMUTHTOOLS).setUnlocalizedName("vgbismuthaxe").setCreativeTab(CreativetabHandler.vgtab3);
		bismuthhoe = new Vghoe(BISMUTHTOOLS).setUnlocalizedName("vgbismuthhoe").setCreativeTab(CreativetabHandler.vgtab3);
		bismuthshovel = new Vgshovel(BISMUTHTOOLS).setUnlocalizedName("vgbismuthshovel").setCreativeTab(CreativetabHandler.vgtab3);
		bismuthsword = new Vgsword(BISMUTHSWORD).setUnlocalizedName("vgbismuthsword").setCreativeTab(CreativetabHandler.vgtab4);
		bismuthpickaxe = new Vgpickaxe(BISMUTHTOOLS).setUnlocalizedName("vgbismuthpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// indium
		indiumaxe = new Vgaxe(INDIUMTOOLS).setUnlocalizedName("vgindiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		indiumhoe = new Vghoe(INDIUMTOOLS).setUnlocalizedName("vgindiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		indiumshovel = new Vgshovel(INDIUMTOOLS).setUnlocalizedName("vgindiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		indiumsword = new Vgsword(INDIUMSWORD).setUnlocalizedName("vgindiumsword").setCreativeTab(CreativetabHandler.vgtab4);
		indiumpickaxe = new Vgpickaxe(INDIUMTOOLS).setUnlocalizedName("vgindiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// platinum
		platinumaxe = new Vgaxe(PLATINUMTOOLS).setUnlocalizedName("vgplatinumaxe").setCreativeTab(CreativetabHandler.vgtab3);
		platinumhoe = new Vghoe(PLATINUMTOOLS).setUnlocalizedName("vgplatinumhoe").setCreativeTab(CreativetabHandler.vgtab3);
		platinumshovel = new Vgshovel(PLATINUMTOOLS).setUnlocalizedName("vgplatinumshovel").setCreativeTab(CreativetabHandler.vgtab3);
		platinumsword = new Vgsword(PLATINUMSWORD).setUnlocalizedName("vgplatinumsword").setCreativeTab(CreativetabHandler.vgtab4);
		platinumpickaxe = new Vgpickaxe(PLATINUMTOOLS).setUnlocalizedName("vgplatinumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// darkness
		darknessaxe = new Vgaxe(DARKNESSTOOLS).setUnlocalizedName("vgdarknessaxe").setCreativeTab(CreativetabHandler.vgtab3);
		darknesshoe = new Vghoe(DARKNESSTOOLS).setUnlocalizedName("vgdarknesshoe").setCreativeTab(CreativetabHandler.vgtab3);
		darknessshovel = new Vgshovel(DARKNESSTOOLS).setUnlocalizedName("vgdarknessshovel").setCreativeTab(CreativetabHandler.vgtab3);
		darknesssword = new Vgsword(DARKNESSSWORD).setUnlocalizedName("vgdarknesssword").setCreativeTab(CreativetabHandler.vgtab4);
		darknesspickaxe = new Vgpickaxe(DARKNESSTOOLS).setUnlocalizedName("vgdarknesspickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// light
		lightaxe = new Vgaxe(LIGHTTOOLS).setUnlocalizedName("vglightaxe").setCreativeTab(CreativetabHandler.vgtab3);
		lighthoe = new Vghoe(LIGHTTOOLS).setUnlocalizedName("vglighthoe").setCreativeTab(CreativetabHandler.vgtab3);
		lightshovel = new Vgshovel(LIGHTTOOLS).setUnlocalizedName("vglightshovel").setCreativeTab(CreativetabHandler.vgtab3);
		lightsword = new Vgsword(LIGHTSWORD).setUnlocalizedName("vglightsword").setCreativeTab(CreativetabHandler.vgtab4);
		lightpickaxe = new Vgpickaxe(LIGHTTOOLS).setUnlocalizedName("vglightpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// omega
		omegaaxe = new Vgaxe(OMEGATOOLS).setUnlocalizedName("vgomegaaxe").setCreativeTab(CreativetabHandler.vgtab3);
		omegahoe = new Vghoe(OMEGATOOLS).setUnlocalizedName("vgomegahoe").setCreativeTab(CreativetabHandler.vgtab3);
		omegashovel = new Vgshovel(OMEGATOOLS).setUnlocalizedName("vgomegashovel").setCreativeTab(CreativetabHandler.vgtab3);
		omegasword = new Vgsword(OMEGASWORD).setUnlocalizedName("vgomegasword").setCreativeTab(CreativetabHandler.vgtab4);
		omegahand = new Vgsword(OMEGASWORD).setUnlocalizedName("vgomegahand").setCreativeTab(CreativetabHandler.vgtab4);
		omegapickaxe = new Vgpickaxe(OMEGATOOLS).setUnlocalizedName("vgomegapickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// Berionvar
		berionvaraxe = new Vgaxe(BERIONVARTOOLS).setUnlocalizedName("vgberionvaraxe").setCreativeTab(CreativetabHandler.vgtab3);
		berionvarhoe = new Vghoe(BERIONVARTOOLS).setUnlocalizedName("vgberionvarhoe").setCreativeTab(CreativetabHandler.vgtab3);
		berionvarshovel = new Vgshovel(BERIONVARTOOLS).setUnlocalizedName("vgberionvarshovel").setCreativeTab(CreativetabHandler.vgtab3);
		berionvarsword = new Vgsword(BERIONVARSWORD).setUnlocalizedName("vgberionvarsword").setCreativeTab(CreativetabHandler.vgtab4);
		berionvarpickaxe = new Vgpickaxe(BERIONVARTOOLS).setUnlocalizedName("vgberionvarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// Charviole
		charvioleaxe = new Vgaxe(CHARVIOLETOOLS).setUnlocalizedName("vgcharvioleaxe").setCreativeTab(CreativetabHandler.vgtab3);
		charviolehoe = new Vghoe(CHARVIOLETOOLS).setUnlocalizedName("vgcharviolehoe").setCreativeTab(CreativetabHandler.vgtab3);
		charvioleshovel = new Vgshovel(CHARVIOLETOOLS).setUnlocalizedName("vgcharvioleshovel").setCreativeTab(CreativetabHandler.vgtab3);
		charviolesword = new Vgsword(CHARVIOLESWORD).setUnlocalizedName("vgcharviolesword").setCreativeTab(CreativetabHandler.vgtab4);
		charviolepickaxe = new Vgpickaxe(CHARVIOLETOOLS).setUnlocalizedName("vgcharviolepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// Firlvear
		firlvearaxe = new Vgaxe(FIRLVEARTOOLS).setUnlocalizedName("vgfirlvearaxe").setCreativeTab(CreativetabHandler.vgtab3);
		firlvearhoe = new Vghoe(FIRLVEARTOOLS).setUnlocalizedName("vgfirlvearhoe").setCreativeTab(CreativetabHandler.vgtab3);
		firlvearshovel = new Vgshovel(FIRLVEARTOOLS).setUnlocalizedName("vgfirlvearshovel").setCreativeTab(CreativetabHandler.vgtab3);
		firlvearsword = new Vgsword(FIRLVEARSWORD).setUnlocalizedName("vgfirlvearsword").setCreativeTab(CreativetabHandler.vgtab4);
		firlvearpickaxe = new Vgpickaxe(FIRLVEARTOOLS).setUnlocalizedName("vgfirlvearpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// selmenrer
		selmenreraxe = new Vgaxe(SELMENRERTOOLS).setUnlocalizedName("vgselmenreraxe").setCreativeTab(CreativetabHandler.vgtab3);
		selmenrerhoe = new Vghoe(SELMENRERTOOLS).setUnlocalizedName("vgselmenrerhoe").setCreativeTab(CreativetabHandler.vgtab3);
		selmenrershovel = new Vgshovel(SELMENRERTOOLS).setUnlocalizedName("vgselmenrershovel").setCreativeTab(CreativetabHandler.vgtab3);
		selmenrersword = new Vgsword(SELMENRERSWORD).setUnlocalizedName("vgselmenrersword").setCreativeTab(CreativetabHandler.vgtab4);
		selmenrerpickaxe = new Vgpickaxe(SELMENRERTOOLS).setUnlocalizedName("vgselmenrerpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// verilion
		verilionaxe = new Vgaxe(VERILIONTOOLS).setUnlocalizedName("vgverilionaxe").setCreativeTab(CreativetabHandler.vgtab3);
		verilionhoe = new Vghoe(VERILIONTOOLS).setUnlocalizedName("vgverilionhoe").setCreativeTab(CreativetabHandler.vgtab3);
		verilionshovel = new Vgshovel(VERILIONTOOLS).setUnlocalizedName("vgverilionshovel").setCreativeTab(CreativetabHandler.vgtab3);
		verilionsword = new Vgsword(VERILIONSWORD).setUnlocalizedName("vgverilionsword").setCreativeTab(CreativetabHandler.vgtab4);
		verilionpickaxe = new Vgpickaxe(VERILIONTOOLS).setUnlocalizedName("vgverilionpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// vielvor
		vielvoraxe = new Vgaxe(VIELVORTOOLS).setUnlocalizedName("vgvielvoraxe").setCreativeTab(CreativetabHandler.vgtab3);
		vielvorhoe = new Vghoe(VIELVORTOOLS).setUnlocalizedName("vgvielvorhoe").setCreativeTab(CreativetabHandler.vgtab3);
		vielvorshovel = new Vgshovel(VIELVORTOOLS).setUnlocalizedName("vgvielvorshovel").setCreativeTab(CreativetabHandler.vgtab3);
		vielvorsword = new Vgsword(VIELVORSWORD).setUnlocalizedName("vgvielvorsword").setCreativeTab(CreativetabHandler.vgtab4);
		vielvorpickaxe = new Vgpickaxe(VIELVORTOOLS).setUnlocalizedName("vgvielvorpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
		// invisible
		invisibledagger = new Vgsword(INVISIBLESWORD).setUnlocalizedName("vginvisibledagger").setCreativeTab(CreativetabHandler.vgtab4);
	}

	public static void registerItem(GameRegistry registry) {
		// urotark
		registry.registerItem(urotarkaxe, "vgurotarkaxe");
		registry.registerItem(urotarkhoe, "vgurotarkhoe");
		registry.registerItem(urotarkshovel, "vgurotarkshovel");
		registry.registerItem(urotarksword, "vgurotarksword");
		registry.registerItem(urotarkpickaxe, "vgurotarkpickaxe");
		// pearl
		registry.registerItem(pearlaxe, "vgpearlaxe");
		registry.registerItem(pearlhoe, "vgpearlhoe");
		registry.registerItem(pearlshovel, "vgpearlshovel");
		registry.registerItem(pearlsword, "vgpearlsword");
		registry.registerItem(pearlpickaxe, "vgpearlpickaxe");
		// sapphire
		registry.registerItem(sapphireaxe, "vgsapphireaxe");
		registry.registerItem(sapphirehoe, "vgsapphirehoe");
		registry.registerItem(sapphireshovel, "vgsapphireshovel");
		registry.registerItem(sapphiresword, "vgsapphiresword");
		registry.registerItem(sapphirepickaxe, "vgsapphirepickaxe");
		// muscovite
		registry.registerItem(muscoviteaxe, "vgmuscoviteaxe");
		registry.registerItem(muscovitehoe, "vgmuscovitehoe");
		registry.registerItem(muscoviteshovel, "vgmuscoviteshovel");
		registry.registerItem(muscovitesword, "vgmuscovitesword");
		registry.registerItem(muscovitepickaxe, "vgmuscovitepickaxe");
		// ruby
		registry.registerItem(rubyaxe, "vgrubyaxe");
		registry.registerItem(rubyhoe, "vgrubyhoe");
		registry.registerItem(rubyshovel, "vgrubyshovel");
		registry.registerItem(rubysword, "vgrubysword");
		registry.registerItem(rubypickaxe, "vgrubypickaxe");
		// uriotyke
		registry.registerItem(uriotykeaxe, "vguriotykeaxe");
		registry.registerItem(uriotykehoe, "vguriotykehoe");
		registry.registerItem(uriotykeshovel, "vguriotykeshovel");
		registry.registerItem(uriotykesword, "vguriotykesword");
		registry.registerItem(uriotykepickaxe, "vguriotykepickaxe");
		// gilder
		registry.registerItem(gilderaxe, "vggilderaxe");
		registry.registerItem(gilderhoe, "vggilderhoe");
		registry.registerItem(gildershovel, "vggildershovel");
		registry.registerItem(gildersword, "vggildersword");
		registry.registerItem(gilderpickaxe, "vggilderpickaxe");
		// selovar
		registry.registerItem(selovaraxe, "vgselovaraxe");
		registry.registerItem(selovarhoe, "vgselovarhoe");
		registry.registerItem(selovarshovel, "vgselovarshovel");
		registry.registerItem(selovarsword, "vgselovarsword");
		registry.registerItem(selovarpickaxe, "vgselovarpickaxe");
		// parfilian
		registry.registerItem(parfilianaxe, "vgparfilianaxe");
		registry.registerItem(parfilianhoe, "vgparfilianhoe");
		registry.registerItem(parfilianshovel, "vgparfilianshovel");
		registry.registerItem(parfiliansword, "vgparfiliansword");
		registry.registerItem(parfilianpickaxe, "vgparfilianpickaxe");
		// barium
		registry.registerItem(bariumaxe, "vgbariumaxe");
		registry.registerItem(bariumhoe, "vgbariumhoe");
		registry.registerItem(bariumshovel, "vgbariumshovel");
		registry.registerItem(bariumsword, "vgbariumsword");
		registry.registerItem(bariumpickaxe, "vgbariumpickaxe");
		// radium
		registry.registerItem(radiumaxe, "vgradiumaxe");
		registry.registerItem(radiumhoe, "vgradiumhoe");
		registry.registerItem(radiumshovel, "vgradiumshovel");
		registry.registerItem(radiumsword, "vgradiumsword");
		registry.registerItem(radiumpickaxe, "vgradiumpickaxe");
		// gallum
		registry.registerItem(gallumaxe, "vggallumaxe");
		registry.registerItem(gallumhoe, "vggallumhoe");
		registry.registerItem(gallumshovel, "vggallumshovel");
		registry.registerItem(gallumsword, "vggallumsword");
		registry.registerItem(gallumpickaxe, "vggallumpickaxe");
		// vanadium
		registry.registerItem(vanadiumaxe, "vgvanadiumaxe");
		registry.registerItem(vanadiumhoe, "vgvanadiumhoe");
		registry.registerItem(vanadiumshovel, "vgvanadiumshovel");
		registry.registerItem(vanadiumsword, "vgvanadiumsword");
		registry.registerItem(vanadiumpickaxe, "vgvanadiumpickaxe");
		// scandium
		registry.registerItem(scandiumaxe, "vgscandiumaxe");
		registry.registerItem(scandiumhoe, "vgscandiumhoe");
		registry.registerItem(scandiumshovel, "vgscandiumshovel");
		registry.registerItem(scandiumsword, "vgscandiumsword");
		registry.registerItem(scandiumpickaxe, "vgscandiumpickaxe");
		// bismuth
		registry.registerItem(bismuthaxe, "vgbismuthaxe");
		registry.registerItem(bismuthhoe, "vgbismuthhoe");
		registry.registerItem(bismuthshovel, "vgbismuthshovel");
		registry.registerItem(bismuthsword, "vgbismuthsword");
		registry.registerItem(bismuthpickaxe, "vgbismuthpickaxe");
		// indium
		registry.registerItem(indiumaxe, "vgindiumaxe");
		registry.registerItem(indiumhoe, "vgindiumhoe");
		registry.registerItem(indiumshovel, "vgindiumshovel");
		registry.registerItem(indiumsword, "vgindiumsword");
		registry.registerItem(indiumpickaxe, "vgindiumpickaxe");
		// platinum
		registry.registerItem(platinumaxe, "vgplatinumaxe");
		registry.registerItem(platinumhoe, "vgplatinumhoe");
		registry.registerItem(platinumshovel, "vgplatinumshovel");
		registry.registerItem(platinumsword, "vgplatinumsword");
		registry.registerItem(platinumpickaxe, "vgplatinumpickaxe");
		// darkness
		registry.registerItem(darknessaxe, "vgdarknessaxe");
		registry.registerItem(darknesshoe, "vgdarknesshoe");
		registry.registerItem(darknessshovel, "vgdarknessshovel");
		registry.registerItem(darknesssword, "vgdarknesssword");
		registry.registerItem(darknesspickaxe, "vgdarknesspickaxe");
		// light
		registry.registerItem(lightaxe, "vglightaxe");
		registry.registerItem(lighthoe, "vglighthoe");
		registry.registerItem(lightshovel, "vglightshovel");
		registry.registerItem(lightsword, "vglightsword");
		registry.registerItem(lightpickaxe, "vglightpickaxe");
		// omega
		registry.registerItem(omegaaxe, "vgomegaaxe");
		registry.registerItem(omegahoe, "vgomegahoe");
		registry.registerItem(omegashovel, "vgomegashovel");
		registry.registerItem(omegasword, "vgomegasword");
		registry.registerItem(omegahand, "vgomegahand");
		registry.registerItem(omegapickaxe, "vgomegapickaxe");
		// Berionvar
		registry.registerItem(berionvaraxe, "vgberionvaraxe");
		registry.registerItem(berionvarhoe, "vgberionvarhoe");
		registry.registerItem(berionvarshovel, "vgberionvarshovel");
		registry.registerItem(berionvarsword, "vgberionvarsword");
		registry.registerItem(berionvarpickaxe, "vgberionvarpickaxe");
		// Charviole
		registry.registerItem(charvioleaxe, "vgcharvioleaxe");
		registry.registerItem(charviolehoe, "vgcharviolehoe");
		registry.registerItem(charvioleshovel, "vgcharvioleshovel");
		registry.registerItem(charviolesword, "vgcharviolesword");
		registry.registerItem(charviolepickaxe, "vgcharviolepickaxe");
		// Firlvear
		registry.registerItem(firlvearaxe, "vgfirlvearaxe");
		registry.registerItem(firlvearhoe, "vgfirlvearhoe");
		registry.registerItem(firlvearshovel, "vgfirlvearshovel");
		registry.registerItem(firlvearsword, "vgfirlvearsword");
		registry.registerItem(firlvearpickaxe, "vgfirlvearpickaxe");
		// selmenrer
		registry.registerItem(selmenreraxe, "vgselmenreraxe");
		registry.registerItem(selmenrerhoe, "vgselmenrerhoe");
		registry.registerItem(selmenrershovel, "vgselmenrershovel");
		registry.registerItem(selmenrersword, "vgselmenrersword");
		registry.registerItem(selmenrerpickaxe, "vgselmenrerpickaxe");
		// verilion
		registry.registerItem(verilionaxe, "vgverilionaxe");
		registry.registerItem(verilionhoe, "vgverilionhoe");
		registry.registerItem(verilionshovel, "vgverilionshovel");
		registry.registerItem(verilionsword, "vgverilionsword");
		registry.registerItem(verilionpickaxe, "vgverilionpickaxe");
		// vielvor
		registry.registerItem(vielvoraxe, "vgvielvoraxe");
		registry.registerItem(vielvorhoe, "vgvielvorhoe");
		registry.registerItem(vielvorshovel, "vgvielvorshovel");
		registry.registerItem(vielvorsword, "vgvielvorsword");
		registry.registerItem(vielvorpickaxe, "vgvielvorpickaxe");
		// invisible
		registry.registerItem(invisibledagger, "vginvisibledagger");
	}

}
