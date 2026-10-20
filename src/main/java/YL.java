/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class YL
implements Runnable {
    final String c;
    final U2 j;

    YL(U2 u22, String string) {
        this.j = u22;
        this.c = string;
    }

    @Override
    public void run() {
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            try {
                object4 = this.j.t.T.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3 = this.j.t.s.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = object3.V();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object4.I((Object)((km_0)this.j.t.s).getParent(), object, this.c, true, true);
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

