/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * Renamed from b_
 */
public class b__0
extends ServerSocket {
    protected y_0 N;
    protected String k;
    protected InetAddress s;
    protected int V;
    boolean U;
    InetAddress Y;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public b__0(String string, int n10) throws b5_0, UnknownHostException, IOException {
        this(y_0.a, string, n10);
    }

    public b__0(y_0 y_02, String string, int n10) throws b5_0, UnknownHostException, IOException {
        block14: {
            b__0 b__02;
            block12: {
                y_0 y_03;
                String[] stringArray;
                block10: {
                    block11: {
                        super(0);
                        this.U = false;
                        stringArray = jk_0.Y();
                        try {
                            try {
                                y_03 = y_02;
                                if (stringArray == null) break block10;
                                if (y_03 != null) break block11;
                            }
                            catch (b5_0 b5_02) {
                                throw b__0.a(b5_02);
                            }
                            throw new b5_0(b__0.a(8966, 3315797795392990498L));
                        }
                        catch (b5_0 b5_03) {
                            throw b__0.a(b5_03);
                        }
                    }
                    try {
                        this.N = y_02.B();
                        b__02 = this;
                        if (stringArray == null) break block12;
                        y_03 = b__02.N;
                    }
                    catch (b5_0 b5_04) {
                        throw b__0.a(b5_04);
                    }
                }
                try {
                    block13: {
                        try {
                            if (!y_03.X(string)) break block13;
                            this.Y = InetAddress.getByName(string);
                            this.N = null;
                            this.s();
                            if (stringArray != null) break block14;
                        }
                        catch (b5_0 b5_05) {
                            throw b__0.a(b5_05);
                        }
                    }
                    b__02 = this;
                }
                catch (b5_0 b5_06) {
                    throw b__0.a(b5_06);
                }
            }
            b__02.y(this.N.e(string, n10));
        }
    }

    public b__0(InetAddress inetAddress, int n10) throws b5_0, IOException {
        this(y_0.a, inetAddress, n10);
    }

    public b__0(y_0 y_02, InetAddress inetAddress, int n10) throws b5_0, IOException {
        block14: {
            b__0 b__02;
            block12: {
                y_0 y_03;
                String[] stringArray;
                block10: {
                    block11: {
                        String[] stringArray2 = jk_0.Y();
                        super(0);
                        stringArray = stringArray2;
                        try {
                            try {
                                this.U = false;
                                y_03 = y_02;
                                if (stringArray == null) break block10;
                                if (y_03 != null) break block11;
                            }
                            catch (b5_0 b5_02) {
                                throw b__0.a(b5_02);
                            }
                            throw new b5_0(b__0.a(28145, 232712163550880724L));
                        }
                        catch (b5_0 b5_03) {
                            throw b__0.a(b5_03);
                        }
                    }
                    try {
                        this.N = y_02.B();
                        b__02 = this;
                        if (stringArray == null) break block12;
                        y_03 = b__02.N;
                    }
                    catch (b5_0 b5_04) {
                        throw b__0.a(b5_04);
                    }
                }
                try {
                    block13: {
                        try {
                            if (!y_03.K(inetAddress)) break block13;
                            this.Y = inetAddress;
                            this.s();
                            if (stringArray != null) break block14;
                        }
                        catch (b5_0 b5_05) {
                            throw b__0.a(b5_05);
                        }
                    }
                    b__02 = this;
                }
                catch (b5_0 b5_06) {
                    throw b__0.a(b5_06);
                }
            }
            b__02.y(this.N.J(inetAddress, n10));
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Socket accept() throws IOException {
        block23: {
            block25: {
                block20: {
                    block21: {
                        block22: {
                            var1_1 = jk_0.Y();
                            try {
                                try {
                                    try {
                                        try {
                                            v0 = this;
                                            if (var1_1 == null) break block20;
                                            if (!v0.U) {
                                            }
                                            ** GOTO lbl37
                                        }
                                        catch (IOException v1) {
                                            throw b__0.a(v1);
                                        }
                                        v2 = this.N;
                                        if (var1_1 == null) break block21;
                                    }
                                    catch (IOException v3) {
                                        throw b__0.a(v3);
                                    }
                                    if (v2 != null) break block22;
                                }
                                catch (IOException v4) {
                                    throw b__0.a(v4);
                                }
                                return null;
                            }
                            catch (IOException v5) {
                                throw b__0.a(v5);
                            }
                        }
                        v2 = this.N;
                    }
                    var3_2 = v2.s();
                    try {
                        v6 = var3_2.e == null ? new tl_2(var3_2.B, var3_2.R, this.N) : new tl_2(var3_2.e, var3_2.R, this.N);
                    }
                    catch (IOException v7) {
                        throw b__0.a(v7);
                    }
                    var2_3 = v6;
                    try {
                        this.N.Y.setSoTimeout(0);
                        if (var1_1 != null) break block23;
lbl37:
                        // 3 sources

                        while (true) {
                            v0 = this;
                            break;
                        }
                    }
                    catch (IOException v8) {
                        throw b__0.a(v8);
                    }
                }
                var2_3 = super.accept();
                try {
                    block24: {
                        try {
                            try {
                                if (!var2_3.getInetAddress().equals(this.Y)) break block24;
                                if (var1_1 == null) break block25;
                            }
                            catch (IOException v9) {
                                throw b__0.a(v9);
                            }
                            if (var1_1 != null) break block23;
                        }
                        catch (IOException v10) {
                            throw b__0.a(v10);
                        }
                    }
                    var2_3.close();
                }
                catch (IOException v11) {
                    throw b__0.a(v11);
                }
            }
            ** while (var1_1 != null)
        }
        this.N = null;
        return var2_3;
    }

    @Override
    public void close() throws IOException {
        block4: {
            b__0 b__02;
            block5: {
                String[] stringArray = jk_0.Y();
                super.close();
                String[] stringArray2 = stringArray;
                try {
                    try {
                        b__02 = this;
                        if (stringArray2 == null) break block4;
                        if (b__02.N == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw b__0.a(iOException);
                    }
                    this.N.F();
                }
                catch (IOException iOException) {
                    throw b__0.a(iOException);
                }
            }
            b__02 = this;
        }
        b__02.N = null;
    }

    public String b() {
        return this.k;
    }

    @Override
    public InetAddress getInetAddress() {
        InetAddress inetAddress;
        block4: {
            block5: {
                String[] stringArray = jk_0.Y();
                try {
                    inetAddress = this.s;
                    if (stringArray == null) break block4;
                    if (inetAddress != null) break block5;
                }
                catch (UnknownHostException unknownHostException) {
                    throw b__0.a(unknownHostException);
                }
                try {
                    this.s = InetAddress.getByName(this.k);
                }
                catch (UnknownHostException unknownHostException) {
                    return null;
                }
            }
            inetAddress = this.s;
        }
        return inetAddress;
    }

    @Override
    public int getLocalPort() {
        return this.V;
    }

    @Override
    public void setSoTimeout(int n10) throws SocketException {
        block5: {
            b__0 b__02;
            block4: {
                String[] stringArray = jk_0.Y();
                super.setSoTimeout(n10);
                String[] stringArray2 = stringArray;
                try {
                    try {
                        b__02 = this;
                        if (stringArray2 == null) break block4;
                        if (b__02.U) break block5;
                    }
                    catch (SocketException socketException) {
                        throw b__0.a(socketException);
                    }
                    b__02 = this;
                }
                catch (SocketException socketException) {
                    throw b__0.a(socketException);
                }
            }
            b__02.N.Y.setSoTimeout(n10);
        }
    }

    private void y(jk_0 jk_02) throws b5_0 {
        block8: {
            block6: {
                this.V = jk_02.R;
                String[] stringArray = jk_0.Y();
                try {
                    block7: {
                        try {
                            try {
                                if (stringArray == null) break block6;
                                if (!jk_02.B.equals(a)) break block7;
                            }
                            catch (b5_0 b5_02) {
                                throw b__0.a(b5_02);
                            }
                            this.s = this.N.v;
                            this.k = this.s.getHostName();
                            if (stringArray != null) break block8;
                        }
                        catch (b5_0 b5_03) {
                            throw b__0.a(b5_03);
                        }
                    }
                    this.k = jk_02.B;
                }
                catch (b5_0 b5_04) {
                    throw b__0.a(b5_04);
                }
            }
            this.s = jk_02.e;
        }
    }

    private void s() {
        this.U = true;
        this.V = super.getLocalPort();
        this.s = super.getInetAddress();
        this.k = this.s.getHostName();
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
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "))UaOz/".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
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
                            n17 = 98;
                            break;
                        }
                        case 1: {
                            n17 = 124;
                            break;
                        }
                        case 2: {
                            n17 = 30;
                            break;
                        }
                        case 3: {
                            n17 = 52;
                            break;
                        }
                        case 4: {
                            n17 = 4;
                            break;
                        }
                        case 5: {
                            n17 = 47;
                            break;
                        }
                        default: {
                            n17 = 100;
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
        long l2 = 1832800303801577912L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "B\u000bv<\u0081?\u001c\u009a\u0011H&\u00f1\u00bf\u000f\u00d2l";
        int n19 = "B\u000bv<\u0081?\u001c\u009a\u0011H&\u00f1\u00bf\u000f\u00d2l".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xE24;
        if (c[n11] == null) {
            b__0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

