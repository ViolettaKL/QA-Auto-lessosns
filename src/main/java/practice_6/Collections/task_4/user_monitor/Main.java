package practice_6.Collections.task_4.user_monitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSessions("177");
        userMonitor.addNewSessions("177");
        userMonitor.addNewSessions("177");
        userMonitor.addNewSessions("134");
        userMonitor.addNewSessions("134");
        userMonitor.addNewSessions("134");
        userMonitor.addNewSessions("134");
        userMonitor.addNewSessions("177");
        userMonitor.addNewSessions("177");

        userMonitor.printSessions();
    }
}
