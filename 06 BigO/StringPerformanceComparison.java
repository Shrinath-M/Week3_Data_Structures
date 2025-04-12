public class StringPerformanceComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        long start, end;

        start = System.currentTimeMillis();
        stringConcat(N);
        end = System.currentTimeMillis();
        System.out.println("String Concatenation Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        stringBuilderConcat(N);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Concatenation Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        stringBufferConcat(N);
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Concatenation Time: " + (end - start) + " ms");
    }

    public static void stringConcat(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
    }

    public static void stringBuilderConcat(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }

    public static void stringBufferConcat(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
}

