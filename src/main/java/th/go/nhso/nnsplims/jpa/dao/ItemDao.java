package th.go.nhso.nnsplims.jpa.dao;

import java.util.List;

import th.go.nhso.nnsplims.jpa.model.Item;

public interface ItemDao {

	public List<Item> findItemByItemName(String itemName);
	
}
