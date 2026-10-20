/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.V.H;

public abstract class f
implements H {
    private static int[] N;
    private static final String a;

    @Override
    public final OutputStream X(String string) throws IOException {
        File file;
        block10: {
            boolean bl;
            block11: {
                File file2;
                int[] nArray;
                File file3;
                block9: {
                    file = this.r(string);
                    file3 = file.getParentFile();
                    nArray = f.h();
                    try {
                        file2 = file3;
                        if (nArray != null) break block9;
                        if (file2 == null) break block10;
                    }
                    catch (IOException iOException) {
                        throw f.a(iOException);
                    }
                    file2 = file3;
                }
                try {
                    try {
                        bl = file2.isDirectory();
                        if (nArray != null) break block11;
                        if (bl) break block10;
                    }
                    catch (IOException iOException) {
                        throw f.a(iOException);
                    }
                    bl = file3.mkdirs();
                }
                catch (IOException iOException) {
                    throw f.a(iOException);
                }
            }
            try {
                if (!bl) {
                    throw new IOException(a + file + "\"");
                }
            }
            catch (IOException iOException) {
                throw f.a(iOException);
            }
        }
        return new FileOutputStream(file);
    }

    @Override
    public final boolean A(String string) {
        return this.r(string).delete();
    }

    protected abstract File r(String var1);

    public static void M(int[] nArray) {
        N = nArray;
    }

    public static int[] h() {
        return N;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (f.h() != null) {
                    f.M(new int[1]);
                }
                char[] cArray3 = "o\u0010\u0011\u0003\u000f3[O\u0003\u001a\f\u0014\"[H\u0018\r\b\u00033\u0014^\b_\u000b\u000f5[O\u001d\u001e\u001e\u0013g\u001dE\u001d\u001aMB".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 67;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 111;
                            break;
                        }
                        case 1: {
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 60;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 35;
                            break;
                        }
                        case 5: {
                            n17 = 4;
                            break;
                        }
                        default: {
                            n17 = 56;
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

