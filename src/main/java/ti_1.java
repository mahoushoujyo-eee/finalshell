/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tI
 */
class ti_1
implements Runnable {
    final String n;
    final String W;
    final String E;
    final mT g;

    ti_1(mT mT2, String string, String string2, String string3) {
        this.g = mT2;
        this.n = string;
        this.W = string2;
        this.E = string3;
    }

    @Override
    public void run() {
        try {
            ck_2 ck_22;
            Object object;
            try {
                object = this.g.s.s();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.N(this.n, this.W);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                ck_22 = (ck_2)this.g.Y.F(this.n, this.W, this.E);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ck_2 ck_23 = ck_22;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

