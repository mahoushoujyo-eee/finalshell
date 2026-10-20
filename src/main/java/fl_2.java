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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from fl
 */
public class fl_2
implements c2_0 {
    static String Z;
    static String f;
    static String F;
    static String H;
    static String M;
    static String R;
    public static int u;
    boolean J;
    boolean d;
    static String l;
    Y7 N;
    pz_2 E;
    long S;
    long c;
    boolean v;
    String K;
    String h;
    boolean n;
    boolean O;
    boolean T;
    boolean Y;
    WT Q;
    u5_0 b;
    public static String q;
    Component i;
    private static final String[] a;
    private static final String[] e;
    private static final long[] g;
    private static final Integer[] j;
    private static final long[] k;
    private static final Long[] m;

    public fl_2() {
        this.J = false;
        this.d = false;
        this.E = new pz_2();
        this.v = false;
        this.n = false;
        this.O = false;
        this.T = false;
    }

    public static void E() {
        block13: {
            yt_1 yt_12;
            block12: {
                String[] stringArray = WT.y();
                try {
                    try {
                        yt_12 = (yt_1)yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block12;
                    if (yt_12 == null) break block13;
                }
                catch (IOException iOException) {
                    throw fl_2.a(iOException);
                }
                try {
                    yt_12 = (yt_1)yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                yt_12.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        File file = new File((String)fl_2.H);
        try {
            Process process = Runtime.getRuntime().exec(new String[]{fl_2.a(11103, -27867), fl_2.a(11077, -27240), file.getName()}, null, file.getParentFile());
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

    public static void i() {
        Object object;
        String string = System.getProperty(fl_2.a(11126, 14949));
        if (new File(fl_2.a(11082, 28704)).exists()) {
            // empty if block
        }
        File file = new File((String)dd_1.j + File.separator + (String)fl_2.M);
        file.delete();
        try {
            fl_2.O((Object)new File((String)fl_2.M), (Object)file);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(fl_2.a(11081, -7954), fl_2.a(11083, -26764), "\"" + file.getName() + fl_2.a(11128, 1933) + string + "\"");
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
            fl_2.H(false);
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

    static void v() {
        File file = new File((String)fl_2.H);
        try {
            Process process = Runtime.getRuntime().exec(new String[]{fl_2.a(11103, -27867), fl_2.a(11077, -27240), file.getName()}, null, file.getParentFile());
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
     * Unable to fully structure code
     */
    public void e() {
        block52: {
            block44: {
                block49: {
                    block43: {
                        block42: {
                            this.h = null;
                            v0 = WT.y();
                            this.v = true;
                            var1_1 = v0;
                            this.J = true;
                            this.Y = false;
                            v1 = (WT)this.Q;
                            if (var1_1 != null) break block42;
                            try {
                                block53: {
                                    if (v1 == null) break block43;
                                    break block53;
                                    catch (Exception v2) {
                                        throw fl_2.a(v2);
                                    }
                                }
                                v1 = (WT)this.Q;
                            }
                            catch (Exception v3) {
                                throw fl_2.a(v3);
                            }
                        }
                        try {
                            v1.N();
                        }
                        catch (InvocationTargetException v4) {
                            throw v4.getTargetException();
                        }
                    }
                    for (var2_2 = 0; var2_2 < 3; ++var2_2) {
                        block45: {
                            try {
                                v5 = (String)lk_0.P(5);
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                            var3_3 = (String)fl_2.l + fl_2.a(11118, -10881) + v5;
                            try {
                                v7 = (byte[])this.b.u(var3_3);
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            var4_5 = v7;
                            try {
                                if (var1_1 != null) break block44;
                                if (var4_5 != null) break block45;
                            }
                            catch (Exception v9) {
                                throw fl_2.a(v9);
                            }
                            if (var1_1 == null) continue;
                        }
                        try {
                            block48: {
                                block46: {
                                    block47: {
                                        var5_7 = new String(var4_5, fl_2.a(11102, -10484));
                                        this.N = new Y7(var5_7);
                                        this.Y = true;
                                        v10 = this;
                                        v11 = fl_2.u;
                                        if (var1_1 != null) break block46;
                                        try {
                                            block54: {
                                                try {
                                                    v12 = (Integer)this.N.w();
                                                }
                                                catch (InvocationTargetException v13) {
                                                    throw v13.getTargetException();
                                                }
                                                if (v11 >= v12) break block47;
                                                break block54;
                                                catch (Exception v14) {
                                                    throw fl_2.a(v14);
                                                }
                                            }
                                            v11 = 1;
                                            break block46;
                                        }
                                        catch (Exception v15) {
                                            throw fl_2.a(v15);
                                        }
                                    }
                                    v11 = 0;
                                }
                                v10.v = (boolean)v11;
                                v16 = (WT)this.Q;
                                if (var1_1 != null) break block48;
                                try {
                                    block55: {
                                        if (v16 == null) break block49;
                                        break block55;
                                        catch (Exception v17) {
                                            throw fl_2.a(v17);
                                        }
                                    }
                                    v16 = (WT)this.Q;
                                }
                                catch (Exception v18) {
                                    throw fl_2.a(v18);
                                }
                            }
                            try {
                                v16.N();
                                break;
                            }
                            catch (InvocationTargetException v19) {
                                throw v19.getTargetException();
                            }
                        }
                        catch (Exception var3_4) {
                            block50: {
                                block51: {
                                    v20 = this;
                                    if (var1_1 != null) break block50;
                                    try {
                                        block56: {
                                            if ((WT)v20.Q == null) break block51;
                                            break block56;
                                            catch (Exception v21) {
                                                throw fl_2.a(v21);
                                            }
                                        }
                                        try {
                                            this.Q.N();
                                        }
                                        catch (InvocationTargetException v22) {
                                            throw v22.getTargetException();
                                        }
                                    }
                                    catch (Exception v23) {
                                        throw fl_2.a(v23);
                                    }
                                }
                                var3_4.printStackTrace();
                                v20 = this;
                            }
                            v20.h = fl_2.a(11096, -2450) + (var2_2 + 1);
                            try {
                                Thread.sleep(fl_2.b(8796, 6144777666533136723L));
                                continue;
                            }
                            catch (InterruptedException var4_6) {
                                var4_6.printStackTrace();
                            }
                        }
                        if (var1_1 == null) continue;
                    }
                }
                this.J = false;
            }
            try {
                try {
                    v24 = (WT)this.Q;
                    if (var1_1 != null) ** GOTO lbl152
                    if (v24 == null) break block52;
                }
                catch (Exception v25) {
                    throw fl_2.a(v25);
                }
                v24 = (WT)this.Q;
            }
            catch (Exception v26) {
                throw fl_2.a(v26);
            }
lbl152:
            // 2 sources

            try {
                v24.N();
            }
            catch (InvocationTargetException v27) {
                throw v27.getTargetException();
            }
        }
    }

    public static void o() {
        block4: {
            File[] fileArray;
            String[] stringArray;
            block3: {
                File[] fileArray2 = new File((String)dd_1.j).listFiles();
                stringArray = WT.y();
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

    public void m() {
        Object object;
        block8: {
            String string;
            block9: {
                String[] stringArray = WT.y();
                this.O = true;
                string = (String)dd_1.j + File.separator + (String)fl_2.f;
                String[] stringArray2 = stringArray;
                try {
                    if (stringArray2 != null) break block8;
                    if (!this.T) break block9;
                }
                catch (IOException iOException) {
                    throw fl_2.a(iOException);
                }
                string = (String)dd_1.j + File.separator + (String)fl_2.F;
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

    public void C() {
        block4: {
            String string;
            block5: {
                this.O = true;
                string = (String)dd_1.j + File.separator + (String)fl_2.f;
                String[] stringArray = WT.y();
                try {
                    if (stringArray != null) break block4;
                    if (!this.T) break block5;
                }
                catch (IOException iOException) {
                    throw fl_2.a(iOException);
                }
                string = (String)dd_1.j + File.separator + (String)fl_2.F;
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
    public void L(CH var1_1, Component var2_2) {
        block21: {
            block18: {
                block19: {
                    this.O = true;
                    var4_3 = "";
                    var3_4 = WT.y();
                    try {
                        if (var3_4 != null) break block18;
                        try {
                            v0 = (Integer)this.N.b();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        if (fl_2.u >= v0) break block19;
                    }
                    catch (Exception v2) {
                        throw fl_2.a(v2);
                    }
                    var4_3 = fl_2.a(11097, -27036);
                    this.T = true;
                    if (var3_4 == null) break block21;
                }
                var4_3 = fl_2.a(11074, -15810);
            }
            this.T = false;
        }
        var5_5 = new File((String)dd_1.o + File.separator + var4_3);
        try {
            try {
                lk_0.e((Object)(fl_2.a(11079, -29979) + var4_3), (Object)var5_5.getAbsolutePath(), null);
            }
            catch (InvocationTargetException v3) {
                throw v3.getTargetException();
            }
        }
        catch (Exception var6_6) {
            var6_6.printStackTrace();
        }
        if (!var5_5.exists()) ** GOTO lbl66
        var6_7 = new JPanel();
        var7_8 = new JLabel(fl_2.a(11113, 30196));
        var8_9 = new JPasswordField(fl_2.a(26355, 7097134622435055260L));
        var6_7.add(var7_8);
        var6_7.add(var8_9);
        var9_10 = new String[]{fl_2.a(11122, 592), fl_2.a(11084, -23454)};
        try {
            yt_1.F.J(new tn_2(this, var8_9));
        }
        catch (InvocationTargetException v4) {
            throw v4.getTargetException();
        }
        var10_11 = JOptionPane.showConfirmDialog(null, var6_7, fl_2.a(11108, 23143), 2, -1);
        if (var10_11 == 0) {
            var11_12 = var8_9.getPassword();
            var12_13 = new String(var11_12);
            try {
                lk_0.q((Object)var5_5.getAbsolutePath(), (Object)var12_13, var1_1);
            }
            catch (InvocationTargetException v5) {
                throw v5.getTargetException();
            }
        }
        try {
            if (var3_4 == null) ** GOTO lbl70
lbl66:
            // 2 sources

            var1_1.d(fl_2.a(11111, 2630) + var4_3 + fl_2.a(11135, -30772));
        }
        catch (Exception v6) {
            throw fl_2.a(v6);
        }
lbl70:
        // 2 sources

        this.O = false;
    }

    public void t(CH cH, Component component) {
        block106: {
            fl_2 fl_22;
            block84: {
                block85: {
                    String[] stringArray;
                    block91: {
                        fl_2 fl_23;
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
                                                                                                    this.i = component;
                                                                                                    this.O = true;
                                                                                                    this.S = 0L;
                                                                                                    String[] stringArray2 = WT.y();
                                                                                                    this.c = 0L;
                                                                                                    stringArray = stringArray2;
                                                                                                    this.K = "";
                                                                                                    this.h = null;
                                                                                                    try {
                                                                                                        this.e();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    fl_22 = this;
                                                                                                    if (stringArray != null) break block84;
                                                                                                    if (!fl_22.Y) break block85;
                                                                                                    int n14 = fl_2.u;
                                                                                                    if (stringArray == null) {
                                                                                                        int n15;
                                                                                                        try {
                                                                                                            n15 = (Integer)this.N.w();
                                                                                                        }
                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                        }
                                                                                                        n14 = n14 < n15 ? 1 : 0;
                                                                                                    }
                                                                                                    this.v = n14 != 0;
                                                                                                    bl4 = false;
                                                                                                    boolean bl5 = true;
                                                                                                    file2 = null;
                                                                                                    n13 = this.v;
                                                                                                    if (stringArray != null) break block86;
                                                                                                    if (n13 == 0) break block87;
                                                                                                    bl4 = true;
                                                                                                    this.d = true;
                                                                                                    n13 = fl_2.u;
                                                                                                }
                                                                                                try {
                                                                                                    n12 = (Integer)this.N.b();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                if (n13 < n12) {
                                                                                                    boolean bl5;
                                                                                                    file2 = new File((String)dd_1.j + File.separator + (String)fl_2.F);
                                                                                                    try {
                                                                                                        bl5 = (Boolean)this.J((Object)fl_2.a(11114, -6847), (Object)file2);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    this.n = bl5;
                                                                                                    this.T = true;
                                                                                                } else {
                                                                                                    boolean bl6;
                                                                                                    file2 = new File((String)dd_1.j + File.separator + (String)fl_2.f);
                                                                                                    try {
                                                                                                        bl6 = (Boolean)this.J((Object)fl_2.a(11123, -22940), (Object)file2);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    this.n = bl6;
                                                                                                    this.T = false;
                                                                                                }
                                                                                            }
                                                                                            bl3 = bl4;
                                                                                            if (stringArray != null) break block88;
                                                                                            if (!bl3) break block89;
                                                                                            fl_23 = this;
                                                                                            if (stringArray != null) break block90;
                                                                                            bl3 = fl_23.n;
                                                                                        }
                                                                                        if (!bl3) break block89;
                                                                                        this.v = false;
                                                                                        int n16 = JOptionPane.showConfirmDialog((WT)this.Q, fl_2.a(11109, 415), fl_2.a(11132, 7994), 0);
                                                                                        if (stringArray != null) break block91;
                                                                                        if (n16 != 0) break block89;
                                                                                        bl = this.T;
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
                                                                                            fl_2.H(true);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        try {
                                                                                            fl_2.E();
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
                                                                                    this.m();
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
                                                                                this.C();
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
                                                                fl_2.H(true);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                fl_2.E();
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
                                                        string6 = (String)this.C();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    string5 = string4 = string6;
                                                    if (stringArray != null) break block103;
                                                    if (string5 == null) break block104;
                                                    string5 = fl_2.a(11075, -16805);
                                                }
                                                string3 = string5;
                                                string2 = fl_2.a(11078, 29752) + file2.getAbsolutePath() + " " + string3;
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
                                    string = (String)this.C();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                string4 = string;
                                if (stringArray != null) break block91;
                                if (string4 == null) break block89;
                                string3 = fl_2.a(11119, 2195);
                                string2 = fl_2.a(11106, 18744) + file2.getAbsolutePath() + " " + string3;
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
                            fl_23 = this;
                        }
                        fl_23.d = false;
                    }
                    if (stringArray == null) break block106;
                }
                this.d = false;
                fl_22 = this;
            }
            fl_22.h = fl_2.a(11120, -11932);
        }
        this.J = false;
        this.O = false;
        this.v = true;
    }

    String C() {
        String string = null;
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel(fl_2.a(11130, 20078));
        JPasswordField jPasswordField = new JPasswordField(fl_2.a(22620, 8553306932841261106L));
        jPanel.add(jLabel);
        jPanel.add(jPasswordField);
        Object[] objectArray = new String[]{fl_2.a(11121, -18354), fl_2.a(11112, 17478)};
        try {
            yt_1.F.J(new zl_0(this, jPasswordField));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = JOptionPane.showOptionDialog((Component)this.i, jPanel, fl_2.a(11073, 11614), 1, -1, null, objectArray, objectArray[0]);
        if (n10 == 0) {
            char[] cArray = jPasswordField.getPassword();
            string = new String(cArray);
        }
        return string;
    }

    void b(String string, String string2) {
        try {
            fl_2.O((Object)new File(string), (Object)new File(string2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void z() {
        if (this.T) {
            // empty if block
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean J(String var1_1, File var2_2) {
        block37: {
            block40: {
                var4_3 = false;
                var3_4 = WT.y();
                try {
                    for (var5_5 = 0; var5_5 < 2; ++var5_5) {
                        block39: {
                            block38: {
                                block43: {
                                    block42: {
                                        block41: {
                                            try {
                                                v0 = (mE)this.N.v(var1_1);
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
                                            var7_9 = v2 + fl_2.a(11116, 24153) + v4;
                                            try {
                                                v6 = (Long)lk_0.h(var7_9);
                                            }
                                            catch (InvocationTargetException v7) {
                                                throw v7.getTargetException();
                                            }
                                            var8_11 = v6;
                                            this.S = var8_11;
                                            v8 = this;
                                            v9 = var1_1;
                                            if (var3_4 != null) ** GOTO lbl110
                                            v8.K = v9;
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
                                                throw fl_2.a(v12);
                                            }
                                        }
                                        if (!v11) ** GOTO lbl105
                                        break block42;
                                        catch (Exception v13) {
                                            throw fl_2.a(v13);
                                        }
                                    }
                                    v14 = var2_2;
                                    if (var3_4 != null) break block38;
                                    break block43;
                                    catch (Exception v15) {
                                        throw fl_2.a(v15);
                                    }
                                }
                                try {
                                    block44: {
                                        if (v14.length() <= 0L) ** GOTO lbl105
                                        break block44;
                                        catch (Exception v16) {
                                            throw fl_2.a(v16);
                                        }
                                    }
                                    v14 = var2_2;
                                }
                                catch (Exception v17) {
                                    throw fl_2.a(v17);
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
                                throw fl_2.a(v22);
                            }
                            var4_3 = true;
                            if (var3_4 == null) break block40;
                        }
                        try {
                            this.h = fl_2.a(11134, -2968) + var1_1 + " " + (var5_5 + 1);
lbl103:
                            // 2 sources

                            try {
                                if (var3_4 == null) continue;
lbl105:
                                // 3 sources

                                v8 = this;
                                v9 = fl_2.a(11087, -15915) + var1_1 + " " + (var5_5 + 1);
                            }
                            catch (Exception v23) {
                                throw fl_2.a(v23);
                            }
lbl110:
                            // 2 sources

                            v8.h = v9;
                            continue;
                        }
                        catch (Exception var6_8) {
                            this.h = fl_2.a(11099, -21336) + var1_1 + " " + (var5_5 + 1);
                            try {
                                Thread.sleep(fl_2.b(6417, 2387517913693430303L));
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

    public static boolean o() {
        boolean bl = false;
        bl = new File((String)fl_2.Z).exists();
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean H(boolean var0) {
        block12: {
            block11: {
                block13: {
                    var2_1 = new File((String)fl_2.Z);
                    var1_2 = WT.y();
                    v0 = var0;
                    if (var1_2 != null) break block11;
                    if (!v0) ** GOTO lbl31
                    break block13;
                    catch (IOException v1) {
                        throw fl_2.a(v1);
                    }
                }
                try {
                    block14: {
                        v2 = var2_1.exists();
                        if (var1_2 != null) break block12;
                        break block14;
                        catch (IOException v3) {
                            throw fl_2.a(v3);
                        }
                    }
                    if (v2) break block11;
                }
                catch (IOException v4) {
                    throw fl_2.a(v4);
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
                        throw fl_2.a(v5);
                    }
                }
            }
            v2 = var0;
        }
        return v2;
    }

    public static void K() {
    }

    public boolean h() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public boolean N() {
        return this.v;
    }

    public void F(boolean bl) {
        this.v = bl;
    }

    public boolean O() {
        return this.J;
    }

    public void p(boolean bl) {
        this.J = bl;
    }

    public Y7 B() {
        return (Y7)this.N;
    }

    public void A(Y7 y7) {
        this.N = y7;
    }

    @Override
    public void t(long l2) {
        this.c = l2;
    }

    public String x() {
        return (String)this.K;
    }

    public void M(String string) {
        this.K = string;
    }

    public long R() {
        return this.S;
    }

    public void e(long l2) {
        this.S = l2;
    }

    public long L() {
        return this.c;
    }

    public void Z(long l2) {
        this.c = l2;
    }

    public String b() {
        return (String)this.h;
    }

    public void w(String string) {
        this.h = string;
    }

    public boolean P() {
        return this.O;
    }

    public void n(boolean bl) {
        this.O = bl;
    }

    public boolean A() {
        return this.n;
    }

    public void E(boolean bl) {
        this.n = bl;
    }

    public boolean g() {
        return this.Y;
    }

    public void U(boolean bl) {
        this.Y = bl;
    }

    public static void O(File file, File file2) {
        try {
            FileUtils.copyFile(file, file2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static boolean u(FileChannel fileChannel, FileChannel fileChannel2) {
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
    public static boolean E(File file) {
        String[] stringArray = WT.y();
        boolean bl = file.exists();
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = file.mkdirs();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public WT t() {
        return (WT)this.Q;
    }

    public void G(WT wT) {
        this.Q = wT;
    }

    public u5_0 d() {
        return (u5_0)this.b;
    }

    public void w(u5_0 u5_02) {
        this.b = u5_02;
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
                                var21 = new String[55];
                                var19_1 = 0;
                                var18_2 = ">{\u001f\u00078w\u00ab\t<\u00ffp\u0006\u8f37\u5154\u7c67\u7eac\u5b9b\u78f8\u0002\u5355\u6d19*\u00ce\u000b\u00fb\u00f8x\u0007z\u00a9\u001d\u00e60-k\u00bc\u0099'\u00d0\u00dd\u008a=\n\u00ce\u00fb)\u0000\u00aau\u00d2|\u00c0\u00d0\r\u00e0\u00d7CHX7\u00f4X\\\u0088\u0003\u0019\u0016]\u0016\u00d1ae9VQ\u0095\u0098\u0082-\u00de\u0018I\u00e24\u0019\u008b2\u008b\u008a47\u0003@\u001ev\u000bh\u00e3)S\u008c\n\u00e2/\u00be\u00da\u0000\u0007\u00df\u00e7\u00c7\u00e3\u009ev\u00ad\u0015\u0000f!C\u000e\u00bc?\u00f8t_\u00df:y\\\u00feU\u0099\u001571\u00b4\u0016\u0017=\u00bd\u00b2M \u00f6\u00b6\u00ee\u00e8S\u00a0\u00f8\u00f5\u0002\u00fbMnS\u00002@\u0006\u4efa\u8fa4\u5b27\u88b3\u8173\u676f\u000e\u00aa\u00c3\nm\u00bb\u00db(\u00c95\u0007Y^\u00e9H\u0012\u4e7b\u8f87\u666a\u65a2\u5b9e\u62aa4\u7a46\u5365\u5192\u956c\u7a71\u5e1a\u8f49\u88bb\u6644\u6599\u00ed\u000e\u008a\u00c0S\u00ee\u00d7|@\u0000\u0018\u00a5Y\u00f3\u0088N\u000eZu\u0014\u00bbx\u0001P\u0092:l\u00b8<\u00cc\u00fd\u0006\u8f97\u5195\u7c73\u7e94\u5b19\u78ff\u0015\u00a4\u00ba\u00b5\u00d8\u009c\u00cfm\u0096>\u0092\u0096\u0083Pk\u00db\u00b25\u00c5\u00b1\u008c=\br\u00e3\u00a2\u00a6x\u0097\u00b9\u00cf\u0003\u59d0\u8d95\u009c\u0006\u00d98U\u95c6\u8be3\u008a\u0005\u00b2\u0018U{\u00ec\u0002\u6d66\u60b0\u0006\u00c3\u0090\\=\"\u00c7\u0004\u783e\u5b90\u00ce\u00da\u0002\u785f\u5b29\u0006\u6859\u67fb\u669c\u65a6\u59fd\u8d1fPc\u0091\u00a97\u00c4\u0086\u00ae\u00c0+\u00efc7\u00ef(\u00bba\u009e\u00d6GC=\u00b7z\u00e5\u00afyTZ\u00fdMa\\)f\u00cbj\u00f3\u00b8\u001e\u0011$\u00f3\u0007D.\u00fc\u00ae\u00c0\u00da%\r\u0086a\u00f0W:\u00ff_\u00dc\u00fe\nB'JU\u009b\u00edY\u00d3\u00d3\u00bb\u000b'\u0094\u00dd\u0090\u001e\u00be\u00a5H\b\u0016+\u00e7:.W\u0091\u00ba\u0016D\u0086\u00d7\u00c5\u0000\u00ce_k\u00dbS\u00f5\u00d7,\u001b\u0098&\u001e\u00d59cq\u00bf\u0015\u00ccH5\u00ee\u00ef\u0003\n.\u00eb\u00c8\u0004\u00e8w\u00d4\u00b8\u008b\u0004\u00a6\u00ec\u000f\u00e7\u0002&S\u0016N\reF\u00e5\u0016K\u0085\u00ee\u00be<kr\u00f9\u0013\u00d3KlN\u00b7\u008c\u00b2\u0003g\u008b\u001c\u0007\u0017\u009c\u00f7O.4\u00ac\u0005\u4fe0\u5b5d\u59d0\u8ded\u0018\u001a\u0013\u0012=W]\u009c\u00f4!\u00ae\u001a[\u00fe\u00f9>\"\u0082IA\u00a2\u00e0F\u00eb\u00a1\u00fd\u0097&\u0014\u0091\u00c5m\u00adW\u00c3\u00b5\u00ca\u0086g^T^\u00d30\u0098h.\u00ba\u00c8\u0002\u5331\u6db98W\u0082\u00cby^p\u009f\u00e1\u00b1\u0083\u0093o\u00cb\u00b7\u00e8lf\u00986E\u0099>\u0003\u00f9\u009f\u008a \u00ba\u009fS\u00cd\u001fzm\r\u00daH\u0015E-\u00dd\"i\u00der\u00ce\u00b4\u00af\u00c9G\t\u00d6\u00ded\u0019\u000f\u001fF\u00c1\u0097-\b\u00d3^\u00c8\u00fb'\u00f1Y\u00ac\u00ca\u0088\u001c\u001c\u0092\b\u0097\n\u00b7I\u00b6\u009d\u00f5?U}\u009e\u00b7\u0002\u66c1\u65a0\u0017\u009c\u00bc\u00b2\u0018|\u00d7q\u0095\u00bd\u00f2\u00e6\u008f^\u00ea\u001a\u0098\u0005\u00d4\u00b5\u001e\u00ff\u00f8\u0000\"g\u00c8f\u00a3px\u00ea\u0097\u00d9\u00d4\u00e5\u0018\u0005Q|\u00e5k\u0003\u0010\u00dd\u001d\u00f5\u00f8\u0088\u008b\u0081\u00a6\n\u00eb\u00b4f@\u00c7\u0087\u0007\u00df\u00b0\u00c7\t\u009e+\u00ad\u0002\u00b0\u00f7\u00058\u00b8\u00bc-V\u0005\u4e72\u8f1c\u598e\u8d44\u00d3\u000e\u00115}\u00b3U\u0000\u00f5\u00b2\u008eh.\u00b3\u0007\u00f5\u001b\u0092_\r\u00fe[\u00a94\u0087\u00b6\u00ceXd\u0099m.\u00e8\u00c8\f\u0092DY\u00cd#\u00f9\u00a1\u000e\u00ff\u0007\u68a1\u6708\u6683\u65d8\u591e\u8dd0\"\u0003\u00a0L\u00e4";
                                var20_3 = ">{\u001f\u00078w\u00ab\t<\u00ffp\u0006\u8f37\u5154\u7c67\u7eac\u5b9b\u78f8\u0002\u5355\u6d19*\u00ce\u000b\u00fb\u00f8x\u0007z\u00a9\u001d\u00e60-k\u00bc\u0099'\u00d0\u00dd\u008a=\n\u00ce\u00fb)\u0000\u00aau\u00d2|\u00c0\u00d0\r\u00e0\u00d7CHX7\u00f4X\\\u0088\u0003\u0019\u0016]\u0016\u00d1ae9VQ\u0095\u0098\u0082-\u00de\u0018I\u00e24\u0019\u008b2\u008b\u008a47\u0003@\u001ev\u000bh\u00e3)S\u008c\n\u00e2/\u00be\u00da\u0000\u0007\u00df\u00e7\u00c7\u00e3\u009ev\u00ad\u0015\u0000f!C\u000e\u00bc?\u00f8t_\u00df:y\\\u00feU\u0099\u001571\u00b4\u0016\u0017=\u00bd\u00b2M \u00f6\u00b6\u00ee\u00e8S\u00a0\u00f8\u00f5\u0002\u00fbMnS\u00002@\u0006\u4efa\u8fa4\u5b27\u88b3\u8173\u676f\u000e\u00aa\u00c3\nm\u00bb\u00db(\u00c95\u0007Y^\u00e9H\u0012\u4e7b\u8f87\u666a\u65a2\u5b9e\u62aa4\u7a46\u5365\u5192\u956c\u7a71\u5e1a\u8f49\u88bb\u6644\u6599\u00ed\u000e\u008a\u00c0S\u00ee\u00d7|@\u0000\u0018\u00a5Y\u00f3\u0088N\u000eZu\u0014\u00bbx\u0001P\u0092:l\u00b8<\u00cc\u00fd\u0006\u8f97\u5195\u7c73\u7e94\u5b19\u78ff\u0015\u00a4\u00ba\u00b5\u00d8\u009c\u00cfm\u0096>\u0092\u0096\u0083Pk\u00db\u00b25\u00c5\u00b1\u008c=\br\u00e3\u00a2\u00a6x\u0097\u00b9\u00cf\u0003\u59d0\u8d95\u009c\u0006\u00d98U\u95c6\u8be3\u008a\u0005\u00b2\u0018U{\u00ec\u0002\u6d66\u60b0\u0006\u00c3\u0090\\=\"\u00c7\u0004\u783e\u5b90\u00ce\u00da\u0002\u785f\u5b29\u0006\u6859\u67fb\u669c\u65a6\u59fd\u8d1fPc\u0091\u00a97\u00c4\u0086\u00ae\u00c0+\u00efc7\u00ef(\u00bba\u009e\u00d6GC=\u00b7z\u00e5\u00afyTZ\u00fdMa\\)f\u00cbj\u00f3\u00b8\u001e\u0011$\u00f3\u0007D.\u00fc\u00ae\u00c0\u00da%\r\u0086a\u00f0W:\u00ff_\u00dc\u00fe\nB'JU\u009b\u00edY\u00d3\u00d3\u00bb\u000b'\u0094\u00dd\u0090\u001e\u00be\u00a5H\b\u0016+\u00e7:.W\u0091\u00ba\u0016D\u0086\u00d7\u00c5\u0000\u00ce_k\u00dbS\u00f5\u00d7,\u001b\u0098&\u001e\u00d59cq\u00bf\u0015\u00ccH5\u00ee\u00ef\u0003\n.\u00eb\u00c8\u0004\u00e8w\u00d4\u00b8\u008b\u0004\u00a6\u00ec\u000f\u00e7\u0002&S\u0016N\reF\u00e5\u0016K\u0085\u00ee\u00be<kr\u00f9\u0013\u00d3KlN\u00b7\u008c\u00b2\u0003g\u008b\u001c\u0007\u0017\u009c\u00f7O.4\u00ac\u0005\u4fe0\u5b5d\u59d0\u8ded\u0018\u001a\u0013\u0012=W]\u009c\u00f4!\u00ae\u001a[\u00fe\u00f9>\"\u0082IA\u00a2\u00e0F\u00eb\u00a1\u00fd\u0097&\u0014\u0091\u00c5m\u00adW\u00c3\u00b5\u00ca\u0086g^T^\u00d30\u0098h.\u00ba\u00c8\u0002\u5331\u6db98W\u0082\u00cby^p\u009f\u00e1\u00b1\u0083\u0093o\u00cb\u00b7\u00e8lf\u00986E\u0099>\u0003\u00f9\u009f\u008a \u00ba\u009fS\u00cd\u001fzm\r\u00daH\u0015E-\u00dd\"i\u00der\u00ce\u00b4\u00af\u00c9G\t\u00d6\u00ded\u0019\u000f\u001fF\u00c1\u0097-\b\u00d3^\u00c8\u00fb'\u00f1Y\u00ac\u00ca\u0088\u001c\u001c\u0092\b\u0097\n\u00b7I\u00b6\u009d\u00f5?U}\u009e\u00b7\u0002\u66c1\u65a0\u0017\u009c\u00bc\u00b2\u0018|\u00d7q\u0095\u00bd\u00f2\u00e6\u008f^\u00ea\u001a\u0098\u0005\u00d4\u00b5\u001e\u00ff\u00f8\u0000\"g\u00c8f\u00a3px\u00ea\u0097\u00d9\u00d4\u00e5\u0018\u0005Q|\u00e5k\u0003\u0010\u00dd\u001d\u00f5\u00f8\u0088\u008b\u0081\u00a6\n\u00eb\u00b4f@\u00c7\u0087\u0007\u00df\u00b0\u00c7\t\u009e+\u00ad\u0002\u00b0\u00f7\u00058\u00b8\u00bc-V\u0005\u4e72\u8f1c\u598e\u8d44\u00d3\u000e\u00115}\u00b3U\u0000\u00f5\u00b2\u008eh.\u00b3\u0007\u00f5\u001b\u0092_\r\u00fe[\u00a94\u0087\u00b6\u00ceXd\u0099m.\u00e8\u00c8\f\u0092DY\u00cd#\u00f9\u00a1\u000e\u00ff\u0007\u68a1\u6708\u6683\u65d8\u591e\u8dd0\"\u0003\u00a0L\u00e4".length();
                                var17_4 = 3;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 1;
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
                                    var18_2 = "0\u0012\u00f2w+\u0005\u00bc7FL\\";
                                    var20_3 = "0\u0012\u00f2w+\u0005\u00bc7FL\\".length();
                                    var17_4 = 5;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 124;
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
                                            v15 = 15;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 27;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 91;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 114;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 39;
                                            break;
                                        }
                                        default: {
                                            v15 = 24;
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
                        fl_2.a = var21;
                        fl_2.e = new String[55];
                        var8_7 = 1798261322252192186L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u00cf\u0018\u001d\u00e1#t\u009f,@\u00148b\u0094\u00c9!\u0082\nS\u00b8\u009bp\u00b1f\u0019";
                        var13_11 = "\u00cf\u0018\u001d\u00e1#t\u009f,@\u00148b\u0094\u00c9!\u0082\nS\u00b8\u009bp\u00b1f\u0019".length();
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
                fl_2.g = var14_8;
                fl_2.j = new Integer[3];
                var0_14 = 4011907690471214868L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "\u0016\u008f\u0002-N\u00a5\u00ec\u00ffb\u00eb\u008ar\u00efG\u00dd\u00ff";
                var5_18 = "\u0016\u008f\u0002-N\u00a5\u00ec\u00ffb\u00eb\u008ar\u00efG\u00dd\u00ff".length();
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
        fl_2.k = var6_15;
        fl_2.m = new Long[2];
        fl_2.Z = fl_2.a(11107, 18128);
        fl_2.H = fl_2.a(11131, -5867);
        fl_2.M = fl_2.a(11124, 16559);
        fl_2.R = fl_2.a(11085, -29746);
        fl_2.u = fl_2.a(7913, 2790922011958570628L);
        try {
            v19 = lk_0.B(fl_2.a(11127, 22708));
        }
        catch (InvocationTargetException v20) {
            throw v20.getTargetException();
        }
        fl_2.q = v19;
        var23_21 = "";
        try {
            v21 = (Boolean)vk_0.j();
        }
        catch (InvocationTargetException v22) {
            throw v22.getTargetException();
        }
        if (v21) {
            var23_21 = fl_2.a(11076, -19911);
        } else {
            try {
                v23 = (Boolean)vk_0.R();
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
            if (v23) {
                var23_21 = fl_2.a(11115, 18746);
            } else {
                try {
                    v25 = (Boolean)vk_0.E();
                }
                catch (InvocationTargetException v26) {
                    throw v26.getTargetException();
                }
                if (v25) {
                    var23_21 = fl_2.a(11080, 397);
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
            fl_2.l = (String)fl_2.q + fl_2.a(11072, 27734) + var23_21 + fl_2.a(11133, 27027);
            fl_2.F = fl_2.a(11117, 16358);
            fl_2.f = fl_2.a(11086, -7428);
        } else {
            try {
                v29 = (Boolean)vk_0.g();
            }
            catch (InvocationTargetException v30) {
                throw v30.getTargetException();
            }
            if (v29) {
                fl_2.l = (String)fl_2.q + fl_2.a(11129, 9171) + var23_21 + fl_2.a(11101, 23812);
                fl_2.F = fl_2.a(11125, 26526);
                fl_2.f = fl_2.a(11110, -21314);
            } else {
                try {
                    v31 = (Boolean)vk_0.f();
                }
                catch (InvocationTargetException v32) {
                    throw v32.getTargetException();
                }
                if (v31) {
                    fl_2.l = (String)fl_2.q + fl_2.a(11105, 13388) + var23_21 + fl_2.a(11101, 23812);
                    fl_2.F = fl_2.a(11104, 26263);
                    fl_2.f = fl_2.a(11098, 1593);
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2B6B) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 107;
                    break;
                }
                case 1: {
                    n14 = 187;
                    break;
                }
                case 2: {
                    n14 = 6;
                    break;
                }
                case 3: {
                    n14 = 154;
                    break;
                }
                case 4: {
                    n14 = 186;
                    break;
                }
                case 5: {
                    n14 = 5;
                    break;
                }
                case 6: {
                    n14 = 206;
                    break;
                }
                case 7: {
                    n14 = 149;
                    break;
                }
                case 8: {
                    n14 = 165;
                    break;
                }
                case 9: {
                    n14 = 170;
                    break;
                }
                case 10: {
                    n14 = 151;
                    break;
                }
                case 11: {
                    n14 = 139;
                    break;
                }
                case 12: {
                    n14 = 76;
                    break;
                }
                case 13: {
                    n14 = 254;
                    break;
                }
                case 14: {
                    n14 = 43;
                    break;
                }
                case 15: {
                    n14 = 231;
                    break;
                }
                case 16: {
                    n14 = 239;
                    break;
                }
                case 17: {
                    n14 = 60;
                    break;
                }
                case 18: {
                    n14 = 220;
                    break;
                }
                case 19: {
                    n14 = 183;
                    break;
                }
                case 20: {
                    n14 = 156;
                    break;
                }
                case 21: {
                    n14 = 141;
                    break;
                }
                case 22: {
                    n14 = 142;
                    break;
                }
                case 23: {
                    n14 = 87;
                    break;
                }
                case 24: {
                    n14 = 248;
                    break;
                }
                case 25: {
                    n14 = 24;
                    break;
                }
                case 26: {
                    n14 = 26;
                    break;
                }
                case 27: {
                    n14 = 86;
                    break;
                }
                case 28: {
                    n14 = 50;
                    break;
                }
                case 29: {
                    n14 = 129;
                    break;
                }
                case 30: {
                    n14 = 202;
                    break;
                }
                case 31: {
                    n14 = 192;
                    break;
                }
                case 32: {
                    n14 = 230;
                    break;
                }
                case 33: {
                    n14 = 62;
                    break;
                }
                case 34: {
                    n14 = 8;
                    break;
                }
                case 35: {
                    n14 = 72;
                    break;
                }
                case 36: {
                    n14 = 12;
                    break;
                }
                case 37: {
                    n14 = 246;
                    break;
                }
                case 38: {
                    n14 = 54;
                    break;
                }
                case 39: {
                    n14 = 75;
                    break;
                }
                case 40: {
                    n14 = 109;
                    break;
                }
                case 41: {
                    n14 = 144;
                    break;
                }
                case 42: {
                    n14 = 225;
                    break;
                }
                case 43: {
                    n14 = 150;
                    break;
                }
                case 44: {
                    n14 = 126;
                    break;
                }
                case 45: {
                    n14 = 82;
                    break;
                }
                case 46: {
                    n14 = 81;
                    break;
                }
                case 47: {
                    n14 = 238;
                    break;
                }
                case 48: {
                    n14 = 242;
                    break;
                }
                case 49: {
                    n14 = 193;
                    break;
                }
                case 50: {
                    n14 = 137;
                    break;
                }
                case 51: {
                    n14 = 124;
                    break;
                }
                case 52: {
                    n14 = 167;
                    break;
                }
                case 53: {
                    n14 = 30;
                    break;
                }
                case 54: {
                    n14 = 226;
                    break;
                }
                case 55: {
                    n14 = 52;
                    break;
                }
                case 56: {
                    n14 = 235;
                    break;
                }
                case 57: {
                    n14 = 74;
                    break;
                }
                case 58: {
                    n14 = 84;
                    break;
                }
                case 59: {
                    n14 = 245;
                    break;
                }
                case 60: {
                    n14 = 175;
                    break;
                }
                case 61: {
                    n14 = 194;
                    break;
                }
                case 62: {
                    n14 = 13;
                    break;
                }
                case 63: {
                    n14 = 121;
                    break;
                }
                case 64: {
                    n14 = 247;
                    break;
                }
                case 65: {
                    n14 = 148;
                    break;
                }
                case 66: {
                    n14 = 143;
                    break;
                }
                case 67: {
                    n14 = 214;
                    break;
                }
                case 68: {
                    n14 = 155;
                    break;
                }
                case 69: {
                    n14 = 160;
                    break;
                }
                case 70: {
                    n14 = 224;
                    break;
                }
                case 71: {
                    n14 = 95;
                    break;
                }
                case 72: {
                    n14 = 16;
                    break;
                }
                case 73: {
                    n14 = 135;
                    break;
                }
                case 74: {
                    n14 = 114;
                    break;
                }
                case 75: {
                    n14 = 211;
                    break;
                }
                case 76: {
                    n14 = 233;
                    break;
                }
                case 77: {
                    n14 = 131;
                    break;
                }
                case 78: {
                    n14 = 232;
                    break;
                }
                case 79: {
                    n14 = 93;
                    break;
                }
                case 80: {
                    n14 = 116;
                    break;
                }
                case 81: {
                    n14 = 15;
                    break;
                }
                case 82: {
                    n14 = 197;
                    break;
                }
                case 83: {
                    n14 = 159;
                    break;
                }
                case 84: {
                    n14 = 227;
                    break;
                }
                case 85: {
                    n14 = 29;
                    break;
                }
                case 86: {
                    n14 = 55;
                    break;
                }
                case 87: {
                    n14 = 205;
                    break;
                }
                case 88: {
                    n14 = 119;
                    break;
                }
                case 89: {
                    n14 = 229;
                    break;
                }
                case 90: {
                    n14 = 96;
                    break;
                }
                case 91: {
                    n14 = 185;
                    break;
                }
                case 92: {
                    n14 = 44;
                    break;
                }
                case 93: {
                    n14 = 125;
                    break;
                }
                case 94: {
                    n14 = 223;
                    break;
                }
                case 95: {
                    n14 = 190;
                    break;
                }
                case 96: {
                    n14 = 41;
                    break;
                }
                case 97: {
                    n14 = 236;
                    break;
                }
                case 98: {
                    n14 = 207;
                    break;
                }
                case 99: {
                    n14 = 64;
                    break;
                }
                case 100: {
                    n14 = 2;
                    break;
                }
                case 101: {
                    n14 = 201;
                    break;
                }
                case 102: {
                    n14 = 189;
                    break;
                }
                case 103: {
                    n14 = 113;
                    break;
                }
                case 104: {
                    n14 = 90;
                    break;
                }
                case 105: {
                    n14 = 228;
                    break;
                }
                case 106: {
                    n14 = 112;
                    break;
                }
                case 107: {
                    n14 = 10;
                    break;
                }
                case 108: {
                    n14 = 83;
                    break;
                }
                case 109: {
                    n14 = 118;
                    break;
                }
                case 110: {
                    n14 = 37;
                    break;
                }
                case 111: {
                    n14 = 0;
                    break;
                }
                case 112: {
                    n14 = 184;
                    break;
                }
                case 113: {
                    n14 = 147;
                    break;
                }
                case 114: {
                    n14 = 216;
                    break;
                }
                case 115: {
                    n14 = 98;
                    break;
                }
                case 116: {
                    n14 = 34;
                    break;
                }
                case 117: {
                    n14 = 33;
                    break;
                }
                case 118: {
                    n14 = 222;
                    break;
                }
                case 119: {
                    n14 = 46;
                    break;
                }
                case 120: {
                    n14 = 39;
                    break;
                }
                case 121: {
                    n14 = 218;
                    break;
                }
                case 122: {
                    n14 = 67;
                    break;
                }
                case 123: {
                    n14 = 57;
                    break;
                }
                case 124: {
                    n14 = 49;
                    break;
                }
                case 125: {
                    n14 = 161;
                    break;
                }
                case 126: {
                    n14 = 251;
                    break;
                }
                case 127: {
                    n14 = 73;
                    break;
                }
                case 128: {
                    n14 = 145;
                    break;
                }
                case 129: {
                    n14 = 212;
                    break;
                }
                case 130: {
                    n14 = 123;
                    break;
                }
                case 131: {
                    n14 = 38;
                    break;
                }
                case 132: {
                    n14 = 166;
                    break;
                }
                case 133: {
                    n14 = 115;
                    break;
                }
                case 134: {
                    n14 = 89;
                    break;
                }
                case 135: {
                    n14 = 219;
                    break;
                }
                case 136: {
                    n14 = 70;
                    break;
                }
                case 137: {
                    n14 = 200;
                    break;
                }
                case 138: {
                    n14 = 180;
                    break;
                }
                case 139: {
                    n14 = 79;
                    break;
                }
                case 140: {
                    n14 = 28;
                    break;
                }
                case 141: {
                    n14 = 19;
                    break;
                }
                case 142: {
                    n14 = 199;
                    break;
                }
                case 143: {
                    n14 = 66;
                    break;
                }
                case 144: {
                    n14 = 130;
                    break;
                }
                case 145: {
                    n14 = 146;
                    break;
                }
                case 146: {
                    n14 = 153;
                    break;
                }
                case 147: {
                    n14 = 249;
                    break;
                }
                case 148: {
                    n14 = 209;
                    break;
                }
                case 149: {
                    n14 = 77;
                    break;
                }
                case 150: {
                    n14 = 22;
                    break;
                }
                case 151: {
                    n14 = 181;
                    break;
                }
                case 152: {
                    n14 = 18;
                    break;
                }
                case 153: {
                    n14 = 100;
                    break;
                }
                case 154: {
                    n14 = 127;
                    break;
                }
                case 155: {
                    n14 = 27;
                    break;
                }
                case 156: {
                    n14 = 106;
                    break;
                }
                case 157: {
                    n14 = 241;
                    break;
                }
                case 158: {
                    n14 = 68;
                    break;
                }
                case 159: {
                    n14 = 213;
                    break;
                }
                case 160: {
                    n14 = 250;
                    break;
                }
                case 161: {
                    n14 = 53;
                    break;
                }
                case 162: {
                    n14 = 196;
                    break;
                }
                case 163: {
                    n14 = 48;
                    break;
                }
                case 164: {
                    n14 = 252;
                    break;
                }
                case 165: {
                    n14 = 253;
                    break;
                }
                case 166: {
                    n14 = 168;
                    break;
                }
                case 167: {
                    n14 = 195;
                    break;
                }
                case 168: {
                    n14 = 208;
                    break;
                }
                case 169: {
                    n14 = 140;
                    break;
                }
                case 170: {
                    n14 = 78;
                    break;
                }
                case 171: {
                    n14 = 240;
                    break;
                }
                case 172: {
                    n14 = 134;
                    break;
                }
                case 173: {
                    n14 = 182;
                    break;
                }
                case 174: {
                    n14 = 88;
                    break;
                }
                case 175: {
                    n14 = 255;
                    break;
                }
                case 176: {
                    n14 = 31;
                    break;
                }
                case 177: {
                    n14 = 244;
                    break;
                }
                case 178: {
                    n14 = 36;
                    break;
                }
                case 179: {
                    n14 = 117;
                    break;
                }
                case 180: {
                    n14 = 158;
                    break;
                }
                case 181: {
                    n14 = 104;
                    break;
                }
                case 182: {
                    n14 = 136;
                    break;
                }
                case 183: {
                    n14 = 163;
                    break;
                }
                case 184: {
                    n14 = 56;
                    break;
                }
                case 185: {
                    n14 = 63;
                    break;
                }
                case 186: {
                    n14 = 169;
                    break;
                }
                case 187: {
                    n14 = 133;
                    break;
                }
                case 188: {
                    n14 = 1;
                    break;
                }
                case 189: {
                    n14 = 14;
                    break;
                }
                case 190: {
                    n14 = 7;
                    break;
                }
                case 191: {
                    n14 = 103;
                    break;
                }
                case 192: {
                    n14 = 164;
                    break;
                }
                case 193: {
                    n14 = 11;
                    break;
                }
                case 194: {
                    n14 = 4;
                    break;
                }
                case 195: {
                    n14 = 105;
                    break;
                }
                case 196: {
                    n14 = 9;
                    break;
                }
                case 197: {
                    n14 = 191;
                    break;
                }
                case 198: {
                    n14 = 20;
                    break;
                }
                case 199: {
                    n14 = 177;
                    break;
                }
                case 200: {
                    n14 = 178;
                    break;
                }
                case 201: {
                    n14 = 138;
                    break;
                }
                case 202: {
                    n14 = 65;
                    break;
                }
                case 203: {
                    n14 = 59;
                    break;
                }
                case 204: {
                    n14 = 99;
                    break;
                }
                case 205: {
                    n14 = 172;
                    break;
                }
                case 206: {
                    n14 = 3;
                    break;
                }
                case 207: {
                    n14 = 35;
                    break;
                }
                case 208: {
                    n14 = 108;
                    break;
                }
                case 209: {
                    n14 = 171;
                    break;
                }
                case 210: {
                    n14 = 25;
                    break;
                }
                case 211: {
                    n14 = 61;
                    break;
                }
                case 212: {
                    n14 = 188;
                    break;
                }
                case 213: {
                    n14 = 40;
                    break;
                }
                case 214: {
                    n14 = 47;
                    break;
                }
                case 215: {
                    n14 = 174;
                    break;
                }
                case 216: {
                    n14 = 51;
                    break;
                }
                case 217: {
                    n14 = 21;
                    break;
                }
                case 218: {
                    n14 = 203;
                    break;
                }
                case 219: {
                    n14 = 120;
                    break;
                }
                case 220: {
                    n14 = 215;
                    break;
                }
                case 221: {
                    n14 = 210;
                    break;
                }
                case 222: {
                    n14 = 221;
                    break;
                }
                case 223: {
                    n14 = 45;
                    break;
                }
                case 224: {
                    n14 = 94;
                    break;
                }
                case 225: {
                    n14 = 198;
                    break;
                }
                case 226: {
                    n14 = 80;
                    break;
                }
                case 227: {
                    n14 = 58;
                    break;
                }
                case 228: {
                    n14 = 110;
                    break;
                }
                case 229: {
                    n14 = 217;
                    break;
                }
                case 230: {
                    n14 = 42;
                    break;
                }
                case 231: {
                    n14 = 157;
                    break;
                }
                case 232: {
                    n14 = 102;
                    break;
                }
                case 233: {
                    n14 = 32;
                    break;
                }
                case 234: {
                    n14 = 69;
                    break;
                }
                case 235: {
                    n14 = 91;
                    break;
                }
                case 236: {
                    n14 = 97;
                    break;
                }
                case 237: {
                    n14 = 176;
                    break;
                }
                case 238: {
                    n14 = 162;
                    break;
                }
                case 239: {
                    n14 = 132;
                    break;
                }
                case 240: {
                    n14 = 17;
                    break;
                }
                case 241: {
                    n14 = 173;
                    break;
                }
                case 242: {
                    n14 = 152;
                    break;
                }
                case 243: {
                    n14 = 85;
                    break;
                }
                case 244: {
                    n14 = 71;
                    break;
                }
                case 245: {
                    n14 = 179;
                    break;
                }
                case 246: {
                    n14 = 243;
                    break;
                }
                case 247: {
                    n14 = 111;
                    break;
                }
                case 248: {
                    n14 = 23;
                    break;
                }
                case 249: {
                    n14 = 128;
                    break;
                }
                case 250: {
                    n14 = 101;
                    break;
                }
                case 251: {
                    n14 = 204;
                    break;
                }
                case 252: {
                    n14 = 122;
                    break;
                }
                case 253: {
                    n14 = 237;
                    break;
                }
                case 254: {
                    n14 = 92;
                    break;
                }
                default: {
                    n14 = 234;
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
            fl_2.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x706F;
        if (j[n11] == null) {
            fl_2.j[n11] = (int)(g[n11] ^ l2);
        }
        return j[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3B0E) & Short.MAX_VALUE;
        if (m[n11] == null) {
            fl_2.m[n11] = k[n11] ^ l2;
        }
        return m[n11];
    }
}

