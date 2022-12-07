import java.util.*;

class indexedarray {
    int arr[] = new int[10];

    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    void sortarr() {
        for (int i = 0; i < 9; i++) {
            int x = i;
            for (int j = i + 1; j < 10; j++)
                if (arr[j] < arr[x])
                    x = j;
            int temp = arr[x];
            arr[x] = arr[i];
            arr[i] = temp;
        }
    }

    int binarysearch(int key) {
        int l = 0, u = 9, mid;
        while (l <= u) {
            mid = (l + u) / 2;
            if (arr[mid] > key)
                u = mid - 1;
            else if (arr[mid] < key)
                l = mid + 1;
            else
                return 1;
        }
        return 0;
    }
}

class C {
    public static void main(String args[]) {
        indexedarray obj = new indexedarray();
        obj.fillarray();
        obj.sortarr();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code to search: ");
        int key = sc.nextInt();
        if (obj.binarysearch(key) == 1)
            System.out.println("Employee Code Found");
        else
            System.out.println("Employee Code not Found");
        sc.close();
    }
}