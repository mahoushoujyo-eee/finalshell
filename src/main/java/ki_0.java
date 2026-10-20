/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ki
 */
class ki_0
implements Runnable {
    final BU t;

    ki_0(BU bU) {
        this.t = bU;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.t.x.T.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.x(this.t.Y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

