package com.qbit.labs.lab4;

import com.qbit.labs.lab4.Entity.Account;
import com.qbit.labs.lab4.Entity.Category;
import com.qbit.labs.lab4.Entity.Transaction;
import com.qbit.labs.lab4.Service.FinancialTrackingSystem;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Process {

        public void app() throws IOException, ParseException {
            String line;
            Main.println("Виберіть що хочете зробити: ");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/com/qbit/labs/lab4/instruction")));
            while ((line = bufferedReader.readLine())!= null) {
                Main.println(line);
            }
            FinancialTrackingSystem financialTrackingSystem = new FinancialTrackingSystem();
            Account account = new Account();
            Category category = new Category();
            Transaction transaction = new Transaction();
            String answer;
            do {
                Main.print("Ваш вибір: ");
                answer = Main.scanner.next();
                switch (answer){
                    case "1":
                        financialTrackingSystem.createAccount();
                        break;
                    case "2":
                        Main.print("Pls input id which u want to delete: ");
                        int id = Main.scanner.nextInt();
                        financialTrackingSystem.deleteAccount(id);
                        break;
                    case "3":
                    financialTrackingSystem.createCategory();
                        break;
                    case "4":
                        Main.print("Pls input id which u want to delete: ");
                        int categoryID = Main.scanner.nextInt();
                        financialTrackingSystem.deleteCategory(categoryID);
                        break;
                    case "5":
                        financialTrackingSystem.recordTransaction();
                        break;
                    case "6":
                        financialTrackingSystem.analyzeTransactionsByCategory();
                        break;
                    case "7":
                        Main.println(financialTrackingSystem.findMostPopularCategory());
                        break;
                    case "8":
                        Main.println(financialTrackingSystem.displaySystemInfo());
                        break;
                    case "9":
                        Main.println(account.displayAccountInfo(financialTrackingSystem));
                        break;
                    case "10":
                        Main.println(category.displayCategoryInfo(financialTrackingSystem));
                        break;
                    case "11":
                        Main.println(transaction.displayTransactionInfo(financialTrackingSystem));
                        break;
                }
            } while(!answer.equalsIgnoreCase("no"));

        }
    }
