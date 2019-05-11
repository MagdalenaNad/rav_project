package pl.sda.rav;

import pl.sda.rav.users.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Comparable<User> {

    private List<User> users = new ArrayList<>();

    public void addUser (User user){
        users.add(user);
                // dodanie użytkownika
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }


    //Stwórz klasę do przechowywania i aktualizacji użytkowników: UsersDao.
    //Dodaj możliwość sortowania “naturalnego” dla użytkowników: użytkownicy powinni być sortowani po loginie malejąco
    //Dodaj metody do pobierania wszystkich użytkowników - posortowanych
    //Dodaj metodę do dodawania użytkownika. Metoda powinna uniemożliwić dodanie duplikatu do bazy!
    //Dodaj metodę do wyszukania usera po loginie i haśle.
           // * Dodaj metodę do usuwania użytkownika po id. Jeżeli użytkownik o podanym id nie istnieje metoda powinna zwrócić false, w przeciwnym wypadku true.
           // * Dodaj logowanie zdarzeń w klasie
    //Dodaj testy do metod klasy



}

