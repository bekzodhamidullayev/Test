import java.util.*;

public class ThreadMain {

    static  ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {




//        Runnable r = new Runnable() {
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    nums.add(i);
//                }
//            }
//        };
//
//
//        for (int i = 0; i < 1000; i++) {
//            Thread t = new Thread(r);
//            t.start();
//        }
//        System.out.println( nums.size());

        Runnable lambda = () -> {
            for (int i = 0; i < 1000; i++) {
                nums.add(i);
            }
        };
        Thread t = new Thread(lambda);
        t.start();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println( nums.size());


        Comparator<Integer> comparator = (a, b) -> {
            if(a < b) {
                return -1;
            } else if (a > b) {
                return 1;
            }
            return 0;
        };

//        Collections.sort(nums, comparator);
//        System.out.println(nums);



        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i < 39; i++) {
            queue.add(i);
        }

            Runnable task = () -> {
                while (queue.size() != 0) {
                    if(queue.peek() % 13 == 0) {
                        throw new RuntimeException(Thread.currentThread().getName() + "  unloki");
                    }
                    System.out.println(Thread.currentThread().getName() + queue.poll());
            }
        };


        Thread t1 = new Thread(task, "Ninza");
        Thread t2 = new Thread(task, "cheripaxa");
        Thread t3 = new Thread(task, "pauk");

        t1.start();
        t2.start();
        t3.start();

    }







}
