/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fS
 */
class fs_1
implements Runnable {
    final qn_0 i;

    fs_1(qn_0 qn_02) {
        this.i = qn_02;
    }

    @Override
    public void run() {
        block11: {
            U u10;
            block12: {
                boolean bl;
                block10: {
                    Object object;
                    Object object2;
                    String[] stringArray = F8.y();
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block10;
                    if (!bl) break block11;
                    u10 = (U)this.i.Z;
                    if (stringArray != null) break block12;
                    bl = u10.isVisible();
                }
                if (!bl) break block11;
                u10 = (U)this.i.Z;
            }
            try {
                u10.t();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

