package pl.sda.rav.users;

import java.util.ArrayList;

public class UserDao implements User {

    private ArrayList<User> users = new ArrayList<>();

    public void addUser (User user){
        users.add(user)
                // dodanie użytkownika
    }

  public void compareTo (users login){

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

