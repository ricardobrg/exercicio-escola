package br.com.proway.senior.escola.persistence;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Prova;

public class ArrayListPersistenceProva extends ArrayListPersistence<Prova>{
	
	public ArrayList<ArrayList<Prova>> dados = new ArrayList<ArrayList<Prova>>();

	@Override
	public boolean removeAll(Integer indexBoletim) {
		try{
			ArrayList<Prova> boletim = dados.get(indexBoletim);
			boletim = new ArrayList<Prova>();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean remove(Integer indexBoletim, Integer indexProva) {
		try{
			dados.get(indexBoletim).remove(indexProva);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public Integer add(Integer indexBoletim, Prova item) {
		try{
			dados.get(indexBoletim).add(item);
			return dados.size() - 1;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;		
	}

	@Override
	public Prova get(Integer indexBoletim, Integer indexItem) {
		try{
			return dados.get(indexBoletim).get(indexItem);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;		
	}

	@Override
	public ArrayList<Prova> getAll(Integer indexBoletim) {
		try{
			return dados.get(indexBoletim);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;	
	}
}