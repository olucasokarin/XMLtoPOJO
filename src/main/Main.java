package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import vo.Endereco;
import vo.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2xml();
		xml2class();

	}
	
	private static void xml2class() {
		
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Pessoa.class);

			Marshaller marshaller = context.createMarshaller();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Pessoa pessoa = (Pessoa) unmarshaller.unmarshal(new File("resource/pessoa.xml"));
			
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getEndereco().getCidade());
			
		}catch (JAXBException e) { }

	}

	public static void class2xml() {

		Endereco endereco = new Endereco("Centro", "Rio de Janeiro");
		Pessoa pessoa = new Pessoa("Marco Maciel", "M", 34, endereco);
				
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Pessoa.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(pessoa, System.out);
			marshaller.marshal(pessoa, new File("resource/pessoa.xml"));
			
			
		} catch (JAXBException e) {  e.printStackTrace();
		}
		
		
	}

}
