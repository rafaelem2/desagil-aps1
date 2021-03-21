package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;

	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void ComDesconto(Produto produto, int desconto) {
		if ((desconto >= 1) && (desconto <= 99)) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double CompraTotal(Carrinho carrinho) {
		double valortotal = 0.0;
		for (Pedido pedido: carrinho.getPedidos()) {
			if (this.descontos.containsKey(pedido.getProduto().getCodigo())) {
				double desconto = descontos.get(pedido.getProduto().getCodigo());
				valortotal = valortotal + ((pedido.getProduto().getPreco() * pedido.getQuantidade()) * (desconto/100));
			}
			else {
				valortotal = valortotal + pedido.precoPedido();
			}
		}
		return valortotal;
	}
	
}