package com.codegym.utils;

import com.codegym.model.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    String key;
    public ProductComparator(String key){
        this.key = key;
    }
    @Override
    public int compare(Product o1, Product o2) {
        switch (key) {
            case "name":
                return o1.getName().compareTo(o2.getName());
            case "id":
                return Long.compare(o1.getId(), o2.getId());
            case "createAt":
                return o1.getCreateAt().compareTo(o2.getCreateAt());
            case "eCategory":
                return o1.geteCategory().compareTo(o2.geteCategory());
            default:
                return Float.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
