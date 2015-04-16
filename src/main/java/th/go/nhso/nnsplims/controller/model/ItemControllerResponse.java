package th.go.nhso.nnsplims.controller.model;

import java.util.List;

import th.go.nhso.nnsplims.jpa.model.Item;

public class ItemControllerResponse {

	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
