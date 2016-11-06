public class Credentials {

    private String username;
    private String password;
    private String[] passwords = new String[100];
    private int count = 0;

    Credentials(String username, String password) {
        this.username = username;
        this.password = password;
        passwords[count] = password;
        count++;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        passwords[count] = password;
        count++;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            for (int i = 0; i < count; i++) {
                if (!passwords[i].equals(newPassword)) {
                    this.password = newPassword;
                }

            }
            passwords[count] = newPassword;
            count++;

        }

    }
}