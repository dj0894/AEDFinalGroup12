package main;

import dao.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SearchSort extends SearchSortAbstract{
    private JPanel mainDisplayPanel;
    private JPanel filterPanel;
    private JPanel vehicleDisplayPanel;
    private JPanel sortPanel;


    @Override
    JPanel getMainDisplayPanel() {

        // init panel


        mainDisplayPanel = new JPanel(new GridLayout(3,1));

        // add Component to mailDisplayPanel;
        mainDisplayPanel.add(getFilterPanel());
        mainDisplayPanel.add(getSortPanel());
        mainDisplayPanel.add(getVehicleDisplayPanel());

        return mainDisplayPanel;
    }
    private JPanel getFilterPanel() {
        //code for UI for filterPanel  ie filters for searching
        filterPanel=new JPanel();
        filterPanel.setBackground(Color.red);
        filterPanel.add(new JLabel("create filter components"));

        return filterPanel;
    }

    private JPanel getSortPanel() {
        //UI for sorting Panel for sorting the result on the basis on certain criterias
        sortPanel=new JPanel();
        sortPanel.setSize(600,200);
        sortPanel.add(new Label("sorting ui components should be here"));
        sortPanel.setBackground(Color.white);
        return sortPanel;
    }

    private JPanel getVehicleDisplayPanel() {

        vehicleDisplayPanel=new JPanel(new GridLayout(5,5));
        vehicleDisplayPanel.setBackground(Color.yellow);
        vehicleDisplayPanel.add(new Label("vehical should be displayed here"));
        //code for UI for VehicalPanel;
        return vehicleDisplayPanel;
    }



    public static void main(String[] args) {
        SearchSort searchSortObj=new SearchSort();
        System.out.println("AppUI main starting...");
    }


}
