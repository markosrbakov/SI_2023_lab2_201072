import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class SILab2Test {

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
}
