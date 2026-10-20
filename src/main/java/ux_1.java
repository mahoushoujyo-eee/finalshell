/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uX
 */
class ux_1
implements Runnable {
    final yt_1 e;

    ux_1(yt_1 yt_12) {
        this.e = yt_12;
    }

    @Override
    public void run() {
        block4: {
            yt_1 yt_12;
            block3: {
                ky_2[] ky_2Array = yt_1.c();
                yt_12 = (yt_1)this.e;
                if (ky_2Array == null) break block3;
                if (!yt_12.a) break block4;
                try {
                    this.e.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                yt_12 = (yt_1)this.e;
            }
            yt_12.a = false;
        }
    }
}

