package br.com.proway.senior.escola.persistence;

import java.util.ArrayList;

abstract public class ArrayListPersistence<T> {
	
	ArrayList<ArrayList<T>> dados;
	
	abstract boolean removeAll(Integer indexParent);
	
	abstract boolean remove(Integer indexParent, Integer indexItem);
	
	abstract Integer add(Integer indexParent, T item);
	
	abstract T get(Integer indexParent, Integer index);
	
	abstract ArrayList<T> getAll(Integer indexParent);

}
