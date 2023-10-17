/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import model.*;
import repository.ShapeCalculateRepository;

/**
 *
 * @author GoldCandy
 */
public class ShapeCalculateController extends Menu {

    protected static String[] mc = {"Rectangle", "Circle",
        "Triangle", "Exit"};
    protected Shape shape;
    protected ShapeCalculateRepository repo;

    public ShapeCalculateController() {
        super("=====Calculator Shape Program=====", mc);
        repo = new ShapeCalculateRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("-----Rectangle-----");
                shape = new Rectangle();
                repo.Rectangle((Rectangle) shape);
                break;
            }
            case 2: {
                System.out.println("-----Circle-----");
                shape = new Circle();
                repo.Circle((Circle) shape);
                break;
            }
            case 3: {
                System.out.println("-----Triangle-----");
                shape = new Triangle();
                repo.Triangle((Triangle) shape);
                break;
            }
            case 4: {
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice!");
            }
        }
    }
}
