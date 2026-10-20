/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class n5
implements Runnable {
    final F_ Y;

    n5(F_ f_2) {
        this.Y = f_2;
    }

    @Override
    public void run() {
        try {
            this.Y.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

