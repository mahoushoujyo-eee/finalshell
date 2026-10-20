/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HV;
import com.P;
import com.dx_2;
import com.fv_0;
import com.sd_0;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;

public class HN
extends HV {
    private final fv_0 l;
    @Nullable
    private final Runnable n;
    private static final long[] a;
    private static final Integer[] c;

    public HN(fv_0 fv_02, @Nullable Runnable runnable) {
        super(new char[HN.a(18788, 3622483169953994870L)], 0, 0);
        this.l = fv_02;
        this.n = runnable;
    }

    public HN(fv_0 fv_02) {
        super(new char[HN.a(11404, 3461059375089171871L)], 0, 0);
        this.l = fv_02;
        this.n = null;
    }

    private void q() throws IOException {
        block16: {
            block15: {
                HN hN2;
                int n10;
                block12: {
                    String string;
                    block14: {
                        block13: {
                            String string2 = dx_2.g();
                            this.l.R(false);
                            string = string2;
                            try {
                                try {
                                    try {
                                        try {
                                            this.X = 0;
                                            n10 = this.l.A();
                                            if (string != null) break block12;
                                            if (n10 != 0) break block13;
                                        }
                                        catch (IOException iOException) {
                                            throw HN.a(iOException);
                                        }
                                        hN2 = this;
                                        if (string != null) break block14;
                                    }
                                    catch (IOException iOException) {
                                        throw HN.a(iOException);
                                    }
                                    if (hN2.n == null) break block13;
                                }
                                catch (IOException iOException) {
                                    throw HN.a(iOException);
                                }
                                this.n.run();
                            }
                            catch (IOException iOException) {
                                throw HN.a(iOException);
                            }
                        }
                        this.t = this.l.x(this.K, this.X, this.K.length);
                        hN2 = this;
                    }
                    try {
                        if (string != null) break block15;
                        n10 = hN2.t;
                    }
                    catch (IOException iOException) {
                        throw HN.a(iOException);
                    }
                }
                if (n10 > 0) break block16;
                hN2 = this;
            }
            hN2.t = 0;
            throw new P();
        }
    }

    @Override
    public char C() throws IOException {
        char c2;
        block8: {
            block9: {
                HN hN2;
                block6: {
                    block7: {
                        String string = dx_2.g();
                        try {
                            try {
                                try {
                                    hN2 = this;
                                    if (string != null) break block6;
                                    if (hN2.t == 0) break block7;
                                }
                                catch (IOException iOException) {
                                    throw HN.a(iOException);
                                }
                                c2 = (char)(this.l.l() ? 1 : 0);
                                if (string != null) break block8;
                            }
                            catch (IOException iOException) {
                                throw HN.a(iOException);
                            }
                            if (c2 == '\u0000') break block9;
                        }
                        catch (IOException iOException) {
                            throw HN.a(iOException);
                        }
                    }
                    hN2 = this;
                }
                hN2.q();
            }
            c2 = super.C();
        }
        return c2;
    }

    @Override
    public String a(int n10) throws IOException {
        HN hN2;
        block10: {
            block11: {
                HN hN3;
                block8: {
                    String string = dx_2.g();
                    try {
                        block9: {
                            try {
                                try {
                                    try {
                                        hN3 = this;
                                        if (string != null) break block8;
                                        if (hN3.t == 0) break block9;
                                    }
                                    catch (IOException iOException) {
                                        throw HN.a(iOException);
                                    }
                                    hN2 = this;
                                    if (string != null) break block10;
                                }
                                catch (IOException iOException) {
                                    throw HN.a(iOException);
                                }
                                if (!hN2.l.l()) break block11;
                            }
                            catch (IOException iOException) {
                                throw HN.a(iOException);
                            }
                        }
                        hN3 = this;
                    }
                    catch (IOException iOException) {
                        throw HN.a(iOException);
                    }
                }
                hN3.q();
            }
            hN2 = this;
        }
        return super.a(n10);
    }

    public String toString() {
        return sd_0.Z(new String(this.K, this.X, this.t));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 796296958058265422L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "n\u009f\u001e>]9'8|\u00f9a<Np\u00c2\u00d1";
        int n11 = "n\u009f\u001e>]9'8|\u00f9a<Np\u00c2\u00d1".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1112;
        if (c[n11] == null) {
            HN.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

