public class SimpleMultiplicationTable {
    public static void main(String[] args) {
        int y = 1;
        int sonuc;
        for (int x = 1; x <= 11; x++) {
            if (x >= 11) {
                y++;
                x = 1;
            }
            else  {
                sonuc = x * y;
                System.out.println(y + " x "+ x + " = " + sonuc);
            }
            if (y >= 11) {
                break;
            }
        }
    }
}
