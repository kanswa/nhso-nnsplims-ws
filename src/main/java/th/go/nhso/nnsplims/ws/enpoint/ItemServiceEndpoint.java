package th.go.nhso.nnsplims.ws.enpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import th.go.nhso.nnsplims.jpa.dao.ItemDao;
import th.go.nhso.nnsplims.ws.enpoint.model.FindItemByNameRequest;
import th.go.nhso.nnsplims.ws.enpoint.model.FindItemByNameResponse;

@Endpoint
public class ItemServiceEndpoint {
	
	private static final String NAMESPACE_URI = "http://nhso.go.th/item-web-service";

	private ItemDao itemDao;

	@Autowired
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "findItemByNameRequest")
	@ResponsePayload
	public FindItemByNameResponse findItemByName(@RequestPayload FindItemByNameRequest request) {
		FindItemByNameResponse f = new FindItemByNameResponse();
		f.setItemList(itemDao.findItemByItemName(request.getItemName()));
		return f;
	}

}
