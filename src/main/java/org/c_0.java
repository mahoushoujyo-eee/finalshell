/*
 * Decompiled with CFR 0.152.
 */
package org;

import com.ky_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import org.P;
import org.b_0;
import org.d_0;
import org.f;
import org.p_0;

/*
 * Renamed from org.c
 */
public abstract class c_0
extends f
implements p_0 {
    private static final String b;

    @Override
    public final void d(InputStream[] inputStreamArray) throws b_0, IOException {
        this.R(new String[inputStreamArray.length], inputStreamArray);
    }

    @Override
    public final void b(String[] stringArray) throws b_0 {
        this.E(new String[stringArray.length], stringArray);
    }

    @Override
    public final void R(String[] stringArray, InputStream[] inputStreamArray) throws b_0, IOException {
        this.L(stringArray, inputStreamArray, new String[stringArray.length]);
    }

    @Override
    public final void Q(InputStream[] inputStreamArray, String[] stringArray) throws b_0, IOException {
        this.L(new String[inputStreamArray.length], inputStreamArray, stringArray);
    }

    @Override
    public final void L(String[] stringArray, InputStream[] inputStreamArray, String[] stringArray2) throws b_0, IOException {
        block5: {
            int n10 = stringArray.length;
            ky_2[] ky_2Array = d_0.b();
            Reader[] readerArray = new Reader[n10];
            for (int i2 = 0; i2 < n10; ++i2) {
                InputStreamReader inputStreamReader;
                block7: {
                    block6: {
                        try {
                            try {
                                if (ky_2Array == null) break block5;
                                Reader[] readerArray2 = readerArray;
                                int n11 = i2;
                                if (stringArray2[i2] != null) break block6;
                            }
                            catch (b_0 b_02) {
                                throw c_0.c(b_02);
                            }
                            inputStreamReader = new InputStreamReader(inputStreamArray[i2]);
                            break block7;
                        }
                        catch (b_0 b_03) {
                            throw c_0.c(b_03);
                        }
                    }
                    inputStreamReader = new InputStreamReader(inputStreamArray[i2], stringArray2[i2]);
                }
                readerArray2[n11] = inputStreamReader;
                if (ky_2Array != null) continue;
            }
            this.a(stringArray, readerArray);
        }
    }

    @Override
    public final void E(String[] stringArray, String[] stringArray2) throws b_0 {
        block6: {
            int n10 = stringArray.length;
            Reader[] readerArray = new Reader[n10];
            ky_2[] ky_2Array = d_0.b();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    readerArray[i2] = new StringReader(stringArray2[i2]);
                    if (ky_2Array != null) {
                        if (ky_2Array != null) continue;
                        break;
                    }
                    break block6;
                }
                catch (IOException iOException) {
                    throw c_0.c(iOException);
                }
            }
            try {
                this.a(stringArray, readerArray);
            }
            catch (IOException iOException) {
                throw new P(b, iOException);
            }
        }
    }

    @Override
    public abstract void a(String[] var1, Reader[] var2) throws b_0, IOException;

    @Override
    public final void W(File[] fileArray) throws b_0, IOException {
        this.W(fileArray, new String[fileArray.length]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public final void W(File[] fileArray, String[] stringArray) throws b_0, IOException {
        block27: {
            Object object;
            int n10;
            ky_2[] ky_2Array;
            InputStream[] inputStreamArray;
            int n11;
            block26: {
                n11 = fileArray.length;
                String[] stringArray2 = new String[n11];
                inputStreamArray = new InputStream[n11];
                ky_2Array = d_0.b();
                try {
                    block25: {
                        for (n10 = 0; n10 < n11; ++n10) {
                            object = fileArray[n10];
                            try {
                                stringArray2[n10] = ((File)object).getPath();
                                inputStreamArray[n10] = new FileInputStream((File)object);
                                if (ky_2Array != null) {
                                    if (ky_2Array != null) continue;
                                    break;
                                }
                                break block25;
                            }
                            catch (Exception exception) {
                                throw c_0.c(exception);
                            }
                        }
                        this.Q(inputStreamArray, stringArray);
                    }
                    for (n10 = 0; n10 < n11; ++n10) {
                        try {
                            inputStreamArray[n10].close();
                            if (ky_2Array != null) {
                                if (ky_2Array != null) continue;
                                break;
                            }
                            break block26;
                        }
                        catch (Exception exception) {
                            throw c_0.c(exception);
                        }
                    }
                    n10 = 0;
                }
                catch (Throwable throwable) {
                    int n12 = 0;
                    while (n12 < n11) {
                        block30: {
                            block31: {
                                InputStream inputStream = inputStreamArray[n12];
                                try {
                                    if (ky_2Array == null) break block30;
                                    if (inputStream == null) break block31;
                                }
                                catch (Exception exception) {
                                    throw c_0.c(exception);
                                }
                                try {
                                    inputStream.close();
                                }
                                catch (Exception exception) {
                                    // empty catch block
                                }
                            }
                            ++n12;
                        }
                        if (ky_2Array != null) continue;
                    }
                    throw throwable;
                }
            }
            while (n10 < n11) {
                block28: {
                    block29: {
                        object = inputStreamArray[n10];
                        if (ky_2Array == null) break block27;
                        try {
                            block32: {
                                if (ky_2Array == null) break block28;
                                break block32;
                                catch (Exception exception) {
                                    throw c_0.c(exception);
                                }
                            }
                            if (object == null) break block29;
                        }
                        catch (Exception exception) {
                            throw c_0.c(exception);
                        }
                        try {
                            ((InputStream)object).close();
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    ++n10;
                }
                if (ky_2Array != null) continue;
                break;
            }
        }
        try {
            if (ky_2.F() != null) {
                d_0.N(new ky_2[1]);
            }
        }
        catch (Exception exception) {
            throw c_0.c(exception);
        }
    }

    @Override
    public final void p(String[] stringArray) throws b_0, IOException {
        this.E(stringArray, new String[stringArray.length]);
    }

    @Override
    public final void I(String[] stringArray, String[] stringArray2) throws b_0, IOException {
        block4: {
            int n10 = stringArray.length;
            File[] fileArray = new File[n10];
            ky_2[] ky_2Array = d_0.b();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    fileArray[i2] = new File(stringArray[i2]);
                    if (ky_2Array != null) {
                        if (ky_2Array != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw c_0.c(b_02);
                }
            }
            this.W(fileArray, stringArray2);
        }
    }

    @Override
    public final void g(Reader[] readerArray) throws b_0, IOException {
        this.a(new String[readerArray.length], readerArray);
    }

    private static Exception c(Exception exception) {
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
                char[] cArray3 = "7a@d\u0014?~!Wl;D\u0002X\u000bA/:Q\u0005A\r[j~g\u0002C\rAh\fQ\u0017U\u0001]".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 125;
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
                            n17 = 25;
                            break;
                        }
                        case 1: {
                            n17 = 82;
                            break;
                        }
                        case 2: {
                            n17 = 114;
                            break;
                        }
                        case 3: {
                            n17 = 35;
                            break;
                        }
                        case 4: {
                            n17 = 73;
                            break;
                        }
                        case 5: {
                            n17 = 11;
                            break;
                        }
                        default: {
                            n17 = 76;
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
        b = new String(cArray).intern();
    }
}

