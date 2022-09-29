package ru.netology.Mokito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void threePosterFilms() {

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyPosterFilms(){
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldLastFilms() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] actual = manager.findLast();
        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6"

        };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void defaultFindLastPosterTest() {

        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3"

        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastPosterLessThanLimit() {
        Manager manager = new Manager(7);


        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");


        String[] expected = {
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"


        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
