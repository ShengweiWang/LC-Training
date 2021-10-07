package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 4:13, flexible
 */
public class Solution1603 {
    int[] spaces;

    public Solution1603(int big, int medium, int small) {
        spaces = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (spaces[carType - 1] > 0) {
            spaces[carType - 1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
