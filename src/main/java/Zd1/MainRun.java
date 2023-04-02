package Zd1;
//клас запускає обидва потоки
public class MainRun {
    public static void main(String[] args) {
        CounterThread timerThread = new CounterThread();
        ReminderThread reminderThread = new ReminderThread();

        timerThread.start();
        reminderThread.start();
    }
}