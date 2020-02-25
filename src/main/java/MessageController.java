import model.Message;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MessageController {

    HashMap<User, Message> messages = new HashMap<>();

    public void save(User user, Message message) {

        messages.put(user, message);
    }

    public getMessageForUser()
}
