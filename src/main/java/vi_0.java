/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Component;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from Vi
 */
public class vi_0
extends JDialog {
    z_ b;
    ld_1 g;
    boolean r;
    JPanel W;
    JPanel P;
    JTextField d;
    JTextField t;
    JTextField v;
    JTextField N;
    JPasswordField A;
    Random E;
    JComboBox Q;
    private static final String[] a;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;

    vi_0(z_ z_3, ld_1 ld_12, boolean bl) {
        Window window;
        block24: {
            block25: {
                String string;
                String string2;
                int n10;
                String string3;
                block28: {
                    int n11;
                    int n12;
                    block26: {
                        block27: {
                            String string4;
                            Object object;
                            ky_2[] ky_2Array;
                            block23: {
                                String string5;
                                vi_0 vi_02;
                                block21: {
                                    block22: {
                                        super(SwingUtilities.getWindowAncestor(z_3));
                                        this.E = new Random();
                                        ky_2[] ky_2Array2 = z_.t();
                                        this.b = z_3;
                                        ky_2Array = ky_2Array2;
                                        this.g = ld_12;
                                        vi_02 = this;
                                        if (ky_2Array != null) break block21;
                                        vi_02.r = bl;
                                        if (bl) break block22;
                                        this.setTitle("新建代理服务器");
                                        if (ky_2Array == null) break block23;
                                        ky_2.K(new String[5]);
                                    }
                                    vi_02 = this;
                                }
                                try {
                                    string5 = (String)ld_12.F();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                vi_02.setTitle("编辑代理服务器 - " + string5);
                            }
                            JPanel jPanel = (JPanel)this.getContentPane();
                            jPanel.setLayout(new MigLayout("insets 0 0 0 0", "", "[]0[]0[]0[]0[]0[]"));
                            this.W = new JPanel();
                            ((JPanel)this.W).setLayout(new MigLayout("insets 12 10 7 10", "[]0[]", "[]2[]2[]2[]2[]2[]"));
                            this.add((Component)((JPanel)this.W), "growx ,growy,wrap");
                            JPanel jPanel2 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel2, "wrap");
                            jPanel2.add((Component)new JLabel("名称:"), "width :50:");
                            this.d = new JTextField();
                            jPanel2.add((Component)((JTextField)this.d), "width :200:");
                            JPanel jPanel3 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel3, "wrap");
                            jPanel3.add((Component)new JLabel("类型:"), "width :50:");
                            this.Q = new JComboBox();
                            ((JComboBox)this.Q).addItem("SOCKS5");
                            ((JComboBox)this.Q).addItem("HTTP");
                            jPanel3.add((Component)((JComboBox)this.Q), "width :200:");
                            JPanel jPanel4 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel4, "wrap");
                            jPanel4.add((Component)new JLabel("主机:"), "width :50:");
                            this.t = new JTextField();
                            jPanel4.add((Component)((JTextField)this.t), "width :200:");
                            JPanel jPanel5 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel5, "wrap");
                            jPanel5.add((Component)new JLabel("端口:"), "width :50:");
                            this.v = new JTextField();
                            jPanel5.add((Component)((JTextField)this.v), "width :200:");
                            JPanel jPanel6 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel6, "wrap");
                            jPanel6.add((Component)new JLabel("用户名:"), "width :50:");
                            this.N = new JTextField();
                            jPanel6.add((Component)((JTextField)this.N), "width :200:");
                            JPanel jPanel7 = new JPanel(new MigLayout("insets 0 0 0 0"));
                            ((JPanel)this.W).add((Component)jPanel7, "wrap");
                            jPanel7.add((Component)new JLabel("密码:"), "width :50:");
                            try {
                                object = lk_0.S();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            this.A = object;
                            jPanel7.add((Component)((JPasswordField)this.A), "width :200:");
                            this.P = new JPanel();
                            this.add((Component)((JPanel)this.P), "growx,wrap");
                            ((JPanel)this.P).setLayout(new MigLayout("insets 0 0 10 15 ,align right"));
                            JButton jButton = new JButton("确定");
                            jButton.setFocusable(false);
                            ((JPanel)this.P).add(jButton);
                            jButton.addActionListener(new us_2(this));
                            JButton jButton2 = new JButton("取消");
                            jButton2.setFocusable(false);
                            window = this;
                            if (ky_2Array != null) break block24;
                            ((JPanel)window.P).add(jButton2);
                            jButton2.addActionListener(new fp_1(this));
                            if (!bl) break block25;
                            try {
                                string4 = (String)ld_12.F();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            ((JTextField)this.d).setText(string4);
                            try {
                                n12 = (Integer)ld_12.H();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n11 = ld_1.i;
                            if (ky_2Array != null) break block26;
                            if (n12 != n11) break block27;
                            ((JComboBox)this.Q).setSelectedItem("HTTP");
                            if (ky_2Array == null) break block28;
                        }
                        try {
                            n12 = (Integer)ld_12.H();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n11 = ld_1.v;
                    }
                    if (n12 == n11) {
                        ((JComboBox)this.Q).setSelectedItem("SOCKS5");
                    }
                }
                try {
                    string3 = (String)ld_12.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.t).setText(string3);
                try {
                    n10 = (Integer)ld_12.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.v).setText(n10 + "");
                try {
                    string2 = (String)ld_12.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.N).setText(string2);
                try {
                    string = (String)ld_12.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JPasswordField)this.A).setText(string);
            }
            window = SwingUtilities.getWindowAncestor(z_3);
        }
        vi_0 vi_03 = window;
        this.setSize(vi_0.a(21950, 7816302353238956560L), vi_0.a(21982, 5792242019032275569L));
        this.pack();
        this.setLocationRelativeTo(vi_03);
        this.setModal(true);
        this.setVisible(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void b() {
        block86: {
            block87: {
                block85: {
                    block83: {
                        block82: {
                            block80: {
                                block81: {
                                    block79: {
                                        block77: {
                                            block78: {
                                                block75: {
                                                    block76: {
                                                        var2_1 = 0;
                                                        var1_2 = z_.t();
                                                        v0 = ((JTextField)this.d).getText().trim().equals("");
                                                        if (var1_2 != null) break block75;
                                                        try {
                                                            block88: {
                                                                if (v0 == 0) break block76;
                                                                break block88;
                                                                catch (Exception v1) {
                                                                    throw vi_0.a(v1);
                                                                }
                                                            }
                                                            JOptionPane.showMessageDialog(this, "请输入名称!");
                                                            ((JTextField)this.d).requestFocus();
                                                            return;
                                                        }
                                                        catch (Exception v2) {
                                                            throw vi_0.a(v2);
                                                        }
                                                    }
                                                    v0 = ((JTextField)this.t).getText().trim().equals("");
                                                }
                                                if (var1_2 != null) break block77;
                                                try {
                                                    block89: {
                                                        if (v0 == 0) break block78;
                                                        break block89;
                                                        catch (Exception v3) {
                                                            throw vi_0.a(v3);
                                                        }
                                                    }
                                                    JOptionPane.showMessageDialog(this, "请输入主机地址!");
                                                    ((JTextField)this.t).requestFocus();
                                                    return;
                                                }
                                                catch (Exception v4) {
                                                    throw vi_0.a(v4);
                                                }
                                            }
                                            v0 = ((JTextField)this.v).getText().trim().equals("");
                                        }
                                        if (var1_2 != null) ** GOTO lbl52
                                        try {
                                            block90: {
                                                if (v0 == 0) break block79;
                                                break block90;
                                                catch (Exception v5) {
                                                    throw vi_0.a(v5);
                                                }
                                            }
                                            JOptionPane.showMessageDialog(this, "请输入端口!");
                                            ((JTextField)this.v).requestFocus();
                                            return;
                                        }
                                        catch (Exception v6) {
                                            throw vi_0.a(v6);
                                        }
                                    }
                                    try {
                                        v0 = Integer.parseInt(((JTextField)this.v).getText().trim());
lbl52:
                                        // 2 sources

                                        var2_1 = v0;
                                    }
                                    catch (Exception var3_3) {
                                        JOptionPane.showMessageDialog(this, "请输入数字端口号!");
                                        ((JTextField)this.v).requestFocus();
                                    }
                                    try {
                                        try {
                                            v7 = this;
                                            if (var1_2 != null) break block80;
                                            if (!v7.r) break block81;
                                            break block82;
                                        }
                                        catch (Exception v8) {
                                            throw vi_0.a(v8);
                                        }
                                    }
                                    catch (Exception v9) {
                                        throw vi_0.a(v9);
                                    }
                                }
                                v7 = this;
                            }
                            v7.g = new ld_1();
                        }
                        try {
                            this.g.w(((JTextField)this.t).getText().trim());
                        }
                        catch (InvocationTargetException v10) {
                            throw v10.getTargetException();
                        }
                        try {
                            this.g.z(((JTextField)this.d).getText().trim());
                        }
                        catch (InvocationTargetException v11) {
                            throw v11.getTargetException();
                        }
                        try {
                            this.g.c(new String(((JPasswordField)this.A).getPassword()));
                        }
                        catch (InvocationTargetException v12) {
                            throw v12.getTargetException();
                        }
                        try {
                            this.g.d(var2_1);
                        }
                        catch (InvocationTargetException v13) {
                            throw v13.getTargetException();
                        }
                        var3_4 = (String)((JComboBox)this.Q).getSelectedItem();
                        var3_4 = var3_4.toLowerCase();
                        try {
                            block84: {
                                try {
                                    try {
                                        v14 = var3_4.equals("socks5");
                                        if (var1_2 != null) break block83;
                                        if (v14) {
                                        }
                                        break block84;
                                    }
                                    catch (Exception v15) {
                                        throw vi_0.a(v15);
                                    }
                                    try {
                                        this.g.u(ld_1.v);
                                    }
                                    catch (InvocationTargetException v16) {
                                        throw v16.getTargetException();
                                    }
                                    if (var1_2 == null) break block85;
                                }
                                catch (Exception v17) {
                                    throw vi_0.a(v17);
                                }
                            }
                            v14 = var3_4.equals("http");
                        }
                        catch (Exception v18) {
                            throw vi_0.a(v18);
                        }
                    }
                    try {
                        if (!v14) ** GOTO lbl137
                        try {
                            this.g.u(ld_1.i);
                        }
                        catch (InvocationTargetException v19) {
                            throw v19.getTargetException();
                        }
                    }
                    catch (Exception v20) {
                        throw vi_0.a(v20);
                    }
                }
                try {
                    this.g.S(((JTextField)this.N).getText().trim());
                }
                catch (InvocationTargetException v21) {
                    throw v21.getTargetException();
                }
                var4_5 = System.currentTimeMillis();
                try {
                    try {
                        v22 = this;
                        if (var1_2 != null) break block86;
                        if (v22.r) break block87;
                    }
                    catch (Exception v23) {
                        throw vi_0.a(v23);
                    }
                    try {
                        v24 = yt_1.i();
                    }
                    catch (InvocationTargetException v25) {
                        throw v25.getTargetException();
                    }
                    try {
                        v26 = v24.h();
                    }
                    catch (InvocationTargetException v27) {
                        throw v27.getTargetException();
                    }
                    try {
                        v28 = (ArrayList)v26.u();
                    }
                    catch (InvocationTargetException v29) {
                        throw v29.getTargetException();
                    }
                    v28.add((ld_1)this.g);
                    try {
                        this.g.Z(var4_5);
                    }
                    catch (InvocationTargetException v30) {
                        throw v30.getTargetException();
                    }
                }
                catch (Exception v31) {
                    throw vi_0.a(v31);
                }
            }
            try {
                this.g.d(var4_5);
            }
            catch (InvocationTargetException v32) {
                throw v32.getTargetException();
            }
            try {
                v33 = yt_1.i();
            }
            catch (InvocationTargetException v34) {
                throw v34.getTargetException();
            }
            try {
                v35 = v33.Q();
            }
            catch (InvocationTargetException v36) {
                throw v36.getTargetException();
            }
            try {
                v35.G();
            }
            catch (InvocationTargetException v37) {
                throw v37.getTargetException();
            }
            try {
                v38 = yt_1.i();
            }
            catch (InvocationTargetException v39) {
                throw v39.getTargetException();
            }
            try {
                v38.S();
            }
            catch (InvocationTargetException v40) {
                throw v40.getTargetException();
            }
            try {
                this.b.F();
            }
            catch (InvocationTargetException v41) {
                throw v41.getTargetException();
            }
            v22 = this;
        }
        try {
            v42 = this.g.g();
        }
        catch (InvocationTargetException v43) {
            throw v43.getTargetException();
        }
        try {
            v22.b.l(v42);
        }
        catch (InvocationTargetException v44) {
            throw v44.getTargetException();
        }
        var6_6 = new ty_2(ty_2.K);
        try {
            v45 = yt_1.i();
        }
        catch (InvocationTargetException v46) {
            throw v46.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(v45, com.c.a(var6_6));
        }
        catch (InvocationTargetException v47) {
            throw v47.getTargetException();
        }
        this.setVisible(false);
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
                        var13 = new String[35];
                        var11_1 = 0;
                        var10_2 = "\u008cE\t\u001cP\u00d9\u0089/\u00b6\u00c4^\u0003\u4e8d\u678a\u00b2\u0004\u75ea\u627e\u5418\u00a0\u001d\u00c8\u0085K\u00f2\u00f1d8\u00a3\u00c9\u0017\u00b9\u0014\u00a3iq\u00f6|\u00e5;\u00f9\u009f\u00bb\u0013\u00b97\u008b=\u0081Z\u0006\u8bfe\u8f01\u51d6\u5448\u7912\u0004\u0003\u7c64\u57e5\u00c7\u0007\u6585\u5e0c\u4e90\u74a6\u6771\u5233\u5636\u0005\u001d\u00e5\u00c6\u0095B\n\u00ff!g\u0090\u009dH0\u001a\u0081\u008f\u0004\u00e5K\u00ccc\n\u00d4p\u0002\u00ba1\r\u00a5\u00b23\u009a\b\u8b80\u8f31\u5119\u4e78\u6721\u57e3\u57c5i\u0003\u5bc8\u7891X\u0006\u8bd5\u8fde\u51b3\u7a51\u53ad\u0099\u000eyb}\u000e7\u00fb\u00e0P\u00d2i\u00da\u00da\u00df\u0081\u0004\u00d4,\u00ee\u008b\u0004\u00cc\u00e0\u00e9\u0016\u000e\u0015l\u00f0\u00cf\u0086\u00c3\u00d6W\u0014\u0089\u0002\u00c6\u00c4\u0002\u0011\u00c5U9e,\u0095\u0002\u00f3Q\u00ff\u00e5\u00f5\u0089C\u00e8Z4\u0004\u00bc\u00ef\n5\u0011-\u00a2\u00c2}\u0080-a\u008e\u00e4\u00191\u00d0\u000b\u00efa\u009a`\u0006\u008f\u0001\u00eaM\u00d0\u001a\n!\u001d\u00a5l\u00bf\u00b8+\u00ceW\u00f0\u0003\u543e\u79ee4\u000b\u001dI;\u009d\u0016\u00e9A)\u00af\u0004}\u0003\u7a31\u5391k\u0006\u00bfC\u00e8\u0001\u0094\u00b7\u0011\u0011\u00afG\u00dcr\u001b?\n-\u0089J\u00c0d\u00af\u008e\u0092\u00df\u0004\u00ceED`\t\u8bb9\u8f71\u513e\u653b\u5ba8\u7a76\u5397\u5329\u0086\n\u7f03\u8f76\u4e32\u74ef\u6725\u521a\u56bc\u00f4\u0015\u00ff\u0006\u001d\u0095\u00bc\u00db\u001e\u00ec\u0011U\u00d7\u00f8\u00b8\u0087-\u00f6\u008b\u0002#\u0081\u0081\u0087\u00ed\u00f6\u0097\u00af";
                        var12_3 = "\u008cE\t\u001cP\u00d9\u0089/\u00b6\u00c4^\u0003\u4e8d\u678a\u00b2\u0004\u75ea\u627e\u5418\u00a0\u001d\u00c8\u0085K\u00f2\u00f1d8\u00a3\u00c9\u0017\u00b9\u0014\u00a3iq\u00f6|\u00e5;\u00f9\u009f\u00bb\u0013\u00b97\u008b=\u0081Z\u0006\u8bfe\u8f01\u51d6\u5448\u7912\u0004\u0003\u7c64\u57e5\u00c7\u0007\u6585\u5e0c\u4e90\u74a6\u6771\u5233\u5636\u0005\u001d\u00e5\u00c6\u0095B\n\u00ff!g\u0090\u009dH0\u001a\u0081\u008f\u0004\u00e5K\u00ccc\n\u00d4p\u0002\u00ba1\r\u00a5\u00b23\u009a\b\u8b80\u8f31\u5119\u4e78\u6721\u57e3\u57c5i\u0003\u5bc8\u7891X\u0006\u8bd5\u8fde\u51b3\u7a51\u53ad\u0099\u000eyb}\u000e7\u00fb\u00e0P\u00d2i\u00da\u00da\u00df\u0081\u0004\u00d4,\u00ee\u008b\u0004\u00cc\u00e0\u00e9\u0016\u000e\u0015l\u00f0\u00cf\u0086\u00c3\u00d6W\u0014\u0089\u0002\u00c6\u00c4\u0002\u0011\u00c5U9e,\u0095\u0002\u00f3Q\u00ff\u00e5\u00f5\u0089C\u00e8Z4\u0004\u00bc\u00ef\n5\u0011-\u00a2\u00c2}\u0080-a\u008e\u00e4\u00191\u00d0\u000b\u00efa\u009a`\u0006\u008f\u0001\u00eaM\u00d0\u001a\n!\u001d\u00a5l\u00bf\u00b8+\u00ceW\u00f0\u0003\u543e\u79ee4\u000b\u001dI;\u009d\u0016\u00e9A)\u00af\u0004}\u0003\u7a31\u5391k\u0006\u00bfC\u00e8\u0001\u0094\u00b7\u0011\u0011\u00afG\u00dcr\u001b?\n-\u0089J\u00c0d\u00af\u008e\u0092\u00df\u0004\u00ceED`\t\u8bb9\u8f71\u513e\u653b\u5ba8\u7a76\u5397\u5329\u0086\n\u7f03\u8f76\u4e32\u74ef\u6725\u521a\u56bc\u00f4\u0015\u00ff\u0006\u001d\u0095\u00bc\u00db\u001e\u00ec\u0011U\u00d7\u00f8\u00b8\u0087-\u00f6\u008b\u0002#\u0081\u0081\u0087\u00ed\u00f6\u0097\u00af".length();
                        var9_4 = 11;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 69;
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
                            var10_2 = "\u5377\u6d56\u0002\u789d\u5b37";
                            var12_3 = "\u5377\u6d56\u0002\u789d\u5b37".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 19;
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
                                    v15 = 71;
                                    break;
                                }
                                case 1: {
                                    v15 = 65;
                                    break;
                                }
                                case 2: {
                                    v15 = 96;
                                    break;
                                }
                                case 3: {
                                    v15 = 65;
                                    break;
                                }
                                case 4: {
                                    v15 = 16;
                                    break;
                                }
                                case 5: {
                                    v15 = 69;
                                    break;
                                }
                                default: {
                                    v15 = 51;
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
                vi_0.a = var13;
                vi_0.c = new String[35];
                var0_7 = 1988308315226514633L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u001e-(\u00ca\u00ac\u008a\u00bf\u0094w\u00e7\u008f\u00964\u00d3\u00bfI";
                var5_11 = "\u001e-(\u00ca\u00ac\u008a\u00bf\u0094w\u00e7\u008f\u00964\u00d3\u00bfI".length();
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
        vi_0.e = var6_8;
        vi_0.f = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1632) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 98;
                    break;
                }
                case 1: {
                    n14 = 25;
                    break;
                }
                case 2: {
                    n14 = 53;
                    break;
                }
                case 3: {
                    n14 = 45;
                    break;
                }
                case 4: {
                    n14 = 92;
                    break;
                }
                case 5: {
                    n14 = 18;
                    break;
                }
                case 6: {
                    n14 = 31;
                    break;
                }
                case 7: {
                    n14 = 230;
                    break;
                }
                case 8: {
                    n14 = 208;
                    break;
                }
                case 9: {
                    n14 = 198;
                    break;
                }
                case 10: {
                    n14 = 4;
                    break;
                }
                case 11: {
                    n14 = 95;
                    break;
                }
                case 12: {
                    n14 = 238;
                    break;
                }
                case 13: {
                    n14 = 242;
                    break;
                }
                case 14: {
                    n14 = 237;
                    break;
                }
                case 15: {
                    n14 = 193;
                    break;
                }
                case 16: {
                    n14 = 13;
                    break;
                }
                case 17: {
                    n14 = 159;
                    break;
                }
                case 18: {
                    n14 = 173;
                    break;
                }
                case 19: {
                    n14 = 140;
                    break;
                }
                case 20: {
                    n14 = 1;
                    break;
                }
                case 21: {
                    n14 = 206;
                    break;
                }
                case 22: {
                    n14 = 184;
                    break;
                }
                case 23: {
                    n14 = 160;
                    break;
                }
                case 24: {
                    n14 = 252;
                    break;
                }
                case 25: {
                    n14 = 110;
                    break;
                }
                case 26: {
                    n14 = 149;
                    break;
                }
                case 27: {
                    n14 = 105;
                    break;
                }
                case 28: {
                    n14 = 21;
                    break;
                }
                case 29: {
                    n14 = 207;
                    break;
                }
                case 30: {
                    n14 = 190;
                    break;
                }
                case 31: {
                    n14 = 154;
                    break;
                }
                case 32: {
                    n14 = 255;
                    break;
                }
                case 33: {
                    n14 = 155;
                    break;
                }
                case 34: {
                    n14 = 76;
                    break;
                }
                case 35: {
                    n14 = 35;
                    break;
                }
                case 36: {
                    n14 = 249;
                    break;
                }
                case 37: {
                    n14 = 187;
                    break;
                }
                case 38: {
                    n14 = 212;
                    break;
                }
                case 39: {
                    n14 = 205;
                    break;
                }
                case 40: {
                    n14 = 133;
                    break;
                }
                case 41: {
                    n14 = 191;
                    break;
                }
                case 42: {
                    n14 = 55;
                    break;
                }
                case 43: {
                    n14 = 33;
                    break;
                }
                case 44: {
                    n14 = 233;
                    break;
                }
                case 45: {
                    n14 = 222;
                    break;
                }
                case 46: {
                    n14 = 156;
                    break;
                }
                case 47: {
                    n14 = 112;
                    break;
                }
                case 48: {
                    n14 = 15;
                    break;
                }
                case 49: {
                    n14 = 66;
                    break;
                }
                case 50: {
                    n14 = 79;
                    break;
                }
                case 51: {
                    n14 = 241;
                    break;
                }
                case 52: {
                    n14 = 215;
                    break;
                }
                case 53: {
                    n14 = 214;
                    break;
                }
                case 54: {
                    n14 = 22;
                    break;
                }
                case 55: {
                    n14 = 84;
                    break;
                }
                case 56: {
                    n14 = 132;
                    break;
                }
                case 57: {
                    n14 = 97;
                    break;
                }
                case 58: {
                    n14 = 82;
                    break;
                }
                case 59: {
                    n14 = 8;
                    break;
                }
                case 60: {
                    n14 = 48;
                    break;
                }
                case 61: {
                    n14 = 180;
                    break;
                }
                case 62: {
                    n14 = 86;
                    break;
                }
                case 63: {
                    n14 = 147;
                    break;
                }
                case 64: {
                    n14 = 90;
                    break;
                }
                case 65: {
                    n14 = 75;
                    break;
                }
                case 66: {
                    n14 = 77;
                    break;
                }
                case 67: {
                    n14 = 178;
                    break;
                }
                case 68: {
                    n14 = 130;
                    break;
                }
                case 69: {
                    n14 = 236;
                    break;
                }
                case 70: {
                    n14 = 119;
                    break;
                }
                case 71: {
                    n14 = 250;
                    break;
                }
                case 72: {
                    n14 = 226;
                    break;
                }
                case 73: {
                    n14 = 183;
                    break;
                }
                case 74: {
                    n14 = 23;
                    break;
                }
                case 75: {
                    n14 = 50;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 228;
                    break;
                }
                case 78: {
                    n14 = 32;
                    break;
                }
                case 79: {
                    n14 = 194;
                    break;
                }
                case 80: {
                    n14 = 39;
                    break;
                }
                case 81: {
                    n14 = 168;
                    break;
                }
                case 82: {
                    n14 = 175;
                    break;
                }
                case 83: {
                    n14 = 200;
                    break;
                }
                case 84: {
                    n14 = 231;
                    break;
                }
                case 85: {
                    n14 = 104;
                    break;
                }
                case 86: {
                    n14 = 247;
                    break;
                }
                case 87: {
                    n14 = 56;
                    break;
                }
                case 88: {
                    n14 = 72;
                    break;
                }
                case 89: {
                    n14 = 244;
                    break;
                }
                case 90: {
                    n14 = 118;
                    break;
                }
                case 91: {
                    n14 = 36;
                    break;
                }
                case 92: {
                    n14 = 80;
                    break;
                }
                case 93: {
                    n14 = 145;
                    break;
                }
                case 94: {
                    n14 = 9;
                    break;
                }
                case 95: {
                    n14 = 68;
                    break;
                }
                case 96: {
                    n14 = 225;
                    break;
                }
                case 97: {
                    n14 = 176;
                    break;
                }
                case 98: {
                    n14 = 172;
                    break;
                }
                case 99: {
                    n14 = 71;
                    break;
                }
                case 100: {
                    n14 = 189;
                    break;
                }
                case 101: {
                    n14 = 100;
                    break;
                }
                case 102: {
                    n14 = 69;
                    break;
                }
                case 103: {
                    n14 = 38;
                    break;
                }
                case 104: {
                    n14 = 218;
                    break;
                }
                case 105: {
                    n14 = 111;
                    break;
                }
                case 106: {
                    n14 = 5;
                    break;
                }
                case 107: {
                    n14 = 182;
                    break;
                }
                case 108: {
                    n14 = 51;
                    break;
                }
                case 109: {
                    n14 = 152;
                    break;
                }
                case 110: {
                    n14 = 63;
                    break;
                }
                case 111: {
                    n14 = 131;
                    break;
                }
                case 112: {
                    n14 = 177;
                    break;
                }
                case 113: {
                    n14 = 209;
                    break;
                }
                case 114: {
                    n14 = 41;
                    break;
                }
                case 115: {
                    n14 = 254;
                    break;
                }
                case 116: {
                    n14 = 219;
                    break;
                }
                case 117: {
                    n14 = 60;
                    break;
                }
                case 118: {
                    n14 = 93;
                    break;
                }
                case 119: {
                    n14 = 224;
                    break;
                }
                case 120: {
                    n14 = 165;
                    break;
                }
                case 121: {
                    n14 = 239;
                    break;
                }
                case 122: {
                    n14 = 143;
                    break;
                }
                case 123: {
                    n14 = 106;
                    break;
                }
                case 124: {
                    n14 = 204;
                    break;
                }
                case 125: {
                    n14 = 136;
                    break;
                }
                case 126: {
                    n14 = 6;
                    break;
                }
                case 127: {
                    n14 = 246;
                    break;
                }
                case 128: {
                    n14 = 142;
                    break;
                }
                case 129: {
                    n14 = 134;
                    break;
                }
                case 130: {
                    n14 = 78;
                    break;
                }
                case 131: {
                    n14 = 216;
                    break;
                }
                case 132: {
                    n14 = 11;
                    break;
                }
                case 133: {
                    n14 = 196;
                    break;
                }
                case 134: {
                    n14 = 197;
                    break;
                }
                case 135: {
                    n14 = 7;
                    break;
                }
                case 136: {
                    n14 = 34;
                    break;
                }
                case 137: {
                    n14 = 28;
                    break;
                }
                case 138: {
                    n14 = 167;
                    break;
                }
                case 139: {
                    n14 = 186;
                    break;
                }
                case 140: {
                    n14 = 251;
                    break;
                }
                case 141: {
                    n14 = 2;
                    break;
                }
                case 142: {
                    n14 = 54;
                    break;
                }
                case 143: {
                    n14 = 158;
                    break;
                }
                case 144: {
                    n14 = 83;
                    break;
                }
                case 145: {
                    n14 = 192;
                    break;
                }
                case 146: {
                    n14 = 245;
                    break;
                }
                case 147: {
                    n14 = 188;
                    break;
                }
                case 148: {
                    n14 = 19;
                    break;
                }
                case 149: {
                    n14 = 114;
                    break;
                }
                case 150: {
                    n14 = 99;
                    break;
                }
                case 151: {
                    n14 = 234;
                    break;
                }
                case 152: {
                    n14 = 44;
                    break;
                }
                case 153: {
                    n14 = 123;
                    break;
                }
                case 154: {
                    n14 = 57;
                    break;
                }
                case 155: {
                    n14 = 0;
                    break;
                }
                case 156: {
                    n14 = 217;
                    break;
                }
                case 157: {
                    n14 = 40;
                    break;
                }
                case 158: {
                    n14 = 202;
                    break;
                }
                case 159: {
                    n14 = 166;
                    break;
                }
                case 160: {
                    n14 = 124;
                    break;
                }
                case 161: {
                    n14 = 229;
                    break;
                }
                case 162: {
                    n14 = 16;
                    break;
                }
                case 163: {
                    n14 = 89;
                    break;
                }
                case 164: {
                    n14 = 171;
                    break;
                }
                case 165: {
                    n14 = 144;
                    break;
                }
                case 166: {
                    n14 = 121;
                    break;
                }
                case 167: {
                    n14 = 103;
                    break;
                }
                case 168: {
                    n14 = 58;
                    break;
                }
                case 169: {
                    n14 = 10;
                    break;
                }
                case 170: {
                    n14 = 150;
                    break;
                }
                case 171: {
                    n14 = 47;
                    break;
                }
                case 172: {
                    n14 = 73;
                    break;
                }
                case 173: {
                    n14 = 46;
                    break;
                }
                case 174: {
                    n14 = 235;
                    break;
                }
                case 175: {
                    n14 = 201;
                    break;
                }
                case 176: {
                    n14 = 122;
                    break;
                }
                case 177: {
                    n14 = 161;
                    break;
                }
                case 178: {
                    n14 = 43;
                    break;
                }
                case 179: {
                    n14 = 141;
                    break;
                }
                case 180: {
                    n14 = 179;
                    break;
                }
                case 181: {
                    n14 = 102;
                    break;
                }
                case 182: {
                    n14 = 146;
                    break;
                }
                case 183: {
                    n14 = 107;
                    break;
                }
                case 184: {
                    n14 = 221;
                    break;
                }
                case 185: {
                    n14 = 162;
                    break;
                }
                case 186: {
                    n14 = 117;
                    break;
                }
                case 187: {
                    n14 = 88;
                    break;
                }
                case 188: {
                    n14 = 248;
                    break;
                }
                case 189: {
                    n14 = 67;
                    break;
                }
                case 190: {
                    n14 = 52;
                    break;
                }
                case 191: {
                    n14 = 164;
                    break;
                }
                case 192: {
                    n14 = 227;
                    break;
                }
                case 193: {
                    n14 = 29;
                    break;
                }
                case 194: {
                    n14 = 120;
                    break;
                }
                case 195: {
                    n14 = 115;
                    break;
                }
                case 196: {
                    n14 = 169;
                    break;
                }
                case 197: {
                    n14 = 64;
                    break;
                }
                case 198: {
                    n14 = 240;
                    break;
                }
                case 199: {
                    n14 = 42;
                    break;
                }
                case 200: {
                    n14 = 128;
                    break;
                }
                case 201: {
                    n14 = 26;
                    break;
                }
                case 202: {
                    n14 = 62;
                    break;
                }
                case 203: {
                    n14 = 137;
                    break;
                }
                case 204: {
                    n14 = 37;
                    break;
                }
                case 205: {
                    n14 = 211;
                    break;
                }
                case 206: {
                    n14 = 17;
                    break;
                }
                case 207: {
                    n14 = 61;
                    break;
                }
                case 208: {
                    n14 = 20;
                    break;
                }
                case 209: {
                    n14 = 129;
                    break;
                }
                case 210: {
                    n14 = 12;
                    break;
                }
                case 211: {
                    n14 = 14;
                    break;
                }
                case 212: {
                    n14 = 91;
                    break;
                }
                case 213: {
                    n14 = 3;
                    break;
                }
                case 214: {
                    n14 = 81;
                    break;
                }
                case 215: {
                    n14 = 253;
                    break;
                }
                case 216: {
                    n14 = 220;
                    break;
                }
                case 217: {
                    n14 = 170;
                    break;
                }
                case 218: {
                    n14 = 151;
                    break;
                }
                case 219: {
                    n14 = 163;
                    break;
                }
                case 220: {
                    n14 = 199;
                    break;
                }
                case 221: {
                    n14 = 87;
                    break;
                }
                case 222: {
                    n14 = 138;
                    break;
                }
                case 223: {
                    n14 = 181;
                    break;
                }
                case 224: {
                    n14 = 174;
                    break;
                }
                case 225: {
                    n14 = 223;
                    break;
                }
                case 226: {
                    n14 = 24;
                    break;
                }
                case 227: {
                    n14 = 185;
                    break;
                }
                case 228: {
                    n14 = 116;
                    break;
                }
                case 229: {
                    n14 = 70;
                    break;
                }
                case 230: {
                    n14 = 27;
                    break;
                }
                case 231: {
                    n14 = 113;
                    break;
                }
                case 232: {
                    n14 = 127;
                    break;
                }
                case 233: {
                    n14 = 243;
                    break;
                }
                case 234: {
                    n14 = 139;
                    break;
                }
                case 235: {
                    n14 = 30;
                    break;
                }
                case 236: {
                    n14 = 85;
                    break;
                }
                case 237: {
                    n14 = 109;
                    break;
                }
                case 238: {
                    n14 = 195;
                    break;
                }
                case 239: {
                    n14 = 49;
                    break;
                }
                case 240: {
                    n14 = 153;
                    break;
                }
                case 241: {
                    n14 = 148;
                    break;
                }
                case 242: {
                    n14 = 59;
                    break;
                }
                case 243: {
                    n14 = 101;
                    break;
                }
                case 244: {
                    n14 = 203;
                    break;
                }
                case 245: {
                    n14 = 74;
                    break;
                }
                case 246: {
                    n14 = 96;
                    break;
                }
                case 247: {
                    n14 = 135;
                    break;
                }
                case 248: {
                    n14 = 126;
                    break;
                }
                case 249: {
                    n14 = 125;
                    break;
                }
                case 250: {
                    n14 = 94;
                    break;
                }
                case 251: {
                    n14 = 157;
                    break;
                }
                case 252: {
                    n14 = 232;
                    break;
                }
                case 253: {
                    n14 = 213;
                    break;
                }
                case 254: {
                    n14 = 65;
                    break;
                }
                default: {
                    n14 = 210;
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
            vi_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4FAF;
        if (f[n11] == null) {
            vi_0.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

