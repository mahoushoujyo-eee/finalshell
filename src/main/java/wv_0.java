/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from Wv
 */
public class wv_0 {
    static Random W = new Random();

    public wv_0() {
        W = new Random();
    }

    public static int j() {
        return W.nextInt();
    }

    public static int A(int n10) {
        return W.nextInt(n10);
    }

    public static Long q() {
        return W.nextLong();
    }

    public static Float T() {
        return Float.valueOf(W.nextFloat());
    }
}

