/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * Renamed from nk
 */
public abstract class nk_0 {
    protected short L = 0;
    protected short R = 0;
    protected DatagramPacket o;
    private static String[] D;

    public nk_0() {
        String[] stringArray = nk_0.s();
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
    }

    public int p() {
        return this.R;
    }

    public int G() {
        return this.L;
    }

    public DatagramPacket k() {
        return this.o;
    }

    public void s(InetAddress inetAddress) {
        this.o.setAddress(inetAddress);
    }

    public void v(int n10) {
        this.o.setPort(n10);
    }

    public static void f(String[] stringArray) {
        D = stringArray;
    }

    public static String[] s() {
        return D;
    }

    static {
        if (nk_0.s() != null) {
            nk_0.f(new String[3]);
        }
    }
}

