/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ui
 */
class ui_2
implements Runnable {
    final zD q;

    ui_2(zD zD2) {
        this.q = zD2;
    }

    @Override
    public void run() {
        try {
            this.q.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

