/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.ArrayList;
import java.util.HashSet;

public class aT {
    qm_0 X;
    int O = 0;
    ArrayList m;
    HashSet q;

    aT(qm_0 qm_02) {
        this.X = qm_02;
        this.m = new ArrayList();
        this.q = new HashSet();
    }

    synchronized void C(int n10) {
        ky_2[] ky_2Array = qm_0.J();
        boolean bl = this.q.contains(n10);
        if (ky_2Array != null && !bl) {
            this.m.add(n10);
            bl = this.q.add(n10);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    synchronized void t() {
        block10: {
            int n10;
            int n11;
            int n12;
            ky_2[] ky_2Array;
            int n13;
            int n14;
            int n15;
            block8: {
                int n16;
                block9: {
                    n15 = 0;
                    n14 = cs_0.x;
                    n13 = this.m.size();
                    ky_2Array = qm_0.J();
                    n12 = n13 / n14;
                    int n17 = n13 % n14;
                    if (ky_2Array != null) {
                        if (n17 != 0) {
                            // empty if block
                        }
                        n17 = ++n12;
                    }
                    if (ky_2Array != null) {
                        if (n17 == 0) {
                            n12 = 1;
                        }
                        n17 = n14;
                    }
                    n11 = n17;
                    n16 = n13;
                    if (ky_2Array == null) break block8;
                    if (n16 > n11) break block9;
                    this.X.J.Y(this.m);
                    this.X.J.Y(this.m);
                    if (ky_2Array != null) break block10;
                }
                n16 = n10 = 0;
            }
            boolean bl = true;
            do {
                block12: {
                    int n18;
                    int n19;
                    block11: {
                        if (bl && !(bl = false) && ky_2Array != null) continue;
                        ArrayList arrayList = this.P(n15, n11, this.m);
                        this.X.J.Y(arrayList);
                        this.X.J.Y(arrayList);
                        n19 = (n15 += n14) + n11;
                        n18 = n13;
                        if (ky_2Array == null) break block11;
                        if (n19 <= n18) break block12;
                        n19 = n13;
                        n18 = (n12 - 1) * n14;
                    }
                    n11 = n19 - n18;
                }
                ++n10;
            } while (n10 < n12);
        }
    }

    /*
     * Unable to fully structure code
     */
    ArrayList P(int var1_1, int var2_2, ArrayList var3_3) {
        var5_4 = new ArrayList<Integer>();
        var4_5 = qm_0.J();
        var6_6 = 0;
        if (var4_5 != null) ** GOTO lbl11
        block0: while (true) {
            v0 = var5_4;
            do {
                v0.add((Integer)var3_3.get(var1_1 + var6_6));
                ++var6_6;
lbl11:
                // 2 sources

                if (var6_6 < var2_2) continue block0;
                v0 = var5_4;
            } while (var4_5 == null);
            break;
        }
        return v0;
    }
}

