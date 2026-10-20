/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from oA
 */
public class oa_1
implements FY {
    File p = null;
    private static String[] z;
    private static final String a;

    public oa_1(File file) {
        String[] stringArray = oa_1.j();
        this.p = file;
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public String T() {
        return this.p.getName();
    }

    @Override
    public InputStream g() throws IOException {
        return new FileInputStream(this.p);
    }

    @Override
    public OutputStream D() throws IOException {
        return new FileOutputStream(this.p);
    }

    @Override
    public OutputStream M(boolean bl) throws IOException {
        return new FileOutputStream(this.p, bl);
    }

    /*
     * Loose catch block
     */
    @Override
    public FY Y(String string) {
        FY fY2;
        block16: {
            File file;
            block15: {
                boolean bl;
                block13: {
                    String[] stringArray;
                    block14: {
                        stringArray = oa_1.j();
                        bl = string.equals(this.p.getName());
                        if (stringArray != null) break block13;
                        try {
                            block17: {
                                if (!bl) break block14;
                                break block17;
                                catch (IOException iOException) {
                                    throw oa_1.a(iOException);
                                }
                            }
                            return this;
                        }
                        catch (IOException iOException) {
                            throw oa_1.a(iOException);
                        }
                    }
                    try {
                        file = this.p;
                        if (stringArray != null) break block15;
                        bl = file.isDirectory();
                    }
                    catch (IOException iOException) {
                        throw oa_1.a(iOException);
                    }
                }
                try {
                    if (!bl) break block16;
                    file = new File(this.p.getAbsolutePath() + File.separator + string);
                }
                catch (IOException iOException) {
                    throw oa_1.a(iOException);
                }
            }
            File file2 = file;
            try {
                file2.createNewFile();
            }
            catch (IOException iOException) {
                System.out.println(a + iOException.getMessage());
            }
            return new oa_1(file2);
        }
        try {
            fY2 = null;
            if (ky_2.F() != null) {
                oa_1.G(new String[3]);
            }
        }
        catch (IOException iOException) {
            throw oa_1.a(iOException);
        }
        return fY2;
    }

    @Override
    public long F() {
        return this.p.length();
    }

    @Override
    public boolean u() {
        return this.p.isDirectory();
    }

    @Override
    public boolean B() {
        return this.p.exists();
    }

    public static void G(String[] stringArray) {
        z = stringArray;
    }

    public static String[] j() {
        return z;
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
                if (oa_1.j() != null) {
                    oa_1.G(new String[5]);
                }
                char[] cArray3 = "`\u001d\u0003\u007fL*hm\n\u0011>~&$FO#lJ :\u0019".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 45;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 66;
                            break;
                        }
                        case 2: {
                            n17 = 75;
                            break;
                        }
                        case 3: {
                            n17 = 51;
                            break;
                        }
                        case 4: {
                            n17 = 21;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 101;
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

