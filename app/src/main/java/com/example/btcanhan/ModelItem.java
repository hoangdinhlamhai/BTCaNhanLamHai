package com.example.btcanhan;

public class ModelItem {
    private String name;        // Tên ảnh
    private String description; // Mô tả

    public ModelItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
