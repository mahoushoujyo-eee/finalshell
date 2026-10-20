/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.gu_0;
import java.io.IOException;
import java.io.PipedOutputStream;

class GF
extends gu_0 {
    PipedOutputStream h;

    GF(PipedOutputStream pipedOutputStream, int n10) throws IOException {
        super(pipedOutputStream, n10);
        this.h = pipedOutputStream;
    }

    GF(PipedOutputStream pipedOutputStream) throws IOException {
        super(pipedOutputStream);
        this.h = pipedOutputStream;
    }

    @Override
    public void close() throws IOException {
        block4: {
            GF gF2;
            block5: {
                boolean bl = dm_2.F();
                try {
                    try {
                        gF2 = this;
                        if (!bl) break block4;
                        if (gF2.h == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw GF.b(iOException);
                    }
                    this.h.close();
                }
                catch (IOException iOException) {
                    throw GF.b(iOException);
                }
            }
            gF2 = this;
        }
        gF2.h = null;
    }

    private static IOException b(IOException iOException) {
        return iOException;
    }
}

