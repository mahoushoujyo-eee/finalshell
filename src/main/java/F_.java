/*
 * Decompiled with CFR 0.152.
 */
import com.IR;
import com._y_0;
import com.c;
import com.ky_2;
import com.pa_1;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import org.jdesktop.swingx.JXList;

public class F_
extends FK {
    pa_1 h6;
    long hp;
    boolean hv;
    String hY;
    int ht;
    int ho;
    int hM;
    String hn;
    int he;
    protected JButton hR;
    int hc;
    boolean h_;
    JLabel hT;
    long hz;
    boolean hE;
    JLabel hJ;
    String hl;
    String hV;
    boolean hB;
    static int hy;
    static int h8;
    static int hu;
    int hC;
    private static String[] hU;
    private static final String[] cb;
    private static final String[] db;
    private static final long[] gb;
    private static final Integer[] hb;

    public F_(pa_1 pa_12, ff_0 ff_02, dv_0 dv_02) {
        super(dv_02, true, true, false, false, true, false);
        JPanel jPanel;
        JPanel jPanel2;
        JPanel jPanel3;
        Object object;
        this.hv = false;
        this.hY = "";
        this.ht = -1;
        this.hc = -1;
        this.h_ = false;
        this.hE = false;
        this.hB = false;
        this.hC = F_.hy;
        try {
            this.i(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.f(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.e(F_.b(13222, 6051884349919138237L), F_.b(26895, 6542378377919449875L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.Y(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.e(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = ff_02.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.hR = object;
        ((JButton)this.hR).addActionListener(new gd_0(this));
        tg_0 tg_02 = new tg_0(this);
        String[] stringArray = F_.F();
        y1_0 y1_02 = new y1_0((JButton)this.hR, tg_02);
        ((JButton)this.hR).addMouseListener(new G(this, y1_02, tg_02));
        SwingUtilities.invokeLater(new nZ(this));
        this.h6 = pa_12;
        try {
            this.R(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        ((dv_0)this.lD).setFocusTraversalKeysEnabled(false);
        this.setFocusTraversalKeysEnabled(false);
        ((dv_0)this.lD).addKeyListener(new ub_1(this, pa_12));
        this.hT = new JLabel(F_.b(-6462, 6583));
        ((JLabel)this.hT).addMouseListener((MouseListener)this.y);
        ((JLabel)this.hT).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, F_.b(31933, 8835116987411553962L)));
        try {
            jPanel3 = (JPanel)this.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel3.add((JLabel)this.hT);
        this.hJ = new JLabel("");
        ((JLabel)this.hJ).setBorder(BorderFactory.createEmptyBorder(1, 5, 1, 5));
        ((JLabel)this.hJ).addMouseListener((MouseListener)this.y);
        try {
            jPanel2 = (JPanel)this.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel2.addMouseListener((MouseListener)this.y);
        try {
            jPanel = (JPanel)this.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel.add((JLabel)this.hJ, F_.b(-6458, 7741), 0);
        if (ky_2.F() != null) {
            F_.U(new String[4]);
        }
    }

    @Override
    public void D() {
        super.D();
        try {
            this.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void i() {
        block6: {
            KV kV;
            _y_0 _y_02;
            block7: {
                pa_1 pa_12;
                String[] stringArray;
                block5: {
                    stringArray = F_.F();
                    pa_12 = (pa_1)this.h6;
                    if (stringArray == null) break block5;
                    if (pa_12 == null) break block6;
                    pa_12 = (pa_1)this.h6;
                }
                _y_02 = pa_12.X();
                if (stringArray == null) break block7;
                if (_y_02 == null) break block6;
                _y_02 = ((pa_1)this.h6).X();
            }
            ty_0 ty_02 = _y_02.M();
            try {
                kV = (KV)ty_02.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            KV kV2 = kV;
            try {
                kV2.Y();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    void R() {
        block165: {
            block167: {
                block166: {
                    block175: {
                        block178: {
                            block176: {
                                block177: {
                                    block170: {
                                        block171: {
                                            block174: {
                                                block172: {
                                                    block173: {
                                                        block168: {
                                                            block169: {
                                                                block164: {
                                                                    block162: {
                                                                        block163: {
                                                                            block161: {
                                                                                block160: {
                                                                                    block159: {
                                                                                        block158: {
                                                                                            block132: {
                                                                                                block131: {
                                                                                                    block153: {
                                                                                                        block130: {
                                                                                                            block151: {
                                                                                                                block129: {
                                                                                                                    block152: {
                                                                                                                        block128: {
                                                                                                                            block145: {
                                                                                                                                block146: {
                                                                                                                                    block149: {
                                                                                                                                        block150: {
                                                                                                                                            block147: {
                                                                                                                                                block148: {
                                                                                                                                                    block144: {
                                                                                                                                                        block142: {
                                                                                                                                                            block143: {
                                                                                                                                                                block140: {
                                                                                                                                                                    block141: {
                                                                                                                                                                        block127: {
                                                                                                                                                                            block138: {
                                                                                                                                                                                block137: {
                                                                                                                                                                                    block126: {
                                                                                                                                                                                        this.hB = false;
                                                                                                                                                                                        var2_1 = ((dv_0)this.lD).getText();
                                                                                                                                                                                        var3_2 = ((dv_0)this.lD).getCaretPosition();
                                                                                                                                                                                        var4_3 = var3_2 - 1;
                                                                                                                                                                                        var5_4 = new zX(var2_1);
                                                                                                                                                                                        var1_5 = F_.F();
                                                                                                                                                                                        while (var4_3 > 0) {
                                                                                                                                                                                            block136: {
                                                                                                                                                                                                block135: {
                                                                                                                                                                                                    block133: {
                                                                                                                                                                                                        block134: {
                                                                                                                                                                                                            v0 = var6_6 = var2_1.charAt(var4_3);
                                                                                                                                                                                                            if (var1_5 == null) break block126;
                                                                                                                                                                                                            if (var1_5 == null) break block133;
                                                                                                                                                                                                            if (v0 == F_.b(29829, 1906305513456424599L)) break block134;
                                                                                                                                                                                                            v1 = var6_6;
                                                                                                                                                                                                            if (var1_5 == null) break block133;
                                                                                                                                                                                                            if (v1 == F_.b(14823, 7710835707957255160L)) break block134;
                                                                                                                                                                                                            v1 = var6_6;
                                                                                                                                                                                                            if (var1_5 == null) break block133;
                                                                                                                                                                                                            if (v1 != F_.b(27338, 2857848636304214231L)) break block135;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v1 = (int)((Boolean)var5_4.R(var4_3)).booleanValue();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (InvocationTargetException v2) {
                                                                                                                                                                                                            throw v2.getTargetException();
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var7_8 = v1;
                                                                                                                                                                                                    if (var1_5 == null) break block136;
                                                                                                                                                                                                    if (var7_8 == 0) {
                                                                                                                                                                                                        ++var4_3;
                                                                                                                                                                                                        if (var1_5 != null) break;
                                                                                                                                                                                                        ky_2.K(new String[3]);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                --var4_3;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_5 != null) continue;
                                                                                                                                                                                        }
                                                                                                                                                                                        this.ho = var4_3;
                                                                                                                                                                                        v3 = this;
                                                                                                                                                                                        if (var1_5 == null) break block137;
                                                                                                                                                                                        v0 = v3.ho;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v0 >= 0) break block138;
                                                                                                                                                                                    v3 = this;
                                                                                                                                                                                }
                                                                                                                                                                                v3.ho = 0;
                                                                                                                                                                            }
                                                                                                                                                                            var6_7 = var2_1.substring(0, this.ho);
                                                                                                                                                                            var7_8 = 0;
                                                                                                                                                                            for (var8_9 = 0; var8_9 < var6_7.length(); var8_9 += 1) {
                                                                                                                                                                                block139: {
                                                                                                                                                                                    v4 = var6_7.charAt(var8_9);
                                                                                                                                                                                    if (var1_5 == null) break block139;
                                                                                                                                                                                    v5 = F_.b(29829, 1906305513456424599L);
                                                                                                                                                                                    if (var1_5 == null) ** GOTO lbl67
                                                                                                                                                                                    if (v4 == v5) continue;
                                                                                                                                                                                    v4 = var7_8 = 1;
                                                                                                                                                                                }
                                                                                                                                                                                if (var1_5 != null) break;
                                                                                                                                                                                if (var1_5 != null) continue;
                                                                                                                                                                            }
                                                                                                                                                                            var4_3 = var3_2;
                                                                                                                                                                            do {
                                                                                                                                                                                v6 = var4_3;
                                                                                                                                                                                v5 = var2_1.length();
lbl67:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                if (v6 >= v5) break;
                                                                                                                                                                                v7 = var8_9 = (int)var2_1.charAt(var4_3);
                                                                                                                                                                                if (var1_5 == null) break block127;
                                                                                                                                                                                v8 = F_.b(29829, 1906305513456424599L);
                                                                                                                                                                                if (var1_5 == null) break block128;
                                                                                                                                                                                if (v7 == v8) break;
                                                                                                                                                                                v7 = var8_9;
                                                                                                                                                                                if (var1_5 == null) break block127;
                                                                                                                                                                                if (v7 == F_.b(14585, 6329998434114149091L) || var8_9 == F_.b(16967, 4352882073051848799L) && var1_5 != null) break;
                                                                                                                                                                                ++var4_3;
                                                                                                                                                                            } while (var1_5 != null);
                                                                                                                                                                            this.hM = var4_3;
                                                                                                                                                                            this.hn = var2_1.substring(this.ho, this.hM);
                                                                                                                                                                            v9 = this;
                                                                                                                                                                            if (var1_5 == null) break block140;
                                                                                                                                                                            v7 = (int)((String)v9.hn).equals(".");
                                                                                                                                                                        }
                                                                                                                                                                        if (v7 != 0) break block141;
                                                                                                                                                                        v9 = this;
                                                                                                                                                                        if (var1_5 == null) break block140;
                                                                                                                                                                        if (((String)v9.hn).equals(F_.b(-6451, -19056))) break block141;
                                                                                                                                                                        v10 = (String)this.hn;
                                                                                                                                                                        if (var1_5 == null) break block142;
                                                                                                                                                                        if (!v10.endsWith("/")) break block143;
                                                                                                                                                                    }
                                                                                                                                                                    v9 = this;
                                                                                                                                                                }
                                                                                                                                                                v9.hY = "";
                                                                                                                                                                if (var1_5 != null) break block144;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                v10 = (String)lk_0.s(this.hn);
                                                                                                                                                            }
                                                                                                                                                            catch (InvocationTargetException v11) {
                                                                                                                                                                throw v11.getTargetException();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        var8_10 = v10;
                                                                                                                                                        try {
                                                                                                                                                            v12 = lk_0.h(var8_10);
                                                                                                                                                        }
                                                                                                                                                        catch (InvocationTargetException v13) {
                                                                                                                                                            throw v13.getTargetException();
                                                                                                                                                        }
                                                                                                                                                        this.hY = v12;
                                                                                                                                                    }
                                                                                                                                                    v14 = var7_8;
                                                                                                                                                    if (var1_5 == null) break block145;
                                                                                                                                                    if (v14 != 0) break block146;
                                                                                                                                                    v15 = ((String)this.hn).startsWith(".");
                                                                                                                                                    if (var1_5 == null) break block147;
                                                                                                                                                    if (v15) break block148;
                                                                                                                                                    v16 = (int)((String)this.hn).startsWith("/");
                                                                                                                                                    if (var1_5 == null) break block149;
                                                                                                                                                    if (v16 == 0) break block150;
                                                                                                                                                }
                                                                                                                                                v15 = true;
                                                                                                                                            }
                                                                                                                                            var7_8 = (int)v15;
                                                                                                                                        }
                                                                                                                                        v16 = (int)((String)this.hn).equals(".");
                                                                                                                                    }
                                                                                                                                    if (var1_5 == null) break block151;
                                                                                                                                    if (v16 != 0) {
                                                                                                                                        // empty if block
                                                                                                                                    }
                                                                                                                                    break block152;
                                                                                                                                }
                                                                                                                                v14 = 0;
                                                                                                                            }
                                                                                                                            var8_9 = v14;
                                                                                                                            v17 = this.ho;
                                                                                                                            v8 = 1;
                                                                                                                        }
                                                                                                                        var9_11 = v17 - v8;
                                                                                                                        while (var9_11 > -1) {
                                                                                                                            var10_12 = var2_1.charAt(var9_11);
                                                                                                                            if (var1_5 != null) {
                                                                                                                                v18 = var10_12;
                                                                                                                                v19 = F_.b(29829, 1906305513456424599L);
                                                                                                                                if (var1_5 == null) break block129;
                                                                                                                                if (v18 != v19) {
                                                                                                                                    v20 = var10_12;
                                                                                                                                    if (var1_5 != null) {
                                                                                                                                        if (v20 != F_.b(14585, 6329998434114149091L)) {
                                                                                                                                            v18 = var10_12;
                                                                                                                                            v19 = F_.b(16967, 4352882073051848799L);
                                                                                                                                            if (var1_5 != null) {
                                                                                                                                                if (v18 != v19) break;
                                                                                                                                            }
                                                                                                                                            break block129;
                                                                                                                                        }
                                                                                                                                        v20 = var7_8 = 0;
                                                                                                                                    }
                                                                                                                                    if (var1_5 != null) break;
                                                                                                                                }
                                                                                                                                var9_11 -= 1;
                                                                                                                            }
                                                                                                                            if (var1_5 != null) continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v18 = var3_2;
                                                                                                                    v19 = 1;
                                                                                                                }
                                                                                                                v16 = v18 - v19;
                                                                                                            }
                                                                                                            var8_9 = v16;
                                                                                                            var9_11 = 0;
                                                                                                            v21 = var2_1.length();
                                                                                                            if (var1_5 != null) {
                                                                                                                if (v21 > 0) {
                                                                                                                    while (var9_11 < var2_1.length()) {
                                                                                                                        var10_12 = var2_1.charAt(var9_11);
                                                                                                                        if (var1_5 != null) {
                                                                                                                            v21 = var10_12;
                                                                                                                            v22 = F_.b(29829, 1906305513456424599L);
                                                                                                                            if (var1_5 == null) break block130;
                                                                                                                            if (v21 != v22 && var1_5 != null) break;
                                                                                                                            var9_11 += 1;
                                                                                                                        }
                                                                                                                        if (var1_5 != null) continue;
                                                                                                                    }
                                                                                                                }
                                                                                                                v21 = var8_9;
                                                                                                            }
                                                                                                            if (var1_5 == null) break block153;
                                                                                                            v22 = -1;
                                                                                                        }
                                                                                                        if (v21 == v22) {
                                                                                                            var8_9 = 0;
                                                                                                        }
                                                                                                        v21 = var10_12 = 1;
                                                                                                    }
                                                                                                    while (var8_9 > 0) {
                                                                                                        block157: {
                                                                                                            block156: {
                                                                                                                block154: {
                                                                                                                    block155: {
                                                                                                                        v23 = var11_13 = var2_1.charAt(var8_9);
                                                                                                                        if (var1_5 == null) break block154;
                                                                                                                        v24 = F_.b(14585, 6329998434114149091L);
                                                                                                                        if (var1_5 == null) break block131;
                                                                                                                        if (v23 == v24) break block155;
                                                                                                                        v23 = var11_13;
                                                                                                                        if (var1_5 == null) break block154;
                                                                                                                        if (v23 != F_.b(16967, 4352882073051848799L)) break block156;
                                                                                                                    }
                                                                                                                    var10_12 = 0;
                                                                                                                    try {
                                                                                                                        v23 = (int)((Boolean)var5_4.R(var8_9)).booleanValue();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException v25) {
                                                                                                                        throw v25.getTargetException();
                                                                                                                    }
                                                                                                                }
                                                                                                                var12_14 = v23;
                                                                                                                if (var1_5 != null) {
                                                                                                                    if (var12_14 == 0) {
                                                                                                                        var8_9 += 1;
                                                                                                                        if (var1_5 != null) break;
                                                                                                                    } else {
                                                                                                                        ** GOTO lbl215
                                                                                                                    }
                                                                                                                }
                                                                                                                break block157;
                                                                                                            }
                                                                                                            var8_9 -= 1;
                                                                                                        }
                                                                                                        if (var1_5 != null) continue;
                                                                                                    }
                                                                                                    v26 = var8_9;
                                                                                                    v24 = var2_1.length() - 1;
                                                                                                }
                                                                                                if (var1_5 != null) {
                                                                                                    if (v26 > v24) {
                                                                                                        var8_9 = var2_1.length() - 1;
                                                                                                    }
                                                                                                    v26 = var8_9;
                                                                                                    v24 = 1;
                                                                                                }
                                                                                                var11_13 = v26 + v24;
                                                                                                v27 = var10_12;
                                                                                                if (var1_5 == null) ** GOTO lbl234
                                                                                                if (v27 != 0) {
                                                                                                    var11_13 = var9_11;
                                                                                                }
                                                                                                do {
                                                                                                    v27 = var11_13;
lbl234:
                                                                                                    // 2 sources

                                                                                                    if (v27 >= var2_1.length()) break;
                                                                                                    var12_14 = var2_1.charAt(var11_13);
                                                                                                    if (var1_5 == null) continue;
                                                                                                    v28 = var12_14;
                                                                                                    v29 = F_.b(29829, 1906305513456424599L);
                                                                                                    if (var1_5 == null) break block132;
                                                                                                    if (v28 == v29 && var1_5 != null) break;
                                                                                                    var11_13 += 1;
                                                                                                } while (var1_5 != null);
                                                                                                v28 = var11_13;
                                                                                                if (var1_5 == null) break block158;
                                                                                                v29 = var2_1.length() - 1;
                                                                                            }
                                                                                            if (v28 > v29) {
                                                                                                var11_13 = var2_1.length() - 1;
                                                                                            }
                                                                                            v28 = var8_9;
                                                                                        }
                                                                                        if (var1_5 != null) {
                                                                                            if (v28 < 0) {
                                                                                                var8_9 = 0;
                                                                                            }
                                                                                            v28 = var11_13;
                                                                                        }
                                                                                        if (var1_5 == null) break block159;
                                                                                        if (v28 >= 0) break block160;
                                                                                        v28 = 0;
                                                                                    }
                                                                                    var11_13 = v28;
                                                                                }
                                                                                var12_15 = var2_1.substring(var8_9, var11_13).trim();
                                                                                v30 = var12_15.equals(F_.b(-6459, -31436));
                                                                                if (var1_5 == null) break block161;
                                                                                if (v30 != 0) {
                                                                                    this.hB = true;
                                                                                }
                                                                                try {
                                                                                    this.D((boolean)var7_8);
                                                                                }
                                                                                catch (InvocationTargetException v31) {
                                                                                    throw v31.getTargetException();
                                                                                }
                                                                                if (var1_5 == null) break block162;
                                                                                v30 = var7_8;
                                                                            }
                                                                            if (v30 == 0) break block163;
                                                                            this.hC = F_.hu;
                                                                            try {
                                                                                this.a(-1);
                                                                            }
                                                                            catch (InvocationTargetException v32) {
                                                                                throw v32.getTargetException();
                                                                            }
                                                                            try {
                                                                                this.c(F_.b(1534, 1064063368139384808L));
                                                                            }
                                                                            catch (InvocationTargetException v33) {
                                                                                throw v33.getTargetException();
                                                                            }
                                                                            try {
                                                                                this.S(F_.b(691, 5224603133704511661L));
                                                                            }
                                                                            catch (InvocationTargetException v34) {
                                                                                throw v34.getTargetException();
                                                                            }
                                                                            if (var1_5 != null) break block164;
                                                                        }
                                                                        this.hC = F_.hy;
                                                                        try {
                                                                            this.a(F_.b(24302, 1612784168125857001L));
                                                                        }
                                                                        catch (InvocationTargetException v35) {
                                                                            throw v35.getTargetException();
                                                                        }
                                                                        try {
                                                                            this.c(F_.b(10704, 3395946432162859969L));
                                                                        }
                                                                        catch (InvocationTargetException v36) {
                                                                            throw v36.getTargetException();
                                                                        }
                                                                    }
                                                                    try {
                                                                        this.S(F_.b(22050, 4631522734275523639L));
                                                                    }
                                                                    catch (InvocationTargetException v37) {
                                                                        throw v37.getTargetException();
                                                                    }
                                                                }
                                                                var13_16 = (IR)((pa_1)this.h6).X().O();
                                                                if (var1_5 == null) break block165;
                                                                if (var13_16 == null) break block166;
                                                                var14_17 = "";
                                                                var15_18 = "";
                                                                v38 = this;
                                                                if (var1_5 == null) break block167;
                                                                if ((pa_1)v38.h6 == null) break block166;
                                                                v38 = this;
                                                                if (var1_5 == null) break block167;
                                                                if (((pa_1)v38.h6).X() == null) break block166;
                                                                var16_19 = ((pa_1)this.h6).X().M();
                                                                try {
                                                                    v39 = (KV)var16_19.p();
                                                                }
                                                                catch (InvocationTargetException v40) {
                                                                    throw v40.getTargetException();
                                                                }
                                                                var17_20 = v39;
                                                                v41 = var12_15.equals(F_.b(-6464, -20631));
                                                                if (var1_5 == null) break block168;
                                                                if (v41 == 0) break block169;
                                                                v41 = (int)((String)this.hn).equals("/");
                                                                if (var1_5 == null) break block168;
                                                                if (v41 != 0) break block169;
                                                                v41 = (int)((String)this.hn).equals("");
                                                                if (var1_5 == null) break block168;
                                                                if (v41 != 0) break block169;
                                                                v41 = (int)((String)this.hn).endsWith("/");
                                                                if (var1_5 == null) break block168;
                                                                if (v41 == 0) {
                                                                    v42 = this;
                                                                    v42.hn = (String)v42.hn + "/";
                                                                }
                                                            }
                                                            var15_18 = (String)this.hn;
                                                            v41 = (int)((String)this.hn).startsWith("/");
                                                        }
                                                        if (var1_5 == null) break block170;
                                                        if (v41 == 0) break block171;
                                                        v43 = ((String)this.hn).length();
                                                        if (var1_5 == null) break block172;
                                                        if (v43 != 1) break block173;
                                                        var14_17 = (String)this.hn;
                                                        if (var1_5 != null) break block174;
                                                    }
                                                    v43 = ((String)this.hn).lastIndexOf("/");
                                                }
                                                var4_3 = v43;
                                                var14_17 = ((String)this.hn).substring(0, var4_3 + 1);
                                            }
                                            try {
                                                v44 = (String)lk_0.s(var14_17);
                                            }
                                            catch (InvocationTargetException v45) {
                                                throw v45.getTargetException();
                                            }
                                            var14_17 = v44;
                                            try {
                                                v46 = (String)lk_0.t((Object)var14_17, true);
                                            }
                                            catch (InvocationTargetException v47) {
                                                throw v47.getTargetException();
                                            }
                                            var14_17 = v46;
                                            try {
                                                v48 = (String)lk_0.s(var15_18);
                                            }
                                            catch (InvocationTargetException v49) {
                                                throw v49.getTargetException();
                                            }
                                            var15_18 = v48;
                                            try {
                                                v50 = (String)lk_0.t((Object)var15_18, true);
                                            }
                                            catch (InvocationTargetException v51) {
                                                throw v51.getTargetException();
                                            }
                                            var15_18 = v50;
                                            if (var1_5 != null) break block175;
                                        }
                                        v52 = (String)this.hn;
                                        if (var1_5 == null) break block176;
                                        v41 = var4_3 = v52.lastIndexOf("/");
                                    }
                                    if (v41 <= -1) break block177;
                                    var14_17 = ((String)this.hn).substring(0, var4_3 + 1);
                                    if (var1_5 != null) break block178;
                                }
                                v52 = "";
                            }
                            var14_17 = v52;
                        }
                        try {
                            v53 = (String)lk_0.s(var14_17);
                        }
                        catch (InvocationTargetException v54) {
                            throw v54.getTargetException();
                        }
                        var14_17 = v53;
                        try {
                            v55 = (String)lk_0.s(var15_18);
                        }
                        catch (InvocationTargetException v56) {
                            throw v56.getTargetException();
                        }
                        var15_18 = v55;
                        try {
                            v57 = (String)var17_20.Z();
                        }
                        catch (InvocationTargetException v58) {
                            throw v58.getTargetException();
                        }
                        var18_21 = v57;
                        try {
                            v59 = (String)lk_0.x((Object)var13_16.u(), (Object)var14_17, true, (Object)var18_21);
                        }
                        catch (InvocationTargetException v60) {
                            throw v60.getTargetException();
                        }
                        var14_17 = v59;
                    }
                    this.hV = var14_17;
                    this.hl = var14_17;
                }
                try {
                    this.Z();
                }
                catch (InvocationTargetException v61) {
                    throw v61.getTargetException();
                }
                v38 = this;
            }
            try {
                v38.Q();
            }
            catch (InvocationTargetException v62) {
                throw v62.getTargetException();
            }
        }
    }

    @Override
    public synchronized void Z() {
        block3: {
            JLabel jLabel;
            block2: {
                String[] stringArray = F_.F();
                super.Z();
                String[] stringArray2 = stringArray;
                jLabel = (JLabel)this.hJ;
                if (stringArray2 == null) break block2;
                if (jLabel == null) break block3;
                jLabel = (JLabel)this.hJ;
            }
            jLabel.setText(F_.b(-6461, 12756) + (String)this.hl);
        }
    }

    @Override
    public void u(KeyEvent keyEvent) {
        block8: {
            int n10;
            block11: {
                int n11;
                block12: {
                    String[] stringArray;
                    block9: {
                        block10: {
                            int n12;
                            block7: {
                                stringArray = F_.F();
                                n12 = this.hC;
                                if (stringArray == null) break block7;
                                if (n12 != F_.hu) break block8;
                                n12 = 0;
                            }
                            n11 = n12;
                            n10 = keyEvent.getModifiers();
                            if (stringArray == null) break block9;
                            if (n10 != 0) break block10;
                            n10 = keyEvent.getKeyCode();
                            if (stringArray == null) break block11;
                            if (n10 != F_.b(30285, 5864637487809647700L)) break block12;
                            n11 = 1;
                            if (stringArray != null) break block12;
                        }
                        n10 = keyEvent.getKeyCode();
                    }
                    if (stringArray == null) break block11;
                    if (n10 != F_.b(29280, 1114623689291780211L)) break block12;
                    n10 = keyEvent.getModifiers() & 2;
                    if (stringArray == null) break block11;
                    if (n10 != 0) {
                        n11 = 1;
                    }
                }
                n10 = n11;
            }
            if (n10 != 0) {
                try {
                    this.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    @Override
    protected void u() {
        block20: {
            F_ f_2;
            block21: {
                block22: {
                    String string;
                    String string2;
                    block23: {
                        boolean bl;
                        String[] stringArray;
                        block19: {
                            String string3;
                            block17: {
                                block18: {
                                    String string4;
                                    try {
                                        string4 = (String)lk_0.M(this.hl);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    string2 = string4;
                                    stringArray = F_.F();
                                    bl = string2.equals("");
                                    if (stringArray == null) break block17;
                                    if (bl) break block18;
                                    bl = string2.endsWith("/");
                                    if (stringArray == null) break block17;
                                    if (!bl) {
                                        string2 = string2 + "/";
                                    }
                                }
                                try {
                                    bl = (Boolean)lk_0.Y(((dv_0)this.Z).getText());
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            if (stringArray == null) break block19;
                            if (!bl) break block20;
                            this.hl = string2;
                            f_2 = this;
                            if (stringArray == null) break block21;
                            try {
                                f_2.Z();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string3 = (String)lk_0.M(string2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            string2 = string3;
                            bl = string2.equals("");
                        }
                        if (bl) break block22;
                        string = string2;
                        if (stringArray == null) break block23;
                        if (string.endsWith("/")) break block22;
                        string = string2 + "/";
                    }
                    string2 = string;
                }
                f_2 = this;
            }
            try {
                f_2.Q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public Rectangle S() {
        Rectangle rectangle = super.S();
        String[] stringArray = F_.F();
        try {
            Rectangle rectangle2;
            block8: {
                Rectangle rectangle3;
                block6: {
                    rectangle2 = ((dv_0)this.lD).modelToView(this.ho);
                    rectangle3 = rectangle2;
                    if (stringArray == null) break block8;
                    try {
                        block9: {
                            if (rectangle3.x >= 5) break block6;
                            break block9;
                            catch (BadLocationException badLocationException) {
                                throw F_.a(badLocationException);
                            }
                        }
                        rectangle2.x = 5;
                    }
                    catch (BadLocationException badLocationException) {
                        throw F_.a(badLocationException);
                    }
                }
                rectangle3 = rectangle;
            }
            rectangle3.x += rectangle2.x;
        }
        catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
        return rectangle;
    }

    @Override
    protected void i(L1 l1, int n10) {
        Object object;
        Object object2;
        try {
            object2 = this.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.C(l1);
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
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected void L(String string) {
        block9: {
            F_ f_2;
            block8: {
                boolean bl;
                Object object;
                Object object2;
                String[] stringArray = F_.F();
                f_2 = this;
                if (stringArray == null) break block8;
                ((pa_1)f_2.h6).x(string, true);
                try {
                    object2 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    bl = (Boolean)object.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!bl) break block9;
                f_2 = this;
            }
            ((dv_0)f_2.lD).setText("");
        }
    }

    @Override
    protected void k(L1 l1) {
        int n10;
        block131: {
            int n11;
            block110: {
                int n12;
                String string;
                StringBuffer stringBuffer;
                String string2;
                L1 l12;
                block111: {
                    String[] stringArray;
                    block112: {
                        block128: {
                            boolean bl;
                            block129: {
                                block130: {
                                    String string3;
                                    String string4;
                                    int n13;
                                    block124: {
                                        Object object;
                                        Object object2;
                                        block125: {
                                            int n14;
                                            block126: {
                                                Object object3;
                                                Object object4;
                                                block127: {
                                                    Object object5;
                                                    bo_2 bo_22;
                                                    block122: {
                                                        int n15;
                                                        block123: {
                                                            int n16;
                                                            int n17;
                                                            block116: {
                                                                block121: {
                                                                    int n18;
                                                                    int n19;
                                                                    block119: {
                                                                        String string5;
                                                                        int n20;
                                                                        block120: {
                                                                            String string6;
                                                                            String string7;
                                                                            block118: {
                                                                                boolean bl2;
                                                                                block117: {
                                                                                    block113: {
                                                                                        String string8;
                                                                                        block114: {
                                                                                            block115: {
                                                                                                String string9;
                                                                                                String string10;
                                                                                                String string11;
                                                                                                bo_2 bo_23;
                                                                                                boolean bl3;
                                                                                                Object object6;
                                                                                                Object object7;
                                                                                                String string12;
                                                                                                block107: {
                                                                                                    L1 l13;
                                                                                                    int n21;
                                                                                                    int n22;
                                                                                                    block109: {
                                                                                                        block108: {
                                                                                                            block104: {
                                                                                                                block105: {
                                                                                                                    Object object8;
                                                                                                                    int n23;
                                                                                                                    block106: {
                                                                                                                        String string13;
                                                                                                                        try {
                                                                                                                            string13 = (String)l1.A();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                        }
                                                                                                                        string12 = string13;
                                                                                                                        n11 = 1;
                                                                                                                        n15 = 0;
                                                                                                                        l12 = l1;
                                                                                                                        stringArray = F_.F();
                                                                                                                        try {
                                                                                                                            n22 = ((Boolean)this.K()).booleanValue();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                        }
                                                                                                                        if (stringArray == null) break block104;
                                                                                                                        if (n22 != 0) break block105;
                                                                                                                        n23 = n15 = ((tq_2)this.s).getSelectedRow();
                                                                                                                        if (stringArray == null) break block106;
                                                                                                                        if (n23 <= -1) break block107;
                                                                                                                        n23 = ((tq_2)this.s).convertRowIndexToModel(n15);
                                                                                                                    }
                                                                                                                    n21 = n23;
                                                                                                                    try {
                                                                                                                        object8 = this.H.getValueAt(n21, 0);
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                    }
                                                                                                                    l12 = (L1)object8;
                                                                                                                    if (stringArray != null) break block107;
                                                                                                                }
                                                                                                                n22 = n15 = ((JXList)this.l1).getSelectedIndex();
                                                                                                            }
                                                                                                            if (stringArray == null) break block108;
                                                                                                            if (n22 > -1) {
                                                                                                                try {
                                                                                                                    n22 = (Integer)this.v.getSize();
                                                                                                                }
                                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                                }
                                                                                                            }
                                                                                                            break block107;
                                                                                                        }
                                                                                                        if (stringArray == null) break block109;
                                                                                                        if (n22 <= 0) break block107;
                                                                                                        n22 = ((JXList)this.l1).convertIndexToModel(n15);
                                                                                                    }
                                                                                                    n21 = n22;
                                                                                                    try {
                                                                                                        l13 = (L1)this.v.Z(n21);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    l12 = l13;
                                                                                                }
                                                                                                if (l12 == null) break block110;
                                                                                                string2 = ((dv_0)this.lD).getText();
                                                                                                stringBuffer = new StringBuffer();
                                                                                                string = "";
                                                                                                n10 = string12.length();
                                                                                                if (stringArray != null) {
                                                                                                    if (n10 > 0) {
                                                                                                        string = string2.substring(0, this.ho);
                                                                                                    }
                                                                                                    stringBuffer.append(string);
                                                                                                    n10 = this.hC;
                                                                                                }
                                                                                                n12 = F_.hu;
                                                                                                if (stringArray == null) break block111;
                                                                                                if (n10 != n12) break block112;
                                                                                                boolean bl4 = false;
                                                                                                try {
                                                                                                    object7 = yt_1.i();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                try {
                                                                                                    object6 = object7.h();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                try {
                                                                                                    bl3 = (Boolean)object6.n();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                boolean bl5 = bl3;
                                                                                                n17 = string.length();
                                                                                                n16 = 0;
                                                                                                n13 = 0;
                                                                                                try {
                                                                                                    bo_23 = (bo_2)l12.g();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                bo_22 = bo_23;
                                                                                                try {
                                                                                                    string11 = (String)l12.A();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                string4 = string11;
                                                                                                try {
                                                                                                    string10 = (String)bo_22.U();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                String string14 = string10;
                                                                                                if (!bl5) break block113;
                                                                                                try {
                                                                                                    string9 = (String)bo_22.U();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                string3 = string9;
                                                                                                string8 = string14;
                                                                                                if (stringArray == null) break block114;
                                                                                                if (string8.equals("/")) break block115;
                                                                                                string8 = string4;
                                                                                                if (stringArray == null) break block114;
                                                                                                if (string8.endsWith("/")) {
                                                                                                    string3 = string3 + "/";
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                string8 = (String)lk_0.d(string3);
                                                                                            }
                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                throw invocationTargetException.getTargetException();
                                                                                            }
                                                                                        }
                                                                                        String string15 = string8;
                                                                                        stringBuffer.append(string15);
                                                                                        n16 += string15.length();
                                                                                        stringBuffer.append(string2.substring(this.hM));
                                                                                        if (stringArray != null) break block116;
                                                                                    }
                                                                                    string3 = "";
                                                                                    n20 = ((String)this.hn).lastIndexOf("/");
                                                                                    bl2 = ((String)this.hn).equals(".");
                                                                                    if (stringArray == null) break block117;
                                                                                    if (bl2) {
                                                                                        stringBuffer.append(F_.b(-6460, -20867));
                                                                                        n16 += 2;
                                                                                    }
                                                                                    string7 = (String)this.hn;
                                                                                    if (stringArray == null) break block118;
                                                                                    bl2 = string7.equals("~");
                                                                                }
                                                                                if (bl2) {
                                                                                    stringBuffer.append(F_.b(-6457, -5997));
                                                                                    n16 += 2;
                                                                                }
                                                                                try {
                                                                                    string7 = (String)l12.A();
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                            }
                                                                            String string16 = string7;
                                                                            try {
                                                                                string6 = (String)lk_0.d(string16);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            string5 = string6;
                                                                            n19 = n20;
                                                                            n18 = -1;
                                                                            if (stringArray == null) break block119;
                                                                            if (n19 != n18) break block120;
                                                                            stringBuffer.append(string5);
                                                                            n16 += string5.length();
                                                                            if (stringArray != null) break block121;
                                                                        }
                                                                        string3 = ((String)this.hn).substring(0, n20 + 1);
                                                                        stringBuffer.append(string3);
                                                                        stringBuffer.append(string5);
                                                                        n19 = n16 += string3.length();
                                                                        n18 = string5.length();
                                                                    }
                                                                    n16 = n19 + n18;
                                                                }
                                                                stringBuffer.append(string2.substring(this.hM));
                                                            }
                                                            n13 = n17 + n16;
                                                            string3 = stringBuffer.toString();
                                                            try {
                                                                n14 = ((Boolean)bo_22.n()).booleanValue();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            if (stringArray == null) break block122;
                                                            if (n14 != 0) break block123;
                                                            try {
                                                                bl = (Boolean)bo_22.t();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            if (stringArray == null) break block124;
                                                            if (!bl) break block125;
                                                        }
                                                        n14 = n15;
                                                    }
                                                    if (stringArray == null) break block126;
                                                    if (n14 <= -1) break block127;
                                                    n11 = 0;
                                                    try {
                                                        object5 = bo_22.U();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    this.hn = object5;
                                                    F_ f_2 = this;
                                                    if (stringArray != null) {
                                                        if (!((String)f_2.hn).endsWith("/")) {
                                                            F_ f_3 = this;
                                                            f_3.hn = (String)f_3.hn + "/";
                                                        }
                                                        f_2 = this;
                                                    }
                                                    f_2.hl = this.hn;
                                                    SwingUtilities.invokeLater(new DY(this));
                                                    if (stringArray != null) break block128;
                                                }
                                                try {
                                                    object4 = yt_1.i();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    object3 = object4.P();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    n14 = ((Boolean)object3.w()).booleanValue() ? 1 : 0;
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            if (stringArray != null) {
                                                if (n14 == 0) {
                                                    try {
                                                        this.o();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        lk_0.n();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    return;
                                                }
                                                ((dv_0)this.lD).setText(string3);
                                                ((dv_0)this.lD).setCaretPosition(n13);
                                                n14 = n11 = 1;
                                            }
                                            if (stringArray != null) break block128;
                                        }
                                        try {
                                            object2 = yt_1.i();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            object = object2.P();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            bl = (Boolean)object.w();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                    }
                                    if (stringArray != null) {
                                        if (!bl) {
                                            try {
                                                this.o();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                lk_0.n();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            return;
                                        }
                                        ((dv_0)this.lD).setText(string3);
                                        ((dv_0)this.lD).setCaretPosition(n13);
                                        bl = string4.endsWith("/");
                                    }
                                    if (stringArray == null) break block129;
                                    if (!bl) break block130;
                                    n11 = 0;
                                    if (stringArray != null) break block128;
                                }
                                bl = true;
                            }
                            n11 = bl ? 1 : 0;
                        }
                        if (stringArray != null) break block110;
                    }
                    n10 = this.hC;
                    if (stringArray == null) break block131;
                    n12 = F_.hy;
                }
                if (n10 == n12) {
                    String string17;
                    String string18;
                    try {
                        string18 = (String)l12.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringBuffer.append(string18);
                    stringBuffer.append(string2.substring(this.hM));
                    String string19 = stringBuffer.toString();
                    ((dv_0)this.lD).selectAll();
                    ((dv_0)this.lD).setText(string19);
                    try {
                        string17 = (String)l12.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((dv_0)this.lD).setCaretPosition(string.length() + string17.length());
                    n11 = 1;
                }
            }
            n10 = n11;
        }
        if (n10 != 0) {
            SwingUtilities.invokeLater(new tp_0(this));
        }
        this.M = true;
        ((dv_0)this.Z).setText("");
    }

    @Override
    public void M() {
        String string = ((dv_0)this.lD).getText().trim();
        int n10 = ((JXList)this.l1).getSelectedIndex();
        L1 l1 = new L1();
        String[] stringArray = F_.F();
        String string2 = new File((String)this.hl).getName();
        if (stringArray != null) {
            if (string2.equals("")) {
                string2 = "/";
            }
            try {
                l1.i(string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        bo_2 bo_22 = new bo_2((String)this.hl, "", "", "");
        try {
            bo_22.Y(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bo_22.R(bo_2.q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l1.Q(bo_22);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.k(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected dx_2 k() {
        dx_2 dx_22;
        block116: {
            Object object;
            block137: {
                Object object2;
                block136: {
                    String[] stringArray;
                    block119: {
                        Object object3;
                        Object object4;
                        ArrayList arrayList;
                        Object object5;
                        block127: {
                            block118: {
                                ArrayList arrayList2;
                                KV kV;
                                block128: {
                                    Object object6;
                                    Iterator iterator;
                                    block129: {
                                        int n10;
                                        Object object7;
                                        Object object82;
                                        ty_0 ty_02;
                                        block117: {
                                            ArrayList arrayList3;
                                            ArrayList arrayList4;
                                            int n11;
                                            block126: {
                                                int n12;
                                                block125: {
                                                    Long l2;
                                                    Serializable serializable;
                                                    int n13;
                                                    int n14;
                                                    block124: {
                                                        block122: {
                                                            block123: {
                                                                ArrayList arrayList5;
                                                                dx_2 dx_23;
                                                                Object object9;
                                                                Object object10;
                                                                KV kV2;
                                                                _y_0 _y_02;
                                                                String string;
                                                                block121: {
                                                                    pa_1 pa_12;
                                                                    block120: {
                                                                        dx_22 = new dx_2();
                                                                        stringArray = F_.F();
                                                                        string = "";
                                                                        pa_12 = (pa_1)this.h6;
                                                                        if (stringArray == null) break block120;
                                                                        if (pa_12 == null) break block116;
                                                                        pa_12 = (pa_1)this.h6;
                                                                    }
                                                                    _y_02 = pa_12.X();
                                                                    if (stringArray == null) break block121;
                                                                    if (_y_02 == null) break block116;
                                                                    _y_02 = ((pa_1)this.h6).X();
                                                                }
                                                                ty_02 = _y_02.M();
                                                                try {
                                                                    kV2 = (KV)ty_02.p();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                kV = kV2;
                                                                IR iR = (IR)((pa_1)this.h6).X().O();
                                                                string = (String)this.hn;
                                                                n14 = this.hC;
                                                                n13 = F_.hy;
                                                                if (stringArray == null) break block122;
                                                                if (n14 != n13) break block123;
                                                                try {
                                                                    object10 = yt_1.i();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                try {
                                                                    object9 = object10.h();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                try {
                                                                    dx_23 = (dx_2)object9.g();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                dx_2 dx_24 = dx_23;
                                                                serializable = new ArrayList();
                                                                try {
                                                                    dx_22.z(serializable);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                HashSet<Object> hashSet = new HashSet<Object>();
                                                                try {
                                                                    arrayList5 = (ArrayList)dx_24.V();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                for (Object object82 : arrayList5) {
                                                                    String string2;
                                                                    try {
                                                                        string2 = (String)object82.A();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    object7 = string2.trim();
                                                                    int n15 = ((String)object7).indexOf(F_.b(21387, 4759823690190647694L));
                                                                    if (stringArray == null) break block116;
                                                                    int n16 = n15;
                                                                    if (stringArray != null) {
                                                                        if (n16 > -1) {
                                                                            object7 = ((String)object7).substring(0, n15);
                                                                        }
                                                                        n16 = hashSet.contains(object7) ? 1 : 0;
                                                                    }
                                                                    if (n16 == 0) {
                                                                        object5 = new L1();
                                                                        try {
                                                                            object5.i(object7);
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        ((ArrayList)serializable).add(object5);
                                                                        hashSet.add(object7);
                                                                    }
                                                                    if (stringArray != null) continue;
                                                                }
                                                                if (stringArray != null) break block116;
                                                            }
                                                            n14 = this.hC;
                                                            n13 = F_.hu;
                                                        }
                                                        if (stringArray == null) break block124;
                                                        if (n14 == n13) {
                                                            Object object11;
                                                            Object object12;
                                                            n14 = F_.b(13089, 5634008427771105585L);
                                                            try {
                                                                object12 = yt_1.i();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                object11 = object12.h();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                n13 = (Integer)object11.D();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                        }
                                                        break block116;
                                                    }
                                                    int n17 = n14 * n13;
                                                    try {
                                                        l2 = (Long)kV.R(this.hl);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    serializable = l2;
                                                    n12 = 0;
                                                    if (serializable == null) break block125;
                                                    long l3 = System.currentTimeMillis() - (Long)serializable - (long)n17;
                                                    n11 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                                    if (stringArray == null) break block126;
                                                    if (n11 > 0) {
                                                        n12 = 1;
                                                    }
                                                }
                                                n11 = n12;
                                            }
                                            if (n11 != 0) {
                                                try {
                                                    kV.L(this.hl);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            try {
                                                arrayList4 = (ArrayList)kV.F(this.hl);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            object = arrayList4;
                                            object82 = new ArrayList();
                                            object7 = new ArrayList();
                                            arrayList = object;
                                            if (stringArray == null) break block127;
                                            if (arrayList != null) break block128;
                                            try {
                                                ty_02.T(this.hl);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                arrayList3 = (ArrayList)kV.F(this.hl);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            object = arrayList3;
                                            iterator = ((ArrayList)object).iterator();
                                            while (iterator.hasNext()) {
                                                bo_2 bo_22;
                                                object5 = (L1)iterator.next();
                                                try {
                                                    bo_22 = (bo_2)object5.g();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                object4 = bo_22;
                                                try {
                                                    n10 = (Integer)object4.P();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (stringArray == null) break block117;
                                                if (stringArray != null && n10 == bo_2.p) {
                                                    String string;
                                                    String string3;
                                                    try {
                                                        string3 = (String)object4.U();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    ((ArrayList)object7).add(string3);
                                                    try {
                                                        string = (String)object4.i();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    ((ArrayList)object82).add(string);
                                                }
                                                if (stringArray != null) continue;
                                            }
                                            object6 = object7;
                                            if (stringArray == null) break block129;
                                            n10 = ((ArrayList)object6).size();
                                        }
                                        if (n10 > 0) {
                                            try {
                                                ty_02.t(object7, object82);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                        }
                                        object6 = object;
                                    }
                                    iterator = ((ArrayList)object6).iterator();
                                    while (iterator.hasNext()) {
                                        Icon icon;
                                        bo_2 bo_23;
                                        object5 = (L1)iterator.next();
                                        try {
                                            bo_23 = (bo_2)object5.g();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        object4 = bo_23;
                                        try {
                                            icon = (Icon)lk_0.D(object4);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        object3 = icon;
                                        if (stringArray == null) break block118;
                                        if (stringArray != null) {
                                            int n18;
                                            try {
                                                n18 = (Integer)object4.P();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (n18 == bo_2.p) {
                                                boolean bl;
                                                try {
                                                    bl = (Boolean)object4.t();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (bl) {
                                                    String string;
                                                    try {
                                                        string = (String)object5.A();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        object5.i(string + "/");
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    object3 = (Icon)lk_0.T;
                                                }
                                            }
                                            try {
                                                object5.v(object3);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                        }
                                        if (stringArray != null) continue;
                                    }
                                    try {
                                        kV.w(this.hl, object);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                try {
                                    arrayList2 = (ArrayList)kV.F(this.hl);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                object = arrayList2;
                            }
                            arrayList = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList;
                        object5 = ((ArrayList)object).iterator();
                        while (object5.hasNext()) {
                            boolean bl;
                            block134: {
                                boolean bl2;
                                block135: {
                                    block130: {
                                        block131: {
                                            boolean bl3;
                                            block132: {
                                                block133: {
                                                    Object object13;
                                                    Object object14;
                                                    String string;
                                                    bo_2 bo_24;
                                                    object4 = (L1)object5.next();
                                                    try {
                                                        bo_24 = (bo_2)object4.g();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    object3 = bo_24;
                                                    try {
                                                        string = (String)object3.X();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    String string4 = string;
                                                    bl2 = false;
                                                    if (stringArray == null) break block119;
                                                    bl = string4.equals(".");
                                                    if (stringArray == null) break block130;
                                                    if (bl) break block131;
                                                    bl = string4.equals(F_.b(-6463, 26881));
                                                    if (stringArray == null) break block130;
                                                    if (bl) break block131;
                                                    try {
                                                        object14 = yt_1.i();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        object13 = object14.h();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        bl3 = (Boolean)object13.F();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (stringArray == null) break block132;
                                                    if (bl3) break block133;
                                                    bl = string4.startsWith(".");
                                                    if (stringArray == null) break block130;
                                                    if (bl) break block131;
                                                    bl2 = true;
                                                    if (stringArray != null) break block131;
                                                }
                                                bl3 = true;
                                            }
                                            bl2 = bl3;
                                        }
                                        bl = this.hB;
                                    }
                                    if (stringArray == null) break block134;
                                    if (!bl) break block135;
                                    try {
                                        bl = (Boolean)object3.n();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray == null) break block134;
                                    if (bl) break block135;
                                    try {
                                        bl = (Boolean)object3.t();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray == null) break block134;
                                    if (!bl) {
                                        bl2 = false;
                                    }
                                }
                                bl = bl2;
                            }
                            if (stringArray != null && bl) {
                                bl = arrayList6.add(object4);
                            }
                            if (stringArray != null) continue;
                        }
                        object = arrayList6;
                    }
                    object2 = object;
                    if (stringArray == null) break block136;
                    if (object2 != null) break block137;
                    object2 = new ArrayList();
                }
                object = object2;
            }
            try {
                dx_22.z(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return dx_22;
    }

    @Override
    protected dx_2 n() {
        dx_2 dx_22 = new dx_2();
        return dx_22;
    }

    @Override
    public boolean p(L1 l1) {
        return true;
    }

    @Override
    protected String c() {
        return ((dv_0)this.Z).getText().trim();
    }

    @Override
    public void Q(L1 l1, int n10) {
    }

    public boolean l() {
        return this.h_;
    }

    public void D(boolean bl) {
        this.h_ = bl;
        ((JLabel)this.hT).setVisible(bl);
    }

    @Override
    public void h() {
        this.h6 = null;
        this.hY = null;
        this.hn = null;
        this.hR = null;
        this.hT = null;
        this.hJ = null;
        this.hl = null;
        this.hV = null;
    }

    @Override
    public void K() {
        try {
            yt_1.F.W((Object)new n5(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    static dv_0 l(F_ f_2) {
        return (dv_0)f_2.lD;
    }

    static dv_0 E(F_ f_2) {
        return (dv_0)f_2.Z;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "g\u00e1\u0002\u0080\u00e0\u0002\u00f2&\r\u00b3\u00dc@_[|\\\u0096-\u0013\u008aIP\u0002Dl\u0002`\u00f9\u0003\u76e8\u5fde\u00c5";
                        var12_3 = "g\u00e1\u0002\u0080\u00e0\u0002\u00f2&\r\u00b3\u00dc@_[|\\\u0096-\u0013\u008aIP\u0002Dl\u0002`\u00f9\u0003\u76e8\u5fde\u00c5".length();
                        var9_4 = 2;
                        var8_5 = -1;
                        F_.U(new String[3]);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 112;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "L\u00dd5w\u0017\u00cb\u00e8}\u00dc\u955b\u0097\u9f6d\u686c\u530c\u955d\u00c8\u4e9f\u7edc\u769b\u5fce\u0002Vl";
                            var12_3 = "L\u00dd5w\u0017\u00cb\u00e8}\u00dc\u955b\u0097\u9f6d\u686c\u530c\u955d\u00c8\u4e9f\u7edc\u769b\u5fce\u0002Vl".length();
                            var9_4 = 20;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 73;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 22;
                                    break;
                                }
                                case 1: {
                                    v15 = 70;
                                    break;
                                }
                                case 2: {
                                    v15 = 119;
                                    break;
                                }
                                case 3: {
                                    v15 = 66;
                                    break;
                                }
                                case 4: {
                                    v15 = 67;
                                    break;
                                }
                                case 5: {
                                    v15 = 123;
                                    break;
                                }
                                default: {
                                    v15 = 126;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                F_.cb = var13;
                F_.db = new String[9];
                var0_7 = 7214729063298295932L;
                var6_8 = new long[19];
                var3_9 = 0;
                var4_10 = "\u00e54\u00eaX\u00c97\u009d\u00db\u00dc\u0018~\u00d9\u008a[\u0002\u00ab(\u00f67\u0001w;\u00b6\u00dc\u0099\u00d9\u0014H|\u00e0\u00cf\u0080u\u00d3f \u0005\u00c6c\u00b1\u00a1\u0095\u00ec\u00d9\u000eN\u0093-b\u00f8\u0014\u00bc\u009a\u00ec8)\u00a7\u00b44n*d\u00be\u00cbl\n6\u000e\u00ec+\u00a0\u0090\u009a|u\u00c6Z\u0081\"\u00ff\u00b4\u0015)4f\u00a4s\u00f8\u00e2\u00c4\u00e8\u00ec\u00ecMK\u00f1\u00ad\u00f8\u00f3\u00af\u008d\u00c1\u00bc x\u00a9CRI\u00ff\b\u0018 xT\u00cd\u001a9\u00f8\u0003U\"\u00cf\u00b5&\u00b3\u00f2\u00e3'\u009b\u0093\u00d4\u00ef\u00d9\u0099\u00d2";
                var5_11 = "\u00e54\u00eaX\u00c97\u009d\u00db\u00dc\u0018~\u00d9\u008a[\u0002\u00ab(\u00f67\u0001w;\u00b6\u00dc\u0099\u00d9\u0014H|\u00e0\u00cf\u0080u\u00d3f \u0005\u00c6c\u00b1\u00a1\u0095\u00ec\u00d9\u000eN\u0093-b\u00f8\u0014\u00bc\u009a\u00ec8)\u00a7\u00b44n*d\u00be\u00cbl\n6\u000e\u00ec+\u00a0\u0090\u009a|u\u00c6Z\u0081\"\u00ff\u00b4\u0015)4f\u00a4s\u00f8\u00e2\u00c4\u00e8\u00ec\u00ecMK\u00f1\u00ad\u00f8\u00f3\u00af\u008d\u00c1\u00bc x\u00a9CRI\u00ff\b\u0018 xT\u00cd\u001a9\u00f8\u0003U\"\u00cf\u00b5&\u00b3\u00f2\u00e3'\u009b\u0093\u00d4\u00ef\u00d9\u0099\u00d2".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00ef\u0081\u0001*\u00a0\u00af9\u00f7\u00c6U\u00ea\u00d9h\u0017\u0014\u0003";
                    var5_11 = "\u00ef\u0081\u0001*\u00a0\u00af9\u00f7\u00c6U\u00ea\u00d9h\u0017\u0014\u0003".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        F_.gb = var6_8;
        F_.hb = new Integer[19];
        F_.hy = 1;
        F_.h8 = F_.b(18625, 7194977137819904725L);
        F_.hu = F_.b(29580, 6295536606421701000L);
    }

    public static void U(String[] stringArray) {
        hU = stringArray;
    }

    public static String[] F() {
        return hU;
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE6C5) & 0xFFFF;
        if (db[n12] == null) {
            int n13;
            int n14;
            char[] cArray = cb[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 24;
                    break;
                }
                case 1: {
                    n14 = 210;
                    break;
                }
                case 2: {
                    n14 = 203;
                    break;
                }
                case 3: {
                    n14 = 174;
                    break;
                }
                case 4: {
                    n14 = 16;
                    break;
                }
                case 5: {
                    n14 = 92;
                    break;
                }
                case 6: {
                    n14 = 4;
                    break;
                }
                case 7: {
                    n14 = 119;
                    break;
                }
                case 8: {
                    n14 = 114;
                    break;
                }
                case 9: {
                    n14 = 105;
                    break;
                }
                case 10: {
                    n14 = 133;
                    break;
                }
                case 11: {
                    n14 = 251;
                    break;
                }
                case 12: {
                    n14 = 135;
                    break;
                }
                case 13: {
                    n14 = 145;
                    break;
                }
                case 14: {
                    n14 = 74;
                    break;
                }
                case 15: {
                    n14 = 250;
                    break;
                }
                case 16: {
                    n14 = 162;
                    break;
                }
                case 17: {
                    n14 = 111;
                    break;
                }
                case 18: {
                    n14 = 60;
                    break;
                }
                case 19: {
                    n14 = 102;
                    break;
                }
                case 20: {
                    n14 = 83;
                    break;
                }
                case 21: {
                    n14 = 193;
                    break;
                }
                case 22: {
                    n14 = 51;
                    break;
                }
                case 23: {
                    n14 = 184;
                    break;
                }
                case 24: {
                    n14 = 198;
                    break;
                }
                case 25: {
                    n14 = 157;
                    break;
                }
                case 26: {
                    n14 = 227;
                    break;
                }
                case 27: {
                    n14 = 214;
                    break;
                }
                case 28: {
                    n14 = 216;
                    break;
                }
                case 29: {
                    n14 = 204;
                    break;
                }
                case 30: {
                    n14 = 88;
                    break;
                }
                case 31: {
                    n14 = 107;
                    break;
                }
                case 32: {
                    n14 = 63;
                    break;
                }
                case 33: {
                    n14 = 69;
                    break;
                }
                case 34: {
                    n14 = 245;
                    break;
                }
                case 35: {
                    n14 = 71;
                    break;
                }
                case 36: {
                    n14 = 177;
                    break;
                }
                case 37: {
                    n14 = 47;
                    break;
                }
                case 38: {
                    n14 = 121;
                    break;
                }
                case 39: {
                    n14 = 78;
                    break;
                }
                case 40: {
                    n14 = 115;
                    break;
                }
                case 41: {
                    n14 = 182;
                    break;
                }
                case 42: {
                    n14 = 179;
                    break;
                }
                case 43: {
                    n14 = 87;
                    break;
                }
                case 44: {
                    n14 = 2;
                    break;
                }
                case 45: {
                    n14 = 136;
                    break;
                }
                case 46: {
                    n14 = 123;
                    break;
                }
                case 47: {
                    n14 = 97;
                    break;
                }
                case 48: {
                    n14 = 35;
                    break;
                }
                case 49: {
                    n14 = 34;
                    break;
                }
                case 50: {
                    n14 = 93;
                    break;
                }
                case 51: {
                    n14 = 39;
                    break;
                }
                case 52: {
                    n14 = 137;
                    break;
                }
                case 53: {
                    n14 = 156;
                    break;
                }
                case 54: {
                    n14 = 147;
                    break;
                }
                case 55: {
                    n14 = 90;
                    break;
                }
                case 56: {
                    n14 = 59;
                    break;
                }
                case 57: {
                    n14 = 82;
                    break;
                }
                case 58: {
                    n14 = 143;
                    break;
                }
                case 59: {
                    n14 = 238;
                    break;
                }
                case 60: {
                    n14 = 176;
                    break;
                }
                case 61: {
                    n14 = 163;
                    break;
                }
                case 62: {
                    n14 = 42;
                    break;
                }
                case 63: {
                    n14 = 201;
                    break;
                }
                case 64: {
                    n14 = 85;
                    break;
                }
                case 65: {
                    n14 = 53;
                    break;
                }
                case 66: {
                    n14 = 232;
                    break;
                }
                case 67: {
                    n14 = 225;
                    break;
                }
                case 68: {
                    n14 = 175;
                    break;
                }
                case 69: {
                    n14 = 106;
                    break;
                }
                case 70: {
                    n14 = 226;
                    break;
                }
                case 71: {
                    n14 = 76;
                    break;
                }
                case 72: {
                    n14 = 61;
                    break;
                }
                case 73: {
                    n14 = 65;
                    break;
                }
                case 74: {
                    n14 = 101;
                    break;
                }
                case 75: {
                    n14 = 239;
                    break;
                }
                case 76: {
                    n14 = 14;
                    break;
                }
                case 77: {
                    n14 = 172;
                    break;
                }
                case 78: {
                    n14 = 54;
                    break;
                }
                case 79: {
                    n14 = 3;
                    break;
                }
                case 80: {
                    n14 = 64;
                    break;
                }
                case 81: {
                    n14 = 73;
                    break;
                }
                case 82: {
                    n14 = 12;
                    break;
                }
                case 83: {
                    n14 = 186;
                    break;
                }
                case 84: {
                    n14 = 6;
                    break;
                }
                case 85: {
                    n14 = 138;
                    break;
                }
                case 86: {
                    n14 = 81;
                    break;
                }
                case 87: {
                    n14 = 32;
                    break;
                }
                case 88: {
                    n14 = 43;
                    break;
                }
                case 89: {
                    n14 = 220;
                    break;
                }
                case 90: {
                    n14 = 146;
                    break;
                }
                case 91: {
                    n14 = 139;
                    break;
                }
                case 92: {
                    n14 = 25;
                    break;
                }
                case 93: {
                    n14 = 49;
                    break;
                }
                case 94: {
                    n14 = 144;
                    break;
                }
                case 95: {
                    n14 = 124;
                    break;
                }
                case 96: {
                    n14 = 13;
                    break;
                }
                case 97: {
                    n14 = 104;
                    break;
                }
                case 98: {
                    n14 = 173;
                    break;
                }
                case 99: {
                    n14 = 207;
                    break;
                }
                case 100: {
                    n14 = 211;
                    break;
                }
                case 101: {
                    n14 = 252;
                    break;
                }
                case 102: {
                    n14 = 19;
                    break;
                }
                case 103: {
                    n14 = 235;
                    break;
                }
                case 104: {
                    n14 = 75;
                    break;
                }
                case 105: {
                    n14 = 168;
                    break;
                }
                case 106: {
                    n14 = 68;
                    break;
                }
                case 107: {
                    n14 = 129;
                    break;
                }
                case 108: {
                    n14 = 45;
                    break;
                }
                case 109: {
                    n14 = 183;
                    break;
                }
                case 110: {
                    n14 = 33;
                    break;
                }
                case 111: {
                    n14 = 17;
                    break;
                }
                case 112: {
                    n14 = 206;
                    break;
                }
                case 113: {
                    n14 = 167;
                    break;
                }
                case 114: {
                    n14 = 148;
                    break;
                }
                case 115: {
                    n14 = 132;
                    break;
                }
                case 116: {
                    n14 = 120;
                    break;
                }
                case 117: {
                    n14 = 150;
                    break;
                }
                case 118: {
                    n14 = 246;
                    break;
                }
                case 119: {
                    n14 = 80;
                    break;
                }
                case 120: {
                    n14 = 99;
                    break;
                }
                case 121: {
                    n14 = 160;
                    break;
                }
                case 122: {
                    n14 = 158;
                    break;
                }
                case 123: {
                    n14 = 219;
                    break;
                }
                case 124: {
                    n14 = 141;
                    break;
                }
                case 125: {
                    n14 = 212;
                    break;
                }
                case 126: {
                    n14 = 94;
                    break;
                }
                case 127: {
                    n14 = 202;
                    break;
                }
                case 128: {
                    n14 = 95;
                    break;
                }
                case 129: {
                    n14 = 166;
                    break;
                }
                case 130: {
                    n14 = 171;
                    break;
                }
                case 131: {
                    n14 = 233;
                    break;
                }
                case 132: {
                    n14 = 8;
                    break;
                }
                case 133: {
                    n14 = 142;
                    break;
                }
                case 134: {
                    n14 = 195;
                    break;
                }
                case 135: {
                    n14 = 127;
                    break;
                }
                case 136: {
                    n14 = 56;
                    break;
                }
                case 137: {
                    n14 = 15;
                    break;
                }
                case 138: {
                    n14 = 29;
                    break;
                }
                case 139: {
                    n14 = 125;
                    break;
                }
                case 140: {
                    n14 = 11;
                    break;
                }
                case 141: {
                    n14 = 241;
                    break;
                }
                case 142: {
                    n14 = 116;
                    break;
                }
                case 143: {
                    n14 = 164;
                    break;
                }
                case 144: {
                    n14 = 249;
                    break;
                }
                case 145: {
                    n14 = 5;
                    break;
                }
                case 146: {
                    n14 = 91;
                    break;
                }
                case 147: {
                    n14 = 189;
                    break;
                }
                case 148: {
                    n14 = 169;
                    break;
                }
                case 149: {
                    n14 = 67;
                    break;
                }
                case 150: {
                    n14 = 188;
                    break;
                }
                case 151: {
                    n14 = 196;
                    break;
                }
                case 152: {
                    n14 = 110;
                    break;
                }
                case 153: {
                    n14 = 44;
                    break;
                }
                case 154: {
                    n14 = 23;
                    break;
                }
                case 155: {
                    n14 = 213;
                    break;
                }
                case 156: {
                    n14 = 217;
                    break;
                }
                case 157: {
                    n14 = 30;
                    break;
                }
                case 158: {
                    n14 = 58;
                    break;
                }
                case 159: {
                    n14 = 21;
                    break;
                }
                case 160: {
                    n14 = 192;
                    break;
                }
                case 161: {
                    n14 = 46;
                    break;
                }
                case 162: {
                    n14 = 22;
                    break;
                }
                case 163: {
                    n14 = 109;
                    break;
                }
                case 164: {
                    n14 = 72;
                    break;
                }
                case 165: {
                    n14 = 230;
                    break;
                }
                case 166: {
                    n14 = 77;
                    break;
                }
                case 167: {
                    n14 = 112;
                    break;
                }
                case 168: {
                    n14 = 48;
                    break;
                }
                case 169: {
                    n14 = 40;
                    break;
                }
                case 170: {
                    n14 = 134;
                    break;
                }
                case 171: {
                    n14 = 215;
                    break;
                }
                case 172: {
                    n14 = 38;
                    break;
                }
                case 173: {
                    n14 = 62;
                    break;
                }
                case 174: {
                    n14 = 10;
                    break;
                }
                case 175: {
                    n14 = 222;
                    break;
                }
                case 176: {
                    n14 = 223;
                    break;
                }
                case 177: {
                    n14 = 236;
                    break;
                }
                case 178: {
                    n14 = 7;
                    break;
                }
                case 179: {
                    n14 = 66;
                    break;
                }
                case 180: {
                    n14 = 187;
                    break;
                }
                case 181: {
                    n14 = 128;
                    break;
                }
                case 182: {
                    n14 = 41;
                    break;
                }
                case 183: {
                    n14 = 98;
                    break;
                }
                case 184: {
                    n14 = 197;
                    break;
                }
                case 185: {
                    n14 = 194;
                    break;
                }
                case 186: {
                    n14 = 27;
                    break;
                }
                case 187: {
                    n14 = 180;
                    break;
                }
                case 188: {
                    n14 = 224;
                    break;
                }
                case 189: {
                    n14 = 191;
                    break;
                }
                case 190: {
                    n14 = 31;
                    break;
                }
                case 191: {
                    n14 = 89;
                    break;
                }
                case 192: {
                    n14 = 52;
                    break;
                }
                case 193: {
                    n14 = 96;
                    break;
                }
                case 194: {
                    n14 = 240;
                    break;
                }
                case 195: {
                    n14 = 161;
                    break;
                }
                case 196: {
                    n14 = 165;
                    break;
                }
                case 197: {
                    n14 = 130;
                    break;
                }
                case 198: {
                    n14 = 79;
                    break;
                }
                case 199: {
                    n14 = 122;
                    break;
                }
                case 200: {
                    n14 = 20;
                    break;
                }
                case 201: {
                    n14 = 103;
                    break;
                }
                case 202: {
                    n14 = 221;
                    break;
                }
                case 203: {
                    n14 = 228;
                    break;
                }
                case 204: {
                    n14 = 151;
                    break;
                }
                case 205: {
                    n14 = 248;
                    break;
                }
                case 206: {
                    n14 = 255;
                    break;
                }
                case 207: {
                    n14 = 185;
                    break;
                }
                case 208: {
                    n14 = 178;
                    break;
                }
                case 209: {
                    n14 = 149;
                    break;
                }
                case 210: {
                    n14 = 231;
                    break;
                }
                case 211: {
                    n14 = 234;
                    break;
                }
                case 212: {
                    n14 = 113;
                    break;
                }
                case 213: {
                    n14 = 155;
                    break;
                }
                case 214: {
                    n14 = 57;
                    break;
                }
                case 215: {
                    n14 = 153;
                    break;
                }
                case 216: {
                    n14 = 26;
                    break;
                }
                case 217: {
                    n14 = 18;
                    break;
                }
                case 218: {
                    n14 = 0;
                    break;
                }
                case 219: {
                    n14 = 55;
                    break;
                }
                case 220: {
                    n14 = 205;
                    break;
                }
                case 221: {
                    n14 = 1;
                    break;
                }
                case 222: {
                    n14 = 70;
                    break;
                }
                case 223: {
                    n14 = 170;
                    break;
                }
                case 224: {
                    n14 = 190;
                    break;
                }
                case 225: {
                    n14 = 108;
                    break;
                }
                case 226: {
                    n14 = 37;
                    break;
                }
                case 227: {
                    n14 = 199;
                    break;
                }
                case 228: {
                    n14 = 244;
                    break;
                }
                case 229: {
                    n14 = 209;
                    break;
                }
                case 230: {
                    n14 = 181;
                    break;
                }
                case 231: {
                    n14 = 152;
                    break;
                }
                case 232: {
                    n14 = 86;
                    break;
                }
                case 233: {
                    n14 = 50;
                    break;
                }
                case 234: {
                    n14 = 154;
                    break;
                }
                case 235: {
                    n14 = 131;
                    break;
                }
                case 236: {
                    n14 = 159;
                    break;
                }
                case 237: {
                    n14 = 126;
                    break;
                }
                case 238: {
                    n14 = 36;
                    break;
                }
                case 239: {
                    n14 = 200;
                    break;
                }
                case 240: {
                    n14 = 253;
                    break;
                }
                case 241: {
                    n14 = 118;
                    break;
                }
                case 242: {
                    n14 = 117;
                    break;
                }
                case 243: {
                    n14 = 247;
                    break;
                }
                case 244: {
                    n14 = 242;
                    break;
                }
                case 245: {
                    n14 = 208;
                    break;
                }
                case 246: {
                    n14 = 9;
                    break;
                }
                case 247: {
                    n14 = 229;
                    break;
                }
                case 248: {
                    n14 = 243;
                    break;
                }
                case 249: {
                    n14 = 84;
                    break;
                }
                case 250: {
                    n14 = 28;
                    break;
                }
                case 251: {
                    n14 = 237;
                    break;
                }
                case 252: {
                    n14 = 100;
                    break;
                }
                case 253: {
                    n14 = 254;
                    break;
                }
                case 254: {
                    n14 = 218;
                    break;
                }
                default: {
                    n14 = 140;
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
            F_.db[n12] = new String(cArray).intern();
        }
        return db[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2215;
        if (hb[n11] == null) {
            F_.hb[n11] = (int)(gb[n11] ^ l2);
        }
        return hb[n11];
    }
}

