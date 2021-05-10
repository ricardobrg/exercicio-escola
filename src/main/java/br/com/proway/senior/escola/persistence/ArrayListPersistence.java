package br.com.proway.senior.escola.persistence;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Prova;

abstract public class ArrayListPersistence<T> {
	
	ArrayList<T> dados;
	
	abstract boolean removeAll();
	
	abstract boolean remove(Integer indexItem);
	
	abstract T add(T item);
	
	abstract T get(Integer index);
	
	abstract ArrayList<T> getAll();

}
