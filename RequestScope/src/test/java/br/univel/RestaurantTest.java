package br.univel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    private static final String TOMATE_SOPA = "Sopa de Tomate";
    private static final String BATATA_SOPA = "Sopa de batata";
    private EJBContainer container;

    @EJB
    private Garcom jose;

    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }

    @Test
    public void orderSoup() {
        String soup = jose.orderSopa(TOMATE_SOPA);
        assertEquals(TOMATE_SOPA, soup);
        soup = jose.orderSopa(BATATA_SOPA);
        assertEquals(BATATA_SOPA, soup);
    }

    @After
    public void closeContainer() throws Exception {
        container.close();
    }
}
