/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kp
 */
class kp_2
implements Runnable {
    final fe_2 H;

    kp_2(fe_2 fe_22) {
        this.H = fe_22;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.H.m.d.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.E(this.H.m.G, (Object)((a3)this.H.m.d).getParent(), true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

