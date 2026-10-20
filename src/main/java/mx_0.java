/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mx
 */
class mx_0
implements Runnable {
    final yt_1 s;

    mx_0(yt_1 yt_12) {
        this.s = yt_12;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        long l2 = System.currentTimeMillis();
        ky_2[] ky_2Array = yt_1.c();
        try {
            object2 = yt_1.W(this.s);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.s.C(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (ky_2Array != null) {
            boolean bl;
            try {
                bl = (Boolean)vk_0.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) {
                try {
                    xK.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                yt_1.F.J(new bh_1(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                yt_1.F.J(new fo_0(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

