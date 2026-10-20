/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class F0 {
    public DatagramSocket X;
    public int z;
    Socket S;
    InetAddress w;
    int r;
    HashMap T = new HashMap();
    Object y = new Object();
    F0 L;
    InputStream q;
    static Random x;
    QI N;
    String U;
    int C;
    public dm_2 l;
    boolean E = false;
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
                char[] cArray3 = "\u65bc\u905d\u9042k".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 72;
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
                            n17 = 68;
                            break;
                        }
                        case 1: {
                            n17 = 15;
                            break;
                        }
                        case 2: {
                            n17 = 89;
                            break;
                        }
                        case 3: {
                            n17 = 3;
                            break;
                        }
                        case 4: {
                            n17 = 112;
                            break;
                        }
                        case 5: {
                            n17 = 89;
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
        x = new Random();
    }

    public F0(dm_2 dm_22, QI qI, String string, int n10, Socket socket, InputStream inputStream, DatagramSocket datagramSocket) {
        this.l = dm_22;
        this.N = qI;
        this.U = string;
        this.C = n10;
        this.q = inputStream;
        this.L = this;
        this.z = datagramSocket.getLocalPort();
        jy_0.g(a + this.z);
        this.S = socket;
        this.X = datagramSocket;
        this.N();
        QI.U.execute(new lb_2(this, inputStream));
    }

    public F0(dm_2 dm_22, QI qI, String string, int n10) {
        this.E = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void d() {
        v0 = QI.N();
        this.X.close();
        var1_1 = v0;
        var2_2 = this.y;
        synchronized (var2_2) {
            var3_3 = this.g();
            if (var1_1 != null) ** GOTO lbl14
            block3: while (true) {
                v1 = this.T.get(var3_3.next());
                do {
                    var4_4 = (FO)v1;
                    var4_4.Z();
lbl14:
                    // 2 sources

                    if (var3_3.hasNext()) continue block3;
                    v1 = var2_2;
                } while (var1_1 == null);
                break;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            this.l.D(this);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Iterator g() {
        gN gN2 = null;
        Object object = this.y;
        synchronized (object) {
            gN2 = new gN(this.T.keySet().iterator());
        }
        return gN2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void e(DatagramPacket var1_1) {
        var3_2 = new ByteArrayInputStream(var1_1.getData(), 0, var1_1.getLength());
        var2_3 = QI.N();
        try {
            block14: {
                block13: {
                    var4_4 = new JX(var3_2);
                    var5_7 = "";
                    try {
                        v0 = var4_4;
                        if (var2_3 == null) break block13;
                        if (v0.e != null) {
                        }
                        ** GOTO lbl17
                    }
                    catch (b5_0 v1) {
                        throw F0.a(v1);
                    }
                    var5_7 = var4_4.e.getHostAddress();
                    try {
                        if (var2_3 != null) break block14;
lbl17:
                        // 2 sources

                        v0 = var4_4;
                    }
                    catch (b5_0 v2) {
                        throw F0.a(v2);
                    }
                }
                var5_7 = v0.B;
            }
            var6_8 = String.valueOf(var1_1.getAddress().getHostAddress()) + ":" + var1_1.getPort() + var5_7 + ":" + var4_4.R;
            var7_9 = (FO)this.T.get(var6_8);
            var3_2.close();
            var8_10 = this.y;
            synchronized (var8_10) {
                v3 = var7_9;
                if (var2_3 != null) {
                    if (v3 == null) {
                        var9_11 = Math.abs(F0.x.nextInt());
                        var7_9 = new FO(this.N, this.U, this.C, this.L, var1_1.getAddress(), var1_1.getPort(), var6_8, var9_11);
                        this.T.put(var6_8, var7_9);
                        this.w = var1_1.getAddress();
                        this.r = var1_1.getPort();
                    }
                    v3 = var8_10;
                }
                // ** MonitorExit[v3] (shouldn't be in output)
                var7_9.T(var1_1);
            }
        }
        catch (b5_0 var4_5) {
            var4_5.printStackTrace();
        }
        catch (IOException var4_6) {
            var4_6.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     */
    void A(byte[] var1_1) {
        block5: {
            var3_2 = new DatagramPacket(var1_1, var1_1.length);
            var3_2.setAddress(this.w);
            v0 = QI.N();
            var3_2.setPort(this.r);
            var2_3 = v0;
            try {
                v1 = this.X;
                if (var2_3 != null) {
                    if (v1.isClosed()) break block5;
                }
                ** GOTO lbl16
            }
            catch (IOException v2) {
                throw F0.a(v2);
            }
            try {
                v1 = this.X;
lbl16:
                // 2 sources

                v1.send(var3_2);
            }
            catch (IOException var4_4) {
                var4_4.printStackTrace();
            }
        }
    }

    void N() {
        QI.U.execute(new xF(this));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void B(FO fO2) {
        Object object = this.y;
        synchronized (object) {
            this.T.remove(fO2.j());
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

