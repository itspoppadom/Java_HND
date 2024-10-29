import java.time.LocalDateTime;
public class ATM  {
    public boolean sessionStatus;

    public ATM() {
        this.sessionStatus = sessionStatus;

    }


    public void boolean session( boolean sessionStatus ) {
        if (!sessionStatus) {
            return Boolean.parseBoolean("Please enter your card. \n Current time: " + LocalDateTime.now());
        } else {
            return Boolean.parseBoolean("Please wait, retrieving your information from the bank \n Current time: " + LocalDateTime.now());
        }


    }
    public boolean getSessionStatus() {
        return sessionStatus;
    }


}
