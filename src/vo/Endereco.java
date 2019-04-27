package vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {

	@XmlElement(name = "Bairro")
	private String bairro;
	@XmlElement(name = "Cidade")
	private String cidade;
	
	public Endereco() { }
	
	public Endereco(String bairro, String cidade) {
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

	
}
