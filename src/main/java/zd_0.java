/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from zd
 */
public class zd_0
extends z7 {
    JTextField u;
    JTextField N;
    JTextField O;
    JTextField Y;
    JPasswordField r;
    JComboBox J;
    JComboBox C;
    String i;
    int H;
    String G;
    JTextArea F;
    String w;
    JPanel s;
    JPanel y;
    String p;
    lv_2 E;
    JCheckBox A;
    JCheckBox z;
    JTextField X;
    JTextField S;
    boolean v;
    String g;
    JCheckBox t;
    private static final String[] a;
    private static final String[] b;
    private static final long d;

    public zd_0(String string, boolean bl) {
        JPanel jPanel;
        JPanel jPanel2;
        JPanel jPanel3;
        JPanel jPanel4;
        this.H = (int)d;
        this.w = "width 60::";
        this.p = "width 150::150";
        this.g = string;
        this.v = bl;
        try {
            jPanel4 = (JPanel)this.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel4, "wrap,align left");
        try {
            jPanel3 = (JPanel)this.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel3, "wrap,align left");
        try {
            jPanel2 = (JPanel)this.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel2, "wrap,align left");
        try {
            jPanel = (JPanel)this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel, "wrap,align left");
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new MigLayout("insets 5 5 5 5"));
        this.add((Component)jPanel5, "align left");
        jPanel5.setBorder(BorderFactory.createTitledBorder("高级"));
        this.A = new JCheckBox("智能加速 (加速海外服务器连接)", false);
        jPanel5.add((Component)((JCheckBox)this.A), "wrap");
    }

    JPanel S() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("insets 5 5 5 5"));
        jPanel.setBorder(BorderFactory.createTitledBorder("常规"));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel2, "wrap");
        jPanel2.add((Component)new JLabel("名称:"), (String)this.w);
        try {
            object4 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.u = object4;
        jPanel2.add((Component)((JTextField)this.u), (String)this.p);
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel3, "wrap");
        try {
            object3 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.N = object3;
        jPanel3.add((Component)new JLabel("主机:"), (String)this.w);
        jPanel3.add((Component)((JTextField)this.N), (String)this.p);
        jPanel3.add(new JLabel("端口:"));
        try {
            object2 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.O = object2;
        ((JTextField)this.O).setText("3389");
        jPanel3.add((Component)((JTextField)this.O), "width 80::");
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel4, "wrap");
        jPanel4.add((Component)new JLabel("备注:"), (String)this.w + ",aligny top");
        try {
            object = lk_0.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.F = object;
        jPanel4.add((Component)((JTextArea)this.F), "width :180:180,height :50:");
        ((JTextArea)this.F).setFont((Font)fx_2.j);
        return jPanel;
    }

    JPanel q() {
        Object object;
        Object object2;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("insets 5 5 5 5"));
        jPanel.setBorder(BorderFactory.createTitledBorder("显示"));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel2, "wrap");
        jPanel2.add((Component)new JLabel("分辨率:"), (String)this.w);
        this.C = new JComboBox();
        ((JComboBox)this.C).setEnabled(true);
        ((JComboBox)this.C).addItem("640x480");
        ((JComboBox)this.C).addItem("800x600");
        ((JComboBox)this.C).addItem("1024x768");
        ((JComboBox)this.C).addItem("1280x1024");
        ((JComboBox)this.C).addItem("1600x1200");
        ((JComboBox)this.C).addItem("1920x1080");
        ((JComboBox)this.C).addItem("1920x1200");
        ((JComboBox)this.C).addItem("2560x1440");
        ((JComboBox)this.C).addItem("自定义");
        jPanel2.add((Component)((JComboBox)this.C), (String)this.p);
        ((JComboBox)this.C).addItemListener(new WF(this));
        g8 g82 = new g8(this);
        try {
            object2 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.X = object2;
        ((JTextField)this.X).addKeyListener(g82);
        try {
            object = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.S = object;
        ((JTextField)this.S).addKeyListener(g82);
        jPanel2.add((Component)((JTextField)this.X), "width 50::");
        jPanel2.add((Component)((JTextField)this.S), "width 50::");
        ((JComboBox)this.C).setSelectedItem("1280x1024");
        this.t = new JCheckBox("全屏", false);
        jPanel.add((Component)((JCheckBox)this.t), "wrap");
        return jPanel;
    }

    JPanel B() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("insets 5 5 5 5"));
        jPanel.setBorder(BorderFactory.createTitledBorder("映射"));
        this.z = new JCheckBox("本地驱动器", true);
        jPanel.add((Component)((JCheckBox)this.z), "wrap");
        return jPanel;
    }

    void I() {
        block8: {
            block11: {
                zd_0 zd_02;
                block9: {
                    block10: {
                        int n10;
                        int n11;
                        int n12;
                        block7: {
                            int n13;
                            String string;
                            block6: {
                                int n14 = ((JComboBox)this.C).getSelectedIndex();
                                string = (String)((JComboBox)this.C).getSelectedItem();
                                n12 = z7.M();
                                n13 = string.contains("x");
                                if (n12 != 0) break block6;
                                if (n13 == 0) break block7;
                                n13 = string.indexOf("x");
                            }
                            int n15 = n13;
                            String string2 = string.substring(0, n15);
                            String string3 = string.substring(n15 + 1);
                            ((JTextField)this.X).setText(string2);
                            ((JTextField)this.S).setText(string3);
                            ((JTextField)this.X).setEnabled(false);
                            ((JTextField)this.S).setEnabled(false);
                            if (n12 == 0) break block8;
                        }
                        zd_02 = this;
                        if (n12 != 0) break block9;
                        if ((lv_2)zd_02.E == null) break block10;
                        try {
                            n11 = (Integer)this.E.u();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((JTextField)this.X).setText("" + n11);
                        try {
                            n10 = (Integer)this.E.j();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((JTextField)this.S).setText("" + n10);
                        if (n12 == 0) break block11;
                    }
                    ((JTextField)this.X).setText("");
                    zd_02 = this;
                }
                ((JTextField)zd_02.S).setText("");
            }
            ((JTextField)this.X).setEnabled(true);
            ((JTextField)this.S).setEnabled(true);
        }
    }

    JPanel U() {
        Object object;
        Object object2;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("insets 5 5 5 5"));
        jPanel.setBorder(BorderFactory.createTitledBorder("认证"));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel2, "wrap");
        jPanel2.add((Component)new JLabel("方法:"), (String)this.w);
        this.J = new JComboBox();
        ((JComboBox)this.J).setEnabled(false);
        ((JComboBox)this.J).addItem("密码");
        ((JComboBox)this.J).addItem("公钥");
        jPanel2.add((Component)((JComboBox)this.J), (String)this.p);
        this.s = new JPanel();
        ((JPanel)this.s).setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)((JPanel)this.s), "wrap");
        try {
            object2 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.Y = object2;
        ((JPanel)this.s).add((Component)new JLabel("用户名:"), (String)this.w);
        ((JPanel)this.s).add((Component)((JTextField)this.Y), (String)this.p);
        this.y = new JPanel();
        ((JPanel)this.y).setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)((JPanel)this.y), "wrap");
        try {
            object = lk_0.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.r = object;
        ((JPanel)this.y).add((Component)new JLabel("密码:"), (String)this.w);
        ((JPanel)this.y).add((Component)((JPasswordField)this.r), (String)this.p);
        ((JTextArea)this.F).setFont((Font)fx_2.j);
        return jPanel;
    }

    @Override
    public void A(lv_2 lv_22) {
        boolean bl;
        block40: {
            int n10;
            int n11;
            block39: {
                int n12;
                int n13;
                block38: {
                    block37: {
                        int n14;
                        block35: {
                            block36: {
                                boolean bl2;
                                boolean bl3;
                                String string;
                                String string2;
                                String string3;
                                int n15;
                                String string4;
                                String string5;
                                this.E = lv_22;
                                try {
                                    string5 = (String)lv_22.F();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JTextField)this.u).setText(string5);
                                int n16 = z7.M();
                                try {
                                    string4 = (String)lv_22.v();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JTextField)this.N).setText(string4);
                                try {
                                    n15 = (Integer)lv_22.X();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JTextField)this.O).setText(n15 + "");
                                try {
                                    string3 = (String)lv_22.Q();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JTextArea)this.F).setText(string3);
                                try {
                                    string2 = (String)lv_22.E();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JTextField)this.Y).setText(string2);
                                try {
                                    string = (String)lv_22.y();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JPasswordField)this.r).setText(string);
                                try {
                                    bl3 = (Boolean)lv_22.o();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JCheckBox)this.A).setSelected(bl3);
                                n13 = n16;
                                try {
                                    bl2 = (Boolean)lv_22.v();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((JCheckBox)this.z).setSelected(bl2);
                                try {
                                    n12 = (Integer)lv_22.w();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n14 = lv_2.K;
                                if (n13 != 0) break block35;
                                if (n12 != n14) break block36;
                                ((JComboBox)this.J).setSelectedIndex(0);
                                if (n13 == 0) break block37;
                            }
                            try {
                                n12 = (Integer)lv_22.w();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (n13 != 0) break block38;
                            n14 = lv_2.n;
                        }
                        if (n12 == n14) {
                            ((JComboBox)this.J).setSelectedIndex(1);
                        }
                    }
                    try {
                        n12 = ((Boolean)lv_22.V()).booleanValue() ? 1 : 0;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                if (n12 == 0) break block39;
                ((JComboBox)this.C).setSelectedItem("自定义");
                if (n13 == 0) break block40;
            }
            try {
                n11 = (Integer)lv_22.u();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                n10 = (Integer)lv_22.j();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JComboBox)this.C).setSelectedItem(n11 + "x" + n10);
        }
        try {
            bl = (Boolean)lv_22.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JCheckBox)this.t).setSelected(bl);
        try {
            this.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public vg_0 c() {
        block87: {
            block86: {
                block84: {
                    block85: {
                        block83: {
                            block82: {
                                block81: {
                                    block78: {
                                        block79: {
                                            block80: {
                                                block76: {
                                                    block77: {
                                                        try {
                                                            JJ.n(this.u);
                                                        }
                                                        catch (InvocationTargetException v0) {
                                                            throw v0.getTargetException();
                                                        }
                                                        try {
                                                            JJ.n(this.N);
                                                        }
                                                        catch (InvocationTargetException v1) {
                                                            throw v1.getTargetException();
                                                        }
                                                        v2 = z7.m();
                                                        try {
                                                            JJ.n(this.O);
                                                        }
                                                        catch (InvocationTargetException v3) {
                                                            throw v3.getTargetException();
                                                        }
                                                        var2_1 = new vg_0();
                                                        try {
                                                            var2_1.n(this);
                                                        }
                                                        catch (InvocationTargetException v4) {
                                                            throw v4.getTargetException();
                                                        }
                                                        this.G = ((JTextField)this.u).getText().trim();
                                                        var1_2 = v2;
                                                        v5 = ((String)this.G).equals("");
                                                        if (var1_2 == 0) break block76;
                                                        try {
                                                            block88: {
                                                                if (!v5) break block77;
                                                                break block88;
                                                                catch (Exception v6) {
                                                                    throw zd_0.a(v6);
                                                                }
                                                            }
                                                            ((JTextField)this.u).requestFocus();
                                                            try {
                                                                var2_1.Z("请输入名称");
                                                            }
                                                            catch (InvocationTargetException v7) {
                                                                throw v7.getTargetException();
                                                            }
                                                            try {
                                                                var2_1.j(false);
                                                            }
                                                            catch (InvocationTargetException v8) {
                                                                throw v8.getTargetException();
                                                            }
                                                            return var2_1;
                                                        }
                                                        catch (Exception v9) {
                                                            throw zd_0.a(v9);
                                                        }
                                                    }
                                                    try {
                                                        v10 = this;
                                                        if (var1_2 == 0) break block78;
                                                        v5 = v10.v;
                                                    }
                                                    catch (Exception v11) {
                                                        throw zd_0.a(v11);
                                                    }
                                                }
                                                if (v5) ** GOTO lbl94
                                                var3_3 = new File((String)this.g + File.separator + (String)this.G + ".json");
                                                if (var1_2 == 0) break block80;
                                                try {
                                                    block89: {
                                                        if (!var3_3.exists()) break block79;
                                                        break block89;
                                                        catch (Exception v12) {
                                                            throw zd_0.a(v12);
                                                        }
                                                    }
                                                    try {
                                                        var2_1.Z("已存在同名配置!");
                                                    }
                                                    catch (InvocationTargetException v13) {
                                                        throw v13.getTargetException();
                                                    }
                                                    try {
                                                        var2_1.j(false);
                                                    }
                                                    catch (InvocationTargetException v14) {
                                                        throw v14.getTargetException();
                                                    }
                                                }
                                                catch (Exception v15) {
                                                    throw zd_0.a(v15);
                                                }
                                            }
                                            return var2_1;
                                        }
                                        try {
                                            if (var1_2 != 0) break block81;
lbl94:
                                            // 2 sources

                                            v10 = this;
                                        }
                                        catch (Exception v16) {
                                            throw zd_0.a(v16);
                                        }
                                    }
                                    try {
                                        v17 = (String)v10.E.F();
                                    }
                                    catch (InvocationTargetException v18) {
                                        throw v18.getTargetException();
                                    }
                                    var3_3 = v17;
                                    try {
                                        v19 = var3_3.equals((String)this.G);
                                        if (var1_2 == 0) break block82;
                                        if (v19) break block81;
                                    }
                                    catch (Exception v20) {
                                        throw zd_0.a(v20);
                                    }
                                    var4_5 = new File((String)this.g + File.separator + (String)this.G + ".json");
                                    v19 = var4_5.exists();
                                    if (var1_2 == 0) break block82;
                                    try {
                                        block90: {
                                            if (!v19) break block81;
                                            break block90;
                                            catch (Exception v21) {
                                                throw zd_0.a(v21);
                                            }
                                        }
                                        try {
                                            var2_1.Z("已存在同名配置!");
                                        }
                                        catch (InvocationTargetException v22) {
                                            throw v22.getTargetException();
                                        }
                                        try {
                                            var2_1.j(false);
                                        }
                                        catch (InvocationTargetException v23) {
                                            throw v23.getTargetException();
                                        }
                                        return var2_1;
                                    }
                                    catch (Exception v24) {
                                        throw zd_0.a(v24);
                                    }
                                }
                                try {
                                    this.i = ((JTextField)this.N).getText().trim();
                                    v25 = this;
                                    if (var1_2 != 0) {
                                        v19 = ((String)v25.i).equals("");
                                    }
                                    ** GOTO lbl171
                                }
                                catch (Exception v26) {
                                    throw zd_0.a(v26);
                                }
                            }
                            try {
                                if (!v19) break block83;
                                ((JTextField)this.N).requestFocus();
                                try {
                                    var2_1.Z("请输入主机地址");
                                }
                                catch (InvocationTargetException v27) {
                                    throw v27.getTargetException();
                                }
                                try {
                                    var2_1.j(false);
                                }
                                catch (InvocationTargetException v28) {
                                    throw v28.getTargetException();
                                }
                                return var2_1;
                            }
                            catch (Exception v29) {
                                throw zd_0.a(v29);
                            }
                        }
                        try {
                            v25 = this;
lbl171:
                            // 2 sources

                            try {
                                v30 = (Integer)JJ.N(((JTextField)this.O).getText());
                            }
                            catch (InvocationTargetException v31) {
                                throw v31.getTargetException();
                            }
                            v25.H = v30;
                        }
                        catch (Exception var3_4) {
                            ((JTextField)this.O).requestFocus();
                            try {
                                var2_1.Z("请输入正确端口号");
                            }
                            catch (InvocationTargetException v32) {
                                throw v32.getTargetException();
                            }
                            try {
                                var2_1.j(false);
                            }
                            catch (InvocationTargetException v33) {
                                throw v33.getTargetException();
                            }
                            return var2_1;
                        }
                        try {
                            zd_0.x(this.r, this.E);
                        }
                        catch (InvocationTargetException v34) {
                            throw v34.getTargetException();
                        }
                        var3_3 = ((JTextField)this.X).getText();
                        try {
                            try {
                                v35 = var3_3;
                                if (var1_2 == 0) break block84;
                                if (!v35.equals("")) break block85;
                            }
                            catch (Exception v36) {
                                throw zd_0.a(v36);
                            }
                            ((JTextField)this.X).requestFocus();
                            try {
                                var2_1.Z("请输入分辨率");
                            }
                            catch (InvocationTargetException v37) {
                                throw v37.getTargetException();
                            }
                            try {
                                var2_1.j(false);
                            }
                            catch (InvocationTargetException v38) {
                                throw v38.getTargetException();
                            }
                        }
                        catch (Exception v39) {
                            throw zd_0.a(v39);
                        }
                    }
                    v35 = ((JTextField)this.S).getText();
                }
                var4_5 = v35;
                try {
                    try {
                        if (var1_2 == 0) break block86;
                        if (!var4_5.equals("")) break block87;
                    }
                    catch (Exception v40) {
                        throw zd_0.a(v40);
                    }
                    ((JTextField)this.S).requestFocus();
                    try {
                        var2_1.Z("请输入分辨率");
                    }
                    catch (InvocationTargetException v41) {
                        throw v41.getTargetException();
                    }
                }
                catch (Exception v42) {
                    throw zd_0.a(v42);
                }
            }
            try {
                var2_1.j(false);
            }
            catch (InvocationTargetException v43) {
                throw v43.getTargetException();
            }
        }
        return var2_1;
    }

    /*
     * Loose catch block
     */
    public static void x(JPasswordField jPasswordField, lv_2 lv_22) {
        block18: {
            String string;
            String string2;
            block21: {
                String string3;
                int n10;
                block20: {
                    String string4;
                    lv_2 lv_23;
                    block19: {
                        String string5;
                        block16: {
                            block17: {
                                string2 = new String(jPasswordField.getPassword());
                                n10 = z7.m();
                                string5 = string2;
                                if (n10 == 0) break block16;
                                try {
                                    if (!string5.equals("")) break block17;
                                    break block18;
                                    catch (Exception exception) {
                                        throw zd_0.a(exception);
                                    }
                                }
                                catch (Exception exception) {
                                    throw zd_0.a(exception);
                                }
                            }
                            string5 = "";
                        }
                        string3 = string5;
                        try {
                            lv_23 = lv_22;
                            if (n10 == 0) break block19;
                            if (lv_23 == null) break block20;
                        }
                        catch (Exception exception) {
                            throw zd_0.a(exception);
                        }
                        lv_23 = lv_22;
                    }
                    try {
                        string4 = (String)lv_23.y();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string3 = string4;
                }
                string = string2;
                if (n10 == 0) break block21;
                try {
                    block22: {
                        if (string.equals(string3)) break block18;
                        break block22;
                        catch (Exception exception) {
                            throw zd_0.a(exception);
                        }
                    }
                    string = "";
                }
                catch (Exception exception) {
                    throw zd_0.a(exception);
                }
            }
            String string6 = string;
            try {
                String string7;
                try {
                    string7 = (String)DS.A(string2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string6 = string7;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            jPasswordField.setText(string6);
        }
    }

    @Override
    public void F(lv_2 lv_22) {
        block34: {
            int n10;
            block32: {
                int n11;
                block33: {
                    int n12 = z7.m();
                    String string = ((JTextField)this.u).getText().trim();
                    try {
                        lv_22.z(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string2 = ((JTextField)this.N).getText().trim();
                    int n13 = n12;
                    try {
                        lv_22.g(string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string3 = ((JTextField)this.O).getText().trim();
                    try {
                        lv_22.T(Integer.parseInt(string3));
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string4 = ((JTextField)this.Y).getText().trim();
                    try {
                        lv_22.L(string4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string5 = new String(((JPasswordField)this.r).getPassword());
                    try {
                        lv_22.N(string5);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_22.U(((JCheckBox)this.A).isSelected());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_22.k(((JCheckBox)this.z).isSelected());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = n11 = ((JComboBox)this.J).getSelectedIndex();
                    if (n13 == 0) break block32;
                    if (n10 != 0) break block33;
                    try {
                        lv_22.N(lv_2.K);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n13 != 0) break block34;
                }
                n10 = n11;
            }
            if (n10 == 1) {
                try {
                    lv_22.N(lv_2.n);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
        String string = ((JTextField)this.X).getText();
        String string6 = ((JTextField)this.S).getText();
        try {
            lv_22.H(Integer.parseInt(string));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.x(Integer.parseInt(string6));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.v(((JComboBox)this.C).getSelectedItem().equals("自定义"));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string7 = ((JTextArea)this.F).getText().trim();
        try {
            lv_22.q(string7);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.W(((JCheckBox)this.t).isSelected());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
                    var7 = new String[55];
                    var5_1 = 0;
                    var4_2 = "\u66b1\u80de\u5201\u90577\u00e1\u5219\u902e\u6dd5\u598d\u67ff\u5247\u56e4\u8fd8\u637c\u0002\u0003\u59e5\u6c60\u00c3\u0003\u5476\u79c7\u00fa\u0002\u5b17\u789f\t h\u0081\u001c\u00fd[\u0081lA\u0005\u6778\u576a\u9a75\u5202\u561a\u0007#\u0014\u00c9\u001d\u00ba;\u00ec\u001a\u00fe\u000f\u0080\u0000\u0013\u0005F\u0095\u00b87\u00c3b\u00e2\u0010oi\u0083\u00f0]\u00ed/\u00d8\u0010\u00a8\u009e?\u000e\u00f2\u00fd\u00cb\u00a8\u0093p\u00d3\u0003K\u00c4\u00bc\u001dL\u00de\u0002\u5ee8\u89bf\n`\u00e6S=i\u00a2\u0006`\\\u00a2\u0004\u52b2\u8fb2\u73b5\u0000\u0002\u6689\u5c7f\t\u00fe\u0019?Q\u00ec\u00f2\u00a5]\u0003\u0003\u81e9\u5b96\u4e61\u000e\u0081\u00c5\u00a5\u00af^\u0090j\u001f|GZm\u0090\u00d0\u0007\u8ba7\u8f21\u513a\u4e2f\u6737\u5756\u57a0\b\u5da0\u5b37\u5732\u5468\u54e5\u9112\u7f05\u00a7\t\u00d62W\u00d3.\u00a2\u00f9Q\b\u000b\u0093\u00b3\u0015\u0083\u00a7\u0085}\u0013\u00b8\u008bL\u0002\u5199\u5cd7\u0003\u5b5b\u78d2\u00ed\n\u00b2\u00a5\tU\"\u00afo\u00c1q\u0096\u00050\u00e5<%w\u0004\u00c5,\u00e2\u0018\u0003\u4e96\u67cf\u0016\u0003\u6509\u6c9d7\tF\u0000O\u00fff'\u00f2\u00e3/\u0002\u9a54\u7e93\u0007\u00e3>\u001e\u00dcB\u000b\u00b1\b\u5d99\u5bef\u5715\u5473\u5401\u9171\u7f99\u00cb\u0006\u8b31\u8fad\u51e8\u5283\u8fff\u73ee\u0002\u662a\u798e\u0002\u8bbe\u8bba\u000f'\u0097\u00beo5-\u0018\u00a1\u00b0\u00bcl\u00db\u0013\u0087\u00ff\u0003\u7a37\u53f1l\u0004\u001b\u0000\u00ac\u00bd\t\\\u0097\u0006g\u00044\u00bc\u0083\u00a0\b\u8b69\u8fb5\u51e3\u6be5\u7858\u7a83\u5330\u53b5\n\u00ecF\u00c2)[ M0\u0099\u00a8\n\u00b540\u00d1\u00afNA\u00a8\u009a\n\u000e\u0012f\u001d-\u00a0\u00a0;%u\u00afs:\u00f9\u001b\u0004\u75b9\u622c\u54b5\u00bf\u000f\u00e6Z\u0086\u00d62\u001a\u00f8G\u00ac`\u00ef@c\u00f4\u00f1\u0005;\u00a9]\u00ac[\u000eT\u00cf\u001f\u00ee\t\u00b8\u0080\u001f!\u00e7\u00f1\u00d9\u00e5\u00e6\u0003\u8170\u5b17\u4e52\n\u00d7\u00b4\u00a5w\u00b7\u00eb\u00deI$\u0087\u000e\u00a8\u00f4\u0080\u0089\u00faT\u00fe\u0082\u00eeT\b\u00af\u00da(\t\u00ef\u001dz\\\u00c0S$e\u00b7\u0005\u8bb1\u8f14\u51f8\u54bf\u79a5\u0002\u51e4\u9466\b\u00d0\u00ba\u009d\u0084<\u00ca\u00bd\u0090";
                    var6_3 = "\u66b1\u80de\u5201\u90577\u00e1\u5219\u902e\u6dd5\u598d\u67ff\u5247\u56e4\u8fd8\u637c\u0002\u0003\u59e5\u6c60\u00c3\u0003\u5476\u79c7\u00fa\u0002\u5b17\u789f\t h\u0081\u001c\u00fd[\u0081lA\u0005\u6778\u576a\u9a75\u5202\u561a\u0007#\u0014\u00c9\u001d\u00ba;\u00ec\u001a\u00fe\u000f\u0080\u0000\u0013\u0005F\u0095\u00b87\u00c3b\u00e2\u0010oi\u0083\u00f0]\u00ed/\u00d8\u0010\u00a8\u009e?\u000e\u00f2\u00fd\u00cb\u00a8\u0093p\u00d3\u0003K\u00c4\u00bc\u001dL\u00de\u0002\u5ee8\u89bf\n`\u00e6S=i\u00a2\u0006`\\\u00a2\u0004\u52b2\u8fb2\u73b5\u0000\u0002\u6689\u5c7f\t\u00fe\u0019?Q\u00ec\u00f2\u00a5]\u0003\u0003\u81e9\u5b96\u4e61\u000e\u0081\u00c5\u00a5\u00af^\u0090j\u001f|GZm\u0090\u00d0\u0007\u8ba7\u8f21\u513a\u4e2f\u6737\u5756\u57a0\b\u5da0\u5b37\u5732\u5468\u54e5\u9112\u7f05\u00a7\t\u00d62W\u00d3.\u00a2\u00f9Q\b\u000b\u0093\u00b3\u0015\u0083\u00a7\u0085}\u0013\u00b8\u008bL\u0002\u5199\u5cd7\u0003\u5b5b\u78d2\u00ed\n\u00b2\u00a5\tU\"\u00afo\u00c1q\u0096\u00050\u00e5<%w\u0004\u00c5,\u00e2\u0018\u0003\u4e96\u67cf\u0016\u0003\u6509\u6c9d7\tF\u0000O\u00fff'\u00f2\u00e3/\u0002\u9a54\u7e93\u0007\u00e3>\u001e\u00dcB\u000b\u00b1\b\u5d99\u5bef\u5715\u5473\u5401\u9171\u7f99\u00cb\u0006\u8b31\u8fad\u51e8\u5283\u8fff\u73ee\u0002\u662a\u798e\u0002\u8bbe\u8bba\u000f'\u0097\u00beo5-\u0018\u00a1\u00b0\u00bcl\u00db\u0013\u0087\u00ff\u0003\u7a37\u53f1l\u0004\u001b\u0000\u00ac\u00bd\t\\\u0097\u0006g\u00044\u00bc\u0083\u00a0\b\u8b69\u8fb5\u51e3\u6be5\u7858\u7a83\u5330\u53b5\n\u00ecF\u00c2)[ M0\u0099\u00a8\n\u00b540\u00d1\u00afNA\u00a8\u009a\n\u000e\u0012f\u001d-\u00a0\u00a0;%u\u00afs:\u00f9\u001b\u0004\u75b9\u622c\u54b5\u00bf\u000f\u00e6Z\u0086\u00d62\u001a\u00f8G\u00ac`\u00ef@c\u00f4\u00f1\u0005;\u00a9]\u00ac[\u000eT\u00cf\u001f\u00ee\t\u00b8\u0080\u001f!\u00e7\u00f1\u00d9\u00e5\u00e6\u0003\u8170\u5b17\u4e52\n\u00d7\u00b4\u00a5w\u00b7\u00eb\u00deI$\u0087\u000e\u00a8\u00f4\u0080\u0089\u00faT\u00fe\u0082\u00eeT\b\u00af\u00da(\t\u00ef\u001dz\\\u00c0S$e\u00b7\u0005\u8bb1\u8f14\u51f8\u54bf\u79a5\u0002\u51e4\u9466\b\u00d0\u00ba\u009d\u0084<\u00ca\u00bd\u0090".length();
                    var3_4 = 16;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 66;
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
                        var4_2 = "\u00a4R\u00d9\u00c0\u0006\u8b17\u8f7a\u513b\u526e\u8f92\u7344";
                        var6_3 = "\u00a4R\u00d9\u00c0\u0006\u8b17\u8f7a\u513b\u526e\u8f92\u7344".length();
                        var3_4 = 4;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 115;
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
                                v15 = 101;
                                break;
                            }
                            case 1: {
                                v15 = 53;
                                break;
                            }
                            case 2: {
                                v15 = 4;
                                break;
                            }
                            case 3: {
                                v15 = 125;
                                break;
                            }
                            case 4: {
                                v15 = 9;
                                break;
                            }
                            case 5: {
                                v15 = 122;
                                break;
                            }
                            default: {
                                v15 = 80;
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
            zd_0.a = var7;
            zd_0.b = new String[55];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 9114406206872929209L;
        ** while (true)
        zd_0.d = 1056361795033678767L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF43C) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 137;
                    break;
                }
                case 1: {
                    n14 = 95;
                    break;
                }
                case 2: {
                    n14 = 148;
                    break;
                }
                case 3: {
                    n14 = 4;
                    break;
                }
                case 4: {
                    n14 = 255;
                    break;
                }
                case 5: {
                    n14 = 75;
                    break;
                }
                case 6: {
                    n14 = 157;
                    break;
                }
                case 7: {
                    n14 = 179;
                    break;
                }
                case 8: {
                    n14 = 15;
                    break;
                }
                case 9: {
                    n14 = 188;
                    break;
                }
                case 10: {
                    n14 = 212;
                    break;
                }
                case 11: {
                    n14 = 56;
                    break;
                }
                case 12: {
                    n14 = 186;
                    break;
                }
                case 13: {
                    n14 = 123;
                    break;
                }
                case 14: {
                    n14 = 156;
                    break;
                }
                case 15: {
                    n14 = 141;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 73;
                    break;
                }
                case 18: {
                    n14 = 228;
                    break;
                }
                case 19: {
                    n14 = 136;
                    break;
                }
                case 20: {
                    n14 = 130;
                    break;
                }
                case 21: {
                    n14 = 185;
                    break;
                }
                case 22: {
                    n14 = 92;
                    break;
                }
                case 23: {
                    n14 = 8;
                    break;
                }
                case 24: {
                    n14 = 210;
                    break;
                }
                case 25: {
                    n14 = 231;
                    break;
                }
                case 26: {
                    n14 = 183;
                    break;
                }
                case 27: {
                    n14 = 1;
                    break;
                }
                case 28: {
                    n14 = 86;
                    break;
                }
                case 29: {
                    n14 = 81;
                    break;
                }
                case 30: {
                    n14 = 44;
                    break;
                }
                case 31: {
                    n14 = 173;
                    break;
                }
                case 32: {
                    n14 = 54;
                    break;
                }
                case 33: {
                    n14 = 125;
                    break;
                }
                case 34: {
                    n14 = 58;
                    break;
                }
                case 35: {
                    n14 = 134;
                    break;
                }
                case 36: {
                    n14 = 215;
                    break;
                }
                case 37: {
                    n14 = 143;
                    break;
                }
                case 38: {
                    n14 = 169;
                    break;
                }
                case 39: {
                    n14 = 94;
                    break;
                }
                case 40: {
                    n14 = 42;
                    break;
                }
                case 41: {
                    n14 = 83;
                    break;
                }
                case 42: {
                    n14 = 226;
                    break;
                }
                case 43: {
                    n14 = 16;
                    break;
                }
                case 44: {
                    n14 = 71;
                    break;
                }
                case 45: {
                    n14 = 115;
                    break;
                }
                case 46: {
                    n14 = 46;
                    break;
                }
                case 47: {
                    n14 = 101;
                    break;
                }
                case 48: {
                    n14 = 155;
                    break;
                }
                case 49: {
                    n14 = 174;
                    break;
                }
                case 50: {
                    n14 = 222;
                    break;
                }
                case 51: {
                    n14 = 9;
                    break;
                }
                case 52: {
                    n14 = 40;
                    break;
                }
                case 53: {
                    n14 = 225;
                    break;
                }
                case 54: {
                    n14 = 198;
                    break;
                }
                case 55: {
                    n14 = 163;
                    break;
                }
                case 56: {
                    n14 = 52;
                    break;
                }
                case 57: {
                    n14 = 166;
                    break;
                }
                case 58: {
                    n14 = 100;
                    break;
                }
                case 59: {
                    n14 = 43;
                    break;
                }
                case 60: {
                    n14 = 13;
                    break;
                }
                case 61: {
                    n14 = 242;
                    break;
                }
                case 62: {
                    n14 = 104;
                    break;
                }
                case 63: {
                    n14 = 202;
                    break;
                }
                case 64: {
                    n14 = 25;
                    break;
                }
                case 65: {
                    n14 = 254;
                    break;
                }
                case 66: {
                    n14 = 249;
                    break;
                }
                case 67: {
                    n14 = 232;
                    break;
                }
                case 68: {
                    n14 = 29;
                    break;
                }
                case 69: {
                    n14 = 218;
                    break;
                }
                case 70: {
                    n14 = 116;
                    break;
                }
                case 71: {
                    n14 = 59;
                    break;
                }
                case 72: {
                    n14 = 96;
                    break;
                }
                case 73: {
                    n14 = 147;
                    break;
                }
                case 74: {
                    n14 = 99;
                    break;
                }
                case 75: {
                    n14 = 27;
                    break;
                }
                case 76: {
                    n14 = 129;
                    break;
                }
                case 77: {
                    n14 = 168;
                    break;
                }
                case 78: {
                    n14 = 245;
                    break;
                }
                case 79: {
                    n14 = 37;
                    break;
                }
                case 80: {
                    n14 = 175;
                    break;
                }
                case 81: {
                    n14 = 32;
                    break;
                }
                case 82: {
                    n14 = 233;
                    break;
                }
                case 83: {
                    n14 = 203;
                    break;
                }
                case 84: {
                    n14 = 3;
                    break;
                }
                case 85: {
                    n14 = 90;
                    break;
                }
                case 86: {
                    n14 = 176;
                    break;
                }
                case 87: {
                    n14 = 98;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 194;
                    break;
                }
                case 90: {
                    n14 = 187;
                    break;
                }
                case 91: {
                    n14 = 223;
                    break;
                }
                case 92: {
                    n14 = 150;
                    break;
                }
                case 93: {
                    n14 = 213;
                    break;
                }
                case 94: {
                    n14 = 106;
                    break;
                }
                case 95: {
                    n14 = 31;
                    break;
                }
                case 96: {
                    n14 = 139;
                    break;
                }
                case 97: {
                    n14 = 14;
                    break;
                }
                case 98: {
                    n14 = 238;
                    break;
                }
                case 99: {
                    n14 = 170;
                    break;
                }
                case 100: {
                    n14 = 165;
                    break;
                }
                case 101: {
                    n14 = 80;
                    break;
                }
                case 102: {
                    n14 = 158;
                    break;
                }
                case 103: {
                    n14 = 93;
                    break;
                }
                case 104: {
                    n14 = 28;
                    break;
                }
                case 105: {
                    n14 = 178;
                    break;
                }
                case 106: {
                    n14 = 112;
                    break;
                }
                case 107: {
                    n14 = 201;
                    break;
                }
                case 108: {
                    n14 = 64;
                    break;
                }
                case 109: {
                    n14 = 135;
                    break;
                }
                case 110: {
                    n14 = 35;
                    break;
                }
                case 111: {
                    n14 = 70;
                    break;
                }
                case 112: {
                    n14 = 206;
                    break;
                }
                case 113: {
                    n14 = 199;
                    break;
                }
                case 114: {
                    n14 = 196;
                    break;
                }
                case 115: {
                    n14 = 2;
                    break;
                }
                case 116: {
                    n14 = 205;
                    break;
                }
                case 117: {
                    n14 = 237;
                    break;
                }
                case 118: {
                    n14 = 146;
                    break;
                }
                case 119: {
                    n14 = 177;
                    break;
                }
                case 120: {
                    n14 = 138;
                    break;
                }
                case 121: {
                    n14 = 241;
                    break;
                }
                case 122: {
                    n14 = 30;
                    break;
                }
                case 123: {
                    n14 = 184;
                    break;
                }
                case 124: {
                    n14 = 18;
                    break;
                }
                case 125: {
                    n14 = 171;
                    break;
                }
                case 126: {
                    n14 = 48;
                    break;
                }
                case 127: {
                    n14 = 17;
                    break;
                }
                case 128: {
                    n14 = 204;
                    break;
                }
                case 129: {
                    n14 = 55;
                    break;
                }
                case 130: {
                    n14 = 229;
                    break;
                }
                case 131: {
                    n14 = 121;
                    break;
                }
                case 132: {
                    n14 = 36;
                    break;
                }
                case 133: {
                    n14 = 107;
                    break;
                }
                case 134: {
                    n14 = 240;
                    break;
                }
                case 135: {
                    n14 = 72;
                    break;
                }
                case 136: {
                    n14 = 63;
                    break;
                }
                case 137: {
                    n14 = 128;
                    break;
                }
                case 138: {
                    n14 = 117;
                    break;
                }
                case 139: {
                    n14 = 216;
                    break;
                }
                case 140: {
                    n14 = 208;
                    break;
                }
                case 141: {
                    n14 = 23;
                    break;
                }
                case 142: {
                    n14 = 111;
                    break;
                }
                case 143: {
                    n14 = 33;
                    break;
                }
                case 144: {
                    n14 = 118;
                    break;
                }
                case 145: {
                    n14 = 140;
                    break;
                }
                case 146: {
                    n14 = 12;
                    break;
                }
                case 147: {
                    n14 = 38;
                    break;
                }
                case 148: {
                    n14 = 159;
                    break;
                }
                case 149: {
                    n14 = 26;
                    break;
                }
                case 150: {
                    n14 = 190;
                    break;
                }
                case 151: {
                    n14 = 103;
                    break;
                }
                case 152: {
                    n14 = 5;
                    break;
                }
                case 153: {
                    n14 = 211;
                    break;
                }
                case 154: {
                    n14 = 200;
                    break;
                }
                case 155: {
                    n14 = 62;
                    break;
                }
                case 156: {
                    n14 = 21;
                    break;
                }
                case 157: {
                    n14 = 152;
                    break;
                }
                case 158: {
                    n14 = 120;
                    break;
                }
                case 159: {
                    n14 = 248;
                    break;
                }
                case 160: {
                    n14 = 219;
                    break;
                }
                case 161: {
                    n14 = 214;
                    break;
                }
                case 162: {
                    n14 = 24;
                    break;
                }
                case 163: {
                    n14 = 39;
                    break;
                }
                case 164: {
                    n14 = 195;
                    break;
                }
                case 165: {
                    n14 = 252;
                    break;
                }
                case 166: {
                    n14 = 97;
                    break;
                }
                case 167: {
                    n14 = 19;
                    break;
                }
                case 168: {
                    n14 = 250;
                    break;
                }
                case 169: {
                    n14 = 239;
                    break;
                }
                case 170: {
                    n14 = 45;
                    break;
                }
                case 171: {
                    n14 = 11;
                    break;
                }
                case 172: {
                    n14 = 50;
                    break;
                }
                case 173: {
                    n14 = 87;
                    break;
                }
                case 174: {
                    n14 = 167;
                    break;
                }
                case 175: {
                    n14 = 124;
                    break;
                }
                case 176: {
                    n14 = 65;
                    break;
                }
                case 177: {
                    n14 = 243;
                    break;
                }
                case 178: {
                    n14 = 109;
                    break;
                }
                case 179: {
                    n14 = 230;
                    break;
                }
                case 180: {
                    n14 = 22;
                    break;
                }
                case 181: {
                    n14 = 142;
                    break;
                }
                case 182: {
                    n14 = 79;
                    break;
                }
                case 183: {
                    n14 = 172;
                    break;
                }
                case 184: {
                    n14 = 227;
                    break;
                }
                case 185: {
                    n14 = 236;
                    break;
                }
                case 186: {
                    n14 = 66;
                    break;
                }
                case 187: {
                    n14 = 182;
                    break;
                }
                case 188: {
                    n14 = 108;
                    break;
                }
                case 189: {
                    n14 = 144;
                    break;
                }
                case 190: {
                    n14 = 76;
                    break;
                }
                case 191: {
                    n14 = 53;
                    break;
                }
                case 192: {
                    n14 = 82;
                    break;
                }
                case 193: {
                    n14 = 180;
                    break;
                }
                case 194: {
                    n14 = 77;
                    break;
                }
                case 195: {
                    n14 = 57;
                    break;
                }
                case 196: {
                    n14 = 162;
                    break;
                }
                case 197: {
                    n14 = 47;
                    break;
                }
                case 198: {
                    n14 = 0;
                    break;
                }
                case 199: {
                    n14 = 41;
                    break;
                }
                case 200: {
                    n14 = 224;
                    break;
                }
                case 201: {
                    n14 = 119;
                    break;
                }
                case 202: {
                    n14 = 131;
                    break;
                }
                case 203: {
                    n14 = 133;
                    break;
                }
                case 204: {
                    n14 = 247;
                    break;
                }
                case 205: {
                    n14 = 234;
                    break;
                }
                case 206: {
                    n14 = 192;
                    break;
                }
                case 207: {
                    n14 = 251;
                    break;
                }
                case 208: {
                    n14 = 132;
                    break;
                }
                case 209: {
                    n14 = 244;
                    break;
                }
                case 210: {
                    n14 = 67;
                    break;
                }
                case 211: {
                    n14 = 145;
                    break;
                }
                case 212: {
                    n14 = 61;
                    break;
                }
                case 213: {
                    n14 = 7;
                    break;
                }
                case 214: {
                    n14 = 221;
                    break;
                }
                case 215: {
                    n14 = 60;
                    break;
                }
                case 216: {
                    n14 = 102;
                    break;
                }
                case 217: {
                    n14 = 161;
                    break;
                }
                case 218: {
                    n14 = 105;
                    break;
                }
                case 219: {
                    n14 = 209;
                    break;
                }
                case 220: {
                    n14 = 85;
                    break;
                }
                case 221: {
                    n14 = 20;
                    break;
                }
                case 222: {
                    n14 = 114;
                    break;
                }
                case 223: {
                    n14 = 253;
                    break;
                }
                case 224: {
                    n14 = 68;
                    break;
                }
                case 225: {
                    n14 = 74;
                    break;
                }
                case 226: {
                    n14 = 197;
                    break;
                }
                case 227: {
                    n14 = 91;
                    break;
                }
                case 228: {
                    n14 = 217;
                    break;
                }
                case 229: {
                    n14 = 235;
                    break;
                }
                case 230: {
                    n14 = 153;
                    break;
                }
                case 231: {
                    n14 = 6;
                    break;
                }
                case 232: {
                    n14 = 181;
                    break;
                }
                case 233: {
                    n14 = 207;
                    break;
                }
                case 234: {
                    n14 = 151;
                    break;
                }
                case 235: {
                    n14 = 126;
                    break;
                }
                case 236: {
                    n14 = 127;
                    break;
                }
                case 237: {
                    n14 = 246;
                    break;
                }
                case 238: {
                    n14 = 193;
                    break;
                }
                case 239: {
                    n14 = 49;
                    break;
                }
                case 240: {
                    n14 = 113;
                    break;
                }
                case 241: {
                    n14 = 154;
                    break;
                }
                case 242: {
                    n14 = 34;
                    break;
                }
                case 243: {
                    n14 = 51;
                    break;
                }
                case 244: {
                    n14 = 164;
                    break;
                }
                case 245: {
                    n14 = 88;
                    break;
                }
                case 246: {
                    n14 = 78;
                    break;
                }
                case 247: {
                    n14 = 220;
                    break;
                }
                case 248: {
                    n14 = 189;
                    break;
                }
                case 249: {
                    n14 = 191;
                    break;
                }
                case 250: {
                    n14 = 110;
                    break;
                }
                case 251: {
                    n14 = 10;
                    break;
                }
                case 252: {
                    n14 = 160;
                    break;
                }
                case 253: {
                    n14 = 69;
                    break;
                }
                case 254: {
                    n14 = 122;
                    break;
                }
                default: {
                    n14 = 89;
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
            zd_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

