/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ul
 */
class ul_0
implements Runnable {
    final ty_0 e;

    ul_0(ty_0 ty_02) {
        this.e = ty_02;
    }

    @Override
    public void run() {
        try {
            try {
                this.e.K();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                yt_1.F.J(new D1(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                yt_1.F.J(new zQ(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

