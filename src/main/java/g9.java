/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class g9 {
    UR f;
    int h = 0;
    ArrayList A;
    HashSet a;

    g9(UR uR2) {
        this.f = uR2;
        this.A = new ArrayList();
        this.a = new HashSet();
    }

    synchronized void S(int n10) {
        String[] stringArray = QI.N();
        boolean bl = this.a.contains(n10);
        if (stringArray != null && !bl) {
            this.A.add(n10);
            bl = this.a.add(n10);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    synchronized void x() {
        block10: {
            int n10;
            int n11;
            String[] stringArray;
            int n12;
            int n13;
            int n14;
            int n15;
            block8: {
                int n16;
                block9: {
                    n15 = 0;
                    n14 = yh_0.a;
                    n13 = this.A.size();
                    n12 = n13 / n14;
                    stringArray = QI.N();
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
                    this.f.z.s(this.A);
                    this.f.z.s(this.A);
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
                        ArrayList arrayList = this.m(n15, n11, this.A);
                        this.f.z.s(arrayList);
                        this.f.z.s(arrayList);
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
        var4_5 = QI.N();
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

