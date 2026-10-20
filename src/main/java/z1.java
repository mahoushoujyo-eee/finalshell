/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class z1 {
    qu_0 R;
    int F = 0;
    ArrayList k;
    HashSet n;

    z1(qu_0 qu_02) {
        this.R = qu_02;
        this.k = new ArrayList();
        this.n = new HashSet();
    }

    synchronized void k(int n10) {
        String[] stringArray = QI.N();
        boolean bl = this.n.contains(n10);
        if (stringArray != null && !bl) {
            this.k.add(n10);
            bl = this.n.add(n10);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    synchronized void h() {
        block10: {
            int n10;
            int n11;
            int n12;
            String[] stringArray;
            int n13;
            int n14;
            int n15;
            block8: {
                int n16;
                block9: {
                    n15 = 0;
                    n14 = yh_0.a;
                    n13 = this.k.size();
                    stringArray = QI.N();
                    n12 = n13 / n14;
                    int n17 = n13 % n14;
                    if (stringArray != null) {
                        if (n17 != 0) {
                            // empty if block
                        }
                        n17 = ++n12;
                    }
                    if (stringArray != null) {
                        if (n17 == 0) {
                            n12 = 1;
                        }
                        n17 = n14;
                    }
                    n11 = n17;
                    n16 = n13;
                    if (stringArray == null) break block8;
                    if (n16 > n11) break block9;
                    this.R.F(this.k);
                    this.R.F(this.k);
                    if (stringArray != null) break block10;
                }
                n16 = n10 = 0;
            }
            boolean bl = true;
            do {
                block12: {
                    int n18;
                    int n19;
                    block11: {
                        if (bl && !(bl = false) && stringArray != null) continue;
                        ArrayList arrayList = this.m(n15, n11, this.k);
                        this.R.F(arrayList);
                        this.R.F(arrayList);
                        n19 = (n15 += n14) + n11;
                        n18 = n13;
                        if (stringArray == null) break block11;
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
    ArrayList m(int var1_1, int var2_2, ArrayList var3_3) {
        var5_4 = new ArrayList<Integer>();
        var6_5 = 0;
        var4_6 = QI.N();
        if (var4_6 != null) ** GOTO lbl11
        block0: while (true) {
            v0 = var5_4;
            do {
                v0.add((Integer)var3_3.get(var1_1 + var6_5));
                ++var6_5;
lbl11:
                // 2 sources

                if (var6_5 < var2_2) continue block0;
                v0 = var5_4;
            } while (var4_6 == null);
            break;
        }
        return v0;
    }
}

