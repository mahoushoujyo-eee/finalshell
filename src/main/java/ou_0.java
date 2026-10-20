/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/*
 * Renamed from Ou
 */
public class ou_0 {
    private InetAddress C;
    private int y;
    private boolean G = false;
    private Thread v;
    private Random j = new Random();
    private int H = this.j.nextInt();
    private InetAddress K;
    private int V;
    private QI B;
    private boolean c = false;
    private boolean F = false;
    private boolean p = false;
    public long P = System.currentTimeMillis();
    long N;
    boolean A = false;
    public int U = 0;
    boolean D = false;
    boolean u = false;

    public boolean i() {
        return this.u;
    }

    public void o(boolean bl) {
        this.u = bl;
    }

    public boolean V() {
        return this.D;
    }

    public void X(boolean bl) {
        this.D = bl;
    }

    public long M() {
        return this.P;
    }

    public void q(long l2) {
        this.P = l2;
    }

    public boolean w() {
        String[] stringArray = QI.N();
        boolean bl = this.y();
        if (stringArray != null) {
            bl = !bl;
        }
        boolean bl2 = this.p;
        if (stringArray != null) {
            bl2 = !bl2;
        }
        int n10 = bl & bl2;
        long l2 = System.currentTimeMillis() - this.N - (long)yh_0.U;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (stringArray != null) {
            l3 = l3 > 0 ? (long)1 : (long)0;
        }
        boolean bl3 = n10 & l3;
        return bl3;
    }

    public void m() {
        this.p = false;
    }

    public boolean b() {
        return this.p;
    }

    public void D(String string, int n10) {
        try {
            this.C = InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        this.y = n10;
    }

    public void u(String string, int n10) {
        try {
            this.K = InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        this.V = n10;
    }

    public void A(InetAddress inetAddress, int n10) {
        this.K = inetAddress;
        this.V = n10;
    }

    public boolean y() {
        return this.c;
    }

    public void A(QI qI) {
        this.B = qI;
    }

    void x() {
        this.G = false;
        this.v.interrupt();
    }
}

