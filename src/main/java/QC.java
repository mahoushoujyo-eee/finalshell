/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class QC
implements Runnable {
    final dl_2 O;

    QC(dl_2 dl_22) {
        this.O = dl_22;
    }

    @Override
    public void run() {
        try {
            this.O.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

