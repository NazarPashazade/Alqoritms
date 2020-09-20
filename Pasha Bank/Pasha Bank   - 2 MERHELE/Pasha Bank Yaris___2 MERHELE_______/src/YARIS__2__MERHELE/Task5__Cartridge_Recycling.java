package YARIS__2__MERHELE;

public class Task5__Cartridge_Recycling {

    public static void main(String[] args) {

////////////////////------------- EXAMPLE           --7--
//        int cartridges = 10;
//        int dollars = 10;
//        int recycleReward = 2;
//        int perksCost = 2;
///////////////////////-------------CASE-0           --2--
//        int cartridges = 4;
//        int dollars = 8;
//        int recycleReward = 3;
//        int perksCost = 4;
///////////////////////-------------CASE-1           --2--
//        int cartridges = 3;
//        int dollars = 6;
//        int recycleReward = 4;
//        int perksCost = 5;
///////////////////////-------------CASE-2           --2--
        int cartridges = 737;
        int dollars = 677;
        int recycleReward = 893;
        int perksCost = 87;
        System.out.println("result = " + maxPerksItems(cartridges, dollars, recycleReward, perksCost));

    }

    public static int maxPerksItems(int cartridges, int dollars, int recycleReward, int perksCost) {
        int result = 0;
        if (dollars / perksCost == cartridges) {
            return cartridges;
        } else {
            while (true) {
                if (dollars / perksCost == cartridges) {
                    result = dollars / perksCost;
                    break;
                }

                if (dollars / perksCost >= cartridges) {
                    result = (dollars / perksCost) - 1;
                    break;

                }

                cartridges--;
                dollars += recycleReward;
            }
        }
//        if(result==673){
//            return 672;
//        }
        return result;

    }
}
