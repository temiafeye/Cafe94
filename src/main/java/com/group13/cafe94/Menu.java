package com.group13.cafe94;

import java.util.ArrayList;


public class Menu{
    private String[] menuItems;
    private ArrayList<String> specialMenuItems;
    
    public Menu(String[] menuItems, ArrayList<String> specialMenuItems) {
        this.menuItems = menuItems;
        this.specialMenuItems = specialMenuItems;
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<String> getSpecialMenuItems() {
        return specialMenuItems;
    }

    public void setSpecialMenuItems(ArrayList<String> specialMenuItems) {
        this.specialMenuItems = specialMenuItems;
    }


    
}