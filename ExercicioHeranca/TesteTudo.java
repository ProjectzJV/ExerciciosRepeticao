package ExercicioHeranca;

public class TesteTudo {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal();
		
		cachorro.setNome("Zeus");
		cachorro.setIdade(4);
		cachorro.setSom("Au Au Au Au...");
		cachorro.setCorrer("4km");
		
		System.out.println("Animal - |CACHORRO|");
		System.out.println("Nome do cachorro: "+cachorro.getNome()+".");
		System.out.println("Idade do cachorro: "+cachorro.getIdade()+" anos.");
		System.out.println("Latido emitido: " +cachorro.getSom());
		System.out.println(cachorro.getNome()+ " percorreu: "+ cachorro.getCorrer()+" fugindo de seu dono.");
		System.out.println();
		
		System.out.println("---------------------------------------------");
		
		System.out.println();

		Animal cavalo = new Animal();
		
		cavalo.setNome("Jurubeba");
		cavalo.setIdade(13);
		cavalo.setSom("iiirrrrí, rilinchin...	");
		cavalo.setCorrer("10km");
		
		System.out.println("Animal - |CAVALO|");
		System.out.println("Nome do Equino: "+cavalo.getNome()+".");
		System.out.println("Idade do Equino: "+cavalo.getIdade()+" anos.");
		System.out.println("Relincho emitido: "+cavalo.getSom());
		System.out.println(cavalo.getNome()+ " percorreu: " +cavalo.getCorrer()+" durante o seu percurso.");
		System.out.println();
		
		System.out.println("----------------------------------------------------");
			
		System.out.println();
		

		Animal preguica = new Animal();
		
		preguica.setNome("Glauber");
		preguica.setIdade(90);
		preguica.setSom("Mó sono ZzZzZzZzZ....");
		preguica.setSubir(" subiu 3 árvores em 5 dias.");
		
		System.out.println("Animal - |PREGUIÇA|");
		System.out.println("Nome da preguiça: "+preguica.getNome()+".");
		System.out.println("Idade da preguiça: "+preguica.getIdade()+" anos.");
		System.out.println("Som emitido: "+preguica.getSom());
		System.out.println("A preguiça " +preguica.getNome() +preguica.getSubir());
		
	}
}
