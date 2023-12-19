package com.qbit.labs.lab4.Service;

import com.qbit.labs.lab4.Entity.Account;
import com.qbit.labs.lab4.Entity.Categories;
import com.qbit.labs.lab4.Entity.Category;
import com.qbit.labs.lab4.Entity.Transaction;
import com.qbit.labs.lab4.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class FinancialTrackingSystem {
    private List<Account> accountss = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void createAccount() {
        Main.print("Ur remainder: ");
        double remainder = Main.scanner.nextDouble();
        Account account = new Account();
        account.setId(Main.idAcc);
        account.setRemainder(remainder);
        accountss.add(account);
        Main.idAcc++;
        Main.println("Created!");
    }

    public void deleteAccount(int idOfAcc) {
        Account accountToRemove = null;

        for (Account account1 : accountss) {
            if (account1.getId() == idOfAcc) {
                accountToRemove = account1;
                break;
            }
        }
        if (accountToRemove != null) {
            accountss.remove(accountToRemove);
            Main.println("Account with id: " + idOfAcc + " - Completely deleted");
        } else {
            Main.println("Account with this id not found");
        }
    }

    public void createCategory() {
        Main.println("Введіть назву категорії:");
        for (Categories categories1 : Categories.values()){
            Main.println(String.valueOf(categories1));
        }
        String categoryName = Main.scanner.next();
        Category category = new Category();
        category.setName(categoryName);
        category.setCategoryID(Main.categoryID);
        categories.add(category);
        Main.categoryID++;
        Main.println("Created!");
    }

    public void deleteCategory(int categoryID) {
        Category categoryToRemove = null;

        for (Category category : categories) {
            if (category.getCategoryID() == categoryID) {
                categoryToRemove = category;
                break;
            }
        }
        if (categoryToRemove != null) {
            categories.remove(categoryToRemove);
            Main.println("Category with " + categoryID + " id was successfully deleted");
        } else {
            Main.println("There is no Category with this id");
        }
    }

    public void recordTransaction() {
        Transaction transaction = new Transaction();
        Account accountToFound = null;
        Category categoryToFind = null;
        Main.println("Write id and remainder for acc");
        Main.print("id: ");
        int accID = Main.scanner.nextInt();
        Main.print("Reminder: ");
        double remainder = Main.scanner.nextDouble();

        for (Account account : accountss) {
            if (account.getId() == accID && account.getRemainder() == remainder) {
                accountToFound = account;
            }
        }
        Main.println("Write id and name fo Category");
        Main.print("id: ");
        int categoryID = Main.scanner.nextInt();
        Main.print("Category name: ");
        String categoryName = Main.scanner.next();
        for (Category category : categories) {
            if (category.getCategoryID() == categoryID && category.getName().equals(categoryName)) {
                categoryToFind = category;
                break;
            }
        }
        if (categoryToFind != null && accountToFound != null) {
            Main.println("Category and Acc was found");
            Main.print("Input ur sum of transaction: ");
            double sum = Main.scanner.nextDouble();
            if (remainder - sum < 0) {
                Main.println("У Вас рахунок йде в мінус, тому транзакцію не записано");
            } else {
                accountToFound.setRemainder(remainder - sum);
                transaction.setCategory(categoryToFind.getName());
                transaction.setSumOfTrans(sum);
                transaction.setTransactionID(Main.transactionID);
                transaction.setDescr("Transaction for account with {remainder = " + accountToFound.getRemainder() + "} {id = " + accountToFound.getId() + "}");
                transaction.setTimeStamp(new Date());
                transactions.add(transaction);
                Main.transactionID++;
                Main.println("CREATED!");
            }
        }
    }

    public void analyzeTransactionsByCategory() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Main.print("Input category name to find: ");
        String name = Main.scanner.next();
        List<Transaction> transactions1 = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getCategory().equals(name)) {
                transactions1.add(transaction);
            }
        }
        if (!transactions1.isEmpty()) {
            Main.print("Введите начальную дату в формате yyyy-MM-dd:");
            Date startDate = dateFormat.parse(Main.scanner.next());

            Main.print("Введите конечную дату в формате yyyy-MM-dd:");
            Date endDate = dateFormat.parse(Main.scanner.next());

            List<Transaction> transactionsByDates = new ArrayList<>();
            for (Transaction transaction : transactions1) {
                if (transaction.getTimestamp().after(startDate) && transaction.getTimestamp().before(endDate)) {
                    transactionsByDates.add(transaction);
                }
            }
            if (transactionsByDates.isEmpty()) {
                Main.println("There is no transaction between these dates.....");
            } else {
                transactionsByDates.sort(Comparator.comparing(Transaction::getTimestamp));
                Main.println("Transaction from " + startDate + " to " + endDate + ":");
                for (Transaction transaction : transactionsByDates) {
                    System.out.println("Transaction_ID:" + transaction.getTransactionID() + "; Sum of trans:" + transaction.getSumOfTrans()
                            + "; Description:" + transaction.getDescr() + "; Category_NAME:" + transaction.getCategory() + "; DATE: " + transaction.getTimestamp());
                }
            }
        } else {
            Main.println("We can't found transaction with this name.....");
        }
    }

    public String findMostPopularCategory() throws ParseException {
        int countKYIVS = 0;
        int countDATA_GROUP_INTERNET = 0;
        int countFOOD = 0;
        int countSHOP = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Main.print("Введите начальную дату в формате yyyy-MM-dd:");
        Date startDate = dateFormat.parse(Main.scanner.next());

        Main.print("Введите конечную дату в формате yyyy-MM-dd:");
        Date endDate = dateFormat.parse(Main.scanner.next());

        List<Transaction> transactionsByDates = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getTimestamp().after(startDate) && transaction.getTimestamp().before(endDate)) {
                transactionsByDates.add(transaction);
            }
        }
        if (transactionsByDates.isEmpty()) {
            Main.println("There is no transaction between these dates.....");
        } else {
            transactionsByDates.sort(Comparator.comparing(Transaction::getTimestamp));
            Main.println("Transaction from " + startDate + " to " + endDate + ":");
            for (Transaction transaction : transactionsByDates) {
                System.out.println("Transaction_ID:" + transaction.getTransactionID() + "; Sum of trans:" + transaction.getSumOfTrans()
                        + "; Description:" + transaction.getDescr() + "; Category_NAME:" + transaction.getCategory() + "; DATE: " + transaction.getTimestamp());
            }
        }
        List<Transaction> transactionsByNameOfCategory = new ArrayList<>();
        for (Transaction transaction: transactionsByDates){
            if (transaction.getCategory().equals(Categories.KYIVSTAR_INTERNET.toString())){
                countKYIVS++;
            }
            if (transaction.getCategory().equals(Categories.DATA_GROUP_INTERNET.toString())){
                countDATA_GROUP_INTERNET++;
            }
            if (transaction.getCategory().equals(Categories.FOOD.toString())){
                countFOOD++;
            }
            if (transaction.getCategory().equals(Categories.SHOP.toString())){
                countSHOP++;
            }
        }

        if (countKYIVS > countDATA_GROUP_INTERNET && countKYIVS > countFOOD && countKYIVS > countSHOP){
            for (Transaction transaction : transactionsByDates){
                if (transaction.getCategory().equals(Categories.KYIVSTAR_INTERNET.toString())){
                    transactionsByNameOfCategory.add(transaction);
                }
            }
        }
        if (countDATA_GROUP_INTERNET > countKYIVS && countDATA_GROUP_INTERNET > countFOOD && countDATA_GROUP_INTERNET > countSHOP){
            for (Transaction transaction : transactionsByDates){
                if (transaction.getCategory().equals(Categories.DATA_GROUP_INTERNET.toString())){
                    transactionsByNameOfCategory.add(transaction);
                }
            }
        }
        if (countFOOD > countKYIVS && countFOOD > countDATA_GROUP_INTERNET && countFOOD > countSHOP){
            for (Transaction transaction : transactionsByDates){
                if (transaction.getCategory().equals(Categories.FOOD.toString())){
                    transactionsByNameOfCategory.add(transaction);
                }
            }
        }
        if (countSHOP > countKYIVS && countSHOP > countDATA_GROUP_INTERNET && countSHOP > countFOOD){
            for (Transaction transaction : transactionsByDates){
                if (transaction.getCategory().equals(Categories.SHOP.toString())){
                    transactionsByNameOfCategory.add(transaction);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Transaction transaction : transactionsByNameOfCategory){
            stringBuilder.append("transactionID:").append(transaction.getTransactionID()).append(" Sum:").append(transaction.getSumOfTrans()).append(" Description: ")
                    .append(transaction.getDescr()).append(" {Category name = ").append(transaction.getCategory())
                    .append("}").append(" {Time of creation: ").append(transaction.getTimestamp()).append("}").append("\n");
        }
        return stringBuilder.toString();
    }

    public void displaySystemInfo(FinancialTrackingSystem financialTrackingSystem){
        Account account = new Account();
        Main.println("Account INFO:");
        account.displayAccountInfo(financialTrackingSystem);
        Category category = new Category();
        Main.println("Category INFO:");
        category.displayCategoryInfo(financialTrackingSystem);
        Transaction transaction = new Transaction();
        Main.println("Transaction INFO:");
        transaction.displayTransactionInfo(financialTrackingSystem);
    }
    public List<Account> getAccounts() {
        return accountss;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
