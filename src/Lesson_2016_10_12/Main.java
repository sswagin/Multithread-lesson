package Lesson_2016_10_12;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.zip.ZipOutputStream;

/**
 * Created by Smaug on 12.10.2016.
 */
public class Main {
//    public static void main(String[] args) {
//        String[] name1 = new String[]{"name1", "name1", "name2", "name3", "name2", "name1"};
//        Box[] box = new Box[]{new Box(3,4,5), new Box(5,6,7), new Box(3,4,5), new Box(3,4,5), new Box(8,8,9),};
//
//
//        List<String> list1  = new ArrayList<>();
//
//        List<Box> list = new ArrayList<>();
//
//        for (int i = 0; i < box.length; i++) {
//            if (list.contains(box[i])) {
//                System.out.println("Элемент есть");
//                continue;
//            }
//            list.add(box[i]);
//
//        }
//        for (Box in : list){
//            System.out.println(in);
//        }
//    }

    // Input Stream             Output Stream
    // Работают с потоками байтов   FileOutputStream, использует Decorator
    //

    public static void main(String[] args) throws IOException {

   //     throw new IllegalAccessException("Uaa!!");
    // try / catch / finally / throws / throw
        File file = new File("C:\\Users\\Smaug\\Desktop\\Java\\file.txt");
// для кросс-платформенных приложений путь должен содержать конкатинацию и сепараторы


        if (file.exists()) {
            System.out.println("Here it is!");
        }
        file.createNewFile();

        FileWriter fileWriter = null;

        System.out.println(file.separator);

        try {
            File file1 = new File("C:\\Users\\Smaug\\Desktop\\Java\\hello.txt");
            fileWriter = new FileWriter(file1);
            fileWriter.write("srting!");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            int[] trytest = new int[3];
            //trytest[6] = 5;

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception created!");
        }finally {
            if (fileWriter != null)
                fileWriter.close();

            System.out.println("Try has been finished");
        }

        String cont = "It is a good day!";

            FileOutputStream fop = new FileOutputStream(file);
        ZipOutputStream zop = new ZipOutputStream(fop);


        System.out.println(Thread.currentThread().getName());

        new Thread(){
            @Override
            public void run(){
                Thread.currentThread().setName("Newest Thread #3");
                System.out.println(Thread.currentThread().getName());
            }
        }.start(); // запуск потока

            Runnable runnable = new Runnable(){
                @Override
                public void run(){
                    Thread.currentThread().setName("Newest Thread #4");
                    System.out.println(Thread.currentThread().getName());

                    try{
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                    System.out.println("2 s delay");
                }
            };
            new Thread(runnable).start();

        Worker worker = new Worker();
        worker.setOnWorkListener(new Worker.OnWorkListener() {
            @Override
            public void onWorkDone() {
                System.out.println("On Work Done CALLBACK");
            }
        });
        new Thread(worker).start(); // можно использовать воркера, ибо он имплементит Runnable, который требует Thread
    }

}
