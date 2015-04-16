package th.go.nhso.nnsplims.jpa.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.go.nhso.nnsplims.jpa.dao.ItemDao;
import th.go.nhso.nnsplims.jpa.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Item> findItemByItemName(String itemName) {

		@SuppressWarnings("unchecked")
		List<Item> itemList = sessionFactory.getCurrentSession()
				.createQuery("from Item where itemName LIKE '%" + itemName + "%'")
				.list();
		
		return itemList;
	}
}
