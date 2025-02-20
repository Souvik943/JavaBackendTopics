package DESIGNPATTERNS.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Runner {
    public static void main(String[] args) {
        ExecutorService executorService = new ScheduledThreadPoolExecutor(10);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
        executorService.execute(TVSet::getTVSetInstance);
    }
}
