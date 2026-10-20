/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class UX
implements Runnable {
    private static final long a;

    UX() {
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            try {
                yt_1.F.J(new jw_0(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8196352957545191836L;
        a = 0x71BF4B96B8341224L ^ l2;
    }
}

