// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
// for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder.
// Justify your answer which one is better.

// Code:

public class _2b_PerformanceTest{

    public static void main(String[] args) {
        int iterations = 10000;
        String appendText = "AIET";

        // Test using StringBuffer
        StringBuffer buffer = new StringBuffer();
        long bufferStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer.append(appendText);
        }
        long bufferEnd = System.nanoTime();
        long bufferTime = bufferEnd - bufferStart;

        // Test using StringBuilder
        StringBuilder builder = new StringBuilder();
        long builderStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder.append(appendText);
        }
        long builderEnd = System.nanoTime();
        long builderTime = builderEnd - builderStart;

        // Print results
        System.out.println("Time taken by StringBuffer: " + bufferTime + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + builderTime + " nanoseconds");

        // Justification
        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster. It's more efficient in single-threaded environments.");
        } else {
            System.out.println("StringBuffer is slower due to synchronization. It is thread-safe but less efficient.");
        }
    }
}