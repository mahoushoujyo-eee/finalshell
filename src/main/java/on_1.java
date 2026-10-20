/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.InetAddress;

/*
 * Renamed from oN
 */
public class on_1 {
    InetAddress l;
    int W;
    int n;

    on_1(InetAddress inetAddress, int n10) {
        this.l = inetAddress;
        int[] nArray = cy_0.u();
        this.W = n10;
        this.n = (String.valueOf(inetAddress.toString()) + inetAddress).hashCode();
        if (nArray == null) {
            ky_2.K(new String[4]);
        }
    }

    public int hashCode() {
        return this.n;
    }

    public boolean equals(Object object) {
        on_1 on_12 = (on_1)object;
        int[] nArray = cy_0.u();
        if (object == null) {
            return false;
        }
        int n11 = this.l.equals(on_12.l);
        n11 = this.W;
        if (nArray != null) {
            n11 = n11 == on_12.W ? 1 : 0;
        }
        boolean bl = n10 & n11;
        if (ky_2.F() != null) {
            cy_0.c(new int[3]);
        }
        return bl;
    }
}

