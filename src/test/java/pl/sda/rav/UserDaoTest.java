package pl.sda.rav;

import pl.sda.rav.users.UserDao;

class UserDaoTest {

    void ShouldReturnSortedList() {

        //given

        UserDao userDao = new UserDao;
        userDao.addUser("Roman","wwww", UserType.CLIENT);
        userDao.addUser("Stefan","wwww", UserType.CLIENT);
        userDao.addUser("Ula","wwww", UserType.CLIENT);
        userDao.addUser("Piotr","wwww", UserType.CLIENT);

        //when
        List<users>

        //then
    }
}