import java.util.Scanner;
import java.sql.*;

public class Atm {
    public static void main(String args[]) {
        try {
            // Class.forName("Oracle.jdbc.driver.OracleDriver");
            // Connection con =
            // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYS",
            // "Dkte@123");
            // Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Hey welcome to ATM");
            System.out.println("enter your pin number");
            int pin = sc.nextInt();
            // ResultSet rs = stmt.executeQuery("select * from list where ac_no" + pin);
            String name = "shivraj";
            int count = 0;
            int balance = 0;
            // while (rs.next()) {
            // name = rs.getString(3);
            // balance = rs.getInt(4);
            // count++;
            // }

            int choise;
            int amount = 0;
            int withdraw_amount = 0;
            if (pin == 1111) {
                System.out.println("Hellow" + name);
                while (true) {
                    System.out.println("Press 1 to check balance");
                    System.out.println("Press 2 to add amount");
                    System.out.println("Press 3 to withdraw_amount");
                    System.out.println("Press 4 to recipt");
                    System.out.println("Press 5 to exit");
                    System.out.println();
                    System.out.println("enter choise");
                    choise = sc.nextInt();
                    switch (choise) {
                        case 1:
                            System.out.println("Total balance is:" + balance);
                            break;
                        case 2:
                            System.out.println(" How much amount add");
                            amount = sc.nextInt();
                            balance = balance + amount;
                            // int bal = stmt.executeUpdate("UPDATE list SET balance" + balance + "WHERE
                            // ac_no=" + pin);
                            System.out.println("Succesfully added now current balance" + balance);
                            break;
                        case 3:
                            System.out.println("withdraw amount is:");
                            withdraw_amount = sc.nextInt();
                            if (withdraw_amount > balance) {
                                System.out.println("balance is insufficient");
                            } else {
                                balance = balance - withdraw_amount;
                                // int sub = stmt
                                // .executeUpdate("UPDATE list SET balance" + balance + "WHERE ac_no=" + pin);
                                System.out.println("Succesfully added now current balance" + balance);
                            }
                            break;
                        case 4:
                            System.out.println("Thanks for coming");
                            System.out.println("your current balance:" + balance);
                            System.out.println("amount added is:" + amount);
                            System.out.println(" withdraw amount is:" + withdraw_amount);
                            break;
                    }
                    if (choise == 5) {
                        break;
                    }
                }
            } else {
                System.out.println("wrong pin");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
