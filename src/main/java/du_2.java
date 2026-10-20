/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Renamed from du
 */
public class du_2
implements fs_0 {
    Socket R;
    Socket N;
    public DataInputStream r;
    public DataOutputStream x;
    public DataInputStream d;
    public DataOutputStream z;
    Object C = new Object();
    Object Y = new Object();
    Object q = new Object();
    Object G = new Object();
    ArrayList m = new ArrayList();
    ArrayList w = new ArrayList();
    byte[] D = new byte[0];
    int c = 1;
    int E = 1;
    boolean t = false;
    boolean p = false;
    boolean j = false;
    boolean s = false;
    boolean o = false;
    boolean h = false;
    boolean L = false;
    String H = a;
    String e = "";
    static int K;
    Random F = new Random();
    long U;
    static int Z;
    boolean B = false;
    long i = System.currentTimeMillis();
    static ExecutorService k;
    Socket O;
    Socket J;
    int W = -1;
    String M = null;
    private static final String a;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0012QY;p6>\u0012QY;".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 52;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 6;
                        case 1 -> 69;
                        case 2 -> 77;
                        case 3 -> 47;
                        case 4 -> 100;
                        case 5 -> 34;
                        default -> 42;
                    })));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        K = 0;
        Z = 0;
        k = Executors.newCachedThreadPool();
    }

    public void E(Socket socket) {
        this.N = socket;
    }

    public void c(long l2) {
        this.U = l2;
    }

    public boolean K() {
        return this.B;
    }

    public long n() {
        return this.i;
    }

    void I() {
        this.i = System.currentTimeMillis();
    }

    public long i() {
        return this.U;
    }

    public void y() {
        this.v(true);
    }

    /*
     * Unable to fully structure code
     */
    public void v(boolean var1_1) {
        block8: {
            var2_2 = qm_0.J();
            try {
                v0 = this;
                if (var2_2 != null) {
                    if (v0.B) break block8;
                }
                ** GOTO lbl13
            }
            catch (IOException v1) {
                throw du_2.a(v1);
            }
            this.B = true;
            try {
                v0 = this;
lbl13:
                // 2 sources

                v0.R.close();
            }
            catch (IOException var3_3) {
                var3_3.printStackTrace();
            }
            if (var1_1) {
                try {
                    this.N.close();
                }
                catch (IOException var3_4) {
                    var3_4.printStackTrace();
                }
            }
        }
    }

    void e() {
        this.y();
    }

    public void R() {
        lq_2 lq_22 = new lq_2(this);
        k.execute(lq_22);
    }

    @Override
    public void x() {
    }

    public Socket m() {
        return this.O;
    }

    public void d(Socket socket) {
        this.O = socket;
    }

    public Socket z() {
        return this.J;
    }

    public void w(Socket socket) {
        this.J = socket;
    }

    public int U() {
        return this.W;
    }

    public void n(int n10) {
        this.W = n10;
    }

    public String p() {
        return this.M;
    }

    public void Y(String string) {
        this.M = string;
    }

    @Override
    public void V(String string) {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

