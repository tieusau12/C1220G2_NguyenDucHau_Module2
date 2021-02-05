package _04_class_and_object.exrcises;

import java.util.Date;
import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long start() {
        System.out.println(java.time.LocalTime.now());
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        System.out.println(java.time.LocalTime.now());
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        stopWatch.start();
        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            for (int z = j + 1; z < array.length; z++) {
                if (min > array[z]) {
                    int swap = min;
                    min = array[z];
                    array[z] = swap;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Time to sort: " + stopWatch.getElapsedTime() + " Milisecond");
    }

}

