package com.moneytap.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RowThread implements Runnable{
  int rowNumber;

    public RowThread(int rowNumber) {
        this.rowNumber = rowNumber-1;
    }

    @Override
    public void run() {

            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){


                    MatrixMultiplication.result[rowNumber][i]+=
                            MatrixMultiplication.A[rowNumber][j]*MatrixMultiplication.B[j][i];


                }


            }

    }
}

public class MatrixMultiplication {

    static int[][] A=new int[][]{
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
    };
    static int[][] B=new int[][]{
            {1,1,1,1}
            ,{1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
    };
    static int[][] result=new int[A.length][B[0].length];

    public static void main(String[] args) throws InterruptedException {
/*
        Runnable r1=new RowThread(0);
        Runnable r2=new RowThread(1);
        Runnable r3=new RowThread(2);
        Runnable r4=new RowThread(3);

        ExecutorService pool= Executors.newFixedThreadPool(4);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.shutdown();

 */



        Thread r1=new Thread(new RowThread(1));
        Thread r2=new Thread(new RowThread(2));
        Thread r3=new Thread(new RowThread(3));
        Thread r4=new Thread(new RowThread(4));


        r1.start();
        r1.join();
        r2.start();
        r2.join();
        r3.start();
        r3.join();

        r4.start();
        r4.join();



        for(int i=0;i< result.length;i++) {
            for (int j = 0; j < result[i].length; j++)
                System.out.print(result[i][j]);
            System.out.println();
        }


    }

}
