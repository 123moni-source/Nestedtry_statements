//to show the concept og nested try
public class Nestedtry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a=" + a);
            try {
                if (a == 1) {
                    a = a / 0;
                }
                if (a == 2) {
                    int arr[] = {1};
                    arr[40] = 100;
                }
            } catch (Exception obj) {
                System.out.println("Array index out of bounds" + obj);
            }

        } catch(Exception obj)
            {
                System.out.println("divide by 0:"+obj);
            }

    }
}
