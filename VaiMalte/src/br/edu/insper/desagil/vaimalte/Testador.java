package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho novo_carrinho1 = new Carrinho();
		
		Caixa nova_caixa1 = new Caixa();
		
		if(nova_caixa1.CompraTotal(novo_carrinho1) == 0.0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		Carrinho novo_carrinho2 = new Carrinho();
		
		Produto Pastel = new Produto (1, "Pastel", 5.00);
	
		novo_carrinho2.adicionaProduto(Pastel);
		
		Caixa nova_caixa2 = new Caixa();
		
		if(nova_caixa2.CompraTotal(novo_carrinho2) == 5.00) {
			return true;
		}
		
		return false;
	}

	public boolean testeC() {
		Carrinho novo_carrinho3 = new Carrinho();
		
		Produto Pastel = new Produto (1, "Pastel", 5.00);
	
		novo_carrinho3.adicionaProduto(Pastel);
		
		Caixa nova_caixa3 = new Caixa();
		
		nova_caixa3.ComDesconto(Pastel, 50);
		
		if(nova_caixa3.CompraTotal(novo_carrinho3) == 2.50) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho novo_carrinho4 = new Carrinho();
		
		Produto Pastel = new Produto (1, "Pastel", 5.00);
		
		Produto Caldo_de_cana_500ml = new Produto (2, "Caldo_de_cana_500ml", 3.50);
		
		Produto Agua_de_coco = new Produto (3, "Agua_de_coco", 4.00);
		
		novo_carrinho4.adicionaProduto(Pastel);
		novo_carrinho4.adicionaProduto(Caldo_de_cana_500ml);
		novo_carrinho4.adicionaProduto(Agua_de_coco);
		
		Caixa nova_caixa4 = new Caixa();
		
		nova_caixa4.ComDesconto(Pastel, 50);
		
		if(nova_caixa4.CompraTotal(novo_carrinho4) == 10.00) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
Carrinho novo_carrinho5 = new Carrinho();
		
		Produto Pastel = new Produto (1, "Pastel", 5.00);
		
		Produto Caldo_de_cana_500ml = new Produto (2, "Caldo_de_cana_500ml", 3.50);
		
		Produto Agua_de_coco = new Produto (3, "Agua_de_coco", 4.00);
		
		novo_carrinho5.adicionaProduto(Pastel);
		novo_carrinho5.adicionaProduto(Caldo_de_cana_500ml);
		novo_carrinho5.adicionaProduto(Agua_de_coco);
		
		Caixa nova_caixa5 = new Caixa();
		
		nova_caixa5.ComDesconto(Pastel, 50);
		nova_caixa5.ComDesconto(Agua_de_coco, 20);
		
		if(nova_caixa5.CompraTotal(novo_carrinho5) == 9.20) {
			return true;
		}
		
	    return false;
	}

}