package pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {

	private Long id;
	private String nome;
	private Sexo sexo;
	private Date dataNascimento;
	private EstadoCivil estadoCivil;
	
	
	private List<Documento> documentos = new ArrayList<>();
	private Nacionalidade nacionalidade;
	private Naturalidade naturalidade;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Naturalidade getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(Naturalidade naturalidade) {
		this.naturalidade = naturalidade;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
}
