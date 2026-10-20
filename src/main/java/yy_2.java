/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pz_2;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.classic.HttpClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from yy
 */
public class yy_2
implements c2_0 {
    static String a;
    static String t;
    static String s;
    static String O;
    static String j;
    static String J;
    public static int W;
    public static String B;
    public static String V;
    boolean w;
    boolean R;
    static String P;
    kz_0 K;
    pz_2 D;
    long c;
    long T;
    boolean n;
    String h;
    String N;
    boolean p;
    boolean I;
    boolean F;
    boolean g;
    tl_1 x;
    public static String Y;
    Component S;
    private static final String[] b;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;
    private static final long[] i;
    private static final Long[] k;

    public yy_2() {
        HttpClient httpClient;
        this.w = false;
        this.R = false;
        this.D = new pz_2();
        this.n = false;
        this.p = false;
        this.I = false;
        this.F = false;
        this.x = new tl_1();
        try {
            httpClient = (HttpClient)this.x.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        HttpClient httpClient2 = httpClient;
        try {
            this.x.a(httpClient2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void J() {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        File file = new File((String)yy_2.O);
        try {
            Process process = Runtime.getRuntime().exec(new String[]{yy_2.a(19623, -4189), yy_2.a(19584, 17917), file.getName()}, null, file.getParentFile());
            try {
                lk_0.q((Object)process, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        System.exit(0);
    }

    public static void P() {
        Object object;
        String string = System.getProperty(yy_2.a(19585, -3555));
        if (new File(yy_2.a(19633, -24746)).exists()) {
            // empty if block
        }
        File file = new File((String)dd_1.j + File.separator + (String)yy_2.j);
        file.delete();
        try {
            yy_2.P((Object)new File((String)yy_2.j), (Object)file);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(yy_2.a(19627, 1290), yy_2.a(19622, -28210), "\"" + file.getName() + yy_2.a(19619, -32488) + string + "\"");
            processBuilder.directory(file.getParentFile());
            Process process = processBuilder.start();
            try {
                lk_0.q((Object)process, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            yy_2.x(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    static void o() {
        File file = new File((String)yy_2.O);
        try {
            Process process = Runtime.getRuntime().exec(new String[]{yy_2.a(19627, 1290), yy_2.a(19622, -28210), file.getName()}, null, file.getParentFile());
            try {
                lk_0.q((Object)process, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Loose catch block
     */
    public void l() {
        block40: {
            da_1 da_12;
            block39: {
                String[] stringArray;
                da_1 da_13;
                block34: {
                    da_1 da_14;
                    block33: {
                        String[] stringArray2 = da_1.q();
                        this.N = null;
                        this.n = true;
                        this.w = true;
                        this.g = false;
                        da_13 = (da_1)U.f;
                        stringArray = stringArray2;
                        try {
                            da_14 = da_13;
                            if (stringArray != null) break block33;
                            if (da_14 == null) break block34;
                        }
                        catch (Exception exception) {
                            throw yy_2.a(exception);
                        }
                        da_14 = da_13;
                    }
                    try {
                        da_14.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                for (int i2 = 0; i2 < 3; ++i2) {
                    try {
                        da_1 da_15;
                        block37: {
                            int n10;
                            yy_2 yy_22;
                            block35: {
                                block36: {
                                    byte[] byArray;
                                    String string;
                                    try {
                                        string = (String)lk_0.P(5);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    String string2 = (String)yy_2.P + yy_2.a(19638, -5689) + string;
                                    try {
                                        byArray = (byte[])this.x.L(string2);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    byte[] byArray2 = byArray;
                                    String string3 = new String(byArray2, yy_2.a(19613, -8874));
                                    this.K = new kz_0(string3);
                                    this.g = true;
                                    yy_22 = this;
                                    n10 = yy_2.W;
                                    if (stringArray != null) break block35;
                                    try {
                                        block41: {
                                            int n11;
                                            try {
                                                n11 = (Integer)this.K.n();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (n10 >= n11) break block36;
                                            break block41;
                                            catch (Exception exception) {
                                                throw yy_2.a(exception);
                                            }
                                        }
                                        n10 = 1;
                                        break block35;
                                    }
                                    catch (Exception exception) {
                                        throw yy_2.a(exception);
                                    }
                                }
                                n10 = 0;
                            }
                            try {
                                yy_22.n = n10 != 0;
                                da_15 = da_13;
                                if (stringArray != null) break block37;
                                if (da_15 == null) break;
                            }
                            catch (Exception exception) {
                                throw yy_2.a(exception);
                            }
                            da_15 = da_13;
                        }
                        try {
                            da_15.t();
                            break;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        block38: {
                            if (stringArray != null) continue;
                            try {
                                block42: {
                                    if (da_13 == null) break block38;
                                    break block42;
                                    catch (Exception exception2) {
                                        throw yy_2.a(exception2);
                                    }
                                }
                                try {
                                    da_13.t();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            catch (Exception exception3) {
                                throw yy_2.a(exception3);
                            }
                        }
                        this.N = yy_2.a(19630, 8543) + (i2 + 1);
                        try {
                            Thread.sleep(yy_2.b(27175, 2888609350803632969L));
                            continue;
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        if (stringArray == null) continue;
                    }
                }
                try {
                    this.w = false;
                    da_12 = da_13;
                    if (stringArray != null) break block39;
                    if (da_12 == null) break block40;
                }
                catch (Exception exception) {
                    throw yy_2.a(exception);
                }
                da_12 = da_13;
            }
            try {
                da_12.t();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public static void F() {
        block4: {
            File[] fileArray;
            String[] stringArray;
            block3: {
                File[] fileArray2 = new File((String)dd_1.j).listFiles();
                stringArray = da_1.q();
                fileArray = fileArray2;
                if (stringArray != null) break block3;
                if (fileArray == null) break block4;
                fileArray = fileArray2;
            }
            for (File file : fileArray) {
                file.delete();
                if (stringArray == null) continue;
            }
        }
    }

    public void g() {
        Object object;
        block8: {
            String string;
            block9: {
                String[] stringArray = da_1.q();
                this.I = true;
                String[] stringArray2 = stringArray;
                string = (String)dd_1.j + File.separator + (String)yy_2.t;
                try {
                    if (stringArray2 != null) break block8;
                    if (!this.F) break block9;
                }
                catch (IOException iOException) {
                    throw yy_2.a(iOException);
                }
                string = (String)dd_1.j + File.separator + (String)yy_2.s;
            }
            try {
                Desktop.getDesktop().open(new File(string));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void W() {
        block4: {
            String string;
            block5: {
                String[] stringArray = da_1.q();
                this.I = true;
                String[] stringArray2 = stringArray;
                string = (String)dd_1.j + File.separator + (String)yy_2.t;
                try {
                    if (stringArray2 != null) break block4;
                    if (!this.F) break block5;
                }
                catch (IOException iOException) {
                    throw yy_2.a(iOException);
                }
                string = (String)dd_1.j + File.separator + (String)yy_2.s;
            }
            try {
                Desktop.getDesktop().open(new File(string));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void u(CH var1_1, Component var2_2) {
        block21: {
            block18: {
                block19: {
                    v0 = da_1.q();
                    this.I = true;
                    var4_3 = "";
                    var3_4 = v0;
                    try {
                        if (var3_4 != null) break block18;
                        try {
                            v1 = (Integer)this.K.g();
                        }
                        catch (InvocationTargetException v2) {
                            throw v2.getTargetException();
                        }
                        if (yy_2.W >= v1) break block19;
                    }
                    catch (Exception v3) {
                        throw yy_2.a(v3);
                    }
                    var4_3 = yy_2.a(19603, -18698);
                    this.F = true;
                    if (var3_4 == null) break block21;
                }
                var4_3 = yy_2.a(19610, -14411);
            }
            this.F = false;
        }
        var5_5 = new File((String)dd_1.o + File.separator + var4_3);
        try {
            try {
                lk_0.e((Object)(yy_2.a(19624, -27021) + var4_3), (Object)var5_5.getAbsolutePath(), null);
            }
            catch (InvocationTargetException v4) {
                throw v4.getTargetException();
            }
        }
        catch (Exception var6_6) {
            var6_6.printStackTrace();
        }
        if (!var5_5.exists()) ** GOTO lbl67
        var6_7 = new JPanel();
        var7_8 = new JLabel(yy_2.a(19605, -28427));
        var8_9 = new JPasswordField(yy_2.a(19667, 7825282499362317532L));
        var6_7.add(var7_8);
        var6_7.add(var8_9);
        var9_10 = new String[]{yy_2.a(19595, -20152), yy_2.a(19590, 10052)};
        try {
            yt_1.F.J(new qv_0(this, var8_9));
        }
        catch (InvocationTargetException v5) {
            throw v5.getTargetException();
        }
        var10_11 = JOptionPane.showConfirmDialog(null, var6_7, yy_2.a(19593, -7145), 0, -1);
        if (var10_11 == 0) {
            var11_12 = var8_9.getPassword();
            var12_13 = new String(var11_12);
            try {
                lk_0.q((Object)var5_5.getAbsolutePath(), (Object)var12_13, var1_1);
            }
            catch (InvocationTargetException v6) {
                throw v6.getTargetException();
            }
        }
        try {
            if (var3_4 == null) ** GOTO lbl71
lbl67:
            // 2 sources

            var1_1.d(yy_2.a(19591, -11046) + var4_3 + yy_2.a(19615, -28422));
        }
        catch (Exception v7) {
            throw yy_2.a(v7);
        }
lbl71:
        // 2 sources

        this.I = false;
    }

    public void a(CH cH, Component component) {
        block106: {
            yy_2 yy_22;
            block84: {
                block85: {
                    String[] stringArray;
                    block91: {
                        yy_2 yy_23;
                        block90: {
                            block89: {
                                String string;
                                Object object;
                                int n10;
                                File file;
                                long l2;
                                long l3;
                                String string2;
                                String string3;
                                String string4;
                                boolean bl;
                                File file2;
                                block101: {
                                    block102: {
                                        block104: {
                                            int n11;
                                            block105: {
                                                String string5;
                                                block103: {
                                                    String string6;
                                                    Object object2;
                                                    block99: {
                                                        block100: {
                                                            block92: {
                                                                block93: {
                                                                    Object object3;
                                                                    block96: {
                                                                        boolean bl2;
                                                                        block97: {
                                                                            block98: {
                                                                                block94: {
                                                                                    block95: {
                                                                                        boolean bl3;
                                                                                        block88: {
                                                                                            boolean bl4;
                                                                                            block87: {
                                                                                                int n12;
                                                                                                int n13;
                                                                                                block86: {
                                                                                                    String[] stringArray2 = da_1.q();
                                                                                                    this.S = component;
                                                                                                    this.I = true;
                                                                                                    this.c = 0L;
                                                                                                    stringArray = stringArray2;
                                                                                                    this.T = 0L;
                                                                                                    this.h = "";
                                                                                                    this.N = null;
                                                                                                    try {
                                                                                                        this.l();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    yy_22 = this;
                                                                                                    if (stringArray != null) break block84;
                                                                                                    if (!yy_22.g) break block85;
                                                                                                    int n14 = yy_2.W;
                                                                                                    if (stringArray == null) {
                                                                                                        int n15;
                                                                                                        try {
                                                                                                            n15 = (Integer)this.K.n();
                                                                                                        }
                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                        }
                                                                                                        n14 = n14 < n15 ? 1 : 0;
                                                                                                    }
                                                                                                    this.n = n14 != 0;
                                                                                                    bl4 = false;
                                                                                                    boolean bl5 = true;
                                                                                                    file2 = null;
                                                                                                    n13 = this.n;
                                                                                                    if (stringArray != null) break block86;
                                                                                                    if (n13 == 0) break block87;
                                                                                                    bl4 = true;
                                                                                                    this.R = true;
                                                                                                    n13 = yy_2.W;
                                                                                                }
                                                                                                try {
                                                                                                    n12 = (Integer)this.K.g();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                if (n13 < n12) {
                                                                                                    boolean bl5;
                                                                                                    file2 = new File((String)dd_1.j + File.separator + (String)yy_2.s);
                                                                                                    try {
                                                                                                        bl5 = (Boolean)this.u((Object)yy_2.a(19594, 1532), (Object)file2);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    this.p = bl5;
                                                                                                    this.F = true;
                                                                                                } else {
                                                                                                    boolean bl6;
                                                                                                    file2 = new File((String)dd_1.j + File.separator + (String)yy_2.t);
                                                                                                    try {
                                                                                                        bl6 = (Boolean)this.u((Object)yy_2.a(19621, 16862), (Object)file2);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    this.p = bl6;
                                                                                                    this.F = false;
                                                                                                }
                                                                                            }
                                                                                            bl3 = bl4;
                                                                                            if (stringArray != null) break block88;
                                                                                            if (!bl3) break block89;
                                                                                            yy_23 = this;
                                                                                            if (stringArray != null) break block90;
                                                                                            bl3 = yy_23.p;
                                                                                        }
                                                                                        if (!bl3) break block89;
                                                                                        this.n = false;
                                                                                        int n16 = JOptionPane.showConfirmDialog(null, yy_2.a(19596, 28468), yy_2.a(19628, 20666), 0);
                                                                                        if (stringArray != null) break block91;
                                                                                        if (n16 != 0) break block89;
                                                                                        bl = this.F;
                                                                                        if (stringArray != null) break block92;
                                                                                        if (!bl) break block93;
                                                                                        try {
                                                                                            bl2 = (Boolean)vk_0.s();
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        if (stringArray != null) break block94;
                                                                                        if (!bl2) break block95;
                                                                                        try {
                                                                                            yy_2.x(true);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        try {
                                                                                            yy_2.J();
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        if (stringArray == null) break block96;
                                                                                    }
                                                                                    try {
                                                                                        bl2 = (Boolean)vk_0.g();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                }
                                                                                if (stringArray != null) break block97;
                                                                                if (!bl2) break block98;
                                                                                try {
                                                                                    this.g();
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                                if (stringArray == null) break block96;
                                                                            }
                                                                            try {
                                                                                bl2 = (Boolean)vk_0.f();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                        }
                                                                        if (bl2) {
                                                                            try {
                                                                                this.W();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        object3 = yt_1.i();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        object3.o();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    if (stringArray == null) break block89;
                                                                }
                                                                try {
                                                                    bl = (Boolean)vk_0.s();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                            }
                                                            if (stringArray != null) break block99;
                                                            if (!bl) break block100;
                                                            try {
                                                                yy_2.x(true);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                yy_2.J();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            if (stringArray == null) break block89;
                                                        }
                                                        try {
                                                            bl = (Boolean)vk_0.g();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    if (stringArray != null) break block101;
                                                    if (!bl) break block102;
                                                    try {
                                                        object2 = yt_1.i();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        object2.S();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        string6 = (String)this.M();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    string5 = string4 = string6;
                                                    if (stringArray != null) break block103;
                                                    if (string5 == null) break block104;
                                                    string5 = yy_2.a(19620, 24364);
                                                }
                                                string3 = string5;
                                                string2 = yy_2.a(19589, -2921) + file2.getAbsolutePath() + " " + string3;
                                                try {
                                                    lk_0.k((Object)string2, (Object)string4, cH);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                l3 = file2.length();
                                                l2 = 0L;
                                                file = new File(string3);
                                                int n16 = file.exists();
                                                if (stringArray == null) {
                                                    if (n16 != 0) {
                                                        l2 = file.length();
                                                    }
                                                    n16 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                                                }
                                                if (stringArray == null) {
                                                    n16 = n16 == 0 ? 1 : 0;
                                                }
                                                n11 = n10 = n16;
                                                if (stringArray != null) break block105;
                                                if (n11 == 0) break block104;
                                                n11 = 0;
                                            }
                                            System.exit(n11);
                                        }
                                        if (stringArray == null) break block89;
                                    }
                                    try {
                                        bl = (Boolean)vk_0.f();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                if (!bl) break block89;
                                try {
                                    object = yt_1.i();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object.S();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    string = (String)this.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                string4 = string;
                                if (stringArray != null) break block91;
                                if (string4 == null) break block89;
                                string3 = yy_2.a(19588, 16223);
                                string2 = yy_2.a(19639, 29474) + file2.getAbsolutePath() + " " + string3;
                                try {
                                    lk_0.k((Object)string2, (Object)string4, cH);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                l3 = file2.length();
                                l2 = 0L;
                                file = new File(string3);
                                boolean bl7 = file.exists();
                                if (stringArray == null) {
                                    if (bl7) {
                                        l2 = file.length();
                                    }
                                    bl7 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                                }
                                if (stringArray == null) {
                                    bl7 = !bl7;
                                }
                                n10 = bl7 ? 1 : 0;
                                if (stringArray != null) break block91;
                                if (n10 != 0) {
                                    System.exit(0);
                                }
                            }
                            yy_23 = this;
                        }
                        yy_23.R = false;
                    }
                    if (stringArray == null) break block106;
                }
                this.R = false;
                yy_22 = this;
            }
            yy_22.N = yy_2.a(19586, -21211);
        }
        this.w = false;
        this.I = false;
        this.n = true;
    }

    String M() {
        String string = null;
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel(yy_2.a(19631, 22442));
        JPasswordField jPasswordField = new JPasswordField(yy_2.a(11355, 1596935362728723543L));
        jPanel.add(jLabel);
        jPanel.add(jPasswordField);
        Object[] objectArray = new String[]{yy_2.a(19635, -12145), yy_2.a(19587, -13321)};
        try {
            yt_1.F.J(new fz_2(this, jPasswordField));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = JOptionPane.showOptionDialog((Component)this.S, jPanel, yy_2.a(19614, 14226), 1, -1, null, objectArray, objectArray[0]);
        if (n10 == 0) {
            char[] cArray = jPasswordField.getPassword();
            string = new String(cArray);
        }
        return string;
    }

    void a(String string, String string2) {
        try {
            yy_2.P((Object)new File(string), (Object)new File(string2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void u() {
        if (this.F) {
            // empty if block
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean u(String var1_1, File var2_2) {
        block37: {
            block40: {
                var4_3 = false;
                var3_4 = da_1.q();
                try {
                    for (var5_5 = 0; var5_5 < 2; ++var5_5) {
                        block39: {
                            block38: {
                                block43: {
                                    block42: {
                                        block41: {
                                            try {
                                                v0 = (mE)this.K.C(var1_1);
                                            }
                                            catch (InvocationTargetException v1) {
                                                throw v1.getTargetException();
                                            }
                                            var6_7 = v0;
                                            try {
                                                v2 = (String)var6_7.h();
                                            }
                                            catch (InvocationTargetException v3) {
                                                throw v3.getTargetException();
                                            }
                                            try {
                                                v4 = (String)lk_0.P(5);
                                            }
                                            catch (InvocationTargetException v5) {
                                                throw v5.getTargetException();
                                            }
                                            var7_9 = v2 + yy_2.a(19637, -20709) + v4;
                                            try {
                                                v6 = (Long)lk_0.h(var7_9);
                                            }
                                            catch (InvocationTargetException v7) {
                                                throw v7.getTargetException();
                                            }
                                            var8_11 = v6;
                                            this.c = var8_11;
                                            v8 = this;
                                            v9 = var1_1;
                                            if (var3_4 != null) ** GOTO lbl110
                                            v8.h = v9;
                                            try {
                                                lk_0.e((Object)var7_9, (Object)var2_2.getAbsolutePath(), this);
                                            }
                                            catch (InvocationTargetException v10) {
                                                throw v10.getTargetException();
                                            }
                                            v11 = var2_2.exists();
                                            if (var3_4 != null) break block37;
                                            break block41;
                                            catch (Exception v12) {
                                                throw yy_2.a(v12);
                                            }
                                        }
                                        if (!v11) ** GOTO lbl105
                                        break block42;
                                        catch (Exception v13) {
                                            throw yy_2.a(v13);
                                        }
                                    }
                                    v14 = var2_2;
                                    if (var3_4 != null) break block38;
                                    break block43;
                                    catch (Exception v15) {
                                        throw yy_2.a(v15);
                                    }
                                }
                                try {
                                    block44: {
                                        if (v14.length() <= 0L) ** GOTO lbl105
                                        break block44;
                                        catch (Exception v16) {
                                            throw yy_2.a(v16);
                                        }
                                    }
                                    v14 = var2_2;
                                }
                                catch (Exception v17) {
                                    throw yy_2.a(v17);
                                }
                            }
                            try {
                                v18 = (String)lk_0.s(v14);
                            }
                            catch (InvocationTargetException v19) {
                                throw v19.getTargetException();
                            }
                            var10_12 = v18;
                            try {
                                if (var3_4 == null) {
                                    try {
                                        v20 = (String)var6_7.H();
                                    }
                                    catch (InvocationTargetException v21) {
                                        throw v21.getTargetException();
                                    }
                                    if (!v20.equals(var10_12)) break block39;
                                }
                                ** GOTO lbl103
                            }
                            catch (Exception v22) {
                                throw yy_2.a(v22);
                            }
                            var4_3 = true;
                            if (var3_4 == null) break block40;
                        }
                        try {
                            this.N = yy_2.a(19598, 15822) + var1_1 + " " + (var5_5 + 1);
lbl103:
                            // 2 sources

                            try {
                                if (var3_4 == null) continue;
lbl105:
                                // 3 sources

                                v8 = this;
                                v9 = yy_2.a(19632, -13402) + var1_1 + " " + (var5_5 + 1);
                            }
                            catch (Exception v23) {
                                throw yy_2.a(v23);
                            }
lbl110:
                            // 2 sources

                            v8.N = v9;
                            continue;
                        }
                        catch (Exception var6_8) {
                            this.N = yy_2.a(19599, 32251) + var1_1 + " " + (var5_5 + 1);
                            try {
                                Thread.sleep(yy_2.b(28770, 8094274108836915469L));
                                continue;
                            }
                            catch (InterruptedException var7_10) {
                                var7_10.printStackTrace();
                            }
                        }
                        if (var3_4 == null) continue;
                        break;
                    }
                }
                catch (Exception var5_6) {
                    var5_6.printStackTrace();
                }
            }
            v11 = var4_3;
        }
        return v11;
    }

    public static boolean p() {
        boolean bl = false;
        bl = new File((String)yy_2.a).exists();
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean x(boolean var0) {
        block12: {
            block11: {
                block13: {
                    var2_1 = new File((String)yy_2.a);
                    var1_2 = da_1.q();
                    v0 = var0;
                    if (var1_2 != null) break block11;
                    if (!v0) ** GOTO lbl31
                    break block13;
                    catch (IOException v1) {
                        throw yy_2.a(v1);
                    }
                }
                try {
                    block14: {
                        v2 = var2_1.exists();
                        if (var1_2 != null) break block12;
                        break block14;
                        catch (IOException v3) {
                            throw yy_2.a(v3);
                        }
                    }
                    if (v2) break block11;
                }
                catch (IOException v4) {
                    throw yy_2.a(v4);
                }
                try {
                    var2_1.createNewFile();
                }
                catch (IOException var3_3) {
                    try {
                        var3_3.printStackTrace();
                        if (var1_2 == null) break block11;
lbl31:
                        // 2 sources

                        v0 = var2_1.delete();
                    }
                    catch (IOException v5) {
                        throw yy_2.a(v5);
                    }
                }
            }
            v2 = var0;
        }
        return v2;
    }

    public static void L() {
    }

    public boolean l() {
        return this.R;
    }

    public void X(boolean bl) {
        this.R = bl;
    }

    public boolean J() {
        return this.n;
    }

    public void p(boolean bl) {
        this.n = bl;
    }

    public boolean X() {
        return this.w;
    }

    public void k(boolean bl) {
        this.w = bl;
    }

    public kz_0 P() {
        return (kz_0)this.K;
    }

    public void V(kz_0 kz_02) {
        this.K = kz_02;
    }

    @Override
    public void t(long l2) {
        this.T = l2;
    }

    public String E() {
        return (String)this.h;
    }

    public void h(String string) {
        this.h = string;
    }

    public long P() {
        return this.c;
    }

    public void h(long l2) {
        this.c = l2;
    }

    public long G() {
        return this.T;
    }

    public void U(long l2) {
        this.T = l2;
    }

    public String b() {
        return (String)this.N;
    }

    public void s(String string) {
        this.N = string;
    }

    public boolean h() {
        return this.I;
    }

    public void P(boolean bl) {
        this.I = bl;
    }

    public boolean n() {
        return this.p;
    }

    public void m(boolean bl) {
        this.p = bl;
    }

    public boolean r() {
        return this.g;
    }

    public void u(boolean bl) {
        this.g = bl;
    }

    public static void P(File file, File file2) {
        try {
            FileUtils.copyFile(file, file2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static boolean K(FileChannel fileChannel, FileChannel fileChannel2) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean p(File file) {
        String[] stringArray = da_1.q();
        boolean bl = file.exists();
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = file.mkdirs();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public tl_1 N() {
        return (tl_1)this.x;
    }

    public void B(tl_1 tl_12) {
        this.x = tl_12;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block52: {
            block51: {
                block50: {
                    block49: {
                        block48: {
                            block47: {
                                var21 = new String[57];
                                var19_1 = 0;
                                var18_2 = "\u5310\u6d6a\u0006\u68f9\u6754\u66e9\u65b1\u59ef\u8d2f\b\u00cb\u0088=\u00ac\u00c9W\u0018.\u0002\u00f6\u00f2\u0006\u4ea7\u8fcb\u5bed\u88bc\u8196\u675c\u0002\u53a3\u6d08\u0007S\u00df7\u0006<\u0018\u008c*0ZE0\u0013\u00ccbD+:\u0014\n=-\u00c7 z\u00dfc\u00afB\b\u00c7\u0090e!\u000b\u00d6'u\u00daY\u001d\u008f\u0089\u00d74\u00a5\u009b\u00b6c \u0004\u783e\u5b73\u00afD\u0007u{cj\u0099A\u00b1\u000e\u0099\u007fP\u00fb\u000b\f\u00ae\u009a\u00f0\u0097\u00a6\t\u00a5d\u000e\u00a6\u00fc\u00eah\u001b\u00a9I\u0013,=\u0098\u00a5\u0003B\u0005\u4e9d\u8f7d\u5912\u8d8a\u00fc\u0006\u00d175\u95c5\u8b538\u0007\u00cd(\u00cd;\u00d5h\u00a6\u0012\u4e34\u8f9f\u66e2\u6543\u5b33\u6244\u00f4\u7a0f\u5348\u51da\u952b\u7ac4\u5e20\u8f8a\u8868\u6609\u6582\u00a6\u001b\u00adr\u008b\u00b97\u0093\u00ccT\u009c\u00d5\u00ff\u00bb\u00bf\u00e3~\f\u00a3rCY\u0016\u00fa\u00ff~\u00d8B\u0002\u0005\u00f7\u00f7\u009cdi\u000e\u00b86)1c\u0082Fv\u00cd\u0091\u00a40\u0084\u00f0\u0003`!\u00b5\u0016\u00ca\u0085gG\u00aaL\u007f\u00af\u00ea\u00aa1Tf\u001eE\u00b3\u00c4\u0085\u00de\u00af\u00f6!\u000b\u0095k\u00f7\u00a0\u00eb\u00a6{.\u00b8\u009b\"\u0006\u8ffc\u51b7\u7c7f\u7e32\u5b24\u78f9\u0005LAS\u00f0\u0017\u0016r\u00f6p)H\u0081#\u0016a\u009d@\u00b2H\u00c2\u0080(|\u00f6\u00c9\u00d5\u001a\u00fd\u001fv{\u00f0\u0098X\u00b7!\u00d0!EH\u00a9I\u00a1\u00a0Dx{8xy\u00de\u0012\u00fa\u0014\u00c0\u00dc\u0086\u0095\u00d1\u00cb\u0017\u0091\u0007r\u008d\u00d8\u00b7\u0090\r\u00b4\u0080%}\u00f4\u00c1\u00db\u00c8\\<\"\u00d1x\u0095\u00c5\u0015\u009eq\u0093C\u00e4n\u00176D\u00e7;\u00917\\\u00a3`SQ\u00d2k}\u0003\u5987\u8d19\u0017\u0002\u662f\u6580\u0005\u0010\u0088E\u0014\u00b3\u0015\u00cb\u00a2\u00b4Qc&\u00ee\u001eB\u00af\u00d3\u00b8_\u00ab)QW\u001f:\u00eaH\b\u0098~\u009e\u00f7Co\u00abD\u000e\u00fa\u0012a\u00b5j\u0012gd\u00e9\u00d3 w\r\u00e1\u0014\u00d7\u00b7\u00c4\u0001\u00de\u0084\u00f1\u00b6;\u0089\u000b5&\u008a\u00ab\u0086z\u000fD>\u000b\u0089\u00de+,#\u0001N\"\u00cc\u001b\u008a\u0003\u0088\u00e2\u0080\u0002->\u0006\u001dk\u00e6\u00a0\u00c9\u00a68\u00b18v\u00ccU\u0014\u008b\u00f9\u0006\u00e1\u0087\u009f\u009b\u00dcv4\u00d4q\u00dc\u00aa\u00b1W3\u00b5{\u00bfni\u00c2\u001c\u0007\u0014\u009f\u00de\u00c48D(&6c4*){\u00d2)\u00fe\u000f\u00f9\u00e4`\u0081\u000e 7\u0003\u007fj~\u0005\u0084$\u00ee\u0093\u0091\u0015\u00c5\u0096\u00f8\u00bf\u0089\u00f1\u00ba\u00c5\u00f1\u0099\u008d^\u00e1\u00a5y^\u0000\u00ba\u00ab\u00b1\u000b\"\u00da\u00f9\u00b0g\u00162SJ\u00db\u000eG\u00ff\u0083\u00d88\u00e1\u0082a\u0091CX\u00b2e\u0001\u00da\f^\u00ce`\u0019v\u0017y\u00bf\u0006\u8f4a\u515b\u7ca9\u7eaf\u5bfe\u784a\u0007\u6880\u6777\u66c6\u65d5\u590a\u8da3\u00d5\u0016\u00bb\u0000I\u00f7oZ\u00c7m\u00fd\u00f2\u00d3_:\u007f\u00ce\u009f\u00b5\u0000\u00f0\u001e.1\u0002\u6dc4\u60c5\u0002\u782d\u5b86\u001a\u009e{\u00ed\u0098\u00fb\u00b7U\u00d0\u00afE\u0099\u00a9s\u00a1\u00e7D\u0090{%u\u00c3\u00cd$X\u00c5.\u0016{\u00a5\u00a2\u00b1\u00a1:\u00b6\u0094d\u00fd\u008f\u00bf\u00d6\u0016\u0013\u001b*\u0097\u00de\u001a\u00eb\u0093\u0005\u4f58\u5b2a\u59a6\u8de1j\u0007\u00e5\u0019\u00e1\u00de\u00e6\u0003\u00d7\u0003\u00ea\u00d5B\u0003\u0019\u00f0<";
                                var20_3 = "\u5310\u6d6a\u0006\u68f9\u6754\u66e9\u65b1\u59ef\u8d2f\b\u00cb\u0088=\u00ac\u00c9W\u0018.\u0002\u00f6\u00f2\u0006\u4ea7\u8fcb\u5bed\u88bc\u8196\u675c\u0002\u53a3\u6d08\u0007S\u00df7\u0006<\u0018\u008c*0ZE0\u0013\u00ccbD+:\u0014\n=-\u00c7 z\u00dfc\u00afB\b\u00c7\u0090e!\u000b\u00d6'u\u00daY\u001d\u008f\u0089\u00d74\u00a5\u009b\u00b6c \u0004\u783e\u5b73\u00afD\u0007u{cj\u0099A\u00b1\u000e\u0099\u007fP\u00fb\u000b\f\u00ae\u009a\u00f0\u0097\u00a6\t\u00a5d\u000e\u00a6\u00fc\u00eah\u001b\u00a9I\u0013,=\u0098\u00a5\u0003B\u0005\u4e9d\u8f7d\u5912\u8d8a\u00fc\u0006\u00d175\u95c5\u8b538\u0007\u00cd(\u00cd;\u00d5h\u00a6\u0012\u4e34\u8f9f\u66e2\u6543\u5b33\u6244\u00f4\u7a0f\u5348\u51da\u952b\u7ac4\u5e20\u8f8a\u8868\u6609\u6582\u00a6\u001b\u00adr\u008b\u00b97\u0093\u00ccT\u009c\u00d5\u00ff\u00bb\u00bf\u00e3~\f\u00a3rCY\u0016\u00fa\u00ff~\u00d8B\u0002\u0005\u00f7\u00f7\u009cdi\u000e\u00b86)1c\u0082Fv\u00cd\u0091\u00a40\u0084\u00f0\u0003`!\u00b5\u0016\u00ca\u0085gG\u00aaL\u007f\u00af\u00ea\u00aa1Tf\u001eE\u00b3\u00c4\u0085\u00de\u00af\u00f6!\u000b\u0095k\u00f7\u00a0\u00eb\u00a6{.\u00b8\u009b\"\u0006\u8ffc\u51b7\u7c7f\u7e32\u5b24\u78f9\u0005LAS\u00f0\u0017\u0016r\u00f6p)H\u0081#\u0016a\u009d@\u00b2H\u00c2\u0080(|\u00f6\u00c9\u00d5\u001a\u00fd\u001fv{\u00f0\u0098X\u00b7!\u00d0!EH\u00a9I\u00a1\u00a0Dx{8xy\u00de\u0012\u00fa\u0014\u00c0\u00dc\u0086\u0095\u00d1\u00cb\u0017\u0091\u0007r\u008d\u00d8\u00b7\u0090\r\u00b4\u0080%}\u00f4\u00c1\u00db\u00c8\\<\"\u00d1x\u0095\u00c5\u0015\u009eq\u0093C\u00e4n\u00176D\u00e7;\u00917\\\u00a3`SQ\u00d2k}\u0003\u5987\u8d19\u0017\u0002\u662f\u6580\u0005\u0010\u0088E\u0014\u00b3\u0015\u00cb\u00a2\u00b4Qc&\u00ee\u001eB\u00af\u00d3\u00b8_\u00ab)QW\u001f:\u00eaH\b\u0098~\u009e\u00f7Co\u00abD\u000e\u00fa\u0012a\u00b5j\u0012gd\u00e9\u00d3 w\r\u00e1\u0014\u00d7\u00b7\u00c4\u0001\u00de\u0084\u00f1\u00b6;\u0089\u000b5&\u008a\u00ab\u0086z\u000fD>\u000b\u0089\u00de+,#\u0001N\"\u00cc\u001b\u008a\u0003\u0088\u00e2\u0080\u0002->\u0006\u001dk\u00e6\u00a0\u00c9\u00a68\u00b18v\u00ccU\u0014\u008b\u00f9\u0006\u00e1\u0087\u009f\u009b\u00dcv4\u00d4q\u00dc\u00aa\u00b1W3\u00b5{\u00bfni\u00c2\u001c\u0007\u0014\u009f\u00de\u00c48D(&6c4*){\u00d2)\u00fe\u000f\u00f9\u00e4`\u0081\u000e 7\u0003\u007fj~\u0005\u0084$\u00ee\u0093\u0091\u0015\u00c5\u0096\u00f8\u00bf\u0089\u00f1\u00ba\u00c5\u00f1\u0099\u008d^\u00e1\u00a5y^\u0000\u00ba\u00ab\u00b1\u000b\"\u00da\u00f9\u00b0g\u00162SJ\u00db\u000eG\u00ff\u0083\u00d88\u00e1\u0082a\u0091CX\u00b2e\u0001\u00da\f^\u00ce`\u0019v\u0017y\u00bf\u0006\u8f4a\u515b\u7ca9\u7eaf\u5bfe\u784a\u0007\u6880\u6777\u66c6\u65d5\u590a\u8da3\u00d5\u0016\u00bb\u0000I\u00f7oZ\u00c7m\u00fd\u00f2\u00d3_:\u007f\u00ce\u009f\u00b5\u0000\u00f0\u001e.1\u0002\u6dc4\u60c5\u0002\u782d\u5b86\u001a\u009e{\u00ed\u0098\u00fb\u00b7U\u00d0\u00afE\u0099\u00a9s\u00a1\u00e7D\u0090{%u\u00c3\u00cd$X\u00c5.\u0016{\u00a5\u00a2\u00b1\u00a1:\u00b6\u0094d\u00fd\u008f\u00bf\u00d6\u0016\u0013\u001b*\u0097\u00de\u001a\u00eb\u0093\u0005\u4f58\u5b2a\u59a6\u8de1j\u0007\u00e5\u0019\u00e1\u00de\u00e6\u0003\u00d7\u0003\u00ea\u00d5B\u0003\u0019\u00f0<".length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 68;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block47;
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
                                    var18_2 = "\u00c9\u00a6\u0007\u00a97\u001d?\u00bd\u00b6\u00bb\u00a8\u009b\u00deR\u0093\u0081`\u00b2\u00be\u0087\u00ed!\u00cf\u00ccaz\u00c5\u00d5\u00c1\u0013\u001d\u00ef\u0080X\u0011\u00a3\u0007z\u00f8o\u00b0\u00d3\u009b\u00efF\u00f1\u0085)P\u0016\u00f3\u001b\u00c6e\u00ebgf[\u0014\u00065\u0015/\u00ae\u00fb\u00fc@\u0093.e\nr\u00ea\u00c3B2\u0002\u00e4\u0089\u00f8\u0005\u0007X\u0018\u000bc";
                                    var20_3 = "\u00c9\u00a6\u0007\u00a97\u001d?\u00bd\u00b6\u00bb\u00a8\u009b\u00deR\u0093\u0081`\u00b2\u00be\u0087\u00ed!\u00cf\u00ccaz\u00c5\u00d5\u00c1\u0013\u001d\u00ef\u0080X\u0011\u00a3\u0007z\u00f8o\u00b0\u00d3\u009b\u00efF\u00f1\u0085)P\u0016\u00f3\u001b\u00c6e\u00ebgf[\u0014\u00065\u0015/\u00ae\u00fb\u00fc@\u0093.e\nr\u00ea\u00c3B2\u0002\u00e4\u0089\u00f8\u0005\u0007X\u0018\u000bc".length();
                                    var17_4 = 80;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 121;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block47;
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
                                    break block48;
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
                                            v15 = 48;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 32;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 48;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 26;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 67;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 21;
                                            break;
                                        }
                                        default: {
                                            v15 = 7;
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
                        yy_2.b = var21;
                        yy_2.d = new String[57];
                        var8_7 = 3809558603992763744L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u0010\u00a6\u00ce\u00f7\u00adm\u00d9k\u0096`z$\u00d7\u0097\u00e9\u00b6a\u00a8\u00ffm\u00ae\u00b1\t=";
                        var13_11 = "\u0010\u00a6\u00ce\u00f7\u00adm\u00d9k\u0096`z$\u00d7\u0097\u00e9\u00b6a\u00a8\u00ffm\u00ae\u00b1\t=".length();
                        var10_12 = 0;
                        while (true) {
                            break block49;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block50;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                yy_2.e = var14_8;
                yy_2.f = new Integer[3];
                var0_14 = 7666071156933988036L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "\u001a7\u00f8sh6\u00a6=Bu=\u00ff\u00aan\u00b65";
                var5_18 = "\u001a7\u00f8sh6\u00a6=Bu=\u00ff\u00aan\u00b65".length();
                var2_19 = 0;
                while (true) {
                    break block51;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block52;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        yy_2.i = var6_15;
        yy_2.k = new Long[2];
        yy_2.a = yy_2.a(19606, -5634);
        yy_2.O = yy_2.a(19618, 19220);
        yy_2.j = yy_2.a(19612, -1239);
        yy_2.J = yy_2.a(19617, 28795);
        yy_2.W = yy_2.a(32034, 3648035473590867244L);
        yy_2.B = yy_2.a(19626, -4540);
        yy_2.V = yy_2.a(19616, 12826) + (String)yy_2.B;
        try {
            v19 = lk_0.B(yy_2.a(19636, -2252));
        }
        catch (InvocationTargetException v20) {
            throw v20.getTargetException();
        }
        yy_2.Y = v19;
        var23_21 = "";
        try {
            v21 = (Boolean)vk_0.j();
        }
        catch (InvocationTargetException v22) {
            throw v22.getTargetException();
        }
        if (v21) {
            var23_21 = yy_2.a(19604, 25445);
        } else {
            try {
                v23 = (Boolean)vk_0.R();
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
            if (v23) {
                var23_21 = yy_2.a(19600, -16970);
            } else {
                try {
                    v25 = (Boolean)vk_0.E();
                }
                catch (InvocationTargetException v26) {
                    throw v26.getTargetException();
                }
                if (v25) {
                    var23_21 = yy_2.a(19597, -25008);
                }
            }
        }
        try {
            v27 = (Boolean)vk_0.s();
        }
        catch (InvocationTargetException v28) {
            throw v28.getTargetException();
        }
        if (v27) {
            yy_2.P = (String)yy_2.Y + yy_2.a(19609, 17913) + var23_21 + yy_2.a(19643, 23119);
            yy_2.s = yy_2.a(19629, -7811);
            yy_2.t = yy_2.a(19634, 24180);
        } else {
            try {
                v29 = (Boolean)vk_0.g();
            }
            catch (InvocationTargetException v30) {
                throw v30.getTargetException();
            }
            if (v29) {
                yy_2.P = (String)yy_2.Y + yy_2.a(19625, 4906) + var23_21 + yy_2.a(19602, 25881);
                yy_2.s = yy_2.a(19611, -24314);
                yy_2.t = yy_2.a(19601, 13475);
            } else {
                try {
                    v31 = (Boolean)vk_0.f();
                }
                catch (InvocationTargetException v32) {
                    throw v32.getTargetException();
                }
                if (v31) {
                    yy_2.P = (String)yy_2.Y + yy_2.a(19608, 18605) + var23_21 + yy_2.a(19602, 25881);
                    yy_2.s = yy_2.a(19607, 7019);
                    yy_2.t = yy_2.a(19592, 452);
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4C83) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 70;
                    break;
                }
                case 1: {
                    n14 = 148;
                    break;
                }
                case 2: {
                    n14 = 81;
                    break;
                }
                case 3: {
                    n14 = 21;
                    break;
                }
                case 4: {
                    n14 = 89;
                    break;
                }
                case 5: {
                    n14 = 154;
                    break;
                }
                case 6: {
                    n14 = 166;
                    break;
                }
                case 7: {
                    n14 = 41;
                    break;
                }
                case 8: {
                    n14 = 139;
                    break;
                }
                case 9: {
                    n14 = 156;
                    break;
                }
                case 10: {
                    n14 = 228;
                    break;
                }
                case 11: {
                    n14 = 162;
                    break;
                }
                case 12: {
                    n14 = 77;
                    break;
                }
                case 13: {
                    n14 = 54;
                    break;
                }
                case 14: {
                    n14 = 179;
                    break;
                }
                case 15: {
                    n14 = 240;
                    break;
                }
                case 16: {
                    n14 = 180;
                    break;
                }
                case 17: {
                    n14 = 211;
                    break;
                }
                case 18: {
                    n14 = 109;
                    break;
                }
                case 19: {
                    n14 = 242;
                    break;
                }
                case 20: {
                    n14 = 74;
                    break;
                }
                case 21: {
                    n14 = 208;
                    break;
                }
                case 22: {
                    n14 = 251;
                    break;
                }
                case 23: {
                    n14 = 31;
                    break;
                }
                case 24: {
                    n14 = 73;
                    break;
                }
                case 25: {
                    n14 = 0;
                    break;
                }
                case 26: {
                    n14 = 150;
                    break;
                }
                case 27: {
                    n14 = 198;
                    break;
                }
                case 28: {
                    n14 = 186;
                    break;
                }
                case 29: {
                    n14 = 79;
                    break;
                }
                case 30: {
                    n14 = 71;
                    break;
                }
                case 31: {
                    n14 = 220;
                    break;
                }
                case 32: {
                    n14 = 15;
                    break;
                }
                case 33: {
                    n14 = 203;
                    break;
                }
                case 34: {
                    n14 = 96;
                    break;
                }
                case 35: {
                    n14 = 193;
                    break;
                }
                case 36: {
                    n14 = 231;
                    break;
                }
                case 37: {
                    n14 = 19;
                    break;
                }
                case 38: {
                    n14 = 112;
                    break;
                }
                case 39: {
                    n14 = 28;
                    break;
                }
                case 40: {
                    n14 = 205;
                    break;
                }
                case 41: {
                    n14 = 183;
                    break;
                }
                case 42: {
                    n14 = 236;
                    break;
                }
                case 43: {
                    n14 = 185;
                    break;
                }
                case 44: {
                    n14 = 181;
                    break;
                }
                case 45: {
                    n14 = 113;
                    break;
                }
                case 46: {
                    n14 = 241;
                    break;
                }
                case 47: {
                    n14 = 149;
                    break;
                }
                case 48: {
                    n14 = 50;
                    break;
                }
                case 49: {
                    n14 = 27;
                    break;
                }
                case 50: {
                    n14 = 114;
                    break;
                }
                case 51: {
                    n14 = 65;
                    break;
                }
                case 52: {
                    n14 = 14;
                    break;
                }
                case 53: {
                    n14 = 3;
                    break;
                }
                case 54: {
                    n14 = 104;
                    break;
                }
                case 55: {
                    n14 = 153;
                    break;
                }
                case 56: {
                    n14 = 12;
                    break;
                }
                case 57: {
                    n14 = 51;
                    break;
                }
                case 58: {
                    n14 = 10;
                    break;
                }
                case 59: {
                    n14 = 209;
                    break;
                }
                case 60: {
                    n14 = 58;
                    break;
                }
                case 61: {
                    n14 = 217;
                    break;
                }
                case 62: {
                    n14 = 253;
                    break;
                }
                case 63: {
                    n14 = 26;
                    break;
                }
                case 64: {
                    n14 = 233;
                    break;
                }
                case 65: {
                    n14 = 49;
                    break;
                }
                case 66: {
                    n14 = 105;
                    break;
                }
                case 67: {
                    n14 = 177;
                    break;
                }
                case 68: {
                    n14 = 244;
                    break;
                }
                case 69: {
                    n14 = 141;
                    break;
                }
                case 70: {
                    n14 = 219;
                    break;
                }
                case 71: {
                    n14 = 196;
                    break;
                }
                case 72: {
                    n14 = 238;
                    break;
                }
                case 73: {
                    n14 = 161;
                    break;
                }
                case 74: {
                    n14 = 36;
                    break;
                }
                case 75: {
                    n14 = 255;
                    break;
                }
                case 76: {
                    n14 = 17;
                    break;
                }
                case 77: {
                    n14 = 237;
                    break;
                }
                case 78: {
                    n14 = 239;
                    break;
                }
                case 79: {
                    n14 = 151;
                    break;
                }
                case 80: {
                    n14 = 18;
                    break;
                }
                case 81: {
                    n14 = 134;
                    break;
                }
                case 82: {
                    n14 = 252;
                    break;
                }
                case 83: {
                    n14 = 94;
                    break;
                }
                case 84: {
                    n14 = 48;
                    break;
                }
                case 85: {
                    n14 = 63;
                    break;
                }
                case 86: {
                    n14 = 125;
                    break;
                }
                case 87: {
                    n14 = 129;
                    break;
                }
                case 88: {
                    n14 = 32;
                    break;
                }
                case 89: {
                    n14 = 88;
                    break;
                }
                case 90: {
                    n14 = 160;
                    break;
                }
                case 91: {
                    n14 = 227;
                    break;
                }
                case 92: {
                    n14 = 246;
                    break;
                }
                case 93: {
                    n14 = 86;
                    break;
                }
                case 94: {
                    n14 = 5;
                    break;
                }
                case 95: {
                    n14 = 13;
                    break;
                }
                case 96: {
                    n14 = 229;
                    break;
                }
                case 97: {
                    n14 = 59;
                    break;
                }
                case 98: {
                    n14 = 24;
                    break;
                }
                case 99: {
                    n14 = 99;
                    break;
                }
                case 100: {
                    n14 = 69;
                    break;
                }
                case 101: {
                    n14 = 46;
                    break;
                }
                case 102: {
                    n14 = 248;
                    break;
                }
                case 103: {
                    n14 = 101;
                    break;
                }
                case 104: {
                    n14 = 127;
                    break;
                }
                case 105: {
                    n14 = 194;
                    break;
                }
                case 106: {
                    n14 = 53;
                    break;
                }
                case 107: {
                    n14 = 87;
                    break;
                }
                case 108: {
                    n14 = 192;
                    break;
                }
                case 109: {
                    n14 = 201;
                    break;
                }
                case 110: {
                    n14 = 37;
                    break;
                }
                case 111: {
                    n14 = 78;
                    break;
                }
                case 112: {
                    n14 = 207;
                    break;
                }
                case 113: {
                    n14 = 152;
                    break;
                }
                case 114: {
                    n14 = 119;
                    break;
                }
                case 115: {
                    n14 = 22;
                    break;
                }
                case 116: {
                    n14 = 169;
                    break;
                }
                case 117: {
                    n14 = 143;
                    break;
                }
                case 118: {
                    n14 = 178;
                    break;
                }
                case 119: {
                    n14 = 82;
                    break;
                }
                case 120: {
                    n14 = 75;
                    break;
                }
                case 121: {
                    n14 = 7;
                    break;
                }
                case 122: {
                    n14 = 222;
                    break;
                }
                case 123: {
                    n14 = 11;
                    break;
                }
                case 124: {
                    n14 = 131;
                    break;
                }
                case 125: {
                    n14 = 175;
                    break;
                }
                case 126: {
                    n14 = 176;
                    break;
                }
                case 127: {
                    n14 = 204;
                    break;
                }
                case 128: {
                    n14 = 97;
                    break;
                }
                case 129: {
                    n14 = 174;
                    break;
                }
                case 130: {
                    n14 = 80;
                    break;
                }
                case 131: {
                    n14 = 108;
                    break;
                }
                case 132: {
                    n14 = 103;
                    break;
                }
                case 133: {
                    n14 = 68;
                    break;
                }
                case 134: {
                    n14 = 35;
                    break;
                }
                case 135: {
                    n14 = 144;
                    break;
                }
                case 136: {
                    n14 = 218;
                    break;
                }
                case 137: {
                    n14 = 199;
                    break;
                }
                case 138: {
                    n14 = 171;
                    break;
                }
                case 139: {
                    n14 = 243;
                    break;
                }
                case 140: {
                    n14 = 132;
                    break;
                }
                case 141: {
                    n14 = 216;
                    break;
                }
                case 142: {
                    n14 = 44;
                    break;
                }
                case 143: {
                    n14 = 20;
                    break;
                }
                case 144: {
                    n14 = 210;
                    break;
                }
                case 145: {
                    n14 = 85;
                    break;
                }
                case 146: {
                    n14 = 223;
                    break;
                }
                case 147: {
                    n14 = 215;
                    break;
                }
                case 148: {
                    n14 = 164;
                    break;
                }
                case 149: {
                    n14 = 57;
                    break;
                }
                case 150: {
                    n14 = 122;
                    break;
                }
                case 151: {
                    n14 = 195;
                    break;
                }
                case 152: {
                    n14 = 214;
                    break;
                }
                case 153: {
                    n14 = 133;
                    break;
                }
                case 154: {
                    n14 = 8;
                    break;
                }
                case 155: {
                    n14 = 23;
                    break;
                }
                case 156: {
                    n14 = 221;
                    break;
                }
                case 157: {
                    n14 = 163;
                    break;
                }
                case 158: {
                    n14 = 38;
                    break;
                }
                case 159: {
                    n14 = 137;
                    break;
                }
                case 160: {
                    n14 = 64;
                    break;
                }
                case 161: {
                    n14 = 250;
                    break;
                }
                case 162: {
                    n14 = 142;
                    break;
                }
                case 163: {
                    n14 = 182;
                    break;
                }
                case 164: {
                    n14 = 138;
                    break;
                }
                case 165: {
                    n14 = 6;
                    break;
                }
                case 166: {
                    n14 = 247;
                    break;
                }
                case 167: {
                    n14 = 60;
                    break;
                }
                case 168: {
                    n14 = 124;
                    break;
                }
                case 169: {
                    n14 = 157;
                    break;
                }
                case 170: {
                    n14 = 155;
                    break;
                }
                case 171: {
                    n14 = 30;
                    break;
                }
                case 172: {
                    n14 = 254;
                    break;
                }
                case 173: {
                    n14 = 52;
                    break;
                }
                case 174: {
                    n14 = 173;
                    break;
                }
                case 175: {
                    n14 = 61;
                    break;
                }
                case 176: {
                    n14 = 130;
                    break;
                }
                case 177: {
                    n14 = 140;
                    break;
                }
                case 178: {
                    n14 = 92;
                    break;
                }
                case 179: {
                    n14 = 165;
                    break;
                }
                case 180: {
                    n14 = 91;
                    break;
                }
                case 181: {
                    n14 = 45;
                    break;
                }
                case 182: {
                    n14 = 170;
                    break;
                }
                case 183: {
                    n14 = 200;
                    break;
                }
                case 184: {
                    n14 = 146;
                    break;
                }
                case 185: {
                    n14 = 123;
                    break;
                }
                case 186: {
                    n14 = 107;
                    break;
                }
                case 187: {
                    n14 = 191;
                    break;
                }
                case 188: {
                    n14 = 72;
                    break;
                }
                case 189: {
                    n14 = 90;
                    break;
                }
                case 190: {
                    n14 = 147;
                    break;
                }
                case 191: {
                    n14 = 83;
                    break;
                }
                case 192: {
                    n14 = 102;
                    break;
                }
                case 193: {
                    n14 = 188;
                    break;
                }
                case 194: {
                    n14 = 135;
                    break;
                }
                case 195: {
                    n14 = 84;
                    break;
                }
                case 196: {
                    n14 = 206;
                    break;
                }
                case 197: {
                    n14 = 66;
                    break;
                }
                case 198: {
                    n14 = 33;
                    break;
                }
                case 199: {
                    n14 = 126;
                    break;
                }
                case 200: {
                    n14 = 158;
                    break;
                }
                case 201: {
                    n14 = 116;
                    break;
                }
                case 202: {
                    n14 = 184;
                    break;
                }
                case 203: {
                    n14 = 245;
                    break;
                }
                case 204: {
                    n14 = 249;
                    break;
                }
                case 205: {
                    n14 = 235;
                    break;
                }
                case 206: {
                    n14 = 9;
                    break;
                }
                case 207: {
                    n14 = 212;
                    break;
                }
                case 208: {
                    n14 = 98;
                    break;
                }
                case 209: {
                    n14 = 118;
                    break;
                }
                case 210: {
                    n14 = 16;
                    break;
                }
                case 211: {
                    n14 = 2;
                    break;
                }
                case 212: {
                    n14 = 197;
                    break;
                }
                case 213: {
                    n14 = 202;
                    break;
                }
                case 214: {
                    n14 = 226;
                    break;
                }
                case 215: {
                    n14 = 67;
                    break;
                }
                case 216: {
                    n14 = 189;
                    break;
                }
                case 217: {
                    n14 = 55;
                    break;
                }
                case 218: {
                    n14 = 121;
                    break;
                }
                case 219: {
                    n14 = 190;
                    break;
                }
                case 220: {
                    n14 = 62;
                    break;
                }
                case 221: {
                    n14 = 100;
                    break;
                }
                case 222: {
                    n14 = 29;
                    break;
                }
                case 223: {
                    n14 = 159;
                    break;
                }
                case 224: {
                    n14 = 1;
                    break;
                }
                case 225: {
                    n14 = 106;
                    break;
                }
                case 226: {
                    n14 = 224;
                    break;
                }
                case 227: {
                    n14 = 234;
                    break;
                }
                case 228: {
                    n14 = 172;
                    break;
                }
                case 229: {
                    n14 = 47;
                    break;
                }
                case 230: {
                    n14 = 167;
                    break;
                }
                case 231: {
                    n14 = 187;
                    break;
                }
                case 232: {
                    n14 = 117;
                    break;
                }
                case 233: {
                    n14 = 25;
                    break;
                }
                case 234: {
                    n14 = 232;
                    break;
                }
                case 235: {
                    n14 = 39;
                    break;
                }
                case 236: {
                    n14 = 76;
                    break;
                }
                case 237: {
                    n14 = 111;
                    break;
                }
                case 238: {
                    n14 = 225;
                    break;
                }
                case 239: {
                    n14 = 110;
                    break;
                }
                case 240: {
                    n14 = 128;
                    break;
                }
                case 241: {
                    n14 = 213;
                    break;
                }
                case 242: {
                    n14 = 230;
                    break;
                }
                case 243: {
                    n14 = 56;
                    break;
                }
                case 244: {
                    n14 = 43;
                    break;
                }
                case 245: {
                    n14 = 168;
                    break;
                }
                case 246: {
                    n14 = 120;
                    break;
                }
                case 247: {
                    n14 = 136;
                    break;
                }
                case 248: {
                    n14 = 42;
                    break;
                }
                case 249: {
                    n14 = 115;
                    break;
                }
                case 250: {
                    n14 = 34;
                    break;
                }
                case 251: {
                    n14 = 93;
                    break;
                }
                case 252: {
                    n14 = 4;
                    break;
                }
                case 253: {
                    n14 = 95;
                    break;
                }
                case 254: {
                    n14 = 40;
                    break;
                }
                default: {
                    n14 = 145;
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
            yy_2.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x280E;
        if (f[n11] == null) {
            yy_2.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x596F) & Short.MAX_VALUE;
        if (k[n11] == null) {
            yy_2.k[n11] = i[n11] ^ l2;
        }
        return k[n11];
    }
}

