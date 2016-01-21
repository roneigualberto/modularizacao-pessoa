package pessoa;

import java.util.Date;

public class Documento {

	private TipoDocumento tipoDocumento;
	private String numero;
	private Date dataExpedicao;
	private Orgao orgaoEmissor;
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDataExpedicao() {
		return dataExpedicao;
	}
	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	public Orgao getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(Orgao orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	
	
	
	
	
}
