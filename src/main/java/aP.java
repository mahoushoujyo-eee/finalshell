/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;

class aP
implements Runnable {
    final String Q;
    final L9 s;
    final f3_0 x;
    private static final long a;
    private static final long b;

    aP(String string, L9 l9, f3_0 f3_02) {
        this.Q = string;
        this.s = l9;
        this.x = f3_02;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block15: {
            ky_2[] ky_2Array = yt_1.c();
            for (int i2 = 0; i2 < (int)a; ++i2) {
                block16: {
                    String string;
                    block17: {
                        String string2;
                        try {
                            string2 = (String)lk_0.G(this.Q);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        string = string2;
                        if (ky_2Array == null) break block15;
                        if (ky_2Array == null) continue;
                        break block17;
                        catch (InterruptedException interruptedException) {
                            throw aP.a(interruptedException);
                        }
                    }
                    try {
                        block18: {
                            if (string == null) break block16;
                            break block18;
                            catch (InterruptedException interruptedException) {
                                throw aP.a(interruptedException);
                            }
                        }
                        ((HashMap)lk_0.A).put((String)this.Q, string);
                        try {
                            this.s.V(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.x.N(this.s);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (ky_2Array != null) break;
                    }
                    catch (InterruptedException interruptedException) {
                        throw aP.a(interruptedException);
                    }
                }
                try {
                    Thread.sleep(b);
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                if (ky_2Array != null) continue;
            }
            ((HashSet)lk_0.r).remove((String)this.Q);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3135460603703768721L;
        a = 0x7DE3DE2482FEB69BL ^ l2;
        long l3 = 1227919196501493805L;
        b = 0x110A7200E05AC9D9L ^ l3;
    }
}

