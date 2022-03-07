package week3.day2;

public interface HousePlan {
int numberOfBedRooms = 3;
public String houseName = "X Villa";
/**
 * This method helps the customer to build a wall within the given dim
 * using brick, cement and other required products.
 * The process can build 100 Sq ft of wall per day with 3 labours inc
 * @param - dimensions - The dimensions for building the wall can
 * be passed as an arg
 * @author - Praveen Kumar
 */
public void buildWalls(int dimensions) ;
public void buildPillars() ;

}
