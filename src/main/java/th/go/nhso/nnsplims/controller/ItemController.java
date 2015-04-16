package th.go.nhso.nnsplims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.go.nhso.nnsplims.controller.model.ItemControllerResponse;
import th.go.nhso.nnsplims.jpa.dao.ItemDao;

@RestController
public class ItemController {
	
	@Autowired
    private ItemDao itemDao;
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@RequestMapping("/item")
	public ItemControllerResponse item(@RequestParam(value="name")String name) {
		ItemControllerResponse resp = new ItemControllerResponse();
		resp.setItems(itemDao.findItemByItemName(name));
		return resp;
	}
}
