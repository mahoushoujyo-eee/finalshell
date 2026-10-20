/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class BI
implements Runnable {
    final YI S;
    private static final long a;

    BI(YI yI) {
        this.S = yI;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.C(this.S.j);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7981388552316499215L;
        a = 0x6EC39699E331B423L ^ l2;
    }
}

