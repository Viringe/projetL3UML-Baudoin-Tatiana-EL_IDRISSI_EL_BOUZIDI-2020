
/**
 * @author Tatiana GRIES
 */

public class HommePresse extends Personnage
{
	private boolean mort; // on va se servir de ça après pour voir s'il est vivant ou mort.

	public HommePresse(String nom)
	{
		super(nom);
		mort = false;
	}

	public void mort()
	{
		System.out.println("You died.");
		// à voir pour utiliser et appeler dans le système plus tard ? 
		this.mort=true;
	}

	public boolean deplacer(Case verif)
	{
		switch (verif.getType())
		{
			case TypeCase.EAU:
				return false;
			case TypeCase.NORMAL:
				return true;
			case TypeCase.FORET:
				return true;
			default:
				return false;
		}
	}

	public Personnage()
	{
		vie = 100;
		hyd = 75;
		sat = 75;
		mor = 50;
	}
}