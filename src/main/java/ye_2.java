/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ye
 */
class ye_2
implements Runnable {
    final lv_2 H;
    final yl_2 Y;
    final U g;

    ye_2(U u10, lv_2 lv_22, yl_2 yl_22) {
        this.g = u10;
        this.H = lv_22;
        this.Y = yl_22;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        try {
            object2 = this.H.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = this.Y.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            y__0.v(object2, object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

