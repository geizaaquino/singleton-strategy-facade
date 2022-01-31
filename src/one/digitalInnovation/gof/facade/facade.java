package one.digitalInnovation.gof.facade;

import subsistema.crm.CrmService;
import subsistema2.cep.CepApi;

public class facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperCidade(cep);
		String estado = CepApi.getInstancia().recuperEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
