/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from zb
 */
public class zb_0
extends z7 {
    JTextField O;
    JTextField R;
    JTextField N;
    JTextField X;
    JPasswordField Z;
    JComboBox d;
    String J;
    int T;
    String f;
    JTextArea U;
    String M;
    JTextField W;
    JButton p;
    JPanel a;
    JPanel Q;
    JPanel b;
    String A;
    lv_2 i;
    JCheckBox I;
    JCheckBox u;
    boolean z;
    String m;
    ln_1 w;
    private static final String[] g;
    private static final String[] j;
    private static final long k;

    public zb_0(String string, boolean bl) {
        JPanel jPanel;
        JPanel jPanel2;
        this.M = "width 60::";
        this.A = "width 150::150";
        this.m = string;
        this.z = bl;
        try {
            jPanel2 = (JPanel)this.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel2, "wrap,align left");
        try {
            jPanel = (JPanel)this.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)jPanel, "wrap,align left");
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new MigLayout("insets 5 5 5 5"));
        this.add((Component)jPanel3, "align left");
        jPanel3.setBorder(BorderFactory.createTitledBorder("高级"));
        this.I = new JCheckBox("智能加速 (加速海外服务器连接)", false);
        jPanel3.add((Component)((JCheckBox)this.I), "wrap");
        this.u = new JCheckBox("启用Exec Channel(若连接上就被断开,请关闭该项,比如跳板机)", false);
        jPanel3.add((Component)((JCheckBox)this.u), "wrap");
        JLabel jLabel = new JLabel("关闭后无法监控服务器信息");
        jLabel.setBorder(BorderFactory.createEmptyBorder(0, (int)k, 0, 0));
        jPanel3.add((Component)jLabel, "wrap");
    }

    JPanel Y() {
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
        jPanel2.add((Component)new JLabel("名称:"), (String)this.M);
        try {
            object4 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.O = object4;
        jPanel2.add((Component)((JTextField)this.O), (String)this.A);
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel3, "wrap");
        try {
            object3 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.R = object3;
        jPanel3.add((Component)new JLabel("主机:"), (String)this.M);
        jPanel3.add((Component)((JTextField)this.R), (String)this.A);
        jPanel3.add(new JLabel("端口:"));
        try {
            object2 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.N = object2;
        ((JTextField)this.N).setText("22");
        jPanel3.add((Component)((JTextField)this.N), "width 80::");
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel4, "wrap");
        jPanel4.add((Component)new JLabel("备注:"), (String)this.M + ",aligny top");
        try {
            object = lk_0.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.U = object;
        jPanel4.add((Component)((JTextArea)this.U), "width :180:180,height :50:");
        ((JTextArea)this.U).setFont((Font)fx_2.j);
        return jPanel;
    }

    JPanel q() {
        Object object;
        Object object2;
        Object object3;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout("insets 5 5 5 5"));
        jPanel.setBorder(BorderFactory.createTitledBorder("认证"));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel2, "wrap");
        jPanel2.add((Component)new JLabel("方法:"), (String)this.M);
        this.d = new JComboBox();
        ((JComboBox)this.d).addItem("密码");
        ((JComboBox)this.d).addItem("公钥");
        ((JComboBox)this.d).addItem("Keyboard Interactive");
        jPanel2.add((Component)((JComboBox)this.d), (String)this.A);
        ((JComboBox)this.d).addItemListener(new mB(this));
        this.a = new JPanel();
        ((JPanel)this.a).setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)((JPanel)this.a), "wrap");
        try {
            object3 = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.X = object3;
        ((JPanel)this.a).add((Component)new JLabel("用户名:"), (String)this.M);
        ((JPanel)this.a).add((Component)((JTextField)this.X), (String)this.A);
        this.Q = new JPanel();
        ((JPanel)this.Q).setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)((JPanel)this.Q), "wrap");
        try {
            object2 = lk_0.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.Z = object2;
        ((JPanel)this.Q).add((Component)new JLabel("密码:"), (String)this.M);
        ((JPanel)this.Q).add((Component)((JPasswordField)this.Z), (String)this.A);
        this.b = new JPanel();
        ((JPanel)this.b).setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)((JPanel)this.b), "wrap");
        ((JPanel)this.b).add((Component)new JLabel("私钥:"), (String)this.M);
        try {
            object = lk_0.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.W = object;
        ((JTextField)this.W).setEditable(false);
        ((JPanel)this.b).add((Component)((JTextField)this.W), "width 200::200");
        this.p = new JButton(" 浏览...");
        ((JPanel)this.b).add((JButton)this.p);
        ((JButton)this.p).addActionListener(new uw_2(this));
        ((JTextArea)this.U).setFont((Font)fx_2.j);
        try {
            this.w();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return jPanel;
    }

    void w() {
        block16: {
            int n10;
            int n11;
            block14: {
                int n12;
                block15: {
                    int n13;
                    block12: {
                        block13: {
                            n12 = ((JComboBox)this.d).getSelectedIndex();
                            n13 = z7.m();
                            if (n13 == 0) break block12;
                            if (n12 == 0) break block13;
                            n11 = n12;
                            n10 = 2;
                            if (n13 == 0) break block14;
                            if (n11 != n10) break block15;
                        }
                        try {
                            this.d(this.Q, true);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.d(this.b, false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (n13 != 0) break block16;
                }
                n11 = n12;
                n10 = 1;
            }
            if (n11 == n10) {
                try {
                    this.d(this.Q, false);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.d(this.b, true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    void d(JComponent jComponent, boolean bl) {
        int n10 = z7.M();
        jComponent.setEnabled(bl);
        int n11 = n10;
        for (Component component : jComponent.getComponents()) {
            component.setEnabled(bl);
            if (n11 == 0) continue;
        }
    }

    @Override
    public void A(lv_2 lv_22) {
        block42: {
            zb_0 zb_02;
            block40: {
                block41: {
                    String string;
                    Object object;
                    Object object2;
                    int n10;
                    block37: {
                        int n11;
                        int n12;
                        block38: {
                            block39: {
                                block35: {
                                    block36: {
                                        boolean bl;
                                        boolean bl2;
                                        String string2;
                                        String string3;
                                        String string4;
                                        String string5;
                                        int n13;
                                        String string6;
                                        String string7;
                                        int n14 = z7.M();
                                        this.i = lv_22;
                                        n10 = n14;
                                        try {
                                            string7 = (String)lv_22.F();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextField)this.O).setText(string7);
                                        try {
                                            string6 = (String)lv_22.v();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextField)this.R).setText(string6);
                                        try {
                                            n13 = (Integer)lv_22.X();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextField)this.N).setText(n13 + "");
                                        try {
                                            string5 = (String)lv_22.Q();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextArea)this.U).setText(string5);
                                        try {
                                            string4 = (String)lv_22.E();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextField)this.X).setText(string4);
                                        try {
                                            string3 = (String)lv_22.y();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JPasswordField)this.Z).setText(string3);
                                        try {
                                            string2 = (String)lv_22.c();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JTextField)this.W).setText(string2);
                                        try {
                                            bl2 = (Boolean)lv_22.o();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JCheckBox)this.I).setSelected(bl2);
                                        try {
                                            bl = (Boolean)lv_22.I();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JCheckBox)this.u).setSelected(bl);
                                        try {
                                            n12 = (Integer)lv_22.w();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n11 = lv_2.K;
                                        if (n10 != 0) break block35;
                                        if (n12 != n11) break block36;
                                        ((JComboBox)this.d).setSelectedIndex(0);
                                        if (n10 == 0) break block37;
                                    }
                                    try {
                                        n12 = (Integer)lv_22.w();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n11 = lv_2.n;
                                }
                                if (n10 != 0) break block38;
                                if (n12 != n11) break block39;
                                ((JComboBox)this.d).setSelectedIndex(1);
                                if (n10 == 0) break block37;
                            }
                            try {
                                n12 = (Integer)lv_22.w();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n11 = lv_2.v;
                        }
                        if (n12 == n11) {
                            ((JComboBox)this.d).setSelectedIndex(2);
                        }
                    }
                    try {
                        object2 = lv_22.c();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = om_2.k(object2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.w = object;
                    zb_02 = this;
                    if (n10 != 0) break block40;
                    if ((ln_1)zb_02.w == null) break block41;
                    try {
                        string = (String)this.w.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((JTextField)this.W).setText(string);
                    if (n10 == 0) break block42;
                }
                zb_02 = this;
            }
            ((JTextField)zb_02.W).setText("");
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public vg_0 c() {
        block70: {
            block69: {
                block68: {
                    block67: {
                        block64: {
                            block65: {
                                block66: {
                                    block62: {
                                        block63: {
                                            try {
                                                JJ.n(this.O);
                                            }
                                            catch (InvocationTargetException v0) {
                                                throw v0.getTargetException();
                                            }
                                            v1 = z7.m();
                                            try {
                                                JJ.n(this.R);
                                            }
                                            catch (InvocationTargetException v2) {
                                                throw v2.getTargetException();
                                            }
                                            try {
                                                JJ.n(this.N);
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
                                            this.f = ((JTextField)this.O).getText().trim();
                                            var1_2 = v1;
                                            v5 = ((String)this.f).equals("");
                                            if (var1_2 == 0) break block62;
                                            try {
                                                block71: {
                                                    if (!v5) break block63;
                                                    break block71;
                                                    catch (Exception v6) {
                                                        throw zb_0.a(v6);
                                                    }
                                                }
                                                ((JTextField)this.O).requestFocus();
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
                                                throw zb_0.a(v9);
                                            }
                                        }
                                        try {
                                            v10 = this;
                                            if (var1_2 == 0) break block64;
                                            v5 = v10.z;
                                        }
                                        catch (Exception v11) {
                                            throw zb_0.a(v11);
                                        }
                                    }
                                    if (v5) ** GOTO lbl94
                                    var3_3 = new File((String)this.m + File.separator + (String)this.f + ".json");
                                    if (var1_2 == 0) break block66;
                                    try {
                                        block72: {
                                            if (!var3_3.exists()) break block65;
                                            break block72;
                                            catch (Exception v12) {
                                                throw zb_0.a(v12);
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
                                        throw zb_0.a(v15);
                                    }
                                }
                                return var2_1;
                            }
                            try {
                                if (var1_2 != 0) break block67;
lbl94:
                                // 2 sources

                                v10 = this;
                            }
                            catch (Exception v16) {
                                throw zb_0.a(v16);
                            }
                        }
                        try {
                            v17 = (String)v10.i.F();
                        }
                        catch (InvocationTargetException v18) {
                            throw v18.getTargetException();
                        }
                        var3_3 = v17;
                        try {
                            v19 = var3_3.equals((String)this.f);
                            if (var1_2 == 0) break block68;
                            if (v19) break block67;
                        }
                        catch (Exception v20) {
                            throw zb_0.a(v20);
                        }
                        var4_6 = new File((String)this.m + File.separator + (String)this.f + ".json");
                        v19 = var4_6.exists();
                        if (var1_2 == 0) break block68;
                        try {
                            block73: {
                                if (!v19) break block67;
                                break block73;
                                catch (Exception v21) {
                                    throw zb_0.a(v21);
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
                            throw zb_0.a(v24);
                        }
                    }
                    try {
                        this.J = ((JTextField)this.R).getText().trim();
                        v25 = this;
                        if (var1_2 != 0) {
                            v19 = ((String)v25.J).equals("");
                        }
                        ** GOTO lbl171
                    }
                    catch (Exception v26) {
                        throw zb_0.a(v26);
                    }
                }
                try {
                    if (!v19) break block69;
                    ((JTextField)this.R).requestFocus();
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
                    throw zb_0.a(v29);
                }
            }
            try {
                v25 = this;
lbl171:
                // 2 sources

                try {
                    v30 = (Integer)JJ.N(((JTextField)this.N).getText());
                }
                catch (InvocationTargetException v31) {
                    throw v31.getTargetException();
                }
                v25.T = v30;
            }
            catch (Exception var3_4) {
                ((JTextField)this.N).requestFocus();
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
                zb_0.g(this.Z, this.i);
            }
            catch (InvocationTargetException v34) {
                throw v34.getTargetException();
            }
            var3_5 = ((JComboBox)this.d).getSelectedIndex();
            try {
                if (var3_5 != 1 || (ln_1)this.w != null) break block70;
            }
            catch (Exception v35) {
                throw zb_0.a(v35);
            }
            var4_6 = "尚未设置私钥";
        }
        return var2_1;
    }

    /*
     * Loose catch block
     */
    public static void g(JPasswordField jPasswordField, lv_2 lv_22) {
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
                                        throw zb_0.a(exception);
                                    }
                                }
                                catch (Exception exception) {
                                    throw zb_0.a(exception);
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
                            throw zb_0.a(exception);
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
                            throw zb_0.a(exception);
                        }
                    }
                    string = "";
                }
                catch (Exception exception) {
                    throw zb_0.a(exception);
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
        block35: {
            int n10;
            int n11;
            block36: {
                int n12;
                block37: {
                    int n13;
                    block33: {
                        block34: {
                            String string = ((JTextField)this.O).getText().trim();
                            try {
                                lv_22.z(string);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string2 = ((JTextField)this.R).getText().trim();
                            int n14 = z7.m();
                            try {
                                lv_22.g(string2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string3 = ((JTextField)this.N).getText().trim();
                            try {
                                lv_22.T(Integer.parseInt(string3));
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string4 = ((JTextField)this.X).getText().trim();
                            try {
                                lv_22.L(string4);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string5 = new String(((JPasswordField)this.Z).getPassword());
                            try {
                                lv_22.N(string5);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n13 = n14;
                            zb_0 zb_02 = this;
                            if (n13 != 0) {
                                if ((ln_1)zb_02.w != null) {
                                    Object object;
                                    try {
                                        object = this.w.g();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lv_22.h(object);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                try {
                                    lv_22.U(((JCheckBox)this.I).isSelected());
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    lv_22.i(((JCheckBox)this.u).isSelected());
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                zb_02 = this;
                            }
                            n11 = n12 = ((JComboBox)zb_02.d).getSelectedIndex();
                            if (n13 == 0) break block33;
                            if (n11 != 0) break block34;
                            try {
                                lv_22.N(lv_2.K);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (n13 != 0) break block35;
                        }
                        n11 = n12;
                    }
                    n10 = 1;
                    if (n13 == 0) break block36;
                    if (n11 != n10) break block37;
                    try {
                        lv_22.N(lv_2.n);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n13 != 0) break block35;
                }
                n11 = n12;
                n10 = 2;
            }
            if (n11 == n10) {
                try {
                    lv_22.N(lv_2.v);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
        String string = ((JTextArea)this.U).getText().trim();
        try {
            lv_22.q(string);
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
                    var7 = new String[42];
                    var5_1 = 0;
                    var4_2 = "\u00e3\u00d9\u009f\u007f\u0005\u00cd\u0007:\u00a0\u00c2\u0002\u9aca\u7e15\u000e\u008c[\u00bd\u00a5(\u00f2&\u008b\u00ee\u00cc\u00d1\u00c9\u00c2f\u0002\u5bae\u78fb\u0003\u7917\u949a:\u000e\u00c5\u00a7^\u00cc\u00bd\u00bf\u0019\u001eI\u00d4-#\u0014\u00d9\u000e\u00f7\u0019\u00d2\u00ed\u00c5\u00fb\u009b\u00afY\u00e8'\u00ed\u001cB\u0003\u7a0e\u53e3\u00f2\u0006\u008b\u6da1\u8986\u00b4\u00d9\u00af\u0002\u00b3b\u0003\u5ba7\u781f\u00cb\b\u8b5a\u8f65\u513c\u6b26\u78d6\u7ad8\u5363\u5303\u0003\u6583\u6c5a\u00df\u0003\u5414\u791e\u000f\u0003\u59f7\u6cb58\u000f\u0015GA\u00ac\u00bfv\u00cb\u0017\u00d1\u00d3\u0099C\u008e\u0016\u0091\u000e\u008b\u00e8\u0097%\u0084\u0082=\u00bc\u00ae%\u00d1\u001e\u008e\u001d\u001a%<B\u00bf>\u00d1a\u00d2Gf\u00e5=\u0005yN_\u001e\u00ef\u009b-u\u001d@\u00a9Mj\u000et\u0093\u00a2\u00bc\u00cb\u00d1Z\u00efa@ X\u00fcT\u000f\u0087=\u0013\u00e3\u00f5\u009f\u0082*\u00f8t\u00bc\u00b7*\u0088\u0005\n\u008a\u00d5n4\u0011\u00d1\u0014\u0086+v\u000b\u00d8\u0002\u00c5l\u00c8[\u0012\u0015N\u00f2K\u000e\u0017\u00fa\u00ce\u0091Ft\u00eb^W\u00d6\u00e6*$\u00ba\u0004O;\n#\u0005\u00f0n\u009d\u008d6\u0002\u5e2a\u89e1\b\u5de0\u5bfe\u5783\u5488\u54a6\u912d\u7fef\u009d\u0014\u00aa\u00a5\u0015\u0017mQ\u00a4\u00fe\u00a6e\u0096N\u00e8\u00b8Hf+\u00a2\u001f\u0089\u0002\u5176\u94ca\b\u5d67\u5bef\u5773\u54aa\u54b8\u9169\u7f2c\u0015\u0003\u4e1e\u67e2\u00be\u0010\u669a\u808e\u52dd\u9084\u00d9\u00b8\u5246\u90d8\u6d25\u59ea\u6738\u52de\u563f\u8f69\u63da/\u0006\u5cfa\u6750\u8ba3\u7f03\u792a\u949a\f\u51e2\u95f3\u5454\u65c6\u6c66\u7609\u63fd\u673a\u5263\u5698\u4f10\u60ef\u0004\u7579\u6217\u5414\u0001\n\u00d3\u001e\u009c\u00fb\u00e5Y\u0016\u00c2&O$\u54d0\u7582\u008e\r\u00afI\u00e5\u0098\u00deB\u00d8\u009d!\u00858\u829a\u8fef\u63a7\u4e04\u5c28\u8899\u6542\u5fc3g\u8b87\u51c0\u95e8\u8b19\u98c9x\u6ba0\u592c\u8d5f\u67d4\u67a5\u00de\u0007\u8b77\u8f17\u5199\u4e30\u6736\u5796\u5702\ni\u00dc\u00cb\u00a3\u000fRE\u00a3\u0083c";
                    var6_3 = "\u00e3\u00d9\u009f\u007f\u0005\u00cd\u0007:\u00a0\u00c2\u0002\u9aca\u7e15\u000e\u008c[\u00bd\u00a5(\u00f2&\u008b\u00ee\u00cc\u00d1\u00c9\u00c2f\u0002\u5bae\u78fb\u0003\u7917\u949a:\u000e\u00c5\u00a7^\u00cc\u00bd\u00bf\u0019\u001eI\u00d4-#\u0014\u00d9\u000e\u00f7\u0019\u00d2\u00ed\u00c5\u00fb\u009b\u00afY\u00e8'\u00ed\u001cB\u0003\u7a0e\u53e3\u00f2\u0006\u008b\u6da1\u8986\u00b4\u00d9\u00af\u0002\u00b3b\u0003\u5ba7\u781f\u00cb\b\u8b5a\u8f65\u513c\u6b26\u78d6\u7ad8\u5363\u5303\u0003\u6583\u6c5a\u00df\u0003\u5414\u791e\u000f\u0003\u59f7\u6cb58\u000f\u0015GA\u00ac\u00bfv\u00cb\u0017\u00d1\u00d3\u0099C\u008e\u0016\u0091\u000e\u008b\u00e8\u0097%\u0084\u0082=\u00bc\u00ae%\u00d1\u001e\u008e\u001d\u001a%<B\u00bf>\u00d1a\u00d2Gf\u00e5=\u0005yN_\u001e\u00ef\u009b-u\u001d@\u00a9Mj\u000et\u0093\u00a2\u00bc\u00cb\u00d1Z\u00efa@ X\u00fcT\u000f\u0087=\u0013\u00e3\u00f5\u009f\u0082*\u00f8t\u00bc\u00b7*\u0088\u0005\n\u008a\u00d5n4\u0011\u00d1\u0014\u0086+v\u000b\u00d8\u0002\u00c5l\u00c8[\u0012\u0015N\u00f2K\u000e\u0017\u00fa\u00ce\u0091Ft\u00eb^W\u00d6\u00e6*$\u00ba\u0004O;\n#\u0005\u00f0n\u009d\u008d6\u0002\u5e2a\u89e1\b\u5de0\u5bfe\u5783\u5488\u54a6\u912d\u7fef\u009d\u0014\u00aa\u00a5\u0015\u0017mQ\u00a4\u00fe\u00a6e\u0096N\u00e8\u00b8Hf+\u00a2\u001f\u0089\u0002\u5176\u94ca\b\u5d67\u5bef\u5773\u54aa\u54b8\u9169\u7f2c\u0015\u0003\u4e1e\u67e2\u00be\u0010\u669a\u808e\u52dd\u9084\u00d9\u00b8\u5246\u90d8\u6d25\u59ea\u6738\u52de\u563f\u8f69\u63da/\u0006\u5cfa\u6750\u8ba3\u7f03\u792a\u949a\f\u51e2\u95f3\u5454\u65c6\u6c66\u7609\u63fd\u673a\u5263\u5698\u4f10\u60ef\u0004\u7579\u6217\u5414\u0001\n\u00d3\u001e\u009c\u00fb\u00e5Y\u0016\u00c2&O$\u54d0\u7582\u008e\r\u00afI\u00e5\u0098\u00deB\u00d8\u009d!\u00858\u829a\u8fef\u63a7\u4e04\u5c28\u8899\u6542\u5fc3g\u8b87\u51c0\u95e8\u8b19\u98c9x\u6ba0\u592c\u8d5f\u67d4\u67a5\u00de\u0007\u8b77\u8f17\u5199\u4e30\u6736\u5796\u5702\ni\u00dc\u00cb\u00a3\u000fRE\u00a3\u0083c".length();
                    var3_4 = 4;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 13;
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
                        var4_2 = "\u8b1f\u8b82\u0005\u8b92\u8f39\u51c7\u5421\u79d5";
                        var6_3 = "\u8b1f\u8b82\u0005\u8b92\u8f39\u51c7\u5421\u79d5".length();
                        var3_4 = 2;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 43;
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
                                v15 = 127;
                                break;
                            }
                            case 1: {
                                v15 = 109;
                                break;
                            }
                            case 2: {
                                v15 = 88;
                                break;
                            }
                            case 3: {
                                v15 = 9;
                                break;
                            }
                            case 4: {
                                v15 = 81;
                                break;
                            }
                            case 5: {
                                v15 = 113;
                                break;
                            }
                            default: {
                                v15 = 127;
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
            zb_0.g = var7;
            zb_0.j = new String[42];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7739653394210764691L;
        ** while (true)
        zb_0.k = -4974943737603672185L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFDC7B) & 0xFFFF;
        if (j[n12] == null) {
            int n13;
            int n14;
            char[] cArray = g[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 78;
                    break;
                }
                case 1: {
                    n14 = 55;
                    break;
                }
                case 2: {
                    n14 = 90;
                    break;
                }
                case 3: {
                    n14 = 7;
                    break;
                }
                case 4: {
                    n14 = 101;
                    break;
                }
                case 5: {
                    n14 = 125;
                    break;
                }
                case 6: {
                    n14 = 91;
                    break;
                }
                case 7: {
                    n14 = 148;
                    break;
                }
                case 8: {
                    n14 = 180;
                    break;
                }
                case 9: {
                    n14 = 64;
                    break;
                }
                case 10: {
                    n14 = 11;
                    break;
                }
                case 11: {
                    n14 = 92;
                    break;
                }
                case 12: {
                    n14 = 144;
                    break;
                }
                case 13: {
                    n14 = 137;
                    break;
                }
                case 14: {
                    n14 = 51;
                    break;
                }
                case 15: {
                    n14 = 218;
                    break;
                }
                case 16: {
                    n14 = 152;
                    break;
                }
                case 17: {
                    n14 = 69;
                    break;
                }
                case 18: {
                    n14 = 123;
                    break;
                }
                case 19: {
                    n14 = 112;
                    break;
                }
                case 20: {
                    n14 = 37;
                    break;
                }
                case 21: {
                    n14 = 107;
                    break;
                }
                case 22: {
                    n14 = 225;
                    break;
                }
                case 23: {
                    n14 = 228;
                    break;
                }
                case 24: {
                    n14 = 237;
                    break;
                }
                case 25: {
                    n14 = 166;
                    break;
                }
                case 26: {
                    n14 = 190;
                    break;
                }
                case 27: {
                    n14 = 176;
                    break;
                }
                case 28: {
                    n14 = 236;
                    break;
                }
                case 29: {
                    n14 = 171;
                    break;
                }
                case 30: {
                    n14 = 127;
                    break;
                }
                case 31: {
                    n14 = 210;
                    break;
                }
                case 32: {
                    n14 = 167;
                    break;
                }
                case 33: {
                    n14 = 192;
                    break;
                }
                case 34: {
                    n14 = 27;
                    break;
                }
                case 35: {
                    n14 = 140;
                    break;
                }
                case 36: {
                    n14 = 252;
                    break;
                }
                case 37: {
                    n14 = 36;
                    break;
                }
                case 38: {
                    n14 = 238;
                    break;
                }
                case 39: {
                    n14 = 139;
                    break;
                }
                case 40: {
                    n14 = 227;
                    break;
                }
                case 41: {
                    n14 = 255;
                    break;
                }
                case 42: {
                    n14 = 199;
                    break;
                }
                case 43: {
                    n14 = 159;
                    break;
                }
                case 44: {
                    n14 = 145;
                    break;
                }
                case 45: {
                    n14 = 198;
                    break;
                }
                case 46: {
                    n14 = 67;
                    break;
                }
                case 47: {
                    n14 = 38;
                    break;
                }
                case 48: {
                    n14 = 186;
                    break;
                }
                case 49: {
                    n14 = 33;
                    break;
                }
                case 50: {
                    n14 = 235;
                    break;
                }
                case 51: {
                    n14 = 216;
                    break;
                }
                case 52: {
                    n14 = 165;
                    break;
                }
                case 53: {
                    n14 = 184;
                    break;
                }
                case 54: {
                    n14 = 28;
                    break;
                }
                case 55: {
                    n14 = 10;
                    break;
                }
                case 56: {
                    n14 = 87;
                    break;
                }
                case 57: {
                    n14 = 12;
                    break;
                }
                case 58: {
                    n14 = 31;
                    break;
                }
                case 59: {
                    n14 = 29;
                    break;
                }
                case 60: {
                    n14 = 136;
                    break;
                }
                case 61: {
                    n14 = 195;
                    break;
                }
                case 62: {
                    n14 = 89;
                    break;
                }
                case 63: {
                    n14 = 254;
                    break;
                }
                case 64: {
                    n14 = 214;
                    break;
                }
                case 65: {
                    n14 = 161;
                    break;
                }
                case 66: {
                    n14 = 23;
                    break;
                }
                case 67: {
                    n14 = 15;
                    break;
                }
                case 68: {
                    n14 = 245;
                    break;
                }
                case 69: {
                    n14 = 18;
                    break;
                }
                case 70: {
                    n14 = 47;
                    break;
                }
                case 71: {
                    n14 = 116;
                    break;
                }
                case 72: {
                    n14 = 203;
                    break;
                }
                case 73: {
                    n14 = 135;
                    break;
                }
                case 74: {
                    n14 = 187;
                    break;
                }
                case 75: {
                    n14 = 66;
                    break;
                }
                case 76: {
                    n14 = 196;
                    break;
                }
                case 77: {
                    n14 = 109;
                    break;
                }
                case 78: {
                    n14 = 157;
                    break;
                }
                case 79: {
                    n14 = 117;
                    break;
                }
                case 80: {
                    n14 = 70;
                    break;
                }
                case 81: {
                    n14 = 106;
                    break;
                }
                case 82: {
                    n14 = 191;
                    break;
                }
                case 83: {
                    n14 = 14;
                    break;
                }
                case 84: {
                    n14 = 219;
                    break;
                }
                case 85: {
                    n14 = 0;
                    break;
                }
                case 86: {
                    n14 = 120;
                    break;
                }
                case 87: {
                    n14 = 246;
                    break;
                }
                case 88: {
                    n14 = 73;
                    break;
                }
                case 89: {
                    n14 = 114;
                    break;
                }
                case 90: {
                    n14 = 150;
                    break;
                }
                case 91: {
                    n14 = 230;
                    break;
                }
                case 92: {
                    n14 = 147;
                    break;
                }
                case 93: {
                    n14 = 197;
                    break;
                }
                case 94: {
                    n14 = 172;
                    break;
                }
                case 95: {
                    n14 = 6;
                    break;
                }
                case 96: {
                    n14 = 188;
                    break;
                }
                case 97: {
                    n14 = 158;
                    break;
                }
                case 98: {
                    n14 = 1;
                    break;
                }
                case 99: {
                    n14 = 26;
                    break;
                }
                case 100: {
                    n14 = 242;
                    break;
                }
                case 101: {
                    n14 = 3;
                    break;
                }
                case 102: {
                    n14 = 222;
                    break;
                }
                case 103: {
                    n14 = 94;
                    break;
                }
                case 104: {
                    n14 = 59;
                    break;
                }
                case 105: {
                    n14 = 146;
                    break;
                }
                case 106: {
                    n14 = 48;
                    break;
                }
                case 107: {
                    n14 = 174;
                    break;
                }
                case 108: {
                    n14 = 177;
                    break;
                }
                case 109: {
                    n14 = 119;
                    break;
                }
                case 110: {
                    n14 = 105;
                    break;
                }
                case 111: {
                    n14 = 68;
                    break;
                }
                case 112: {
                    n14 = 81;
                    break;
                }
                case 113: {
                    n14 = 99;
                    break;
                }
                case 114: {
                    n14 = 86;
                    break;
                }
                case 115: {
                    n14 = 183;
                    break;
                }
                case 116: {
                    n14 = 151;
                    break;
                }
                case 117: {
                    n14 = 50;
                    break;
                }
                case 118: {
                    n14 = 104;
                    break;
                }
                case 119: {
                    n14 = 162;
                    break;
                }
                case 120: {
                    n14 = 240;
                    break;
                }
                case 121: {
                    n14 = 129;
                    break;
                }
                case 122: {
                    n14 = 82;
                    break;
                }
                case 123: {
                    n14 = 24;
                    break;
                }
                case 124: {
                    n14 = 220;
                    break;
                }
                case 125: {
                    n14 = 108;
                    break;
                }
                case 126: {
                    n14 = 130;
                    break;
                }
                case 127: {
                    n14 = 62;
                    break;
                }
                case 128: {
                    n14 = 164;
                    break;
                }
                case 129: {
                    n14 = 34;
                    break;
                }
                case 130: {
                    n14 = 179;
                    break;
                }
                case 131: {
                    n14 = 16;
                    break;
                }
                case 132: {
                    n14 = 22;
                    break;
                }
                case 133: {
                    n14 = 250;
                    break;
                }
                case 134: {
                    n14 = 223;
                    break;
                }
                case 135: {
                    n14 = 143;
                    break;
                }
                case 136: {
                    n14 = 247;
                    break;
                }
                case 137: {
                    n14 = 128;
                    break;
                }
                case 138: {
                    n14 = 71;
                    break;
                }
                case 139: {
                    n14 = 85;
                    break;
                }
                case 140: {
                    n14 = 173;
                    break;
                }
                case 141: {
                    n14 = 124;
                    break;
                }
                case 142: {
                    n14 = 185;
                    break;
                }
                case 143: {
                    n14 = 103;
                    break;
                }
                case 144: {
                    n14 = 42;
                    break;
                }
                case 145: {
                    n14 = 80;
                    break;
                }
                case 146: {
                    n14 = 63;
                    break;
                }
                case 147: {
                    n14 = 76;
                    break;
                }
                case 148: {
                    n14 = 118;
                    break;
                }
                case 149: {
                    n14 = 110;
                    break;
                }
                case 150: {
                    n14 = 142;
                    break;
                }
                case 151: {
                    n14 = 122;
                    break;
                }
                case 152: {
                    n14 = 243;
                    break;
                }
                case 153: {
                    n14 = 253;
                    break;
                }
                case 154: {
                    n14 = 224;
                    break;
                }
                case 155: {
                    n14 = 249;
                    break;
                }
                case 156: {
                    n14 = 239;
                    break;
                }
                case 157: {
                    n14 = 84;
                    break;
                }
                case 158: {
                    n14 = 213;
                    break;
                }
                case 159: {
                    n14 = 72;
                    break;
                }
                case 160: {
                    n14 = 231;
                    break;
                }
                case 161: {
                    n14 = 141;
                    break;
                }
                case 162: {
                    n14 = 226;
                    break;
                }
                case 163: {
                    n14 = 74;
                    break;
                }
                case 164: {
                    n14 = 241;
                    break;
                }
                case 165: {
                    n14 = 132;
                    break;
                }
                case 166: {
                    n14 = 111;
                    break;
                }
                case 167: {
                    n14 = 201;
                    break;
                }
                case 168: {
                    n14 = 30;
                    break;
                }
                case 169: {
                    n14 = 215;
                    break;
                }
                case 170: {
                    n14 = 207;
                    break;
                }
                case 171: {
                    n14 = 46;
                    break;
                }
                case 172: {
                    n14 = 93;
                    break;
                }
                case 173: {
                    n14 = 2;
                    break;
                }
                case 174: {
                    n14 = 212;
                    break;
                }
                case 175: {
                    n14 = 79;
                    break;
                }
                case 176: {
                    n14 = 169;
                    break;
                }
                case 177: {
                    n14 = 54;
                    break;
                }
                case 178: {
                    n14 = 49;
                    break;
                }
                case 179: {
                    n14 = 168;
                    break;
                }
                case 180: {
                    n14 = 60;
                    break;
                }
                case 181: {
                    n14 = 95;
                    break;
                }
                case 182: {
                    n14 = 189;
                    break;
                }
                case 183: {
                    n14 = 61;
                    break;
                }
                case 184: {
                    n14 = 229;
                    break;
                }
                case 185: {
                    n14 = 39;
                    break;
                }
                case 186: {
                    n14 = 5;
                    break;
                }
                case 187: {
                    n14 = 113;
                    break;
                }
                case 188: {
                    n14 = 170;
                    break;
                }
                case 189: {
                    n14 = 100;
                    break;
                }
                case 190: {
                    n14 = 251;
                    break;
                }
                case 191: {
                    n14 = 248;
                    break;
                }
                case 192: {
                    n14 = 43;
                    break;
                }
                case 193: {
                    n14 = 175;
                    break;
                }
                case 194: {
                    n14 = 160;
                    break;
                }
                case 195: {
                    n14 = 138;
                    break;
                }
                case 196: {
                    n14 = 13;
                    break;
                }
                case 197: {
                    n14 = 25;
                    break;
                }
                case 198: {
                    n14 = 155;
                    break;
                }
                case 199: {
                    n14 = 44;
                    break;
                }
                case 200: {
                    n14 = 19;
                    break;
                }
                case 201: {
                    n14 = 149;
                    break;
                }
                case 202: {
                    n14 = 121;
                    break;
                }
                case 203: {
                    n14 = 202;
                    break;
                }
                case 204: {
                    n14 = 126;
                    break;
                }
                case 205: {
                    n14 = 193;
                    break;
                }
                case 206: {
                    n14 = 40;
                    break;
                }
                case 207: {
                    n14 = 41;
                    break;
                }
                case 208: {
                    n14 = 98;
                    break;
                }
                case 209: {
                    n14 = 211;
                    break;
                }
                case 210: {
                    n14 = 208;
                    break;
                }
                case 211: {
                    n14 = 234;
                    break;
                }
                case 212: {
                    n14 = 97;
                    break;
                }
                case 213: {
                    n14 = 45;
                    break;
                }
                case 214: {
                    n14 = 133;
                    break;
                }
                case 215: {
                    n14 = 56;
                    break;
                }
                case 216: {
                    n14 = 4;
                    break;
                }
                case 217: {
                    n14 = 134;
                    break;
                }
                case 218: {
                    n14 = 131;
                    break;
                }
                case 219: {
                    n14 = 9;
                    break;
                }
                case 220: {
                    n14 = 200;
                    break;
                }
                case 221: {
                    n14 = 21;
                    break;
                }
                case 222: {
                    n14 = 233;
                    break;
                }
                case 223: {
                    n14 = 178;
                    break;
                }
                case 224: {
                    n14 = 65;
                    break;
                }
                case 225: {
                    n14 = 88;
                    break;
                }
                case 226: {
                    n14 = 35;
                    break;
                }
                case 227: {
                    n14 = 115;
                    break;
                }
                case 228: {
                    n14 = 8;
                    break;
                }
                case 229: {
                    n14 = 102;
                    break;
                }
                case 230: {
                    n14 = 20;
                    break;
                }
                case 231: {
                    n14 = 232;
                    break;
                }
                case 232: {
                    n14 = 209;
                    break;
                }
                case 233: {
                    n14 = 217;
                    break;
                }
                case 234: {
                    n14 = 53;
                    break;
                }
                case 235: {
                    n14 = 206;
                    break;
                }
                case 236: {
                    n14 = 154;
                    break;
                }
                case 237: {
                    n14 = 57;
                    break;
                }
                case 238: {
                    n14 = 153;
                    break;
                }
                case 239: {
                    n14 = 181;
                    break;
                }
                case 240: {
                    n14 = 77;
                    break;
                }
                case 241: {
                    n14 = 244;
                    break;
                }
                case 242: {
                    n14 = 96;
                    break;
                }
                case 243: {
                    n14 = 163;
                    break;
                }
                case 244: {
                    n14 = 204;
                    break;
                }
                case 245: {
                    n14 = 58;
                    break;
                }
                case 246: {
                    n14 = 194;
                    break;
                }
                case 247: {
                    n14 = 221;
                    break;
                }
                case 248: {
                    n14 = 75;
                    break;
                }
                case 249: {
                    n14 = 52;
                    break;
                }
                case 250: {
                    n14 = 156;
                    break;
                }
                case 251: {
                    n14 = 32;
                    break;
                }
                case 252: {
                    n14 = 83;
                    break;
                }
                case 253: {
                    n14 = 182;
                    break;
                }
                case 254: {
                    n14 = 17;
                    break;
                }
                default: {
                    n14 = 205;
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
            zb_0.j[n12] = new String(cArray).intern();
        }
        return j[n12];
    }
}

