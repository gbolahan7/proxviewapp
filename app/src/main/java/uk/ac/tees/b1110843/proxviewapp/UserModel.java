package uk.ac.tees.b1110843.proxviewapp;

public class UserModel {
    String email, username, image;
    boolean isNotificationEnable;

    public UserModel() {

    }

    public UserModel( String email, String username, boolean isNotificationEnable) {
        this.email = email;
        this.username = username;
        this.isNotificationEnable = isNotificationEnable;
//        this.image = image;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
//
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isNotificationEnable() {
        return isNotificationEnable;
    }

    public void setNotificationEnable(boolean notificationEnable) {
        isNotificationEnable = notificationEnable;
    }
}