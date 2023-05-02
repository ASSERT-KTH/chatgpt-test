// Add.java
package scenario3;

class Add {

    /**
     * Add two numbers x and y
     *
     * > add(0, 1)
     * 1
     * > add(1, 0)
     * 1
     * > add(2, 3)
     * 5
     * > add(5, 7)
     * 12
     * > add(7, 5)
     * 12
     * > add(572, 725)
     * 1297
     * > add(51, 804)
     * 855
     * > add(645, 96)
     * 741
     * > add(712, 853)
     * 1565
     * > add(223, 101)
     * 324
     * > add(76, 29)
     * 105
     * > add(416, 149)
     * 565
     * > add(145, 409)
     * 554
     * > add(535, 430)
     * 965
     * > add(118, 303)
     * 421
     * > add(287, 94)
     * 381
     * > add(768, 257)
     * 1025
     * > add(421, 677)
     * 1098
     * > add(802, 814)
     * 1616
     * > add(510, 922)
     * 1432
     * > add(345, 819)
     * 1164
     * > add(895, 436)
     * 1331
     * > add(123, 424)
     * 547
     * > add(923, 245)
     * 1168
     * > add(23, 438)
     * 461
     * > add(565, 133)
     * 698
     * > add(945, 925)
     * 1870
     * > add(261, 983)
     * 1244
     * > add(139, 577)
     * 716
     * > add(763, 178)
     * 941
     * > add(147, 892)
     * 1039
     * > add(436, 402)
     * 838
     * > add(610, 581)
     * 1191
     * > add(103, 416)
     * 519
     * > add(339, 990)
     * 1329
     * > add(130, 504)
     * 634
     * > add(242, 717)
     * 959
     * > add(562, 110)
     * 672
     * > add(396, 909)
     * 1305
     * > add(887, 703)
     * 1590
     * > add(870, 551)
     * 1421
     * > add(422, 391)
     * 813
     * > add(299, 505)
     * 804
     * > add(346, 56)
     * 402
     * > add(36, 706)
     * 742
     * > add(738, 411)
     * 1149
     * > add(679, 87)
     * 766
     * > add(25, 303)
     * 328
     * > add(161, 612)
     * 773
     * > add(306, 841)
     * 1147
     * > add(973, 411)
     * 1384
     * > add(711, 157)
     * 868
     * > add(471, 27)
     * 498
     * > add(714, 792)
     * 1506
     * > add(38, 206)
     * 244
     * > add(907, 343)
     * 1250
     * > add(23, 760)
     * 783
     * > add(524, 859)
     * 1383
     * > add(30, 529)
     * 559
     * > add(341, 691)
     * 1032
     * > add(167, 729)
     * 896
     * > add(636, 289)
     * 925
     * > add(503, 144)
     * 647
     * > add(51, 985)
     * 1036
     * > add(287, 149)
     * 436
     * > add(659, 75)
     * 734
     * > add(462, 797)
     * 1259
     * > add(406, 141)
     * 547
     * > add(106, 44)
     * 150
     * > add(300, 934)
     * 1234
     * > add(471, 524)
     * 995
     * > add(122, 429)
     * 551
     * > add(735, 195)
     * 930
     * > add(335, 484)
     * 819
     * > add(28, 809)
     * 837
     * > add(430, 20)
     * 450
     * > add(916, 635)
     * 1551
     * > add(301, 999)
     * 1300
     * > add(454, 466)
     * 920
     * > add(905, 259)
     * 1164
     * > add(168, 205)
     * 373
     * > add(570, 434)
     * 1004
     * > add(64, 959)
     * 1023
     * > add(957, 510)
     * 1467
     * > add(722, 598)
     * 1320
     * > add(770, 226)
     * 996
     * > add(579, 66)
     * 645
     * > add(117, 674)
     * 791
     * > add(530, 30)
     * 560
     * > add(776, 345)
     * 1121
     * > add(327, 389)
     * 716
     * > add(596, 12)
     * 608
     * > add(599, 511)
     * 1110
     * > add(936, 476)
     * 1412
     * > add(461, 14)
     * 475
     * > add(966, 157)
     * 1123
     * > add(326, 91)
     * 417
     * > add(392, 455)
     * 847
     * > add(446, 477)
     * 923
     * > add(324, 860)
     * 1184
     * > add(945, 85)
     * 1030
     * > add(886, 582)
     * 1468
     * > add(886, 712)
     * 1598
     * > add(842, 953)
     * 1795
     */
    public static int add(int x, int y) {
        return x + y;
    }
}

// AddTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {
    @Test
    void testAddition() {
        assertEquals(1, Add.add(0, 1));
        assertEquals(1, Add.add(1, 0));
        assertEquals(5, Add.add(2, 3));
        assertEquals(12, Add.add(5, 7));
        assertEquals(12, Add.add(7, 5));
        assertEquals(1297, Add.add(572, 725));
        assertEquals(855, Add.add(51, 804));
        assertEquals(741, Add.add(645, 96));
        assertEquals(1565, Add.add(712, 853));
        assertEquals(324, Add.add(223, 101));
        assertEquals(105, Add.add(76, 29));
        assertEquals(565, Add.add(416, 149));
        assertEquals(554, Add.add(145, 409));
        assertEquals(965, Add.add(535, 430));
        assertEquals(421, Add.add(118, 303));
        assertEquals(381, Add.add(287, 94));
        assertEquals(1025, Add.add(768, 257));
        assertEquals(1098, Add.add(421, 677));
        assertEquals(1616, Add.add(802, 814));
        assertEquals(1432, Add.add(510, 922));
        assertEquals(1164, Add.add(345, 819));
       