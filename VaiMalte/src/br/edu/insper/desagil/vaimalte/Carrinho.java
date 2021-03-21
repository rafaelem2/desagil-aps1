package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> Pedidos;

	public Carrinho() {
		super();
		this.Pedidos = new ArrayList<>();
		
	}

	public List<Pedido> getPedidos() { 
		return this.Pedidos;
	}
	
	public void adicionaProduto(Produto produto) {
		boolean Produtonovo = true;
		for (Pedido pedido: this.Pedidos) {
			if (pedido.getProduto().equals(produto)) {
				pedido.incrementa();
				Produtonovo = false;
			}
		}
		if (Produtonovo) {
			Pedido Pedidonovo = new Pedido(produto);
			this.Pedidos.add(Pedidonovo);
		}
	}
}
