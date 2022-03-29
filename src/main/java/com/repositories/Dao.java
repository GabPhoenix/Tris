package com.repositories;

public interface Dao<T> {
	public boolean insert();
	public boolean update();
	public boolean delete();
	public boolean select();
}
