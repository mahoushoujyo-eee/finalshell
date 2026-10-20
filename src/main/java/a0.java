/*
 * Decompiled with CFR 0.152.
 */
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
 */
public class a0 {
    List p;
    boolean t = false;
    int w = a0.a(2920, 6871379940283314408L);
    int Q = a0.a(1120, 6638462424036573154L);
    int Y = 0;
    int R;
    String M = "";
    byte[] m;
    Socket x;
    Socket L;
    boolean P = false;
    int q;
    ArrayList g = new ArrayList();
    Semaphore E = new Semaphore(0);
    int V = 0;
    int K = -1;
    static int d;
    static int T;
    int B = 0;
    zq_0 F;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long e;

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
                char[] cArray3 = "a]:Y&".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 6;
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
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 52;
                            break;
                        }
                        case 2: {
                            n17 = 79;
                            break;
                        }
                        case 3: {
                            n17 = 43;
                            break;
                        }
                        case 4: {
                            n17 = 26;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 57;
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
        a = new String(cArray).intern();
        long l2 = 3704990132045930556L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00e7\u0095\nce\u00b8\u0017\u0004\u00d0+\b\u0086\u00bd\u0096\u00d2\u00c4[\u00be\n~%\u00d6\u009f\u00de";
        int n19 = "\u00e7\u0095\nce\u00b8\u0017\u0004\u00d0+\b\u0086\u00bd\u0096\u00d2\u00c4[\u00be\n~%\u00d6\u009f\u00de".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
        long l3 = 6495496444793209063L;
        e = 0x5A24A39A17B64113L ^ l3;
        d = 1;
        T = a0.a(18811, 567511245490107130L);
    }

    public a0(zq_0 zq_02, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int n10, int n11) {
        this(zq_02, dataInputStream, dataOutputStream, n10, n11, null, 0);
    }

    public a0(zq_0 zq_02, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int n10, int n11, byte[] byArray, int n12) {
        this.F = zq_02;
        this.p = new Vector();
        this.Q = n11;
        this.m = byArray;
        this.q = n10;
        ys_1 ys_12 = new ys_1(this, byArray, dataOutputStream, n12, dataInputStream, n11);
        QI.U.execute(ys_12);
    }

    /*
     * Loose catch block
     */
    void W() {
        block15: {
            a0 a02;
            block18: {
                Socket socket;
                block16: {
                    String[] stringArray;
                    block17: {
                        block19: {
                            stringArray = QI.N();
                            a0 a03 = this;
                            if (stringArray == null) break block19;
                            try {
                                block20: {
                                    if (a03.t) break block15;
                                    break block20;
                                    catch (InterruptedException interruptedException) {
                                        throw a0.a(interruptedException);
                                    }
                                }
                                a03 = this;
                            }
                            catch (InterruptedException interruptedException) {
                                throw a0.a(interruptedException);
                            }
                        }
                        a03.t = true;
                        try {
                            Thread.sleep(e);
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        try {
                            try {
                                socket = this.x;
                                if (stringArray == null) break block16;
                                if (socket == null) break block17;
                            }
                            catch (InterruptedException interruptedException) {
                                throw a0.a(interruptedException);
                            }
                            QI.U.execute(new B9(this));
                        }
                        catch (InterruptedException interruptedException) {
                            throw a0.a(interruptedException);
                        }
                    }
                    try {
                        a02 = this;
                        if (stringArray == null) break block18;
                        socket = a02.L;
                    }
                    catch (InterruptedException interruptedException) {
                        throw a0.a(interruptedException);
                    }
                }
                try {
                    if (socket != null) {
                        QI.U.execute(new jv_0(this));
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw a0.a(interruptedException);
                }
                a02 = this;
            }
            a02.Y();
        }
    }

    DW f(String string) {
        DW dW = new DW(this);
        String string2 = null;
        string = string.replaceAll("\r", "");
        string = string.replaceAll(" ", "");
        String[] stringArray = string.split("\n");
        String[] stringArray2 = QI.N();
        String[] stringArray3 = stringArray;
        int n10 = stringArray.length;
        int n11 = 0;
        while (n11 < n10) {
            block7: {
                String string3;
                block6: {
                    String string4;
                    string3 = string4 = stringArray3[n11];
                    if (stringArray2 == null) break block6;
                    if (!string3.startsWith(a)) break block7;
                    string3 = string4.substring(5);
                }
                String string5 = string3;
                int n12 = string5.indexOf(":");
                if (stringArray2 != null) {
                    if (n12 > -1) {
                        int n13 = Integer.parseInt(string5.substring(n12 + 1));
                        dW.o(n13);
                        string5 = string5.substring(0, n12);
                    }
                    string2 = string5;
                }
                dW.B(string2);
            }
            ++n11;
        }
        return dW;
    }

    public void O(yx_0 yx_02) {
        this.p.add(yx_02);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    void Y() {
        String[] stringArray = QI.N();
        Iterator iterator = this.p.iterator();
        boolean bl = true;
        do {
            if (bl && !(bl = false) && stringArray != null) continue;
            yx_0 yx_02 = (yx_0)iterator.next();
            yx_02.X();
        } while (iterator.hasNext());
    }

    public int F() {
        return this.Y;
    }

    public void l(int n10) {
        this.Y = n10;
    }

    public int c() {
        return this.R;
    }

    public void M(int n10) {
        this.R = n10;
    }

    public String B() {
        return this.M;
    }

    public void p(String string) {
        this.M = string;
    }

    public Socket B() {
        return this.x;
    }

    public void E(Socket socket) {
        this.x = socket;
    }

    public Socket D() {
        return this.L;
    }

    public void g(Socket socket) {
        this.L = socket;
    }

    public int I() {
        return this.K;
    }

    public void b(int n10) {
        this.K = n10;
    }

    public int N() {
        return this.B;
    }

    public void R(int n10) {
        this.B = n10;
    }

    public zq_0 b() {
        return this.F;
    }

    public void Q(zq_0 zq_02) {
        this.F = zq_02;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B80;
        if (c[n11] == null) {
            a0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

