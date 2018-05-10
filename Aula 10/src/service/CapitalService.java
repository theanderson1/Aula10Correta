package service;

import java.io.IOException;
import java.util.ArrayList;

import model.Pais;
import dao.PaisDao;

public class CapitalService {
	PaisDao dao;
	
	public CapitalService(){
		dao = new PaisDao();
	}
	public ArrayList<Pais> listarPaises() throws IOException {
		return dao.listarPaises();
	}
	public ArrayList<Pais> listarPaises(String chave) throws IOException {
		return dao.listarPaises(chave);
	}

}
