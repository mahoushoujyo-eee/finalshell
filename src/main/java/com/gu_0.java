/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * Renamed from com.Gu
 */
class gu_0
extends PipedInputStream {
    private int q;
    private int r;
    private static final long[] a;
    private static final Integer[] b;

    gu_0() throws IOException {
        this.r = this.q = gu_0.a(1994, 105303827313998873L);
    }

    gu_0(int n10) throws IOException {
        this.r = this.q = gu_0.a(1994, 105303827313998873L);
        this.buffer = new byte[n10];
        this.q = n10;
        this.r = n10;
    }

    gu_0(int n10, int n11) throws IOException {
        this(n10);
        this.r = n11;
    }

    gu_0(PipedOutputStream pipedOutputStream) throws IOException {
        super(pipedOutputStream);
        this.r = this.q = gu_0.a(1701, 1369861003029101943L);
    }

    gu_0(PipedOutputStream pipedOutputStream, int n10) throws IOException {
        super(pipedOutputStream);
        this.r = this.q = gu_0.a(1994, 105303827313998873L);
        this.buffer = new byte[n10];
        this.q = n10;
    }

    public synchronized void w() throws IOException {
        block2: {
            int n10;
            block3: {
                boolean bl = dm_2.J();
                try {
                    n10 = this.available();
                    if (bl) break block2;
                    if (n10 == 0) break block3;
                }
                catch (IOException iOException) {
                    throw gu_0.a(iOException);
                }
                return;
            }
            this.in = 0;
            this.out = 0;
            this.buffer[this.in++] = 0;
            n10 = this.read();
        }
    }

    private int e() {
        int n10;
        block5: {
            int n11;
            block4: {
                int n12;
                int n13;
                block6: {
                    block7: {
                        int n14;
                        boolean bl;
                        block2: {
                            block3: {
                                n11 = 0;
                                bl = dm_2.J();
                                n10 = this.out;
                                n14 = this.in;
                                if (bl) break block2;
                                if (n10 >= n14) break block3;
                                n11 = this.buffer.length - this.in;
                                if (!bl) break block4;
                            }
                            n10 = this.in;
                            if (bl) break block5;
                            n14 = this.out;
                        }
                        if (n10 >= n14) break block4;
                        n13 = this.in;
                        n12 = -1;
                        if (bl) break block6;
                        if (n13 != n12) break block7;
                        n11 = this.buffer.length;
                        if (!bl) break block4;
                    }
                    n13 = this.out;
                    n12 = this.in;
                }
                n11 = n13 - n12;
            }
            n10 = n11;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    synchronized void r(int var1_1) throws IOException {
        block57: {
            block60: {
                block61: {
                    block59: {
                        block58: {
                            block46: {
                                block56: {
                                    block52: {
                                        block53: {
                                            block54: {
                                                block55: {
                                                    block50: {
                                                        block49: {
                                                            block48: {
                                                                block47: {
                                                                    var3_2 = this.e();
                                                                    var2_3 = dm_2.F();
                                                                    try {
                                                                        v0 = var3_2;
                                                                        v1 = var1_1;
                                                                        if (!var2_3) break block46;
                                                                        if (v0 < v1) {
                                                                        }
                                                                        ** GOTO lbl122
                                                                    }
                                                                    catch (IOException v2) {
                                                                        throw gu_0.a(v2);
                                                                    }
                                                                    var4_4 = this.buffer.length - var3_2;
                                                                    var5_5 = this.buffer.length;
                                                                    while (var5_5 - var4_4 < var1_1) {
                                                                        var5_5 *= 2;
                                                                        try {
                                                                            if (var2_3) {
                                                                                if (var2_3) continue;
                                                                                break;
                                                                            }
                                                                            break block47;
                                                                        }
                                                                        catch (IOException v3) {
                                                                            throw gu_0.a(v3);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v4 = var5_5;
                                                                        v5 = this.r;
                                                                        if (!var2_3) break block48;
                                                                        if (v4 <= v5) break block47;
                                                                    }
                                                                    catch (IOException v6) {
                                                                        throw gu_0.a(v6);
                                                                    }
                                                                    var5_5 = this.r;
                                                                }
                                                                try {
                                                                    v4 = var5_5 - var4_4;
                                                                    if (!var2_3) break block49;
                                                                    v5 = var1_1;
                                                                }
                                                                catch (IOException v7) {
                                                                    throw gu_0.a(v7);
                                                                }
                                                            }
                                                            if (v4 < v5) {
                                                                return;
                                                            }
                                                            v4 = var5_5;
                                                        }
                                                        var6_7 = new byte[v4];
                                                        try {
                                                            block51: {
                                                                try {
                                                                    try {
                                                                        v8 = this.out;
                                                                        v9 = this.in;
                                                                        if (!var2_3) break block50;
                                                                        if (v8 >= v9) break block51;
                                                                    }
                                                                    catch (IOException v10) {
                                                                        throw gu_0.a(v10);
                                                                    }
                                                                    System.arraycopy(this.buffer, 0, var6_7, 0, this.buffer.length);
                                                                    if (var2_3) break block52;
                                                                }
                                                                catch (IOException v11) {
                                                                    throw gu_0.a(v11);
                                                                }
                                                            }
                                                            v8 = this.in;
                                                            v9 = this.out;
                                                        }
                                                        catch (IOException v12) {
                                                            throw gu_0.a(v12);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (!var2_3) break block53;
                                                                    if (v8 < v9) {
                                                                    }
                                                                    ** GOTO lbl98
                                                                }
                                                                catch (IOException v13) {
                                                                    throw gu_0.a(v13);
                                                                }
                                                                v14 = this;
                                                                if (!var2_3) break block54;
                                                            }
                                                            catch (IOException v15) {
                                                                throw gu_0.a(v15);
                                                            }
                                                            if (v14.in != -1) break block55;
                                                            break block52;
                                                        }
                                                        catch (IOException v16) {
                                                            throw gu_0.a(v16);
                                                        }
                                                    }
                                                    catch (IOException v17) {
                                                        throw gu_0.a(v17);
                                                    }
                                                }
                                                System.arraycopy(this.buffer, 0, var6_7, 0, this.in);
                                                System.arraycopy(this.buffer, this.out, var6_7, var6_7.length - (this.buffer.length - this.out), this.buffer.length - this.out);
                                                v14 = this;
                                            }
                                            try {
                                                try {
                                                    v14.out = var6_7.length - (this.buffer.length - this.out);
                                                    if (var2_3) break block52;
lbl98:
                                                    // 2 sources

                                                    v18 = this;
                                                    if (!var2_3) break block56;
                                                }
                                                catch (IOException v19) {
                                                    throw gu_0.a(v19);
                                                }
                                                v8 = v18.in;
                                                v9 = this.out;
                                            }
                                            catch (IOException v20) {
                                                throw gu_0.a(v20);
                                            }
                                        }
                                        try {
                                            if (v8 == v9) {
                                                System.arraycopy(this.buffer, 0, var6_7, 0, this.buffer.length);
                                                this.in = this.buffer.length;
                                            }
                                        }
                                        catch (IOException v21) {
                                            throw gu_0.a(v21);
                                        }
                                    }
                                    v18 = this;
                                }
                                try {
                                    v18.buffer = var6_7;
                                    if (var2_3) break block57;
lbl122:
                                    // 2 sources

                                    v0 = this.buffer.length;
                                    v1 = var3_2;
                                }
                                catch (IOException v22) {
                                    throw gu_0.a(v22);
                                }
                            }
                            try {
                                try {
                                    if (!var2_3) break block58;
                                    if (v0 != v1) break block57;
                                }
                                catch (IOException v23) {
                                    throw gu_0.a(v23);
                                }
                                v0 = var3_2;
                                v1 = this.q;
                            }
                            catch (IOException v24) {
                                throw gu_0.a(v24);
                            }
                        }
                        try {
                            try {
                                if (!var2_3) break block59;
                                if (v0 <= v1) break block57;
                            }
                            catch (IOException v25) {
                                throw gu_0.a(v25);
                            }
                            v0 = var3_2;
                            v1 = 2;
                        }
                        catch (IOException v26) {
                            throw gu_0.a(v26);
                        }
                    }
                    var4_4 = v0 / v1;
                    try {
                        v27 = var4_4;
                        if (!var2_3) break block60;
                        if (v27 >= this.q) break block61;
                    }
                    catch (IOException v28) {
                        throw gu_0.a(v28);
                    }
                    var4_4 = this.q;
                }
                v27 = var4_4;
            }
            var5_6 = new byte[v27];
            this.buffer = var5_6;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5001779090725853855L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0018\u0095y\u00a4\u0016\u0085c\u00e8\u00e7\u00df\u00c0\u00ae\u00ff:\u00e2\u0086";
        int n11 = "\u0018\u0095y\u00a4\u0016\u0085c\u00e8\u00e7\u00df\u00c0\u00ae\u00ff:\u00e2\u0086".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3BD2;
        if (b[n11] == null) {
            gu_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

