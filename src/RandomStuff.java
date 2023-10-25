public class RandomStuff {

    public static void testStuff() {
        for(int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
        for(int j = 1; j <= 1024; j = j*2) {
            System.out.println(j);
        }

        for(int k = 1; k <= 3; k++) {
            for(int l = 1; l <= 7; l++) {
                System.out.print("Woche " + k + " Tag " + l + "\n");
            }
        }

        int n = 123456;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        int o = 0;
        int p = 0;
        do {
            o++;
            p+=o;
        } while (o < 100);
        System.out.println(p);
        String test = "Dies ist ein Text.";
        int count = 0;
        for(int i = 0; i < test.length(); i++) {
            if(test.charAt(i) != 'x') continue;
            count++;
        }
        System.out.println(count);
    }

}
