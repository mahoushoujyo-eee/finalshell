/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import org.icmp4j.j;

/*
 * Renamed from bA
 */
public class ba_1
extends JLabel {
    boolean C;
    boolean E;
    boolean k;
    L9 z;
    private static final long[] a;
    private static final Integer[] b;

    public ba_1() {
        this.C = false;
        this.E = false;
    }

    @Override
    public void paint(Graphics graphics) {
        block27: {
            ba_1 ba_12;
            block25: {
                block26: {
                    int n10;
                    int n11;
                    int n12;
                    Serializable serializable;
                    boolean bl;
                    KV kV;
                    Graphics2D graphics2D;
                    block32: {
                        int[] nArray;
                        block33: {
                            block36: {
                                int n13;
                                int n14;
                                block34: {
                                    block35: {
                                        int n15;
                                        ArrayList arrayList;
                                        int n16;
                                        int n17;
                                        block28: {
                                            block29: {
                                                ArrayList arrayList2;
                                                String string;
                                                KV kV2;
                                                graphics2D = (Graphics2D)graphics;
                                                nArray = L9.X();
                                                ba_12 = this;
                                                if (nArray != null) break block25;
                                                if ((L9)ba_12.z == null) break block26;
                                                try {
                                                    kV2 = (KV)this.z.r();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                kV = kV2;
                                                if (nArray != null) break block27;
                                                if (kV == null) break block26;
                                                ba_12 = this;
                                                if (nArray != null) break block25;
                                                try {
                                                    string = (String)ba_12.z.o();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (string == null) break block26;
                                                bl = this.C;
                                                if (nArray != null) break block28;
                                                if (!bl) break block29;
                                                try {
                                                    arrayList2 = (ArrayList)kV.X();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                serializable = arrayList2;
                                                n12 = ((ArrayList)serializable).size();
                                                n11 = 0;
                                                int n18 = ((ArrayList)serializable).size() - 1;
                                                n10 = this.getWidth();
                                                n17 = 3;
                                                n16 = 0;
                                                n14 = 3;
                                                while (n18 > -1 && n18 <= ((ArrayList)serializable).size() - 1) {
                                                    block31: {
                                                        int n19;
                                                        block30: {
                                                            j j2 = (j)((ArrayList)serializable).get(n18);
                                                            boolean bl2 = false;
                                                            n10 = this.getWidth() - n11 * n17 - 2;
                                                            Color color = new Color(ba_1.a(7905, 5408312571946799138L), ba_1.a(19171, 6259153862539068461L), ba_1.a(12125, 3587598472273863056L), ba_1.a(31186, 6171672549948618521L));
                                                            n19 = j2.r();
                                                            if (nArray != null) break block30;
                                                            if (n19 < 0) {
                                                                color = new Color(ba_1.a(17211, 6996260651426926071L), ba_1.a(24200, 213527780357722185L), ba_1.a(12125, 3587598472273863056L), ba_1.a(20222, 5621390007862476857L));
                                                            }
                                                            graphics2D.setColor(color);
                                                            graphics2D.fillRect(n10, this.getHeight() - n14, n17, n14);
                                                            if (nArray != null) break block31;
                                                            n19 = n10;
                                                        }
                                                        if (n19 < n16 && nArray == null) break;
                                                        ++n11;
                                                        --n18;
                                                    }
                                                    if (nArray == null) continue;
                                                }
                                                if (nArray == null) break block26;
                                            }
                                            bl = this.E;
                                        }
                                        if (nArray != null) break block32;
                                        if (!bl) break block33;
                                        serializable = new Color(ba_1.a(22199, 1131852588013443191L), ba_1.a(29103, 4954134141137583968L), ba_1.a(17744, 3612066245606329242L), ba_1.a(17744, 3612066245606329242L));
                                        graphics2D.setColor((Color)serializable);
                                        try {
                                            arrayList = (ArrayList)kV.X();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n12 = arrayList.size();
                                        try {
                                            n15 = (Integer)kV.B();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n11 = n15;
                                        float f10 = (float)n11 / (float)n12;
                                        n10 = 3;
                                        n17 = 2;
                                        n16 = 5;
                                        n14 = (int)(((float)this.getWidth() - (float)n16) * f10) + n17;
                                        n13 = n10;
                                        if (nArray != null) break block34;
                                        if (!(f10 > 0.0f)) break block35;
                                        graphics2D.fillRect(this.getWidth() - n14, n13, n14, this.getHeight() - 2 * n10);
                                        if (nArray == null) break block36;
                                    }
                                    serializable = new Color(ba_1.a(12125, 3587598472273863056L), ba_1.a(18157, 8402803434809575460L), ba_1.a(12125, 3587598472273863056L), ba_1.a(23593, 6317014545797894891L));
                                    graphics2D.setColor((Color)serializable);
                                }
                                graphics2D.fillRect(this.getWidth() - n14, n13, n14, this.getHeight() - 2 * n10);
                            }
                            if (nArray == null) break block26;
                        }
                        ba_12 = this;
                        if (nArray != null) break block25;
                        bl = ba_12.k;
                    }
                    if (bl) {
                        int n20;
                        serializable = new Color(ba_1.a(4814, 2518210588004129798L), ba_1.a(18157, 8402803434809575460L), ba_1.a(23593, 6317014545797894891L), ba_1.a(20222, 5621390007862476857L));
                        graphics2D.setColor((Color)serializable);
                        n12 = 3;
                        n11 = 2;
                        float f11 = (float)this.getWidth() / 500.0f;
                        try {
                            n20 = (Integer)kV.A();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = (int)(f11 * (float)n20 + (float)n11);
                        graphics2D.fillRect(this.getWidth() - n10, n12, n10, this.getHeight() - 2 * n12);
                    }
                }
                ba_12 = this;
            }
            super.paint(graphics);
        }
    }

    public boolean P() {
        return this.k;
    }

    public void r(boolean bl) {
        this.k = bl;
    }

    public boolean w() {
        return this.E;
    }

    public void X(boolean bl) {
        this.E = bl;
    }

    public boolean v() {
        return this.C;
    }

    public void S(boolean bl) {
        this.C = bl;
    }

    public L9 y() {
        return (L9)this.z;
    }

    public void u(L9 l9) {
        this.z = l9;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 9151379928032611533L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "<+\u008d[\u00ce\u00b1{B$\u00a8,s\u0015\u008dG/a'\u00be\u001a\u00ceG\u00c4!N'\u008bz\u00f8\u009b\u0010G+\u00fedA#%\u00f3!G\u00a3\u0094\u00c0|!\u00c8(\u008b\tR%\u008f\u0098-9\u00e2@\u00f2\u00e3S^A\u00c0\u0095\u00f9X\u00f1\u00c2-\u001c\u008b\"Od\u00fe\\D^\u00d9\u00f8\u00de%i~\u00e0\\\u00fc";
                var5_4 = "<+\u008d[\u00ce\u00b1{B$\u00a8,s\u0015\u008dG/a'\u00be\u001a\u00ceG\u00c4!N'\u008bz\u00f8\u009b\u0010G+\u00fedA#%\u00f3!G\u00a3\u0094\u00c0|!\u00c8(\u008b\tR%\u008f\u0098-9\u00e2@\u00f2\u00e3S^A\u00c0\u0095\u00f9X\u00f1\u00c2-\u001c\u008b\"Od\u00fe\\D^\u00d9\u00f8\u00de%i~\u00e0\\\u00fc".length();
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
                    var4_3 = "Zo\u001aya\u00a3\u00d4E\u00e7.O}5\u0094\u00ccb";
                    var5_4 = "Zo\u001aya\u00a3\u00d4E\u00e7.O}5\u0094\u00ccb".length();
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
        ba_1.a = var6_1;
        ba_1.b = new Integer[13];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xECB;
        if (b[n11] == null) {
            ba_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

