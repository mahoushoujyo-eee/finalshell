/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kC
 */
class kc_1
implements Runnable {
    final a3 o;
    final tf_2 L;
    final tf_2 w;
    final nK Y;

    kc_1(nK nK2, a3 a32, tf_2 tf_22, tf_2 tf_23) {
        this.Y = nK2;
        this.o = a32;
        this.L = tf_22;
        this.w = tf_23;
    }

    @Override
    public void run() {
        String string;
        Object object;
        zD zD2;
        try {
            zD2 = (zD)this.o.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        zD zD3 = zD2;
        try {
            object = this.L.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)lk_0.e(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        try {
            Object object2;
            Object object3;
            String string3;
            String string4;
            Object object4;
            try {
                object4 = this.L.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string4 = (String)this.w.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string3 = (String)this.L.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                zD3.N(object4, (Object)(string4 + string2 + string3));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3 = this.L.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = this.w.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.o.w(object3, object2, true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

