package week3.day2;

public class AccessMyHouse {
public static void main(String[] args) {
	MyHouse house = new MyHouse();
	house.buildPillars();
	house.buildWalls(100);
	house.buildTerraceGarden();
	
	HousePlan planObject = new MyHouse();
	planObject.buildPillars();
	planObject.buildWalls(100);
}
}
