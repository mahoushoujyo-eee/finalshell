/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from de
 */
class de_2
implements Runnable {
    final tf_2 q;
    final String U;
    final F6 s;

    de_2(F6 f62, tf_2 tf_22, String string) {
        this.s = f62;
        this.q = tf_22;
        this.U = string;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.s.h.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.O(this.q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.s.h.Z(this.U);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = ((km_0)this.s.h).getSelectedRow();
        if (n10 > -1) {
            try {
                this.s.h.V(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

