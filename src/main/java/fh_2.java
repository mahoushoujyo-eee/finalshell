/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fh
 */
class fh_2
implements Runnable {
    final d8_0 L;
    private final gH p;

    fh_2(d8_0 d8_02, gH gH2) {
        this.L = d8_02;
        this.p = gH2;
    }

    @Override
    public void run() {
        block19: {
            gH gH2;
            block20: {
                int n10;
                int n11;
                block18: {
                    Runnable runnable;
                    String string = d8_0.Q();
                    try {
                        this.p.K(Thread.currentThread());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        runnable = (Runnable)this.p.c();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    runnable.run();
                    String string2 = string;
                    try {
                        n11 = ((Boolean)this.p.R()).booleanValue();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string2 != null) break block18;
                    if (n11 != 0) break block19;
                    gH2 = (gH)this.p;
                    if (string2 == null) {
                        try {
                            n11 = (Integer)gH2.X();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block20;
                }
                if (n11 != gH.y) break block19;
                try {
                    n10 = (Integer)this.p.e();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    (gH)this.p.I(System.currentTimeMillis() + (long)n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                gH2 = (gH)this.p;
            }
            try {
                gH2.j(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

