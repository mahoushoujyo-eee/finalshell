/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wd
 */
class wd_0
extends W2 {
    final ty_0 a;

    wd_0(ty_0 ty_02) {
        this.a = ty_02;
        try {
            this.G(tb_1.s);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void O() {
        block10: {
            wd_0 wd_02;
            block11: {
                String string;
                block9: {
                    String[] stringArray = KV.b();
                    string = (String)this.F;
                    if (stringArray != null) break block9;
                    if (string == null) break block10;
                    wd_02 = this;
                    if (stringArray == null) {
                        Object object;
                        try {
                            object = wd_02.z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            string = (String)object.n();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block11;
                }
                if (string.equals("")) break block10;
                wd_02 = this;
            }
            wd_02.a.v = false;
        }
    }
}

