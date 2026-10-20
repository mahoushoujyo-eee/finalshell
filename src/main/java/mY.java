/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

public class mY
extends JDialog {
    public static int Y;
    public static int s;
    int L;
    boolean H;
    CW d;
    t3_0 t;
    lj_2 x;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public mY(CW cW, boolean bl, Component component, t3_0 t3_02) {
        JButton jButton;
        int[] nArray;
        block22: {
            String string;
            block20: {
                Object object;
                block21: {
                    int[] nArray2 = yb_1.Y();
                    this.H = false;
                    nArray = nArray2;
                    this.d = cW;
                    this.H = bl;
                    this.t = t3_02;
                    if (nArray != null) break block20;
                    if (bl) break block21;
                    this.setTitle("添加命令");
                    if (nArray == null) break block22;
                }
                try {
                    object = t3_02.l();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.x = (lj_2)object;
            }
            try {
                string = (String)this.x.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.setTitle("编辑命令-" + string);
        }
        this.setModal(true);
        JPanel jPanel = (JPanel)this.getContentPane();
        this.setLayout(new MigLayout("insets 10 10 10 10 ", "[]0[]0[]0[]0[]0[]", ""));
        this.add((Component)new JLabel("名称"), "wrap");
        JTextField jTextField = new JTextField();
        this.add((Component)jTextField, "width :300:,wrap");
        try {
            YJ.o(jTextField);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)new JLabel("命令"), "wrap");
        RSyntaxTextArea rSyntaxTextArea = new RSyntaxTextArea(5, mY.a(24984, 6381067655094882207L));
        rSyntaxTextArea.setSyntaxEditingStyle("text/unix");
        rSyntaxTextArea.setMarkOccurrences(false);
        rSyntaxTextArea.setLineWrap(true);
        rSyntaxTextArea.setCurrentLineHighlightColor(new Color(mY.a(31914, 4966598014258696879L), mY.a(17737, 5395654146477124431L), mY.a(7461, 2082588742495318823L)));
        rSyntaxTextArea.setFont((Font)fx_2.j);
        rSyntaxTextArea.setParserDelay(mY.a(27369, 4469714447945319661L));
        RTextScrollPane rTextScrollPane = new RTextScrollPane(rSyntaxTextArea);
        this.add((Component)rTextScrollPane, "growx ,growy,width :10240:,height :10240:,wrap");
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("align left,insets 0 0 0 0", "[]0[]0[]0[]0[]0[]", ""));
        this.add((Component)jPanel2, "align left,width ::,wrap");
        jPanel2.add((Component)new JLabel("插入参数(动态生成命令) "), "span,wrap");
        for (int i2 = 0; i2 < 5; ++i2) {
            int n10 = i2 + 1;
            jButton = new JButton("参数" + n10);
            jPanel2.add(jButton);
            jButton.addActionListener(new KS(this, n10, rSyntaxTextArea));
            if (nArray == null) continue;
        }
        JCheckBox jCheckBox = new JCheckBox("末尾添加回车符CR", true);
        this.add((Component)jCheckBox, "align left,width ::,wrap");
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new MigLayout("align center,insets 5 0 0 0", "", ""));
        this.add((Component)jPanel3, "align center,width ::,wrap");
        jButton = new JButton("确定");
        jButton.addActionListener(new d__0(this, jTextField, rSyntaxTextArea, cW, jCheckBox, t3_02));
        jPanel3.add(jButton);
        JButton jButton2 = new JButton("取消");
        jButton2.addActionListener(new f__0(this));
        jPanel3.add(jButton2);
        if (nArray == null) {
            boolean bl2;
            try {
                bl2 = (Boolean)this.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl2) {
                boolean bl3;
                String string;
                String string2;
                try {
                    string2 = (String)this.x.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                jTextField.setText(string2);
                try {
                    string = (String)this.x.l();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                rSyntaxTextArea.setText(string);
                try {
                    bl3 = (Boolean)this.x.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                jCheckBox.setSelected(bl3);
                rSyntaxTextArea.discardAllEdits();
            }
            SwingUtilities.invokeLater(new fn_2(this, component, rSyntaxTextArea));
        }
        if (ky_2.F() != null) {
            yb_1.X(new int[3]);
        }
    }

    public int z() {
        return this.L;
    }

    public void i(int n10) {
        this.L = n10;
    }

    public boolean Z() {
        return this.H;
    }

    public void L(boolean bl) {
        this.H = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[23];
                        var11_1 = 0;
                        var10_2 = "\u008e\u00b9\u00cbK\u008d\u00ea\u0015-\u00fd\u0012\u0005\u00dd\u008e\u00d9\u00ca\u00c9(\u0004\u6dce\u52ee\u543a\u4e5c.\u00dew%t\u00c1\u00b4j\u00ce\u00c9'\u00a3\u0080B8\u0093\u00a5X\u00e5N`\u00d5Z\u00c0S\u008d}(\u00b3\u00d2%\u00eeY\u00bd\u00ed~\u00b3\u00ddIh\u00f2\u0006M\u00d1-\u00d88\t\u6765\u5c6f\u6d03\u5265\u56a5\u8ffd\u7b9eM<\u0018\u00a5H\u008a^\u00e4\u00e3Z&\u0093c%~\u00e7;\u00d7\u00b8:\u0099\u00c6\u00e1\u00db\u00fc\u00dc\u00c9\u0004v\u000f,|\u001by\u008c\u0011\u00c6\u0097\u00f0;DY/<\u00f2\u00e1\u0002\u00e0(\u00c0\u00bd=\u00ee\u0086\u00c2,FRS\u00cf\u0002\u5426\u4e09\u0018\u00ef\u00ae\u00c3\u0082\u00cdx\u007fU7\r\u00b1\u00b3u\u0082\u0085\u008fp\u007f\u008f=\u00f2g\u00f9\u00ba\u0002\u5490\u7959\u0002\u78b5\u5b3c\u0019}O\u0091\u00be\u0087\u00ff6\u00a5\u001e\u0013\u0094n\u00d6\u00f3\u0007H@\u0002\u00ba\u00c7X\u00e7R\u00e2\u009d\u0010\u00c1\u008f\u00df\u0010\u00e4[\u00cagK\u0093\u00b4\u00f7\u001f,\u0000\u0096\u0013\u00c9\u00aa\u0014Btq]\u0019\u00e0\u000e\u00caJ\u00edG\u00b2\u0080K\u00d5\u00c1\u0002\u5385\u6d31\u001a\u00e3\u0014B\u00d5\u00fd\u0092v\b\u00f0\u00a6\t\u00c3G:3\u00e5L\u00ed\u00cca\u008ef\u0084\r\u00b9r\u0004\u0005\u00ccB\u0004\r\u6310\u51bf\u5352\u659fg\u52a6\u60c9\u756d\u6257\u5436\u4ecd\u00a2b\u0011[\u00e1q@\u00da\u008b\u00ff\u0001\u00a0\u0097\u00aem\u00fb\u00cfd\u000b\u00fd\u0005\u7f80\u8f43\u54a3\u4efe\u0014\tQ7L'w\u00b3<\u0095\u0094";
                        var12_3 = "\u008e\u00b9\u00cbK\u008d\u00ea\u0015-\u00fd\u0012\u0005\u00dd\u008e\u00d9\u00ca\u00c9(\u0004\u6dce\u52ee\u543a\u4e5c.\u00dew%t\u00c1\u00b4j\u00ce\u00c9'\u00a3\u0080B8\u0093\u00a5X\u00e5N`\u00d5Z\u00c0S\u008d}(\u00b3\u00d2%\u00eeY\u00bd\u00ed~\u00b3\u00ddIh\u00f2\u0006M\u00d1-\u00d88\t\u6765\u5c6f\u6d03\u5265\u56a5\u8ffd\u7b9eM<\u0018\u00a5H\u008a^\u00e4\u00e3Z&\u0093c%~\u00e7;\u00d7\u00b8:\u0099\u00c6\u00e1\u00db\u00fc\u00dc\u00c9\u0004v\u000f,|\u001by\u008c\u0011\u00c6\u0097\u00f0;DY/<\u00f2\u00e1\u0002\u00e0(\u00c0\u00bd=\u00ee\u0086\u00c2,FRS\u00cf\u0002\u5426\u4e09\u0018\u00ef\u00ae\u00c3\u0082\u00cdx\u007fU7\r\u00b1\u00b3u\u0082\u0085\u008fp\u007f\u008f=\u00f2g\u00f9\u00ba\u0002\u5490\u7959\u0002\u78b5\u5b3c\u0019}O\u0091\u00be\u0087\u00ff6\u00a5\u001e\u0013\u0094n\u00d6\u00f3\u0007H@\u0002\u00ba\u00c7X\u00e7R\u00e2\u009d\u0010\u00c1\u008f\u00df\u0010\u00e4[\u00cagK\u0093\u00b4\u00f7\u001f,\u0000\u0096\u0013\u00c9\u00aa\u0014Btq]\u0019\u00e0\u000e\u00caJ\u00edG\u00b2\u0080K\u00d5\u00c1\u0002\u5385\u6d31\u001a\u00e3\u0014B\u00d5\u00fd\u0092v\b\u00f0\u00a6\t\u00c3G:3\u00e5L\u00ed\u00cca\u008ef\u0084\r\u00b9r\u0004\u0005\u00ccB\u0004\r\u6310\u51bf\u5352\u659fg\u52a6\u60c9\u756d\u6257\u5436\u4ecd\u00a2b\u0011[\u00e1q@\u00da\u008b\u00ff\u0001\u00a0\u0097\u00aem\u00fb\u00cfd\u000b\u00fd\u0005\u7f80\u8f43\u54a3\u4efe\u0014\tQ7L'w\u00b3<\u0095\u0094".length();
                        var9_4 = 17;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 7;
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
                            var10_2 = "\u5337\u658d\t\u0090\\h\u0005(NJ\u0082/";
                            var12_3 = "\u5337\u658d\t\u0090\\h\u0005(NJ\u0082/".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 33;
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
                                    v15 = 52;
                                    break;
                                }
                                case 1: {
                                    v15 = 57;
                                    break;
                                }
                                case 2: {
                                    v15 = 123;
                                    break;
                                }
                                case 3: {
                                    v15 = 17;
                                    break;
                                }
                                case 4: {
                                    v15 = 23;
                                    break;
                                }
                                case 5: {
                                    v15 = 70;
                                    break;
                                }
                                default: {
                                    v15 = 12;
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
                mY.a = var13;
                mY.b = new String[23];
                var0_7 = 5946650754015933659L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "[}\u00c6\u00c4\u007f\u00cc_a\u00be\u00c2\u0001\u0083\u00f1\u00c7\u00fbN\u00dd}\u00fd$y[\u00f0\u0004\u00fb\u0091r|\u00caaf\u00841a\u00d9\u0094\u00c5\u00c4\u0087\u0003";
                var5_11 = "[}\u00c6\u00c4\u007f\u00cc_a\u00be\u00c2\u0001\u0083\u00f1\u00c7\u00fbN\u00dd}\u00fd$y[\u00f0\u0004\u00fb\u0091r|\u00caaf\u00841a\u00d9\u0094\u00c5\u00c4\u0087\u0003".length();
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
                    var4_10 = "7E\u00ceY\u00ef\u00f0\u00d2\u00d0\u00d5\u0099\u00e4\u001a\u008b\u00de\u00da\u001a";
                    var5_11 = "7E\u00ceY\u00ef\u00f0\u00d2\u00d0\u00d5\u0099\u00e4\u001a\u008b\u00de\u00da\u001a".length();
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
        mY.c = var6_8;
        mY.e = new Integer[7];
        mY.Y = mY.a(18540, 4348643204373767791L);
        mY.s = mY.a(16393, 8912541431922650633L);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x240D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 176;
                    break;
                }
                case 1: {
                    n14 = 203;
                    break;
                }
                case 2: {
                    n14 = 107;
                    break;
                }
                case 3: {
                    n14 = 118;
                    break;
                }
                case 4: {
                    n14 = 162;
                    break;
                }
                case 5: {
                    n14 = 192;
                    break;
                }
                case 6: {
                    n14 = 143;
                    break;
                }
                case 7: {
                    n14 = 178;
                    break;
                }
                case 8: {
                    n14 = 137;
                    break;
                }
                case 9: {
                    n14 = 198;
                    break;
                }
                case 10: {
                    n14 = 220;
                    break;
                }
                case 11: {
                    n14 = 218;
                    break;
                }
                case 12: {
                    n14 = 255;
                    break;
                }
                case 13: {
                    n14 = 154;
                    break;
                }
                case 14: {
                    n14 = 101;
                    break;
                }
                case 15: {
                    n14 = 0;
                    break;
                }
                case 16: {
                    n14 = 28;
                    break;
                }
                case 17: {
                    n14 = 113;
                    break;
                }
                case 18: {
                    n14 = 159;
                    break;
                }
                case 19: {
                    n14 = 96;
                    break;
                }
                case 20: {
                    n14 = 18;
                    break;
                }
                case 21: {
                    n14 = 174;
                    break;
                }
                case 22: {
                    n14 = 88;
                    break;
                }
                case 23: {
                    n14 = 83;
                    break;
                }
                case 24: {
                    n14 = 213;
                    break;
                }
                case 25: {
                    n14 = 100;
                    break;
                }
                case 26: {
                    n14 = 17;
                    break;
                }
                case 27: {
                    n14 = 252;
                    break;
                }
                case 28: {
                    n14 = 12;
                    break;
                }
                case 29: {
                    n14 = 190;
                    break;
                }
                case 30: {
                    n14 = 87;
                    break;
                }
                case 31: {
                    n14 = 90;
                    break;
                }
                case 32: {
                    n14 = 245;
                    break;
                }
                case 33: {
                    n14 = 109;
                    break;
                }
                case 34: {
                    n14 = 112;
                    break;
                }
                case 35: {
                    n14 = 200;
                    break;
                }
                case 36: {
                    n14 = 91;
                    break;
                }
                case 37: {
                    n14 = 14;
                    break;
                }
                case 38: {
                    n14 = 55;
                    break;
                }
                case 39: {
                    n14 = 62;
                    break;
                }
                case 40: {
                    n14 = 15;
                    break;
                }
                case 41: {
                    n14 = 201;
                    break;
                }
                case 42: {
                    n14 = 230;
                    break;
                }
                case 43: {
                    n14 = 144;
                    break;
                }
                case 44: {
                    n14 = 82;
                    break;
                }
                case 45: {
                    n14 = 142;
                    break;
                }
                case 46: {
                    n14 = 128;
                    break;
                }
                case 47: {
                    n14 = 219;
                    break;
                }
                case 48: {
                    n14 = 89;
                    break;
                }
                case 49: {
                    n14 = 231;
                    break;
                }
                case 50: {
                    n14 = 250;
                    break;
                }
                case 51: {
                    n14 = 188;
                    break;
                }
                case 52: {
                    n14 = 191;
                    break;
                }
                case 53: {
                    n14 = 70;
                    break;
                }
                case 54: {
                    n14 = 36;
                    break;
                }
                case 55: {
                    n14 = 150;
                    break;
                }
                case 56: {
                    n14 = 165;
                    break;
                }
                case 57: {
                    n14 = 63;
                    break;
                }
                case 58: {
                    n14 = 80;
                    break;
                }
                case 59: {
                    n14 = 49;
                    break;
                }
                case 60: {
                    n14 = 122;
                    break;
                }
                case 61: {
                    n14 = 193;
                    break;
                }
                case 62: {
                    n14 = 86;
                    break;
                }
                case 63: {
                    n14 = 130;
                    break;
                }
                case 64: {
                    n14 = 127;
                    break;
                }
                case 65: {
                    n14 = 158;
                    break;
                }
                case 66: {
                    n14 = 208;
                    break;
                }
                case 67: {
                    n14 = 26;
                    break;
                }
                case 68: {
                    n14 = 251;
                    break;
                }
                case 69: {
                    n14 = 179;
                    break;
                }
                case 70: {
                    n14 = 65;
                    break;
                }
                case 71: {
                    n14 = 169;
                    break;
                }
                case 72: {
                    n14 = 217;
                    break;
                }
                case 73: {
                    n14 = 135;
                    break;
                }
                case 74: {
                    n14 = 58;
                    break;
                }
                case 75: {
                    n14 = 51;
                    break;
                }
                case 76: {
                    n14 = 95;
                    break;
                }
                case 77: {
                    n14 = 50;
                    break;
                }
                case 78: {
                    n14 = 227;
                    break;
                }
                case 79: {
                    n14 = 81;
                    break;
                }
                case 80: {
                    n14 = 47;
                    break;
                }
                case 81: {
                    n14 = 32;
                    break;
                }
                case 82: {
                    n14 = 68;
                    break;
                }
                case 83: {
                    n14 = 214;
                    break;
                }
                case 84: {
                    n14 = 131;
                    break;
                }
                case 85: {
                    n14 = 69;
                    break;
                }
                case 86: {
                    n14 = 23;
                    break;
                }
                case 87: {
                    n14 = 119;
                    break;
                }
                case 88: {
                    n14 = 48;
                    break;
                }
                case 89: {
                    n14 = 196;
                    break;
                }
                case 90: {
                    n14 = 151;
                    break;
                }
                case 91: {
                    n14 = 232;
                    break;
                }
                case 92: {
                    n14 = 136;
                    break;
                }
                case 93: {
                    n14 = 71;
                    break;
                }
                case 94: {
                    n14 = 33;
                    break;
                }
                case 95: {
                    n14 = 175;
                    break;
                }
                case 96: {
                    n14 = 222;
                    break;
                }
                case 97: {
                    n14 = 24;
                    break;
                }
                case 98: {
                    n14 = 5;
                    break;
                }
                case 99: {
                    n14 = 11;
                    break;
                }
                case 100: {
                    n14 = 3;
                    break;
                }
                case 101: {
                    n14 = 39;
                    break;
                }
                case 102: {
                    n14 = 242;
                    break;
                }
                case 103: {
                    n14 = 238;
                    break;
                }
                case 104: {
                    n14 = 177;
                    break;
                }
                case 105: {
                    n14 = 30;
                    break;
                }
                case 106: {
                    n14 = 254;
                    break;
                }
                case 107: {
                    n14 = 183;
                    break;
                }
                case 108: {
                    n14 = 34;
                    break;
                }
                case 109: {
                    n14 = 84;
                    break;
                }
                case 110: {
                    n14 = 157;
                    break;
                }
                case 111: {
                    n14 = 92;
                    break;
                }
                case 112: {
                    n14 = 133;
                    break;
                }
                case 113: {
                    n14 = 60;
                    break;
                }
                case 114: {
                    n14 = 156;
                    break;
                }
                case 115: {
                    n14 = 235;
                    break;
                }
                case 116: {
                    n14 = 155;
                    break;
                }
                case 117: {
                    n14 = 124;
                    break;
                }
                case 118: {
                    n14 = 145;
                    break;
                }
                case 119: {
                    n14 = 166;
                    break;
                }
                case 120: {
                    n14 = 153;
                    break;
                }
                case 121: {
                    n14 = 221;
                    break;
                }
                case 122: {
                    n14 = 110;
                    break;
                }
                case 123: {
                    n14 = 97;
                    break;
                }
                case 124: {
                    n14 = 186;
                    break;
                }
                case 125: {
                    n14 = 10;
                    break;
                }
                case 126: {
                    n14 = 141;
                    break;
                }
                case 127: {
                    n14 = 172;
                    break;
                }
                case 128: {
                    n14 = 46;
                    break;
                }
                case 129: {
                    n14 = 72;
                    break;
                }
                case 130: {
                    n14 = 21;
                    break;
                }
                case 131: {
                    n14 = 189;
                    break;
                }
                case 132: {
                    n14 = 29;
                    break;
                }
                case 133: {
                    n14 = 37;
                    break;
                }
                case 134: {
                    n14 = 25;
                    break;
                }
                case 135: {
                    n14 = 146;
                    break;
                }
                case 136: {
                    n14 = 129;
                    break;
                }
                case 137: {
                    n14 = 125;
                    break;
                }
                case 138: {
                    n14 = 93;
                    break;
                }
                case 139: {
                    n14 = 111;
                    break;
                }
                case 140: {
                    n14 = 1;
                    break;
                }
                case 141: {
                    n14 = 247;
                    break;
                }
                case 142: {
                    n14 = 194;
                    break;
                }
                case 143: {
                    n14 = 223;
                    break;
                }
                case 144: {
                    n14 = 248;
                    break;
                }
                case 145: {
                    n14 = 173;
                    break;
                }
                case 146: {
                    n14 = 139;
                    break;
                }
                case 147: {
                    n14 = 6;
                    break;
                }
                case 148: {
                    n14 = 108;
                    break;
                }
                case 149: {
                    n14 = 126;
                    break;
                }
                case 150: {
                    n14 = 40;
                    break;
                }
                case 151: {
                    n14 = 31;
                    break;
                }
                case 152: {
                    n14 = 163;
                    break;
                }
                case 153: {
                    n14 = 134;
                    break;
                }
                case 154: {
                    n14 = 199;
                    break;
                }
                case 155: {
                    n14 = 246;
                    break;
                }
                case 156: {
                    n14 = 104;
                    break;
                }
                case 157: {
                    n14 = 225;
                    break;
                }
                case 158: {
                    n14 = 161;
                    break;
                }
                case 159: {
                    n14 = 4;
                    break;
                }
                case 160: {
                    n14 = 160;
                    break;
                }
                case 161: {
                    n14 = 205;
                    break;
                }
                case 162: {
                    n14 = 54;
                    break;
                }
                case 163: {
                    n14 = 79;
                    break;
                }
                case 164: {
                    n14 = 182;
                    break;
                }
                case 165: {
                    n14 = 234;
                    break;
                }
                case 166: {
                    n14 = 228;
                    break;
                }
                case 167: {
                    n14 = 207;
                    break;
                }
                case 168: {
                    n14 = 237;
                    break;
                }
                case 169: {
                    n14 = 41;
                    break;
                }
                case 170: {
                    n14 = 170;
                    break;
                }
                case 171: {
                    n14 = 74;
                    break;
                }
                case 172: {
                    n14 = 249;
                    break;
                }
                case 173: {
                    n14 = 106;
                    break;
                }
                case 174: {
                    n14 = 76;
                    break;
                }
                case 175: {
                    n14 = 202;
                    break;
                }
                case 176: {
                    n14 = 197;
                    break;
                }
                case 177: {
                    n14 = 43;
                    break;
                }
                case 178: {
                    n14 = 78;
                    break;
                }
                case 179: {
                    n14 = 138;
                    break;
                }
                case 180: {
                    n14 = 236;
                    break;
                }
                case 181: {
                    n14 = 115;
                    break;
                }
                case 182: {
                    n14 = 147;
                    break;
                }
                case 183: {
                    n14 = 102;
                    break;
                }
                case 184: {
                    n14 = 98;
                    break;
                }
                case 185: {
                    n14 = 22;
                    break;
                }
                case 186: {
                    n14 = 204;
                    break;
                }
                case 187: {
                    n14 = 206;
                    break;
                }
                case 188: {
                    n14 = 253;
                    break;
                }
                case 189: {
                    n14 = 64;
                    break;
                }
                case 190: {
                    n14 = 212;
                    break;
                }
                case 191: {
                    n14 = 77;
                    break;
                }
                case 192: {
                    n14 = 224;
                    break;
                }
                case 193: {
                    n14 = 195;
                    break;
                }
                case 194: {
                    n14 = 239;
                    break;
                }
                case 195: {
                    n14 = 116;
                    break;
                }
                case 196: {
                    n14 = 233;
                    break;
                }
                case 197: {
                    n14 = 168;
                    break;
                }
                case 198: {
                    n14 = 56;
                    break;
                }
                case 199: {
                    n14 = 9;
                    break;
                }
                case 200: {
                    n14 = 123;
                    break;
                }
                case 201: {
                    n14 = 7;
                    break;
                }
                case 202: {
                    n14 = 152;
                    break;
                }
                case 203: {
                    n14 = 53;
                    break;
                }
                case 204: {
                    n14 = 67;
                    break;
                }
                case 205: {
                    n14 = 27;
                    break;
                }
                case 206: {
                    n14 = 85;
                    break;
                }
                case 207: {
                    n14 = 216;
                    break;
                }
                case 208: {
                    n14 = 241;
                    break;
                }
                case 209: {
                    n14 = 185;
                    break;
                }
                case 210: {
                    n14 = 73;
                    break;
                }
                case 211: {
                    n14 = 57;
                    break;
                }
                case 212: {
                    n14 = 19;
                    break;
                }
                case 213: {
                    n14 = 20;
                    break;
                }
                case 214: {
                    n14 = 103;
                    break;
                }
                case 215: {
                    n14 = 42;
                    break;
                }
                case 216: {
                    n14 = 164;
                    break;
                }
                case 217: {
                    n14 = 75;
                    break;
                }
                case 218: {
                    n14 = 105;
                    break;
                }
                case 219: {
                    n14 = 16;
                    break;
                }
                case 220: {
                    n14 = 184;
                    break;
                }
                case 221: {
                    n14 = 120;
                    break;
                }
                case 222: {
                    n14 = 66;
                    break;
                }
                case 223: {
                    n14 = 243;
                    break;
                }
                case 224: {
                    n14 = 52;
                    break;
                }
                case 225: {
                    n14 = 148;
                    break;
                }
                case 226: {
                    n14 = 35;
                    break;
                }
                case 227: {
                    n14 = 167;
                    break;
                }
                case 228: {
                    n14 = 94;
                    break;
                }
                case 229: {
                    n14 = 211;
                    break;
                }
                case 230: {
                    n14 = 149;
                    break;
                }
                case 231: {
                    n14 = 209;
                    break;
                }
                case 232: {
                    n14 = 187;
                    break;
                }
                case 233: {
                    n14 = 44;
                    break;
                }
                case 234: {
                    n14 = 114;
                    break;
                }
                case 235: {
                    n14 = 13;
                    break;
                }
                case 236: {
                    n14 = 244;
                    break;
                }
                case 237: {
                    n14 = 61;
                    break;
                }
                case 238: {
                    n14 = 132;
                    break;
                }
                case 239: {
                    n14 = 8;
                    break;
                }
                case 240: {
                    n14 = 59;
                    break;
                }
                case 241: {
                    n14 = 2;
                    break;
                }
                case 242: {
                    n14 = 117;
                    break;
                }
                case 243: {
                    n14 = 226;
                    break;
                }
                case 244: {
                    n14 = 240;
                    break;
                }
                case 245: {
                    n14 = 180;
                    break;
                }
                case 246: {
                    n14 = 99;
                    break;
                }
                case 247: {
                    n14 = 140;
                    break;
                }
                case 248: {
                    n14 = 181;
                    break;
                }
                case 249: {
                    n14 = 210;
                    break;
                }
                case 250: {
                    n14 = 45;
                    break;
                }
                case 251: {
                    n14 = 38;
                    break;
                }
                case 252: {
                    n14 = 215;
                    break;
                }
                case 253: {
                    n14 = 171;
                    break;
                }
                case 254: {
                    n14 = 229;
                    break;
                }
                default: {
                    n14 = 121;
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
            mY.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E06;
        if (e[n11] == null) {
            mY.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

