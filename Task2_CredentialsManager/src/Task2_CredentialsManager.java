 import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_CredentialsManager {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Credentials[] crData = new Credentials[200];
        String inputChoice = "";
        int count = 0;
        while (!inputChoice.equals("END")) {
            String input = scan.nextLine();
            //Pattern ps = Pattern.compile("[a-zA-Z]+\\.?");
            //Matcher ms = ps.matcher(input);
            Pattern p = Pattern.compile("[^\\s]+");
            Matcher m = p.matcher(input);
            //List<String> list = new ArrayList<String>();
            String[] list = input.split(" ");

            //while (m.find()) {				 	 
            //		list.add(m.group());					    
            //}
            inputChoice += list[0];
            switch (inputChoice) {
                case "ENROLL": {
                    boolean success = false;
                    if (count == 0) {
                        success = true;
                    } else if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            if (!crData[i].getUsername().equals(list[1])) {
                                success = true;
                            }
                        }
                    }
                    if (success) {
                        Credentials cr1 = new Credentials(list[1], list[2]);
                        crData[count] = cr1;
                        count++;
                        System.out.println("ENROLL success");
                    } else {
                        System.out.println("ENROLL fail");
                    }
                    inputChoice = "";
                    break;
                }
                case "CHPASS": {
                    for (int i = 0; i < count; i++) {
                        if (list[1].equals(crData[i].getUsername())) {
                            crData[i].changePassword(list[2], list[3]);
                            System.out.println("CHPASS success");
                        } else {
                            System.out.println("CHPASS fail");
                        }

                    }
                    inputChoice = "";
                    break;
                }
                case "AUTH": {

                    for (int i = 0; i < count; i++) {
                        if (list[1].equals(crData[i].getUsername())) {
                            if (list[2].equals(crData[i].getPassword())) {
                                System.out.println("AUTH success");
                            }
                        } else {
                            System.out.println("AUTH fail");
                        }
                    }
                    inputChoice = "";
                    break;
                }
            }
        }
    }

}
