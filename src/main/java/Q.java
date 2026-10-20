/*
 * Decompiled with CFR 0.152.
 */
import com.E8;
import com.c;
import com.pw_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.apache.commons.io.FileUtils;

class Q
implements ActionListener {
    final boolean f;
    final xe_0 F;
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    Q(xe_0 xe_02, boolean bl) {
        this.F = xe_02;
        this.f = bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block120: {
            block119: {
                block118: {
                    block116: {
                        block105: {
                            block103: {
                                block104: {
                                    v0 = Y_.j();
                                    try {
                                        this.F.o.v();
                                    }
                                    catch (InvocationTargetException v1) {
                                        throw v1.getTargetException();
                                    }
                                    try {
                                        v2 = (JTextField)this.F.o.Y();
                                    }
                                    catch (InvocationTargetException v3) {
                                        throw v3.getTargetException();
                                    }
                                    var3_2 = v2;
                                    try {
                                        v4 = (JTextField)this.F.o.K();
                                    }
                                    catch (InvocationTargetException v5) {
                                        throw v5.getTargetException();
                                    }
                                    var4_3 = v4;
                                    var2_4 = v0;
                                    try {
                                        v6 = (JPasswordField)this.F.o.r();
                                    }
                                    catch (InvocationTargetException v7) {
                                        throw v7.getTargetException();
                                    }
                                    var5_5 = v6;
                                    var6_6 = var3_2.getText();
                                    v8 = this.f;
                                    if (var2_4 == null) break block103;
                                    try {
                                        block123: {
                                            if (v8) break block104;
                                            break block123;
                                            catch (Exception v9) {
                                                throw Q.a(v9);
                                            }
                                        }
                                        this.F.w = new ln_1();
                                    }
                                    catch (Exception v10) {
                                        throw Q.a(v10);
                                    }
                                }
                                try {
                                    try {
                                        v11 = (JTextField)this.F.o.K();
                                    }
                                    catch (InvocationTargetException v12) {
                                        throw v12.getTargetException();
                                    }
                                    v13 = v11.getText();
                                    if (var2_4 == null) break block105;
                                    try {
                                        v8 = (Boolean)lk_0.Y(v13);
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                }
                                catch (Exception v15) {
                                    throw Q.a(v15);
                                }
                            }
                            try {
                                if (v8) {
                                    JOptionPane.showMessageDialog((xe_0)this.F, "请输入名称");
                                    var4_3.requestFocus();
                                    return;
                                }
                            }
                            catch (Exception v16) {
                                throw Q.a(v16);
                            }
                            v13 = new String(var5_5.getPassword());
                        }
                        var7_7 = v13;
                        var8_8 = false;
                        var9_9 = "";
                        var10_10 = null;
                        try {
                            block117: {
                                block112: {
                                    block113: {
                                        block115: {
                                            block114: {
                                                block128: {
                                                    block127: {
                                                        block126: {
                                                            block111: {
                                                                block106: {
                                                                    block107: {
                                                                        block108: {
                                                                            block109: {
                                                                                block110: {
                                                                                    block124: {
                                                                                        try {
                                                                                            try {
                                                                                                v17 = (Boolean)lk_0.Y(var6_6);
                                                                                            }
                                                                                            catch (InvocationTargetException v18) {
                                                                                                throw v18.getTargetException();
                                                                                            }
                                                                                            if (var2_4 == null) break block106;
                                                                                            if (v17) break block107;
                                                                                        }
                                                                                        catch (Exception v19) {
                                                                                            throw Q.a(v19);
                                                                                        }
                                                                                        var11_11 = new File(var6_6);
                                                                                        v20 = var6_6;
                                                                                        if (var2_4 == null) break block108;
                                                                                        try {
                                                                                            v21 = (Boolean)lk_0.Y(v20);
                                                                                        }
                                                                                        catch (InvocationTargetException v22) {
                                                                                            throw v22.getTargetException();
                                                                                        }
                                                                                        if (v21) break block109;
                                                                                        break block124;
                                                                                        catch (Exception v23) {
                                                                                            throw Q.a(v23);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block125: {
                                                                                            cfr_temp_0 = var11_11.length() - Q.c;
                                                                                            v24 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                            if (var2_4 == null) break block110;
                                                                                            break block125;
                                                                                            catch (Exception v25) {
                                                                                                throw Q.a(v25);
                                                                                            }
                                                                                        }
                                                                                        if (v24 <= 0) break block109;
                                                                                    }
                                                                                    catch (Exception v26) {
                                                                                        throw Q.a(v26);
                                                                                    }
                                                                                    v24 = 0;
                                                                                }
                                                                                var8_8 = v24;
                                                                                throw new Exception("私钥文件过大,请选择正确文件!");
                                                                            }
                                                                            v20 = var6_6;
                                                                        }
                                                                        try {
                                                                            v27 = (pw_1)om_2.R(v20);
                                                                        }
                                                                        catch (InvocationTargetException v28) {
                                                                            throw v28.getTargetException();
                                                                        }
                                                                        var10_10 = v27;
                                                                        break block126;
                                                                    }
                                                                    try {
                                                                        v29 = this;
                                                                        if (var2_4 == null) break block111;
                                                                        v17 = v29.f;
                                                                    }
                                                                    catch (Exception v30) {
                                                                        throw Q.a(v30);
                                                                    }
                                                                }
                                                                if (!v17) {
                                                                    throw new Exception("请选择私钥文件!");
                                                                }
                                                                v29 = this;
                                                            }
                                                            try {
                                                                v31 = (pw_1)om_2.m(v29.F.w);
                                                            }
                                                            catch (InvocationTargetException v32) {
                                                                throw v32.getTargetException();
                                                            }
                                                            var10_10 = v31;
                                                        }
                                                        var11_11 = null;
                                                        v33 = var10_10.f();
                                                        if (var2_4 == null) break block112;
                                                        if (!v33) break block113;
                                                        break block127;
                                                        catch (Exception v34) {
                                                            throw Q.a(v34);
                                                        }
                                                    }
                                                    v35 = var7_7;
                                                    if (var2_4 == null) break block114;
                                                    break block128;
                                                    catch (Exception v36) {
                                                        throw Q.a(v36);
                                                    }
                                                }
                                                try {
                                                    block129: {
                                                        if (v35 == null) break block115;
                                                        break block129;
                                                        catch (Exception v37) {
                                                            throw Q.a(v37);
                                                        }
                                                    }
                                                    try {
                                                        v35 = (String)DS.d(var7_7);
                                                    }
                                                    catch (InvocationTargetException v38) {
                                                        throw v38.getTargetException();
                                                    }
                                                }
                                                catch (Exception v39) {
                                                    throw Q.a(v39);
                                                }
                                            }
                                            var11_11 = E8.J(v35);
                                        }
                                        var8_8 = var10_10.M((byte[])var11_11);
                                        try {
                                            if (var2_4 == null || var8_8) break block116;
                                        }
                                        catch (Exception v40) {
                                            throw Q.a(v40);
                                        }
                                        var9_9 = "私钥密码错误!";
                                        var5_5.requestFocus();
                                        break block116;
                                    }
                                    try {
                                        v33 = (Boolean)lk_0.Y(var7_7);
                                    }
                                    catch (InvocationTargetException v41) {
                                        throw v41.getTargetException();
                                    }
                                }
                                try {
                                    if (var2_4 == null) break block117;
                                    if (!v33) {
                                    }
                                    ** GOTO lbl212
                                }
                                catch (Exception v42) {
                                    throw Q.a(v42);
                                }
                                var8_8 = false;
                                var9_9 = "此私钥密码为空!";
                                try {
                                    var5_5.setText("");
                                    var5_5.requestFocus();
                                    if (var2_4 != null) break block116;
lbl212:
                                    // 2 sources

                                    v33 = true;
                                }
                                catch (Exception v43) {
                                    throw Q.a(v43);
                                }
                            }
                            var8_8 = v33;
                        }
                        catch (Exception var11_12) {
                            var8_8 = false;
                            var11_12.printStackTrace();
                            var9_9 = var11_12.getMessage();
                            try {
                                v44 = var9_9.contains("invalid privatekey");
                                if (var2_4 == null) break block118;
                                if (!v44) break block116;
                            }
                            catch (Exception v45) {
                                throw Q.a(v45);
                            }
                            var9_9 = "私钥不可用";
                        }
                    }
                    v44 = var8_8;
                }
                try {
                    if (v44) break block119;
                    JOptionPane.showMessageDialog((xe_0)this.F, var9_9);
                    if (var2_4 != null) break block120;
                }
                catch (Exception v46) {
                    throw Q.a(v46);
                }
            }
            try {
                block121: {
                    block122: {
                        var11_13 = System.currentTimeMillis();
                        v47 = this.f;
                        if (var2_4 == null) break block121;
                        try {
                            block130: {
                                if (v47) break block122;
                                break block130;
                                catch (Exception v48) {
                                    throw Q.a(v48);
                                }
                            }
                            try {
                                this.F.w.Z(var11_13);
                            }
                            catch (InvocationTargetException v49) {
                                throw v49.getTargetException();
                            }
                            try {
                                v50 = yt_1.i();
                            }
                            catch (InvocationTargetException v51) {
                                throw v51.getTargetException();
                            }
                            try {
                                v52 = v50.h();
                            }
                            catch (InvocationTargetException v53) {
                                throw v53.getTargetException();
                            }
                            try {
                                v54 = (ArrayList)v52.y();
                            }
                            catch (InvocationTargetException v55) {
                                throw v55.getTargetException();
                            }
                            v54.add((ln_1)this.F.w);
                        }
                        catch (Exception v56) {
                            throw Q.a(v56);
                        }
                    }
                    v47 = var6_6.equals("");
                }
                if (!v47) {
                    var13_15 /* !! */  = FileUtils.readFileToByteArray(new File(var6_6));
                    try {
                        this.F.w.X(var13_15 /* !! */);
                    }
                    catch (InvocationTargetException v57) {
                        throw v57.getTargetException();
                    }
                }
                try {
                    this.F.w.z(var4_3.getText());
                }
                catch (InvocationTargetException v58) {
                    throw v58.getTargetException();
                }
                try {
                    this.F.w.v(new String(var5_5.getPassword()));
                }
                catch (InvocationTargetException v59) {
                    throw v59.getTargetException();
                }
                try {
                    this.F.w.d(var11_13);
                }
                catch (InvocationTargetException v60) {
                    throw v60.getTargetException();
                }
                try {
                    v61 = yt_1.i();
                }
                catch (InvocationTargetException v62) {
                    throw v62.getTargetException();
                }
                try {
                    v61.S();
                }
                catch (InvocationTargetException v63) {
                    throw v63.getTargetException();
                }
                try {
                    v64 = yt_1.i();
                }
                catch (InvocationTargetException v65) {
                    throw v65.getTargetException();
                }
                try {
                    v66 = v64.Q();
                }
                catch (InvocationTargetException v67) {
                    throw v67.getTargetException();
                }
                try {
                    v66.G();
                }
                catch (InvocationTargetException v68) {
                    throw v68.getTargetException();
                }
                var13_15 /* !! */  = (byte[])new ty_2(ty_2.M);
                try {
                    v69 = yt_1.i();
                }
                catch (InvocationTargetException v70) {
                    throw v70.getTargetException();
                }
                try {
                    com.c.d(473928376202613579L).invoke(v69, com.c.a(var13_15 /* !! */ ));
                }
                catch (InvocationTargetException v71) {
                    throw v71.getTargetException();
                }
                ((xe_0)this.F).setVisible(false);
            }
            catch (IOException var11_14) {
                var11_14.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[7];
                    var5_1 = 0;
                    var4_2 = "\u8bbe\u90ba\u62d8\u798a\u9427\u6598\u4e0ak\u0012W\u00b67 \u007f\u0097c\u00b8\u009d\u00ae\u0090\u00d2\u0080\u009f\u0016\u000b\u0081*\u0005\u798f\u944d\u4eea\u5363\u7594\u000f\u7934\u9453\u6517\u4eb9\u8f1f\u598f\u00f9\u8beb\u90f6\u6272\u6ba1\u78b9\u650b\u4e6b\u0019\b\u6b16\u7961\u9460\u5b27\u7851\u4e77\u7a78\u009c";
                    var6_3 = "\u8bbe\u90ba\u62d8\u798a\u9427\u6598\u4e0ak\u0012W\u00b67 \u007f\u0097c\u00b8\u009d\u00ae\u0090\u00d2\u0080\u009f\u0016\u000b\u0081*\u0005\u798f\u944d\u4eea\u5363\u7594\u000f\u7934\u9453\u6517\u4eb9\u8f1f\u598f\u00f9\u8beb\u90f6\u6272\u6ba1\u78b9\u650b\u4e6b\u0019\b\u6b16\u7961\u9460\u5b27\u7851\u4e77\u7a78\u009c".length();
                    var3_4 = 8;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 54;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u8b9d\u8ff2\u51e8\u545e\u79b1\u0007\u792f\u94f8\u5bed\u78e3\u952f\u8bdd/";
                        var6_3 = "\u8b9d\u8ff2\u51e8\u545e\u79b1\u0007\u792f\u94f8\u5bed\u78e3\u952f\u8bdd/".length();
                        var3_4 = 5;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 9;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 26;
                                break;
                            }
                            case 1: {
                                v15 = 126;
                                break;
                            }
                            case 2: {
                                v15 = 92;
                                break;
                            }
                            case 3: {
                                v15 = 11;
                                break;
                            }
                            case 4: {
                                v15 = 54;
                                break;
                            }
                            case 5: {
                                v15 = 38;
                                break;
                            }
                            default: {
                                v15 = 63;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            Q.a = var7;
            Q.b = new String[7];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3305934966496783991L;
        ** while (true)
        Q.c = 3305934966496718455L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x18E0) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 235;
                    break;
                }
                case 1: {
                    n14 = 90;
                    break;
                }
                case 2: {
                    n14 = 29;
                    break;
                }
                case 3: {
                    n14 = 55;
                    break;
                }
                case 4: {
                    n14 = 218;
                    break;
                }
                case 5: {
                    n14 = 87;
                    break;
                }
                case 6: {
                    n14 = 132;
                    break;
                }
                case 7: {
                    n14 = 219;
                    break;
                }
                case 8: {
                    n14 = 197;
                    break;
                }
                case 9: {
                    n14 = 16;
                    break;
                }
                case 10: {
                    n14 = 252;
                    break;
                }
                case 11: {
                    n14 = 95;
                    break;
                }
                case 12: {
                    n14 = 5;
                    break;
                }
                case 13: {
                    n14 = 129;
                    break;
                }
                case 14: {
                    n14 = 144;
                    break;
                }
                case 15: {
                    n14 = 42;
                    break;
                }
                case 16: {
                    n14 = 79;
                    break;
                }
                case 17: {
                    n14 = 192;
                    break;
                }
                case 18: {
                    n14 = 62;
                    break;
                }
                case 19: {
                    n14 = 141;
                    break;
                }
                case 20: {
                    n14 = 139;
                    break;
                }
                case 21: {
                    n14 = 41;
                    break;
                }
                case 22: {
                    n14 = 204;
                    break;
                }
                case 23: {
                    n14 = 194;
                    break;
                }
                case 24: {
                    n14 = 124;
                    break;
                }
                case 25: {
                    n14 = 10;
                    break;
                }
                case 26: {
                    n14 = 239;
                    break;
                }
                case 27: {
                    n14 = 11;
                    break;
                }
                case 28: {
                    n14 = 233;
                    break;
                }
                case 29: {
                    n14 = 20;
                    break;
                }
                case 30: {
                    n14 = 172;
                    break;
                }
                case 31: {
                    n14 = 116;
                    break;
                }
                case 32: {
                    n14 = 9;
                    break;
                }
                case 33: {
                    n14 = 93;
                    break;
                }
                case 34: {
                    n14 = 119;
                    break;
                }
                case 35: {
                    n14 = 28;
                    break;
                }
                case 36: {
                    n14 = 39;
                    break;
                }
                case 37: {
                    n14 = 57;
                    break;
                }
                case 38: {
                    n14 = 27;
                    break;
                }
                case 39: {
                    n14 = 146;
                    break;
                }
                case 40: {
                    n14 = 249;
                    break;
                }
                case 41: {
                    n14 = 196;
                    break;
                }
                case 42: {
                    n14 = 17;
                    break;
                }
                case 43: {
                    n14 = 120;
                    break;
                }
                case 44: {
                    n14 = 22;
                    break;
                }
                case 45: {
                    n14 = 243;
                    break;
                }
                case 46: {
                    n14 = 97;
                    break;
                }
                case 47: {
                    n14 = 2;
                    break;
                }
                case 48: {
                    n14 = 185;
                    break;
                }
                case 49: {
                    n14 = 37;
                    break;
                }
                case 50: {
                    n14 = 45;
                    break;
                }
                case 51: {
                    n14 = 117;
                    break;
                }
                case 52: {
                    n14 = 134;
                    break;
                }
                case 53: {
                    n14 = 38;
                    break;
                }
                case 54: {
                    n14 = 193;
                    break;
                }
                case 55: {
                    n14 = 215;
                    break;
                }
                case 56: {
                    n14 = 234;
                    break;
                }
                case 57: {
                    n14 = 165;
                    break;
                }
                case 58: {
                    n14 = 138;
                    break;
                }
                case 59: {
                    n14 = 75;
                    break;
                }
                case 60: {
                    n14 = 143;
                    break;
                }
                case 61: {
                    n14 = 189;
                    break;
                }
                case 62: {
                    n14 = 118;
                    break;
                }
                case 63: {
                    n14 = 255;
                    break;
                }
                case 64: {
                    n14 = 68;
                    break;
                }
                case 65: {
                    n14 = 167;
                    break;
                }
                case 66: {
                    n14 = 173;
                    break;
                }
                case 67: {
                    n14 = 12;
                    break;
                }
                case 68: {
                    n14 = 14;
                    break;
                }
                case 69: {
                    n14 = 170;
                    break;
                }
                case 70: {
                    n14 = 47;
                    break;
                }
                case 71: {
                    n14 = 53;
                    break;
                }
                case 72: {
                    n14 = 171;
                    break;
                }
                case 73: {
                    n14 = 36;
                    break;
                }
                case 74: {
                    n14 = 102;
                    break;
                }
                case 75: {
                    n14 = 227;
                    break;
                }
                case 76: {
                    n14 = 83;
                    break;
                }
                case 77: {
                    n14 = 153;
                    break;
                }
                case 78: {
                    n14 = 18;
                    break;
                }
                case 79: {
                    n14 = 32;
                    break;
                }
                case 80: {
                    n14 = 105;
                    break;
                }
                case 81: {
                    n14 = 109;
                    break;
                }
                case 82: {
                    n14 = 220;
                    break;
                }
                case 83: {
                    n14 = 147;
                    break;
                }
                case 84: {
                    n14 = 187;
                    break;
                }
                case 85: {
                    n14 = 77;
                    break;
                }
                case 86: {
                    n14 = 199;
                    break;
                }
                case 87: {
                    n14 = 115;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 19;
                    break;
                }
                case 90: {
                    n14 = 225;
                    break;
                }
                case 91: {
                    n14 = 126;
                    break;
                }
                case 92: {
                    n14 = 156;
                    break;
                }
                case 93: {
                    n14 = 127;
                    break;
                }
                case 94: {
                    n14 = 174;
                    break;
                }
                case 95: {
                    n14 = 175;
                    break;
                }
                case 96: {
                    n14 = 152;
                    break;
                }
                case 97: {
                    n14 = 101;
                    break;
                }
                case 98: {
                    n14 = 176;
                    break;
                }
                case 99: {
                    n14 = 81;
                    break;
                }
                case 100: {
                    n14 = 67;
                    break;
                }
                case 101: {
                    n14 = 35;
                    break;
                }
                case 102: {
                    n14 = 182;
                    break;
                }
                case 103: {
                    n14 = 251;
                    break;
                }
                case 104: {
                    n14 = 89;
                    break;
                }
                case 105: {
                    n14 = 229;
                    break;
                }
                case 106: {
                    n14 = 91;
                    break;
                }
                case 107: {
                    n14 = 43;
                    break;
                }
                case 108: {
                    n14 = 76;
                    break;
                }
                case 109: {
                    n14 = 52;
                    break;
                }
                case 110: {
                    n14 = 86;
                    break;
                }
                case 111: {
                    n14 = 248;
                    break;
                }
                case 112: {
                    n14 = 164;
                    break;
                }
                case 113: {
                    n14 = 70;
                    break;
                }
                case 114: {
                    n14 = 163;
                    break;
                }
                case 115: {
                    n14 = 108;
                    break;
                }
                case 116: {
                    n14 = 157;
                    break;
                }
                case 117: {
                    n14 = 223;
                    break;
                }
                case 118: {
                    n14 = 0;
                    break;
                }
                case 119: {
                    n14 = 33;
                    break;
                }
                case 120: {
                    n14 = 222;
                    break;
                }
                case 121: {
                    n14 = 212;
                    break;
                }
                case 122: {
                    n14 = 106;
                    break;
                }
                case 123: {
                    n14 = 84;
                    break;
                }
                case 124: {
                    n14 = 92;
                    break;
                }
                case 125: {
                    n14 = 188;
                    break;
                }
                case 126: {
                    n14 = 50;
                    break;
                }
                case 127: {
                    n14 = 142;
                    break;
                }
                case 128: {
                    n14 = 64;
                    break;
                }
                case 129: {
                    n14 = 216;
                    break;
                }
                case 130: {
                    n14 = 26;
                    break;
                }
                case 131: {
                    n14 = 80;
                    break;
                }
                case 132: {
                    n14 = 54;
                    break;
                }
                case 133: {
                    n14 = 104;
                    break;
                }
                case 134: {
                    n14 = 178;
                    break;
                }
                case 135: {
                    n14 = 7;
                    break;
                }
                case 136: {
                    n14 = 113;
                    break;
                }
                case 137: {
                    n14 = 99;
                    break;
                }
                case 138: {
                    n14 = 253;
                    break;
                }
                case 139: {
                    n14 = 179;
                    break;
                }
                case 140: {
                    n14 = 145;
                    break;
                }
                case 141: {
                    n14 = 60;
                    break;
                }
                case 142: {
                    n14 = 98;
                    break;
                }
                case 143: {
                    n14 = 245;
                    break;
                }
                case 144: {
                    n14 = 205;
                    break;
                }
                case 145: {
                    n14 = 131;
                    break;
                }
                case 146: {
                    n14 = 34;
                    break;
                }
                case 147: {
                    n14 = 242;
                    break;
                }
                case 148: {
                    n14 = 150;
                    break;
                }
                case 149: {
                    n14 = 56;
                    break;
                }
                case 150: {
                    n14 = 1;
                    break;
                }
                case 151: {
                    n14 = 177;
                    break;
                }
                case 152: {
                    n14 = 186;
                    break;
                }
                case 153: {
                    n14 = 48;
                    break;
                }
                case 154: {
                    n14 = 151;
                    break;
                }
                case 155: {
                    n14 = 23;
                    break;
                }
                case 156: {
                    n14 = 137;
                    break;
                }
                case 157: {
                    n14 = 250;
                    break;
                }
                case 158: {
                    n14 = 180;
                    break;
                }
                case 159: {
                    n14 = 210;
                    break;
                }
                case 160: {
                    n14 = 240;
                    break;
                }
                case 161: {
                    n14 = 247;
                    break;
                }
                case 162: {
                    n14 = 15;
                    break;
                }
                case 163: {
                    n14 = 183;
                    break;
                }
                case 164: {
                    n14 = 66;
                    break;
                }
                case 165: {
                    n14 = 58;
                    break;
                }
                case 166: {
                    n14 = 190;
                    break;
                }
                case 167: {
                    n14 = 72;
                    break;
                }
                case 168: {
                    n14 = 121;
                    break;
                }
                case 169: {
                    n14 = 61;
                    break;
                }
                case 170: {
                    n14 = 158;
                    break;
                }
                case 171: {
                    n14 = 228;
                    break;
                }
                case 172: {
                    n14 = 140;
                    break;
                }
                case 173: {
                    n14 = 154;
                    break;
                }
                case 174: {
                    n14 = 30;
                    break;
                }
                case 175: {
                    n14 = 69;
                    break;
                }
                case 176: {
                    n14 = 169;
                    break;
                }
                case 177: {
                    n14 = 237;
                    break;
                }
                case 178: {
                    n14 = 155;
                    break;
                }
                case 179: {
                    n14 = 217;
                    break;
                }
                case 180: {
                    n14 = 59;
                    break;
                }
                case 181: {
                    n14 = 221;
                    break;
                }
                case 182: {
                    n14 = 191;
                    break;
                }
                case 183: {
                    n14 = 195;
                    break;
                }
                case 184: {
                    n14 = 214;
                    break;
                }
                case 185: {
                    n14 = 135;
                    break;
                }
                case 186: {
                    n14 = 207;
                    break;
                }
                case 187: {
                    n14 = 114;
                    break;
                }
                case 188: {
                    n14 = 241;
                    break;
                }
                case 189: {
                    n14 = 125;
                    break;
                }
                case 190: {
                    n14 = 202;
                    break;
                }
                case 191: {
                    n14 = 159;
                    break;
                }
                case 192: {
                    n14 = 110;
                    break;
                }
                case 193: {
                    n14 = 209;
                    break;
                }
                case 194: {
                    n14 = 133;
                    break;
                }
                case 195: {
                    n14 = 123;
                    break;
                }
                case 196: {
                    n14 = 78;
                    break;
                }
                case 197: {
                    n14 = 230;
                    break;
                }
                case 198: {
                    n14 = 181;
                    break;
                }
                case 199: {
                    n14 = 51;
                    break;
                }
                case 200: {
                    n14 = 130;
                    break;
                }
                case 201: {
                    n14 = 184;
                    break;
                }
                case 202: {
                    n14 = 254;
                    break;
                }
                case 203: {
                    n14 = 74;
                    break;
                }
                case 204: {
                    n14 = 96;
                    break;
                }
                case 205: {
                    n14 = 100;
                    break;
                }
                case 206: {
                    n14 = 238;
                    break;
                }
                case 207: {
                    n14 = 162;
                    break;
                }
                case 208: {
                    n14 = 128;
                    break;
                }
                case 209: {
                    n14 = 13;
                    break;
                }
                case 210: {
                    n14 = 4;
                    break;
                }
                case 211: {
                    n14 = 88;
                    break;
                }
                case 212: {
                    n14 = 65;
                    break;
                }
                case 213: {
                    n14 = 208;
                    break;
                }
                case 214: {
                    n14 = 201;
                    break;
                }
                case 215: {
                    n14 = 166;
                    break;
                }
                case 216: {
                    n14 = 200;
                    break;
                }
                case 217: {
                    n14 = 94;
                    break;
                }
                case 218: {
                    n14 = 107;
                    break;
                }
                case 219: {
                    n14 = 168;
                    break;
                }
                case 220: {
                    n14 = 236;
                    break;
                }
                case 221: {
                    n14 = 44;
                    break;
                }
                case 222: {
                    n14 = 71;
                    break;
                }
                case 223: {
                    n14 = 160;
                    break;
                }
                case 224: {
                    n14 = 198;
                    break;
                }
                case 225: {
                    n14 = 21;
                    break;
                }
                case 226: {
                    n14 = 244;
                    break;
                }
                case 227: {
                    n14 = 85;
                    break;
                }
                case 228: {
                    n14 = 63;
                    break;
                }
                case 229: {
                    n14 = 206;
                    break;
                }
                case 230: {
                    n14 = 232;
                    break;
                }
                case 231: {
                    n14 = 82;
                    break;
                }
                case 232: {
                    n14 = 24;
                    break;
                }
                case 233: {
                    n14 = 112;
                    break;
                }
                case 234: {
                    n14 = 122;
                    break;
                }
                case 235: {
                    n14 = 103;
                    break;
                }
                case 236: {
                    n14 = 226;
                    break;
                }
                case 237: {
                    n14 = 246;
                    break;
                }
                case 238: {
                    n14 = 224;
                    break;
                }
                case 239: {
                    n14 = 46;
                    break;
                }
                case 240: {
                    n14 = 203;
                    break;
                }
                case 241: {
                    n14 = 40;
                    break;
                }
                case 242: {
                    n14 = 49;
                    break;
                }
                case 243: {
                    n14 = 148;
                    break;
                }
                case 244: {
                    n14 = 231;
                    break;
                }
                case 245: {
                    n14 = 136;
                    break;
                }
                case 246: {
                    n14 = 111;
                    break;
                }
                case 247: {
                    n14 = 6;
                    break;
                }
                case 248: {
                    n14 = 211;
                    break;
                }
                case 249: {
                    n14 = 31;
                    break;
                }
                case 250: {
                    n14 = 73;
                    break;
                }
                case 251: {
                    n14 = 213;
                    break;
                }
                case 252: {
                    n14 = 3;
                    break;
                }
                case 253: {
                    n14 = 8;
                    break;
                }
                case 254: {
                    n14 = 161;
                    break;
                }
                default: {
                    n14 = 25;
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
            Q.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

