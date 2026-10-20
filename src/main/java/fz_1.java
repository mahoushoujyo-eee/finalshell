/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fZ
 */
class fz_1
implements Runnable {
    final CL F;

    fz_1(CL cL) {
        this.F = cL;
    }

    @Override
    public void run() {
        try {
            this.F.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

