/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author GoldCandy
 */
public interface IShapeCalculateRepository {

    void Circle(Circle circle);

    void Rectangle(Rectangle rectangle);

    void Triangle(Triangle triangle);
    
}
