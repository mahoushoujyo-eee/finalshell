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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from uQ
 */
public class uq_1
extends JDialog {
    zw_0 Y;
    YE J;
    YE E;
    boolean K;
    JPanel x;
    JPanel A;
    JTextField L;
    JTextField O;
    JTextField s;
    JTextField T;
    JTextField n;
    Random F;
    JComboBox p;
    ArrayList P;
    JLabel v;
    JLabel I;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    uq_1(zw_0 zw_02, YE yE, ArrayList arrayList, boolean bl) {
        Window window;
        block24: {
            block25: {
                int n10;
                String string;
                int n11;
                String string2;
                block28: {
                    int n12;
                    int n13;
                    block29: {
                        block30: {
                            String string3;
                            block26: {
                                block27: {
                                    String string4;
                                    block23: {
                                        String string5;
                                        uq_1 uq_12;
                                        block21: {
                                            block22: {
                                                super(SwingUtilities.getWindowAncestor(zw_02));
                                                String string6 = zw_0.V();
                                                this.F = new Random();
                                                string3 = string6;
                                                this.v = new JLabel("目标地址:");
                                                this.I = new JLabel("目标端口:");
                                                this.P = arrayList;
                                                this.Y = zw_02;
                                                this.E = yE;
                                                this.J = new YE();
                                                uq_12 = this;
                                                if (string3 == null) break block21;
                                                uq_12.K = bl;
                                                if (bl) break block22;
                                                this.setTitle("新建隧道");
                                                if (string3 != null) break block23;
                                                ky_2.K(new String[3]);
                                            }
                                            uq_12 = this;
                                        }
                                        try {
                                            string5 = (String)yE.b();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        uq_12.setTitle("编辑隧道 - " + string5);
                                    }
                                    JPanel jPanel = (JPanel)this.getContentPane();
                                    jPanel.setLayout(new MigLayout("insets 0 0 0 0", "", "[]0[]0[]0[]0[]0[]"));
                                    this.x = new JPanel();
                                    ((JPanel)this.x).setLayout(new MigLayout("insets 12 10 7 10", "[]0[]", "[]2[]2[]2[]2[]2[]"));
                                    this.add((Component)((JPanel)this.x), "growx ,growy,wrap");
                                    JPanel jPanel2 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel2, "wrap");
                                    jPanel2.add((Component)new JLabel("名称:"), "width :70:");
                                    this.L = new JTextField();
                                    jPanel2.add((Component)((JTextField)this.L), "width :200:");
                                    JPanel jPanel3 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel3, "wrap");
                                    jPanel3.add((Component)new JLabel("类型:"), "width :70:");
                                    this.p = new JComboBox();
                                    ((JComboBox)this.p).addItem("本地");
                                    ((JComboBox)this.p).addItem("远程");
                                    ((JComboBox)this.p).addItem("SOCKS5");
                                    jPanel3.add((Component)((JComboBox)this.p), "width :200:");
                                    ((JComboBox)this.p).addItemListener(new QK(this));
                                    JPanel jPanel4 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel4, "wrap");
                                    jPanel4.add((Component)new JLabel("监听端口:"), "width :70:");
                                    this.s = new JTextField();
                                    jPanel4.add((Component)((JTextField)this.s), "width :200:");
                                    JPanel jPanel5 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel5, "wrap");
                                    jPanel5.add((Component)new JLabel("绑定ip:"), "width :70:");
                                    this.O = new JTextField("127.0.0.1");
                                    jPanel5.add((Component)((JTextField)this.O), "width :200:");
                                    JPanel jPanel6 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel6, "wrap");
                                    jPanel6.add((Component)((JLabel)this.v), "width :70:");
                                    this.T = new JTextField("127.0.0.1");
                                    jPanel6.add((Component)((JTextField)this.T), "width :200:");
                                    JPanel jPanel7 = new JPanel(new MigLayout("insets 0 0 0 0"));
                                    ((JPanel)this.x).add((Component)jPanel7, "wrap");
                                    jPanel7.add((Component)((JLabel)this.I), "width :70:");
                                    this.n = new JTextField();
                                    jPanel7.add((Component)((JTextField)this.n), "width :200:");
                                    this.A = new JPanel();
                                    this.add((Component)((JPanel)this.A), "growx,wrap");
                                    ((JPanel)this.A).setLayout(new MigLayout("insets 0 0 10 15 ,align right"));
                                    JButton jButton = new JButton("确定");
                                    jButton.setFocusable(false);
                                    ((JPanel)this.A).add(jButton);
                                    jButton.addActionListener(new op_2(this));
                                    JButton jButton2 = new JButton("取消");
                                    jButton2.setFocusable(false);
                                    window = this;
                                    if (string3 == null) break block24;
                                    ((JPanel)window.A).add(jButton2);
                                    jButton2.addActionListener(new B1(this));
                                    if (!bl) break block25;
                                    try {
                                        string4 = (String)yE.b();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JTextField)this.L).setText(string4);
                                    try {
                                        n13 = (Integer)yE.O();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n12 = YE.H;
                                    if (string3 == null) break block26;
                                    if (n13 != n12) break block27;
                                    ((JComboBox)this.p).setSelectedItem("远程");
                                    if (string3 != null) break block28;
                                }
                                try {
                                    n13 = (Integer)yE.O();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n12 = YE.A;
                            }
                            if (string3 == null) break block29;
                            if (n13 != n12) break block30;
                            ((JComboBox)this.p).setSelectedItem("本地");
                            if (string3 != null) break block28;
                        }
                        try {
                            n13 = (Integer)yE.O();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n12 = YE.e;
                    }
                    if (n13 == n12) {
                        ((JComboBox)this.p).setSelectedItem("SOCKS5");
                    }
                }
                try {
                    string2 = (String)yE.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.O).setText(string2);
                try {
                    n11 = (Integer)yE.r();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.s).setText(n11 + "");
                try {
                    string = (String)yE.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.T).setText(string);
                try {
                    n10 = (Integer)yE.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.n).setText(n10 + "");
            }
            window = SwingUtilities.getWindowAncestor(zw_02);
        }
        uq_1 uq_13 = window;
        this.setSize(uq_1.a(6109, 1625767630155087386L), uq_1.a(22539, 3264626618149450189L));
        this.pack();
        this.setLocationRelativeTo(uq_13);
        this.setModal(true);
        this.setVisible(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void v() {
        block128: {
            block129: {
                block126: {
                    block125: {
                        block122: {
                            block123: {
                                block120: {
                                    block119: {
                                        block118: {
                                            block116: {
                                                block117: {
                                                    block115: {
                                                        block137: {
                                                            block136: {
                                                                block113: {
                                                                    block114: {
                                                                        block134: {
                                                                            block133: {
                                                                                block111: {
                                                                                    block112: {
                                                                                        block109: {
                                                                                            block110: {
                                                                                                var2_1 = (String)((JComboBox)this.p).getSelectedItem();
                                                                                                var2_1 = var2_1.toLowerCase();
                                                                                                var1_2 = zw_0.V();
                                                                                                var3_3 = 0;
                                                                                                var4_4 = 0;
                                                                                                v0 = ((JTextField)this.L).getText().trim().equals("");
                                                                                                if (var1_2 == null) break block109;
                                                                                                try {
                                                                                                    block131: {
                                                                                                        if (v0 == 0) break block110;
                                                                                                        break block131;
                                                                                                        catch (Exception v1) {
                                                                                                            throw uq_1.a(v1);
                                                                                                        }
                                                                                                    }
                                                                                                    JOptionPane.showMessageDialog(this, "请输入名称!");
                                                                                                    ((JTextField)this.L).requestFocus();
                                                                                                    return;
                                                                                                }
                                                                                                catch (Exception v2) {
                                                                                                    throw uq_1.a(v2);
                                                                                                }
                                                                                            }
                                                                                            v0 = ((JTextField)this.s).getText().trim().equals("");
                                                                                        }
                                                                                        if (var1_2 == null) break block111;
                                                                                        try {
                                                                                            block132: {
                                                                                                if (v0 == 0) break block112;
                                                                                                break block132;
                                                                                                catch (Exception v3) {
                                                                                                    throw uq_1.a(v3);
                                                                                                }
                                                                                            }
                                                                                            JOptionPane.showMessageDialog(this, "请输入监听端口!");
                                                                                            ((JTextField)this.s).requestFocus();
                                                                                            return;
                                                                                        }
                                                                                        catch (Exception v4) {
                                                                                            throw uq_1.a(v4);
                                                                                        }
                                                                                    }
                                                                                    v0 = ((JTextField)this.T).getText().trim().equals("");
                                                                                }
                                                                                if (var1_2 == null) break block113;
                                                                                if (v0 == 0) break block114;
                                                                                break block133;
                                                                                catch (Exception v5) {
                                                                                    throw uq_1.a(v5);
                                                                                }
                                                                            }
                                                                            v0 = var2_1.equals("socks5");
                                                                            if (var1_2 == null) break block113;
                                                                            break block134;
                                                                            catch (Exception v6) {
                                                                                throw uq_1.a(v6);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block135: {
                                                                                if (v0 != 0) break block114;
                                                                                break block135;
                                                                                catch (Exception v7) {
                                                                                    throw uq_1.a(v7);
                                                                                }
                                                                            }
                                                                            JOptionPane.showMessageDialog(this, "请输入目标地址!");
                                                                            ((JTextField)this.T).requestFocus();
                                                                            return;
                                                                        }
                                                                        catch (Exception v8) {
                                                                            throw uq_1.a(v8);
                                                                        }
                                                                    }
                                                                    v0 = ((JTextField)this.n).getText().trim().equals("");
                                                                }
                                                                if (var1_2 == null) ** GOTO lbl97
                                                                if (v0 == 0) break block115;
                                                                break block136;
                                                                catch (Exception v9) {
                                                                    throw uq_1.a(v9);
                                                                }
                                                            }
                                                            v0 = var2_1.equals("socks5");
                                                            if (var1_2 == null) ** GOTO lbl97
                                                            break block137;
                                                            catch (Exception v10) {
                                                                throw uq_1.a(v10);
                                                            }
                                                        }
                                                        try {
                                                            block138: {
                                                                if (v0 != 0) break block115;
                                                                break block138;
                                                                catch (Exception v11) {
                                                                    throw uq_1.a(v11);
                                                                }
                                                            }
                                                            JOptionPane.showMessageDialog(this, "请输入目标端口!");
                                                            ((JTextField)this.n).requestFocus();
                                                            return;
                                                        }
                                                        catch (Exception v12) {
                                                            throw uq_1.a(v12);
                                                        }
                                                    }
                                                    try {
                                                        v0 = Integer.parseInt(((JTextField)this.s).getText().trim());
lbl97:
                                                        // 3 sources

                                                        var3_3 = v0;
                                                    }
                                                    catch (Exception var5_5) {
                                                        JOptionPane.showMessageDialog(this, "请输入数字端口号!");
                                                        ((JTextField)this.s).requestFocus();
                                                        return;
                                                    }
                                                    try {
                                                        var4_4 = Integer.parseInt(((JTextField)this.n).getText().trim());
                                                    }
                                                    catch (Exception var5_6) {
                                                        try {
                                                            try {
                                                                v13 = var2_1.equals("socks5");
                                                                if (var1_2 == null) break block116;
                                                                if (v13) break block117;
                                                            }
                                                            catch (Exception v14) {
                                                                throw uq_1.a(v14);
                                                            }
                                                            JOptionPane.showMessageDialog(this, "请输入数字端口号!");
                                                            ((JTextField)this.n).requestFocus();
                                                            return;
                                                        }
                                                        catch (Exception v15) {
                                                            throw uq_1.a(v15);
                                                        }
                                                    }
                                                }
                                                v13 = var2_1.equals("socks5");
                                            }
                                            if (!v13) {
                                                // empty if block
                                            }
                                            var5_7 = 0;
                                            try {
                                                v16 = this.K;
                                                if (var1_2 == null) break block118;
                                                if (v16 != 0) {
                                                }
                                                ** GOTO lbl142
                                            }
                                            catch (Exception v17) {
                                                throw uq_1.a(v17);
                                            }
                                            try {
                                                v18 = (Integer)this.E.t();
                                            }
                                            catch (InvocationTargetException v19) {
                                                throw v19.getTargetException();
                                            }
                                            var5_7 = v18;
                                            try {
                                                if (var1_2 != null) break block119;
lbl142:
                                                // 2 sources

                                                v16 = Math.abs(((Random)this.F).nextInt());
                                            }
                                            catch (Exception v20) {
                                                throw uq_1.a(v20);
                                            }
                                        }
                                        var5_7 = v16;
                                    }
                                    try {
                                        block121: {
                                            try {
                                                try {
                                                    try {
                                                        this.J.Q(var5_7);
                                                    }
                                                    catch (InvocationTargetException v21) {
                                                        throw v21.getTargetException();
                                                    }
                                                    try {
                                                        this.J.Q(var5_7);
                                                    }
                                                    catch (InvocationTargetException v22) {
                                                        throw v22.getTargetException();
                                                    }
                                                    try {
                                                        this.J.y(((JTextField)this.L).getText().trim());
                                                    }
                                                    catch (InvocationTargetException v23) {
                                                        throw v23.getTargetException();
                                                    }
                                                    v24 = var2_1.equals("socks5");
                                                    if (var1_2 == null) break block120;
                                                    if (v24) {
                                                    }
                                                    break block121;
                                                }
                                                catch (Exception v25) {
                                                    throw uq_1.a(v25);
                                                }
                                                try {
                                                    this.J.t(YE.e);
                                                }
                                                catch (InvocationTargetException v26) {
                                                    throw v26.getTargetException();
                                                }
                                                if (var1_2 != null) break block122;
                                            }
                                            catch (Exception v27) {
                                                throw uq_1.a(v27);
                                            }
                                        }
                                        v24 = var2_1.equals("远程");
                                    }
                                    catch (Exception v28) {
                                        throw uq_1.a(v28);
                                    }
                                }
                                try {
                                    block124: {
                                        try {
                                            try {
                                                if (var1_2 == null) break block123;
                                                if (v24) {
                                                }
                                                break block124;
                                            }
                                            catch (Exception v29) {
                                                throw uq_1.a(v29);
                                            }
                                            try {
                                                this.J.t(YE.H);
                                            }
                                            catch (InvocationTargetException v30) {
                                                throw v30.getTargetException();
                                            }
                                            if (var1_2 != null) break block122;
                                        }
                                        catch (Exception v31) {
                                            throw uq_1.a(v31);
                                        }
                                    }
                                    v24 = var2_1.equals("本地");
                                }
                                catch (Exception v32) {
                                    throw uq_1.a(v32);
                                }
                            }
                            try {
                                try {
                                    if (var1_2 == null) break block125;
                                    if (v24) {
                                    }
                                    break block122;
                                }
                                catch (Exception v33) {
                                    throw uq_1.a(v33);
                                }
                                try {
                                    this.J.t(YE.A);
                                }
                                catch (InvocationTargetException v34) {
                                    throw v34.getTargetException();
                                }
                            }
                            catch (Exception v35) {
                                throw uq_1.a(v35);
                            }
                        }
                        try {
                            try {
                                this.J.F(var3_3);
                            }
                            catch (InvocationTargetException v36) {
                                throw v36.getTargetException();
                            }
                            try {
                                this.J.V(((JTextField)this.O).getText().trim());
                            }
                            catch (InvocationTargetException v37) {
                                throw v37.getTargetException();
                            }
                            try {
                                this.J.F(var3_3);
                            }
                            catch (InvocationTargetException v38) {
                                throw v38.getTargetException();
                            }
                            try {
                                this.J.T(((JTextField)this.T).getText().trim());
                            }
                            catch (InvocationTargetException v39) {
                                throw v39.getTargetException();
                            }
                            try {
                                this.J.C(var4_4);
                            }
                            catch (InvocationTargetException v40) {
                                throw v40.getTargetException();
                            }
                            v41 = this;
                            if (var1_2 == null) break block126;
                            v24 = v41.K;
                        }
                        catch (Exception v42) {
                            throw uq_1.a(v42);
                        }
                    }
                    try {
                        block127: {
                            try {
                                if (v24) break block127;
                                ((ArrayList)this.P).add((YE)this.J);
                                try {
                                    com.c.d(250081855046758848L).invoke(null, com.c.a(this.P));
                                }
                                catch (InvocationTargetException v43) {
                                    throw v43.getTargetException();
                                }
                                if (var1_2 != null) break block128;
                            }
                            catch (Exception v44) {
                                throw uq_1.a(v44);
                            }
                        }
                        v41 = this;
                    }
                    catch (Exception v45) {
                        throw uq_1.a(v45);
                    }
                }
                for (YE var7_9 : (ArrayList)v41.P) {
                    block130: {
                        try {
                            try {
                                try {
                                    try {
                                        v46 = (Integer)var7_9.t();
                                    }
                                    catch (InvocationTargetException v47) {
                                        throw v47.getTargetException();
                                    }
                                    if (var1_2 == null) break block129;
                                    if (var1_2 == null) break block130;
                                }
                                catch (Exception v48) {
                                    throw uq_1.a(v48);
                                }
                                if (v46 == var5_7) {
                                }
                                ** GOTO lbl324
                            }
                            catch (Exception v49) {
                                throw uq_1.a(v49);
                            }
                            ((ArrayList)this.P).remove(var7_9);
                        }
                        catch (Exception v50) {
                            throw uq_1.a(v50);
                        }
                    }
                    try {
                        if (var1_2 != null) break;
lbl324:
                        // 2 sources

                        if (var1_2 != null) continue;
                        break;
                    }
                    catch (Exception v51) {
                        throw uq_1.a(v51);
                    }
                }
                v46 = ((ArrayList)this.P).add((YE)this.J);
            }
            try {
                yt_1.G(this.P);
            }
            catch (InvocationTargetException v52) {
                throw v52.getTargetException();
            }
        }
        try {
            this.Y.o();
        }
        catch (InvocationTargetException v53) {
            throw v53.getTargetException();
        }
        try {
            v54 = (Integer)this.J.t();
        }
        catch (InvocationTargetException v55) {
            throw v55.getTargetException();
        }
        try {
            this.Y.e(v54);
        }
        catch (InvocationTargetException v56) {
            throw v56.getTargetException();
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
                        var13 = new String[41];
                        var11_1 = 0;
                        var10_2 = "'\u001c3\u00d5\u00eb\u009d\u0006\u00e4LK\u00df\u00e4\u00dc\u0005+\u00f7\u00c8\u00e8\u0087\u0005\u7614\u68ee\u572c\u57c1|\u0002\u8f24\u7ae6\u000b\u00d7\u00b5\u00aa= M\u00dd\u0006\u00ce)n\u0002\u8f9f\u7a4f\t\u00bb\u00ed\u00fa\\K~\u00e9\u00b3\u0002\u0011\u00af\tX7\u0095\u00d6\u0099\b\u000b\u0001\u00b1\u00d5\u00abW\u00cc\u007f_\u0004^\u00b5\u009eA\u001d\u0095\u00a6(\u00a9\u0099\u00bfoc\u00d1\u00c7\u0085\n\u0094\u00f0,7\u001f\u00e2S\u00a9\u00c8\n\u000bG\u000bP\n\u00a0\u0007\t\u0090\u00d1\u009f\u00db\u00e7\u008e|\u00ad\u00b0\u0002\u53d9\u6d98\u0011\u001b\u00ba\u00ccAE\u001a\u0083\u00d3Jz\u00db\u00b8\u00e6\u00b8g\u0082h\b\u8b04\u8f5c\u5141\u763f\u6813\u7a0b\u53e0\u00eb\u0005\u76af\u5459\u7a5c\u53daV\u000b5\u0016\u00f6I\u00ab\u00c3\u00ac\u00d7\u00e0\u0013\u00ab\n\u00cb-0U\t/\u00a7\u00874\u0011\u0005\u7e27\u5bdf\u00cb\u00f9\u00f2\u0004\u00e2Y\t\u00dc\u0006\u8b4d\u8f78\u5168\u5458\u79c1\u00b6\u0011\u00b8\u001c^s\u00c4\u00e7E\u0006K\u0089\u0099?\u00b6@\u00b4\u00c8w\t\u8bec\u8f9f\u515c\u65d9\u5be0\u7a9a\u53c4\u530f\u001e\no%\u00bd/\u00c2\u000f\u0081KE/\u0006\u00d1y\u00e9}\u00b4\u00ac\u000e\u007f\u001fu\u009e2Y\u001a\u00bf\u007f\\Px>\u008f\u0002\u6742\u577d\u000e\u0084]\n\u00d6\u00ddP\u00e7\u009e\u00c0x\u00a7\u00fc\u00c0\u001f\u0007\u7f56\u8f46\u9614\u9083\u0004T\u0002\u0004\u650f\u5ebd\u964d\u90fa\u0003\u7c1c\u57c3\u0000\b\u8b4e\u8ff7\u5108\u764a\u683a\u577a\u5766\u00e1\u0003\u549d\u79ae\u0088\b\u8bb2\u8f16\u5197\u7649\u54e2\u7a1d\u5390)\t\u8b6f\u8fc8\u512c\u6533\u5bee\u7ac7\u5305\u53a4&\n\u000eh\u0091\u0086G:1\u00edS\u00fb\u0006=6t\u0094\u0007\u0091\u0002\u786f\u5b61\u0011\u00de\u0003A\u001d\u00b4)\u00ca\u00b0w\u008c\u0010p\u0005\u0089\u001d\u00e9\u001a";
                        var12_3 = "'\u001c3\u00d5\u00eb\u009d\u0006\u00e4LK\u00df\u00e4\u00dc\u0005+\u00f7\u00c8\u00e8\u0087\u0005\u7614\u68ee\u572c\u57c1|\u0002\u8f24\u7ae6\u000b\u00d7\u00b5\u00aa= M\u00dd\u0006\u00ce)n\u0002\u8f9f\u7a4f\t\u00bb\u00ed\u00fa\\K~\u00e9\u00b3\u0002\u0011\u00af\tX7\u0095\u00d6\u0099\b\u000b\u0001\u00b1\u00d5\u00abW\u00cc\u007f_\u0004^\u00b5\u009eA\u001d\u0095\u00a6(\u00a9\u0099\u00bfoc\u00d1\u00c7\u0085\n\u0094\u00f0,7\u001f\u00e2S\u00a9\u00c8\n\u000bG\u000bP\n\u00a0\u0007\t\u0090\u00d1\u009f\u00db\u00e7\u008e|\u00ad\u00b0\u0002\u53d9\u6d98\u0011\u001b\u00ba\u00ccAE\u001a\u0083\u00d3Jz\u00db\u00b8\u00e6\u00b8g\u0082h\b\u8b04\u8f5c\u5141\u763f\u6813\u7a0b\u53e0\u00eb\u0005\u76af\u5459\u7a5c\u53daV\u000b5\u0016\u00f6I\u00ab\u00c3\u00ac\u00d7\u00e0\u0013\u00ab\n\u00cb-0U\t/\u00a7\u00874\u0011\u0005\u7e27\u5bdf\u00cb\u00f9\u00f2\u0004\u00e2Y\t\u00dc\u0006\u8b4d\u8f78\u5168\u5458\u79c1\u00b6\u0011\u00b8\u001c^s\u00c4\u00e7E\u0006K\u0089\u0099?\u00b6@\u00b4\u00c8w\t\u8bec\u8f9f\u515c\u65d9\u5be0\u7a9a\u53c4\u530f\u001e\no%\u00bd/\u00c2\u000f\u0081KE/\u0006\u00d1y\u00e9}\u00b4\u00ac\u000e\u007f\u001fu\u009e2Y\u001a\u00bf\u007f\\Px>\u008f\u0002\u6742\u577d\u000e\u0084]\n\u00d6\u00ddP\u00e7\u009e\u00c0x\u00a7\u00fc\u00c0\u001f\u0007\u7f56\u8f46\u9614\u9083\u0004T\u0002\u0004\u650f\u5ebd\u964d\u90fa\u0003\u7c1c\u57c3\u0000\b\u8b4e\u8ff7\u5108\u764a\u683a\u577a\u5766\u00e1\u0003\u549d\u79ae\u0088\b\u8bb2\u8f16\u5197\u7649\u54e2\u7a1d\u5390)\t\u8b6f\u8fc8\u512c\u6533\u5bee\u7ac7\u5305\u53a4&\n\u000eh\u0091\u0086G:1\u00edS\u00fb\u0006=6t\u0094\u0007\u0091\u0002\u786f\u5b61\u0011\u00de\u0003A\u001d\u00b4)\u00ca\u00b0w\u008c\u0010p\u0005\u0089\u001d\u00e9\u001a".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 77;
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
                            var10_2 = "\u7617\u68e0\u7adb\u53eb\u00ee\u0002\u6718\u5712";
                            var12_3 = "\u7617\u68e0\u7adb\u53eb\u00ee\u0002\u6718\u5712".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 13;
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
                                    v15 = 81;
                                    break;
                                }
                                case 2: {
                                    v15 = 11;
                                    break;
                                }
                                case 3: {
                                    v15 = 117;
                                    break;
                                }
                                case 4: {
                                    v15 = 112;
                                    break;
                                }
                                case 5: {
                                    v15 = 122;
                                    break;
                                }
                                default: {
                                    v15 = 108;
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
                uq_1.a = var13;
                uq_1.b = new String[41];
                var0_7 = 5682101892984789991L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "H\u00d5\u00ca\u00d7\u00ceV$m\u00aaX\u00d3%\u00c7\u00fb\u00eb\u0006";
                var5_11 = "H\u00d5\u00ca\u00d7\u00ceV$m\u00aaX\u00d3%\u00c7\u00fb\u00eb\u0006".length();
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
        uq_1.c = var6_8;
        uq_1.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFEF19) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 149;
                    break;
                }
                case 1: {
                    n14 = 188;
                    break;
                }
                case 2: {
                    n14 = 66;
                    break;
                }
                case 3: {
                    n14 = 99;
                    break;
                }
                case 4: {
                    n14 = 80;
                    break;
                }
                case 5: {
                    n14 = 134;
                    break;
                }
                case 6: {
                    n14 = 53;
                    break;
                }
                case 7: {
                    n14 = 198;
                    break;
                }
                case 8: {
                    n14 = 233;
                    break;
                }
                case 9: {
                    n14 = 109;
                    break;
                }
                case 10: {
                    n14 = 62;
                    break;
                }
                case 11: {
                    n14 = 91;
                    break;
                }
                case 12: {
                    n14 = 173;
                    break;
                }
                case 13: {
                    n14 = 207;
                    break;
                }
                case 14: {
                    n14 = 160;
                    break;
                }
                case 15: {
                    n14 = 201;
                    break;
                }
                case 16: {
                    n14 = 79;
                    break;
                }
                case 17: {
                    n14 = 177;
                    break;
                }
                case 18: {
                    n14 = 217;
                    break;
                }
                case 19: {
                    n14 = 6;
                    break;
                }
                case 20: {
                    n14 = 176;
                    break;
                }
                case 21: {
                    n14 = 51;
                    break;
                }
                case 22: {
                    n14 = 7;
                    break;
                }
                case 23: {
                    n14 = 42;
                    break;
                }
                case 24: {
                    n14 = 101;
                    break;
                }
                case 25: {
                    n14 = 228;
                    break;
                }
                case 26: {
                    n14 = 146;
                    break;
                }
                case 27: {
                    n14 = 235;
                    break;
                }
                case 28: {
                    n14 = 238;
                    break;
                }
                case 29: {
                    n14 = 3;
                    break;
                }
                case 30: {
                    n14 = 112;
                    break;
                }
                case 31: {
                    n14 = 152;
                    break;
                }
                case 32: {
                    n14 = 197;
                    break;
                }
                case 33: {
                    n14 = 21;
                    break;
                }
                case 34: {
                    n14 = 63;
                    break;
                }
                case 35: {
                    n14 = 221;
                    break;
                }
                case 36: {
                    n14 = 179;
                    break;
                }
                case 37: {
                    n14 = 14;
                    break;
                }
                case 38: {
                    n14 = 191;
                    break;
                }
                case 39: {
                    n14 = 187;
                    break;
                }
                case 40: {
                    n14 = 184;
                    break;
                }
                case 41: {
                    n14 = 145;
                    break;
                }
                case 42: {
                    n14 = 122;
                    break;
                }
                case 43: {
                    n14 = 128;
                    break;
                }
                case 44: {
                    n14 = 102;
                    break;
                }
                case 45: {
                    n14 = 229;
                    break;
                }
                case 46: {
                    n14 = 90;
                    break;
                }
                case 47: {
                    n14 = 206;
                    break;
                }
                case 48: {
                    n14 = 23;
                    break;
                }
                case 49: {
                    n14 = 84;
                    break;
                }
                case 50: {
                    n14 = 254;
                    break;
                }
                case 51: {
                    n14 = 30;
                    break;
                }
                case 52: {
                    n14 = 118;
                    break;
                }
                case 53: {
                    n14 = 154;
                    break;
                }
                case 54: {
                    n14 = 11;
                    break;
                }
                case 55: {
                    n14 = 67;
                    break;
                }
                case 56: {
                    n14 = 226;
                    break;
                }
                case 57: {
                    n14 = 38;
                    break;
                }
                case 58: {
                    n14 = 165;
                    break;
                }
                case 59: {
                    n14 = 147;
                    break;
                }
                case 60: {
                    n14 = 28;
                    break;
                }
                case 61: {
                    n14 = 139;
                    break;
                }
                case 62: {
                    n14 = 171;
                    break;
                }
                case 63: {
                    n14 = 223;
                    break;
                }
                case 64: {
                    n14 = 164;
                    break;
                }
                case 65: {
                    n14 = 231;
                    break;
                }
                case 66: {
                    n14 = 192;
                    break;
                }
                case 67: {
                    n14 = 1;
                    break;
                }
                case 68: {
                    n14 = 36;
                    break;
                }
                case 69: {
                    n14 = 58;
                    break;
                }
                case 70: {
                    n14 = 141;
                    break;
                }
                case 71: {
                    n14 = 20;
                    break;
                }
                case 72: {
                    n14 = 249;
                    break;
                }
                case 73: {
                    n14 = 202;
                    break;
                }
                case 74: {
                    n14 = 82;
                    break;
                }
                case 75: {
                    n14 = 126;
                    break;
                }
                case 76: {
                    n14 = 136;
                    break;
                }
                case 77: {
                    n14 = 92;
                    break;
                }
                case 78: {
                    n14 = 116;
                    break;
                }
                case 79: {
                    n14 = 224;
                    break;
                }
                case 80: {
                    n14 = 166;
                    break;
                }
                case 81: {
                    n14 = 50;
                    break;
                }
                case 82: {
                    n14 = 10;
                    break;
                }
                case 83: {
                    n14 = 130;
                    break;
                }
                case 84: {
                    n14 = 19;
                    break;
                }
                case 85: {
                    n14 = 244;
                    break;
                }
                case 86: {
                    n14 = 220;
                    break;
                }
                case 87: {
                    n14 = 83;
                    break;
                }
                case 88: {
                    n14 = 43;
                    break;
                }
                case 89: {
                    n14 = 142;
                    break;
                }
                case 90: {
                    n14 = 236;
                    break;
                }
                case 91: {
                    n14 = 107;
                    break;
                }
                case 92: {
                    n14 = 143;
                    break;
                }
                case 93: {
                    n14 = 88;
                    break;
                }
                case 94: {
                    n14 = 120;
                    break;
                }
                case 95: {
                    n14 = 18;
                    break;
                }
                case 96: {
                    n14 = 52;
                    break;
                }
                case 97: {
                    n14 = 44;
                    break;
                }
                case 98: {
                    n14 = 190;
                    break;
                }
                case 99: {
                    n14 = 39;
                    break;
                }
                case 100: {
                    n14 = 85;
                    break;
                }
                case 101: {
                    n14 = 34;
                    break;
                }
                case 102: {
                    n14 = 89;
                    break;
                }
                case 103: {
                    n14 = 232;
                    break;
                }
                case 104: {
                    n14 = 96;
                    break;
                }
                case 105: {
                    n14 = 140;
                    break;
                }
                case 106: {
                    n14 = 167;
                    break;
                }
                case 107: {
                    n14 = 158;
                    break;
                }
                case 108: {
                    n14 = 213;
                    break;
                }
                case 109: {
                    n14 = 237;
                    break;
                }
                case 110: {
                    n14 = 148;
                    break;
                }
                case 111: {
                    n14 = 77;
                    break;
                }
                case 112: {
                    n14 = 8;
                    break;
                }
                case 113: {
                    n14 = 161;
                    break;
                }
                case 114: {
                    n14 = 61;
                    break;
                }
                case 115: {
                    n14 = 127;
                    break;
                }
                case 116: {
                    n14 = 214;
                    break;
                }
                case 117: {
                    n14 = 133;
                    break;
                }
                case 118: {
                    n14 = 129;
                    break;
                }
                case 119: {
                    n14 = 162;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 115;
                    break;
                }
                case 122: {
                    n14 = 65;
                    break;
                }
                case 123: {
                    n14 = 2;
                    break;
                }
                case 124: {
                    n14 = 135;
                    break;
                }
                case 125: {
                    n14 = 131;
                    break;
                }
                case 126: {
                    n14 = 70;
                    break;
                }
                case 127: {
                    n14 = 9;
                    break;
                }
                case 128: {
                    n14 = 247;
                    break;
                }
                case 129: {
                    n14 = 151;
                    break;
                }
                case 130: {
                    n14 = 17;
                    break;
                }
                case 131: {
                    n14 = 74;
                    break;
                }
                case 132: {
                    n14 = 86;
                    break;
                }
                case 133: {
                    n14 = 60;
                    break;
                }
                case 134: {
                    n14 = 4;
                    break;
                }
                case 135: {
                    n14 = 98;
                    break;
                }
                case 136: {
                    n14 = 29;
                    break;
                }
                case 137: {
                    n14 = 37;
                    break;
                }
                case 138: {
                    n14 = 46;
                    break;
                }
                case 139: {
                    n14 = 114;
                    break;
                }
                case 140: {
                    n14 = 104;
                    break;
                }
                case 141: {
                    n14 = 76;
                    break;
                }
                case 142: {
                    n14 = 205;
                    break;
                }
                case 143: {
                    n14 = 75;
                    break;
                }
                case 144: {
                    n14 = 78;
                    break;
                }
                case 145: {
                    n14 = 106;
                    break;
                }
                case 146: {
                    n14 = 182;
                    break;
                }
                case 147: {
                    n14 = 195;
                    break;
                }
                case 148: {
                    n14 = 218;
                    break;
                }
                case 149: {
                    n14 = 211;
                    break;
                }
                case 150: {
                    n14 = 117;
                    break;
                }
                case 151: {
                    n14 = 189;
                    break;
                }
                case 152: {
                    n14 = 93;
                    break;
                }
                case 153: {
                    n14 = 219;
                    break;
                }
                case 154: {
                    n14 = 105;
                    break;
                }
                case 155: {
                    n14 = 163;
                    break;
                }
                case 156: {
                    n14 = 103;
                    break;
                }
                case 157: {
                    n14 = 5;
                    break;
                }
                case 158: {
                    n14 = 13;
                    break;
                }
                case 159: {
                    n14 = 253;
                    break;
                }
                case 160: {
                    n14 = 246;
                    break;
                }
                case 161: {
                    n14 = 125;
                    break;
                }
                case 162: {
                    n14 = 252;
                    break;
                }
                case 163: {
                    n14 = 16;
                    break;
                }
                case 164: {
                    n14 = 108;
                    break;
                }
                case 165: {
                    n14 = 55;
                    break;
                }
                case 166: {
                    n14 = 27;
                    break;
                }
                case 167: {
                    n14 = 71;
                    break;
                }
                case 168: {
                    n14 = 216;
                    break;
                }
                case 169: {
                    n14 = 49;
                    break;
                }
                case 170: {
                    n14 = 208;
                    break;
                }
                case 171: {
                    n14 = 100;
                    break;
                }
                case 172: {
                    n14 = 111;
                    break;
                }
                case 173: {
                    n14 = 33;
                    break;
                }
                case 174: {
                    n14 = 185;
                    break;
                }
                case 175: {
                    n14 = 87;
                    break;
                }
                case 176: {
                    n14 = 186;
                    break;
                }
                case 177: {
                    n14 = 222;
                    break;
                }
                case 178: {
                    n14 = 25;
                    break;
                }
                case 179: {
                    n14 = 113;
                    break;
                }
                case 180: {
                    n14 = 248;
                    break;
                }
                case 181: {
                    n14 = 137;
                    break;
                }
                case 182: {
                    n14 = 243;
                    break;
                }
                case 183: {
                    n14 = 212;
                    break;
                }
                case 184: {
                    n14 = 156;
                    break;
                }
                case 185: {
                    n14 = 230;
                    break;
                }
                case 186: {
                    n14 = 26;
                    break;
                }
                case 187: {
                    n14 = 95;
                    break;
                }
                case 188: {
                    n14 = 174;
                    break;
                }
                case 189: {
                    n14 = 241;
                    break;
                }
                case 190: {
                    n14 = 178;
                    break;
                }
                case 191: {
                    n14 = 204;
                    break;
                }
                case 192: {
                    n14 = 121;
                    break;
                }
                case 193: {
                    n14 = 54;
                    break;
                }
                case 194: {
                    n14 = 119;
                    break;
                }
                case 195: {
                    n14 = 32;
                    break;
                }
                case 196: {
                    n14 = 203;
                    break;
                }
                case 197: {
                    n14 = 144;
                    break;
                }
                case 198: {
                    n14 = 132;
                    break;
                }
                case 199: {
                    n14 = 245;
                    break;
                }
                case 200: {
                    n14 = 155;
                    break;
                }
                case 201: {
                    n14 = 81;
                    break;
                }
                case 202: {
                    n14 = 196;
                    break;
                }
                case 203: {
                    n14 = 40;
                    break;
                }
                case 204: {
                    n14 = 59;
                    break;
                }
                case 205: {
                    n14 = 193;
                    break;
                }
                case 206: {
                    n14 = 138;
                    break;
                }
                case 207: {
                    n14 = 12;
                    break;
                }
                case 208: {
                    n14 = 57;
                    break;
                }
                case 209: {
                    n14 = 31;
                    break;
                }
                case 210: {
                    n14 = 41;
                    break;
                }
                case 211: {
                    n14 = 124;
                    break;
                }
                case 212: {
                    n14 = 251;
                    break;
                }
                case 213: {
                    n14 = 172;
                    break;
                }
                case 214: {
                    n14 = 227;
                    break;
                }
                case 215: {
                    n14 = 69;
                    break;
                }
                case 216: {
                    n14 = 68;
                    break;
                }
                case 217: {
                    n14 = 0;
                    break;
                }
                case 218: {
                    n14 = 94;
                    break;
                }
                case 219: {
                    n14 = 239;
                    break;
                }
                case 220: {
                    n14 = 48;
                    break;
                }
                case 221: {
                    n14 = 22;
                    break;
                }
                case 222: {
                    n14 = 73;
                    break;
                }
                case 223: {
                    n14 = 170;
                    break;
                }
                case 224: {
                    n14 = 157;
                    break;
                }
                case 225: {
                    n14 = 159;
                    break;
                }
                case 226: {
                    n14 = 200;
                    break;
                }
                case 227: {
                    n14 = 242;
                    break;
                }
                case 228: {
                    n14 = 97;
                    break;
                }
                case 229: {
                    n14 = 110;
                    break;
                }
                case 230: {
                    n14 = 15;
                    break;
                }
                case 231: {
                    n14 = 45;
                    break;
                }
                case 232: {
                    n14 = 183;
                    break;
                }
                case 233: {
                    n14 = 180;
                    break;
                }
                case 234: {
                    n14 = 72;
                    break;
                }
                case 235: {
                    n14 = 24;
                    break;
                }
                case 236: {
                    n14 = 153;
                    break;
                }
                case 237: {
                    n14 = 240;
                    break;
                }
                case 238: {
                    n14 = 64;
                    break;
                }
                case 239: {
                    n14 = 234;
                    break;
                }
                case 240: {
                    n14 = 169;
                    break;
                }
                case 241: {
                    n14 = 181;
                    break;
                }
                case 242: {
                    n14 = 194;
                    break;
                }
                case 243: {
                    n14 = 35;
                    break;
                }
                case 244: {
                    n14 = 199;
                    break;
                }
                case 245: {
                    n14 = 56;
                    break;
                }
                case 246: {
                    n14 = 168;
                    break;
                }
                case 247: {
                    n14 = 255;
                    break;
                }
                case 248: {
                    n14 = 123;
                    break;
                }
                case 249: {
                    n14 = 225;
                    break;
                }
                case 250: {
                    n14 = 175;
                    break;
                }
                case 251: {
                    n14 = 150;
                    break;
                }
                case 252: {
                    n14 = 215;
                    break;
                }
                case 253: {
                    n14 = 209;
                    break;
                }
                case 254: {
                    n14 = 47;
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
            uq_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x69C7;
        if (d[n11] == null) {
            uq_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

