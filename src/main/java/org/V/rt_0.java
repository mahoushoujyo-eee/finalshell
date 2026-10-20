/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import org.V.N;
import org.v.e_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.Rt
 */
class rt_0
implements N {
    final URLConnection d;
    final URI z;
    final String i;
    final e_1 e;
    private static final String a;

    rt_0(e_1 e_12, URLConnection uRLConnection, URI uRI, String string) {
        this.e = e_12;
        this.d = uRLConnection;
        this.z = uRI;
        this.i = string;
    }

    @Override
    public InputStream o() throws IOException {
        try {
            return this.d.getInputStream();
        }
        catch (IOException iOException) {
            throw new IOException(this.z + a + this.i, iOException);
        }
    }

    @Override
    public String o() {
        return this.i;
    }

    @Override
    public long z() {
        return this.d.getLastModified();
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
                char[] cArray3 = "\u0010M".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 92;
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
                            n17 = 96;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 50;
                            break;
                        }
                        case 3: {
                            n17 = 9;
                            break;
                        }
                        case 4: {
                            n17 = 57;
                            break;
                        }
                        case 5: {
                            n17 = 50;
                            break;
                        }
                        default: {
                            n17 = 121;
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

