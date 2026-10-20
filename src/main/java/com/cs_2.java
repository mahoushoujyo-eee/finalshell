/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YU;
import com.dm_2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

/*
 * Renamed from com.cs
 */
class cs_2 {
    InputStream I;
    OutputStream X;
    OutputStream K;
    private boolean G = false;
    private boolean O = false;
    private boolean J = false;
    private static final String a;

    cs_2() {
    }

    void H(OutputStream outputStream) {
        this.X = outputStream;
    }

    void U(OutputStream outputStream, boolean bl) {
        this.O = bl;
        this.H(outputStream);
    }

    void p(OutputStream outputStream) {
        this.K = outputStream;
    }

    void m(OutputStream outputStream, boolean bl) {
        this.J = bl;
        this.p(outputStream);
    }

    void U(InputStream inputStream) {
        this.I = inputStream;
    }

    void r(InputStream inputStream, boolean bl) {
        this.G = bl;
        this.U(inputStream);
    }

    void d(YU yU) throws IOException, SocketException {
        this.X.write(yU.P.g, 0, yU.P.X);
        this.X.flush();
    }

    void z(byte[] byArray, int n10, int n11) throws IOException {
        this.X.write(byArray, n10, n11);
        this.X.flush();
    }

    void m(byte[] byArray, int n10, int n11) throws IOException {
        this.K.write(byArray, n10, n11);
        this.K.flush();
    }

    int z() throws IOException {
        return this.I.read();
    }

    void u(byte[] byArray) throws IOException {
        this.q(byArray, 0, byArray.length);
    }

    void q(byte[] byArray, int n10, int n11) throws IOException {
        int n12;
        do {
            if ((n12 = this.I.read(byArray, n10, n11)) < 0) {
                throw new IOException(a);
            }
            n10 += n12;
        } while ((n11 -= n12) > 0);
    }

    /*
     * Loose catch block
     */
    void l() {
        boolean bl = dm_2.F();
        try {
            block10: {
                cs_2 cs_22;
                block11: {
                    block14: {
                        block13: {
                            cs_22 = this;
                            if (!bl) break block10;
                            if (cs_22.X == null) break block11;
                            break block13;
                            catch (Exception exception) {
                                throw cs_2.a(exception);
                            }
                        }
                        cs_22 = this;
                        if (!bl) break block10;
                        break block14;
                        catch (Exception exception) {
                            throw cs_2.a(exception);
                        }
                    }
                    try {
                        block15: {
                            if (cs_22.O) break block11;
                            break block15;
                            catch (Exception exception) {
                                throw cs_2.a(exception);
                            }
                        }
                        this.X.close();
                    }
                    catch (Exception exception) {
                        throw cs_2.a(exception);
                    }
                }
                cs_22 = this;
            }
            cs_22.X = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Loose catch block
     */
    void Z() {
        boolean bl = dm_2.F();
        try {
            block18: {
                cs_2 cs_22;
                block19: {
                    block24: {
                        block23: {
                            cs_22 = this;
                            if (!bl) break block18;
                            if (cs_22.I == null) break block19;
                            break block23;
                            catch (Exception exception) {
                                throw cs_2.a(exception);
                            }
                        }
                        cs_22 = this;
                        if (!bl) break block18;
                        break block24;
                        catch (Exception exception) {
                            throw cs_2.a(exception);
                        }
                    }
                    try {
                        block25: {
                            if (cs_22.G) break block19;
                            break block25;
                            catch (Exception exception) {
                                throw cs_2.a(exception);
                            }
                        }
                        this.I.close();
                    }
                    catch (Exception exception) {
                        throw cs_2.a(exception);
                    }
                }
                cs_22 = this;
            }
            cs_22.I = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.l();
        try {
            block21: {
                cs_2 cs_23;
                block22: {
                    block26: {
                        cs_23 = this;
                        if (!bl) break block21;
                        if (cs_23.K == null) break block22;
                        cs_23 = this;
                        if (!bl) break block21;
                        break block26;
                        catch (Exception exception) {
                            throw cs_2.a(exception);
                        }
                    }
                    try {
                        block27: {
                            if (cs_23.J) break block22;
                            break block27;
                            catch (Exception exception) {
                                throw cs_2.a(exception);
                            }
                        }
                        this.K.close();
                    }
                    catch (Exception exception) {
                        throw cs_2.a(exception);
                    }
                }
                cs_23 = this;
            }
            cs_23.K = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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
                char[] cArray3 = "\u0018\n\u000b\u001b_~}\u0014+OhDj8<\tOiUy9".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 39;
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
                            n17 = 122;
                            break;
                        }
                        case 1: {
                            n17 = 67;
                            break;
                        }
                        case 2: {
                            n17 = 72;
                            break;
                        }
                        case 3: {
                            n17 = 28;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 63;
                            break;
                        }
                        default: {
                            n17 = 122;
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
    }
}

