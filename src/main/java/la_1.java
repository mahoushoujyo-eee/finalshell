/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from lA
 */
public class la_1 {
    private DatagramSocket X;
    public HashMap O;
    Thread s;
    Thread A;
    public static ThreadPoolExecutor b;
    public uf_0 x;
    Object f;
    Object B;
    Random G;
    public int K;
    LinkedBlockingQueue Q;
    public static int d;
    public static int w;
    public int i;
    String V;
    HashSet k;
    HashSet W;
    public static int R;
    public static int E;
    dl_0 e;
    HashSet h;
    public f9_0 n;
    public boolean P;
    public HashMap T;
    private static List r;
    private static final String a;
    private static final long[] c;
    private static final Integer[] g;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "@=?_w.\u000by0<\u000bb/Yxnl".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 29;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 17;
                        case 1 -> 73;
                        case 2 -> 81;
                        case 3 -> 54;
                        case 4 -> 15;
                        case 5 -> 93;
                        default -> 54;
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
        long l2 = 215896108088074117L;
        long[] lArray = new long[2];
        int n17 = 0;
        String string = "\u0094j\u009d\u00d1\u00df\u00c0\u00a4r\u00af\u00d0 \u009e\u000bP=\u0016";
        int n18 = "\u0094j\u009d\u00d1\u00df\u00c0\u00a4r\u00af\u00d0 \u009e\u000bP=\u0016".length();
        int n19 = 0;
        do {
            byte[] byArray = string.substring(n19, n19 += 8).getBytes("ISO-8859-1");
            int n20 = n17++;
            lArray[n20] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n19 < n18);
        c = lArray;
        g = new Integer[2];
        long l3 = 4329141988402462966L;
        long l4 = 0x3C1433B3A0F527E6L ^ l3;
        d = la_1.a(988, 1694877988886821877L);
        w = 1;
        r = new Vector();
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
        b = threadPoolExecutor = new ThreadPoolExecutor(5, 5, l4, TimeUnit.MILLISECONDS, synchronousQueue);
    }

    public static int x(short s2) {
        return s2 & la_1.a(25924, 4537513190672194924L);
    }

    public la_1(String string, short s2, int n10, boolean bl, boolean bl2) throws Exception {
        block11: {
            block9: {
                this.f = new Object();
                this.B = new Object();
                this.G = new Random();
                ky_2[] ky_2Array = qm_0.J();
                try {
                    la_1 la_12;
                    block10: {
                        try {
                            try {
                                this.K = Math.abs(this.G.nextInt());
                                this.Q = new LinkedBlockingQueue();
                                this.i = w;
                                this.V = "";
                                this.k = new HashSet();
                                this.W = new HashSet();
                                this.h = new HashSet();
                                this.P = true;
                                this.T = new HashMap();
                                this.x = new uf_0();
                                this.i = n10;
                                this.P = bl;
                                this.V = string;
                                la_12 = this;
                                if (ky_2Array == null) break block9;
                                if (la_12.i != 2) break block10;
                            }
                            catch (Exception exception) {
                                throw la_1.a(exception);
                            }
                            lx_2.F(a + la_1.x(s2));
                            this.X = new DatagramSocket(la_1.x(s2));
                            if (ky_2Array != null) break block11;
                        }
                        catch (Exception exception) {
                            throw la_1.a(exception);
                        }
                    }
                    la_12 = this;
                }
                catch (Exception exception) {
                    throw la_1.a(exception);
                }
            }
            la_12.X = new DatagramSocket();
        }
        try {
            this.O = new HashMap();
            this.e = new dl_0(this);
            this.A = new JP(this);
            this.A.start();
            this.s = new ko_0(this);
            this.s.start();
            if (ky_2.F() != null) {
                qm_0.F(new ky_2[4]);
            }
        }
        catch (Exception exception) {
            throw la_1.a(exception);
        }
    }

    public static void e(ao_0 ao_02) {
        r.add(ao_02);
    }

    /*
     * Unable to fully structure code
     */
    static void F(cr_2 var0) {
        var1_1 = qm_0.J();
        var3_2 = la_1.r.iterator();
        if (var1_1 != null) ** GOTO lbl19
        block0: while (true) {
            block5: {
                block3: {
                    block4: {
                        var2_3 = (ao_0)var3_2.next();
                        v0 = var4_4 = var0.R();
                        v1 = cr_2.Z;
                        if (var1_1 == null) break block3;
                        if (v0 != v1) break block4;
                        var2_3.a(var0);
                        if (var1_1 != null) break block5;
                    }
                    v0 = var4_4;
                    if (var1_1 == null) ** GOTO lbl22
                    v1 = cr_2.i;
                }
                if (v0 == v1) {
                    var2_3.W(var0);
                }
            }
            do {
                v0 = var3_2.hasNext();
lbl22:
                // 2 sources

                if (v0 != 0) continue block0;
            } while (var1_1 == null);
            break;
        }
    }

    public void H(DatagramPacket datagramPacket) throws IOException {
        this.X.send(datagramPacket);
    }

    public o0_0 X() {
        o0_0 o0_02 = null;
        try {
            Class<?> clazz = Class.forName(this.V);
            o0_02 = (o0_0)clazz.newInstance();
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        return o0_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void g(qm_0 qm_02) {
        Object object = this.f;
        synchronized (object) {
            this.W.add(qm_02.W);
            this.O.remove(qm_02.W);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public qm_0 A(InetAddress inetAddress, int n10, int n11, int n12) throws Exception {
        qm_0 qm_02;
        block5: {
            qm_0 qm_03;
            block6: {
                qm_03 = (qm_0)this.O.get(n11);
                ky_2[] ky_2Array = qm_0.J();
                try {
                    qm_02 = qm_03;
                    if (ky_2Array == null) break block5;
                    if (qm_02 != null) break block6;
                }
                catch (Exception exception) {
                    throw la_1.a(exception);
                }
                f9_0 f9_02 = this.e.d(n12, inetAddress, n10);
                qm_03 = new qm_0(this, inetAddress, n10, 2, n11, f9_02);
                Object object = this.f;
                synchronized (object) {
                    this.O.put(n11, qm_03);
                }
                f9_02.b(qm_03);
            }
            qm_02 = qm_03;
        }
        return qm_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public qm_0 h(String string, int n10, String string2) throws Exception {
        InetAddress inetAddress = InetAddress.getByName(string);
        int n11 = Math.abs(this.G.nextInt());
        String string3 = inetAddress.getHostAddress() + ":" + n10;
        int n12 = Math.abs(string3.hashCode());
        f9_0 f9_02 = this.e.d(n12, inetAddress, n10);
        f9_02.U(string2);
        qm_0 qm_02 = new qm_0(this, inetAddress, n10, 1, n11, f9_02);
        Object object = this.f;
        synchronized (object) {
            this.O.put(n11, qm_02);
        }
        f9_02.b(qm_02);
        this.n = f9_02;
        return qm_02;
    }

    public boolean h() {
        return this.P;
    }

    public void k(boolean bl) {
        this.P = bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3829;
        if (g[n11] == null) {
            la_1.g[n11] = (int)(c[n11] ^ l2);
        }
        return g[n11];
    }
}

