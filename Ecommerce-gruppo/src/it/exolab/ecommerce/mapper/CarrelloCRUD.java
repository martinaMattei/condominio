package it.exolab.ecommerce.mapper;

import java.util.List;

import it.exolab.ecommerce.model.Carrello;
import it.exolab.ecommerce.model.Prodotto;

public class CarrelloCRUD {

	public void insert(Carrello carrello) {
		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		mapper.insert(carrello);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Carrello carrello) {
		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		mapper.update(carrello);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void deleteFromCarrello(int id) {

		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		mapper.deleteFromCarrello(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void deleteFromCarrellobyCookie(String cookie) {

		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		mapper.deleteFromCarrellobyCookie(cookie);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Prodotto> findProdotto(String cookie) {
		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		List<Prodotto> ret = mapper.findProdotto(cookie);

		SqlMapFactory.instance().closeSession();

		return ret;
	}

	public List<Carrello> findAll(String valoreCookie) {
		SqlMapFactory.instance().openSession();

		CarrelloMapper mapper = SqlMapFactory.instance().getMapper(CarrelloMapper.class);

		List<Carrello> ret = mapper.findAll(valoreCookie);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
