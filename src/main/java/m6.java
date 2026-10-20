/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class m6 {
    HashMap M;
    U s;
    ArrayList I;
    boolean O;
    static U d;
    U K;
    private static final long a;

    public m6() {
        this.M = new HashMap();
        this.I = new ArrayList();
        this.O = false;
        this.K = null;
    }

    void H() {
        U u10;
        long l2 = System.currentTimeMillis();
        try {
            u10 = (U)this.A(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        U u11 = u10;
        try {
            yt_1.F.J(new b7_0(this, u11));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        l2 = System.currentTimeMillis();
    }

    public int Q() {
        return ((HashMap)this.M).size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void o(U u10) {
        HashMap hashMap = (HashMap)this.M;
        synchronized (hashMap) {
            int n10;
            try {
                n10 = (Integer)u10.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.M).remove(n10);
            ((ArrayList)this.I).remove(u10);
        }
    }

    public static void M() {
        m6.d = new U();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public U A(boolean var1_1) {
        block25: {
            block21: {
                block24: {
                    block23: {
                        block22: {
                            var3_2 = System.currentTimeMillis();
                            var2_3 = F8.y();
                            v0 = this;
                            if (var2_3 != null) break block21;
                            try {
                                block26: {
                                    if (v0.O) ** GOTO lbl33
                                    break block26;
                                    catch (InterruptedException v1) {
                                        throw m6.a(v1);
                                    }
                                }
lbl12:
                                // 3 sources

                                while ((U)m6.d == null) {
                                    break block22;
                                }
                                break block23;
                            }
                            catch (InterruptedException v2) {
                                throw m6.a(v2);
                            }
                        }
                        try {
                            Thread.sleep(m6.a);
                            if (var2_3 != null) break block24;
                            ** GOTO lbl12
                        }
                        catch (InterruptedException var5_4) {
                            var5_4.printStackTrace();
                            if (var2_3 == null) ** GOTO lbl12
                        }
                    }
                    this.K = m6.d;
                    this.O = true;
                }
                try {
                    if (var2_3 == null) break block25;
lbl33:
                    // 2 sources

                    v0 = this;
                }
                catch (InterruptedException v3) {
                    throw m6.a(v3);
                }
            }
            v0.K = new U();
        }
        try {
            this.K.N(var1_1);
        }
        catch (InvocationTargetException v4) {
            throw v4.getTargetException();
        }
        var5_5 = System.currentTimeMillis();
        try {
            yt_1.i();
        }
        catch (InvocationTargetException v5) {
            throw v5.getTargetException();
        }
        try {
            yt_1.F.J(new gm_0(this, var1_1));
        }
        catch (InvocationTargetException v6) {
            throw v6.getTargetException();
        }
        var7_6 = (HashMap)this.M;
        synchronized (var7_6) {
            try {
                v7 = (Integer)this.K.d();
            }
            catch (InvocationTargetException v8) {
                throw v8.getTargetException();
            }
            ((HashMap)this.M).put(v7, (U)this.K);
        }
        this.s = this.K;
        return (U)this.K;
    }

    HashMap B() {
        HashMap hashMap = (HashMap)((HashMap)this.M).clone();
        return hashMap;
    }

    public void e(tk_2 tk_22) {
        HashMap hashMap;
        try {
            hashMap = (HashMap)this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        HashMap hashMap2 = hashMap;
        Iterator iterator = hashMap2.keySet().iterator();
        String[] stringArray = F8.y();
        while (iterator.hasNext()) {
            U u10 = (U)hashMap2.get(iterator.next());
            try {
                tk_22.R(u10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (stringArray == null) continue;
        }
    }

    public void w(String string) {
        try {
            this.e(new fo_2(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void S() {
        try {
            this.e(new VR(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public U D() {
        return (U)this.s;
    }

    public U W() {
        String[] stringArray = F8.y();
        m6 m62 = this;
        if (stringArray == null) {
            if (((ArrayList)m62.I).size() > 0) {
                this.s = (U)((ArrayList)this.I).get(((ArrayList)this.I).size() - 1);
            }
            m62 = this;
        }
        return (U)m62.s;
    }

    public void l(U u10) {
        ((ArrayList)this.I).remove(u10);
        ((ArrayList)this.I).add(u10);
        this.s = u10;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6554860807117375401L;
        a = 0x5AF78B2CC85C87AAL ^ l2;
    }
}

