
public class Character {
	private static final int NUM_STATS = 6;
	private static final int STR = 0;
	private static final int DEX = 1;
	private static final int CON = 2;
	private static final int INTE = 3;
	private static final int WIS = 4;
	private static final int CHR = 5;
	
	public Character(int str, int dex, int con, int inte, int wis, int chr){
		stats[STR] = str;
		stats[DEX] = dex;
		stats[CON] = con;
		stats[INTE] = inte;
		stats[WIS] = wis;
		stats[CHR] = chr;
	}
	//returns selected stat
	public int getStat(int type){
		int ret = -1;
		try{
			ret = stats[type];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return ret;
	}
	
	//increment stat of type by value
	public boolean incrementStat(int type, int value){
		boolean ret = false;
		try{
			ret = true;
			stats[type] += value;
		} catch (ArrayIndexOutOfBoundsException e) {
			ret = false;
			System.out.println(e.getMessage());
		}
		return ret;
	}
	
	//change stat of type to value
	public boolean changeStat(int type, int value){
		boolean ret = false;
		try{
			ret = true;
			stats[type] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			ret = false;
			System.out.println(e.getMessage());
		}
		return ret;
	}
	
	private int stats[];
}
