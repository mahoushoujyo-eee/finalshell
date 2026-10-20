/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from yd
 */
public class yd_2 {
    public static ThreadPoolExecutor h;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2856720731247343017L;
        long l3 = 0x34DEB66EE7820A56L ^ l2;
        long l4 = 3351568334700878052L;
        long l5 = 0x2E8329A49E4B6DD4L ^ l4;
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, (int)l3, l5, TimeUnit.MILLISECONDS, synchronousQueue);
        yd_2.h = threadPoolExecutor;
    }
}

