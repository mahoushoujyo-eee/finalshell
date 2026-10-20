/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class FM
extends FK {
    pa_1 vS;
    private static final long[] cb;
    private static final Integer[] db;

    public FM(pa_1 pa_12, dv_0 dv_02) {
        super(dv_02, true, true);
        try {
            this.c(this.A);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.c(this.j);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.e(FM.b(26880, 7494843451023589009L), FM.b(31436, 2849624512543354207L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.vS = pa_12;
        try {
            this.R(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((dv_0)this.lD).setForeground(Color.white);
        ((dv_0)this.lD).j().n(false);
        ((dv_0)this.lD).j().w(new Color(FM.b(29438, 5474337388064400750L), FM.b(11121, 1276871118257044707L), FM.b(11121, 1276871118257044707L)));
    }

    @Override
    public void D() {
        super.D();
        try {
            this.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    protected void c(JButton jButton) {
    }

    @Override
    protected void i(L1 l1, int n10) {
        Object object;
        Object object2;
        try {
            object2 = this.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.C(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected void L(String string) {
    }

    @Override
    protected void k(L1 l1) {
        String string;
        try {
            string = (String)l1.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((dv_0)this.lD).setText(string);
        ((dv_0)this.lD).requestFocus();
    }

    @Override
    protected dx_2 n() {
        dx_2 dx_22 = new dx_2();
        return dx_22;
    }

    @Override
    protected dx_2 k() {
        dx_2 dx_22;
        Object object;
        Object object2;
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
            dx_22 = (dx_2)object.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        dx_2 dx_23 = dx_22;
        return dx_23;
    }

    void S(L1 l1) {
        String string;
        Object object;
        dx_2 dx_22;
        try {
            dx_22 = (dx_2)this.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        dx_2 dx_23 = dx_22;
        try {
            dx_23.h(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)l1.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((pa_1)this.vS).x(string, true);
        ((dv_0)this.lD).setText("");
        ((pa_1)this.vS).requestFocus();
    }

    @Override
    public boolean p(L1 l1) {
        return true;
    }

    @Override
    protected void u(KeyEvent keyEvent) {
    }

    @Override
    protected String c() {
        return ((dv_0)this.Z).getText().trim();
    }

    @Override
    public void Q(L1 l1, int n10) {
        try {
            this.S(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void h() {
        this.vS = null;
    }

    @Override
    public void K() {
        try {
            yt_1.F.W((Object)new W5(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7709073078507528579L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00e1\u00b8i\u00b4\u001e\u009b\u009eL;\u00c3\u00c8\u00cds\u00c0\u0004%";
                var5_4 = "\u00e1\u00b8i\u00b4\u001e\u009b\u009eL;\u00c3\u00c8\u00cds\u00c0\u0004%".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00aeP^y\u00ba\u0093\u008dL\u00b8t\u0088P\u0084]]\u00a8";
                    var5_4 = "\u00aeP^y\u00ba\u0093\u008dL\u00b8t\u0088P\u0084]]\u00a8".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        FM.cb = var6_1;
        FM.db = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1791;
        if (db[n11] == null) {
            FM.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }
}

