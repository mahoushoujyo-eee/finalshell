/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from tN
 */
public class tn_1
implements bg_1 {
    private static boolean H;

    @Override
    public double N(String string, String string2) {
        return (this.Q(string, string2) + this.Q(string2, string)) / 2.0;
    }

    public List N(String string, String string2, int n10) {
        ArrayList arrayList = new ArrayList();
        char c2 = string.charAt(n10);
        boolean bl = tn_1.z();
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c3 = c2;
            if (!bl || c3 != string2.charAt(i2)) continue;
            c3 = (char)(arrayList.add(i2) ? 1 : 0);
            if (bl) continue;
            ky_2.K(new String[4]);
            break;
        }
        return arrayList;
    }

    public int m(String string, String string2, int n10) {
        int n11;
        boolean bl;
        block4: {
            int n12 = string2.length();
            Iterator iterator = this.N(string, string2, n10).iterator();
            bl = tn_1.Q();
            while (iterator.hasNext()) {
                int n13 = (Integer)iterator.next();
                int n14 = Math.abs(n13 - n10);
                n11 = n12;
                if (!bl) {
                    if (!bl && n11 > n14) {
                        int n15 = n12 = n14;
                    }
                    if (!bl) continue;
                }
                break block4;
            }
            n11 = n12;
        }
        if (ky_2.F() != null) {
            tn_1.O(!bl);
        }
        return n11;
    }

    public double H(String string, String string2, int n10) {
        return (double)(string2.length() - this.m(string, string2, n10)) * 1.0 / (double)string2.length();
    }

    public double Q(String string, String string2) {
        double d2;
        block2: {
            double d3 = 0.0;
            boolean bl = tn_1.z();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                d2 = d3 + this.H(string, string2, i2);
                if (bl) {
                    d3 = d2;
                    if (bl) continue;
                }
                break block2;
            }
            d2 = d3 / (double)string.length();
        }
        return d2;
    }

    public static void O(boolean bl) {
        H = bl;
    }

    public static boolean Q() {
        return H;
    }

    public static boolean z() {
        boolean bl = tn_1.Q();
        return !bl;
    }

    static {
        if (tn_1.Q()) {
            tn_1.O(true);
        }
    }
}

