package th.go.nhso.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import th.go.nhso.nnsplims.config.ApplicationContextConfig;
import th.go.nhso.nnsplims.jpa.dao.ItemDao;
import th.go.nhso.nnsplims.jpa.model.Item;

public class TestItemDao {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ApplicationContextConfig.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
		ItemDao itemDao = ctx.getBean(ItemDao.class);
		List<Item> items = itemDao.findItemByItemName("item");
		items.stream().forEach(System.out::println);
	}

}
