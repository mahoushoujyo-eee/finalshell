/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class WC {
    protected short W = yh_0.i;
    protected short T = 0;
    protected DatagramPacket g;
    public int l;
    public int H;
    private static ky_2[] d;

    public int y() {
        return this.T;
    }

    public int M() {
        return this.W;
    }

    public DatagramPacket H() {
        return this.g;
    }

    public void K(InetAddress inetAddress) {
        this.g.setAddress(inetAddress);
    }

    public void S(int n10) {
        this.g.setPort(n10);
    }

    public int w() {
        return this.l;
    }

    public void Q(int n10) {
        this.l = n10;
    }

    public int Z() {
        return this.H;
    }

    public void u(int n10) {
        this.H = n10;
    }

    public static void X(ky_2[] ky_2Array) {
        d = ky_2Array;
    }

    public static ky_2[] U() {
        return d;
    }

    static {
        if (WC.U() == null) {
            WC.X(new ky_2[4]);
        }
    }
}

