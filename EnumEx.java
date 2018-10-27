class EnumEx
{
	public enum Modes{Alpha,Omega,Delta,Gamma,Beta}	
	public static void main(String args[])
	{	
	for(Modes m:Modes.values())
	System.out.println(m);
	}
}

