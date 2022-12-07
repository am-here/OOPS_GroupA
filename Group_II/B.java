class B {
    public static void main(String[] args) {
        int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            A[15] = 15;
        } catch (Exception e) {
            System.out.println("ERROR!!");
        }
        try {
            A[15] = 15;
        } catch (Exception e) {
            try {
                throw (e);
            } catch (ArrayIndexOutOfBoundsException ee) {
                System.out.println(ee);
            }
        }
    }
}