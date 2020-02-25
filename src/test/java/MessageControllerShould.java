import model.Message;
import model.User;
import org.junit.jupiter.api.Test;

public class MessageControllerShould {

    @Test
    public  void save_comment_when_user_talks(){

        User user = new User("Maria");
        Message message = new Message("ellou");
        MessageController messageController = new MessageController();
        messageController.save(user, message);


    }
}
