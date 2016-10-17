package Lesson_2016_10_12;

/**
 * Created by Smaug on 12.10.2016.
 */
public class Worker implements Runnable {
    interface OnWorkListener {
        void onWorkDone();
    }

    private OnWorkListener onWorkListener = null; // создаём поле

    public OnWorkListener getOnWorkListener() {
        return onWorkListener;
    }

    public void setOnWorkListener(OnWorkListener onWorkListener) {
        this.onWorkListener = onWorkListener;
        System.out.println("Work done callback!");
    }


    @Override
    public void run(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

if (onWorkListener != null)
    onWorkListener.onWorkDone();
        System.out.println("Worker works!");
    }
}
