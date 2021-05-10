package br.com.proway.senior.escola.persistence;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Prova;

public class ArrayListPersistenceProva extends ArrayListPersistence<Prova>{
	
	public ArrayList<Prova> dados = new ArrayList<Prova>();

	@Override
	public boolean removeAll() {
		try{
			dados.clear();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean remove(Integer indexProva) {
		try{
			dados.remove((int) indexProva);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public Prova add(Prova item) {
		try{
			Integer id = dados.size();
			item.setId(id);
			dados.add(item);
			return item;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;		
	}

	@Override
	public Prova get(Integer indexItem) {
		try{
			return dados.get(indexItem);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;		
	}

	@Override
	public ArrayList<Prova> getAll() {
		try{
			return dados;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;	
	}
}