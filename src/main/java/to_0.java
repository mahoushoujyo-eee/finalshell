/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;

/*
 * Renamed from To
 */
public class to_0
extends InputStream {
    InputStream p;
    LinkedList K = new LinkedList();
    int y = to_0.a(16070, 121829457104035969L);
    byte[] d;
    boolean H = false;
    boolean o = false;
    byte[] n = null;
    int r = 0;
    int Z = 0;
    private static int e;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public to_0(InputStream inputStream) {
        this.p = inputStream;
    }

    @Override
    public int read() throws IOException {
        int n10 = this.p.read();
        int n11 = to_0.L();
        this.K.add((byte)n10);
        while (this.K.size() > this.y) {
            this.K.remove(0);
            if (n11 != 0) continue;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int read(byte[] var1_1, int var2_2, int var3_3) throws IOException {
        block24: {
            block25: {
                block23: {
                    block22: {
                        ++this.Z;
                        var5_4 = System.currentTimeMillis();
                        var4_5 = to_0.L();
                        var7_6 = 0;
                        try {
                            v0 = this.o;
                            if (var4_5 == 0) break block22;
                            if (v0 == 0) {
                            }
                            ** GOTO lbl16
                        }
                        catch (IOException v1) {
                            throw to_0.a(v1);
                        }
                        var7_6 = this.p.read(var1_1, var2_2, var3_3);
                        try {
                            if (var4_5 != 0) break block23;
lbl16:
                            // 2 sources

                            v0 = Math.min(var1_1.length, this.r);
                        }
                        catch (IOException v2) {
                            throw to_0.a(v2);
                        }
                    }
                    var7_6 = var8_7 = v0;
                    System.arraycopy(this.n, 0, var1_1, var2_2, var8_7);
                    this.o = false;
                }
                try {
                    try {
                        v3 = var7_6;
                        if (var4_5 == 0) break block24;
                        if (v3 >= 0) break block25;
                    }
                    catch (IOException v4) {
                        throw to_0.a(v4);
                    }
                    throw new IOException(to_0.a);
                }
                catch (IOException v5) {
                    throw to_0.a(v5);
                }
            }
            v3 = var8_7 = var2_2;
        }
        while (var8_7 < var2_2 + var7_6) {
            block27: {
                block26: {
                    try {
                        try {
                            try {
                                v6 = this.H;
                                if (var4_5 == 0) break block26;
                                if (v6 != 0) break;
                            }
                            catch (IOException v7) {
                                throw to_0.a(v7);
                            }
                            this.K.add(var1_1[var8_7]);
                            if (var4_5 == 0) break block27;
                        }
                        catch (IOException v8) {
                            throw to_0.a(v8);
                        }
                        v6 = this.K.size();
                    }
                    catch (IOException v9) {
                        throw to_0.a(v9);
                    }
                }
                try {
                    if (v6 > this.y) {
                        this.K.remove(0);
                    }
                }
                catch (IOException v10) {
                    throw to_0.a(v10);
                }
                ++var8_7;
            }
            if (var4_5 != 0) continue;
        }
        var8_8 = new String(var1_1, 0, var7_6);
        try {
            --this.Z;
            v11 = var7_6;
            if (ky_2.F() != null) {
                to_0.J(++var4_5);
            }
        }
        catch (IOException v12) {
            throw to_0.a(v12);
        }
        return v11;
    }

    public synchronized void F(byte[] byArray, int n10) throws IOException {
        this.o = true;
        this.n = byArray;
        this.r = n10;
    }

    public synchronized boolean W() {
        int n10;
        block7: {
            int[] nArray;
            int n11;
            int n12;
            block6: {
                int n13;
                this.H = true;
                n12 = to_0.T();
                n11 = 0;
                this.d = null;
                nArray = new int[this.K.size()];
                char[] cArray = new char[this.K.size()];
                for (n13 = 0; n13 < this.K.size(); ++n13) {
                    nArray[n13] = ((Byte)this.K.get(n13)).byteValue();
                    cArray[n13] = (char)(nArray[n13] & to_0.a(31051, 9034177086857815821L));
                    if (n12 == 0) {
                        if (n12 == 0) continue;
                    }
                    break block6;
                }
                n13 = nArray.length;
            }
            int n14 = this.K.size() - 1;
            while (n14 > 0) {
                block9: {
                    block10: {
                        block8: {
                            int n15;
                            block12: {
                                int n16;
                                block11: {
                                    int n17;
                                    int n18 = n17 = nArray[n14];
                                    if (n12 != 0) break block9;
                                    n10 = n18;
                                    if (n12 != 0) break block7;
                                    if (n10 != to_0.a(12231, 3316081648401183106L)) break block10;
                                    n15 = nArray[n14 - 1];
                                    n16 = to_0.a(4106, 1028480774944214602L);
                                    if (n12 != 0) break block11;
                                    if (n15 != n16) break block10;
                                    n15 = nArray[n14 - 2];
                                    if (n12 != 0) break block12;
                                    n16 = to_0.a(8759, 2728284761479838835L);
                                }
                                if (n15 != n16) break block10;
                                n15 = 1;
                            }
                            int n19 = n15;
                            int n20 = 5;
                            int n21 = this.K.size() - n14 + n20;
                            this.d = new byte[n21];
                            for (int i2 = 0; i2 < n21; ++i2) {
                                this.d[i2] = (Byte)this.K.get(n14 + i2 - n20);
                                if (n12 == 0) {
                                    if (n12 == 0) continue;
                                }
                                break block8;
                            }
                            n11 = 1;
                        }
                        if (n12 == 0) break;
                    }
                    --n14;
                }
                if (n12 == 0) continue;
            }
            n10 = n11;
        }
        return n10 != 0;
    }

    public boolean z() {
        return this.H;
    }

    public void U(boolean bl) {
        this.H = bl;
    }

    @Override
    public void close() throws IOException {
        to_0 to_02;
        block4: {
            block5: {
                int n10 = to_0.L();
                super.close();
                int n11 = n10;
                try {
                    try {
                        to_02 = this;
                        if (n11 == 0) break block4;
                        if (to_02.p == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw to_0.a(iOException);
                    }
                    this.p.close();
                }
                catch (IOException iOException) {
                    throw to_0.a(iOException);
                }
            }
            to_02 = this;
        }
        to_02.H();
    }

    public byte[] P() {
        return this.d;
    }

    public void F(byte[] byArray) {
        this.d = byArray;
    }

    public void v() {
        this.p = null;
        this.K = null;
        this.d = null;
        this.n = null;
    }

    public void H() {
        try {
            yt_1.F.W((Object)new OC(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void J(int n10) {
        e = n10;
    }

    public static int T() {
        return e;
    }

    public static int L() {
        int n10 = to_0.T();
        if (n10 == 0) {
            return 13;
        }
        return 0;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    if (to_0.T() == 0) break block20;
                    to_0.J(105);
                    break block20;
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = ")\u001d \u0003@H>".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 114;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl57
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 40;
                                break;
                            }
                            case 1: {
                                v9 = 1;
                                break;
                            }
                            case 2: {
                                v9 = 59;
                                break;
                            }
                            case 3: {
                                v9 = 81;
                                break;
                            }
                            case 4: {
                                v9 = 87;
                                break;
                            }
                            case 5: {
                                v9 = 84;
                                break;
                            }
                            default: {
                                v9 = 40;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl57:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                to_0.a = new String(v10).intern();
                var0_1 = 6645581271512354221L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "Q\u00d3T\"\u00f0fq\u00f4\u008eb\u00cf\u00eb}_|7\u00e8NA\u00a1\u00e2Y\u00aa_";
                var5_5 = "Q\u00d3T\"\u00f0fq\u00f4\u008eb\u00cf\u00eb}_|7\u00e8NA\u00a1\u00e2Y\u00aa_".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u008c\u00dd[\u00d2\u000f\u00a6\u00e9,\u00da\u00de\u00d8\u00f26\u00a5\u00c3\u00cd";
                    var5_5 = "\u008c\u00dd[\u00d2\u000f\u00a6\u00e9,\u00da\u00de\u00d8\u00f26\u00a5\u00c3\u00cd".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl102:
                // 1 sources

                ** continue;
            }
        }
        to_0.b = var6_2;
        to_0.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E44;
        if (c[n11] == null) {
            to_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

