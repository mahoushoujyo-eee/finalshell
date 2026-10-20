/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yZ
 */
class yz_1
implements BH {
    final yt_1 U;

    yz_1(yt_1 yt_12) {
        this.U = yt_12;
    }

    @Override
    public void t(L1 l1) {
        Object object;
        Object object2;
        try {
            object2 = l1.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = lk_0.Z(object2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.U.t.R(object, ct_1.R);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

