/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import org.F.c;
import org.b_0;
import org.d_0;
import org.e_0;

public abstract class f
implements e_0 {
    private static final String a;

    @Override
    public abstract void Y(@c String var1, Reader var2) throws b_0, IOException;

    @Override
    public final void f(Reader reader) throws b_0, IOException {
        this.Y(null, reader);
    }

    @Override
    public final void i(InputStream inputStream) throws b_0, IOException {
        this.f(null, inputStream);
    }

    @Override
    public final void f(@c String string, InputStream inputStream) throws b_0, IOException {
        this.d(string, inputStream, null);
    }

    @Override
    public final void V(InputStream inputStream, @c String string) throws b_0, IOException {
        InputStreamReader inputStreamReader;
        f f10;
        try {
            f10 = this;
            inputStreamReader = string == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, string);
        }
        catch (b_0 b_02) {
            throw f.b(b_02);
        }
        f10.f(inputStreamReader);
    }

    @Override
    public final void d(@c String string, InputStream inputStream, @c String string2) throws b_0, IOException {
        InputStreamReader inputStreamReader;
        String string3;
        f f10;
        try {
            f10 = this;
            string3 = string;
            inputStreamReader = string2 == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, string2);
        }
        catch (b_0 b_02) {
            throw f.b(b_02);
        }
        f10.Y(string3, inputStreamReader);
    }

    @Override
    public final void D(String string) throws b_0 {
        this.E(null, string);
    }

    @Override
    public final void E(@c String string, String string2) throws b_0 {
        try {
            this.Y(string, new StringReader(string2));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException(a);
        }
    }

    @Override
    public final void O(File file) throws b_0, IOException {
        this.o(file, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public final void o(File var1_1, @c String var2_2) throws b_0, IOException {
        block14: {
            var4_3 = new FileInputStream(var1_1);
            var3_4 = d_0.b();
            try {
                try {
                    v0 = this;
                    v1 = var1_1.getAbsolutePath();
                    v2 = var2_2 == null ? new InputStreamReader(var4_3) : new InputStreamReader((InputStream)var4_3, var2_2);
                }
                catch (IOException v3) {
                    throw f.b(v3);
                }
                v0.Y(v1, v2);
                var4_3.close();
                var4_3 = null;
            }
            catch (Throwable var6_6) {
                block15: {
                    try {
                        v4 = var4_3;
                        if (var3_4 != null) {
                            if (v4 == null) break block15;
                        }
                        ** GOTO lbl24
                    }
                    catch (IOException v5) {
                        throw f.b(v5);
                    }
                    try {
                        v4 = var4_3;
lbl24:
                        // 2 sources

                        v4.close();
                    }
                    catch (IOException var7_7) {
                        // empty catch block
                    }
                }
                throw var6_6;
            }
            try {
                v6 = var4_3;
                if (var3_4 != null) {
                    if (v6 == null) break block14;
                }
                ** GOTO lbl40
            }
            catch (IOException v7) {
                throw f.b(v7);
            }
            try {
                v6 = var4_3;
lbl40:
                // 2 sources

                v6.close();
            }
            catch (IOException var5_5) {}
        }
    }

    @Override
    public final void c(String string) throws b_0, IOException {
        this.r(string, null);
    }

    @Override
    public final void r(String string, @c String string2) throws b_0, IOException {
        this.o(new File(string), string2);
    }

    private static Exception b(Exception exception) {
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
                char[] cArray3 = ">x@i|o\u0007\u001f_a4\u000eY\u0012\tS}s(T\u0001\u0002A|s\u0015s6\u0015Uj#(U\u001c\u0003".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 13;
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
                            n17 = 59;
                            break;
                        }
                        case 2: {
                            n17 = 2;
                            break;
                        }
                        case 3: {
                            n17 = 94;
                            break;
                        }
                        case 4: {
                            n17 = 81;
                            break;
                        }
                        case 5: {
                            n17 = 49;
                            break;
                        }
                        default: {
                            n17 = 126;
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

