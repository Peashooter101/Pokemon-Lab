
public abstract class PokemonDecorator extends Pokemon {
	private Pokemon pokemon;
	
	public PokemonDecorator(Pokemon p, String extraName, int extraHp) {
		// ? not sure if correct super constructor call
		super(extraName, extraHp, extraHp);
		pokemon = p;
	}
	
	public String getAttackMenu(int atkType) {
		return pokemon.getAttackMenu(atkType);
	}
	
	public int getNumAttackMenuItems(int atkType) {
		return pokemon.getNumAttackMenuItems(atkType);
	}
	
	public String getAttackString(int atkType, int move) {
		return pokemon.getAttackString(atkType, move);
	}
	
	public int getAttackDamage(int atkType, int move) {
		return pokemon.getAttackDamage(atkType, move);
	}
	
	public double getAttackMultiplier(Pokemon p, int type) {
		return pokemon.getAttackMultiplier(p, type);
	}
	
	public int getAttackbonus(int atkType) {
		return pokemon.getAttackBonus(atkType);
	}
	
}
