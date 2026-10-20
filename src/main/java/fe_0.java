/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Fe
 */
class fe_0
implements Runnable {
    final Window A;
    private static final long a;

    fe_0(Window window) {
        this.A = window;
    }

    @Override
    public void run() {
        ky_2[] ky_2Array = yt_1.c();
        for (int i2 = 0; i2 < 1; ++i2) {
            try {
                lk_0.F(this.A);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                Thread.sleep(a);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (ky_2Array != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3782035904469922761L;
        a = 0x347C7D9DF5B3F3FBL ^ l2;
    }
}

