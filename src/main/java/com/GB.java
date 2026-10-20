/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.gu_0;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class GB
extends PipedOutputStream {
    private gu_0 i;

    GB(PipedInputStream pipedInputStream, boolean bl) throws IOException {
        block8: {
            boolean bl2;
            block7: {
                super(pipedInputStream);
                this.i = null;
                boolean bl3 = dm_2.F();
                try {
                    try {
                        bl2 = bl;
                        if (!bl3) break block7;
                        if (!bl2) break block8;
                    }
                    catch (IOException iOException) {
                        throw GB.a(iOException);
                    }
                    bl2 = pipedInputStream instanceof gu_0;
                }
                catch (IOException iOException) {
                    throw GB.a(iOException);
                }
            }
            try {
                if (bl2) {
                    this.i = (gu_0)pipedInputStream;
                }
            }
            catch (IOException iOException) {
                throw GB.a(iOException);
            }
        }
    }

    @Override
    public void write(int n10) throws IOException {
        GB gB2;
        block4: {
            block5: {
                boolean bl = dm_2.F();
                try {
                    try {
                        gB2 = this;
                        if (!bl) break block4;
                        if (gB2.i == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw GB.a(iOException);
                    }
                    this.i.r(1);
                }
                catch (IOException iOException) {
                    throw GB.a(iOException);
                }
            }
            gB2 = this;
        }
        super.write(n10);
    }

    @Override
    public void write(byte[] byArray, int n10, int n11) throws IOException {
        GB gB2;
        block4: {
            block5: {
                boolean bl = dm_2.J();
                try {
                    try {
                        gB2 = this;
                        if (bl) break block4;
                        if (gB2.i == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw GB.a(iOException);
                    }
                    this.i.r(n11);
                }
                catch (IOException iOException) {
                    throw GB.a(iOException);
                }
            }
            gB2 = this;
        }
        super.write(byArray, n10, n11);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

