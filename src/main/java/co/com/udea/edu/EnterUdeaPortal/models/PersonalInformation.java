package co.com.udea.edu.EnterUdeaPortal.models;

public class PersonalInformation {
    private String userName;
    private String password;
    private String timeSeconds;

    public PersonalInformation(String userName, String password, String timeSeconds) {
        this.userName = userName;
        this.password = password;
        this.timeSeconds = timeSeconds;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTimeSeconds() {
        return timeSeconds;
    }

    public void setTimeSeconds(String timeSeconds) {
        this.timeSeconds = timeSeconds;
    }
}
