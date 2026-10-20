/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;

public class FO {
    DatagramSocket K;
    public InetAddress c;
    public int b;
    LinkedBlockingQueue i = new LinkedBlockingQueue();
    boolean H = true;
    F0 O;
    InetAddress h;
    String n;
    int F;
    HashSet W = new HashSet();
    String L;
    int S = (int)e;
    int X;
    QI C;
    String a;
    InetAddress f;
    int R;
    int t = -1;
    byte[] o;
    private static final String d;
    private static final long e;

    public FO(QI qI, String string, int n10, F0 f02, InetAddress inetAddress, int n11, String string2, int n12) {
        this.C = qI;
        this.a = string;
        try {
            this.f = InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        this.R = n10;
        this.O = f02;
        this.c = inetAddress;
        this.b = n11;
        this.L = string2;
        this.X = n12;
        try {
            this.K = new DatagramSocket();
            this.K.setSoTimeout(this.S);
        }
        catch (SocketException socketException) {
            socketException.printStackTrace();
        }
        QI.U.execute(new l3_0(this));
    }

    void B(DatagramPacket datagramPacket) {
        byte[] byArray = this.o;
        byte[] byArray2 = new byte[byArray.length + datagramPacket.getLength()];
        byte[] byArray3 = datagramPacket.getData();
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        System.arraycopy(byArray3, 0, byArray2, byArray.length, datagramPacket.getLength());
        this.O.A(byArray2);
    }

    public void a(byte[] byArray) {
        byte[] byArray2 = this.o;
        byte[] byArray3 = new byte[byArray2.length + byArray.length];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray2.length);
        System.arraycopy(byArray, 0, byArray3, byArray2.length, byArray.length);
        this.O.A(byArray3);
    }

    /*
     * Unable to fully structure code
     */
    public void T(DatagramPacket var1_1) {
        var2_2 = QI.N();
        try {
            block9: {
                block10: {
                    block11: {
                        ++this.t;
                        var3_3 = var1_1.getData();
                        var4_6 = new ByteArrayInputStream(var3_3, 0, var1_1.getLength());
                        var5_7 = new JX(var4_6);
                        var6_8 = var4_6.available();
                        var4_6.close();
                        var7_9 = new byte[var6_8];
                        System.arraycopy(var1_1.getData(), var1_1.getLength() - var6_8, var7_9, 0, var6_8);
                        this.F = var5_7.R;
                        if (var2_2 == null) break block10;
                        if (var5_7.e == null) ** GOTO lbl28
                        break block11;
                        catch (IOException v0) {
                            throw FO.a(v0);
                        }
                    }
                    try {
                        block12: {
                            this.h = var5_7.e;
                            this.n = this.h.getHostAddress();
                            this.o = this.c(this.h, this.F);
                            if (var2_2 != null) break block9;
                            break block12;
                            catch (IOException v1) {
                                throw FO.a(v1);
                            }
                        }
                        this.n = var5_7.B;
                    }
                    catch (IOException v2) {
                        throw FO.a(v2);
                    }
                }
                this.o = this.B(this.n, this.F);
            }
            jy_0.g(FO.d + this.n + ":" + this.F);
            var8_10 = this.C.a(this, this.f, this.R, this.n, this.F, this.X);
            var8_10.W(var7_9, this.t);
            this.C.e.p(var8_10, this.t);
        }
        catch (IOException var3_4) {
            var3_4.printStackTrace();
        }
        catch (Exception var3_5) {
            var3_5.printStackTrace();
        }
    }

    private byte[] c(InetAddress inetAddress, int n10) {
        JX jX = new JX(0, inetAddress, n10);
        jX.Q[0] = 0;
        return jX.Q;
    }

    private byte[] B(String string, int n10) {
        JX jX = new JX(0, string, n10);
        jX.Q[0] = 0;
        return jX.Q;
    }

    public void Z() {
        this.H = false;
        this.K.close();
        this.O.B(this);
    }

    public String j() {
        return this.L;
    }

    public void S(String string) {
        this.L = string;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

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
                char[] cArray3 = "\u8b84\u6c4d;cN=".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 88;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 87;
                            break;
                        }
                        case 2: {
                            n17 = 22;
                            break;
                        }
                        case 3: {
                            n17 = 95;
                            break;
                        }
                        case 4: {
                            n17 = 102;
                            break;
                        }
                        case 5: {
                            n17 = 69;
                            break;
                        }
                        default: {
                            n17 = 38;
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
        long l2 = 509683582486133716L;
        e = 0xBFE6FBE691EBA834L ^ l2;
    }
}

