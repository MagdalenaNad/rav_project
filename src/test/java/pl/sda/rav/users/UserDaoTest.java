package pl.sda.rav.users;

import pl.sda.rav.users.UserDao;

import java.util.ArrayList;
import java.util.List;

class UserDaoTest {

    void ShouldReturnSortedList() {

        //given

        UserDao userDao = new UserDao();
        userDao.addUser(new User("Roman","wwww", UserType.CLIENT));
        userDao.addUser(new User("Stefan","wwww", UserType.CLIENT));
        userDao.addUser(new User("Ula","wwww", UserType.CLIENT));
        userDao.addUser(new User("Piotr","wwww", UserType.CLIENT));

        //when
        List<User> list = new ArrayList<>();

        //then
    }
}