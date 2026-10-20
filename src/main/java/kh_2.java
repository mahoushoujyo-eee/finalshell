/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kh
 */
class kh_2
implements Runnable {
    final vo_0 e;

    kh_2(vo_0 vo_02) {
        this.e = vo_02;
    }

    @Override
    public void run() {
        boolean bl;
        Object object;
        try {
            object = yt_1.W(this.e.B);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bl = (Boolean)object.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (bl) {
            yt_1.u = new cb_1(null);
        }
    }
}

