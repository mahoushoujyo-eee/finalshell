/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class gO
implements Runnable {
    final F8 b;
    final ck_2 v;
    final U g;
    final oq_1 p;

    gO(oq_1 oq_12, F8 f82, ck_2 ck_22, U u10) {
        this.p = oq_12;
        this.b = f82;
        this.v = ck_22;
        this.g = u10;
    }

    @Override
    public void run() {
        block11: {
            Object object;
            gO gO2;
            block9: {
                block10: {
                    Object object2;
                    String string = aA.z();
                    gO2 = this;
                    if (string != null) break block9;
                    if (!(gO2.b instanceof CL)) break block10;
                    CL cL = (CL)this.b;
                    try {
                        object2 = this.v.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        cL.v(object2, this.g);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string == null) break block11;
                }
                gO2 = this;
            }
            try {
                object = this.v.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                gO2.g.H(object, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

