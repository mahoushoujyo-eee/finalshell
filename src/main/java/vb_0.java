/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * Renamed from Vb
 */
public abstract class vb_0 {
    protected short V = cs_0.a;
    protected short E = 0;
    protected DatagramPacket O;
    public int p;
    public int x;
    private static ky_2[] h;

    public int V() {
        return this.E;
    }

    public int M() {
        return this.V;
    }

    public DatagramPacket S() {
        return this.O;
    }

    public void D(InetAddress inetAddress) {
        this.O.setAddress(inetAddress);
    }

    public void A(int n10) {
        this.O.setPort(n10);
    }

    public int J() {
        return this.p;
    }

    public void x(int n10) {
        this.p = n10;
    }

    public int w() {
        return this.x;
    }

    public void T(int n10) {
        this.x = n10;
    }

    public static void x(ky_2[] ky_2Array) {
        h = ky_2Array;
    }

    public static ky_2[] U() {
        return h;
    }

    static {
        if (vb_0.U() == null) {
            vb_0.x(new ky_2[2]);
        }
    }
}

