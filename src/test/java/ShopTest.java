import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Piano piano;
    Piano piano2;
    Guitar guitar;
    Guitar guitar2;
    SheetMusic music;

    @Before
    public void before() {
        shop = new Shop(100.00);
        piano = new Piano(500.00, 400.00, "Black", "Wood", 60, "Upright");
        piano2 = new Piano(1500.00, 1100.00, "Black", "Wood", 88, "Grand");
        guitar = new Guitar(400.00, 250.00, "Brown", "Spruce", 12, AmplificationMethod.ACOUSTIC);
        guitar2 = new Guitar(750.00, 500.00, "Grey", "Mahogany", 6, AmplificationMethod.ELECTRIC);
        music = new SheetMusic(10.00, 7.50, "Prelude & Fugue in A Minor", "J.S. Bach");
        shop.addToStock(piano);
        shop.addToStock(piano2);
        shop.addToStock(guitar);
        shop.addToStock(guitar2);
    }

    @Test
    public void shopHasStock() {
        assertEquals(4, shop.getStock().size());
    }

    @Test
    public void instrumentsCanBePlayed() {
        assertEquals("guitar noises", guitar.play());
        assertEquals("piano noises", piano.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(150.00, guitar.calculateMarkup(), 0.1);
        assertEquals(400.00, piano2.calculateMarkup(), 0.1);
    }

    @Test
    public void canSellInstrument() {
        shop.sell(guitar);
        assertEquals(3, shop.getStock().size());
        assertEquals(400.00, shop.getRevenue(), 0.1);
    }

    @Test
    public void canSellSheetMusic() {
        shop.addToStock(music);
        shop.sell(music);
        assertEquals(10.00, shop.getRevenue(), 0.1);
    }
}
