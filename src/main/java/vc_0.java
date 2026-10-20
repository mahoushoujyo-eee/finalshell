/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from Vc
 */
public class vc_0
extends JFrame {
    FT D;
    protected tq_2 J;
    JScrollPane e;
    protected JTextField N;
    boolean q;
    String M;
    dx_2 S;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    vc_0() {
        this.q = true;
        this.M = "[w,-,.,*,~]+";
        this.S = null;
        try {
            this.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setDefaultCloseOperation(3);
        JPanel jPanel = (JPanel)this.getContentPane();
        jPanel.setLayout(new MigLayout());
        this.N = new JTextField("");
        try {
            YJ.o(this.N);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel.add((Component)((JTextField)this.N), "width :2000:,height 50::,growx,wrap");
        ((JTextField)this.N).getDocument().addDocumentListener(new gv_0(this));
        this.D = new FT();
        this.J = new tq_2((FT)this.D);
        this.e = new JScrollPane((tq_2)this.J);
        ((JScrollPane)this.e).setOpaque(false);
        ((JScrollPane)this.e).getViewport().setOpaque(false);
        jPanel.add((Component)((JScrollPane)this.e), "width :2000:,height :10000:,growx,growy,wrap");
        this.setSize(vc_0.a(19943, 1727223295693643173L), vc_0.a(12326, 6209234032750633061L));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        try {
            this.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Loose catch block
     */
    void o() {
        block12: {
            int[] nArray = yb_1.Y();
            this.S = new dx_2();
            int[] nArray2 = nArray;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("filelist.txt")));
                String string = "";
                int n10 = 0;
                while ((string = bufferedReader.readLine()) != null) {
                    ArrayList arrayList;
                    block14: {
                        boolean bl;
                        block13: {
                            block15: {
                                if (nArray2 != null) break block12;
                                bl = string.startsWith("/");
                                if (nArray2 != null) break block13;
                                break block15;
                                catch (Exception exception) {
                                    throw vc_0.a(exception);
                                }
                            }
                            try {
                                block16: {
                                    if (!bl) break block14;
                                    break block16;
                                    catch (Exception exception) {
                                        throw vc_0.a(exception);
                                    }
                                }
                                bl = string.endsWith(":");
                            }
                            catch (Exception exception) {
                                throw vc_0.a(exception);
                            }
                        }
                        if (bl) {
                            // empty if block
                        }
                    }
                    ++n10;
                    L1 l1 = new L1("", string.substring(0));
                    try {
                        arrayList = (ArrayList)this.S.V();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList.add(l1);
                    if (nArray2 == null) continue;
                }
                System.out.println("数量: " + n10);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void j() {
        block52: {
            block50: {
                block49: {
                    block48: {
                        v0 = yb_1.Y();
                        try {
                            this.D.g();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        try {
                            v2 = (ArrayList)this.S.V();
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        var2_1 = v2;
                        var3_2 = ((JTextField)this.N).getText().trim();
                        var4_3 = new ArrayList<String>();
                        var5_4 = Pattern.compile((String)this.M);
                        var6_5 = var5_4.matcher(var3_2);
                        var1_6 = v0;
                        while (var6_5.find()) {
                            var7_7 = var6_5.group();
                            var4_3.add(var7_7);
                            if (var1_6 == null) {
                                if (var1_6 == null) continue;
                            }
                            break block48;
                        }
                        var7_7 = var3_2;
                    }
                    if ((var8_8 = var3_2.indexOf(" ")) > -1) {
                        var7_7 = var3_2.substring(0, var8_8);
                    }
                    var9_9 = new HashSet<Object>();
                    var10_11 = var2_1.iterator();
                    while (var10_11.hasNext()) {
                        v4 = var11_13 = (L1)var10_11.next();
                        if (var1_6 != null) break block49;
                        try {
                            v5 = var11_13.A();
                        }
                        catch (InvocationTargetException v6) {
                            throw v6.getTargetException();
                        }
                        try {
                            v7 = (Integer)this.T(v5, var4_3);
                        }
                        catch (InvocationTargetException v8) {
                            throw v8.getTargetException();
                        }
                        try {
                            v4.x(v7);
                        }
                        catch (InvocationTargetException v9) {
                            throw v9.getTargetException();
                        }
                        if (var1_6 == null) continue;
                    }
                    v4 = var2_1.clone();
                }
                var10_11 = (ArrayList)v4;
                try {
                    this.R(var10_11);
                }
                catch (InvocationTargetException v10) {
                    throw v10.getTargetException();
                }
                var11_13 = new ArrayList<E>();
                for (Iterator<E> var13_18 : var2_1) {
                    block54: {
                        block53: {
                            try {
                                v11 = (String)var13_18.A();
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                            var14_19 = v11;
                            v13 = var9_9.contains(var14_19);
                            if (var1_6 != null) break block53;
                            if (v13) break block54;
                            v13 = var14_19.startsWith(var3_2);
                        }
                        if (var1_6 == null && v13) {
                            var11_13.add(var13_18);
                            v13 = var9_9.add(var14_19);
                        }
                    }
                    if (var1_6 == null) continue;
                }
                var12_16 = new ArrayList<E>();
                var13_18 = var10_11.iterator();
                while (var13_18.hasNext()) {
                    var14_19 = (L1)var13_18.next();
                    try {
                        v14 = (String)var14_19.A();
                    }
                    catch (InvocationTargetException v15) {
                        throw v15.getTargetException();
                    }
                    v16 = v14.startsWith(var7_7);
                    if (var1_6 == null) {
                        if (v16) {
                            var12_16.add(0, var14_19);
                        }
                        if (var1_6 == null) continue;
                    }
                    ** GOTO lbl103
                }
                var13_18 = var12_16.iterator();
                do {
                    v16 = var13_18.hasNext();
lbl103:
                    // 2 sources

                    if (!v16) break;
                    var14_19 = (L1)var13_18.next();
                    var10_11.remove(var14_19);
                    var10_11.add(0, var14_19);
                    if (var1_6 != null) break block50;
                } while (var1_6 == null);
                var2_1 = var10_11;
            }
            v17 = var3_2.equals("");
            if (var1_6 == null) {
                v17 = v17 == 0 ? 1 : 0;
            }
            var9_10 = v17;
            v18 = this.q;
            if (var1_6 == null) {
                block51: {
                    if (v18 != 0) {
                        var10_11 = new ArrayList<Object>();
                        for (var11_14 = 0; var11_14 < var2_1.size(); ++var11_14) {
                            var10_11.add((L1)var2_1.get(var2_1.size() - 1 - var11_14));
                            if (var1_6 == null) {
                                if (var1_6 == null) continue;
                            }
                            break block51;
                        }
                        var2_1 = var10_11;
                    }
                }
                v18 = var10_12 = 0;
            }
            while (var10_12 < var2_1.size()) {
                block55: {
                    block56: {
                        var11_15 = (L1)var2_1.get(var2_1.size() - var10_12 - 1);
                        var12_17 = 1;
                        if (var1_6 != null) break block52;
                        v19 = var9_10;
                        if (var1_6 != null) break block55;
                        if (v19 == 0) break block56;
                        try {
                            v19 = (Integer)var11_15.w();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        if (var1_6 != null) break block55;
                        if (v19 == 0) {
                            var12_17 = 0;
                        }
                    }
                    v19 = var12_17;
                }
                if (v19 != 0) {
                    try {
                        this.D.R(var11_15);
                    }
                    catch (InvocationTargetException v21) {
                        throw v21.getTargetException();
                    }
                }
                ++var10_12;
                if (var1_6 == null) continue;
            }
            ((FT)this.D).fireTableDataChanged();
        }
    }

    int T(String string, ArrayList arrayList) {
        int n10;
        block9: {
            int n11;
            int[] nArray;
            ArrayList<String> arrayList2;
            block8: {
                arrayList2 = new ArrayList<String>();
                Pattern pattern = Pattern.compile((String)this.M);
                Matcher matcher = pattern.matcher(string);
                nArray = yb_1.Y();
                while (matcher.find()) {
                    String string2 = matcher.group();
                    n11 = arrayList2.add(string2);
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block8;
                }
                n11 = 0;
            }
            int n12 = n11;
            HashSet<String> hashSet = new HashSet<String>();
            HashSet<String> hashSet2 = new HashSet<String>();
            for (String string3 : arrayList) {
                block10: {
                    boolean bl;
                    boolean bl2 = false;
                    n10 = hashSet.contains(string3) ? 1 : 0;
                    if (nArray != null) break block9;
                    if (n10 != 0) break block10;
                    for (String string4 : arrayList2) {
                        block12: {
                            block13: {
                                boolean bl3;
                                block11: {
                                    bl = string4.contains(string3);
                                    if (nArray != null) break block10;
                                    if (nArray != null) break block11;
                                    if (!bl) break block12;
                                    bl2 = true;
                                    bl3 = hashSet2.contains(string4);
                                }
                                if (nArray != null) break block13;
                                if (bl3) break block12;
                                ++n12;
                                bl3 = hashSet2.add(string4);
                            }
                            if (nArray == null) break;
                        }
                        if (nArray == null) continue;
                    }
                    bl = hashSet.add(string3);
                }
                if (nArray == null) continue;
            }
            n10 = n12;
        }
        return n10;
    }

    void R(ArrayList arrayList) {
        Collections.sort(arrayList, new ld_0(this));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u00ba\u0019*\u0080\u00ae\u00ebx\u00e5\u00c2x\u00cdh\u0082\u00ea\u0012\u00d1l\u0085\u0019\u00d4\u001e\u0000\u00ea\u008c\u009f\u00e0\t\n\u00e4;\u00a9\u00f4\u0085G\u000e,9\u00c8Z\u00ba\u00a0\u00ac\u00b9\r\u00fae\u00ca\u00cbb\u009e\u000e_\u00efTi\u00ee\u001fF.oP\u0080'\u00f8pDjP\u00dc\u009ey\u0086K\u001b\u0001\u00bd \u009er\u001f\u0004\u653b\u91cd\u00a3<";
                        var12_3 = "\u00ba\u0019*\u0080\u00ae\u00ebx\u00e5\u00c2x\u00cdh\u0082\u00ea\u0012\u00d1l\u0085\u0019\u00d4\u001e\u0000\u00ea\u008c\u009f\u00e0\t\n\u00e4;\u00a9\u00f4\u0085G\u000e,9\u00c8Z\u00ba\u00a0\u00ac\u00b9\r\u00fae\u00ca\u00cbb\u009e\u000e_\u00efTi\u00ee\u001fF.oP\u0080'\u00f8pDjP\u00dc\u009ey\u0086K\u001b\u0001\u00bd \u009er\u001f\u0004\u653b\u91cd\u00a3<".length();
                        var9_4 = 35;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 85;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "N8d\u00059n\u0019\u00ac~\u00fc\u00cd\u008f\u0006\u00f3\f\u00f34R^\u00c6 \u00d2\u00d0\u0083~\u001a@";
                            var12_3 = "N8d\u00059n\u0019\u00ac~\u00fc\u00cd\u008f\u0006\u00f3\f\u00f34R^\u00c6 \u00d2\u00d0\u0083~\u001a@".length();
                            var9_4 = 14;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 94;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 18;
                                    break;
                                }
                                case 1: {
                                    v15 = 18;
                                    break;
                                }
                                case 2: {
                                    v15 = 61;
                                    break;
                                }
                                case 3: {
                                    v15 = 46;
                                    break;
                                }
                                case 4: {
                                    v15 = 51;
                                    break;
                                }
                                case 5: {
                                    v15 = 27;
                                    break;
                                }
                                default: {
                                    v15 = 107;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                vc_0.a = var13;
                vc_0.b = new String[5];
                var0_7 = 5172041645175118159L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00c6ah~1n\u00b8\u00ba\u00bc$d\u00a2\u00eb\u00a9\u00c6\u00b2";
                var5_11 = "\u00c6ah~1n\u00b8\u00ba\u00bc$d\u00a2\u00eb\u00a9\u00c6\u00b2".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        vc_0.c = var6_8;
        vc_0.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6B98) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 68;
                    break;
                }
                case 1: {
                    n14 = 36;
                    break;
                }
                case 2: {
                    n14 = 59;
                    break;
                }
                case 3: {
                    n14 = 212;
                    break;
                }
                case 4: {
                    n14 = 253;
                    break;
                }
                case 5: {
                    n14 = 51;
                    break;
                }
                case 6: {
                    n14 = 7;
                    break;
                }
                case 7: {
                    n14 = 96;
                    break;
                }
                case 8: {
                    n14 = 222;
                    break;
                }
                case 9: {
                    n14 = 168;
                    break;
                }
                case 10: {
                    n14 = 234;
                    break;
                }
                case 11: {
                    n14 = 2;
                    break;
                }
                case 12: {
                    n14 = 190;
                    break;
                }
                case 13: {
                    n14 = 11;
                    break;
                }
                case 14: {
                    n14 = 228;
                    break;
                }
                case 15: {
                    n14 = 223;
                    break;
                }
                case 16: {
                    n14 = 109;
                    break;
                }
                case 17: {
                    n14 = 138;
                    break;
                }
                case 18: {
                    n14 = 77;
                    break;
                }
                case 19: {
                    n14 = 172;
                    break;
                }
                case 20: {
                    n14 = 93;
                    break;
                }
                case 21: {
                    n14 = 25;
                    break;
                }
                case 22: {
                    n14 = 94;
                    break;
                }
                case 23: {
                    n14 = 250;
                    break;
                }
                case 24: {
                    n14 = 91;
                    break;
                }
                case 25: {
                    n14 = 160;
                    break;
                }
                case 26: {
                    n14 = 179;
                    break;
                }
                case 27: {
                    n14 = 6;
                    break;
                }
                case 28: {
                    n14 = 147;
                    break;
                }
                case 29: {
                    n14 = 39;
                    break;
                }
                case 30: {
                    n14 = 224;
                    break;
                }
                case 31: {
                    n14 = 141;
                    break;
                }
                case 32: {
                    n14 = 191;
                    break;
                }
                case 33: {
                    n14 = 137;
                    break;
                }
                case 34: {
                    n14 = 169;
                    break;
                }
                case 35: {
                    n14 = 75;
                    break;
                }
                case 36: {
                    n14 = 112;
                    break;
                }
                case 37: {
                    n14 = 40;
                    break;
                }
                case 38: {
                    n14 = 202;
                    break;
                }
                case 39: {
                    n14 = 152;
                    break;
                }
                case 40: {
                    n14 = 192;
                    break;
                }
                case 41: {
                    n14 = 197;
                    break;
                }
                case 42: {
                    n14 = 176;
                    break;
                }
                case 43: {
                    n14 = 182;
                    break;
                }
                case 44: {
                    n14 = 65;
                    break;
                }
                case 45: {
                    n14 = 175;
                    break;
                }
                case 46: {
                    n14 = 200;
                    break;
                }
                case 47: {
                    n14 = 85;
                    break;
                }
                case 48: {
                    n14 = 9;
                    break;
                }
                case 49: {
                    n14 = 164;
                    break;
                }
                case 50: {
                    n14 = 155;
                    break;
                }
                case 51: {
                    n14 = 125;
                    break;
                }
                case 52: {
                    n14 = 206;
                    break;
                }
                case 53: {
                    n14 = 43;
                    break;
                }
                case 54: {
                    n14 = 38;
                    break;
                }
                case 55: {
                    n14 = 127;
                    break;
                }
                case 56: {
                    n14 = 66;
                    break;
                }
                case 57: {
                    n14 = 237;
                    break;
                }
                case 58: {
                    n14 = 34;
                    break;
                }
                case 59: {
                    n14 = 208;
                    break;
                }
                case 60: {
                    n14 = 27;
                    break;
                }
                case 61: {
                    n14 = 230;
                    break;
                }
                case 62: {
                    n14 = 252;
                    break;
                }
                case 63: {
                    n14 = 251;
                    break;
                }
                case 64: {
                    n14 = 117;
                    break;
                }
                case 65: {
                    n14 = 132;
                    break;
                }
                case 66: {
                    n14 = 123;
                    break;
                }
                case 67: {
                    n14 = 146;
                    break;
                }
                case 68: {
                    n14 = 56;
                    break;
                }
                case 69: {
                    n14 = 220;
                    break;
                }
                case 70: {
                    n14 = 5;
                    break;
                }
                case 71: {
                    n14 = 185;
                    break;
                }
                case 72: {
                    n14 = 128;
                    break;
                }
                case 73: {
                    n14 = 8;
                    break;
                }
                case 74: {
                    n14 = 70;
                    break;
                }
                case 75: {
                    n14 = 120;
                    break;
                }
                case 76: {
                    n14 = 143;
                    break;
                }
                case 77: {
                    n14 = 41;
                    break;
                }
                case 78: {
                    n14 = 73;
                    break;
                }
                case 79: {
                    n14 = 63;
                    break;
                }
                case 80: {
                    n14 = 72;
                    break;
                }
                case 81: {
                    n14 = 148;
                    break;
                }
                case 82: {
                    n14 = 140;
                    break;
                }
                case 83: {
                    n14 = 159;
                    break;
                }
                case 84: {
                    n14 = 103;
                    break;
                }
                case 85: {
                    n14 = 204;
                    break;
                }
                case 86: {
                    n14 = 22;
                    break;
                }
                case 87: {
                    n14 = 142;
                    break;
                }
                case 88: {
                    n14 = 209;
                    break;
                }
                case 89: {
                    n14 = 79;
                    break;
                }
                case 90: {
                    n14 = 44;
                    break;
                }
                case 91: {
                    n14 = 183;
                    break;
                }
                case 92: {
                    n14 = 135;
                    break;
                }
                case 93: {
                    n14 = 122;
                    break;
                }
                case 94: {
                    n14 = 111;
                    break;
                }
                case 95: {
                    n14 = 244;
                    break;
                }
                case 96: {
                    n14 = 57;
                    break;
                }
                case 97: {
                    n14 = 129;
                    break;
                }
                case 98: {
                    n14 = 194;
                    break;
                }
                case 99: {
                    n14 = 119;
                    break;
                }
                case 100: {
                    n14 = 76;
                    break;
                }
                case 101: {
                    n14 = 219;
                    break;
                }
                case 102: {
                    n14 = 23;
                    break;
                }
                case 103: {
                    n14 = 214;
                    break;
                }
                case 104: {
                    n14 = 100;
                    break;
                }
                case 105: {
                    n14 = 180;
                    break;
                }
                case 106: {
                    n14 = 28;
                    break;
                }
                case 107: {
                    n14 = 235;
                    break;
                }
                case 108: {
                    n14 = 154;
                    break;
                }
                case 109: {
                    n14 = 153;
                    break;
                }
                case 110: {
                    n14 = 198;
                    break;
                }
                case 111: {
                    n14 = 126;
                    break;
                }
                case 112: {
                    n14 = 81;
                    break;
                }
                case 113: {
                    n14 = 130;
                    break;
                }
                case 114: {
                    n14 = 1;
                    break;
                }
                case 115: {
                    n14 = 20;
                    break;
                }
                case 116: {
                    n14 = 124;
                    break;
                }
                case 117: {
                    n14 = 211;
                    break;
                }
                case 118: {
                    n14 = 231;
                    break;
                }
                case 119: {
                    n14 = 115;
                    break;
                }
                case 120: {
                    n14 = 177;
                    break;
                }
                case 121: {
                    n14 = 207;
                    break;
                }
                case 122: {
                    n14 = 158;
                    break;
                }
                case 123: {
                    n14 = 187;
                    break;
                }
                case 124: {
                    n14 = 144;
                    break;
                }
                case 125: {
                    n14 = 21;
                    break;
                }
                case 126: {
                    n14 = 188;
                    break;
                }
                case 127: {
                    n14 = 95;
                    break;
                }
                case 128: {
                    n14 = 92;
                    break;
                }
                case 129: {
                    n14 = 181;
                    break;
                }
                case 130: {
                    n14 = 55;
                    break;
                }
                case 131: {
                    n14 = 62;
                    break;
                }
                case 132: {
                    n14 = 101;
                    break;
                }
                case 133: {
                    n14 = 203;
                    break;
                }
                case 134: {
                    n14 = 19;
                    break;
                }
                case 135: {
                    n14 = 196;
                    break;
                }
                case 136: {
                    n14 = 98;
                    break;
                }
                case 137: {
                    n14 = 248;
                    break;
                }
                case 138: {
                    n14 = 232;
                    break;
                }
                case 139: {
                    n14 = 35;
                    break;
                }
                case 140: {
                    n14 = 226;
                    break;
                }
                case 141: {
                    n14 = 249;
                    break;
                }
                case 142: {
                    n14 = 90;
                    break;
                }
                case 143: {
                    n14 = 108;
                    break;
                }
                case 144: {
                    n14 = 83;
                    break;
                }
                case 145: {
                    n14 = 110;
                    break;
                }
                case 146: {
                    n14 = 215;
                    break;
                }
                case 147: {
                    n14 = 10;
                    break;
                }
                case 148: {
                    n14 = 107;
                    break;
                }
                case 149: {
                    n14 = 71;
                    break;
                }
                case 150: {
                    n14 = 42;
                    break;
                }
                case 151: {
                    n14 = 136;
                    break;
                }
                case 152: {
                    n14 = 118;
                    break;
                }
                case 153: {
                    n14 = 195;
                    break;
                }
                case 154: {
                    n14 = 170;
                    break;
                }
                case 155: {
                    n14 = 74;
                    break;
                }
                case 156: {
                    n14 = 145;
                    break;
                }
                case 157: {
                    n14 = 88;
                    break;
                }
                case 158: {
                    n14 = 240;
                    break;
                }
                case 159: {
                    n14 = 247;
                    break;
                }
                case 160: {
                    n14 = 116;
                    break;
                }
                case 161: {
                    n14 = 102;
                    break;
                }
                case 162: {
                    n14 = 227;
                    break;
                }
                case 163: {
                    n14 = 105;
                    break;
                }
                case 164: {
                    n14 = 53;
                    break;
                }
                case 165: {
                    n14 = 233;
                    break;
                }
                case 166: {
                    n14 = 162;
                    break;
                }
                case 167: {
                    n14 = 254;
                    break;
                }
                case 168: {
                    n14 = 58;
                    break;
                }
                case 169: {
                    n14 = 241;
                    break;
                }
                case 170: {
                    n14 = 80;
                    break;
                }
                case 171: {
                    n14 = 50;
                    break;
                }
                case 172: {
                    n14 = 64;
                    break;
                }
                case 173: {
                    n14 = 171;
                    break;
                }
                case 174: {
                    n14 = 161;
                    break;
                }
                case 175: {
                    n14 = 60;
                    break;
                }
                case 176: {
                    n14 = 242;
                    break;
                }
                case 177: {
                    n14 = 99;
                    break;
                }
                case 178: {
                    n14 = 67;
                    break;
                }
                case 179: {
                    n14 = 213;
                    break;
                }
                case 180: {
                    n14 = 157;
                    break;
                }
                case 181: {
                    n14 = 24;
                    break;
                }
                case 182: {
                    n14 = 221;
                    break;
                }
                case 183: {
                    n14 = 78;
                    break;
                }
                case 184: {
                    n14 = 47;
                    break;
                }
                case 185: {
                    n14 = 151;
                    break;
                }
                case 186: {
                    n14 = 3;
                    break;
                }
                case 187: {
                    n14 = 166;
                    break;
                }
                case 188: {
                    n14 = 89;
                    break;
                }
                case 189: {
                    n14 = 133;
                    break;
                }
                case 190: {
                    n14 = 16;
                    break;
                }
                case 191: {
                    n14 = 246;
                    break;
                }
                case 192: {
                    n14 = 193;
                    break;
                }
                case 193: {
                    n14 = 236;
                    break;
                }
                case 194: {
                    n14 = 150;
                    break;
                }
                case 195: {
                    n14 = 33;
                    break;
                }
                case 196: {
                    n14 = 45;
                    break;
                }
                case 197: {
                    n14 = 210;
                    break;
                }
                case 198: {
                    n14 = 255;
                    break;
                }
                case 199: {
                    n14 = 4;
                    break;
                }
                case 200: {
                    n14 = 12;
                    break;
                }
                case 201: {
                    n14 = 139;
                    break;
                }
                case 202: {
                    n14 = 131;
                    break;
                }
                case 203: {
                    n14 = 149;
                    break;
                }
                case 204: {
                    n14 = 54;
                    break;
                }
                case 205: {
                    n14 = 30;
                    break;
                }
                case 206: {
                    n14 = 199;
                    break;
                }
                case 207: {
                    n14 = 46;
                    break;
                }
                case 208: {
                    n14 = 201;
                    break;
                }
                case 209: {
                    n14 = 189;
                    break;
                }
                case 210: {
                    n14 = 156;
                    break;
                }
                case 211: {
                    n14 = 121;
                    break;
                }
                case 212: {
                    n14 = 82;
                    break;
                }
                case 213: {
                    n14 = 52;
                    break;
                }
                case 214: {
                    n14 = 245;
                    break;
                }
                case 215: {
                    n14 = 174;
                    break;
                }
                case 216: {
                    n14 = 216;
                    break;
                }
                case 217: {
                    n14 = 186;
                    break;
                }
                case 218: {
                    n14 = 113;
                    break;
                }
                case 219: {
                    n14 = 225;
                    break;
                }
                case 220: {
                    n14 = 17;
                    break;
                }
                case 221: {
                    n14 = 173;
                    break;
                }
                case 222: {
                    n14 = 49;
                    break;
                }
                case 223: {
                    n14 = 178;
                    break;
                }
                case 224: {
                    n14 = 184;
                    break;
                }
                case 225: {
                    n14 = 114;
                    break;
                }
                case 226: {
                    n14 = 106;
                    break;
                }
                case 227: {
                    n14 = 0;
                    break;
                }
                case 228: {
                    n14 = 31;
                    break;
                }
                case 229: {
                    n14 = 29;
                    break;
                }
                case 230: {
                    n14 = 167;
                    break;
                }
                case 231: {
                    n14 = 26;
                    break;
                }
                case 232: {
                    n14 = 32;
                    break;
                }
                case 233: {
                    n14 = 97;
                    break;
                }
                case 234: {
                    n14 = 134;
                    break;
                }
                case 235: {
                    n14 = 14;
                    break;
                }
                case 236: {
                    n14 = 217;
                    break;
                }
                case 237: {
                    n14 = 243;
                    break;
                }
                case 238: {
                    n14 = 86;
                    break;
                }
                case 239: {
                    n14 = 238;
                    break;
                }
                case 240: {
                    n14 = 15;
                    break;
                }
                case 241: {
                    n14 = 37;
                    break;
                }
                case 242: {
                    n14 = 104;
                    break;
                }
                case 243: {
                    n14 = 205;
                    break;
                }
                case 244: {
                    n14 = 61;
                    break;
                }
                case 245: {
                    n14 = 13;
                    break;
                }
                case 246: {
                    n14 = 84;
                    break;
                }
                case 247: {
                    n14 = 239;
                    break;
                }
                case 248: {
                    n14 = 229;
                    break;
                }
                case 249: {
                    n14 = 163;
                    break;
                }
                case 250: {
                    n14 = 165;
                    break;
                }
                case 251: {
                    n14 = 18;
                    break;
                }
                case 252: {
                    n14 = 69;
                    break;
                }
                case 253: {
                    n14 = 48;
                    break;
                }
                case 254: {
                    n14 = 87;
                    break;
                }
                default: {
                    n14 = 218;
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
            vc_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1043;
        if (d[n11] == null) {
            vc_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

