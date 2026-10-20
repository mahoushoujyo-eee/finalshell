/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.IOException;
import java.io.InputStream;
import org.F.c;
import org.V.N;
import org.V.Q;
import org.V.U;
import org.V.f;

public abstract class J {
    public static final U a = new Q();

    @c
    public final InputStream l(String string) throws IOException {
        N n10;
        block4: {
            N n11;
            block5: {
                n11 = this.J(string);
                int[] nArray = f.h();
                try {
                    try {
                        n10 = n11;
                        if (nArray != null) break block4;
                        if (n10 != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw J.c(iOException);
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw J.c(iOException);
                }
            }
            n10 = n11;
        }
        return n10.o();
    }

    @c
    public abstract N J(String var1);

    private static IOException c(IOException iOException) {
        return iOException;
    }
}

