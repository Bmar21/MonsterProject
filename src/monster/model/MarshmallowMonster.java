package monster.model;

public class MarshmallowMonster 
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private double legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster ()
	{
		this.name = "MonsterName";
		this.antennaCount = 867;
		this.eyeCount = 4556;
		this.legCount = 565;
		this.noseCount = 564;
		this.hasBellyButton = true;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, double legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}
	
	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean gethasBellybutton()
	{
			return hasBellyButton;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}


}