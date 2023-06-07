import problems.CanPlaceFlowers;

public class Main {
    public static void main(String[] args) {

        CanPlaceFlowers problem = new CanPlaceFlowers();

        int[] flowerbed = new int[] {1,0,0,0,1};
        int n = 1;
        System.out.println("Problem 1: " + problem.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[] {1,0,0,0,1};
        n = 2;
        System.out.println("Problem 2: " + problem.canPlaceFlowers(flowerbed, n));
    }
}
