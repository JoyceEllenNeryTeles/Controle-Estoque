
public class TesteProduto {

	public static void main(String[] args) {

		Produto[] produtoArray = new Produto[10];

		produtoArray[0] = new Produto("Battlefield 5", 250.0, "Jogo FPS online e multiplayer", 300,
				new Categoria("Jogo", "Jogo plataforma"));
		produtoArray[1] = new Produto("Call of Duty", 450.0, "Jogo FPS online e multiplayer", 1000,
				new Categoria("Jogo", "Jogo plataforma"));
		produtoArray[2] = new Produto("Fone Razer Neon", 500.0, "Fone gamer da Razer neon multicolor", 300,
				new Categoria("Periféricos", "Periféricos Gamers"));
		produtoArray[3] = new Produto("Teclado mecânico", 300.0, "Teclado mecânico RGB", 300,
				new Categoria("Periféricos", "Periféricos Gamers"));
		produtoArray[4] = new Produto("Mouse RAZER LANCEHEAD WIRELESS", 898.48,
				"O mouse sem fio Razer Lancehead possui a tecnologia de freqüência adaptativa (AFT) proprietária da Razer, que garante a estabilidade da transmissão a 100%.",
				800, new Categoria("Periféricos", "Periféricos Gamers"));
		produtoArray[5] = new Produto("World of Warcraft", 200.0, "Jogo RPG online", 500,
				new Categoria("Jogo", "Jogo plataforma"));
		produtoArray[6] = new Produto("Overwatch", 290.0, "Jogo FPS online", 9000,
				new Categoria("Jogo", "Jogo plataforma"));
		produtoArray[7] = new Produto("Water Dancing - Caixa De Som E Abajur Led Àguas Dançantes", 89.0,
				"Jogo FPS online e multiplayer", 300, new Categoria("Periféricos", "Periféricos Gamers"));
		produtoArray[8] = new Produto("Teclado Exbom", 50.0, "Teclado semi-meânico Exbom", 30,
				new Categoria("Periféricos", "Periféricos Gamers"));
		produtoArray[9] = new Produto("Minecraft", 5.0, "Jogo interativo criativo", 10,
				new Categoria("Jogo", "Jogo plataforma"));

//		
		System.out.println(" -- Jogos -- ");		
			for (int i = 0; i < produtoArray.length; i++) {
				String nomeCategoria = produtoArray [i].getCategoria().getNome();
						
				if (nomeCategoria.equals("Jogo")) {
					System.out.println(produtoArray[i].getProduto());
			}	
			}
		
			System.out.println("\n -- Periféricos -- ");		
			
			for (int i = 0; i < produtoArray.length; i++) {
				String nomeCategoria = produtoArray [i].getCategoria().getNome();
				
				if (nomeCategoria.equals("Periféricos")) {
					System.out.println(produtoArray[i].getProduto());
			}	
			}
			
			
//		System.out.println(produtoArray[0].getCategoria().getNome());
	}

}
