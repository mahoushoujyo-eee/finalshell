/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class WT
extends JDialog
implements CH {
    fl_2 g;
    JTextArea I;
    boolean C;
    JButton G;
    JButton i;
    JButton F;
    JTextArea h;
    JScrollPane O;
    boolean L;
    final int a;
    boolean d;
    boolean p;
    long D;
    private static String[] b;
    private static final String[] c;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] j;
    private static final long k;

    public WT(JFrame jFrame, fl_2 fl_22) {
        String[] stringArray;
        block18: {
            JPanel jPanel;
            block16: {
                block17: {
                    boolean bl;
                    boolean bl2;
                    String[] stringArray2 = WT.y();
                    this.C = false;
                    this.L = true;
                    this.a = WT.a(30823, 5309129010538402951L);
                    this.d = false;
                    this.p = false;
                    this.D = k;
                    this.setDefaultCloseOperation(0);
                    this.setTitle("FinalShell更新");
                    this.g = fl_22;
                    jPanel = (JPanel)this.getContentPane();
                    jPanel.setLayout(new MigLayout("insets 20 20 20 20", "", ""));
                    this.I = new JTextArea();
                    ((JTextArea)this.I).setOpaque(false);
                    ((JTextArea)this.I).setEditable(false);
                    ((JTextArea)this.I).setRows(2);
                    jPanel.add((Component)((JTextArea)this.I), "width 400::,wrap");
                    JPanel jPanel2 = new JPanel();
                    jPanel2.setLayout(new MigLayout("insets 0 0 0 0", "", "[]"));
                    jPanel.add((Component)jPanel2, "align center,wrap");
                    this.F = new JButton("更新日志");
                    stringArray = stringArray2;
                    ((JButton)this.F).addActionListener(new zE(this));
                    jPanel2.add((Component)((JButton)this.F), "align center");
                    this.G = new JButton("检查更新");
                    ((JButton)this.G).addActionListener(new ux_2(this, fl_22));
                    jPanel2.add((Component)((JButton)this.G), "align center");
                    this.i = new JButton("开始安装并关闭软件");
                    ((JButton)this.i).addActionListener(new ox_1(this, fl_22));
                    jPanel2.add((Component)((JButton)this.i), "align center");
                    if (stringArray != null) break block16;
                    try {
                        bl2 = (Boolean)vk_0.f();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl2) break block17;
                    try {
                        bl = (Boolean)vk_0.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block18;
                }
                this.h = new JTextArea();
                this.O = new JScrollPane((JTextArea)this.h);
                ((JScrollPane)this.O).setBorder(BorderFactory.createTitledBorder("安装日志"));
            }
            jPanel.add((Component)((JScrollPane)this.O), "width 400::,height 200:: ,wrap");
        }
        try {
            this.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.pack();
        try {
            yt_1.F.J(new zy_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.V((Object)new K4(this), WT.a(4061, 7262940743782900543L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.d("");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void d(String string) {
        SwingUtilities.invokeLater(new au_0(this, string));
    }

    /*
     * Unable to fully structure code
     */
    public void I(JTextArea var1_1) {
        block5: {
            var3_2 = var1_1.getLineCount() - WT.a(11841, 8627037662698472096L);
            var2_3 = WT.y();
            try {
                v0 = var3_2;
                if (var2_3 == null) {
                    if (v0 <= 0) break block5;
                }
                ** GOTO lbl13
            }
            catch (BadLocationException v1) {
                throw WT.a(v1);
            }
            try {
                v0 = var1_1.getLineEndOffset(var3_2 - 1);
lbl13:
                // 2 sources

                var4_4 = v0;
                var1_1.replaceRange("", 0, var4_4);
            }
            catch (BadLocationException var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    void N(String string) {
        block5: {
            WT wT;
            block4: {
                String[] stringArray = WT.y();
                ((JTextArea)this.h).append(string);
                try {
                    this.I(this.h);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String[] stringArray2 = stringArray;
                wT = this;
                if (stringArray2 != null) break block4;
                if (!wT.L) break block5;
                wT = this;
            }
            JScrollBar jScrollBar = ((JScrollPane)wT.O).getVerticalScrollBar();
            jScrollBar.setValue(jScrollBar.getMaximum());
        }
    }

    public void C() {
        block12: {
            block13: {
                long l2;
                String[] stringArray;
                block11: {
                    stringArray = WT.y();
                    long l3 = System.currentTimeMillis() - this.D;
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (stringArray != null) break block11;
                    if (l2 > 0) {
                        try {
                            l2 = (long)((Boolean)vk_0.f()).booleanValue();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block12;
                }
                if (l2 != false) break block13;
                try {
                    this.g.e();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray == null) break block12;
            }
            try {
                this.g.e();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void setVisible(boolean bl) {
        block9: {
            boolean bl2;
            block10: {
                String[] stringArray;
                block8: {
                    String[] stringArray2 = WT.y();
                    boolean bl3 = this.isVisible();
                    super.setVisible(bl);
                    stringArray = stringArray2;
                    bl2 = bl;
                    if (stringArray == null) {
                        if (bl2) {
                            this.C = true;
                            this.toFront();
                            this.requestFocus();
                        }
                        bl2 = bl3;
                    }
                    if (stringArray != null) break block8;
                    if (bl2) break block9;
                    bl2 = bl;
                }
                if (stringArray != null) break block10;
                if (!bl2) break block9;
                bl2 = ((JButton)this.G).isEnabled();
            }
            if (bl2) {
                try {
                    yt_1.F.J(new YD(this));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    void N() {
        block140: {
            block150: {
                block149: {
                    block148: {
                        block141: {
                            block142: {
                                block147: {
                                    block146: {
                                        block145: {
                                            block144: {
                                                block143: {
                                                    block133: {
                                                        block134: {
                                                            block139: {
                                                                block138: {
                                                                    block137: {
                                                                        block136: {
                                                                            block135: {
                                                                                block132: {
                                                                                    block131: {
                                                                                        block122: {
                                                                                            block130: {
                                                                                                block124: {
                                                                                                    block125: {
                                                                                                        block129: {
                                                                                                            block127: {
                                                                                                                block128: {
                                                                                                                    block126: {
                                                                                                                        block123: {
                                                                                                                            block120: {
                                                                                                                                block121: {
                                                                                                                                    var2_1 = "已经是最新版";
                                                                                                                                    try {
                                                                                                                                        v0 = (Y7)this.g.B();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException v1) {
                                                                                                                                        throw v1.getTargetException();
                                                                                                                                    }
                                                                                                                                    var3_2 = v0;
                                                                                                                                    try {
                                                                                                                                        v2 = (String)this.g.b();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException v3) {
                                                                                                                                        throw v3.getTargetException();
                                                                                                                                    }
                                                                                                                                    var4_3 = v2;
                                                                                                                                    var1_4 = WT.y();
                                                                                                                                    if (var3_2 == null) {
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        v4 = (Boolean)this.g.O();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException v5) {
                                                                                                                                        throw v5.getTargetException();
                                                                                                                                    }
                                                                                                                                    if (var1_4 != null) break block120;
                                                                                                                                    if (!v4) break block121;
                                                                                                                                    var2_1 = "正在检查更新...";
                                                                                                                                    if (var1_4 == null) break block122;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v4 = (Boolean)this.g.g();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v6) {
                                                                                                                                    throw v6.getTargetException();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (var1_4 != null) break block123;
                                                                                                                            if (v4) {
                                                                                                                                try {
                                                                                                                                    v4 = (Boolean)this.g.N();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v7) {
                                                                                                                                    throw v7.getTargetException();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block122;
                                                                                                                        }
                                                                                                                        if (var1_4 != null) break block124;
                                                                                                                        if (!v4) break block125;
                                                                                                                        if (var3_2 != null) {
                                                                                                                            try {
                                                                                                                                v8 = (String)var3_2.J();
                                                                                                                            }
                                                                                                                            catch (InvocationTargetException v9) {
                                                                                                                                throw v9.getTargetException();
                                                                                                                            }
                                                                                                                            var2_1 = "发现新版本 " + v8 + "\n";
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v10 = (Boolean)this.g.h();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException v11) {
                                                                                                                            throw v11.getTargetException();
                                                                                                                        }
                                                                                                                        if (var1_4 == null) {
                                                                                                                            if (v10) {
                                                                                                                                try {
                                                                                                                                    v12 = (String)this.g.x();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v13) {
                                                                                                                                    throw v13.getTargetException();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v14 = (Long)this.g.L();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v15) {
                                                                                                                                    throw v15.getTargetException();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v16 = (String)lk_0.H(v14);
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v17) {
                                                                                                                                    throw v17.getTargetException();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v18 = (Long)this.g.R();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v19) {
                                                                                                                                    throw v19.getTargetException();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v20 = (String)lk_0.H(v18);
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v21) {
                                                                                                                                    throw v21.getTargetException();
                                                                                                                                }
                                                                                                                                var2_1 = var2_1 + "正在下载更新: " + v12 + " " + v16 + "/" + v20;
                                                                                                                            }
                                                                                                                            v10 = this.C;
                                                                                                                        }
                                                                                                                        if (var1_4 != null) break block126;
                                                                                                                        if (v10) break block122;
                                                                                                                        this.setLocationRelativeTo(null);
                                                                                                                        v10 = false;
                                                                                                                    }
                                                                                                                    var5_5 = v10;
                                                                                                                    v22 = (da_1)U.f;
                                                                                                                    if (var1_4 != null) break block127;
                                                                                                                    if (v22 != null) break block128;
                                                                                                                    var5_5 = true;
                                                                                                                    if (var1_4 == null) break block129;
                                                                                                                }
                                                                                                                v22 = (da_1)U.f;
                                                                                                            }
                                                                                                            v23 = v22.isVisible();
                                                                                                            if (var1_4 == null) {
                                                                                                                if (!v23) {
                                                                                                                    var5_5 = true;
                                                                                                                }
                                                                                                                v23 = var5_5;
                                                                                                            }
                                                                                                            if (v23) {
                                                                                                                try {
                                                                                                                    this.setVisible(true);
                                                                                                                }
                                                                                                                catch (InvocationTargetException v24) {
                                                                                                                    throw v24.getTargetException();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        if (var1_4 == null) break block122;
                                                                                                    }
                                                                                                    try {
                                                                                                        v4 = (Boolean)this.g.A();
                                                                                                    }
                                                                                                    catch (InvocationTargetException v25) {
                                                                                                        throw v25.getTargetException();
                                                                                                    }
                                                                                                }
                                                                                                if (!v4) break block130;
                                                                                                var2_1 = "更新文件已下载完成";
                                                                                                if (var1_4 == null) break block122;
                                                                                            }
                                                                                            var2_1 = "已经是最新版";
                                                                                        }
                                                                                        v26 = var4_3;
                                                                                        if (var1_4 != null) break block131;
                                                                                        if (v26 == null) break block132;
                                                                                        v26 = var4_3;
                                                                                    }
                                                                                    var2_1 = v26;
                                                                                }
                                                                                ((JTextArea)this.I).setText(var2_1);
                                                                                try {
                                                                                    v27 = (Boolean)vk_0.s();
                                                                                }
                                                                                catch (InvocationTargetException v28) {
                                                                                    throw v28.getTargetException();
                                                                                }
                                                                                if (var1_4 != null) break block133;
                                                                                if (!v27) break block134;
                                                                                v29 = (JButton)this.G;
                                                                                try {
                                                                                    v30 = (Boolean)this.g.P();
                                                                                }
                                                                                catch (InvocationTargetException v31) {
                                                                                    throw v31.getTargetException();
                                                                                }
                                                                                if (var1_4 != null) break block135;
                                                                                if (!v30) {
                                                                                    try {
                                                                                        v30 = (Boolean)this.g.O();
                                                                                    }
                                                                                    catch (InvocationTargetException v32) {
                                                                                        throw v32.getTargetException();
                                                                                    }
                                                                                }
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            if (var1_4 == null) {
                                                                                ** if (v30) goto lbl-1000
lbl-1000:
                                                                                // 1 sources

                                                                                {
                                                                                    v30 = true;
                                                                                    ** GOTO lbl175
                                                                                }
                                                                            }
                                                                            break block136;
lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                v30 = false;
                                                                            }
                                                                        }
                                                                        v29.setEnabled(v30);
                                                                        v33 = (JButton)this.i;
                                                                        try {
                                                                            v34 = (Boolean)this.g.P();
                                                                        }
                                                                        catch (InvocationTargetException v35) {
                                                                            throw v35.getTargetException();
                                                                        }
                                                                        if (var1_4 != null) break block137;
                                                                        if (!v34) {
                                                                            try {
                                                                                v34 = (Boolean)this.g.O();
                                                                            }
                                                                            catch (InvocationTargetException v36) {
                                                                                throw v36.getTargetException();
                                                                            }
                                                                        }
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    if (var1_4 != null) break block138;
                                                                    if (!v34) {
                                                                        try {
                                                                            v34 = (Boolean)this.g.N();
                                                                        }
                                                                        catch (InvocationTargetException v37) {
                                                                            throw v37.getTargetException();
                                                                        }
                                                                    }
                                                                    ** GOTO lbl-1000
                                                                }
                                                                if (var1_4 == null) {
                                                                    ** if (!v34) goto lbl-1000
lbl-1000:
                                                                    // 1 sources

                                                                    {
                                                                        v34 = true;
                                                                        ** GOTO lbl210
                                                                    }
                                                                }
                                                                break block139;
lbl-1000:
                                                                // 3 sources

                                                                {
                                                                    v34 = false;
                                                                }
                                                            }
                                                            v33.setEnabled(v34);
                                                            if (var1_4 == null) break block140;
                                                        }
                                                        try {
                                                            v27 = (Boolean)vk_0.g();
                                                        }
                                                        catch (InvocationTargetException v38) {
                                                            throw v38.getTargetException();
                                                        }
                                                    }
                                                    if (var1_4 != null) break block141;
                                                    if (!v27) break block142;
                                                    v39 = (JButton)this.G;
                                                    try {
                                                        v40 = (Boolean)this.g.P();
                                                    }
                                                    catch (InvocationTargetException v41) {
                                                        throw v41.getTargetException();
                                                    }
                                                    if (var1_4 != null) break block143;
                                                    if (!v40) {
                                                        try {
                                                            v40 = (Boolean)this.g.O();
                                                        }
                                                        catch (InvocationTargetException v42) {
                                                            throw v42.getTargetException();
                                                        }
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                if (var1_4 == null) {
                                                    ** if (v40) goto lbl-1000
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        v40 = true;
                                                        ** GOTO lbl246
                                                    }
                                                }
                                                break block144;
lbl-1000:
                                                // 2 sources

                                                {
                                                    v40 = false;
                                                }
                                            }
                                            v39.setEnabled(v40);
                                            v43 = (JButton)this.i;
                                            try {
                                                v44 = (Boolean)this.g.P();
                                            }
                                            catch (InvocationTargetException v45) {
                                                throw v45.getTargetException();
                                            }
                                            if (var1_4 != null) break block145;
                                            if (!v44) {
                                                try {
                                                    v44 = (Boolean)this.g.O();
                                                }
                                                catch (InvocationTargetException v46) {
                                                    throw v46.getTargetException();
                                                }
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        if (var1_4 != null) break block146;
                                        if (!v44) {
                                            try {
                                                v44 = (Boolean)this.g.N();
                                            }
                                            catch (InvocationTargetException v47) {
                                                throw v47.getTargetException();
                                            }
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    if (var1_4 == null) {
                                        ** if (!v44) goto lbl-1000
lbl-1000:
                                        // 1 sources

                                        {
                                            v44 = true;
                                            ** GOTO lbl281
                                        }
                                    }
                                    break block147;
lbl-1000:
                                    // 3 sources

                                    {
                                        v44 = false;
                                    }
                                }
                                v43.setEnabled(v44);
                                if (var1_4 == null) break block140;
                            }
                            try {
                                v27 = (Boolean)vk_0.f();
                            }
                            catch (InvocationTargetException v48) {
                                throw v48.getTargetException();
                            }
                        }
                        if (!v27) break block140;
                        v49 = (JButton)this.G;
                        try {
                            v50 = (Boolean)this.g.O();
                        }
                        catch (InvocationTargetException v51) {
                            throw v51.getTargetException();
                        }
                        if (var1_4 == null) {
                            v50 = v50 == false;
                        }
                        v49.setEnabled(v50);
                        v52 = (JButton)this.i;
                        try {
                            v53 = (Boolean)this.g.P();
                        }
                        catch (InvocationTargetException v54) {
                            throw v54.getTargetException();
                        }
                        if (var1_4 != null) break block148;
                        if (!v53) {
                            try {
                                v53 = (Boolean)this.g.O();
                            }
                            catch (InvocationTargetException v55) {
                                throw v55.getTargetException();
                            }
                        }
                        ** GOTO lbl-1000
                    }
                    if (var1_4 != null) break block149;
                    if (!v53) {
                        try {
                            v53 = (Boolean)this.g.N();
                        }
                        catch (InvocationTargetException v56) {
                            throw v56.getTargetException();
                        }
                    }
                    ** GOTO lbl-1000
                }
                if (var1_4 == null) {
                    ** if (!v53) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v53 = true;
                        ** GOTO lbl336
                    }
                }
                break block150;
lbl-1000:
                // 3 sources

                {
                    v53 = false;
                }
            }
            v52.setEnabled(v53);
        }
    }

    public static void r(String[] stringArray) {
        b = stringArray;
    }

    public static String[] y() {
        return b;
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            var15 = new String[19];
                            var13_1 = 0;
                            WT.r(null);
                            var12_2 = "\u00ee\u00e9\u0002\u009cI\u00a6f\u0095\u0002\u009c\u00ddKA\u00bbq\u0095 \u00dc\u00c8\u00bc\u0013\u0086\"\u00fe\u0088\u0007\u00ad%\u0018\u00a4\t\u66f8\u6513\u65d0\u4ea3\u5d16\u4eb8\u8f0d\u5ba4\u622f\u0010\u00c1\u009d\u00e7\u0012\u00f5w\u00f1\u00af\u00f0\u00db\u0083\u00a3\u0095\u00b1\u001f6\u000ep\u0096\u001b\u0085\u0083\u00e5\u00b4\u00c4\u00de\u00bcN\u0018\"\u001b\u0002\u00fb}\u0006\u5378\u73ea\u6576\u7222\u67cd\u00ca\u0006\u5d1b\u7e9a\u66c2\u67f4\u65ab\u7239\fHv\u000f\u00d9B\u007f\u0096\u00fb\u00ff\u00e0\u00a8\u001d\t\u6bb5\u574a\u685b\u6710\u66ce\u6504\u0083]\u00f9\b\u6ba6\u575d\u4ef2\u8f6a\u6649\u65c0g\u00cb\u0012R\u00c2_\u000f\u000b\u00b4\u00a5\u00ec\u00ec\u00eb\b\u00e0\u00ba\u0006\u0016\u00d8\u00e4\u009e\f\u00a1n2\u00da\u00e5\u001fb\u00f7aa{-\u0011g\u00c8\u00ea\u000e\u00fe\u0085\u0001\u00a4\r\u000b\u00f6`\u00d4Y\u0014\u009f\u00ec\t\u5fe4\u5995\u5b37\u8854\u5ea1\u516b\u957f\u8f4a\u4e05\u0004\u66d5\u658e\u6517\u5f31\u0004\u5b64\u8808\u65f3\u5f3a\f>\"\u0005\u00f0\u00e6\u00efK\u00f4,\u0019\u6601\u65fb";
                            var14_3 = "\u00ee\u00e9\u0002\u009cI\u00a6f\u0095\u0002\u009c\u00ddKA\u00bbq\u0095 \u00dc\u00c8\u00bc\u0013\u0086\"\u00fe\u0088\u0007\u00ad%\u0018\u00a4\t\u66f8\u6513\u65d0\u4ea3\u5d16\u4eb8\u8f0d\u5ba4\u622f\u0010\u00c1\u009d\u00e7\u0012\u00f5w\u00f1\u00af\u00f0\u00db\u0083\u00a3\u0095\u00b1\u001f6\u000ep\u0096\u001b\u0085\u0083\u00e5\u00b4\u00c4\u00de\u00bcN\u0018\"\u001b\u0002\u00fb}\u0006\u5378\u73ea\u6576\u7222\u67cd\u00ca\u0006\u5d1b\u7e9a\u66c2\u67f4\u65ab\u7239\fHv\u000f\u00d9B\u007f\u0096\u00fb\u00ff\u00e0\u00a8\u001d\t\u6bb5\u574a\u685b\u6710\u66ce\u6504\u0083]\u00f9\b\u6ba6\u575d\u4ef2\u8f6a\u6649\u65c0g\u00cb\u0012R\u00c2_\u000f\u000b\u00b4\u00a5\u00ec\u00ec\u00eb\b\u00e0\u00ba\u0006\u0016\u00d8\u00e4\u009e\f\u00a1n2\u00da\u00e5\u001fb\u00f7aa{-\u0011g\u00c8\u00ea\u000e\u00fe\u0085\u0001\u00a4\r\u000b\u00f6`\u00d4Y\u0014\u009f\u00ec\t\u5fe4\u5995\u5b37\u8854\u5ea1\u516b\u957f\u8f4a\u4e05\u0004\u66d5\u658e\u6517\u5f31\u0004\u5b64\u8808\u65f3\u5f3a\f>\"\u0005\u00f0\u00e6\u00efK\u00f4,\u0019\u6601\u65fb".length();
                            var11_4 = 30;
                            var10_5 = -1;
lbl8:
                            // 2 sources

                            while (true) {
                                v0 = 59;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block22;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u6802\u6770\u6674\u654c\u0006\u5d99\u7ee7\u66a8\u6761\u65dc\u72b1";
                                var14_3 = "\u6802\u6770\u6674\u654c\u0006\u5d99\u7ee7\u66a8\u6761\u65dc\u72b1".length();
                                var11_4 = 4;
                                var10_5 = -1;
lbl23:
                                // 2 sources

                                while (true) {
                                    v0 = 34;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block22;
                                    break;
                                }
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block23;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl86
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 66;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 20;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 54;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 79;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 19;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 90;
                                        break;
                                    }
                                    default: {
                                        v15 = 32;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    WT.c = var15;
                    WT.e = new String[19];
                    var2_7 = 8048985971626810207L;
                    var8_8 = new long[3];
                    var5_9 = 0;
                    var6_10 = "j>\"\u009bK6Ix\u0014.\u00fc\u0092]\u00e5\u009f_*\u0014\u0003i\u00b9\u000f;\u0088";
                    var7_11 = "j>\"\u009bK6Ix\u0014.\u00fc\u0092]\u00e5\u009f_*\u0014\u0003i\u00b9\u000f;\u0088".length();
                    var4_12 = 0;
                    while (true) {
                        break block24;
                        break;
                    }
lbl108:
                    // 1 sources

                    while (true) {
                        var8_8[v17] = (((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L) ^ var2_7;
                        if (var4_12 < var7_11) ** continue;
                        break block25;
                        break;
                    }
                }
                var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                v17 = var5_9++;
                ** while (true)
            }
            WT.f = var8_8;
            WT.j = new Integer[3];
            break block26;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 869738723196198792L;
        ** while (true)
        WT.k = 869739375539430870L ^ var0_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6239) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 87;
                    break;
                }
                case 1: {
                    n14 = 79;
                    break;
                }
                case 2: {
                    n14 = 51;
                    break;
                }
                case 3: {
                    n14 = 64;
                    break;
                }
                case 4: {
                    n14 = 202;
                    break;
                }
                case 5: {
                    n14 = 185;
                    break;
                }
                case 6: {
                    n14 = 180;
                    break;
                }
                case 7: {
                    n14 = 190;
                    break;
                }
                case 8: {
                    n14 = 82;
                    break;
                }
                case 9: {
                    n14 = 46;
                    break;
                }
                case 10: {
                    n14 = 153;
                    break;
                }
                case 11: {
                    n14 = 168;
                    break;
                }
                case 12: {
                    n14 = 7;
                    break;
                }
                case 13: {
                    n14 = 123;
                    break;
                }
                case 14: {
                    n14 = 89;
                    break;
                }
                case 15: {
                    n14 = 223;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 113;
                    break;
                }
                case 18: {
                    n14 = 53;
                    break;
                }
                case 19: {
                    n14 = 65;
                    break;
                }
                case 20: {
                    n14 = 118;
                    break;
                }
                case 21: {
                    n14 = 69;
                    break;
                }
                case 22: {
                    n14 = 127;
                    break;
                }
                case 23: {
                    n14 = 144;
                    break;
                }
                case 24: {
                    n14 = 49;
                    break;
                }
                case 25: {
                    n14 = 229;
                    break;
                }
                case 26: {
                    n14 = 73;
                    break;
                }
                case 27: {
                    n14 = 228;
                    break;
                }
                case 28: {
                    n14 = 6;
                    break;
                }
                case 29: {
                    n14 = 70;
                    break;
                }
                case 30: {
                    n14 = 2;
                    break;
                }
                case 31: {
                    n14 = 187;
                    break;
                }
                case 32: {
                    n14 = 230;
                    break;
                }
                case 33: {
                    n14 = 67;
                    break;
                }
                case 34: {
                    n14 = 110;
                    break;
                }
                case 35: {
                    n14 = 167;
                    break;
                }
                case 36: {
                    n14 = 201;
                    break;
                }
                case 37: {
                    n14 = 115;
                    break;
                }
                case 38: {
                    n14 = 94;
                    break;
                }
                case 39: {
                    n14 = 130;
                    break;
                }
                case 40: {
                    n14 = 85;
                    break;
                }
                case 41: {
                    n14 = 129;
                    break;
                }
                case 42: {
                    n14 = 221;
                    break;
                }
                case 43: {
                    n14 = 179;
                    break;
                }
                case 44: {
                    n14 = 34;
                    break;
                }
                case 45: {
                    n14 = 178;
                    break;
                }
                case 46: {
                    n14 = 163;
                    break;
                }
                case 47: {
                    n14 = 158;
                    break;
                }
                case 48: {
                    n14 = 253;
                    break;
                }
                case 49: {
                    n14 = 154;
                    break;
                }
                case 50: {
                    n14 = 114;
                    break;
                }
                case 51: {
                    n14 = 93;
                    break;
                }
                case 52: {
                    n14 = 250;
                    break;
                }
                case 53: {
                    n14 = 88;
                    break;
                }
                case 54: {
                    n14 = 173;
                    break;
                }
                case 55: {
                    n14 = 24;
                    break;
                }
                case 56: {
                    n14 = 22;
                    break;
                }
                case 57: {
                    n14 = 174;
                    break;
                }
                case 58: {
                    n14 = 47;
                    break;
                }
                case 59: {
                    n14 = 104;
                    break;
                }
                case 60: {
                    n14 = 109;
                    break;
                }
                case 61: {
                    n14 = 10;
                    break;
                }
                case 62: {
                    n14 = 244;
                    break;
                }
                case 63: {
                    n14 = 193;
                    break;
                }
                case 64: {
                    n14 = 152;
                    break;
                }
                case 65: {
                    n14 = 198;
                    break;
                }
                case 66: {
                    n14 = 209;
                    break;
                }
                case 67: {
                    n14 = 116;
                    break;
                }
                case 68: {
                    n14 = 169;
                    break;
                }
                case 69: {
                    n14 = 213;
                    break;
                }
                case 70: {
                    n14 = 35;
                    break;
                }
                case 71: {
                    n14 = 200;
                    break;
                }
                case 72: {
                    n14 = 29;
                    break;
                }
                case 73: {
                    n14 = 16;
                    break;
                }
                case 74: {
                    n14 = 121;
                    break;
                }
                case 75: {
                    n14 = 54;
                    break;
                }
                case 76: {
                    n14 = 14;
                    break;
                }
                case 77: {
                    n14 = 241;
                    break;
                }
                case 78: {
                    n14 = 30;
                    break;
                }
                case 79: {
                    n14 = 138;
                    break;
                }
                case 80: {
                    n14 = 26;
                    break;
                }
                case 81: {
                    n14 = 44;
                    break;
                }
                case 82: {
                    n14 = 134;
                    break;
                }
                case 83: {
                    n14 = 27;
                    break;
                }
                case 84: {
                    n14 = 107;
                    break;
                }
                case 85: {
                    n14 = 203;
                    break;
                }
                case 86: {
                    n14 = 119;
                    break;
                }
                case 87: {
                    n14 = 204;
                    break;
                }
                case 88: {
                    n14 = 155;
                    break;
                }
                case 89: {
                    n14 = 66;
                    break;
                }
                case 90: {
                    n14 = 236;
                    break;
                }
                case 91: {
                    n14 = 205;
                    break;
                }
                case 92: {
                    n14 = 148;
                    break;
                }
                case 93: {
                    n14 = 132;
                    break;
                }
                case 94: {
                    n14 = 36;
                    break;
                }
                case 95: {
                    n14 = 246;
                    break;
                }
                case 96: {
                    n14 = 247;
                    break;
                }
                case 97: {
                    n14 = 160;
                    break;
                }
                case 98: {
                    n14 = 143;
                    break;
                }
                case 99: {
                    n14 = 17;
                    break;
                }
                case 100: {
                    n14 = 11;
                    break;
                }
                case 101: {
                    n14 = 38;
                    break;
                }
                case 102: {
                    n14 = 176;
                    break;
                }
                case 103: {
                    n14 = 196;
                    break;
                }
                case 104: {
                    n14 = 76;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 164;
                    break;
                }
                case 107: {
                    n14 = 216;
                    break;
                }
                case 108: {
                    n14 = 21;
                    break;
                }
                case 109: {
                    n14 = 83;
                    break;
                }
                case 110: {
                    n14 = 101;
                    break;
                }
                case 111: {
                    n14 = 217;
                    break;
                }
                case 112: {
                    n14 = 181;
                    break;
                }
                case 113: {
                    n14 = 165;
                    break;
                }
                case 114: {
                    n14 = 208;
                    break;
                }
                case 115: {
                    n14 = 139;
                    break;
                }
                case 116: {
                    n14 = 182;
                    break;
                }
                case 117: {
                    n14 = 175;
                    break;
                }
                case 118: {
                    n14 = 100;
                    break;
                }
                case 119: {
                    n14 = 92;
                    break;
                }
                case 120: {
                    n14 = 218;
                    break;
                }
                case 121: {
                    n14 = 239;
                    break;
                }
                case 122: {
                    n14 = 96;
                    break;
                }
                case 123: {
                    n14 = 81;
                    break;
                }
                case 124: {
                    n14 = 105;
                    break;
                }
                case 125: {
                    n14 = 61;
                    break;
                }
                case 126: {
                    n14 = 31;
                    break;
                }
                case 127: {
                    n14 = 231;
                    break;
                }
                case 128: {
                    n14 = 72;
                    break;
                }
                case 129: {
                    n14 = 9;
                    break;
                }
                case 130: {
                    n14 = 233;
                    break;
                }
                case 131: {
                    n14 = 136;
                    break;
                }
                case 132: {
                    n14 = 248;
                    break;
                }
                case 133: {
                    n14 = 71;
                    break;
                }
                case 134: {
                    n14 = 156;
                    break;
                }
                case 135: {
                    n14 = 125;
                    break;
                }
                case 136: {
                    n14 = 150;
                    break;
                }
                case 137: {
                    n14 = 28;
                    break;
                }
                case 138: {
                    n14 = 5;
                    break;
                }
                case 139: {
                    n14 = 215;
                    break;
                }
                case 140: {
                    n14 = 157;
                    break;
                }
                case 141: {
                    n14 = 74;
                    break;
                }
                case 142: {
                    n14 = 186;
                    break;
                }
                case 143: {
                    n14 = 12;
                    break;
                }
                case 144: {
                    n14 = 149;
                    break;
                }
                case 145: {
                    n14 = 43;
                    break;
                }
                case 146: {
                    n14 = 255;
                    break;
                }
                case 147: {
                    n14 = 32;
                    break;
                }
                case 148: {
                    n14 = 98;
                    break;
                }
                case 149: {
                    n14 = 18;
                    break;
                }
                case 150: {
                    n14 = 42;
                    break;
                }
                case 151: {
                    n14 = 212;
                    break;
                }
                case 152: {
                    n14 = 243;
                    break;
                }
                case 153: {
                    n14 = 224;
                    break;
                }
                case 154: {
                    n14 = 106;
                    break;
                }
                case 155: {
                    n14 = 235;
                    break;
                }
                case 156: {
                    n14 = 141;
                    break;
                }
                case 157: {
                    n14 = 183;
                    break;
                }
                case 158: {
                    n14 = 131;
                    break;
                }
                case 159: {
                    n14 = 234;
                    break;
                }
                case 160: {
                    n14 = 210;
                    break;
                }
                case 161: {
                    n14 = 8;
                    break;
                }
                case 162: {
                    n14 = 37;
                    break;
                }
                case 163: {
                    n14 = 226;
                    break;
                }
                case 164: {
                    n14 = 191;
                    break;
                }
                case 165: {
                    n14 = 142;
                    break;
                }
                case 166: {
                    n14 = 102;
                    break;
                }
                case 167: {
                    n14 = 41;
                    break;
                }
                case 168: {
                    n14 = 59;
                    break;
                }
                case 169: {
                    n14 = 252;
                    break;
                }
                case 170: {
                    n14 = 120;
                    break;
                }
                case 171: {
                    n14 = 13;
                    break;
                }
                case 172: {
                    n14 = 58;
                    break;
                }
                case 173: {
                    n14 = 56;
                    break;
                }
                case 174: {
                    n14 = 166;
                    break;
                }
                case 175: {
                    n14 = 39;
                    break;
                }
                case 176: {
                    n14 = 111;
                    break;
                }
                case 177: {
                    n14 = 170;
                    break;
                }
                case 178: {
                    n14 = 50;
                    break;
                }
                case 179: {
                    n14 = 19;
                    break;
                }
                case 180: {
                    n14 = 25;
                    break;
                }
                case 181: {
                    n14 = 159;
                    break;
                }
                case 182: {
                    n14 = 57;
                    break;
                }
                case 183: {
                    n14 = 52;
                    break;
                }
                case 184: {
                    n14 = 192;
                    break;
                }
                case 185: {
                    n14 = 62;
                    break;
                }
                case 186: {
                    n14 = 188;
                    break;
                }
                case 187: {
                    n14 = 146;
                    break;
                }
                case 188: {
                    n14 = 55;
                    break;
                }
                case 189: {
                    n14 = 162;
                    break;
                }
                case 190: {
                    n14 = 117;
                    break;
                }
                case 191: {
                    n14 = 251;
                    break;
                }
                case 192: {
                    n14 = 33;
                    break;
                }
                case 193: {
                    n14 = 103;
                    break;
                }
                case 194: {
                    n14 = 86;
                    break;
                }
                case 195: {
                    n14 = 97;
                    break;
                }
                case 196: {
                    n14 = 225;
                    break;
                }
                case 197: {
                    n14 = 91;
                    break;
                }
                case 198: {
                    n14 = 254;
                    break;
                }
                case 199: {
                    n14 = 219;
                    break;
                }
                case 200: {
                    n14 = 77;
                    break;
                }
                case 201: {
                    n14 = 137;
                    break;
                }
                case 202: {
                    n14 = 60;
                    break;
                }
                case 203: {
                    n14 = 199;
                    break;
                }
                case 204: {
                    n14 = 220;
                    break;
                }
                case 205: {
                    n14 = 112;
                    break;
                }
                case 206: {
                    n14 = 214;
                    break;
                }
                case 207: {
                    n14 = 45;
                    break;
                }
                case 208: {
                    n14 = 227;
                    break;
                }
                case 209: {
                    n14 = 63;
                    break;
                }
                case 210: {
                    n14 = 20;
                    break;
                }
                case 211: {
                    n14 = 122;
                    break;
                }
                case 212: {
                    n14 = 184;
                    break;
                }
                case 213: {
                    n14 = 80;
                    break;
                }
                case 214: {
                    n14 = 23;
                    break;
                }
                case 215: {
                    n14 = 147;
                    break;
                }
                case 216: {
                    n14 = 3;
                    break;
                }
                case 217: {
                    n14 = 99;
                    break;
                }
                case 218: {
                    n14 = 78;
                    break;
                }
                case 219: {
                    n14 = 133;
                    break;
                }
                case 220: {
                    n14 = 75;
                    break;
                }
                case 221: {
                    n14 = 126;
                    break;
                }
                case 222: {
                    n14 = 95;
                    break;
                }
                case 223: {
                    n14 = 135;
                    break;
                }
                case 224: {
                    n14 = 151;
                    break;
                }
                case 225: {
                    n14 = 240;
                    break;
                }
                case 226: {
                    n14 = 108;
                    break;
                }
                case 227: {
                    n14 = 206;
                    break;
                }
                case 228: {
                    n14 = 145;
                    break;
                }
                case 229: {
                    n14 = 207;
                    break;
                }
                case 230: {
                    n14 = 40;
                    break;
                }
                case 231: {
                    n14 = 194;
                    break;
                }
                case 232: {
                    n14 = 0;
                    break;
                }
                case 233: {
                    n14 = 249;
                    break;
                }
                case 234: {
                    n14 = 128;
                    break;
                }
                case 235: {
                    n14 = 189;
                    break;
                }
                case 236: {
                    n14 = 222;
                    break;
                }
                case 237: {
                    n14 = 1;
                    break;
                }
                case 238: {
                    n14 = 171;
                    break;
                }
                case 239: {
                    n14 = 68;
                    break;
                }
                case 240: {
                    n14 = 172;
                    break;
                }
                case 241: {
                    n14 = 195;
                    break;
                }
                case 242: {
                    n14 = 161;
                    break;
                }
                case 243: {
                    n14 = 232;
                    break;
                }
                case 244: {
                    n14 = 197;
                    break;
                }
                case 245: {
                    n14 = 15;
                    break;
                }
                case 246: {
                    n14 = 124;
                    break;
                }
                case 247: {
                    n14 = 90;
                    break;
                }
                case 248: {
                    n14 = 177;
                    break;
                }
                case 249: {
                    n14 = 48;
                    break;
                }
                case 250: {
                    n14 = 237;
                    break;
                }
                case 251: {
                    n14 = 211;
                    break;
                }
                case 252: {
                    n14 = 140;
                    break;
                }
                case 253: {
                    n14 = 4;
                    break;
                }
                case 254: {
                    n14 = 238;
                    break;
                }
                default: {
                    n14 = 242;
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
            WT.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2CE0;
        if (j[n11] == null) {
            WT.j[n11] = (int)(f[n11] ^ l2);
        }
        return j[n11];
    }
}

