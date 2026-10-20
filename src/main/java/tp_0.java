/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Tp
 */
class tp_0
implements Runnable {
    final F_ d;

    tp_0(F_ f_2) {
        this.d = f_2;
    }

    @Override
    public void run() {
        try {
            this.d.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

