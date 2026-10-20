/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class FG
implements Runnable {
    final String X;
    final String T;
    final String K;
    final tf_2 x;
    final mT z;

    FG(mT mT2, String string, String string2, String string3, tf_2 tf_22) {
        this.z = mT2;
        this.X = string;
        this.T = string2;
        this.K = string3;
        this.x = tf_22;
    }

    @Override
    public void run() {
        try {
            tf_2 tf_22;
            Object object;
            try {
                object = this.z.s.s();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.N(this.X, this.T);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                tf_22 = (tf_2)this.z.Y.Z(this.X, this.T, this.K, false, this.x, null);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            tf_2 tf_23 = tf_22;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

