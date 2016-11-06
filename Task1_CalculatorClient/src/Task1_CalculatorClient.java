import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_CalculatorClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputChoice = "";

        while (!inputChoice.equals("END")) {
            String input = scan.nextLine();
            Pattern ps = Pattern.compile("[a-zA-Z]+\\.?");
            Matcher ms = ps.matcher(input);
            Pattern p = Pattern.compile("(\\d+(?:\\.\\d+)?)");
            Matcher m = p.matcher(input);
            List<Double> list = new ArrayList<Double>();
            while (ms.find()) {
                inputChoice += ms.group();
            }
            while (m.find()) {

                list.add(Double.parseDouble(m.group()));

            }

            switch (inputChoice) {
                case "SUM":
                    System.out.printf("%.3f", Calculator.sum(list.get(0), list.get(1)));
                    inputChoice = "";
                    break;
                case "SUB":
                    System.out.printf("%.3f", Calculator.substract(list.get(0), list.get(1)));
                    inputChoice = "";
                    break;
                case "MUL":
                    System.out.printf("%.3f", Calculator.multiply(list.get(0), list.get(1)));
                    inputChoice = "";
                    break;
                case "DIV":
                    System.out.printf("%.3f", Calculator.divide(list.get(0), list.get(1)));
                    inputChoice = "";
                    break;
                case "PER":
                    System.out.printf("%.3f", Calculator.percentage(list.get(0), list.get(1)));
                    inputChoice = "";
                    break;

            }

        }
    }
}