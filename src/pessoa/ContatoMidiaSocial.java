package pessoa;

import java.net.URL;

public class ContatoMidiaSocial {
	
	
	private TipoMidiaSocial provedor;
	private URL endereco;
	public TipoMidiaSocial getProvedor() {
		return provedor;
	}
	public void setProvedor(TipoMidiaSocial provedor) {
		this.provedor = provedor;
	}
	public URL getEndereco() {
		return endereco;
	}
	
	public void setEndereco(URL endereco) {
		this.endereco = endereco;
	}
	
	

}
