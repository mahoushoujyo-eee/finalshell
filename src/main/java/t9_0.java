/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from t9
 */
class t9_0
implements Runnable {
    final OT u;

    t9_0(OT oT) {
        this.u = oT;
    }

    @Override
    public void run() {
        Object object;
        ta_2 ta_22;
        Object object2;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ta_22 = (ta_2)object2.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ta_2 ta_23 = ta_22;
        ta_23.setVisible(true);
        try {
            object = this.u.R.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ta_23.c(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

