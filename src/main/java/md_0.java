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
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from md
 */
public class md_0
implements yx_0 {
    Socket a;
    Socket S;
    public DataInputStream I;
    public DataOutputStream M;
    public DataInputStream g;
    public DataOutputStream m;
    Object Q = new Object();
    Object K = new Object();
    Object X = new Object();
    Object F = new Object();
    ArrayList U = new ArrayList();
    ArrayList j = new ArrayList();
    byte[] s = new byte[0];
    int T = 1;
    int t = 1;
    boolean n = false;
    boolean x = false;
    boolean O = false;
    boolean v = false;
    boolean w = false;
    boolean V = false;
    boolean q = false;
    String Z = d;
    String p = "";
    static int N;
    Random k = new Random();
    long h;
    static int c;
    boolean C = false;
    long i = System.currentTimeMillis();
    static ExecutorService b;
    Socket B;
    Socket P;
    int r = -1;
    String R = null;
    private static final String d;

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
                char[] cArray3 = "0=?5\"b\u001c0=?5".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 120;
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
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 104;
                            break;
                        }
                        case 1: {
                            n17 = 101;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 122;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 68;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
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
        d = new String(cArray).intern();
        N = 0;
        c = 0;
        b = Executors.newCachedThreadPool();
    }

    public void x(Socket socket) {
        this.S = socket;
    }

    public void v(long l2) {
        this.h = l2;
    }

    public boolean s() {
        return this.C;
    }

    public long h() {
        return this.i;
    }

    void s() {
        this.i = System.currentTimeMillis();
    }

    public long q() {
        return this.h;
    }

    public void n() {
        this.G(true);
    }

    /*
     * Unable to fully structure code
     */
    public void G(boolean var1_1) {
        block8: {
            var2_2 = QI.N();
            try {
                v0 = this;
                if (var2_2 != null) {
                    if (v0.C) break block8;
                }
                ** GOTO lbl13
            }
            catch (IOException v1) {
                throw md_0.a(v1);
            }
            this.C = true;
            try {
                v0 = this;
lbl13:
                // 2 sources

                v0.a.close();
            }
            catch (IOException var3_3) {
                var3_3.printStackTrace();
            }
            if (var1_1) {
                try {
                    this.S.close();
                }
                catch (IOException var3_4) {
                    var3_4.printStackTrace();
                }
            }
        }
    }

    void z() {
        this.n();
    }

    public void N() {
        ls_0 ls_02 = new ls_0(this);
        b.execute(ls_02);
    }

    @Override
    public void X() {
    }

    public Socket c() {
        return this.B;
    }

    public void Z(Socket socket) {
        this.B = socket;
    }

    public Socket o() {
        return this.P;
    }

    public void g(Socket socket) {
        this.P = socket;
    }

    public int o() {
        return this.r;
    }

    public void W(int n10) {
        this.r = n10;
    }

    public String g() {
        return this.R;
    }

    public void Y(String string) {
        this.R = string;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

