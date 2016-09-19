package monster.controller;

import monster.model.MarshmallowMonster; 

public class MonsterController
{	
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
			firstMonster = new MarshmallowMonster("Carols", 3, 4, 1, 2, true);
	}

	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("here is mine" + firstMonster);
		System.out.println("my monster has this many legs" + firstMonster.getNoseCount());
		System.out.println("Carols has nose" + firstMonster.getLegCount());
		System.out.println("Carols has belly button" + firstMonster.gethasBellybutton());
	}
		/* monster name is Carols 
		 * has 3 antenna 
		 * has 4 legs 
		 * has 1 nose 
		 * has 2 eyes 
		 * does have a belly button
		 */




}

	
