/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from av
 */
public class av_0
extends JDialog {
    JPasswordField f;
    JPasswordField m;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public av_0(FP fP2) {
        super(fP2);
        String string = "设置同步密码";
        this.setTitle(string);
        this.setLayout(new MigLayout("insets 20 20 0 20,align center", "[]0[]", "[][][][]20[][]20[]"));
        String string2 = new String("width 160::");
        JLabel jLabel = new JLabel("该操作用于首次同步初始化或重置密码.");
        jLabel.setForeground(new Color(av_0.a(17608, 7658664735749544881L), 0, 0));
        this.add((Component)jLabel, "wrap");
        JLabel jLabel2 = new JLabel("如果新密码和旧密码不同,会清空同步服务器上的数据,并将本机数据重新上传.");
        jLabel2.setForeground(new Color(av_0.a(16769, 7979105738886553339L), 0, 0));
        this.add((Component)jLabel2, "wrap");
        JLabel jLabel3 = new JLabel("其他设备需要输入同样密码才可继续同步.");
        jLabel3.setForeground(new Color(av_0.a(16769, 7979105738886553339L), 0, 0));
        this.add((Component)jLabel3, "wrap");
        this.add((Component)new JLabel("密码必须包含大小写字母,数字,长度至少8位,建议12位以上,并且包含特殊字符."), "wrap");
        this.add((Component)new JLabel("同步密码请妥善保存,丢失无法找回,只能重新设置."), "wrap");
        JPanel jPanel = new JPanel(new MigLayout("insets 0 0 0 0"));
        this.add((Component)jPanel, "align center,wrap");
        jPanel.add((Component)new JLabel("同步密码"), "width 80::");
        this.f = new JPasswordField();
        try {
            YJ.o(this.f);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel.add((Component)((JPasswordField)this.f), string2);
        JPanel jPanel2 = new JPanel(new MigLayout("insets 0 0 0 0"));
        jPanel2.add((Component)new JLabel("重复输入确认"), "width 80::");
        this.add((Component)jPanel2, "align center,wrap");
        int n10 = z2.c();
        this.m = new JPasswordField();
        try {
            YJ.o(this.m);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPanel2.add((Component)((JPasswordField)this.m), string2);
        JPanel jPanel3 = new JPanel(new MigLayout("insets 0 0 0 0"));
        this.add((Component)jPanel3, "align center,wrap");
        JButton jButton = new JButton("确定");
        jButton.setFocusable(false);
        int n11 = n10;
        jPanel3.add((Component)jButton, "height 25::,width :55:");
        jButton.addActionListener(new vx_0(this));
        JButton jButton2 = new JButton("取消");
        jButton2.setFocusable(false);
        jPanel3.add((Component)jButton2, "height 25::,width :55:");
        jButton2.addActionListener(new bm_0(this));
        this.pack();
        this.setLocationRelativeTo(null);
        if (ky_2.F() != null) {
            z2.B(++n11);
        }
    }

    void J() {
        ((JPasswordField)this.f).setText("");
        ((JPasswordField)this.m).setText("");
    }

    void Q() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        int n10;
        String string;
        block19: {
            int n11;
            block22: {
                String string2;
                block23: {
                    block20: {
                        block21: {
                            string = new String(((JPasswordField)this.f).getPassword());
                            n10 = z2.c();
                            string2 = new String(((JPasswordField)this.m).getPassword());
                            if (n10 != 0) break block20;
                            if (string.length() < av_0.a(2389, 7498614023425906222L)) break block21;
                            n11 = string2.length();
                            if (n10 != 0) break block22;
                            if (n11 >= av_0.a(3783, 7118769469375435199L)) break block23;
                        }
                        JOptionPane.showMessageDialog(this, "长度至少8位");
                    }
                    return;
                }
                n11 = string.equals(string2) ? 1 : 0;
            }
            if (n11 == 0) {
                JOptionPane.showMessageDialog(this, "输入密码不一致");
                return;
            }
            char[] cArray = ((JPasswordField)this.f).getPassword();
            boolean bl4 = false;
            bl3 = false;
            bl2 = false;
            for (char c2 : cArray) {
                bl = Character.isLowerCase(c2);
                if (n10 == 0) {
                    boolean bl5;
                    if (n10 == 0) {
                        if (bl) {
                            bl3 = true;
                        }
                        bl5 = Character.isUpperCase(c2);
                    }
                    if (n10 == 0) {
                        if (bl5) {
                            bl4 = true;
                        }
                        bl5 = Character.isDigit(c2);
                    }
                    if (n10 == 0) {
                        if (!bl5) continue;
                        bl5 = true;
                    }
                    bl2 = bl5;
                    if (n10 == 0) continue;
                }
                break block19;
            }
            bl = bl4;
        }
        if (n10 == 0) {
            if (!bl) {
                JOptionPane.showMessageDialog(this, "必须包含大写字母");
                return;
            }
            bl = bl3;
        }
        if (n10 == 0) {
            if (!bl) {
                JOptionPane.showMessageDialog(this, "必须包含小写字母");
                return;
            }
            bl = bl2;
        }
        if (!bl) {
            JOptionPane.showMessageDialog(this, "必须包含数字");
            return;
        }
        try {
            this.F(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Loose catch block
     */
    void F(String string) {
        ln_0 ln_02;
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ln_02 = (ln_0)object.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ln_0 ln_03 = ln_02;
        int n10 = z2.w();
        try {
            byte[] byArray;
            block37: {
                ln_0 ln_04;
                block36: {
                    Object object2;
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        ln_04 = (ln_0)object2.Q();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n10 == 0) break block36;
                    try {
                        Object object3;
                        block39: {
                            boolean bl;
                            try {
                                bl = (Boolean)ln_04.E();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (bl) break block37;
                            break block39;
                            catch (Exception exception) {
                                throw av_0.a(exception);
                            }
                        }
                        try {
                            object3 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            ln_04 = (ln_0)object3.Q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        throw av_0.a(exception);
                    }
                }
                try {
                    ln_04.F(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                byArray = (byte[])le_2.d(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            byte[] byArray2 = byArray;
            try {
                try {
                    ln_03.C((Object)byArray2, true, true, true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    le_2.S(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                JOptionPane.showMessageDialog(this, "设置成功");
                try {
                    this.setVisible(false);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    ln_03.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "设置失败" + exception);
            }
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "设置失败" + exception);
        }
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        ((JPasswordField)this.f).requestFocus();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[32];
                        var11_1 = 0;
                        var10_2 = "\u8b07\u7fe7\u6285\u52de\u000eC(C\u00ddp/\u00c5\u00d2\u00cd@\u00a3\u007f^\u00f8\u0002\u78cc\u5bdd\u0012}\u00e8\u00d8\u00a8\u0001\u0090Z\u00a38\u00ae6\u00cf\u0083Ch\u00df>\u008e\u0004\u00cb\u00f5\u009d\u00ec$\u593a\u675b\u6539\u5bbc\u78f1\u542b\u65e9\u5ba4\u7856\u4e9b\u54f9\u0082\u4f86\u6eed\u7ae9\u5465\u6b71\u6732\u5237\u56ac\u4e68\u766e\u6547\u63ab\u00a4\u5ed1\u5c15\u67bf\u6744\u655f\u6387\u9146\u6592\u4e98\u4fc5l\n\u00e0\u0007\u00fd\u00ceN-\u0085\u00ab\u00c4e\u0004\u54e4\u6b04\u5bcb\u7856'\u5b04\u7882\u5f47\u9814\u53e1\u5493\u59af\u5c29\u51de\u5b80\u6ba2\u00f0\u657e\u5bf1\u0087\u958d\u5ee3\u81cc\u5c6e\u0002\u4fa2I\u5e3b\u8b32\u00ed~\u4fc9\u4e4f\u4ecd\u00ed\u5e98\u4e1e\u53df\u5450\u7236\u6bd4\u5bb6\u7b7b[\n\u00aed4\u00a2w\u00a0\u00a2\u001a S\u0016\u00b88\u0007\u00b7\u00bd'\u00e36\u001c\u00944\u00b2\u00a2\u0087\u00b3\u00b1\u00ea\u00f2sa7\u009f\u0006\u8be6\u7f94\u54a5\u6b4a\u5b8e\u78af\u0013\u51f8\u4e11\u8b05\u5937\u97b8\u89ae\u8f95\u511b\u542e\u6881\u5b90\u7891\u626f\u53ed\u7ef4\u7e33\u5495\u6b4d`\u0012\u8b85\u642c\u4fa9\u75c7\u4e1d\u996d\u6bcc\u54ff\u6b88\u5273\u590d\u53b7\u622b\u91fe\u7fc5\u5b1c\u7806\u00ad\u0011\u00a3\u009bL\u00eb\u00d2\u00f8\u008bDa)\u00f4\u00dcU\u00c1k\u00b1=\u0005\u0091b.\u00ff\u00df\b\u5f2e\u98c6\u53a1\u54f9\u59c7\u51c6\u5b7d\u6ba5\u000eD\u0097\u00a3*l\u00d1F\r\u00bd\u00bb\u00ad\u0000\u009f\u0017\b\u5f55\u981d\u53ce\u5482\u5c02\u51a9\u5be8\u6b48\u0004\u00efj\u0019\u001f\u0002\u53f7\u6d06\u0007\u8fef\u5162\u5bc6\u789a\u4eba\u4e5c\u811e\u0018\u545a\u6bc1\u5b1c\u78ee\u8b1b\u5977\u55ff\u4f38\u5bc2Q\u4e37\u59c3\u654e\u6cab\u6251\u56b5\u00ab\u5347\u8050\u91bc\u65e9\u8b47\u7f84\u00b3\u0006\u95b6\u5e44\u81a9\u5cf5\u00f1\u4fee\u0006\u919f\u59ce\u8f08\u510e\u78ff\u8b82\u000b2v\u00a7\u00e0\u0005\u00e8\u00e5\u0015\u00eatO\u0005\u8b56\u7f5b\u598e\u8df3\u00bd\u0016\u00d9\u00f7+N8\u0018S\u00d1\nh\u00f6-\u00fat\u00b8\u00cf\u008b=_\u0098\u00b2\u00a0\u0005\u8beb\u7fa9\u5939\u8dadK\u001e$L\u00afQ\u00ed\u00bev\u00e2\u00ab\u0014o\u00e7\u0097\u00eb\u00ec\b\u0095G\u0094\u0003\u00a7\u00fc\u00af(+5*\n\u0099\u00b8";
                        var12_3 = "\u8b07\u7fe7\u6285\u52de\u000eC(C\u00ddp/\u00c5\u00d2\u00cd@\u00a3\u007f^\u00f8\u0002\u78cc\u5bdd\u0012}\u00e8\u00d8\u00a8\u0001\u0090Z\u00a38\u00ae6\u00cf\u0083Ch\u00df>\u008e\u0004\u00cb\u00f5\u009d\u00ec$\u593a\u675b\u6539\u5bbc\u78f1\u542b\u65e9\u5ba4\u7856\u4e9b\u54f9\u0082\u4f86\u6eed\u7ae9\u5465\u6b71\u6732\u5237\u56ac\u4e68\u766e\u6547\u63ab\u00a4\u5ed1\u5c15\u67bf\u6744\u655f\u6387\u9146\u6592\u4e98\u4fc5l\n\u00e0\u0007\u00fd\u00ceN-\u0085\u00ab\u00c4e\u0004\u54e4\u6b04\u5bcb\u7856'\u5b04\u7882\u5f47\u9814\u53e1\u5493\u59af\u5c29\u51de\u5b80\u6ba2\u00f0\u657e\u5bf1\u0087\u958d\u5ee3\u81cc\u5c6e\u0002\u4fa2I\u5e3b\u8b32\u00ed~\u4fc9\u4e4f\u4ecd\u00ed\u5e98\u4e1e\u53df\u5450\u7236\u6bd4\u5bb6\u7b7b[\n\u00aed4\u00a2w\u00a0\u00a2\u001a S\u0016\u00b88\u0007\u00b7\u00bd'\u00e36\u001c\u00944\u00b2\u00a2\u0087\u00b3\u00b1\u00ea\u00f2sa7\u009f\u0006\u8be6\u7f94\u54a5\u6b4a\u5b8e\u78af\u0013\u51f8\u4e11\u8b05\u5937\u97b8\u89ae\u8f95\u511b\u542e\u6881\u5b90\u7891\u626f\u53ed\u7ef4\u7e33\u5495\u6b4d`\u0012\u8b85\u642c\u4fa9\u75c7\u4e1d\u996d\u6bcc\u54ff\u6b88\u5273\u590d\u53b7\u622b\u91fe\u7fc5\u5b1c\u7806\u00ad\u0011\u00a3\u009bL\u00eb\u00d2\u00f8\u008bDa)\u00f4\u00dcU\u00c1k\u00b1=\u0005\u0091b.\u00ff\u00df\b\u5f2e\u98c6\u53a1\u54f9\u59c7\u51c6\u5b7d\u6ba5\u000eD\u0097\u00a3*l\u00d1F\r\u00bd\u00bb\u00ad\u0000\u009f\u0017\b\u5f55\u981d\u53ce\u5482\u5c02\u51a9\u5be8\u6b48\u0004\u00efj\u0019\u001f\u0002\u53f7\u6d06\u0007\u8fef\u5162\u5bc6\u789a\u4eba\u4e5c\u811e\u0018\u545a\u6bc1\u5b1c\u78ee\u8b1b\u5977\u55ff\u4f38\u5bc2Q\u4e37\u59c3\u654e\u6cab\u6251\u56b5\u00ab\u5347\u8050\u91bc\u65e9\u8b47\u7f84\u00b3\u0006\u95b6\u5e44\u81a9\u5cf5\u00f1\u4fee\u0006\u919f\u59ce\u8f08\u510e\u78ff\u8b82\u000b2v\u00a7\u00e0\u0005\u00e8\u00e5\u0015\u00eatO\u0005\u8b56\u7f5b\u598e\u8df3\u00bd\u0016\u00d9\u00f7+N8\u0018S\u00d1\nh\u00f6-\u00fat\u00b8\u00cf\u008b=_\u0098\u00b2\u00a0\u0005\u8beb\u7fa9\u5939\u8dadK\u001e$L\u00afQ\u00ed\u00bev\u00e2\u00ab\u0014o\u00e7\u0097\u00eb\u00ec\b\u0095G\u0094\u0003\u00a7\u00fc\u00af(+5*\n\u0099\u00b8".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 75;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
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
                            var10_2 = "B\u00ff\u00f8\u00ef\u00cc\u00f0\u00c0\u00cd\u0080\u0090@cK\u00be \u00d6\u00dc\u0006\u5f2e\u983c\u5329\u542e\u6509\u5b7a";
                            var12_3 = "B\u00ff\u00f8\u00ef\u00cc\u00f0\u00c0\u00cd\u0080\u0090@cK\u00be \u00d6\u00dc\u0006\u5f2e\u983c\u5329\u542e\u6509\u5b7a".length();
                            var9_4 = 17;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 102;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
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
                                    v15 = 113;
                                    break;
                                }
                                case 1: {
                                    v15 = 112;
                                    break;
                                }
                                case 2: {
                                    v15 = 16;
                                    break;
                                }
                                case 3: {
                                    v15 = 50;
                                    break;
                                }
                                case 4: {
                                    v15 = 81;
                                    break;
                                }
                                case 5: {
                                    v15 = 74;
                                    break;
                                }
                                default: {
                                    v15 = 25;
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
                av_0.a = var13;
                av_0.b = new String[32];
                var0_7 = 1331640820791812469L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u00e8\u0088E>\u00ff\u00b0p\u00c20)\u0082\u00d6\u009f\u009d:\u0018";
                var5_11 = "\u00e8\u0088E>\u00ff\u00b0p\u00c20)\u0082\u00d6\u009f\u009d:\u0018".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "}\u00b8=\u00f3\u009c)\u00bfR\u00e4*v}\u00fd\u00a4\u00f7S";
                    var5_11 = "}\u00b8=\u00f3\u009c)\u00bfR\u00e4*v}\u00fd\u00a4\u00f7S".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        av_0.c = var6_8;
        av_0.d = new Integer[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1057) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 154;
                    break;
                }
                case 1: {
                    n14 = 146;
                    break;
                }
                case 2: {
                    n14 = 54;
                    break;
                }
                case 3: {
                    n14 = 20;
                    break;
                }
                case 4: {
                    n14 = 245;
                    break;
                }
                case 5: {
                    n14 = 171;
                    break;
                }
                case 6: {
                    n14 = 118;
                    break;
                }
                case 7: {
                    n14 = 188;
                    break;
                }
                case 8: {
                    n14 = 239;
                    break;
                }
                case 9: {
                    n14 = 160;
                    break;
                }
                case 10: {
                    n14 = 15;
                    break;
                }
                case 11: {
                    n14 = 31;
                    break;
                }
                case 12: {
                    n14 = 46;
                    break;
                }
                case 13: {
                    n14 = 133;
                    break;
                }
                case 14: {
                    n14 = 12;
                    break;
                }
                case 15: {
                    n14 = 115;
                    break;
                }
                case 16: {
                    n14 = 44;
                    break;
                }
                case 17: {
                    n14 = 74;
                    break;
                }
                case 18: {
                    n14 = 85;
                    break;
                }
                case 19: {
                    n14 = 43;
                    break;
                }
                case 20: {
                    n14 = 65;
                    break;
                }
                case 21: {
                    n14 = 100;
                    break;
                }
                case 22: {
                    n14 = 19;
                    break;
                }
                case 23: {
                    n14 = 201;
                    break;
                }
                case 24: {
                    n14 = 151;
                    break;
                }
                case 25: {
                    n14 = 192;
                    break;
                }
                case 26: {
                    n14 = 59;
                    break;
                }
                case 27: {
                    n14 = 159;
                    break;
                }
                case 28: {
                    n14 = 137;
                    break;
                }
                case 29: {
                    n14 = 10;
                    break;
                }
                case 30: {
                    n14 = 37;
                    break;
                }
                case 31: {
                    n14 = 255;
                    break;
                }
                case 32: {
                    n14 = 62;
                    break;
                }
                case 33: {
                    n14 = 47;
                    break;
                }
                case 34: {
                    n14 = 198;
                    break;
                }
                case 35: {
                    n14 = 216;
                    break;
                }
                case 36: {
                    n14 = 140;
                    break;
                }
                case 37: {
                    n14 = 127;
                    break;
                }
                case 38: {
                    n14 = 204;
                    break;
                }
                case 39: {
                    n14 = 2;
                    break;
                }
                case 40: {
                    n14 = 211;
                    break;
                }
                case 41: {
                    n14 = 248;
                    break;
                }
                case 42: {
                    n14 = 158;
                    break;
                }
                case 43: {
                    n14 = 144;
                    break;
                }
                case 44: {
                    n14 = 208;
                    break;
                }
                case 45: {
                    n14 = 194;
                    break;
                }
                case 46: {
                    n14 = 28;
                    break;
                }
                case 47: {
                    n14 = 121;
                    break;
                }
                case 48: {
                    n14 = 162;
                    break;
                }
                case 49: {
                    n14 = 174;
                    break;
                }
                case 50: {
                    n14 = 91;
                    break;
                }
                case 51: {
                    n14 = 167;
                    break;
                }
                case 52: {
                    n14 = 186;
                    break;
                }
                case 53: {
                    n14 = 114;
                    break;
                }
                case 54: {
                    n14 = 24;
                    break;
                }
                case 55: {
                    n14 = 61;
                    break;
                }
                case 56: {
                    n14 = 110;
                    break;
                }
                case 57: {
                    n14 = 80;
                    break;
                }
                case 58: {
                    n14 = 36;
                    break;
                }
                case 59: {
                    n14 = 99;
                    break;
                }
                case 60: {
                    n14 = 181;
                    break;
                }
                case 61: {
                    n14 = 141;
                    break;
                }
                case 62: {
                    n14 = 213;
                    break;
                }
                case 63: {
                    n14 = 153;
                    break;
                }
                case 64: {
                    n14 = 132;
                    break;
                }
                case 65: {
                    n14 = 75;
                    break;
                }
                case 66: {
                    n14 = 7;
                    break;
                }
                case 67: {
                    n14 = 60;
                    break;
                }
                case 68: {
                    n14 = 250;
                    break;
                }
                case 69: {
                    n14 = 102;
                    break;
                }
                case 70: {
                    n14 = 200;
                    break;
                }
                case 71: {
                    n14 = 71;
                    break;
                }
                case 72: {
                    n14 = 134;
                    break;
                }
                case 73: {
                    n14 = 34;
                    break;
                }
                case 74: {
                    n14 = 217;
                    break;
                }
                case 75: {
                    n14 = 58;
                    break;
                }
                case 76: {
                    n14 = 235;
                    break;
                }
                case 77: {
                    n14 = 119;
                    break;
                }
                case 78: {
                    n14 = 48;
                    break;
                }
                case 79: {
                    n14 = 251;
                    break;
                }
                case 80: {
                    n14 = 83;
                    break;
                }
                case 81: {
                    n14 = 223;
                    break;
                }
                case 82: {
                    n14 = 1;
                    break;
                }
                case 83: {
                    n14 = 252;
                    break;
                }
                case 84: {
                    n14 = 215;
                    break;
                }
                case 85: {
                    n14 = 49;
                    break;
                }
                case 86: {
                    n14 = 22;
                    break;
                }
                case 87: {
                    n14 = 57;
                    break;
                }
                case 88: {
                    n14 = 234;
                    break;
                }
                case 89: {
                    n14 = 116;
                    break;
                }
                case 90: {
                    n14 = 111;
                    break;
                }
                case 91: {
                    n14 = 33;
                    break;
                }
                case 92: {
                    n14 = 23;
                    break;
                }
                case 93: {
                    n14 = 238;
                    break;
                }
                case 94: {
                    n14 = 164;
                    break;
                }
                case 95: {
                    n14 = 143;
                    break;
                }
                case 96: {
                    n14 = 230;
                    break;
                }
                case 97: {
                    n14 = 195;
                    break;
                }
                case 98: {
                    n14 = 98;
                    break;
                }
                case 99: {
                    n14 = 232;
                    break;
                }
                case 100: {
                    n14 = 180;
                    break;
                }
                case 101: {
                    n14 = 148;
                    break;
                }
                case 102: {
                    n14 = 18;
                    break;
                }
                case 103: {
                    n14 = 97;
                    break;
                }
                case 104: {
                    n14 = 177;
                    break;
                }
                case 105: {
                    n14 = 92;
                    break;
                }
                case 106: {
                    n14 = 185;
                    break;
                }
                case 107: {
                    n14 = 112;
                    break;
                }
                case 108: {
                    n14 = 179;
                    break;
                }
                case 109: {
                    n14 = 3;
                    break;
                }
                case 110: {
                    n14 = 107;
                    break;
                }
                case 111: {
                    n14 = 253;
                    break;
                }
                case 112: {
                    n14 = 170;
                    break;
                }
                case 113: {
                    n14 = 182;
                    break;
                }
                case 114: {
                    n14 = 240;
                    break;
                }
                case 115: {
                    n14 = 70;
                    break;
                }
                case 116: {
                    n14 = 205;
                    break;
                }
                case 117: {
                    n14 = 32;
                    break;
                }
                case 118: {
                    n14 = 72;
                    break;
                }
                case 119: {
                    n14 = 106;
                    break;
                }
                case 120: {
                    n14 = 93;
                    break;
                }
                case 121: {
                    n14 = 79;
                    break;
                }
                case 122: {
                    n14 = 136;
                    break;
                }
                case 123: {
                    n14 = 149;
                    break;
                }
                case 124: {
                    n14 = 222;
                    break;
                }
                case 125: {
                    n14 = 244;
                    break;
                }
                case 126: {
                    n14 = 8;
                    break;
                }
                case 127: {
                    n14 = 87;
                    break;
                }
                case 128: {
                    n14 = 249;
                    break;
                }
                case 129: {
                    n14 = 175;
                    break;
                }
                case 130: {
                    n14 = 178;
                    break;
                }
                case 131: {
                    n14 = 199;
                    break;
                }
                case 132: {
                    n14 = 51;
                    break;
                }
                case 133: {
                    n14 = 130;
                    break;
                }
                case 134: {
                    n14 = 161;
                    break;
                }
                case 135: {
                    n14 = 113;
                    break;
                }
                case 136: {
                    n14 = 220;
                    break;
                }
                case 137: {
                    n14 = 226;
                    break;
                }
                case 138: {
                    n14 = 152;
                    break;
                }
                case 139: {
                    n14 = 147;
                    break;
                }
                case 140: {
                    n14 = 66;
                    break;
                }
                case 141: {
                    n14 = 122;
                    break;
                }
                case 142: {
                    n14 = 89;
                    break;
                }
                case 143: {
                    n14 = 39;
                    break;
                }
                case 144: {
                    n14 = 206;
                    break;
                }
                case 145: {
                    n14 = 247;
                    break;
                }
                case 146: {
                    n14 = 225;
                    break;
                }
                case 147: {
                    n14 = 21;
                    break;
                }
                case 148: {
                    n14 = 25;
                    break;
                }
                case 149: {
                    n14 = 50;
                    break;
                }
                case 150: {
                    n14 = 187;
                    break;
                }
                case 151: {
                    n14 = 69;
                    break;
                }
                case 152: {
                    n14 = 117;
                    break;
                }
                case 153: {
                    n14 = 184;
                    break;
                }
                case 154: {
                    n14 = 56;
                    break;
                }
                case 155: {
                    n14 = 129;
                    break;
                }
                case 156: {
                    n14 = 6;
                    break;
                }
                case 157: {
                    n14 = 123;
                    break;
                }
                case 158: {
                    n14 = 183;
                    break;
                }
                case 159: {
                    n14 = 202;
                    break;
                }
                case 160: {
                    n14 = 176;
                    break;
                }
                case 161: {
                    n14 = 166;
                    break;
                }
                case 162: {
                    n14 = 228;
                    break;
                }
                case 163: {
                    n14 = 55;
                    break;
                }
                case 164: {
                    n14 = 67;
                    break;
                }
                case 165: {
                    n14 = 233;
                    break;
                }
                case 166: {
                    n14 = 231;
                    break;
                }
                case 167: {
                    n14 = 224;
                    break;
                }
                case 168: {
                    n14 = 45;
                    break;
                }
                case 169: {
                    n14 = 64;
                    break;
                }
                case 170: {
                    n14 = 76;
                    break;
                }
                case 171: {
                    n14 = 229;
                    break;
                }
                case 172: {
                    n14 = 131;
                    break;
                }
                case 173: {
                    n14 = 13;
                    break;
                }
                case 174: {
                    n14 = 42;
                    break;
                }
                case 175: {
                    n14 = 207;
                    break;
                }
                case 176: {
                    n14 = 9;
                    break;
                }
                case 177: {
                    n14 = 142;
                    break;
                }
                case 178: {
                    n14 = 169;
                    break;
                }
                case 179: {
                    n14 = 193;
                    break;
                }
                case 180: {
                    n14 = 163;
                    break;
                }
                case 181: {
                    n14 = 218;
                    break;
                }
                case 182: {
                    n14 = 191;
                    break;
                }
                case 183: {
                    n14 = 139;
                    break;
                }
                case 184: {
                    n14 = 165;
                    break;
                }
                case 185: {
                    n14 = 246;
                    break;
                }
                case 186: {
                    n14 = 63;
                    break;
                }
                case 187: {
                    n14 = 237;
                    break;
                }
                case 188: {
                    n14 = 68;
                    break;
                }
                case 189: {
                    n14 = 52;
                    break;
                }
                case 190: {
                    n14 = 0;
                    break;
                }
                case 191: {
                    n14 = 126;
                    break;
                }
                case 192: {
                    n14 = 128;
                    break;
                }
                case 193: {
                    n14 = 124;
                    break;
                }
                case 194: {
                    n14 = 88;
                    break;
                }
                case 195: {
                    n14 = 17;
                    break;
                }
                case 196: {
                    n14 = 172;
                    break;
                }
                case 197: {
                    n14 = 40;
                    break;
                }
                case 198: {
                    n14 = 81;
                    break;
                }
                case 199: {
                    n14 = 145;
                    break;
                }
                case 200: {
                    n14 = 84;
                    break;
                }
                case 201: {
                    n14 = 203;
                    break;
                }
                case 202: {
                    n14 = 214;
                    break;
                }
                case 203: {
                    n14 = 104;
                    break;
                }
                case 204: {
                    n14 = 157;
                    break;
                }
                case 205: {
                    n14 = 29;
                    break;
                }
                case 206: {
                    n14 = 241;
                    break;
                }
                case 207: {
                    n14 = 101;
                    break;
                }
                case 208: {
                    n14 = 77;
                    break;
                }
                case 209: {
                    n14 = 108;
                    break;
                }
                case 210: {
                    n14 = 190;
                    break;
                }
                case 211: {
                    n14 = 120;
                    break;
                }
                case 212: {
                    n14 = 78;
                    break;
                }
                case 213: {
                    n14 = 53;
                    break;
                }
                case 214: {
                    n14 = 196;
                    break;
                }
                case 215: {
                    n14 = 4;
                    break;
                }
                case 216: {
                    n14 = 95;
                    break;
                }
                case 217: {
                    n14 = 11;
                    break;
                }
                case 218: {
                    n14 = 156;
                    break;
                }
                case 219: {
                    n14 = 135;
                    break;
                }
                case 220: {
                    n14 = 150;
                    break;
                }
                case 221: {
                    n14 = 26;
                    break;
                }
                case 222: {
                    n14 = 14;
                    break;
                }
                case 223: {
                    n14 = 227;
                    break;
                }
                case 224: {
                    n14 = 125;
                    break;
                }
                case 225: {
                    n14 = 155;
                    break;
                }
                case 226: {
                    n14 = 16;
                    break;
                }
                case 227: {
                    n14 = 212;
                    break;
                }
                case 228: {
                    n14 = 189;
                    break;
                }
                case 229: {
                    n14 = 86;
                    break;
                }
                case 230: {
                    n14 = 35;
                    break;
                }
                case 231: {
                    n14 = 221;
                    break;
                }
                case 232: {
                    n14 = 210;
                    break;
                }
                case 233: {
                    n14 = 41;
                    break;
                }
                case 234: {
                    n14 = 30;
                    break;
                }
                case 235: {
                    n14 = 94;
                    break;
                }
                case 236: {
                    n14 = 27;
                    break;
                }
                case 237: {
                    n14 = 197;
                    break;
                }
                case 238: {
                    n14 = 243;
                    break;
                }
                case 239: {
                    n14 = 103;
                    break;
                }
                case 240: {
                    n14 = 109;
                    break;
                }
                case 241: {
                    n14 = 209;
                    break;
                }
                case 242: {
                    n14 = 38;
                    break;
                }
                case 243: {
                    n14 = 138;
                    break;
                }
                case 244: {
                    n14 = 82;
                    break;
                }
                case 245: {
                    n14 = 5;
                    break;
                }
                case 246: {
                    n14 = 73;
                    break;
                }
                case 247: {
                    n14 = 105;
                    break;
                }
                case 248: {
                    n14 = 219;
                    break;
                }
                case 249: {
                    n14 = 90;
                    break;
                }
                case 250: {
                    n14 = 173;
                    break;
                }
                case 251: {
                    n14 = 236;
                    break;
                }
                case 252: {
                    n14 = 96;
                    break;
                }
                case 253: {
                    n14 = 168;
                    break;
                }
                case 254: {
                    n14 = 254;
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
            av_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5F78;
        if (d[n11] == null) {
            av_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

