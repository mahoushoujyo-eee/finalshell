/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oK
 */
class ok_1
implements Runnable {
    final ty_2 q;
    final qg_0 S;

    ok_1(qg_0 qg_02, ty_2 ty_22) {
        this.S = qg_02;
        this.q = ty_22;
    }

    @Override
    public void run() {
        block10: {
            int n10;
            ty_2 ty_22;
            block11: {
                boolean bl;
                block8: {
                    String string;
                    block9: {
                        string = vn_0.C();
                        bl = this.q instanceof tq_1;
                        if (string != null) break block8;
                        if (!bl) break block9;
                        try {
                            this.S.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string == null) break block10;
                    }
                    ty_22 = (ty_2)this.q;
                    if (string != null) break block11;
                    bl = ty_22 instanceof ty_2;
                }
                if (!bl) break block10;
                ty_22 = (ty_2)this.q;
            }
            ty_2 ty_23 = ty_22;
            try {
                n10 = (Integer)ty_23.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (n10 == ty_2.H) {
                try {
                    this.S.d();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

