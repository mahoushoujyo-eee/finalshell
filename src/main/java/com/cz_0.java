/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CP;
import com.DE;
import com.DZ;
import com.EE;
import com.FV;
import com.NE;
import com.PK;
import com.RP;
import com.WC;
import com.b.V;
import com.dt_0;
import com.eq_0;
import com.i2_0;
import com.ne_1;
import com.o3_0;
import com.on_0;
import com.rk_1;
import com.xg_0;
import com.yt_0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.JTextComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Cz
 */
public final class cz_0 {
    private static final ImageIcon p;
    private static final FileSystemView W;
    private static final SimpleDateFormat k;
    private static final char[] R;
    private static final Map K;
    private static final Map x;
    private static final Map j;
    private static final Map w;
    private static final Map M;
    private static final Map E;
    private static final Map A;
    private static final Map Y;
    private static final Map f;
    private static final Map e;
    private static final Map N;
    private static final Object z;
    private static final Map D;
    private static final Map S;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] g;
    private static final Long[] h;

    public static void s(File[] fileArray) {
        block8: {
            File[] fileArray2;
            String string;
            block9: {
                block7: {
                    string = FV.D();
                    try {
                        fileArray2 = fileArray;
                        if (string != null) break block7;
                        if (fileArray2 == null) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    fileArray2 = fileArray;
                }
                try {
                    try {
                        if (string != null) break block9;
                        if (fileArray2.length <= 0) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    fileArray2 = fileArray;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            for (File file : fileArray2) {
                cz_0.U(file);
                if (string == null) continue;
            }
        }
    }

    public static void U(File file) {
        block3: {
            File file2;
            block2: {
                String string = FV.D();
                try {
                    file2 = file;
                    if (string != null) break block2;
                    if (file2 == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                file2 = file;
            }
            cz_0.X(file2.getAbsolutePath());
        }
    }

    public static void X(String string) {
        cz_0.W(string);
        cz_0.G(string);
        cz_0.p(string);
        cz_0.s(string);
        cz_0.q(string);
        cz_0.V(string);
        cz_0.E(string);
        cz_0.j(string);
        cz_0.C(string);
        cz_0.A(string);
        cz_0.c(string);
    }

    public static List c(File file) {
        ArrayList<File> arrayList;
        block2: {
            ArrayList<File> arrayList2 = new ArrayList<File>();
            String string = FV.D();
            while (file != null) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(0, file);
                    file = file.getParentFile();
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static String w(File file, File file2) {
        return file2.toURI().relativize(file.toURI()).getPath();
    }

    public static boolean J(File file) {
        boolean bl;
        block11: {
            block9: {
                String string;
                block10: {
                    File file2;
                    block8: {
                        string = FV.D();
                        try {
                            file2 = file.getParentFile();
                            if (string != null) break block8;
                            if (file2 == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        file2 = file;
                    }
                    try {
                        try {
                            bl = file2.canWrite();
                            if (string != null) break block10;
                            if (!bl) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl = file.getParentFile().canWrite();
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                try {
                    if (string != null) break block11;
                    if (!bl) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    public static void D(JTextComponent jTextComponent, File file) {
        int n10;
        JTextComponent jTextComponent2;
        block6: {
            String string;
            block4: {
                String string2;
                block5: {
                    string2 = file.getName();
                    String string3 = FV.D();
                    try {
                        try {
                            jTextComponent2 = jTextComponent;
                            string = string2;
                            if (string3 != null) break block4;
                            jTextComponent2.setText(string);
                            jTextComponent.setSelectionStart(0);
                            jTextComponent2 = jTextComponent;
                            if (!file.isDirectory()) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        n10 = string2.length();
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                string = cz_0.Z(string2);
            }
            n10 = string.length();
        }
        jTextComponent2.setSelectionEnd(n10);
    }

    public static File G() {
        return new File(cz_0.x());
    }

    public static String x() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 345 out of bounds for length 2");
    }

    public static boolean u(File file) {
        try {
            return file.setExecutable(true, false);
        }
        catch (Throwable throwable) {
            ne_1.g(cz_0.class, throwable);
            return false;
        }
    }

    /*
     * Loose catch block
     */
    public static File M(File file) {
        String string = FV.D();
        try {
            File file2;
            block6: {
                block7: {
                    file2 = file;
                    if (string != null) break block6;
                    try {
                        block8: {
                            if (file2 == null) break block7;
                            break block8;
                            catch (IOException iOException) {
                                throw cz_0.a(iOException);
                            }
                        }
                        file2 = file.getCanonicalFile();
                        break block6;
                    }
                    catch (IOException iOException) {
                        throw cz_0.a(iOException);
                    }
                }
                file2 = file;
            }
            return file2;
        }
        catch (IOException iOException) {
            return file;
        }
    }

    public static File f() {
        File file;
        block6: {
            block5: {
                File[] fileArray;
                block4: {
                    File[] fileArray2 = cz_0.B();
                    String string = FV.D();
                    try {
                        try {
                            fileArray = fileArray2;
                            if (string != null) break block4;
                            if (fileArray.length <= 0) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        fileArray = fileArray2;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                file = fileArray[0];
                break block6;
            }
            file = null;
        }
        return file;
    }

    public static File[] B() {
        File[] fileArray;
        block8: {
            block9: {
                File[] fileArray2 = W.getRoots();
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                fileArray = fileArray2;
                                if (string != null) break block8;
                                if (fileArray == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            fileArray = fileArray2;
                            if (string != null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        if (fileArray.length <= 0) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return fileArray2;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            fileArray = cz_0.z();
        }
        return fileArray;
    }

    public static File[] z() {
        File[] fileArray;
        block13: {
            int n10;
            int n11;
            File[] fileArray2;
            String string;
            File[] fileArray3;
            block11: {
                fileArray3 = File.listRoots();
                string = FV.D();
                int n12 = 0;
                fileArray2 = fileArray3;
                n11 = fileArray2.length;
                int n13 = 0;
                while (n13 < n11) {
                    block10: {
                        block12: {
                            File file = fileArray2[n13];
                            try {
                                try {
                                    if (string != null) break block10;
                                    n10 = cz_0.z(file) ? '\u0001' : '\u0000';
                                    if (string != null) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                if (n10 == 0) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            ++n12;
                        }
                        ++n13;
                    }
                    if (string == null) continue;
                }
                fileArray2 = new File[n12];
                n10 = 0;
            }
            n11 = n10;
            File[] fileArray4 = fileArray3;
            int n14 = fileArray4.length;
            int n15 = 0;
            while (n15 < n14) {
                block14: {
                    block15: {
                        fileArray = fileArray4;
                        if (string != null) break block13;
                        File file = fileArray[n15];
                        try {
                            try {
                                if (string != null) break block14;
                                if (!cz_0.z(file)) break block15;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            fileArray2[n11] = file;
                            ++n11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    ++n15;
                }
                if (string == null) continue;
            }
            fileArray = fileArray2;
        }
        return fileArray;
    }

    public static File[] w(File file, on_0 on_02) {
        return cz_0.k(file, new eq_0(on_02));
    }

    public static File[] k(File file, FileFilter fileFilter) {
        File[] fileArray;
        block2: {
            block3: {
                File[] fileArray2 = file.listFiles(fileFilter);
                String string = FV.D();
                try {
                    fileArray = fileArray2;
                    if (string != null) break block2;
                    if (fileArray == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                fileArray = fileArray2;
                break block2;
            }
            fileArray = new File[]{};
        }
        return fileArray;
    }

    public static String h(File file) {
        return cz_0.v(file, cz_0.a(25117, 2398101724558223259L));
    }

    public static String v(File file, int n10) {
        try {
            return cz_0.H(new FileInputStream(file), n10);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    public static String v(InputStream inputStream) {
        return cz_0.H(inputStream, cz_0.a(29007, 5209399603526169830L));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String H(InputStream inputStream, int n10) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        String string = FV.D();
        try {
            MessageDigest messageDigest;
            block15: {
                int n11;
                MessageDigest messageDigest2 = MessageDigest.getInstance("\u0000ERR:ArrayIndexOutOfBoundsException:Index 320 out of bounds for length 2");
                byte[] byArray = new byte[n10];
                while ((n11 = bufferedInputStream.read(byArray, 0, byArray.length)) > 0) {
                    try {
                        messageDigest = messageDigest2;
                        if (string == null) {
                            messageDigest.update(byArray, 0, n11);
                            if (string == null) continue;
                            break;
                        }
                        break block15;
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                }
                messageDigest = messageDigest2;
            }
            byte[] byArray = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, byArray);
            string = bigInteger.toString(cz_0.a(18346, 504352758455812617L));
        }
        catch (Throwable throwable) {
            try {
                String string2 = null;
                return string2;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                try {
                    bufferedInputStream.close();
                }
                catch (Throwable throwable3) {}
            }
        }
        try {
            bufferedInputStream.close();
            return string;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return string;
    }

    public static File b() {
        return new File(cz_0.p());
    }

    public static String p() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 341 out of bounds for length 2");
    }

    public static File x() {
        return new File(cz_0.f());
    }

    public static String f() {
        String string = System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 336 out of bounds for length 2");
        if (!string.endsWith(File.separator)) {
            string = string + File.separator;
        }
        return string;
    }

    /*
     * Loose catch block
     */
    public static boolean n(File file, File file2) {
        boolean bl;
        String string;
        block30: {
            block29: {
                File file3;
                block28: {
                    block26: {
                        block27: {
                            block38: {
                                block37: {
                                    string = FV.D();
                                    file3 = file;
                                    if (string != null) break block26;
                                    if (file3 != null) break block27;
                                    break block37;
                                    catch (IOException iOException) {
                                        throw cz_0.a(iOException);
                                    }
                                }
                                file3 = file2;
                                if (string != null) break block26;
                                break block38;
                                catch (IOException iOException) {
                                    throw cz_0.a(iOException);
                                }
                            }
                            try {
                                block39: {
                                    if (file3 != null) break block27;
                                    break block39;
                                    catch (IOException iOException) {
                                        throw cz_0.a(iOException);
                                    }
                                }
                                return true;
                            }
                            catch (IOException iOException) {
                                throw cz_0.a(iOException);
                            }
                        }
                        file3 = file;
                    }
                    try {
                        if (string != null) break block28;
                        if (file3 == null) break block29;
                    }
                    catch (IOException iOException) {
                        throw cz_0.a(iOException);
                    }
                    file3 = file2;
                }
                try {
                    if (file3 == null) break block29;
                    bl = true;
                    break block30;
                }
                catch (IOException iOException) {
                    throw cz_0.a(iOException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            boolean bl3;
            block33: {
                block32: {
                    block31: {
                        bl3 = bl2;
                        if (string != null) break block31;
                        try {
                            block40: {
                                if (!bl3) break block32;
                                break block40;
                                catch (IOException iOException) {
                                    throw cz_0.a(iOException);
                                }
                            }
                            bl3 = file.getCanonicalPath().equals(file2.getCanonicalPath());
                        }
                        catch (IOException iOException) {
                            throw cz_0.a(iOException);
                        }
                    }
                    try {
                        if (string != null) break block33;
                        if (!bl3) break block32;
                    }
                    catch (IOException iOException) {
                        throw cz_0.a(iOException);
                    }
                    bl3 = true;
                    break block33;
                }
                bl3 = false;
            }
            return bl3;
        }
        catch (IOException iOException) {
            boolean bl4;
            block36: {
                block35: {
                    block34: {
                        try {
                            try {
                                bl4 = bl2;
                                if (string != null) break block34;
                                if (!bl4) break block35;
                            }
                            catch (IOException iOException2) {
                                throw cz_0.a(iOException2);
                            }
                            bl4 = file.getAbsolutePath().equals(file2.getAbsolutePath());
                        }
                        catch (IOException iOException3) {
                            throw cz_0.a(iOException3);
                        }
                    }
                    try {
                        if (string != null) break block36;
                        if (!bl4) break block35;
                    }
                    catch (IOException iOException4) {
                        throw cz_0.a(iOException4);
                    }
                    bl4 = true;
                    break block36;
                }
                bl4 = false;
            }
            return bl4;
        }
    }

    public static boolean v(List list, List list2) {
        boolean bl;
        block21: {
            int n10;
            String string;
            block19: {
                int n11;
                block20: {
                    int n12;
                    block17: {
                        block18: {
                            string = FV.D();
                            try {
                                try {
                                    n11 = list.size();
                                    n12 = list2.size();
                                    if (string != null) break block17;
                                    if (n11 == n12) break block18;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                return false;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        try {
                            n11 = list.size();
                            if (string != null) break block19;
                            n12 = list2.size();
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n11 != n12) break block20;
                                n11 = list2.size();
                                if (string != null) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            if (n11 != 0) break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        return true;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                n11 = n10 = 0;
            }
            while (n10 < list.size()) {
                block23: {
                    boolean bl2;
                    block22: {
                        try {
                            try {
                                bl = ((File)list.get(n10)).getAbsolutePath().equals(((File)list2.get(n10)).getAbsolutePath());
                                if (string != null) break block21;
                                if (string != null) break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            if (bl) break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                ++n10;
                if (string == null) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static boolean y(List list, File file) {
        boolean bl;
        block15: {
            Iterator iterator = list.iterator();
            String string = FV.D();
            while (iterator.hasNext()) {
                block19: {
                    boolean bl2;
                    block21: {
                        block20: {
                            Object e2;
                            block16: {
                                block17: {
                                    boolean bl3;
                                    block18: {
                                        e2 = iterator.next();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = e2 instanceof File;
                                                        if (string != null) break block15;
                                                        if (string != null) break block16;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw cz_0.a(runtimeException);
                                                    }
                                                    if (!bl) break block17;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw cz_0.a(runtimeException);
                                                }
                                                bl3 = ((File)e2).getAbsolutePath().equals(file.getAbsolutePath());
                                                if (string != null) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw cz_0.a(runtimeException);
                                            }
                                            if (!bl3) break block19;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw cz_0.a(runtimeException);
                                        }
                                        bl3 = true;
                                    }
                                    return bl3;
                                }
                                bl2 = e2 instanceof String;
                            }
                            try {
                                try {
                                    if (string != null) break block20;
                                    if (!bl2) break block19;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                bl2 = e2.equals(file.getAbsolutePath());
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        try {
                            if (string != null) break block21;
                            if (!bl2) break block19;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (string == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean U(File file, List list) {
        List list2;
        String string;
        block12: {
            block13: {
                block11: {
                    string = FV.D();
                    try {
                        list2 = list;
                        if (string != null) break block11;
                        if (list2 == null) return true;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    list2 = list;
                }
                try {
                    try {
                        if (string != null) break block12;
                        if (list2.size() != 0) break block13;
                        return true;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            list2 = list;
        }
        Iterator iterator = list2.iterator();
        do {
            if (!iterator.hasNext()) return false;
            FileFilter fileFilter = (FileFilter)iterator.next();
            try {
                boolean bl;
                try {
                    bl = fileFilter.accept(file);
                    if (string != null) return bl;
                    if (string != null) boolean bl2;
                    return bl2;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                if (!bl) continue;
                return true;
            }
            catch (RuntimeException runtimeException) {
                throw cz_0.a(runtimeException);
            }
        } while (string == null);
        return false;
    }

    public static String f(String string) {
        String string2;
        block5: {
            StringBuilder stringBuilder = new StringBuilder();
            String string3 = FV.D();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                try {
                    try {
                        string2 = string;
                        if (string3 != null) break block5;
                        if (cz_0.r(string2.charAt(i2))) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    stringBuilder.append(string.charAt(i2));
                    continue;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            string2 = stringBuilder.toString().replaceAll(" ", "_");
        }
        return string2;
    }

    public static boolean r(char c2) {
        char c3;
        block6: {
            char c4 = '\u0000';
            String string = FV.D();
            char[] cArray = R;
            int n10 = cArray.length;
            int n11 = 0;
            while (n11 < n10) {
                block5: {
                    block7: {
                        char c5 = cArray[n11];
                        try {
                            try {
                                if (string != null) break block5;
                                c3 = c2;
                                if (string != null) break block6;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            if (c3 != c5) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        c4 = '\u0001';
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
            c3 = c4;
        }
        return c3 != '\u0000';
    }

    public static String m(File file) {
        try {
            return file.getCanonicalPath();
        }
        catch (IOException iOException) {
            return file.getAbsolutePath();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static File x(File var0) {
        block9: {
            block8: {
                var0 = var0.getAbsoluteFile();
                var1_1 = FV.D();
                var2_2 = var0.getParentFile();
                try {
                    try {
                        v0 = var2_2;
                        if (var1_1 == null) {
                            if (v0 != null) break block8;
                        }
                        ** GOTO lbl19
                    }
                    catch (RuntimeException v1) {
                        throw cz_0.a(v1);
                    }
                    return null;
                }
                catch (RuntimeException v2) {
                    throw cz_0.a(v2);
                }
            }
            do {
                v0 = var2_2.getParentFile();
lbl19:
                // 2 sources

                try {
                    if (v0 == null) break;
                    v3 = var2_2.getParentFile();
                    if (var1_1 != null) break block9;
                }
                catch (RuntimeException v4) {
                    throw cz_0.a(v4);
                }
                var2_2 = v3;
            } while (var1_1 == null);
            v3 = var2_2;
        }
        return v3;
    }

    public static boolean Z(File file, File file2) {
        boolean bl;
        block32: {
            File file3;
            String string;
            block29: {
                File file4;
                block30: {
                    block27: {
                        block28: {
                            block25: {
                                block26: {
                                    block23: {
                                        block24: {
                                            string = FV.D();
                                            try {
                                                try {
                                                    file4 = file2;
                                                    if (string != null) break block23;
                                                    if (file4 != file) break block24;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw cz_0.a(runtimeException);
                                                }
                                                return false;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw cz_0.a(runtimeException);
                                            }
                                        }
                                        file4 = file2;
                                    }
                                    try {
                                        try {
                                            if (string != null) break block25;
                                            if (file4 != null) break block26;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw cz_0.a(runtimeException);
                                        }
                                        return false;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                }
                                file4 = file;
                            }
                            try {
                                try {
                                    if (string != null) break block27;
                                    if (file4 != null) break block28;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                return true;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        file4 = file2;
                    }
                    try {
                        try {
                            if (string != null) break block29;
                            if (!file4.equals(file)) break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        return false;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                file2 = file2.getAbsoluteFile();
                file4 = file3 = file2.getParentFile();
            }
            while (file3 != null) {
                block31: {
                    File file5;
                    block33: {
                        try {
                            try {
                                try {
                                    file5 = file3;
                                    if (string != null) break block31;
                                    bl = file5.equals(file);
                                    if (string != null) break block32;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                if (!bl) break block33;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    file5 = file3 = file3.getParentFile();
                }
                if (string == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static String Q(File file) {
        String string;
        block4: {
            block3: {
                File file2;
                block2: {
                    String string2 = FV.D();
                    try {
                        file2 = file;
                        if (string2 != null) break block2;
                        if (file2 == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    file2 = file;
                }
                string = cz_0.Z(file2.getName());
                break block4;
            }
            string = "";
        }
        return string;
    }

    public static String Z(String string) {
        String string2;
        block4: {
            block5: {
                String string3;
                String string4 = FV.D();
                try {
                    string2 = string;
                    if (string4 != null) break block4;
                    if (NE.B(string2)) break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                int n10 = string.lastIndexOf(".");
                try {
                    string3 = n10 == -1 ? string : string.substring(0, n10);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                return string3;
            }
            string2 = "";
        }
        return string2;
    }

    public static String r(File file, boolean bl) {
        String string;
        block4: {
            block3: {
                File file2;
                block2: {
                    String string2 = FV.D();
                    try {
                        file2 = file;
                        if (string2 != null) break block2;
                        if (file2 == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    file2 = file;
                }
                string = cz_0.G(file2.getName(), bl);
                break block4;
            }
            string = "";
        }
        return string;
    }

    public static String G(String string, boolean bl) {
        String string2;
        block8: {
            block9: {
                String string3;
                block12: {
                    int n10;
                    int n11;
                    block10: {
                        block11: {
                            String string4 = FV.D();
                            try {
                                string2 = string;
                                if (string4 != null) break block8;
                                if (NE.B(string2)) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            n11 = string.lastIndexOf(".");
                            try {
                                try {
                                    n10 = n11;
                                    if (string4 != null) break block10;
                                    if (n10 != -1) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                string3 = "";
                                break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        n10 = bl ? '\u0001' : '\u0000';
                    }
                    try {
                        string3 = n10 != 0 ? string.substring(n11) : string.substring(n11 + 1);
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                return string3;
            }
            string2 = "";
        }
        return string2;
    }

    public static String U(String string) {
        return cz_0.b(string, cz_0.a(23698, 498440931062110518L));
    }

    public static String b(String string, int n10) {
        String string2;
        block7: {
            block8: {
                String string3 = FV.D();
                try {
                    if (n10 < 2) {
                        return string;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                String string4 = cz_0.Z(string);
                try {
                    try {
                        string2 = string4;
                        if (string3 != null) break block7;
                        if (string2.length() <= n10) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return string4.substring(0, n10 - 2) + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 335 out of bounds for length 2" + cz_0.G(string, false);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            string2 = string;
        }
        return string2;
    }

    public static List X(List list) {
        List list2;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        list2 = list;
                        if (string != null) break block4;
                        if (list2 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    Collections.sort(list, DE.n);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            list2 = list;
        }
        return list2;
    }

    public static File[] C(File[] fileArray) {
        File[] fileArray2;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        fileArray2 = fileArray;
                        if (string != null) break block4;
                        if (fileArray2 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    Arrays.sort(fileArray, DE.n);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            fileArray2 = fileArray;
        }
        return fileArray2;
    }

    public static String H(String string, String string2) {
        return cz_0.a(new File(string), string2);
    }

    public static String a(File file, String string) {
        String string2;
        ArrayList<String> arrayList;
        block8: {
            ArrayList<String> arrayList2;
            block7: {
                File[] fileArray;
                String string3;
                block6: {
                    arrayList2 = new ArrayList<String>();
                    File[] fileArray2 = file.listFiles();
                    string3 = FV.D();
                    try {
                        fileArray = fileArray2;
                        if (string3 != null) break block6;
                        if (fileArray == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    fileArray = fileArray2;
                }
                for (File file2 : fileArray) {
                    try {
                        arrayList = arrayList2;
                        string2 = file2.getName();
                        if (string3 == null) {
                            arrayList.add(string2);
                            if (string3 == null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
            }
            arrayList = arrayList2;
            string2 = string;
        }
        return cz_0.I(arrayList, string2);
    }

    /*
     * Loose catch block
     */
    public static String I(List list, String string) {
        String string2;
        block28: {
            Integer n10;
            String string3;
            String string4;
            String string5;
            String string6;
            block27: {
                int n11;
                int n12;
                int n13;
                int n14;
                block26: {
                    String string7;
                    String string8;
                    int n15;
                    block24: {
                        block25: {
                            string6 = FV.D();
                            n15 = list.contains(string);
                            if (string6 != null) break block24;
                            try {
                                block33: {
                                    if (n15 != 0) break block25;
                                    break block33;
                                    catch (Throwable throwable) {
                                        throw cz_0.a(throwable);
                                    }
                                }
                                return string;
                            }
                            catch (Throwable throwable) {
                                throw cz_0.a(throwable);
                            }
                        }
                        n15 = string.lastIndexOf(".");
                    }
                    int n16 = n15;
                    try {
                        string8 = n16 != -1 ? string.substring(0, n16).trim() : string;
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                    string5 = string8;
                    try {
                        string7 = n16 != -1 ? string.substring(string.lastIndexOf(".")) : null;
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                    string4 = string7;
                    n14 = string5.lastIndexOf("(");
                    n13 = string5.lastIndexOf(")");
                    string3 = null;
                    n10 = null;
                    n12 = n14;
                    n11 = n13;
                    if (string6 != null) break block26;
                    try {
                        block34: {
                            if (n12 >= n11) break block27;
                            break block34;
                            catch (Throwable throwable) {
                                throw cz_0.a(throwable);
                            }
                        }
                        n12 = n13;
                        n11 = string5.length() - 1;
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                }
                if (n12 == n11) {
                    try {
                        string3 = string5.substring(0, n14);
                        Integer n17 = n10 = Integer.valueOf(Integer.parseInt(string5.substring(n14 + 1, n13)));
                        n10 = n10 + 1;
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
            }
            int n18 = 1;
            while (list.contains(string)) {
                String string9;
                StringBuilder stringBuilder;
                block31: {
                    block32: {
                        block29: {
                            Integer n19;
                            block30: {
                                try {
                                    try {
                                        try {
                                            string2 = string3;
                                            if (string6 != null) break block28;
                                            if (string2 == null) break block29;
                                        }
                                        catch (Throwable throwable) {
                                            throw cz_0.a(throwable);
                                        }
                                        n19 = n10;
                                        if (string6 != null) break block30;
                                    }
                                    catch (Throwable throwable) {
                                        throw cz_0.a(throwable);
                                    }
                                    if (n19 == null) break block29;
                                }
                                catch (Throwable throwable) {
                                    throw cz_0.a(throwable);
                                }
                                string = string3 + "(" + n10 + ")" + string4;
                                n19 = n10;
                            }
                            Integer n20 = n19;
                            n10 = n10 + 1;
                            if (string6 == null) continue;
                        }
                        try {
                            stringBuilder = new StringBuilder().append(string5).append("\u0000ERR:ArrayIndexOutOfBoundsException:Index 366 out of bounds for length 2").append(n18).append(")");
                            string9 = string4;
                            if (string6 != null) break block31;
                            if (string9 == null) break block32;
                        }
                        catch (Throwable throwable) {
                            throw cz_0.a(throwable);
                        }
                        string9 = string4;
                        break block31;
                    }
                    string9 = "";
                }
                string = stringBuilder.append(string9).toString();
                ++n18;
                if (string6 == null) continue;
            }
            string2 = string;
        }
        return string2;
    }

    public static List b(Object[] objectArray) {
        int n10;
        ArrayList<File> arrayList;
        ArrayList<File> arrayList2;
        String string = FV.D();
        try {
            ArrayList<File> arrayList3;
            arrayList2 = arrayList3;
            arrayList = arrayList3;
            n10 = objectArray != null ? objectArray.length : 0;
        }
        catch (RuntimeException runtimeException) {
            throw cz_0.a(runtimeException);
        }
        arrayList2(n10);
        ArrayList<File> arrayList4 = arrayList;
        for (Object e2 : arrayList4) {
            block7: {
                try {
                    boolean bl;
                    try {
                        bl = e2 instanceof File;
                        if (string != null || !bl) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    bl = arrayList4.add((File)e2);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            if (string == null) continue;
        }
        return arrayList4;
    }

    public static void D(Object[] objectArray) {
        Object[] objectArray2 = objectArray;
        int n10 = objectArray2.length;
        String string = FV.D();
        int n11 = 0;
        while (n11 < n10) {
            block5: {
                block6: {
                    Object object = objectArray2[n11];
                    try {
                        try {
                            if (string != null) break block5;
                            if (!(object instanceof File)) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        cz_0.H((File)object);
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                ++n11;
            }
            if (string == null) continue;
        }
    }

    public static void r(List list) {
        Iterator iterator = list.iterator();
        String string = FV.D();
        while (iterator.hasNext()) {
            block6: {
                Object e2;
                block5: {
                    Object e3 = iterator.next();
                    try {
                        try {
                            e2 = e3;
                            if (string != null) break block5;
                            if (!(e2 instanceof File)) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        e2 = e3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                cz_0.H((File)e2);
            }
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void H(File var0) {
        block29: {
            block33: {
                block32: {
                    block30: {
                        block31: {
                            block28: {
                                var1_1 = FV.D();
                                try {
                                    try {
                                        v0 = var0.exists();
                                        if (var1_1 != null) break block28;
                                        if (!v0) break block29;
                                    }
                                    catch (RuntimeException v1) {
                                        throw cz_0.a(v1);
                                    }
                                    v0 = var0.isFile();
                                }
                                catch (RuntimeException v2) {
                                    throw cz_0.a(v2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var1_1 != null) break block30;
                                            if (v0) {
                                            }
                                            ** GOTO lbl43
                                        }
                                        catch (RuntimeException v3) {
                                            throw cz_0.a(v3);
                                        }
                                        v4 = var0;
                                        if (var1_1 != null) break block31;
                                    }
                                    catch (RuntimeException v5) {
                                        throw cz_0.a(v5);
                                    }
                                    if (v4.delete()) break block29;
                                }
                                catch (RuntimeException v6) {
                                    throw cz_0.a(v6);
                                }
                                v4 = var0;
                            }
                            catch (RuntimeException v7) {
                                throw cz_0.a(v7);
                            }
                        }
                        try {
                            try {
                                v4.deleteOnExit();
                                if (var1_1 == null) break block29;
lbl43:
                                // 2 sources

                                v8 = var0;
                                if (var1_1 != null) break block32;
                            }
                            catch (RuntimeException v9) {
                                throw cz_0.a(v9);
                            }
                            v0 = v8.isDirectory();
                        }
                        catch (RuntimeException v10) {
                            throw cz_0.a(v10);
                        }
                    }
                    if (!v0) break block29;
                    v8 = var0;
                }
                for (File var5_5 : v8.listFiles()) {
                    try {
                        cz_0.H(var5_5);
                        if (var1_1 == null) {
                            if (var1_1 == null) continue;
                            break;
                        }
                        break block29;
                    }
                    catch (RuntimeException v11) {
                        throw cz_0.a(v11);
                    }
                }
                try {
                    try {
                        v12 = var0;
                        if (var1_1 != null) break block33;
                        if (v12.delete()) break block29;
                    }
                    catch (RuntimeException v13) {
                        throw cz_0.a(v13);
                    }
                    v12 = var0;
                }
                catch (RuntimeException v14) {
                    throw cz_0.a(v14);
                }
            }
            v12.deleteOnExit();
        }
    }

    public static void e(File file) {
        block10: {
            File file2;
            String string;
            block11: {
                boolean bl;
                block9: {
                    string = FV.D();
                    try {
                        try {
                            try {
                                bl = file.exists();
                                if (string != null) break block9;
                                if (!bl) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            file2 = file;
                            if (string != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl = file2.isDirectory();
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                if (!bl) break block10;
                file2 = file;
            }
            for (File file3 : file2.listFiles()) {
                cz_0.H(file3);
                if (string == null) continue;
            }
        }
    }

    public static V c(FileFilter fileFilter) {
        V v2;
        block8: {
            block7: {
                FileFilter fileFilter2;
                String string;
                block6: {
                    string = FV.D();
                    try {
                        try {
                            fileFilter2 = fileFilter;
                            if (string != null) break block6;
                            if (!(fileFilter2 instanceof V)) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        fileFilter2 = fileFilter;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                v2 = (V)fileFilter2;
                if (string == null) break block8;
            }
            v2 = new dt_0(DE.F.b(), i2_0.O("\u0000ERR:ArrayIndexOutOfBoundsException:Index 330 out of bounds for length 2"), fileFilter);
        }
        return v2;
    }

    public static V S(javax.swing.filechooser.FileFilter fileFilter) {
        V v2;
        block8: {
            block7: {
                javax.swing.filechooser.FileFilter fileFilter2;
                String string;
                block6: {
                    string = FV.D();
                    try {
                        try {
                            fileFilter2 = fileFilter;
                            if (string != null) break block6;
                            if (!(fileFilter2 instanceof V)) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        fileFilter2 = fileFilter;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                v2 = (V)fileFilter2;
                if (string == null) break block8;
            }
            v2 = new DZ(DE.F.b(), fileFilter.getDescription(), fileFilter);
        }
        return v2;
    }

    public static List F(Collection collection, V v2) {
        ArrayList<File> arrayList = new ArrayList<File>(collection.size());
        Iterator iterator = collection.iterator();
        String string = FV.D();
        while (iterator.hasNext()) {
            block5: {
                File file = (File)iterator.next();
                try {
                    boolean bl;
                    try {
                        bl = v2.accept(file);
                        if (string != null || !bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    bl = arrayList.add(file);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            if (string == null) continue;
        }
        return arrayList;
    }

    public static yt_0 p(File file, String string) {
        String string2;
        String string3;
        block6: {
            block4: {
                String string4;
                StringBuilder stringBuilder;
                block5: {
                    string3 = cz_0.X(file);
                    String string5 = FV.D();
                    try {
                        if (!file.isFile()) break block4;
                        stringBuilder = new StringBuilder().append(cz_0.n(file));
                        string4 = string;
                        if (string5 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    try {
                        string4 = string4 != null ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 348 out of bounds for length 2" + string + ")" : "";
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                string2 = stringBuilder.append(string4).toString();
                break block6;
            }
            string2 = null;
        }
        String string6 = string2;
        String string7 = cz_0.T(file);
        return new yt_0(string3, string6, string7, null);
    }

    public static String n(File file) {
        return cz_0.W(file.length());
    }

    public static String o(File file, int n10) {
        return cz_0.n(file.length(), n10);
    }

    public static String W(long l2) {
        return cz_0.n(l2, 2);
    }

    public static String n(long l2, int n10) {
        DecimalFormat decimalFormat;
        block26: {
            long l3;
            block25: {
                String string;
                block23: {
                    long l4;
                    block24: {
                        block21: {
                            block22: {
                                String string2;
                                DecimalFormat decimalFormat2;
                                DecimalFormat decimalFormat3;
                                string = FV.D();
                                try {
                                    DecimalFormat decimalFormat4;
                                    decimalFormat3 = decimalFormat4;
                                    decimalFormat2 = decimalFormat4;
                                    string2 = n10 == 0 ? "#" : "\u0000ERR:ArrayIndexOutOfBoundsException:Index 328 out of bounds for length 2" + cz_0.g(n10);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                decimalFormat3(string2);
                                decimalFormat = decimalFormat2;
                                try {
                                    try {
                                        long l5 = l2 - cz_0.b(9714, 4303420196688507716L);
                                        l3 = l5 == 0L ? (char)'\u0000' : (l5 < 0L ? (char)'\uffffffff' : '\u0001');
                                        if (string != null) break block21;
                                        if (l3 >= 0) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                    return decimalFormat.format(l2) + " " + i2_0.O("\u0000ERR:ArrayIndexOutOfBoundsException:Index 334 out of bounds for length 2");
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                            }
                            long l6 = l2 - cz_0.b(11996, 1273050218992810093L);
                            l3 = l6 == 0L ? (char)'\u0000' : (l6 < 0L ? (char)'\uffffffff' : '\u0001');
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (string != null) break block23;
                                        if (l3 < 0) break block24;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                    long l7 = l2 - cz_0.b(785, 7203795819345548708L);
                                    l3 = l7 == 0L ? (char)'\u0000' : (l7 < 0L ? (char)'\uffffffff' : '\u0001');
                                    if (string != null) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                if (l3 >= 0) break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            return decimalFormat.format((float)l2 / 1024.0f) + " " + i2_0.O("\u0000ERR:ArrayIndexOutOfBoundsException:Index 322 out of bounds for length 2");
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    l3 = (l4 = l2 - cz_0.b(8349, 1335978203410708010L)) == 0L ? (char)'\u0000' : (l4 < 0L ? (char)'\uffffffff' : '\u0001');
                }
                try {
                    try {
                        if (string != null) break block25;
                        if (l3 < 0) break block26;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    long l8 = l2 - cz_0.b(7785, 7155398347642505437L);
                    l3 = l8 == 0L ? (char)'\u0000' : (l8 < 0L ? (char)'\uffffffff' : '\u0001');
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            try {
                if (l3 < 0) {
                    return decimalFormat.format((float)l2 / 1048576.0f) + " " + i2_0.O("\u0000ERR:ArrayIndexOutOfBoundsException:Index 365 out of bounds for length 2");
                }
            }
            catch (RuntimeException runtimeException) {
                throw cz_0.a(runtimeException);
            }
        }
        return decimalFormat.format((float)l2 / 1.07374182E9f) + " " + i2_0.O("\u0000ERR:ArrayIndexOutOfBoundsException:Index 342 out of bounds for length 2");
    }

    private static String g(int n10) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2 = new StringBuilder(n10);
            String string = FV.D();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    stringBuilder = stringBuilder2.append("#");
                    if (string == null) {
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public static boolean A(String string, String string2) {
        return cz_0.I(string, string2, false);
    }

    public static boolean I(String string, String string2, boolean bl) {
        return cz_0.k(new File(string), new File(string2), bl);
    }

    public static boolean w(File file, File file2) {
        return cz_0.k(file, file2, false);
    }

    public static boolean k(File file, File file2, boolean bl) {
        boolean bl2;
        block37: {
            block38: {
                boolean bl3;
                block39: {
                    block40: {
                        boolean bl4;
                        block41: {
                            String string = FV.D();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                bl2 = file.exists();
                                                if (string != null) break block37;
                                                if (!bl2) break block38;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw cz_0.a(runtimeException);
                                            }
                                            bl2 = file.isDirectory();
                                            if (string != null) break block37;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw cz_0.a(runtimeException);
                                        }
                                        if (!bl2) break block38;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                    bl3 = cz_0.H(file2);
                                    if (string != null) break block39;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                if (!bl3) break block40;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            boolean bl5 = true;
                            File[] fileArray = file.listFiles();
                            int n10 = fileArray.length;
                            int n11 = 0;
                            while (n11 < n10) {
                                block47: {
                                    block48: {
                                        boolean bl6;
                                        block53: {
                                            boolean bl7;
                                            block52: {
                                                block51: {
                                                    block50: {
                                                        block42: {
                                                            String string2;
                                                            File file3;
                                                            block43: {
                                                                boolean bl8;
                                                                block49: {
                                                                    boolean bl9;
                                                                    block46: {
                                                                        block45: {
                                                                            block44: {
                                                                                file3 = fileArray[n11];
                                                                                string2 = file2.getAbsolutePath() + File.separator + file3.getName();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                bl4 = file3.isDirectory();
                                                                                                if (string != null) break block41;
                                                                                                if (string != null) break block42;
                                                                                            }
                                                                                            catch (RuntimeException runtimeException) {
                                                                                                throw cz_0.a(runtimeException);
                                                                                            }
                                                                                            if (!bl4) break block43;
                                                                                        }
                                                                                        catch (RuntimeException runtimeException) {
                                                                                            throw cz_0.a(runtimeException);
                                                                                        }
                                                                                        bl9 = cz_0.A(file3.getAbsolutePath(), string2);
                                                                                        if (string != null) break block44;
                                                                                    }
                                                                                    catch (RuntimeException runtimeException) {
                                                                                        throw cz_0.a(runtimeException);
                                                                                    }
                                                                                    if (!bl9) break block45;
                                                                                }
                                                                                catch (RuntimeException runtimeException) {
                                                                                    throw cz_0.a(runtimeException);
                                                                                }
                                                                                bl9 = bl5;
                                                                            }
                                                                            try {
                                                                                if (string != null) break block46;
                                                                                if (!bl9) break block45;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw cz_0.a(runtimeException);
                                                                            }
                                                                            bl9 = true;
                                                                            break block46;
                                                                        }
                                                                        bl9 = false;
                                                                    }
                                                                    bl5 = bl9;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (string != null) break block47;
                                                                                if (bl5) break block48;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw cz_0.a(runtimeException);
                                                                            }
                                                                            bl8 = bl;
                                                                            if (string != null) break block49;
                                                                        }
                                                                        catch (RuntimeException runtimeException) {
                                                                            throw cz_0.a(runtimeException);
                                                                        }
                                                                        if (!bl8) break block48;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw cz_0.a(runtimeException);
                                                                    }
                                                                    bl8 = false;
                                                                }
                                                                return bl8;
                                                            }
                                                            bl7 = cz_0.p(file3.getAbsolutePath(), string2);
                                                        }
                                                        try {
                                                            if (string != null) break block50;
                                                            if (!bl7) break block51;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw cz_0.a(runtimeException);
                                                        }
                                                        bl7 = bl5;
                                                    }
                                                    try {
                                                        if (string != null) break block52;
                                                        if (!bl7) break block51;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw cz_0.a(runtimeException);
                                                    }
                                                    bl7 = true;
                                                    break block52;
                                                }
                                                bl7 = false;
                                            }
                                            bl5 = bl7;
                                            try {
                                                try {
                                                    try {
                                                        if (string != null) break block47;
                                                        if (bl5) break block48;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw cz_0.a(runtimeException);
                                                    }
                                                    bl6 = bl;
                                                    if (string != null) break block53;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw cz_0.a(runtimeException);
                                                }
                                                if (!bl6) break block48;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw cz_0.a(runtimeException);
                                            }
                                            bl6 = false;
                                        }
                                        return bl6;
                                    }
                                    ++n11;
                                }
                                if (string == null) continue;
                            }
                            bl4 = bl5;
                        }
                        return bl4;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean p(String string, String string2) {
        String string3 = FV.D();
        try {
            boolean bl;
            block4: {
                block5: {
                    File file = new File(new File(string2).getParent());
                    try {
                        bl = cz_0.H(file);
                        if (string3 != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        throw cz_0.a(fileNotFoundException);
                    }
                    FileChannel fileChannel = new FileInputStream(string).getChannel();
                    FileChannel fileChannel2 = new FileOutputStream(string2).getChannel();
                    return cz_0.B(fileChannel, fileChannel2);
                }
                bl = false;
            }
            return bl;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
    }

    /*
     * Loose catch block
     */
    public static boolean v(File file, File file2) {
        boolean bl;
        block10: {
            block11: {
                String string;
                block14: {
                    string = FV.D();
                    bl = file.exists();
                    if (string != null) break block10;
                    if (!bl) break block11;
                    break block14;
                    catch (FileNotFoundException fileNotFoundException) {
                        throw cz_0.a(fileNotFoundException);
                    }
                }
                try {
                    block15: {
                        bl = file.isFile();
                        if (string != null) break block10;
                        break block15;
                        catch (FileNotFoundException fileNotFoundException) {
                            throw cz_0.a(fileNotFoundException);
                        }
                    }
                    if (!bl) break block11;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    throw cz_0.a(fileNotFoundException);
                }
                try {
                    boolean bl2;
                    block12: {
                        block13: {
                            File file3 = new File(file2.getParent());
                            try {
                                bl2 = cz_0.H(file3);
                                if (string != null) break block12;
                                if (!bl2) break block13;
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throw cz_0.a(fileNotFoundException);
                            }
                            FileChannel fileChannel = new FileInputStream(file).getChannel();
                            FileChannel fileChannel2 = new FileOutputStream(file2).getChannel();
                            return cz_0.B(fileChannel, fileChannel2);
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    return false;
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean B(FileChannel fileChannel, FileChannel fileChannel2) {
        try {
            fileChannel2.transferFrom(fileChannel, 0L, fileChannel.size());
            fileChannel.close();
            fileChannel2.close();
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static String R(Class clazz, String string) {
        return cz_0.y(clazz, string, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 350 out of bounds for length 2");
    }

    public static String y(Class clazz, String string, String string2) {
        try {
            return cz_0.y(clazz.getResourceAsStream(string), string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static String B(URL uRL) {
        return cz_0.E(uRL, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 350 out of bounds for length 2");
    }

    public static String E(URL uRL, String string) {
        try {
            return cz_0.y(uRL.openStream(), string);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static String g(File file) {
        return cz_0.r(file, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 344 out of bounds for length 2");
    }

    /*
     * Loose catch block
     */
    public static String r(File file, String string) {
        String string2 = FV.D();
        try {
            block10: {
                boolean bl;
                block11: {
                    File file2;
                    block9: {
                        try {
                            file2 = file;
                            if (string2 != null) break block9;
                            if (file2 == null) break block10;
                        }
                        catch (Throwable throwable) {
                            throw cz_0.a(throwable);
                        }
                        file2 = file;
                    }
                    bl = file2.exists();
                    if (string2 != null) break block11;
                    try {
                        block12: {
                            if (!bl) break block10;
                            break block12;
                            catch (Throwable throwable) {
                                throw cz_0.a(throwable);
                            }
                        }
                        bl = file.isFile();
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                }
                if (bl) {
                    return cz_0.y(new FileInputStream(file), string);
                }
            }
            return null;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static String W(InputStream inputStream) {
        return cz_0.y(inputStream, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 350 out of bounds for length 2");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static String y(InputStream inputStream, String string) {
        block14: {
            if (inputStream == null) break block14;
            String string2 = cz_0.H(new InputStreamReader(inputStream, string));
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return string2;
        }
        String string3 = null;
        try {
            inputStream.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return string3;
        catch (Throwable throwable) {
            try {
                String string4 = null;
                return string4;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static String H(Reader reader) {
        StringBuilder stringBuilder;
        block19: {
            int n10;
            String string;
            block18: {
                string = FV.D();
                if (reader != null) break block18;
                String string2 = "";
                try {
                    reader.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                return string2;
            }
            char[] cArray = new char[cz_0.a(22549, 5707338930402942341L)];
            StringBuilder stringBuilder2 = new StringBuilder();
            while ((n10 = reader.read(cArray, 0, cz_0.a(17321, 9043834275778545191L))) != -1) {
                try {
                    stringBuilder = stringBuilder2.append(cArray, 0, n10);
                    if (string == null) {
                        if (string == null) continue;
                        break;
                    }
                    break block19;
                }
                catch (IOException iOException) {
                    throw cz_0.a(iOException);
                }
            }
            stringBuilder = stringBuilder2;
        }
        String string = stringBuilder.toString();
        try {
            reader.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return string;
        catch (Throwable throwable) {
            try {
                String string3 = "";
                return string3;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                try {
                    reader.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    public static void T(String string, File file) {
        cz_0.N(string, file, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 350 out of bounds for length 2");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static void N(String string, File file, String string2) {
        block24: {
            PrintWriter printWriter;
            block22: {
                String string3;
                block20: {
                    boolean bl;
                    block21: {
                        block29: {
                            block28: {
                                string3 = FV.D();
                                bl = file.exists();
                                if (string3 != null) break block20;
                                if (!bl) break block21;
                                break block28;
                                catch (FileNotFoundException fileNotFoundException) {
                                    throw cz_0.a(fileNotFoundException);
                                }
                            }
                            bl = file.isDirectory();
                            if (string3 != null) break block20;
                            break block29;
                            catch (FileNotFoundException fileNotFoundException) {
                                throw cz_0.a(fileNotFoundException);
                            }
                        }
                        try {
                            block30: {
                                if (!bl) break block21;
                                break block30;
                                catch (FileNotFoundException fileNotFoundException) {
                                    throw cz_0.a(fileNotFoundException);
                                }
                            }
                            throw new RuntimeException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 331 out of bounds for length 2");
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            throw cz_0.a(fileNotFoundException);
                        }
                    }
                    bl = file.getParentFile().mkdirs();
                }
                PrintWriter printWriter2 = null;
                try {
                    printWriter2 = new PrintWriter(file, string2);
                    printWriter2.write(string);
                    printWriter = printWriter2;
                    if (string3 != null) break block22;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    PrintWriter printWriter3;
                    block23: {
                        ne_1.g(cz_0.class, fileNotFoundException);
                        printWriter3 = printWriter2;
                        if (string3 != null) break block23;
                        if (printWriter3 == null) break block24;
                        printWriter3 = printWriter2;
                    }
                    printWriter3.close();
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    PrintWriter printWriter4;
                    block25: {
                        ne_1.g(cz_0.class, unsupportedEncodingException);
                        printWriter4 = printWriter2;
                        if (string3 != null) break block25;
                        {
                            catch (Throwable throwable) {
                                block27: {
                                    PrintWriter printWriter5;
                                    block26: {
                                        try {
                                            printWriter5 = printWriter2;
                                            if (string3 != null) break block26;
                                            if (printWriter5 == null) break block27;
                                        }
                                        catch (FileNotFoundException fileNotFoundException) {
                                            throw cz_0.a(fileNotFoundException);
                                        }
                                        printWriter5 = printWriter2;
                                    }
                                    printWriter5.close();
                                }
                                throw throwable;
                            }
                        }
                        if (printWriter4 == null) break block24;
                        printWriter4 = printWriter2;
                    }
                    printWriter4.close();
                }
                if (printWriter == null) break block24;
                printWriter = printWriter2;
            }
            printWriter.close();
        }
    }

    public static List f(String string) {
        return cz_0.S(new File(string));
    }

    public static List S(File file) {
        return cz_0.P(file, "");
    }

    public static List P(File file, String string) {
        return cz_0.H(file, string, new ArrayList());
    }

    public static List H(File file, String string, List list) {
        File[] fileArray = file.listFiles();
        String string2 = FV.D();
        for (File file2 : fileArray) {
            File file3;
            block11: {
                boolean bl;
                block9: {
                    try {
                        try {
                            block10: {
                                try {
                                    try {
                                        bl = file2.isFile();
                                        if (string2 != null) break block9;
                                        if (!bl) break block10;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                    list.add(string + file2.getName());
                                    if (string2 == null) continue;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                            }
                            file3 = file2;
                            if (string2 != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl = file3.isDirectory();
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                if (!bl) continue;
                file3 = file2;
            }
            cz_0.H(file3, string + file2.getName() + File.separator, list);
            if (string2 == null) continue;
        }
        return list;
    }

    public static File v(String string, File file) {
        return cz_0.X(string, file, false, null, cz_0.a(25633, 2405070994529477035L), null);
    }

    public static File z(String string, File file, RP rP) {
        return cz_0.X(string, file, false, null, cz_0.a(17468, 2142237117939958176L), rP);
    }

    public static File h(String string, String string2, boolean bl, String string3, int n10) {
        return cz_0.X(string, new File(string2), bl, string3, n10, null);
    }

    public static File h(String string, String string2, boolean bl, String string3, int n10, RP rP) {
        return cz_0.X(string, new File(string2), bl, string3, n10, rP);
    }

    public static File U(String string, File file, boolean bl, String string2, int n10) {
        return cz_0.X(string, file, bl, string2, n10, null);
    }

    /*
     * Loose catch block
     */
    public static File X(String string, File file, boolean bl, String string2, int n10, RP rP) {
        String string3 = FV.D();
        try {
            block59: {
                RP rP2;
                block58: {
                    block54: {
                        int n11;
                        int n12;
                        FileOutputStream fileOutputStream;
                        Object object;
                        block53: {
                            block52: {
                                RP rP3;
                                block51: {
                                    URLConnection uRLConnection;
                                    block49: {
                                        block50: {
                                            RP rP4;
                                            block48: {
                                                block67: {
                                                    block47: {
                                                        block65: {
                                                            String string4;
                                                            block46: {
                                                                block45: {
                                                                    RP rP5;
                                                                    block44: {
                                                                        block43: {
                                                                            block62: {
                                                                                String string5;
                                                                                URL uRL;
                                                                                URL uRL2;
                                                                                try {
                                                                                    URL uRL3;
                                                                                    uRL2 = uRL3;
                                                                                    uRL = uRL3;
                                                                                    string5 = bl ? PK.w(string) : string;
                                                                                }
                                                                                catch (Throwable throwable) {
                                                                                    throw cz_0.a(throwable);
                                                                                }
                                                                                uRL2(string5);
                                                                                URL uRL4 = uRL;
                                                                                uRLConnection = EE.Z(uRL4);
                                                                                if (string3 != null) break block62;
                                                                                try {
                                                                                    block63: {
                                                                                        if (n10 == 0) break block43;
                                                                                        break block63;
                                                                                        catch (Throwable throwable) {
                                                                                            throw cz_0.a(throwable);
                                                                                        }
                                                                                    }
                                                                                    uRLConnection.setConnectTimeout(n10);
                                                                                }
                                                                                catch (Throwable throwable) {
                                                                                    throw cz_0.a(throwable);
                                                                                }
                                                                            }
                                                                            uRLConnection.setReadTimeout(n10);
                                                                        }
                                                                        try {
                                                                            rP5 = rP;
                                                                            if (string3 != null) break block44;
                                                                            if (rP5 == null) break block45;
                                                                        }
                                                                        catch (Throwable throwable) {
                                                                            throw cz_0.a(throwable);
                                                                        }
                                                                        rP5 = rP;
                                                                    }
                                                                    if (rP5.i()) {
                                                                        cz_0.H(file);
                                                                        return null;
                                                                    }
                                                                }
                                                                string4 = string2;
                                                                if (string3 != null) break block46;
                                                                try {
                                                                    block64: {
                                                                        if (string4 == null) break block47;
                                                                        break block64;
                                                                        catch (Throwable throwable) {
                                                                            throw cz_0.a(throwable);
                                                                        }
                                                                    }
                                                                    string4 = uRLConnection.getContentType();
                                                                }
                                                                catch (Throwable throwable) {
                                                                    throw cz_0.a(throwable);
                                                                }
                                                            }
                                                            object = string4;
                                                            if (string3 != null) break block65;
                                                            try {
                                                                block66: {
                                                                    if (((String)object).contains(string2)) break block47;
                                                                    break block66;
                                                                    catch (Throwable throwable) {
                                                                        throw cz_0.a(throwable);
                                                                    }
                                                                }
                                                                cz_0.H(file);
                                                            }
                                                            catch (Throwable throwable) {
                                                                throw cz_0.a(throwable);
                                                            }
                                                        }
                                                        return null;
                                                    }
                                                    rP4 = rP;
                                                    if (string3 != null) break block48;
                                                    if (rP4 == null) break block49;
                                                    break block67;
                                                    catch (Throwable throwable) {
                                                        throw cz_0.a(throwable);
                                                    }
                                                }
                                                try {
                                                    block68: {
                                                        rP.w(uRLConnection.getContentLength());
                                                        if (string3 != null) break block50;
                                                        break block68;
                                                        catch (Throwable throwable) {
                                                            throw cz_0.a(throwable);
                                                        }
                                                    }
                                                    rP4 = rP;
                                                }
                                                catch (Throwable throwable) {
                                                    throw cz_0.a(throwable);
                                                }
                                            }
                                            try {
                                                if (!rP4.i()) break block49;
                                                cz_0.H(file);
                                            }
                                            catch (Throwable throwable) {
                                                throw cz_0.a(throwable);
                                            }
                                        }
                                        return null;
                                    }
                                    object = uRLConnection.getInputStream();
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        rP3 = rP;
                                        if (string3 != null) break block51;
                                        if (rP3 == null) break block52;
                                    }
                                    catch (Throwable throwable) {
                                        throw cz_0.a(throwable);
                                    }
                                    rP3 = rP;
                                }
                                try {
                                    n12 = rP3.i();
                                    if (string3 != null) break block53;
                                    if (n12 == 0) break block52;
                                }
                                catch (Throwable throwable) {
                                    throw cz_0.a(throwable);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                ((InputStream)object).close();
                                cz_0.H(file);
                                return null;
                            }
                            n12 = cz_0.a(6356, 1909181917496417600L);
                        }
                        byte[] byArray = new byte[n12];
                        int n13 = 0;
                        while ((n11 = ((InputStream)object).read(byArray)) != -1) {
                            block57: {
                                block56: {
                                    RP rP6;
                                    block55: {
                                        rP2 = rP;
                                        if (string3 != null) break block54;
                                        try {
                                            block69: {
                                                if (string3 != null) break block55;
                                                break block69;
                                                catch (Throwable throwable) {
                                                    throw cz_0.a(throwable);
                                                }
                                            }
                                            if (rP2 == null) break block56;
                                        }
                                        catch (Throwable throwable) {
                                            throw cz_0.a(throwable);
                                        }
                                        n13 += n11;
                                        try {
                                            rP.F(n13);
                                            if (string3 != null) break block57;
                                            rP6 = rP;
                                        }
                                        catch (Throwable throwable) {
                                            throw cz_0.a(throwable);
                                        }
                                    }
                                    if (rP6.i()) {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        ((InputStream)object).close();
                                        cz_0.H(file);
                                        return null;
                                    }
                                }
                                fileOutputStream.write(byArray, 0, n11);
                            }
                            if (string3 == null) continue;
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        ((InputStream)object).close();
                        rP2 = rP;
                    }
                    try {
                        if (string3 != null) break block58;
                        if (rP2 == null) break block59;
                    }
                    catch (Throwable throwable) {
                        throw cz_0.a(throwable);
                    }
                    rP2 = rP;
                }
                rP2.X(file);
            }
            return file;
        }
        catch (Throwable throwable) {
            block61: {
                RP rP7;
                block60: {
                    try {
                        rP7 = rP;
                        if (string3 != null) break block60;
                        if (rP7 == null) break block61;
                    }
                    catch (Throwable throwable2) {
                        throw cz_0.a(throwable2);
                    }
                    rP7 = rP;
                }
                rP7.n(throwable);
            }
            return null;
        }
    }

    public static int j(String string) {
        try {
            return cz_0.t(new URL(string));
        }
        catch (Throwable throwable) {
            ne_1.g(cz_0.class, throwable);
            return -1;
        }
    }

    public static int t(URL uRL) {
        try {
            URLConnection uRLConnection = EE.Z(uRL);
            return uRLConnection.getContentLength();
        }
        catch (Throwable throwable) {
            ne_1.g(cz_0.class, throwable);
            return -1;
        }
    }

    public static List R(String string, List list) {
        return cz_0.W(new File(string), list);
    }

    public static List W(File file, List list) {
        return cz_0.u(file, list, true);
    }

    public static List J(String string, List list, boolean bl) {
        return cz_0.u(new File(string), list, bl);
    }

    public static List u(File file, List list, boolean bl) {
        return cz_0.G(file, list, bl, null);
    }

    public static List y(String string, List list, boolean bl, List list2) {
        return cz_0.G(new File(string), list, bl, list2);
    }

    public static List G(File file, List list, boolean bl, List list2) {
        return cz_0.r(file, new CP(list, bl), list2);
    }

    public static List X(String string, FileFilter fileFilter) {
        return cz_0.T(new File(string), fileFilter);
    }

    public static List T(File file, FileFilter fileFilter) {
        return cz_0.r(file, fileFilter, null);
    }

    public static List O(String string, FileFilter fileFilter, List list) {
        return cz_0.r(new File(string), fileFilter, list);
    }

    public static List r(File file, FileFilter fileFilter, List arrayList) {
        block16: {
            File file2;
            String string;
            block17: {
                boolean bl;
                block15: {
                    string = FV.D();
                    if (arrayList == null) {
                        arrayList = new ArrayList<File>();
                    }
                    try {
                        try {
                            try {
                                bl = file.exists();
                                if (string != null) break block15;
                                if (!bl) break block16;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            file2 = file;
                            if (string != null) break block17;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        bl = file2.isDirectory();
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                if (!bl) break block16;
                file2 = file;
            }
            for (File file3 : file2.listFiles()) {
                File file4;
                block20: {
                    boolean bl;
                    block18: {
                        block19: {
                            try {
                                try {
                                    bl = fileFilter.accept(file3);
                                    if (string != null) break block18;
                                    if (!bl) break block19;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                arrayList.add(file3);
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        try {
                            file4 = file3;
                            if (string != null) break block20;
                            bl = file4.isDirectory();
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    if (!bl) continue;
                    file4 = file3;
                }
                cz_0.r(file4, fileFilter, arrayList);
                if (string == null) continue;
            }
        }
        return arrayList;
    }

    public static boolean W(String string) {
        return cz_0.H(new File(string));
    }

    public static boolean H(File file) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    String string = FV.D();
                    try {
                        try {
                            try {
                                bl = file.exists();
                                if (string != null) break block6;
                                if (bl) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            bl = file.mkdirs();
                            if (string != null) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                        if (!bl) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public static void e() {
        K.clear();
    }

    public static void V(String string) {
        K.remove(string);
    }

    public static boolean t(File file) {
        boolean bl;
        String string;
        block4: {
            block5: {
                string = file.getAbsolutePath();
                String string2 = FV.D();
                try {
                    try {
                        bl = K.containsKey(string);
                        if (string2 != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return (Boolean)K.get(string);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            bl = W.isDrive(file);
        }
        boolean bl2 = bl;
        K.put(string, bl2);
        return bl2;
    }

    public static void n() {
        x.clear();
    }

    public static void q(String string) {
        x.remove(string);
    }

    public static boolean o(File file) {
        boolean bl;
        String string;
        block4: {
            block5: {
                string = file.getAbsolutePath();
                String string2 = FV.D();
                try {
                    try {
                        bl = x.containsKey(string);
                        if (string2 != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return (Boolean)x.get(string);
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            bl = W.isComputerNode(file);
        }
        boolean bl2 = bl;
        x.put(string, bl2);
        return bl2;
    }

    public static void N() {
        j.clear();
    }

    public static void E(String string) {
        j.remove(string);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean I(File var0) {
        block40: {
            block34: {
                block37: {
                    block39: {
                        block38: {
                            block36: {
                                block35: {
                                    block33: {
                                        block32: {
                                            block31: {
                                                var2_1 = var0.getAbsolutePath();
                                                var1_2 = FV.D();
                                                try {
                                                    try {
                                                        v0 = cz_0.j.containsKey(var2_1);
                                                        if (var1_2 != null) break block31;
                                                        if (!v0) break block32;
                                                    }
                                                    catch (RuntimeException v1) {
                                                        throw cz_0.a(v1);
                                                    }
                                                    v0 = (Boolean)cz_0.j.get(var2_1);
                                                }
                                                catch (RuntimeException v2) {
                                                    throw cz_0.a(v2);
                                                }
                                            }
                                            return v0;
                                        }
                                        try {
                                            try {
                                                v3 = var0.getParent();
                                                if (var1_2 != null) break block33;
                                                if (v3 != null) break block34;
                                            }
                                            catch (RuntimeException v4) {
                                                throw cz_0.a(v4);
                                            }
                                            v3 = cz_0.T(var0);
                                        }
                                        catch (RuntimeException v5) {
                                            throw cz_0.a(v5);
                                        }
                                    }
                                    var4_3 = v3;
                                    try {
                                        v6 = var4_3;
                                        if (var1_2 != null) break block35;
                                        if (v6 != null) {
                                        }
                                        ** GOTO lbl43
                                    }
                                    catch (RuntimeException v7) {
                                        throw cz_0.a(v7);
                                    }
                                    var5_4 = var4_3.toLowerCase();
                                    try {
                                        if (var1_2 == null) break block36;
lbl43:
                                        // 2 sources

                                        v6 = var0.getName();
                                    }
                                    catch (RuntimeException v8) {
                                        throw cz_0.a(v8);
                                    }
                                }
                                var5_4 = v6;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v9 = var5_4.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 346 out of bounds for length 2");
                                                        if (var1_2 != null) break block37;
                                                        if (v9) break block38;
                                                    }
                                                    catch (RuntimeException v10) {
                                                        throw cz_0.a(v10);
                                                    }
                                                    v9 = var5_4.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 339 out of bounds for length 2");
                                                    if (var1_2 != null) break block37;
                                                }
                                                catch (RuntimeException v11) {
                                                    throw cz_0.a(v11);
                                                }
                                                if (v9) break block38;
                                            }
                                            catch (RuntimeException v12) {
                                                throw cz_0.a(v12);
                                            }
                                            v9 = var5_4.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 326 out of bounds for length 2");
                                            if (var1_2 != null) break block37;
                                        }
                                        catch (RuntimeException v13) {
                                            throw cz_0.a(v13);
                                        }
                                        if (v9) break block38;
                                    }
                                    catch (RuntimeException v14) {
                                        throw cz_0.a(v14);
                                    }
                                    v9 = var5_4.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 338 out of bounds for length 2");
                                    if (var1_2 != null) break block37;
                                }
                                catch (RuntimeException v15) {
                                    throw cz_0.a(v15);
                                }
                                if (!v9) break block39;
                            }
                            catch (RuntimeException v16) {
                                throw cz_0.a(v16);
                            }
                        }
                        v9 = true;
                        break block37;
                    }
                    v9 = var3_5 = false;
                }
                if (var1_2 == null) break block40;
            }
            var3_5 = false;
        }
        cz_0.j.put(var2_1, var3_5);
        return var3_5;
    }

    public static void g() {
        w.clear();
    }

    public static void p(String string) {
        w.remove(string);
    }

    public static boolean V(File file) {
        boolean bl;
        block7: {
            block8: {
                String string = FV.D();
                try {
                    if (file == null) {
                        return false;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                try {
                    try {
                        bl = w.containsKey(file.getAbsolutePath());
                        if (string != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return (Boolean)w.get(file.getAbsolutePath());
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            bl = file.isFile();
        }
        boolean bl2 = bl;
        w.put(file.getAbsolutePath(), bl2);
        return bl2;
    }

    public static void O() {
        M.clear();
    }

    public static void s(String string) {
        M.remove(string);
    }

    public static boolean z(File file) {
        boolean bl;
        block7: {
            block8: {
                String string = FV.D();
                try {
                    if (file == null) {
                        return false;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                try {
                    try {
                        bl = M.containsKey(file.getAbsolutePath());
                        if (string != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    return (Boolean)M.get(file.getAbsolutePath());
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            bl = file.isDirectory();
        }
        boolean bl2 = bl;
        M.put(file.getAbsolutePath(), bl2);
        return bl2;
    }

    public static void l() {
        E.clear();
    }

    public static void G(String string) {
        E.remove(string);
    }

    public static boolean v(File file) {
        boolean bl;
        block15: {
            block14: {
                File file2;
                String string;
                block13: {
                    block12: {
                        boolean bl2;
                        block11: {
                            string = FV.D();
                            try {
                                if (file == null) {
                                    return false;
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            try {
                                try {
                                    bl2 = E.containsKey(file.getAbsolutePath());
                                    if (string != null) break block11;
                                    if (!bl2) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                bl2 = (Boolean)E.get(file.getAbsolutePath());
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        return bl2;
                    }
                    file = file.getAbsoluteFile();
                    try {
                        file2 = file.getParentFile();
                        if (string != null) break block13;
                        if (file2 == null) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    file2 = file;
                }
                try {
                    bl = file2.isHidden();
                    if (string != null) break block15;
                    if (!bl) break block14;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
                bl = true;
                break block15;
            }
            bl = false;
        }
        boolean bl3 = bl;
        E.put(file.getAbsolutePath(), bl3);
        return bl3;
    }

    public static void j() {
        Y.clear();
    }

    public static void j(String string) {
        Y.remove(string);
    }

    public static yt_0 t(File file, String string) {
        block5: {
            String string2;
            Map map;
            block4: {
                String string3 = FV.D();
                try {
                    try {
                        map = Y;
                        string2 = file.getAbsolutePath();
                        if (string3 != null) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    map = Y;
                    string2 = file.getAbsolutePath();
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            return (yt_0)map.get(string2);
        }
        yt_0 yt_02 = cz_0.p(file, string);
        Y.put(file.getAbsolutePath(), yt_02);
        return yt_02;
    }

    public static void R() {
        A.clear();
    }

    public static void W(String string) {
        A.remove(string);
    }

    public static String X(File file) {
        String string;
        block16: {
            String string2;
            String string3;
            block17: {
                String string4;
                block14: {
                    String string5;
                    block13: {
                        String string6;
                        Map map;
                        block12: {
                            string3 = file.getAbsolutePath();
                            string5 = FV.D();
                            try {
                                try {
                                    map = A;
                                    string6 = string3;
                                    if (string5 != null) break block12;
                                    if (!map.containsKey(string6)) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                map = A;
                                string6 = string3;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        return (String)map.get(string6);
                    }
                    string2 = W.getSystemDisplayName(file);
                    try {
                        block15: {
                            try {
                                try {
                                    try {
                                        string4 = string2;
                                        if (string5 != null) break block14;
                                        if (string4 == null) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cz_0.a(runtimeException);
                                    }
                                    string = string2.trim();
                                    if (string5 != null) break block16;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                if (!string.equals("")) break block17;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        string4 = cz_0.T(file);
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                }
                string2 = string4;
            }
            A.put(string3, string2);
            string = string2;
        }
        return string;
    }

    public static void V() {
        e.clear();
    }

    public static void A(String string) {
        e.remove(string);
    }

    public static String w(File file) {
        String string;
        block5: {
            String string2;
            Map map;
            block4: {
                string = file.getAbsolutePath();
                String string3 = FV.D();
                try {
                    try {
                        map = e;
                        string2 = string;
                        if (string3 != null) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    map = e;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            return (String)map.get(string2);
        }
        String string4 = k.format(new Date(file.lastModified()));
        e.put(string, string4);
        return string4;
    }

    public static void X() {
        N.clear();
    }

    public static void c(String string) {
        N.remove(string);
    }

    public static String F(File file) {
        String string;
        block5: {
            String string2;
            Map map;
            block4: {
                string = file.getAbsolutePath();
                String string3 = FV.D();
                try {
                    try {
                        map = N;
                        string2 = string;
                        if (string3 != null) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    map = N;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            return (String)map.get(string2);
        }
        String string4 = k.format(new Date(file.lastModified()));
        N.put(string, string4);
        return string4;
    }

    public static void k() {
        f.clear();
    }

    public static void C(String string) {
        f.remove(string);
    }

    public static String T(File file) {
        String string;
        block11: {
            String string2;
            Map map;
            block10: {
                File file2;
                String string3;
                block8: {
                    block9: {
                        string3 = FV.D();
                        try {
                            try {
                                file2 = file;
                                if (string3 != null) break block8;
                                if (file2 != null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                            return "";
                        }
                        catch (RuntimeException runtimeException) {
                            throw cz_0.a(runtimeException);
                        }
                    }
                    file2 = file;
                }
                string = file2.getAbsolutePath();
                try {
                    try {
                        map = f;
                        string2 = string;
                        if (string3 != null) break block10;
                        if (!map.containsKey(string2)) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    map = f;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            return (String)map.get(string2);
        }
        String string4 = W.getSystemTypeDescription(file);
        f.put(string, string4);
        return string4;
    }

    public static ImageIcon C() {
        return p;
    }

    public static ImageIcon B(File file) {
        return cz_0.U(file, false);
    }

    public static ImageIcon U(File file, boolean bl) {
        return cz_0.q(file, bl);
    }

    public static ImageIcon q(File file, boolean bl) {
        return cz_0.a(file, bl, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static ImageIcon a(File var0, boolean var1_1, boolean var2_2) {
        block66: {
            block65: {
                block61: {
                    block60: {
                        block58: {
                            block59: {
                                block54: {
                                    block55: {
                                        block63: {
                                            block57: {
                                                block56: {
                                                    block53: {
                                                        block51: {
                                                            block52: {
                                                                var3_3 = FV.D();
                                                                v0 = var0;
                                                                if (var3_3 != null) break block51;
                                                                try {
                                                                    block62: {
                                                                        if (v0 != null) break block52;
                                                                        break block62;
                                                                        catch (RuntimeException v1) {
                                                                            throw cz_0.a(v1);
                                                                        }
                                                                    }
                                                                    return null;
                                                                }
                                                                catch (RuntimeException v2) {
                                                                    throw cz_0.a(v2);
                                                                }
                                                            }
                                                            v0 = var0;
                                                        }
                                                        try {
                                                            v3 = cz_0.z(v0);
                                                            if (var3_3 != null) break block53;
                                                            if (!v3) {
                                                            }
                                                            ** GOTO lbl36
                                                        }
                                                        catch (RuntimeException v4) {
                                                            throw cz_0.a(v4);
                                                        }
                                                        var4_4 = cz_0.G(var0.getName(), false).trim().toLowerCase();
                                                        try {
                                                            v5 = var4_4.trim().equals("");
                                                            if (var3_3 != null) break block54;
                                                            if (!v5) break block55;
                                                        }
                                                        catch (RuntimeException v6) {
                                                            throw cz_0.a(v6);
                                                        }
                                                        var4_4 = var0.getAbsolutePath();
                                                        try {
                                                            if (var3_3 == null) break block55;
lbl36:
                                                            // 2 sources

                                                            v3 = cz_0.I(var0);
                                                        }
                                                        catch (RuntimeException v7) {
                                                            throw cz_0.a(v7);
                                                        }
                                                    }
                                                    try {
                                                        if (var3_3 != null) break block56;
                                                        if (v3) {
                                                        }
                                                        ** GOTO lbl51
                                                    }
                                                    catch (RuntimeException v8) {
                                                        throw cz_0.a(v8);
                                                    }
                                                    var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 333 out of bounds for length 2";
                                                    try {
                                                        if (var3_3 == null) break block55;
lbl51:
                                                        // 2 sources

                                                        v3 = cz_0.t(var0);
                                                    }
                                                    catch (RuntimeException v9) {
                                                        throw cz_0.a(v9);
                                                    }
                                                }
                                                try {
                                                    if (var3_3 != null) break block57;
                                                    if (v3) {
                                                    }
                                                    ** GOTO lbl66
                                                }
                                                catch (RuntimeException v10) {
                                                    throw cz_0.a(v10);
                                                }
                                                var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 343 out of bounds for length 2";
                                                try {
                                                    if (var3_3 == null) break block55;
lbl66:
                                                    // 2 sources

                                                    v3 = cz_0.o(var0);
                                                }
                                                catch (RuntimeException v11) {
                                                    throw cz_0.a(v11);
                                                }
                                            }
                                            if (!v3) break block63;
                                            var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 337 out of bounds for length 2";
                                            if (var3_3 == null) break block55;
                                        }
                                        var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 332 out of bounds for length 2";
                                    }
                                    v5 = cz_0.v(var0);
                                }
                                try {
                                    v12 = v5 != false ? 0.5f : 1.0f;
                                }
                                catch (RuntimeException v13) {
                                    throw cz_0.a(v13);
                                }
                                var5_5 = v12;
                                var6_6 = cz_0.J(var4_4, var1_1, var5_5, var2_2);
                                var8_7 = cz_0.z;
                                synchronized (var8_7) {
                                    var7_8 = cz_0.D.containsKey(var6_6);
                                }
                                try {
                                    v14 = var7_8;
                                    if (var3_3 != null) break block58;
                                    if (!v14) break block59;
                                }
                                catch (RuntimeException v15) {
                                    throw cz_0.a(v15);
                                }
                                var8_7 = cz_0.z;
                                synchronized (var8_7) {
                                    return (ImageIcon)cz_0.D.get(var6_6);
                                }
                            }
                            v14 = var1_1;
                        }
                        var8_7 = cz_0.a(v14, var4_4, var5_5);
                        v16 = var8_7;
                        if (var3_3 != null) break block60;
                        try {
                            block64: {
                                if (v16 != null) break block61;
                                break block64;
                                catch (RuntimeException v17) {
                                    throw cz_0.a(v17);
                                }
                            }
                            v16 = cz_0.a(var1_1, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 325 out of bounds for length 2", var5_5);
                        }
                        catch (RuntimeException v18) {
                            throw cz_0.a(v18);
                        }
                    }
                    var8_7 = v16;
                }
                if (!var2_2) break block65;
                var9_10 = cz_0.z;
                synchronized (var9_10) {
                    cz_0.D.put(var6_6, var8_7);
                }
                if (var3_3 == null) break block66;
            }
            var9_10 = cz_0.z;
            synchronized (var9_10) {
                cz_0.D.put(cz_0.J(var4_4, var1_1, var5_5, true), var8_7);
            }
            var8_7 = xg_0.J((ImageIcon)var8_7);
            var9_10 = cz_0.z;
            synchronized (var9_10) {
                cz_0.D.put(var6_6, var8_7);
            }
        }
        return var8_7;
    }

    private static String J(String string, boolean bl, float f10, boolean bl2) {
        return string + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 351 out of bounds for length 2" + bl + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 351 out of bounds for length 2" + f10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 351 out of bounds for length 2" + bl2;
    }

    public static ImageIcon a(boolean bl, String string, float f10) {
        String string2;
        StringBuilder stringBuilder;
        Class<cz_0> clazz;
        block4: {
            block5: {
                String string3 = FV.D();
                try {
                    try {
                        clazz = cz_0.class;
                        stringBuilder = new StringBuilder();
                        string2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 367 out of bounds for length 2";
                        if (string3 != null) break block4;
                        stringBuilder = stringBuilder.append(string2);
                        if (!bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    string2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 349 out of bounds for length 2";
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw cz_0.a(runtimeException);
                }
            }
            string2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 324 out of bounds for length 2";
        }
        return cz_0.D(clazz, stringBuilder.append(string2).append("\u0000ERR:ArrayIndexOutOfBoundsException:Index 329 out of bounds for length 2").append(string).append("\u0000ERR:ArrayIndexOutOfBoundsException:Index 321 out of bounds for length 2").toString(), f10);
    }

    public static ImageIcon m(Class clazz, String string) {
        return cz_0.D(clazz, string, 1.0f);
    }

    public static ImageIcon D(Class clazz, String string, float f10) {
        ImageIcon imageIcon;
        block10: {
            String string2;
            block11: {
                block12: {
                    String string3;
                    block9: {
                        String string4;
                        Map map;
                        block8: {
                            string2 = clazz.getCanonicalName() + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 347 out of bounds for length 2" + string + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 351 out of bounds for length 2" + f10;
                            string3 = FV.D();
                            try {
                                try {
                                    map = S;
                                    string4 = string2;
                                    if (string3 != null) break block8;
                                    if (!map.containsKey(string4)) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cz_0.a(runtimeException);
                                }
                                map = S;
                                string4 = string2;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cz_0.a(runtimeException);
                            }
                        }
                        return (ImageIcon)map.get(string4);
                    }
                    URL uRL = clazz.getResource(string);
                    if (uRL == null) break block12;
                    imageIcon = new ImageIcon(uRL);
                    try {
                        if (string3 != null) break block10;
                        if (!(f10 < 1.0f)) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cz_0.a(runtimeException);
                    }
                    imageIcon = xg_0.f(imageIcon, f10);
                    if (string3 == null) break block11;
                }
                imageIcon = null;
            }
            S.put(string2, imageIcon);
        }
        return imageIcon;
    }

    public static WC l(File file, o3_0 o3_02) {
        return cz_0.S(file, o3_02, cz_0.b(3860, 1688288127278619044L));
    }

    public static WC S(File file, o3_0 o3_02, long l2) {
        WC wC = new WC("\u0000ERR:ArrayIndexOutOfBoundsException:Index 327 out of bounds for length 2" + file.getName(), l2, 0L);
        wC.q(new rk_1(file, o3_02, wC));
        wC.O(true);
        return wC;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[35];
                                var19_1 = 0;
                                var18_2 = "W\u00ff;\u0012\u00edrR7\u001d\"x6\u00ee\u0014 U\u00fd\u0090fP\u00c3}\b\u00d3&>\u0094\u0019P\u00d1\u0095\u0006b\u00e8\u009e'O=)\u008e\u00de\u0099\u001a\u008bi\u00e4\\\u00dfv\u00a9\u009b\u00b0\u00eai\u0087r;\u00ba\u0014?\u00e6\u00ed\u0083\u00bb\u008fh\u00e9\u00b7n\u0096\u0085\u00e9ph\u00fb\u00a8\u008dM3\u0002\u0019\u0011b\u00cd5\u00eeb\u0006>!\u0015\u00d9u\u00d7\u0094\u0082\u00c1\u00c0l\u00e7\u0091\u00da\u00f0\u0097x\u00b9\u0010\u00f16\u0089\u00dc\bf\u0015\u00be|\u00d1\u00c7\u0098q\u00d9\u00ba\u0085\u0002z\u00ff\u000f\u00db\u0018\u008d\u00feh!\u00e3\u0001@\u0012\u00be.}l\u0015\u0007Lm\u00c6\u00bdi\u001d\u00d0\u0004\u007f/=\u0018\u0002\u0014\u00d4\u0011c\u00fd\u00b0\u00c6g2\u0090e,\u0097v\u009c\u0093G\u00b7\u00a7\u00f2\u0013Z\u0005\u00a4\u00d9\u00c3\u00ff\u00a3\u008d\u0095cO\u00bb\u0010M\u00db\u00ebt\u0003\u001f\u0004\u00db\u0015\u00eag\u0003\u00f0\u000b\u00db\u0004D$\u00e6$\u0005\u00db\u00b3\u00d6Yt\u0002p\u00f2\u0002\u008f{\u0004\u0084\u00e7\u00fe\\\u0002\f\u00c1\u000e#\u007f!\u001f\u00aa\u0084iD\u00b8\u001aA\u00ff|\u00dd\u0005\u00cc\u00874\u00df(\u0005\u00f4\u00c9\u000b\u00afX\u0013\u008c\u0088~h\u0098\u00c9\u00c8K\u00f8\u00bb\u00e2\u00a0\u00a5.m\u0087\u00a2\u0082\u00c5\b\u0095\u00a0\u0018\u00a7\u00fc\u00ef\u00a5\u00d9\u0012\u00e2\u00e4c!\u0085\u00ebvf\u00cf*\u0090W\u00ef\u00da\u00a4t\u0005K\u0003\u00c9\u000b\u00a1\u0006L\u0098\u00c6\\z\u008d\b}\u00c6\u00d9\u00f6\u0096\u0097\u00d4\u00c4\t\u0091\u00a1\u0098\u0087\u00ec\u00e7\u00a1J\u00b0\u0011\u00b4\u00e9\u00a9\u0080\u00dc\u00df[\u00f7\u00b5\u00f8\u00fe\u00bdV}^=S";
                                var20_3 = "W\u00ff;\u0012\u00edrR7\u001d\"x6\u00ee\u0014 U\u00fd\u0090fP\u00c3}\b\u00d3&>\u0094\u0019P\u00d1\u0095\u0006b\u00e8\u009e'O=)\u008e\u00de\u0099\u001a\u008bi\u00e4\\\u00dfv\u00a9\u009b\u00b0\u00eai\u0087r;\u00ba\u0014?\u00e6\u00ed\u0083\u00bb\u008fh\u00e9\u00b7n\u0096\u0085\u00e9ph\u00fb\u00a8\u008dM3\u0002\u0019\u0011b\u00cd5\u00eeb\u0006>!\u0015\u00d9u\u00d7\u0094\u0082\u00c1\u00c0l\u00e7\u0091\u00da\u00f0\u0097x\u00b9\u0010\u00f16\u0089\u00dc\bf\u0015\u00be|\u00d1\u00c7\u0098q\u00d9\u00ba\u0085\u0002z\u00ff\u000f\u00db\u0018\u008d\u00feh!\u00e3\u0001@\u0012\u00be.}l\u0015\u0007Lm\u00c6\u00bdi\u001d\u00d0\u0004\u007f/=\u0018\u0002\u0014\u00d4\u0011c\u00fd\u00b0\u00c6g2\u0090e,\u0097v\u009c\u0093G\u00b7\u00a7\u00f2\u0013Z\u0005\u00a4\u00d9\u00c3\u00ff\u00a3\u008d\u0095cO\u00bb\u0010M\u00db\u00ebt\u0003\u001f\u0004\u00db\u0015\u00eag\u0003\u00f0\u000b\u00db\u0004D$\u00e6$\u0005\u00db\u00b3\u00d6Yt\u0002p\u00f2\u0002\u008f{\u0004\u0084\u00e7\u00fe\\\u0002\f\u00c1\u000e#\u007f!\u001f\u00aa\u0084iD\u00b8\u001aA\u00ff|\u00dd\u0005\u00cc\u00874\u00df(\u0005\u00f4\u00c9\u000b\u00afX\u0013\u008c\u0088~h\u0098\u00c9\u00c8K\u00f8\u00bb\u00e2\u00a0\u00a5.m\u0087\u00a2\u0082\u00c5\b\u0095\u00a0\u0018\u00a7\u00fc\u00ef\u00a5\u00d9\u0012\u00e2\u00e4c!\u0085\u00ebvf\u00cf*\u0090W\u00ef\u00da\u00a4t\u0005K\u0003\u00c9\u000b\u00a1\u0006L\u0098\u00c6\\z\u008d\b}\u00c6\u00d9\u00f6\u0096\u0097\u00d4\u00c4\t\u0091\u00a1\u0098\u0087\u00ec\u00e7\u00a1J\u00b0\u0011\u00b4\u00e9\u00a9\u0080\u00dc\u00df[\u00f7\u00b5\u00f8\u00fe\u00bdV}^=S".length();
                                var17_4 = 3;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 109;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u008f-\u0013\u001a\u00f4\u0017\\\u000e\u00f4\u00a1Wn\u0083\u008b\u001c3\u0002\u0004\u00b94\u00f4\u00ac";
                                    var20_3 = "\u008f-\u0013\u001a\u00f4\u0017\\\u000e\u00f4\u00a1Wn\u0083\u008b\u001c3\u0002\u0004\u00b94\u00f4\u00ac".length();
                                    var17_4 = 2;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 81;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 94;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 64;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 31;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 20;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 59;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 1;
                                            break;
                                        }
                                        default: {
                                            v15 = 31;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl85:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl95:
                                // 1 sources

                                ** continue;
                            }
                        }
                        cz_0.a = var21;
                        cz_0.b = new String[35];
                        var8_7 = 6012521551019362092L;
                        var14_8 = new long[61];
                        var11_9 = 0;
                        var12_10 = "\u0085<*\u0090\u00c8\\\u0080\u00eb\u001a\u00bfjFy\u009b\u001e\u0004\u00ba\u00d1#\u0098\u00edV\u00fd\u00d1WDE\u00ff\u00a0j=\u00ef\u00e5\u000fK!\u0019]\u00b1Ti\u001b\u008c\u0010\u00aec\u00d0\u00a3\u008a\u00c2\u00dc\u00d2\u00d5\u00dc\u00855\u00ee\u007f\u00cd\u00caRZ\u00e7\u0017\u0014\u00a5}\u0014\u0001\u00c2\u00f4\u00ea5\u00d1\u00c0\u00d5}\u008e\u00c2\u0005N\u0000\u00c6=\u00ef\u00d7\u00d8T\u0017d\u00cc\u00e8\u00bc\u00d8\u00a3[\u00f7\u00a9.G\t\u00de\u00a3\u00ca\u0016'K\u00ba;a\u0002\u0092^\u00c7\u00a9\u00c4\u0085+t\u0080k\u00e3\u00a9\u0005\u0099+\u00cb;\u00c1\u008f\u00bf\u0085\u0081\u00d9\u009a\u00ca\u001a\u00a1\u00fe\u0019\u00f7\u00a3q\u00921\u00a3\u00d1>o\u00ecd/rG\u00ea\u00cet\u008f\r\u008cX\u00a3\u0011\u00d6\u00a2\u009a\u00c7\u00ec\u0014g#\u00e8j\u009b\u00b6C\u00cc\u00e2F\u0001[x#\u00e4qF/z\u00ea\u0087\u00a6T\u00ed\f\u009ad\u0097\u00d8\u00af\u0000M\f\u00ecb\u0019\u000f\u00f8\u00d5\u00f6\u009d.\u009f\u00d6oo\u00bb\u00ae\u00bd\u0019Q[`2\u0089U\u00ba0:\u00ca\u00a6c\u009b\u0080\u0007\u00e89\u00c6l\u00c9Y\nQ3\u008dM\u000ed\u009ce3\u0010\u0017N\u0014\u00b1o\u000ee\u0083\u0092.fzK'W\u00c5\u00e5\u00a1\u00ccH\u0084\u00ac0g\u00a6\u009c\u00e2Ew@9\u001e\u00fc\u00a7i0\u00b7y\u00df\u00af>q\u00ce\u009d\u008e:\u009bU\u001f\u00be\u0012\u00c8\u00ae\u008aE\u00a1\u00e8\u00a0eh\u0083\u001c|8{\u00f7b/\u00b5\u00f4A\u00d6`ad\u00a4Z\u00a8\u00e2\u0098\u0086A\u00b3\u00fcf\u00c5\u00e7~\u0096\u001fXC\u001d\u0099\u00e2\u0014I3\u00aa\u0081\u000bx\u00c7QO\u00b2\u00ba\u0019\u0013\u00b1\u00e8\u00c3\u009c\u0010\u0083]\u008e\u00ef\u00a2\u00a0w\u00b5\u00cda\u00c9\u00e4\u0094@\u0082\u0004e\u00ad?\u00cb\u0098}\u00c4\u001av\u00c4N\u00d0\u00bez6\u0007\u001a\u0012lk\u00e6\u00da\u00fd\u00a3\u00e2\u00c1t\u00da\u0013q\u0088\u00ef!\u00bb\u0081\u0000\u0011\u0087\u00dd\\l\"O\u0085\u00d2\u00b1\u00e4\u0003\u008e\u001a\u00a9~}\u00c8`\u0097\u00a2\u00b9n\u00ac\u00a4jG\u00cb\u0090\u00caCSF\u007f\u00ef\u00d6\u008e\u0092\u00c7\u00b8.\u00a0\n\u00b3\u0094\r4\u00f2\u00ce\u00f6\u00f1\u00f6\u00dfq\u00af";
                        var13_11 = "\u0085<*\u0090\u00c8\\\u0080\u00eb\u001a\u00bfjFy\u009b\u001e\u0004\u00ba\u00d1#\u0098\u00edV\u00fd\u00d1WDE\u00ff\u00a0j=\u00ef\u00e5\u000fK!\u0019]\u00b1Ti\u001b\u008c\u0010\u00aec\u00d0\u00a3\u008a\u00c2\u00dc\u00d2\u00d5\u00dc\u00855\u00ee\u007f\u00cd\u00caRZ\u00e7\u0017\u0014\u00a5}\u0014\u0001\u00c2\u00f4\u00ea5\u00d1\u00c0\u00d5}\u008e\u00c2\u0005N\u0000\u00c6=\u00ef\u00d7\u00d8T\u0017d\u00cc\u00e8\u00bc\u00d8\u00a3[\u00f7\u00a9.G\t\u00de\u00a3\u00ca\u0016'K\u00ba;a\u0002\u0092^\u00c7\u00a9\u00c4\u0085+t\u0080k\u00e3\u00a9\u0005\u0099+\u00cb;\u00c1\u008f\u00bf\u0085\u0081\u00d9\u009a\u00ca\u001a\u00a1\u00fe\u0019\u00f7\u00a3q\u00921\u00a3\u00d1>o\u00ecd/rG\u00ea\u00cet\u008f\r\u008cX\u00a3\u0011\u00d6\u00a2\u009a\u00c7\u00ec\u0014g#\u00e8j\u009b\u00b6C\u00cc\u00e2F\u0001[x#\u00e4qF/z\u00ea\u0087\u00a6T\u00ed\f\u009ad\u0097\u00d8\u00af\u0000M\f\u00ecb\u0019\u000f\u00f8\u00d5\u00f6\u009d.\u009f\u00d6oo\u00bb\u00ae\u00bd\u0019Q[`2\u0089U\u00ba0:\u00ca\u00a6c\u009b\u0080\u0007\u00e89\u00c6l\u00c9Y\nQ3\u008dM\u000ed\u009ce3\u0010\u0017N\u0014\u00b1o\u000ee\u0083\u0092.fzK'W\u00c5\u00e5\u00a1\u00ccH\u0084\u00ac0g\u00a6\u009c\u00e2Ew@9\u001e\u00fc\u00a7i0\u00b7y\u00df\u00af>q\u00ce\u009d\u008e:\u009bU\u001f\u00be\u0012\u00c8\u00ae\u008aE\u00a1\u00e8\u00a0eh\u0083\u001c|8{\u00f7b/\u00b5\u00f4A\u00d6`ad\u00a4Z\u00a8\u00e2\u0098\u0086A\u00b3\u00fcf\u00c5\u00e7~\u0096\u001fXC\u001d\u0099\u00e2\u0014I3\u00aa\u0081\u000bx\u00c7QO\u00b2\u00ba\u0019\u0013\u00b1\u00e8\u00c3\u009c\u0010\u0083]\u008e\u00ef\u00a2\u00a0w\u00b5\u00cda\u00c9\u00e4\u0094@\u0082\u0004e\u00ad?\u00cb\u0098}\u00c4\u001av\u00c4N\u00d0\u00bez6\u0007\u001a\u0012lk\u00e6\u00da\u00fd\u00a3\u00e2\u00c1t\u00da\u0013q\u0088\u00ef!\u00bb\u0081\u0000\u0011\u0087\u00dd\\l\"O\u0085\u00d2\u00b1\u00e4\u0003\u008e\u001a\u00a9~}\u00c8`\u0097\u00a2\u00b9n\u00ac\u00a4jG\u00cb\u0090\u00caCSF\u007f\u00ef\u00d6\u008e\u0092\u00c7\u00b8.\u00a0\n\u00b3\u0094\r4\u00f2\u00ce\u00f6\u00f1\u00f6\u00dfq\u00af".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00056{MK\u0019\u0010jt\u0083\u00a3l\u001c\u00d5\u009d\u009b";
                            var13_11 = "\u00056{MK\u0019\u0010jt\u0083\u00a3l\u001c\u00d5\u009d\u009b".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                cz_0.c = var14_8;
                cz_0.d = new Integer[61];
                var0_14 = 2828086039467416516L;
                var6_15 = new long[6];
                var3_16 = 0;
                var4_17 = "D\u00c6ge\u00be+N`Dru\u00a6A\u0014S\u00195\u00b58]\u00e1W\u00ed\u00ee\u001c\u0087\u00b0\u009a\u00aenl\u0080";
                var5_18 = "D\u00c6ge\u00be+N`Dru\u00a6A\u0014S\u00195\u00b58]\u00e1W\u00ed\u00ee\u001c\u0087\u00b0\u009a\u00aenl\u0080".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "6\u0095\u00a9)\u0004\u00fe\u00e7\u00a90Q`_\u00b8A\u00d1\u00e8";
                    var5_18 = "6\u0095\u00a9)\u0004\u00fe\u00e7\u00a90Q`_\u00b8A\u00d1\u00e8".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        cz_0.g = var6_15;
        cz_0.h = new Long[6];
        cz_0.p = new ImageIcon(cz_0.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 340 out of bounds for length 2"));
        cz_0.W = FileSystemView.getFileSystemView();
        cz_0.k = new SimpleDateFormat("\u0000ERR:ArrayIndexOutOfBoundsException:Index 323 out of bounds for length 2");
        v27 = new char[cz_0.a(13079, 2245651693683390115L)];
        v27[0] = cz_0.a(1374, 8528407966091116783L);
        v27[1] = cz_0.a(9918, 2017023186835579657L);
        v27[2] = cz_0.a(24950, 3301034901911626949L);
        v27[3] = cz_0.a(1790, 3521478675722994539L);
        v27[4] = '\u0000';
        v27[5] = cz_0.a(16214, 194837993137453809L);
        v27[cz_0.a((int)31703, (long)3187176049905598020L)] = cz_0.a(11530, 6002117682853095605L);
        v27[cz_0.a((int)6864, (long)5880681253416738687L)] = cz_0.a(8558, 136705615694505175L);
        v27[cz_0.a((int)16078, (long)3872650368560151362L)] = cz_0.a(23447, 6164120201284148766L);
        v27[cz_0.a((int)29648, (long)574367108985419377L)] = cz_0.a(16425, 6214623920860087681L);
        v27[cz_0.a((int)28059, (long)7863235424712091686L)] = cz_0.a(2263, 6113169809442278725L);
        v27[cz_0.a((int)26352, (long)43710117682045821L)] = cz_0.a(24750, 6876697962870727999L);
        v27[cz_0.a((int)10784, (long)5564704313605271459L)] = cz_0.a(25061, 1016223927052756043L);
        v27[cz_0.a((int)24366, (long)5326854593994119855L)] = cz_0.a(32603, 4842156399121791741L);
        v27[cz_0.a((int)31029, (long)1688431785391848611L)] = cz_0.a(4691, 1060695702369212403L);
        v27[cz_0.a((int)2003, (long)2214158703794422356L)] = cz_0.a(29925, 429117191367455061L);
        v27[cz_0.a((int)9755, (long)2444215615459533728L)] = cz_0.a(1012, 6023208913061611107L);
        v27[cz_0.a((int)20583, (long)2538726776288138746L)] = cz_0.a(2451, 8066372989849439289L);
        v27[cz_0.a((int)13945, (long)5208197154281173972L)] = cz_0.a(9026, 2820494131265971913L);
        v27[cz_0.a((int)27912, (long)7940735984101091466L)] = cz_0.a(20275, 8372848883456068229L);
        v27[cz_0.a((int)14582, (long)7291190811323383155L)] = cz_0.a(29661, 8146617800018327143L);
        v27[cz_0.a((int)144, (long)9077223971122644284L)] = cz_0.a(510, 7912463083723523185L);
        v27[cz_0.a((int)7996, (long)2806717476646197940L)] = cz_0.a(3054, 3116761840534621782L);
        v27[cz_0.a((int)25821, (long)8566349162929742191L)] = cz_0.a(14875, 7513171815475986343L);
        v27[cz_0.a((int)2586, (long)2752732870487379866L)] = cz_0.a(2647, 1651069563052199891L);
        v27[cz_0.a((int)22602, (long)7320385355897265663L)] = cz_0.a(28774, 3417378973183899096L);
        v27[cz_0.a((int)13062, (long)827502618363082393L)] = cz_0.a(13916, 5050892840990192631L);
        v27[cz_0.a((int)24373, (long)3324617238991231660L)] = cz_0.a(16959, 4884461596807481242L);
        v27[cz_0.a((int)9605, (long)9206913756112166951L)] = cz_0.a(21125, 4707269824109795099L);
        cz_0.R = v27;
        cz_0.K = new HashMap<K, V>();
        cz_0.x = new HashMap<K, V>();
        cz_0.j = new HashMap<K, V>();
        cz_0.w = new HashMap<K, V>();
        cz_0.M = new HashMap<K, V>();
        cz_0.E = new HashMap<K, V>();
        cz_0.A = new HashMap<K, V>();
        cz_0.Y = new HashMap<K, V>();
        cz_0.f = new HashMap<K, V>();
        cz_0.e = new HashMap<K, V>();
        cz_0.N = new HashMap<K, V>();
        cz_0.z = new Object();
        cz_0.D = new HashMap<K, V>();
        cz_0.S = new HashMap<K, V>();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE1E9) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 156;
                    break;
                }
                case 1: {
                    n14 = 232;
                    break;
                }
                case 2: {
                    n14 = 134;
                    break;
                }
                case 3: {
                    n14 = 194;
                    break;
                }
                case 4: {
                    n14 = 217;
                    break;
                }
                case 5: {
                    n14 = 9;
                    break;
                }
                case 6: {
                    n14 = 199;
                    break;
                }
                case 7: {
                    n14 = 102;
                    break;
                }
                case 8: {
                    n14 = 125;
                    break;
                }
                case 9: {
                    n14 = 204;
                    break;
                }
                case 10: {
                    n14 = 123;
                    break;
                }
                case 11: {
                    n14 = 192;
                    break;
                }
                case 12: {
                    n14 = 151;
                    break;
                }
                case 13: {
                    n14 = 154;
                    break;
                }
                case 14: {
                    n14 = 220;
                    break;
                }
                case 15: {
                    n14 = 149;
                    break;
                }
                case 16: {
                    n14 = 200;
                    break;
                }
                case 17: {
                    n14 = 162;
                    break;
                }
                case 18: {
                    n14 = 240;
                    break;
                }
                case 19: {
                    n14 = 58;
                    break;
                }
                case 20: {
                    n14 = 198;
                    break;
                }
                case 21: {
                    n14 = 183;
                    break;
                }
                case 22: {
                    n14 = 24;
                    break;
                }
                case 23: {
                    n14 = 90;
                    break;
                }
                case 24: {
                    n14 = 93;
                    break;
                }
                case 25: {
                    n14 = 63;
                    break;
                }
                case 26: {
                    n14 = 121;
                    break;
                }
                case 27: {
                    n14 = 75;
                    break;
                }
                case 28: {
                    n14 = 17;
                    break;
                }
                case 29: {
                    n14 = 22;
                    break;
                }
                case 30: {
                    n14 = 224;
                    break;
                }
                case 31: {
                    n14 = 138;
                    break;
                }
                case 32: {
                    n14 = 96;
                    break;
                }
                case 33: {
                    n14 = 55;
                    break;
                }
                case 34: {
                    n14 = 238;
                    break;
                }
                case 35: {
                    n14 = 207;
                    break;
                }
                case 36: {
                    n14 = 48;
                    break;
                }
                case 37: {
                    n14 = 5;
                    break;
                }
                case 38: {
                    n14 = 18;
                    break;
                }
                case 39: {
                    n14 = 83;
                    break;
                }
                case 40: {
                    n14 = 20;
                    break;
                }
                case 41: {
                    n14 = 89;
                    break;
                }
                case 42: {
                    n14 = 165;
                    break;
                }
                case 43: {
                    n14 = 249;
                    break;
                }
                case 44: {
                    n14 = 237;
                    break;
                }
                case 45: {
                    n14 = 40;
                    break;
                }
                case 46: {
                    n14 = 103;
                    break;
                }
                case 47: {
                    n14 = 14;
                    break;
                }
                case 48: {
                    n14 = 205;
                    break;
                }
                case 49: {
                    n14 = 197;
                    break;
                }
                case 50: {
                    n14 = 8;
                    break;
                }
                case 51: {
                    n14 = 144;
                    break;
                }
                case 52: {
                    n14 = 2;
                    break;
                }
                case 53: {
                    n14 = 174;
                    break;
                }
                case 54: {
                    n14 = 170;
                    break;
                }
                case 55: {
                    n14 = 234;
                    break;
                }
                case 56: {
                    n14 = 235;
                    break;
                }
                case 57: {
                    n14 = 254;
                    break;
                }
                case 58: {
                    n14 = 6;
                    break;
                }
                case 59: {
                    n14 = 208;
                    break;
                }
                case 60: {
                    n14 = 21;
                    break;
                }
                case 61: {
                    n14 = 7;
                    break;
                }
                case 62: {
                    n14 = 176;
                    break;
                }
                case 63: {
                    n14 = 164;
                    break;
                }
                case 64: {
                    n14 = 227;
                    break;
                }
                case 65: {
                    n14 = 214;
                    break;
                }
                case 66: {
                    n14 = 130;
                    break;
                }
                case 67: {
                    n14 = 181;
                    break;
                }
                case 68: {
                    n14 = 136;
                    break;
                }
                case 69: {
                    n14 = 95;
                    break;
                }
                case 70: {
                    n14 = 70;
                    break;
                }
                case 71: {
                    n14 = 231;
                    break;
                }
                case 72: {
                    n14 = 171;
                    break;
                }
                case 73: {
                    n14 = 30;
                    break;
                }
                case 74: {
                    n14 = 0;
                    break;
                }
                case 75: {
                    n14 = 111;
                    break;
                }
                case 76: {
                    n14 = 255;
                    break;
                }
                case 77: {
                    n14 = 122;
                    break;
                }
                case 78: {
                    n14 = 106;
                    break;
                }
                case 79: {
                    n14 = 99;
                    break;
                }
                case 80: {
                    n14 = 16;
                    break;
                }
                case 81: {
                    n14 = 12;
                    break;
                }
                case 82: {
                    n14 = 215;
                    break;
                }
                case 83: {
                    n14 = 4;
                    break;
                }
                case 84: {
                    n14 = 218;
                    break;
                }
                case 85: {
                    n14 = 23;
                    break;
                }
                case 86: {
                    n14 = 243;
                    break;
                }
                case 87: {
                    n14 = 132;
                    break;
                }
                case 88: {
                    n14 = 107;
                    break;
                }
                case 89: {
                    n14 = 26;
                    break;
                }
                case 90: {
                    n14 = 28;
                    break;
                }
                case 91: {
                    n14 = 124;
                    break;
                }
                case 92: {
                    n14 = 226;
                    break;
                }
                case 93: {
                    n14 = 44;
                    break;
                }
                case 94: {
                    n14 = 195;
                    break;
                }
                case 95: {
                    n14 = 105;
                    break;
                }
                case 96: {
                    n14 = 109;
                    break;
                }
                case 97: {
                    n14 = 213;
                    break;
                }
                case 98: {
                    n14 = 253;
                    break;
                }
                case 99: {
                    n14 = 236;
                    break;
                }
                case 100: {
                    n14 = 180;
                    break;
                }
                case 101: {
                    n14 = 19;
                    break;
                }
                case 102: {
                    n14 = 177;
                    break;
                }
                case 103: {
                    n14 = 206;
                    break;
                }
                case 104: {
                    n14 = 72;
                    break;
                }
                case 105: {
                    n14 = 142;
                    break;
                }
                case 106: {
                    n14 = 84;
                    break;
                }
                case 107: {
                    n14 = 118;
                    break;
                }
                case 108: {
                    n14 = 219;
                    break;
                }
                case 109: {
                    n14 = 73;
                    break;
                }
                case 110: {
                    n14 = 246;
                    break;
                }
                case 111: {
                    n14 = 230;
                    break;
                }
                case 112: {
                    n14 = 115;
                    break;
                }
                case 113: {
                    n14 = 85;
                    break;
                }
                case 114: {
                    n14 = 186;
                    break;
                }
                case 115: {
                    n14 = 127;
                    break;
                }
                case 116: {
                    n14 = 175;
                    break;
                }
                case 117: {
                    n14 = 128;
                    break;
                }
                case 118: {
                    n14 = 79;
                    break;
                }
                case 119: {
                    n14 = 34;
                    break;
                }
                case 120: {
                    n14 = 182;
                    break;
                }
                case 121: {
                    n14 = 119;
                    break;
                }
                case 122: {
                    n14 = 190;
                    break;
                }
                case 123: {
                    n14 = 193;
                    break;
                }
                case 124: {
                    n14 = 45;
                    break;
                }
                case 125: {
                    n14 = 221;
                    break;
                }
                case 126: {
                    n14 = 113;
                    break;
                }
                case 127: {
                    n14 = 216;
                    break;
                }
                case 128: {
                    n14 = 82;
                    break;
                }
                case 129: {
                    n14 = 153;
                    break;
                }
                case 130: {
                    n14 = 250;
                    break;
                }
                case 131: {
                    n14 = 32;
                    break;
                }
                case 132: {
                    n14 = 33;
                    break;
                }
                case 133: {
                    n14 = 252;
                    break;
                }
                case 134: {
                    n14 = 101;
                    break;
                }
                case 135: {
                    n14 = 47;
                    break;
                }
                case 136: {
                    n14 = 189;
                    break;
                }
                case 137: {
                    n14 = 78;
                    break;
                }
                case 138: {
                    n14 = 53;
                    break;
                }
                case 139: {
                    n14 = 43;
                    break;
                }
                case 140: {
                    n14 = 210;
                    break;
                }
                case 141: {
                    n14 = 37;
                    break;
                }
                case 142: {
                    n14 = 80;
                    break;
                }
                case 143: {
                    n14 = 251;
                    break;
                }
                case 144: {
                    n14 = 150;
                    break;
                }
                case 145: {
                    n14 = 54;
                    break;
                }
                case 146: {
                    n14 = 25;
                    break;
                }
                case 147: {
                    n14 = 59;
                    break;
                }
                case 148: {
                    n14 = 202;
                    break;
                }
                case 149: {
                    n14 = 184;
                    break;
                }
                case 150: {
                    n14 = 157;
                    break;
                }
                case 151: {
                    n14 = 159;
                    break;
                }
                case 152: {
                    n14 = 50;
                    break;
                }
                case 153: {
                    n14 = 178;
                    break;
                }
                case 154: {
                    n14 = 247;
                    break;
                }
                case 155: {
                    n14 = 158;
                    break;
                }
                case 156: {
                    n14 = 169;
                    break;
                }
                case 157: {
                    n14 = 201;
                    break;
                }
                case 158: {
                    n14 = 61;
                    break;
                }
                case 159: {
                    n14 = 244;
                    break;
                }
                case 160: {
                    n14 = 52;
                    break;
                }
                case 161: {
                    n14 = 160;
                    break;
                }
                case 162: {
                    n14 = 104;
                    break;
                }
                case 163: {
                    n14 = 98;
                    break;
                }
                case 164: {
                    n14 = 108;
                    break;
                }
                case 165: {
                    n14 = 46;
                    break;
                }
                case 166: {
                    n14 = 1;
                    break;
                }
                case 167: {
                    n14 = 229;
                    break;
                }
                case 168: {
                    n14 = 100;
                    break;
                }
                case 169: {
                    n14 = 173;
                    break;
                }
                case 170: {
                    n14 = 71;
                    break;
                }
                case 171: {
                    n14 = 145;
                    break;
                }
                case 172: {
                    n14 = 35;
                    break;
                }
                case 173: {
                    n14 = 86;
                    break;
                }
                case 174: {
                    n14 = 64;
                    break;
                }
                case 175: {
                    n14 = 15;
                    break;
                }
                case 176: {
                    n14 = 42;
                    break;
                }
                case 177: {
                    n14 = 38;
                    break;
                }
                case 178: {
                    n14 = 148;
                    break;
                }
                case 179: {
                    n14 = 87;
                    break;
                }
                case 180: {
                    n14 = 39;
                    break;
                }
                case 181: {
                    n14 = 74;
                    break;
                }
                case 182: {
                    n14 = 241;
                    break;
                }
                case 183: {
                    n14 = 10;
                    break;
                }
                case 184: {
                    n14 = 225;
                    break;
                }
                case 185: {
                    n14 = 13;
                    break;
                }
                case 186: {
                    n14 = 167;
                    break;
                }
                case 187: {
                    n14 = 29;
                    break;
                }
                case 188: {
                    n14 = 110;
                    break;
                }
                case 189: {
                    n14 = 152;
                    break;
                }
                case 190: {
                    n14 = 185;
                    break;
                }
                case 191: {
                    n14 = 146;
                    break;
                }
                case 192: {
                    n14 = 161;
                    break;
                }
                case 193: {
                    n14 = 222;
                    break;
                }
                case 194: {
                    n14 = 137;
                    break;
                }
                case 195: {
                    n14 = 155;
                    break;
                }
                case 196: {
                    n14 = 67;
                    break;
                }
                case 197: {
                    n14 = 91;
                    break;
                }
                case 198: {
                    n14 = 228;
                    break;
                }
                case 199: {
                    n14 = 31;
                    break;
                }
                case 200: {
                    n14 = 203;
                    break;
                }
                case 201: {
                    n14 = 76;
                    break;
                }
                case 202: {
                    n14 = 140;
                    break;
                }
                case 203: {
                    n14 = 196;
                    break;
                }
                case 204: {
                    n14 = 191;
                    break;
                }
                case 205: {
                    n14 = 94;
                    break;
                }
                case 206: {
                    n14 = 139;
                    break;
                }
                case 207: {
                    n14 = 147;
                    break;
                }
                case 208: {
                    n14 = 27;
                    break;
                }
                case 209: {
                    n14 = 211;
                    break;
                }
                case 210: {
                    n14 = 163;
                    break;
                }
                case 211: {
                    n14 = 81;
                    break;
                }
                case 212: {
                    n14 = 223;
                    break;
                }
                case 213: {
                    n14 = 131;
                    break;
                }
                case 214: {
                    n14 = 188;
                    break;
                }
                case 215: {
                    n14 = 135;
                    break;
                }
                case 216: {
                    n14 = 212;
                    break;
                }
                case 217: {
                    n14 = 172;
                    break;
                }
                case 218: {
                    n14 = 179;
                    break;
                }
                case 219: {
                    n14 = 126;
                    break;
                }
                case 220: {
                    n14 = 65;
                    break;
                }
                case 221: {
                    n14 = 120;
                    break;
                }
                case 222: {
                    n14 = 168;
                    break;
                }
                case 223: {
                    n14 = 36;
                    break;
                }
                case 224: {
                    n14 = 49;
                    break;
                }
                case 225: {
                    n14 = 112;
                    break;
                }
                case 226: {
                    n14 = 166;
                    break;
                }
                case 227: {
                    n14 = 62;
                    break;
                }
                case 228: {
                    n14 = 233;
                    break;
                }
                case 229: {
                    n14 = 248;
                    break;
                }
                case 230: {
                    n14 = 239;
                    break;
                }
                case 231: {
                    n14 = 60;
                    break;
                }
                case 232: {
                    n14 = 209;
                    break;
                }
                case 233: {
                    n14 = 129;
                    break;
                }
                case 234: {
                    n14 = 57;
                    break;
                }
                case 235: {
                    n14 = 51;
                    break;
                }
                case 236: {
                    n14 = 3;
                    break;
                }
                case 237: {
                    n14 = 117;
                    break;
                }
                case 238: {
                    n14 = 92;
                    break;
                }
                case 239: {
                    n14 = 56;
                    break;
                }
                case 240: {
                    n14 = 141;
                    break;
                }
                case 241: {
                    n14 = 133;
                    break;
                }
                case 242: {
                    n14 = 143;
                    break;
                }
                case 243: {
                    n14 = 41;
                    break;
                }
                case 244: {
                    n14 = 116;
                    break;
                }
                case 245: {
                    n14 = 69;
                    break;
                }
                case 246: {
                    n14 = 242;
                    break;
                }
                case 247: {
                    n14 = 245;
                    break;
                }
                case 248: {
                    n14 = 114;
                    break;
                }
                case 249: {
                    n14 = 187;
                    break;
                }
                case 250: {
                    n14 = 88;
                    break;
                }
                case 251: {
                    n14 = 11;
                    break;
                }
                case 252: {
                    n14 = 66;
                    break;
                }
                case 253: {
                    n14 = 77;
                    break;
                }
                case 254: {
                    n14 = 68;
                    break;
                }
                default: {
                    n14 = 97;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            cz_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5A5;
        if (d[n11] == null) {
            cz_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x16B5) & Short.MAX_VALUE;
        if (h[n11] == null) {
            cz_0.h[n11] = g[n11] ^ l2;
        }
        return h[n11];
    }
}

