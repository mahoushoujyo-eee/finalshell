/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.F.F;
import org.s.W;
import org.t.n_0;

/*
 * Renamed from org.s.k
 */
class k_1
extends FilterReader {
    final n_0 D;

    k_1(Reader reader, n_0 n_02) {
        this.D = n_02;
        super(reader);
    }

    @Override
    public int read() throws IOException {
        int n10;
        block4: {
            int n11;
            block5: {
                n11 = super.read();
                String string = W.v();
                try {
                    try {
                        n10 = n11;
                        if (string == null) break block4;
                        if (n10 < 0) break block5;
                    }
                    catch (IOException iOException) {
                        throw k_1.a(iOException);
                    }
                    this.D.v((char)n11);
                }
                catch (IOException iOException) {
                    throw k_1.a(iOException);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    @Override
    @F(value=false)
    public int read(char[] cArray, int n10, int n11) throws IOException {
        int n12;
        block10: {
            int n13;
            block11: {
                int n14;
                String string;
                block8: {
                    block9: {
                        string = W.v();
                        try {
                            try {
                                n14 = n11;
                                if (string == null) break block8;
                                if (n14 > 0) break block9;
                            }
                            catch (IOException iOException) {
                                throw k_1.a(iOException);
                            }
                            return 0;
                        }
                        catch (IOException iOException) {
                            throw k_1.a(iOException);
                        }
                    }
                    n14 = this.read();
                }
                n13 = n14;
                try {
                    try {
                        n12 = n13;
                        if (string == null) break block10;
                        if (n12 >= 0) break block11;
                    }
                    catch (IOException iOException) {
                        throw k_1.a(iOException);
                    }
                    return -1;
                }
                catch (IOException iOException) {
                    throw k_1.a(iOException);
                }
            }
            cArray[n10] = (char)n13;
            n12 = 1;
        }
        return n12;
    }

    @Override
    public long skip(long l2) throws IOException {
        long l3;
        block7: {
            block8: {
                String string = W.v();
                try {
                    try {
                        long l4 = l2 - 0L;
                        l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (string == null) break block7;
                        if (l3 > 0) break block8;
                    }
                    catch (IOException iOException) {
                        throw k_1.a(iOException);
                    }
                    return 0L;
                }
                catch (IOException iOException) {
                    throw k_1.a(iOException);
                }
            }
            l3 = this.read();
        }
        long l5 = l3;
        try {
            if (l5 < 0) {
                return 0L;
            }
        }
        catch (IOException iOException) {
            throw k_1.a(iOException);
        }
        return 1L;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void mark(int n10) throws IOException {
        throw new IOException();
    }

    @Override
    public void reset() throws IOException {
        throw new IOException();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

