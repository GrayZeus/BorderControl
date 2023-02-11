public class BorderGuard {


    public Barrier openBarrier(Barrier barrier) {
        barrier.open();
        return barrier;
    }

    public Barrier closeBarrier(Barrier barrier) {
        barrier.close();
        return barrier;
    }
}
