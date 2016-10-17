package Lesson_2016_10_17;

/**
 * Created by Smaug on 17.10.2016.
 */
public class InfoSender {
    private final Object monitor = new Object();

    public void sendWork(){
        System.out.println("sending work...");
        synchronized (monitor){ /// Критическая секция - сюда не могут зайти два потока одновременно
            try{
                monitor.wait(); /// Обязательно выхывать в критической секции
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("work done.");
    }

    public void prepareInfo(){
        synchronized (monitor){
            monitor.notify();
        }
    }

}
