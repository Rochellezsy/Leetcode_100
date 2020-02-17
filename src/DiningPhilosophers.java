import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    private Semaphore eatlimit=new Semaphore(4);
    private ReentrantLock[] lockfork={
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
    };
    public DiningPhilosophers() {

    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        eatlimit.acquire();
        int left=philosopher;
        int right=(philosopher+4)%5;

        lockfork[left].lock();
        lockfork[right].lock();

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();
        putLeftFork.run();
        putRightFork.run();

        lockfork[left].unlock();
        lockfork[right].unlock();;
        eatlimit.release();
    }
}
