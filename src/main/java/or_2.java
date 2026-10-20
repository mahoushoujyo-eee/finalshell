/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from or
 */
public class or_2 {
    List q;
    boolean V = false;
    int A = or_2.a(10004, 242278767978422633L);
    int m = or_2.a(2570, 8430846948041362548L);
    int Z = 0;
    int U;
    String z = "";
    byte[] t;
    Socket H;
    Socket e;
    boolean l = false;
    int c;
    ArrayList W = new ArrayList();
    Semaphore T = new Semaphore(0);
    int r = 0;
    int p = -1;
    static int k;
    static int R;
    int v = 0;
    YM o;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;
    private static final long f;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "?eo\u0002\u001e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 112;
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
                        case 0 -> 7;
                        case 1 -> 122;
                        case 2 -> 108;
                        case 3 -> 6;
                        case 4 -> 84;
                        case 5 -> 83;
                        default -> 107;
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
        long l2 = 1903955597681108539L;
        long[] lArray = new long[3];
        int n17 = 0;
        String string = "\u00ba3A\u0015\u00f2G\u00ceI\u00d0\u00bb\u00be&8\u0017*O\u00f6\u008av=6\u001f\u0000\u0082";
        int n18 = "\u00ba3A\u0015\u00f2G\u00ceI\u00d0\u00bb\u00be&8\u0017*O\u00f6\u008av=6\u001f\u0000\u0082".length();
        int n19 = 0;
        do {
            byte[] byArray = string.substring(n19, n19 += 8).getBytes("ISO-8859-1");
            int n20 = n17++;
            lArray[n20] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n19 < n18);
        b = lArray;
        d = new Integer[3];
        long l3 = 5019807124442072680L;
        f = 0x45A9EFFBCD58479CL ^ l3;
        k = 1;
        R = or_2.a(28175, 2179316896445360240L);
    }

    public or_2(YM yM, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int n10, int n11) {
        this(yM, dataInputStream, dataOutputStream, n10, n11, null, 0);
    }

    public or_2(YM yM, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int n10, int n11, byte[] byArray, int n12) {
        this.o = yM;
        this.q = new Vector();
        this.m = n11;
        this.t = byArray;
        this.c = n10;
        f2_0 f2_02 = new f2_0(this, byArray, dataOutputStream, n12, dataInputStream);
        la_1.b.execute(f2_02);
    }

    /*
     * Loose catch block
     */
    void G() {
        block15: {
            or_2 or_22;
            block18: {
                Socket socket;
                block16: {
                    ky_2[] ky_2Array;
                    block17: {
                        block19: {
                            ky_2Array = qm_0.J();
                            or_2 or_23 = this;
                            if (ky_2Array == null) break block19;
                            try {
                                block20: {
                                    if (or_23.V) break block15;
                                    break block20;
                                    catch (InterruptedException interruptedException) {
                                        throw or_2.a(interruptedException);
                                    }
                                }
                                or_23 = this;
                            }
                            catch (InterruptedException interruptedException) {
                                throw or_2.a(interruptedException);
                            }
                        }
                        or_23.V = true;
                        try {
                            Thread.sleep(f);
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        try {
                            try {
                                socket = this.H;
                                if (ky_2Array == null) break block16;
                                if (socket == null) break block17;
                            }
                            catch (InterruptedException interruptedException) {
                                throw or_2.a(interruptedException);
                            }
                            la_1.b.execute(new KW(this));
                        }
                        catch (InterruptedException interruptedException) {
                            throw or_2.a(interruptedException);
                        }
                    }
                    try {
                        or_22 = this;
                        if (ky_2Array == null) break block18;
                        socket = or_22.e;
                    }
                    catch (InterruptedException interruptedException) {
                        throw or_2.a(interruptedException);
                    }
                }
                try {
                    if (socket != null) {
                        la_1.b.execute(new tj_2(this));
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw or_2.a(interruptedException);
                }
                or_22 = this;
            }
            or_22.g();
        }
    }

    gI H(String string) {
        String[] stringArray;
        gI gI2 = new gI(this);
        String string2 = null;
        string = string.replaceAll("\r", "");
        string = string.replaceAll(" ", "");
        String[] stringArray2 = stringArray = string.split("\n");
        int n10 = stringArray.length;
        int n11 = 0;
        ky_2[] ky_2Array = qm_0.J();
        while (n11 < n10) {
            block7: {
                String string3;
                block6: {
                    String string4;
                    string3 = string4 = stringArray2[n11];
                    if (ky_2Array == null) break block6;
                    if (!string3.startsWith(a)) break block7;
                    string3 = string4.substring(5);
                }
                String string5 = string3;
                int n12 = string5.indexOf(":");
                if (ky_2Array != null) {
                    if (n12 > -1) {
                        int n13 = Integer.parseInt(string5.substring(n12 + 1));
                        gI2.Z(n13);
                        string5 = string5.substring(0, n12);
                    }
                    string2 = string5;
                }
                gI2.C(string2);
            }
            ++n11;
        }
        return gI2;
    }

    public void D(fs_0 fs_02) {
        this.q.add(fs_02);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    void g() {
        ky_2[] ky_2Array = qm_0.J();
        Iterator iterator = this.q.iterator();
        boolean bl = true;
        do {
            if (bl && !(bl = false) && ky_2Array != null) continue;
            fs_0 fs_02 = (fs_0)iterator.next();
            fs_02.x();
        } while (iterator.hasNext());
    }

    public int O() {
        return this.Z;
    }

    public void b(int n10) {
        this.Z = n10;
    }

    public int y() {
        return this.U;
    }

    public void M(int n10) {
        this.U = n10;
    }

    public String s() {
        return this.z;
    }

    public void O(String string) {
        this.z = string;
    }

    public Socket V() {
        return this.H;
    }

    public void B(Socket socket) {
        this.H = socket;
    }

    public Socket X() {
        return this.e;
    }

    public void i(Socket socket) {
        this.e = socket;
    }

    public int Y() {
        return this.p;
    }

    public void J(int n10) {
        this.p = n10;
    }

    public int Z() {
        return this.v;
    }

    public void x(int n10) {
        this.v = n10;
    }

    public YM X() {
        return this.o;
    }

    public void q(YM yM) {
        this.o = yM;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x67F;
        if (d[n11] == null) {
            or_2.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

