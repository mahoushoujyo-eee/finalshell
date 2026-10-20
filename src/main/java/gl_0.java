/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from gl
 */
class gl_0
implements Runnable {
    final dj_1 B;

    gl_0(dj_1 dj_12) {
        this.B = dj_12;
    }

    @Override
    public void run() {
        try {
            this.B.x.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

