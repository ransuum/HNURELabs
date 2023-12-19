package com.qbit.labs.lab4.Entity;

import com.qbit.labs.lab4.Service.FinancialTrackingSystem;

public class Category {
    private Integer categoryID;
    private String name;
    public String displayCategoryInfo(FinancialTrackingSystem financialTrackingSystem) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Category category : financialTrackingSystem.getCategories()){
            stringBuilder.append("Category ID: ").append(category.getCategoryID()).append(" Category_NAME: ").append(category.getName()).append("\n");
        }
        return stringBuilder.toString();
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
