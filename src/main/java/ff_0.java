/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

/*
 * Renamed from Ff
 */
public class ff_0
extends FK {
    pa_1 xu;
    private static final long[] cb;
    private static final Integer[] db;

    public ff_0(pa_1 pa_12, dv_0 dv_02) {
        super(dv_02, true, true);
        try {
            this.h(this.A);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.h(this.j);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.e(ff_0.b(9336, 5327246559209332194L), ff_0.b(1969, 2397974912023248426L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.xu = pa_12;
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
        ((dv_0)this.lD).j().w(new Color(ff_0.b(6055, 986013398667079230L), ff_0.b(27209, 6445919796311446481L), ff_0.b(27209, 6445919796311446481L)));
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

    protected void h(JButton jButton) {
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
        block4: {
            ff_0 ff_02;
            block3: {
                String string;
                String[] stringArray = F_.F();
                ff_02 = this;
                if (stringArray == null) break block3;
                if (!ff_02.E && !CK.Ur) break block4;
                try {
                    string = (String)l1.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((dv_0)this.lD).setText(string);
                ff_02 = this;
            }
            ((dv_0)ff_02.lD).requestFocus();
        }
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

    void u(L1 l1) {
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
        ((pa_1)this.xu).x(string, true);
        ((dv_0)this.lD).setText("");
        ((pa_1)this.xu).requestFocus();
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
            this.u(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void h() {
        this.xu = null;
    }

    @Override
    public void K() {
        try {
            yt_1.F.W((Object)new d0_0(this), dd_1.y);
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
                var0 = 1214873543476543772L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00a5\u00ee\u00b0d\b=\u00d2\u0005\u0095}\u007f\u00d5V\u00a3/\u00ea";
                var5_4 = "\u00a5\u00ee\u00b0d\b=\u00d2\u0005\u0095}\u007f\u00d5V\u00a3/\u00ea".length();
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
                    var4_3 = "\u0012W\u00cd\u00a4]h\u009d\n\u00f67\u00cf\u000e.\u0081>\u00a6";
                    var5_4 = "\u0012W\u00cd\u00a4]h\u009d\n\u00f67\u00cf\u000e.\u0081>\u00a6".length();
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
        ff_0.cb = var6_1;
        ff_0.db = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3998;
        if (db[n11] == null) {
            ff_0.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }
}

