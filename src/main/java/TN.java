/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

public class TN {
    byte[] u;
    short n;
    private static ky_2[] Z;

    public byte[] c() {
        return this.u;
    }

    public static short V(byte[] byArray) {
        int n10 = -1;
        ky_2[] ky_2Array = TN.D();
        int n11 = byArray.length;
        if (ky_2Array != null) {
            if (n11 >= 2) {
                n10 = B8.M(byArray, 0);
            }
            n11 = n10;
        }
        return (short)n11;
    }

    public static void s(ky_2[] ky_2Array) {
        Z = ky_2Array;
    }

    public static ky_2[] D() {
        return Z;
    }

    static {
        if (TN.D() == null) {
            TN.s(new ky_2[4]);
        }
    }
}

