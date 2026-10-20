/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class g1
implements Runnable {
    final fm_0 d;

    g1(fm_0 fm_02) {
        this.d = fm_02;
    }

    @Override
    public void run() {
        dv_0 dv_02;
        try {
            dv_02 = (dv_0)fm_0.O(this.d);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        dv_02.setText("");
    }
}

