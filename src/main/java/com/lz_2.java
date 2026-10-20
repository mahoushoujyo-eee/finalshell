/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FF;
import com.FV;
import com.ne_1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/*
 * Renamed from com.lz
 */
public final class lz_2 {
    private static final long a;

    public static boolean f(String string, String string2) {
        return lz_2.k(string, string2, null);
    }

    public static boolean k(String string, String string2, FF fF2) {
        return lz_2.c(new File(string), new File(string2), fF2);
    }

    public static boolean B(File file, File file2) {
        return lz_2.c(file, file2, null);
    }

    public static boolean c(File file, File file2, FF fF2) {
        String string = FV.D();
        try {
            boolean bl;
            block13: {
                ZipFile zipFile;
                block12: {
                    FF fF3;
                    block11: {
                        zipFile = new ZipFile(file);
                        try {
                            fF3 = fF2;
                            if (string != null) break block11;
                            if (fF3 == null) break block12;
                        }
                        catch (Throwable throwable) {
                            throw lz_2.a(throwable);
                        }
                        fF3 = fF2;
                    }
                    fF3.s(zipFile.size());
                }
                Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
                int n10 = 0;
                while (enumeration.hasMoreElements()) {
                    block16: {
                        FF fF4;
                        File file3;
                        ZipEntry zipEntry;
                        block15: {
                            block17: {
                                block14: {
                                    zipEntry = enumeration.nextElement();
                                    try {
                                        bl = zipEntry.isDirectory();
                                        if (string != null) break block13;
                                        if (!bl) break block14;
                                    }
                                    catch (Throwable throwable) {
                                        throw lz_2.a(throwable);
                                    }
                                    file3 = new File(file2, zipEntry.getName());
                                    file3.mkdirs();
                                    if (string == null) break block17;
                                }
                                file3 = new File(file2, zipEntry.getName());
                                file3.getParentFile().mkdirs();
                                file3.createNewFile();
                                lz_2.q(zipFile.getInputStream(zipEntry), new BufferedOutputStream(new FileOutputStream(file3)));
                            }
                            try {
                                fF4 = fF2;
                                if (string != null) break block15;
                                if (fF4 == null) break block16;
                            }
                            catch (Throwable throwable) {
                                throw lz_2.a(throwable);
                            }
                            fF4 = fF2;
                        }
                        fF4.e(zipEntry, file3, n10);
                        ++n10;
                    }
                    if (string == null) continue;
                }
                zipFile.close();
                bl = true;
            }
            return bl;
        }
        catch (Throwable throwable) {
            ne_1.g(lz_2.class, throwable);
            return false;
        }
    }

    public static String a(ZipEntry zipEntry) {
        String string = zipEntry.getName();
        return string.substring(string.lastIndexOf("/") + 1);
    }

    public static String E(ZipEntry zipEntry) {
        String string = zipEntry.getName();
        return string.substring(0, string.lastIndexOf("/") + 1);
    }

    private static void q(InputStream inputStream, OutputStream outputStream) throws IOException {
        block4: {
            int n10;
            byte[] byArray = new byte[(int)a];
            String string = FV.D();
            while ((n10 = inputStream.read(byArray)) >= 0) {
                try {
                    outputStream.write(byArray, 0, n10);
                    if (string == null) {
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IOException iOException) {
                    throw lz_2.a(iOException);
                }
            }
            inputStream.close();
            outputStream.close();
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4495718024189373762L;
        a = 0xA9866DCA4220E942L ^ l2;
    }
}

