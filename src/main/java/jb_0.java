/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Jb
 */
class jb_0
implements Runnable {
    final g_ f;

    jb_0(g_ g_2) {
        this.f = g_2;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.f.V.X.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

