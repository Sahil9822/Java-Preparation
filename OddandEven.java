class PrintEvenOdd {
    private int max;
    private int start;
    private boolean isEven;

    public PrintEvenOdd(int max, int start, boolean isEven) {
        this.max = max;
        this.start = start;
        this.isEven = isEven;
    }

    public void printNumbers() {
        int i = start;
        while (i <= max) {
            if ((i % 2 == 0) == isEven) {
                System.out.println(i);
            }
            i += 1;
        }
    }
}

class EvenOddThread implements Runnable {
    private PrintEvenOdd print;
    private boolean isEven;

    public EvenOddThread(PrintEvenOdd print, boolean isEven) {
        this.print = print;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        print.printNumbers();
    }
}

public class OddandEven {

	public static void main(String[] args) {
		int max = 20;

        PrintEvenOdd print = new PrintEvenOdd(max, 1, true);
        Thread t1 = new Thread(new EvenOddThread(print, true));

        PrintEvenOdd print2 = new PrintEvenOdd(max, 2, false);
        Thread t2 = new Thread(new EvenOddThread(print2, false));

        t1.start();
        t2.start();
	}

}
