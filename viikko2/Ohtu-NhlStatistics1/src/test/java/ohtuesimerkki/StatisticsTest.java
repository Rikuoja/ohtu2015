package ohtuesimerkki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StatisticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() { stats = new Statistics(readerStub); }

    @Test
    public void playerFound() {
        assertEquals("Semenko", stats.search("Semenko").getName());
    }

    @Test
    public void inexistentPlayerNotFound() {
        assertEquals(null, stats.search("Klimenko"));
    }

    @Test
    public void teamHasTheRightNumberOfPlayers() {
        assertEquals(3, stats.team("EDM").size());
    }

    @Test
    public void teamHasTheRightTopScorer() {
        assertEquals("Gretzky", stats.topScorers(3).get(0).getName());
    }

}