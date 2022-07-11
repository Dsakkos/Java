import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // return "Hello, " + name + ". Lovely to see you.";
        return String.format("Hello %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        // Date date = new Date();
        // return "It is currently " + date;
        return String.format("It is currently %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // String message = conversation;
        // if (message.contains("Alexis")) {
        // return "Right away, sir.She certainly isn't sophisticated enough for that";
        // }
        // else if(message.contains("Alfred")){
        // return "At your service. As you wish, naturally";
        // }
        // else {
        // return "Right.And with that I shall Retire";
        if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir.She certainly isn't sophisticated enough for that";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally";
        }
        return "Right.And with that I shall Retire";
        }
    }
