/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import org.icmp4j.j;

/*
 * Renamed from lo
 */
class lo_2
implements Q0 {
    final j m;
    final L9 I;
    final dw_2 p;

    lo_2(dw_2 dw_22, j j2, L9 l9) {
        this.p = dw_22;
        this.m = j2;
        this.I = l9;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(B0 var1_1) {
        var3_2 = var1_1.w();
        ((j)this.m).i(System.currentTimeMillis());
        ((j)this.m).w((int)(((j)this.m).q() - ((j)this.m).R()));
        ((j)this.m).S(var3_2.A());
        v0 = L9.X();
        ((j)this.m).w(var3_2.r());
        var2_3 = v0;
        ((j)this.m).v(true);
        v1 = (L9)this.I;
        if (var2_3 == null) {
            try {
                v2 = (String)v1.o();
            }
            catch (InvocationTargetException v3) {
                throw v3.getTargetException();
            }
            if (v2 != null) {
                v1 = (L9)this.I;
                if (var2_3 == null) {
                    try {
                        v4 = (String)v1.o();
                    }
                    catch (InvocationTargetException v5) {
                        throw v5.getTargetException();
                    }
                    if (!v4.equals(((j)this.m).A())) {
                        try {
                            lk_0.x(this.I, this.p.k);
                        }
                        catch (InvocationTargetException v6) {
                            throw v6.getTargetException();
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                try {
                    this.I.u(((j)this.m).A());
                }
                catch (InvocationTargetException v7) {
                    throw v7.getTargetException();
                }
                try {
                    this.p.S();
                }
                catch (InvocationTargetException v8) {
                    throw v8.getTargetException();
                }
                v1 = (L9)this.I;
            }
        }
        try {
            v9 = (KV)v1.r();
        }
        catch (InvocationTargetException v10) {
            throw v10.getTargetException();
        }
        var4_4 = v9;
        try {
            var4_4.t(this.m);
        }
        catch (InvocationTargetException v11) {
            throw v11.getTargetException();
        }
        try {
            this.p.k.N(this.I);
        }
        catch (InvocationTargetException v12) {
            throw v12.getTargetException();
        }
        try {
            lk_0.E(this.I, this.p.k);
        }
        catch (InvocationTargetException v13) {
            throw v13.getTargetException();
        }
    }
}

