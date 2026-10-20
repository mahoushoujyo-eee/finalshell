/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.P;
import com.dx_2;
import com.sd_0;
import com.y4_0;
import java.io.IOException;

public class HV
implements y4_0 {
    protected char[] K;
    protected int X;
    protected int t;
    int b = 0;

    @Override
    public int O() {
        return this.b;
    }

    @Override
    public void o(int n10) {
        this.b = n10;
    }

    public HV(char[] cArray, int n10, int n11) {
        this.K = cArray;
        this.X = n10;
        this.t = n11;
    }

    public HV(char[] cArray) {
        this(cArray, 0, cArray.length);
    }

    @Override
    public char C() throws IOException {
        int n10;
        block4: {
            block5: {
                String string = dx_2.g();
                try {
                    try {
                        n10 = this.t--;
                        if (string != null) break block4;
                        if (n10 != 0) break block5;
                    }
                    catch (IOException iOException) {
                        throw HV.b(iOException);
                    }
                    throw new P();
                }
                catch (IOException iOException) {
                    throw HV.b(iOException);
                }
            }
            n10 = this.K[this.X++];
        }
        int n11 = n10;
        return (char)n11;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void s(char var1_1) throws P {
        block9: {
            block10: {
                block12: {
                    block11: {
                        var2_2 = dx_2.g();
                        try {
                            try {
                                try {
                                    v0 = this;
                                    if (var2_2 != null) break block9;
                                    if (v0.X != 0) break block10;
                                }
                                catch (P v1) {
                                    throw HV.b(v1);
                                }
                                v2 = this.K;
                                if (var2_2 != null) break block11;
                            }
                            catch (P v3) {
                                throw HV.b(v3);
                            }
                            if (v2.length - this.t == 0) {
                            }
                            ** GOTO lbl24
                        }
                        catch (P v4) {
                            throw HV.b(v4);
                        }
                        var3_3 = new char[this.K.length + 1];
                        try {
                            if (var2_2 == null) break block12;
lbl24:
                            // 2 sources

                            v2 = this.K;
                        }
                        catch (P v5) {
                            throw HV.b(v5);
                        }
                    }
                    var3_3 = v2;
                }
                this.X = var3_3.length - this.t;
                System.arraycopy(this.K, 0, var3_3, this.X, this.t);
                this.K = var3_3;
            }
            ++this.t;
            v0 = this;
        }
        v0.K[--this.X] = var1_1;
    }

    @Override
    public String a(int n10) throws IOException {
        String string = sd_0.E(n10, this.K, this.X, this.t, this);
        this.X += string.length();
        this.t -= string.length();
        return string;
    }

    @Override
    public void h(char[] cArray, int n10) throws P {
        String string = dx_2.g();
        for (int i2 = n10 - 1; i2 >= 0; --i2) {
            this.s(cArray[i2]);
            if (string == null) continue;
        }
    }

    @Override
    public boolean w() {
        String string = dx_2.g();
        boolean bl = this.t;
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    private static IOException b(IOException iOException) {
        return iOException;
    }
}

