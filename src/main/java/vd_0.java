/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vd
 */
class vd_0
implements Runnable {
    final ty_0 S;
    final C4 d;

    vd_0(C4 c4, ty_0 ty_02) {
        this.d = c4;
        this.S = ty_02;
    }

    @Override
    public void run() {
        block10: {
            Object object;
            vd_0 vd_02;
            block9: {
                long l2;
                Object object2;
                int[] nArray = C4.K();
                vd_02 = this;
                if (nArray == null) break block9;
                try {
                    object2 = vd_02.S.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    l2 = (Long)object2.m();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (l2 <= 0L) break block10;
                vd_02 = this;
            }
            try {
                object = this.S.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                vd_02.d.C(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

