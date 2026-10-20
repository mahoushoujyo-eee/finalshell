/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Cr
 */
class cr_0
implements Runnable {
    final z2 z;

    cr_0(z2 z22) {
        this.z = z22;
    }

    @Override
    public void run() {
        try {
            this.z.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

