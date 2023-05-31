
# SI_2023_lab2_201072
Marko Srbakov, 201072

# CFW (слика)

![MarkoLab2](https://github.com/markosrbakov/SI_2023_lab2_201072/assets/85948841/a89cf1bd-ed3a-4129-8317-51fb52a7643a)


# цикломатската комплексност
Бројот на реѓиони на графот е вкупно 10 па плус 1 надворешната збирот е 11
Цикломатската комплексност на графот е 11.

# JUnit Tests
    @Test
    public void FirtTest() {
        User user = null;
        List<User> allUsers = new ArrayList<>();
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });
        Assertions.assertEquals("Mandatory information missing!", exception.getMessage());
    }
    // Со овој Прв тест фрламе исклучок и тестираме дали успешно ќе помине
    @Test
    public void SecondTest() {
        User user = null;
        List<User> allUsers = new ArrayList<>();
        String e_maill = "srbakovmarko@gmail.com";
        String pass = "Marko123";
        User user = new User(null, pass, e_mail);
        allUsers.add(user1);
        assertEquals(false, SILab2.function(user, allUsersusers));
    }
    // со овој тест ѓи изминуваме поголем дел од патеките само мал дел не се поминати
    @Test
    public void ThirtTest(){
        List<User> allUsers = new ArrayList<>();
        String e_mail = "stevoyahoo.com";
        String user= "Stevo";
        String pass = "12ccc345@.! A";
        User user = new User(user, pass, e_mail3);
        allUsers.add(user);
        assertFalse(SILab2.function(user, allUsers));
} // со овој тест ѓи поминуваме 4 во 6 , 7 во 15 и 19 во 23


СЕКОЈА БРОЈКА ШТО ОЗНАЧУВА МОЖЕ ДА ВИДИМЕ ВО КЛАСАТА SILab2
