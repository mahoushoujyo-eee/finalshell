/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class YC
implements Runnable {
    final zM w;

    YC(zM zM2) {
        this.w = zM2;
    }

    @Override
    public void run() {
        try {
            KM.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

