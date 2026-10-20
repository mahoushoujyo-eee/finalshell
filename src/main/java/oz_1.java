/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oZ
 */
class oz_1
implements Runnable {
    final s h;
    final yl_2 M;
    final lv_2 U;
    final U E;

    oz_1(U u10, s s2, yl_2 yl_22, lv_2 lv_22) {
        this.E = u10;
        this.h = s2;
        this.M = yl_22;
        this.U = lv_22;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.h.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = this.h.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = this.M.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.m(object, this.U);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

