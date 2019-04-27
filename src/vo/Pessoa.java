package vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa {
	
	@XmlElement(name = "Nome")
	private String nome;
	@XmlElement(name = "Sexo")
	private String sexo;
	@XmlElement(name = "Idade")
	private int idade;
	@XmlElement(name = "Endereco")
	private Endereco endereco;
	
	public Pessoa() { }

	public Pessoa(String nome, String sexo, int idade, Endereco endereco) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
