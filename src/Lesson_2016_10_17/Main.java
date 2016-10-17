package Lesson_2016_10_17;
import java.util.*;

/**
 * Created by Smaug on 17.10.2016.
 */
public class Main{
    public static void main(String[] args) {
final InfoSender infoSender = new InfoSender();

        Thread thread = new Thread (){
            @Override
            public void run(){
                super.run();
                    infoSender.sendWork();
                    infoSender.prepareInfo();

            }
        };
        thread.start();

        Thread thread1 = new Thread();
        thread1.start();

        System.out.println(thread.getState());
        infoSender.prepareInfo();
    }

    ///  Системы контроля версий
//
//    commands for command line:
//    Git init
//    git add -all
//    git commint -m "Start"
//    git reset = hard
    



}
