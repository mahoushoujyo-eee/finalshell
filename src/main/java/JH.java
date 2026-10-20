/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class JH
implements Runnable {
    final bo_1 h;

    JH(bo_1 bo_12) {
        this.h = bo_12;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.h.L.T.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

