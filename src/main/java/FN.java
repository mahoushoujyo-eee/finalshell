/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.UnknownHostException;

public class FN
extends Dialog
implements WindowListener,
ItemListener,
ActionListener,
Runnable {
    TextField J;
    TextField k;
    TextField h;
    TextField B;
    TextField F;
    Button D;
    Button b;
    Button j;
    Button w;
    Button R;
    List Y;
    Checkbox I;
    Checkbox u;
    Checkbox M;
    Checkbox z;
    Checkbox N;
    Dialog X;
    Label r;
    String o;
    String s;
    String q;
    int v;
    Thread K;
    CheckboxGroup c;
    y_0 p;
    TR W;
    int H;
    public static boolean g;
    private static final String[] a;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[35];
                        var11_1 = 0;
                        var10_2 = "q\u00d7\u00ee\u0018\u009cw\u0003\u00bf\u00c0\u0097\u0005Df\u00a9\u00f0\u00e5\u0006\u0004\u00f7\u00b7\u00dd\u00e9{\u0016o\u00a3\u00b5\u00fa.\u00fa\u00a1\u0098Q\u0088\u00dd\u00e1\u001e\u0002;y8'\u00b02\u00c9\u00a01u\u00f6\u00fc\u0094FH\u00af?\u00c7\u00fb\u009e\u009e\u009c\u00a6\u0084\u00f7\u0090\u00a20&\u00e6q\u0092\u00d6\u00d2^+\u0019\u00b8M\u00c9\u00fcQ\u00d0\u00ba\u000f\u0001\u00f7\u00ce\b\u0001\u00f9B\r\u00b5\u00ca@\u00aa\u00fe\u0006C\u00a0@c\u00ad\u0016\u0007\u00f8\u00a2\u00bd\u00bd\u0081\u0088I\u0011:\u001f\u0080\u00c0\u0098\u0082j_\u00c0\u00d2)/\u009c\u00a9\u00e9a\u008a\u0016\u00a2\r\f/\u0019@G\u00cf\u008dbF\u00bcm\u00a9R\r\u00f0\u00c9\u00f4\u008a\u00ad5\u0006xq'\u00caA\u00c8\u0013\u00aa\u0093\r\u00fc9:h\u0080;\u0099g\u009d/\u0010\u00d393x/\u0005\u00b0\"Sx\u000f\f\u00d7a)\u00c7\u0019\u00b7V\u00c8\u00f2Fb\u00c5\r\t\u0015\u00d6\u0007_~\u001aj\u000eJy\u00c1;\u0004\u008b\u00f33\u00b2\u0004\u000e\u00bcE\u00ba\u0004\"\u00dc/\u009d\u0007g\u00c1N\u00d1\u00ff\u0005\u0086\u0006ktu\u00e2{I\u0014\u0094\u00fde\u001a&\u00e3\u00db> Jn}[\u0086\u00actZ\u00cdi\"\u000b\u001d\u00ec\u00b0\u00be\t\u000e\u0016\u00b7\u00a0\u00df%\t@\u009eL'\u0080d\u00a1\u00e6A\b\u0086T'/nb\u00d7\u009a\u0002Y\u00fe\u0016\u00cf\u009b\u00a1\u00fd\u00ac\u001a\u00e9\u0084B\u000b\u009e\u0091v\f6\u00b8\u0099\u001f\u00845OO\u0006\u00e3*Kfv\r\u00066\u00c7\u0006\u001a\u00817\u0015\u00eb\u00d0\u008a\u00bf\u00dbWd\u00a8\u00d7\u0098\u0090'\u0084\u00cdW\u001d%\u00e0\u0086\u0087m\u0005]\u009f\u00f4\u00cf\u00da\u000e\u00c6\u00cb\u00a8\u0000\u00e9\u00f9\u00day\u00b1g\u0087\u00ab\u0097\u0005\u000f<!@\u0007\u00c9a7[\u008dC\u00b8*\u00c4\u009a\u00f3\u0014]\u00cb\u00ef\u008d\u00f41/L\u008ae\u00cc\u00ab\u0018dX]\u00ef \u00f7\u0011";
                        var12_3 = "q\u00d7\u00ee\u0018\u009cw\u0003\u00bf\u00c0\u0097\u0005Df\u00a9\u00f0\u00e5\u0006\u0004\u00f7\u00b7\u00dd\u00e9{\u0016o\u00a3\u00b5\u00fa.\u00fa\u00a1\u0098Q\u0088\u00dd\u00e1\u001e\u0002;y8'\u00b02\u00c9\u00a01u\u00f6\u00fc\u0094FH\u00af?\u00c7\u00fb\u009e\u009e\u009c\u00a6\u0084\u00f7\u0090\u00a20&\u00e6q\u0092\u00d6\u00d2^+\u0019\u00b8M\u00c9\u00fcQ\u00d0\u00ba\u000f\u0001\u00f7\u00ce\b\u0001\u00f9B\r\u00b5\u00ca@\u00aa\u00fe\u0006C\u00a0@c\u00ad\u0016\u0007\u00f8\u00a2\u00bd\u00bd\u0081\u0088I\u0011:\u001f\u0080\u00c0\u0098\u0082j_\u00c0\u00d2)/\u009c\u00a9\u00e9a\u008a\u0016\u00a2\r\f/\u0019@G\u00cf\u008dbF\u00bcm\u00a9R\r\u00f0\u00c9\u00f4\u008a\u00ad5\u0006xq'\u00caA\u00c8\u0013\u00aa\u0093\r\u00fc9:h\u0080;\u0099g\u009d/\u0010\u00d393x/\u0005\u00b0\"Sx\u000f\f\u00d7a)\u00c7\u0019\u00b7V\u00c8\u00f2Fb\u00c5\r\t\u0015\u00d6\u0007_~\u001aj\u000eJy\u00c1;\u0004\u008b\u00f33\u00b2\u0004\u000e\u00bcE\u00ba\u0004\"\u00dc/\u009d\u0007g\u00c1N\u00d1\u00ff\u0005\u0086\u0006ktu\u00e2{I\u0014\u0094\u00fde\u001a&\u00e3\u00db> Jn}[\u0086\u00actZ\u00cdi\"\u000b\u001d\u00ec\u00b0\u00be\t\u000e\u0016\u00b7\u00a0\u00df%\t@\u009eL'\u0080d\u00a1\u00e6A\b\u0086T'/nb\u00d7\u009a\u0002Y\u00fe\u0016\u00cf\u009b\u00a1\u00fd\u00ac\u001a\u00e9\u0084B\u000b\u009e\u0091v\f6\u00b8\u0099\u001f\u00845OO\u0006\u00e3*Kfv\r\u00066\u00c7\u0006\u001a\u00817\u0015\u00eb\u00d0\u008a\u00bf\u00dbWd\u00a8\u00d7\u0098\u0090'\u0084\u00cdW\u001d%\u00e0\u0086\u0087m\u0005]\u009f\u00f4\u00cf\u00da\u000e\u00c6\u00cb\u00a8\u0000\u00e9\u00f9\u00day\u00b1g\u0087\u00ab\u0097\u0005\u000f<!@\u0007\u00c9a7[\u008dC\u00b8*\u00c4\u009a\u00f3\u0014]\u00cb\u00ef\u008d\u00f41/L\u008ae\u00cc\u00ab\u0018dX]\u00ef \u00f7\u0011".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 87;
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
                            var10_2 = "`\u0010\u00c1\u00ecn\u0013\u0007\u00d5\u009e4l\u00cd\u0090\u0088";
                            var12_3 = "`\u0010\u00c1\u00ecn\u0013\u0007\u00d5\u009e4l\u00cd\u0090\u0088".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 108;
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
                                    v15 = 98;
                                    break;
                                }
                                case 2: {
                                    v15 = 86;
                                    break;
                                }
                                case 3: {
                                    v15 = 59;
                                    break;
                                }
                                case 4: {
                                    v15 = 20;
                                    break;
                                }
                                case 5: {
                                    v15 = 40;
                                    break;
                                }
                                default: {
                                    v15 = 101;
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
                FN.a = var13;
                FN.d = new String[35];
                var0_7 = 8009702556478362800L;
                var6_8 = new long[19];
                var3_9 = 0;
                var4_10 = "PP\u001d\u00e6\u00c3\u0012g\u00b6o\u009a3KO\u00a0g\u00f3\u00eaG\u00d8\u00c4\u00ad\u00d9\u00e8Jf\u00c0*Z\u008e\u0093@\u00cbJ\u0011<ri{8\u00f8\u00cb\u00a3\u0000p\u00d5\"\u00e4\u00d5\u001d\u009c\u00eb]\u00c0U_\u00ac*\u00bf\u0082\u00dck\u00b9^|\u00cf\u00c8\u0083\u00d4\u00f0\u00881\u00c4n\u0016zY\u00c1\u00ba\u00d8\u0003\u00b6\f\u00eeeQN\u00ff\u00d2\u00ac\u00b8|\u001f\u00c1\u00bclO\n\u00c9'/\u000e\u0088\u0088\nc\u00dcD\u0095g \u00fd\u0084\u0080V\u00ee\u00df\u008b\u000ea\u00f1>\"\u00fb&=\u0012\u00a9Z\u00fa\u00d5\u00fe\u00b8\u00d2\u00ad \u00a1";
                var5_11 = "PP\u001d\u00e6\u00c3\u0012g\u00b6o\u009a3KO\u00a0g\u00f3\u00eaG\u00d8\u00c4\u00ad\u00d9\u00e8Jf\u00c0*Z\u008e\u0093@\u00cbJ\u0011<ri{8\u00f8\u00cb\u00a3\u0000p\u00d5\"\u00e4\u00d5\u001d\u009c\u00eb]\u00c0U_\u00ac*\u00bf\u0082\u00dck\u00b9^|\u00cf\u00c8\u0083\u00d4\u00f0\u00881\u00c4n\u0016zY\u00c1\u00ba\u00d8\u0003\u00b6\f\u00eeeQN\u00ff\u00d2\u00ac\u00b8|\u001f\u00c1\u00bclO\n\u00c9'/\u000e\u0088\u0088\nc\u00dcD\u0095g \u00fd\u0084\u0080V\u00ee\u00df\u008b\u000ea\u00f1>\"\u00fb&=\u0012\u00a9Z\u00fa\u00d5\u00fe\u00b8\u00d2\u00ad \u00a1".length();
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
                    var4_10 = "\u00aa\u00adP6\u00a7@2\u00e2\u00ef\u001e\u00ab\u00f1\u00f1\u00c3\u0088\u00c6";
                    var5_11 = "\u00aa\u00adP6\u00a7@2\u00e2\u00ef\u001e\u00ab\u00f1\u00f1\u00c3\u0088\u00c6".length();
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
        FN.e = var6_8;
        FN.f = new Integer[19];
        FN.g = true;
    }

    public FN(Frame frame) {
        this(frame, (y_0)null);
    }

    /*
     * Unable to fully structure code
     */
    public FN(Frame var1_1, y_0 var2_2) {
        block33: {
            block31: {
                v0 = jk_0.Y();
                super(var1_1, "Proxy Configuration", true);
                var3_3 = v0;
                this.K = null;
                this.c = new CheckboxGroup();
                this.X = new Dialog(var1_1, "Warning", true);
                this.r();
                this.setResizable(false);
                this.addWindowListener(this);
                var4_4 = this.getComponents();
                var5_5 = 0;
                try {
                    if (var3_3 == null) {
                        while (true) {
                            v1 = var4_4[var5_5];
                            break;
                        }
                    }
                    ** GOTO lbl71
                }
                catch (NumberFormatException v2) {
                    throw FN.a(v2);
                }
                do {
                    block27: {
                        block30: {
                            block28: {
                                v3 = v1 instanceof Button;
                                if (var3_3 != null) {
                                    try {
                                        block26: {
                                            try {
                                                if (!v3) break block26;
                                                ((Button)var4_4[var5_5]).addActionListener(this);
                                                if (var3_3 != null) break block27;
                                            }
                                            catch (NumberFormatException v4) {
                                                throw FN.a(v4);
                                            }
                                        }
                                        v3 = var4_4[var5_5] instanceof TextField;
                                    }
                                    catch (NumberFormatException v5) {
                                        throw FN.a(v5);
                                    }
                                }
                                try {
                                    try {
                                        block29: {
                                            try {
                                                try {
                                                    if (var3_3 == null) break block28;
                                                    if (!v3) break block29;
                                                }
                                                catch (NumberFormatException v6) {
                                                    throw FN.a(v6);
                                                }
                                                ((TextField)var4_4[var5_5]).addActionListener(this);
                                                if (var3_3 != null) break block27;
                                            }
                                            catch (NumberFormatException v7) {
                                                throw FN.a(v7);
                                            }
                                        }
                                        v8 = var4_4[var5_5];
                                        if (var3_3 == null) break block30;
                                    }
                                    catch (NumberFormatException v9) {
                                        throw FN.a(v9);
                                    }
                                    v3 = v8 instanceof Checkbox;
                                }
                                catch (NumberFormatException v10) {
                                    throw FN.a(v10);
                                }
                            }
                            try {
                                if (!v3) break block27;
                                v8 = var4_4[var5_5];
                            }
                            catch (NumberFormatException v11) {
                                throw FN.a(v11);
                            }
                        }
                        ((Checkbox)v8).addItemListener(this);
                    }
                    ++var5_5;
lbl71:
                    // 2 sources

                    if (var5_5 < var4_4.length) ** continue;
                    this.p = var2_2;
                    v1 = this;
                } while (var3_3 == null);
                try {
                    block32: {
                        try {
                            try {
                                if (var3_3 == null) break block31;
                                if (v1.p == null) break block32;
                            }
                            catch (NumberFormatException v12) {
                                throw FN.a(v12);
                            }
                            this.O(this.p);
                            if (var3_3 != null) break block33;
                        }
                        catch (NumberFormatException v13) {
                            throw FN.a(v13);
                        }
                    }
                    v14 = this;
                }
                catch (NumberFormatException v15) {
                    throw FN.a(v15);
                }
            }
            v14.W = new TR();
        }
        this.R.addActionListener(this);
        this.X.addWindowListener(this);
    }

    public y_0 t() {
        this.H = 0;
        this.pack();
        this.show();
        return this.p;
    }

    public y_0 m(y_0 y_02) {
        y_0 y_03;
        block4: {
            block5: {
                String[] stringArray = jk_0.Y();
                try {
                    try {
                        y_03 = y_02;
                        if (stringArray == null) break block4;
                        if (y_03 == null) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw FN.a(numberFormatException);
                    }
                    this.O(y_02);
                }
                catch (NumberFormatException numberFormatException) {
                    throw FN.a(numberFormatException);
                }
            }
            this.H = 0;
            this.pack();
            this.show();
            y_03 = this.p;
        }
        return y_03;
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        block11: {
            Dialog dialog;
            Window window;
            block9: {
                Window window2 = windowEvent.getWindow();
                String[] stringArray = jk_0.Y();
                try {
                    block10: {
                        try {
                            try {
                                window = window2;
                                dialog = this;
                                if (stringArray == null) break block9;
                                if (window != dialog) break block10;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw FN.a(numberFormatException);
                            }
                            this.S();
                            if (stringArray != null) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw FN.a(numberFormatException);
                        }
                    }
                    window = window2;
                    dialog = this.X;
                }
                catch (NumberFormatException numberFormatException) {
                    throw FN.a(numberFormatException);
                }
            }
            try {
                if (window == dialog) {
                    this.u();
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw FN.a(numberFormatException);
            }
        }
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block36: {
            block44: {
                block42: {
                    block40: {
                        block38: {
                            block37: {
                                block34: {
                                    var3_2 = var1_1.getSource();
                                    var2_3 = jk_0.Y();
                                    try {
                                        try {
                                            block35: {
                                                try {
                                                    try {
                                                        v0 = var3_2;
                                                        v1 = this.j;
                                                        if (var2_3 == null) break block34;
                                                        if (v0 != v1) break block35;
                                                    }
                                                    catch (NumberFormatException v2) {
                                                        throw FN.a(v2);
                                                    }
                                                    this.S();
                                                    if (var2_3 != null) break block36;
                                                }
                                                catch (NumberFormatException v3) {
                                                    throw FN.a(v3);
                                                }
                                            }
                                            v0 = var3_2;
                                            v4 = this;
                                            if (var2_3 == null) break block37;
                                        }
                                        catch (NumberFormatException v5) {
                                            throw FN.a(v5);
                                        }
                                        v1 = v4.D;
                                    }
                                    catch (NumberFormatException v6) {
                                        throw FN.a(v6);
                                    }
                                }
                                try {
                                    if (v0 != v1) {
                                        v0 = var3_2;
                                        v4 = this;
                                    }
                                    ** GOTO lbl48
                                }
                                catch (NumberFormatException v7) {
                                    throw FN.a(v7);
                                }
                            }
                            try {
                                block39: {
                                    try {
                                        try {
                                            if (var2_3 == null) break block38;
                                            if (v0 != v4.F) break block39;
                                        }
                                        catch (NumberFormatException v8) {
                                            throw FN.a(v8);
                                        }
lbl48:
                                        // 2 sources

                                        this.b();
                                        if (var2_3 != null) break block36;
                                    }
                                    catch (NumberFormatException v9) {
                                        throw FN.a(v9);
                                    }
                                }
                                v0 = var3_2;
                                v4 = this;
                            }
                            catch (NumberFormatException v10) {
                                throw FN.a(v10);
                            }
                        }
                        try {
                            block41: {
                                try {
                                    try {
                                        v11 = v4.b;
                                        if (var2_3 == null) break block40;
                                        if (v0 != v11) break block41;
                                    }
                                    catch (NumberFormatException v12) {
                                        throw FN.a(v12);
                                    }
                                    this.W();
                                    if (var2_3 != null) break block36;
                                }
                                catch (NumberFormatException v13) {
                                    throw FN.a(v13);
                                }
                            }
                            v0 = var3_2;
                            v11 = this.R;
                        }
                        catch (NumberFormatException v14) {
                            throw FN.a(v14);
                        }
                    }
                    try {
                        try {
                            block43: {
                                try {
                                    try {
                                        if (var2_3 == null) break block42;
                                        if (v0 != v11) break block43;
                                    }
                                    catch (NumberFormatException v15) {
                                        throw FN.a(v15);
                                    }
                                    this.u();
                                    if (var2_3 != null) break block36;
                                }
                                catch (NumberFormatException v16) {
                                    throw FN.a(v16);
                                }
                            }
                            v0 = var3_2;
                            if (var2_3 == null) break block44;
                        }
                        catch (NumberFormatException v17) {
                            throw FN.a(v17);
                        }
                        v11 = this.w;
                    }
                    catch (NumberFormatException v18) {
                        throw FN.a(v18);
                    }
                }
                if (v0 == v11) ** GOTO lbl111
                v0 = var3_2;
            }
            try {
                if (!(v0 instanceof TextField)) break block36;
lbl111:
                // 2 sources

                this.H();
            }
            catch (NumberFormatException v19) {
                throw FN.a(v19);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void itemStateChanged(ItemEvent var1_1) {
        block17: {
            block16: {
                block14: {
                    var3_2 = var1_1.getSource();
                    var2_3 = jk_0.Y();
                    try {
                        block15: {
                            try {
                                try {
                                    try {
                                        if (var2_3 == null) break block14;
                                        if (var3_2 == this.u) break block15;
                                    }
                                    catch (NumberFormatException v0) {
                                        throw FN.a(v0);
                                    }
                                    v1 = var3_2;
                                    v2 = this.I;
                                    if (var2_3 == null) break block16;
                                }
                                catch (NumberFormatException v3) {
                                    throw FN.a(v3);
                                }
                                if (v1 == v2) {
                                }
                                ** GOTO lbl31
                            }
                            catch (NumberFormatException v4) {
                                throw FN.a(v4);
                            }
                        }
                        this.U();
                    }
                    catch (NumberFormatException v5) {
                        throw FN.a(v5);
                    }
                }
                try {
                    if (var2_3 != null) break block17;
lbl31:
                    // 2 sources

                    v1 = var3_2;
                    v2 = this.z;
                }
                catch (NumberFormatException v6) {
                    throw FN.a(v6);
                }
            }
            try {
                if (v1 == v2) {
                    this.C();
                }
            }
            catch (NumberFormatException v7) {
                throw FN.a(v7);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block15: {
            block18: {
                block19: {
                    block16: {
                        block17: {
                            var1_1 = jk_0.Y();
                            try {
                                try {
                                    try {
                                        try {
                                            v0 = this.R();
                                            if (var1_1 != null) {
                                                if (v0) break block15;
                                            }
                                            ** GOTO lbl50
                                        }
                                        catch (NumberFormatException v1) {
                                            throw FN.a(v1);
                                        }
                                        v2 = this;
                                        if (var1_1 == null) break block16;
                                    }
                                    catch (NumberFormatException v3) {
                                        throw FN.a(v3);
                                    }
                                    if (v2.H == 1) break block17;
                                }
                                catch (NumberFormatException v4) {
                                    throw FN.a(v4);
                                }
                                return;
                            }
                            catch (NumberFormatException v5) {
                                throw FN.a(v5);
                            }
                        }
                        v2 = this;
                    }
                    try {
                        try {
                            if (var1_1 == null) break block18;
                            if (v2.K == Thread.currentThread()) break block19;
                        }
                        catch (NumberFormatException v6) {
                            throw FN.a(v6);
                        }
                        return;
                    }
                    catch (NumberFormatException v7) {
                        throw FN.a(v7);
                    }
                }
                this.H = 0;
                this.r.setText("Look up failed.");
                v2 = this;
            }
            v2.r.invalidate();
            return;
        }
        block12: while (true) {
            v8 = this.X;
            do {
                v0 = v8.isShowing();
lbl50:
                // 2 sources

                if (!v0) continue block12;
                v8 = this.X;
            } while (var1_1 == null);
            break;
        }
        v8.dispose();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void H() {
        block61: {
            block60: {
                block59: {
                    block58: {
                        block56: {
                            block51: {
                                block52: {
                                    block53: {
                                        block54: {
                                            block55: {
                                                block68: {
                                                    block67: {
                                                        block50: {
                                                            block63: {
                                                                block65: {
                                                                    block64: {
                                                                        block48: {
                                                                            block49: {
                                                                                this.o = this.J.getText().trim();
                                                                                var1_1 = jk_0.Y();
                                                                                this.s = this.h.getText();
                                                                                this.q = this.B.getText();
                                                                                v0 = this;
                                                                                if (var1_1 == null) break block48;
                                                                                try {
                                                                                    block62: {
                                                                                        if (v0.o.length() != 0) break block49;
                                                                                        break block62;
                                                                                        catch (NumberFormatException v1) {
                                                                                            throw FN.a(v1);
                                                                                        }
                                                                                    }
                                                                                    this.k("Proxy host is not set!");
                                                                                    return;
                                                                                }
                                                                                catch (NumberFormatException v2) {
                                                                                    throw FN.a(v2);
                                                                                }
                                                                            }
                                                                            v0 = this;
                                                                        }
                                                                        v3 = v0.c.getSelectedCheckbox();
                                                                        if (var1_1 == null) break block50;
                                                                        if (v3 != this.I) break block63;
                                                                        break block64;
                                                                        catch (NumberFormatException v4) {
                                                                            throw FN.a(v4);
                                                                        }
                                                                    }
                                                                    v5 = this;
                                                                    if (var1_1 == null) ** GOTO lbl113
                                                                    break block65;
                                                                    catch (NumberFormatException v6) {
                                                                        throw FN.a(v6);
                                                                    }
                                                                }
                                                                try {
                                                                    block66: {
                                                                        if (v5.s.length() != 0) break block51;
                                                                        break block66;
                                                                        catch (NumberFormatException v7) {
                                                                            throw FN.a(v7);
                                                                        }
                                                                    }
                                                                    this.k("User name is not set");
                                                                    return;
                                                                }
                                                                catch (NumberFormatException v8) {
                                                                    throw FN.a(v8);
                                                                }
                                                            }
                                                            v3 = this.z;
                                                        }
                                                        v9 = v3.getState();
                                                        if (var1_1 == null) break block52;
                                                        if (!v9) break block53;
                                                        break block67;
                                                        catch (NumberFormatException v10) {
                                                            throw FN.a(v10);
                                                        }
                                                    }
                                                    v11 = this.s.length();
                                                    if (var1_1 == null) break block54;
                                                    break block68;
                                                    catch (NumberFormatException v12) {
                                                        throw FN.a(v12);
                                                    }
                                                }
                                                try {
                                                    block69: {
                                                        if (v11 != 0) break block55;
                                                        break block69;
                                                        catch (NumberFormatException v13) {
                                                            throw FN.a(v13);
                                                        }
                                                    }
                                                    this.k("User name is not set.");
                                                    return;
                                                }
                                                catch (NumberFormatException v14) {
                                                    throw FN.a(v14);
                                                }
                                            }
                                            try {
                                                v5 = this;
                                                if (var1_1 != null) {
                                                    v11 = v5.q.length();
                                                }
                                                ** GOTO lbl113
                                            }
                                            catch (NumberFormatException v15) {
                                                throw FN.a(v15);
                                            }
                                        }
                                        try {
                                            if (v11 == 0) {
                                                this.k("Password is not set.");
                                                return;
                                            }
                                            break block51;
                                        }
                                        catch (NumberFormatException v16) {
                                            throw FN.a(v16);
                                        }
                                    }
                                    try {
                                        v5 = this;
                                        if (var1_1 != null) {
                                            v9 = v5.M.getState();
                                        }
                                        ** GOTO lbl113
                                    }
                                    catch (NumberFormatException v17) {
                                        throw FN.a(v17);
                                    }
                                }
                                try {
                                    if (!v9) {
                                        this.k("Please select at least one Authentication Method.");
                                        return;
                                    }
                                }
                                catch (NumberFormatException v18) {
                                    throw FN.a(v18);
                                }
                            }
                            try {
                                v5 = this;
lbl113:
                                // 4 sources

                                v5.v = Integer.parseInt(this.k.getText());
                            }
                            catch (NumberFormatException var2_2) {
                                this.k("Proxy port is invalid!");
                                return;
                            }
                            try {
                                block57: {
                                    try {
                                        try {
                                            this.H = 1;
                                            v19 = FN.g;
                                            if (var1_1 == null) break block56;
                                            if (v19 == 0) break block57;
                                        }
                                        catch (NumberFormatException v20) {
                                            throw FN.a(v20);
                                        }
                                        this.K = new Thread(this);
                                        this.K.start();
                                        this.M("Looking up host: " + this.o);
                                        if (var1_1 != null) break block58;
                                    }
                                    catch (NumberFormatException v21) {
                                        throw FN.a(v21);
                                    }
                                }
                                v19 = this.R();
                            }
                            catch (NumberFormatException v22) {
                                throw FN.a(v22);
                            }
                        }
                        try {
                            try {
                                if (var1_1 == null) break block59;
                                if (v19 != 0) break block58;
                            }
                            catch (NumberFormatException v23) {
                                throw FN.a(v23);
                            }
                            this.k("Proxy host is invalid.");
                            this.H = 0;
                        }
                        catch (NumberFormatException v24) {
                            throw FN.a(v24);
                        }
                    }
                    try {
                        v25 = this;
                        if (var1_1 == null) break block60;
                        v19 = v25.H;
                    }
                    catch (NumberFormatException v26) {
                        throw FN.a(v26);
                    }
                }
                try {
                    if (v19 != 1) break block61;
                    v25 = this;
                }
                catch (NumberFormatException v27) {
                    throw FN.a(v27);
                }
            }
            v25.dispose();
        }
    }

    private void S() {
        this.p = null;
        this.dispose();
    }

    /*
     * Unable to fully structure code
     */
    private void b() {
        block8: {
            v0 = jk_0.Y();
            var2_1 = this.F.getText();
            var2_1.trim();
            var1_2 = v0;
            try {
                if (var2_1.length() == 0) {
                    return;
                }
            }
            catch (NumberFormatException v1) {
                throw FN.a(v1);
            }
            var3_3 = this.Y.getItems();
            var4_4 = 0;
            try {
                if (var1_2 == null) {
                    while (true) {
                        if (!var3_3[var4_4].equals(var2_1)) break block8;
                        break;
                    }
                }
                ** GOTO lbl26
            }
            catch (NumberFormatException v2) {
                throw FN.a(v2);
            }
            return;
        }
        do {
            ++var4_4;
lbl26:
            // 2 sources

            if (var4_4 < var3_3.length) ** continue;
            this.Y.add(var2_1);
            this.W.K(var2_1);
        } while (var1_2 == null);
    }

    private void W() {
        int n10;
        block2: {
            int n11;
            block3: {
                n10 = this.Y.getSelectedIndex();
                String[] stringArray = jk_0.Y();
                try {
                    n11 = n10;
                    if (stringArray == null) break block2;
                    if (n11 >= 0) break block3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw FN.a(numberFormatException);
                }
                return;
            }
            n11 = this.W.R(this.Y.getItem(n10)) ? 1 : 0;
        }
        this.Y.remove(n10);
        this.Y.select(n10);
    }

    private void U() {
        block14: {
            block17: {
                FN fN2;
                block15: {
                    Checkbox checkbox;
                    String[] stringArray;
                    block12: {
                        Checkbox checkbox2 = this.c.getSelectedCheckbox();
                        stringArray = jk_0.Y();
                        try {
                            try {
                                block13: {
                                    try {
                                        try {
                                            checkbox = checkbox2;
                                            if (stringArray == null) break block12;
                                            if (checkbox != this.I) break block13;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw FN.a(numberFormatException);
                                        }
                                        this.h.setEnabled(true);
                                        this.B.setEnabled(false);
                                        this.M.setEnabled(false);
                                        this.z.setEnabled(false);
                                        if (stringArray != null) break block14;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw FN.a(numberFormatException);
                                    }
                                }
                                fN2 = this;
                                if (stringArray == null) break block15;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw FN.a(numberFormatException);
                            }
                            checkbox = fN2.z;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw FN.a(numberFormatException);
                        }
                    }
                    try {
                        block16: {
                            try {
                                if (!checkbox.getState()) break block16;
                                this.h.setEnabled(true);
                                this.B.setEnabled(true);
                                if (stringArray != null) break block17;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw FN.a(numberFormatException);
                            }
                        }
                        this.h.setEnabled(false);
                        fN2 = this;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw FN.a(numberFormatException);
                    }
                }
                fN2.B.setEnabled(false);
            }
            this.M.setEnabled(true);
            this.z.setEnabled(true);
        }
    }

    private void C() {
        block8: {
            FN fN2;
            block6: {
                String[] stringArray = jk_0.Y();
                try {
                    block7: {
                        try {
                            try {
                                fN2 = this;
                                if (stringArray == null) break block6;
                                if (!fN2.z.getState()) break block7;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw FN.a(numberFormatException);
                            }
                            this.h.setEnabled(true);
                            this.B.setEnabled(true);
                            if (stringArray != null) break block8;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw FN.a(numberFormatException);
                        }
                    }
                    this.h.setEnabled(false);
                    fN2 = this;
                }
                catch (NumberFormatException numberFormatException) {
                    throw FN.a(numberFormatException);
                }
            }
            fN2.B.setEnabled(false);
        }
    }

    private void u() {
        block9: {
            Thread thread;
            block10: {
                FN fN2;
                String[] stringArray;
                block8: {
                    String[] stringArray2 = jk_0.Y();
                    this.X.dispose();
                    stringArray = stringArray2;
                    try {
                        try {
                            fN2 = this;
                            if (stringArray == null) break block8;
                            if (fN2.H != 1) break block9;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw FN.a(numberFormatException);
                        }
                        this.H = 0;
                        fN2 = this;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw FN.a(numberFormatException);
                    }
                }
                try {
                    try {
                        thread = fN2.K;
                        if (stringArray == null) break block10;
                        if (thread == null) break block9;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw FN.a(numberFormatException);
                    }
                    thread = this.K;
                }
                catch (NumberFormatException numberFormatException) {
                    throw FN.a(numberFormatException);
                }
            }
            thread.interrupt();
        }
    }

    /*
     * Unable to fully structure code
     */
    private void O(y_0 var1_1) {
        block23: {
            block24: {
                block20: {
                    block21: {
                        block22: {
                            var2_2 = jk_0.Y();
                            try {
                                try {
                                    try {
                                        try {
                                            if (var2_2 == null) break block20;
                                            if (var1_1.w == 5) {
                                            }
                                            ** GOTO lbl47
                                        }
                                        catch (NumberFormatException v0) {
                                            throw FN.a(v0);
                                        }
                                        this.c.setSelectedCheckbox(this.u);
                                        this.U();
                                        v1 = ((c)var1_1).M(0);
                                        if (var2_2 == null) break block21;
                                    }
                                    catch (NumberFormatException v2) {
                                        throw FN.a(v2);
                                    }
                                    if (v1 == null) break block22;
                                }
                                catch (NumberFormatException v3) {
                                    throw FN.a(v3);
                                }
                                this.M.setState(true);
                            }
                            catch (NumberFormatException v4) {
                                throw FN.a(v4);
                            }
                        }
                        v1 = ((c)var1_1).M(2);
                    }
                    var3_3 = (zT)v1;
                    try {
                        try {
                            try {
                                if (var2_2 == null) break block23;
                                if (var3_3 == null) break block24;
                            }
                            catch (NumberFormatException v5) {
                                throw FN.a(v5);
                            }
                            this.h.setText(var3_3.h());
                            this.B.setText(var3_3.P());
                            this.z.setState(true);
                            this.C();
                            if (var2_2 != null) break block24;
                        }
                        catch (NumberFormatException v6) {
                            throw FN.a(v6);
                        }
lbl47:
                        // 2 sources

                        this.c.setSelectedCheckbox(this.I);
                        this.U();
                    }
                    catch (NumberFormatException v7) {
                        throw FN.a(v7);
                    }
                }
                this.h.setText(((x_0)var1_1).i);
            }
            this.W = (TR)var1_1.s.clone();
        }
        var3_3 = this.W.D();
        this.Y.removeAll();
        var4_4 = 0;
        try {
            if (var2_2 == null) {
                while (true) {
                    this.Y.add(var3_3[var4_4]);
                    break;
                }
            }
            ** GOTO lbl70
        }
        catch (NumberFormatException v8) {
            throw FN.a(v8);
        }
        do {
            ++var4_4;
lbl70:
            // 2 sources

            if (var4_4 < ((String[])var3_3).length) ** continue;
            this.J.setText(var1_1.v.getHostName());
            this.k.setText("" + var1_1.k);
        } while (var2_2 == null);
    }

    /*
     * Unable to fully structure code
     */
    private boolean R() {
        block19: {
            block20: {
                var1_1 = jk_0.Y();
                try {
                    block16: {
                        block24: {
                            block17: {
                                block18: {
                                    block22: {
                                        block21: {
                                            v0 = this;
                                            if (var1_1 == null) break block16;
                                            if (v0.c.getSelectedCheckbox() != this.u) ** GOTO lbl49
                                            break block21;
                                            catch (UnknownHostException v1) {
                                                throw FN.a(v1);
                                            }
                                        }
                                        this.p = new c(this.o, this.v);
                                        v2 = this.z.getState();
                                        if (var1_1 == null) break block17;
                                        break block22;
                                        catch (UnknownHostException v3) {
                                            throw FN.a(v3);
                                        }
                                    }
                                    try {
                                        block23: {
                                            if (!v2) break block18;
                                            break block23;
                                            catch (UnknownHostException v4) {
                                                throw FN.a(v4);
                                            }
                                        }
                                        ((c)this.p).d(2, new zT(this.s, this.q));
                                    }
                                    catch (UnknownHostException v5) {
                                        throw FN.a(v5);
                                    }
                                }
                                v2 = this.M.getState();
                            }
                            if (var1_1 == null) break block19;
                            if (v2) break block20;
                            break block24;
                            catch (UnknownHostException v6) {
                                throw FN.a(v6);
                            }
                        }
                        try {
                            block25: {
                                ((c)this.p).d(0, null);
                                if (var1_1 != null) break block20;
                                break block25;
                                catch (UnknownHostException v7) {
                                    throw FN.a(v7);
                                }
                            }
                            v0 = this;
                        }
                        catch (UnknownHostException v8) {
                            throw FN.a(v8);
                        }
                    }
                    v0.p = new x_0(this.o, this.v, this.s);
                }
                catch (UnknownHostException var2_2) {
                    return false;
                }
            }
            this.p.s = this.W;
            v2 = true;
        }
        return v2;
    }

    private void M(String string) {
        this.r("Info", string);
    }

    private void k(String string) {
        this.r("Warning", string);
    }

    private void r(String string, String string2) {
        this.r.setText(string2);
        this.r.invalidate();
        this.X.setTitle(string);
        this.X.pack();
        this.X.show();
    }

    void r() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Font font = new Font("Dialog", 0, FN.a(6807, 775895429429400695L));
        FN fN2 = this;
        fN2.setLayout(new GridBagLayout());
        fN2.setFont(font);
        ((Component)fN2).setBackground(SystemColor.menu);
        gridBagConstraints.insets = new Insets(3, 3, 3, 3);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(31470, 2298113761938207773L);
        Label label = new Label("Host:");
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(15795, 5163532686765994833L);
        this.J = new TextField("socks-proxy", FN.a(15850, 2117661140740485897L));
        fN2.add((Component)this.J, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(31470, 2298113761938207773L);
        label = new Label("Port:");
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.k = new TextField("1080", 5);
        fN2.add((Component)this.k, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(21132, 4478431141609462909L);
        this.I = new Checkbox("Socks4", this.c, false);
        this.I.setFont(new Font(font.getName(), 1, FN.a(25249, 3705123695549049926L)));
        String[] stringArray = jk_0.Y();
        fN2.add((Component)this.I, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        this.u = new Checkbox("Socks5", this.c, true);
        this.u.setFont(new Font(font.getName(), 1, FN.a(27537, 5300129419818853754L)));
        fN2.add((Component)this.u, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(1061, 7744224220449016513L);
        label = new Label("User Id:");
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.h = new TextField("", FN.a(15267, 4019817827809637710L));
        this.h.setEnabled(false);
        fN2.add((Component)this.h, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        label = new Label("Authentication");
        label.setFont(new Font(font.getName(), 1, FN.a(27537, 5300129419818853754L)));
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(21080, 6569904376572730551L);
        label = new Label("Password:");
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.B = new TextField("", FN.a(15267, 4019817827809637710L));
        this.B.setEchoChar((char)FN.a(10224, 2020424530237761822L));
        String[] stringArray2 = stringArray;
        this.B.setEnabled(false);
        fN2.add((Component)this.B, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.M = new Checkbox("None", true);
        fN2.add((Component)this.M, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        label = new Label("Direct Hosts");
        label.setFont(new Font(font.getName(), 1, FN.a(27537, 5300129419818853754L)));
        fN2.add((Component)label, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.z = new Checkbox("User/Password", false);
        fN2.add((Component)this.z, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        gridBagConstraints.fill = 1;
        this.Y = new List(3);
        fN2.add((Component)this.Y, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.N = new Checkbox("GSSAPI", false);
        this.N.setEnabled(false);
        fN2.add((Component)this.N, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = FN.a(13840, 8367348394847516920L);
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.F = new TextField("", FN.a(1504, 314711578769033989L));
        fN2.add((Component)this.F, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = FN.a(9612, 6017605938358299493L);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        this.D = new Button("Add");
        fN2.add((Component)this.D, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = FN.a(12829, 161375588412013820L);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        this.b = new Button("Remove");
        fN2.add((Component)this.b, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = FN.a(29454, 2385359241553444322L);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(16008, 3956738837904666734L);
        this.j = new Button("Cancel");
        fN2.add((Component)this.j, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = FN.a(593, 2941640922776243387L);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.anchor = FN.a(26802, 7832136317888521792L);
        this.w = new Button("OK");
        fN2.add((Component)this.w, gridBagConstraints);
        this.R = new Button("Dismiss");
        this.r = new Label("", 1);
        this.r.setFont(new Font("Dialog", 1, FN.a(15267, 4019817827809637710L)));
        Panel panel = new Panel();
        try {
            panel.add(this.R);
            this.X.add((Component)panel, "South");
            this.X.add((Component)this.r, "Center");
            this.X.setResizable(false);
            if (stringArray2 == null) {
                ky_2.K(new String[4]);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw FN.a(numberFormatException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF85B9) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 190;
                    break;
                }
                case 1: {
                    n14 = 185;
                    break;
                }
                case 2: {
                    n14 = 208;
                    break;
                }
                case 3: {
                    n14 = 236;
                    break;
                }
                case 4: {
                    n14 = 238;
                    break;
                }
                case 5: {
                    n14 = 11;
                    break;
                }
                case 6: {
                    n14 = 207;
                    break;
                }
                case 7: {
                    n14 = 78;
                    break;
                }
                case 8: {
                    n14 = 56;
                    break;
                }
                case 9: {
                    n14 = 85;
                    break;
                }
                case 10: {
                    n14 = 6;
                    break;
                }
                case 11: {
                    n14 = 110;
                    break;
                }
                case 12: {
                    n14 = 235;
                    break;
                }
                case 13: {
                    n14 = 249;
                    break;
                }
                case 14: {
                    n14 = 88;
                    break;
                }
                case 15: {
                    n14 = 186;
                    break;
                }
                case 16: {
                    n14 = 2;
                    break;
                }
                case 17: {
                    n14 = 70;
                    break;
                }
                case 18: {
                    n14 = 215;
                    break;
                }
                case 19: {
                    n14 = 143;
                    break;
                }
                case 20: {
                    n14 = 20;
                    break;
                }
                case 21: {
                    n14 = 77;
                    break;
                }
                case 22: {
                    n14 = 119;
                    break;
                }
                case 23: {
                    n14 = 74;
                    break;
                }
                case 24: {
                    n14 = 187;
                    break;
                }
                case 25: {
                    n14 = 79;
                    break;
                }
                case 26: {
                    n14 = 72;
                    break;
                }
                case 27: {
                    n14 = 51;
                    break;
                }
                case 28: {
                    n14 = 241;
                    break;
                }
                case 29: {
                    n14 = 64;
                    break;
                }
                case 30: {
                    n14 = 73;
                    break;
                }
                case 31: {
                    n14 = 147;
                    break;
                }
                case 32: {
                    n14 = 170;
                    break;
                }
                case 33: {
                    n14 = 146;
                    break;
                }
                case 34: {
                    n14 = 60;
                    break;
                }
                case 35: {
                    n14 = 131;
                    break;
                }
                case 36: {
                    n14 = 152;
                    break;
                }
                case 37: {
                    n14 = 156;
                    break;
                }
                case 38: {
                    n14 = 98;
                    break;
                }
                case 39: {
                    n14 = 223;
                    break;
                }
                case 40: {
                    n14 = 125;
                    break;
                }
                case 41: {
                    n14 = 102;
                    break;
                }
                case 42: {
                    n14 = 168;
                    break;
                }
                case 43: {
                    n14 = 255;
                    break;
                }
                case 44: {
                    n14 = 248;
                    break;
                }
                case 45: {
                    n14 = 3;
                    break;
                }
                case 46: {
                    n14 = 63;
                    break;
                }
                case 47: {
                    n14 = 23;
                    break;
                }
                case 48: {
                    n14 = 144;
                    break;
                }
                case 49: {
                    n14 = 210;
                    break;
                }
                case 50: {
                    n14 = 97;
                    break;
                }
                case 51: {
                    n14 = 113;
                    break;
                }
                case 52: {
                    n14 = 160;
                    break;
                }
                case 53: {
                    n14 = 145;
                    break;
                }
                case 54: {
                    n14 = 254;
                    break;
                }
                case 55: {
                    n14 = 31;
                    break;
                }
                case 56: {
                    n14 = 213;
                    break;
                }
                case 57: {
                    n14 = 59;
                    break;
                }
                case 58: {
                    n14 = 36;
                    break;
                }
                case 59: {
                    n14 = 151;
                    break;
                }
                case 60: {
                    n14 = 62;
                    break;
                }
                case 61: {
                    n14 = 43;
                    break;
                }
                case 62: {
                    n14 = 224;
                    break;
                }
                case 63: {
                    n14 = 10;
                    break;
                }
                case 64: {
                    n14 = 164;
                    break;
                }
                case 65: {
                    n14 = 35;
                    break;
                }
                case 66: {
                    n14 = 105;
                    break;
                }
                case 67: {
                    n14 = 188;
                    break;
                }
                case 68: {
                    n14 = 158;
                    break;
                }
                case 69: {
                    n14 = 15;
                    break;
                }
                case 70: {
                    n14 = 167;
                    break;
                }
                case 71: {
                    n14 = 115;
                    break;
                }
                case 72: {
                    n14 = 177;
                    break;
                }
                case 73: {
                    n14 = 81;
                    break;
                }
                case 74: {
                    n14 = 138;
                    break;
                }
                case 75: {
                    n14 = 232;
                    break;
                }
                case 76: {
                    n14 = 33;
                    break;
                }
                case 77: {
                    n14 = 247;
                    break;
                }
                case 78: {
                    n14 = 173;
                    break;
                }
                case 79: {
                    n14 = 124;
                    break;
                }
                case 80: {
                    n14 = 191;
                    break;
                }
                case 81: {
                    n14 = 96;
                    break;
                }
                case 82: {
                    n14 = 237;
                    break;
                }
                case 83: {
                    n14 = 252;
                    break;
                }
                case 84: {
                    n14 = 101;
                    break;
                }
                case 85: {
                    n14 = 166;
                    break;
                }
                case 86: {
                    n14 = 198;
                    break;
                }
                case 87: {
                    n14 = 211;
                    break;
                }
                case 88: {
                    n14 = 140;
                    break;
                }
                case 89: {
                    n14 = 139;
                    break;
                }
                case 90: {
                    n14 = 217;
                    break;
                }
                case 91: {
                    n14 = 13;
                    break;
                }
                case 92: {
                    n14 = 226;
                    break;
                }
                case 93: {
                    n14 = 240;
                    break;
                }
                case 94: {
                    n14 = 89;
                    break;
                }
                case 95: {
                    n14 = 153;
                    break;
                }
                case 96: {
                    n14 = 212;
                    break;
                }
                case 97: {
                    n14 = 171;
                    break;
                }
                case 98: {
                    n14 = 69;
                    break;
                }
                case 99: {
                    n14 = 19;
                    break;
                }
                case 100: {
                    n14 = 57;
                    break;
                }
                case 101: {
                    n14 = 114;
                    break;
                }
                case 102: {
                    n14 = 123;
                    break;
                }
                case 103: {
                    n14 = 244;
                    break;
                }
                case 104: {
                    n14 = 117;
                    break;
                }
                case 105: {
                    n14 = 95;
                    break;
                }
                case 106: {
                    n14 = 22;
                    break;
                }
                case 107: {
                    n14 = 130;
                    break;
                }
                case 108: {
                    n14 = 39;
                    break;
                }
                case 109: {
                    n14 = 106;
                    break;
                }
                case 110: {
                    n14 = 53;
                    break;
                }
                case 111: {
                    n14 = 41;
                    break;
                }
                case 112: {
                    n14 = 222;
                    break;
                }
                case 113: {
                    n14 = 253;
                    break;
                }
                case 114: {
                    n14 = 108;
                    break;
                }
                case 115: {
                    n14 = 118;
                    break;
                }
                case 116: {
                    n14 = 154;
                    break;
                }
                case 117: {
                    n14 = 30;
                    break;
                }
                case 118: {
                    n14 = 127;
                    break;
                }
                case 119: {
                    n14 = 28;
                    break;
                }
                case 120: {
                    n14 = 209;
                    break;
                }
                case 121: {
                    n14 = 227;
                    break;
                }
                case 122: {
                    n14 = 245;
                    break;
                }
                case 123: {
                    n14 = 192;
                    break;
                }
                case 124: {
                    n14 = 250;
                    break;
                }
                case 125: {
                    n14 = 228;
                    break;
                }
                case 126: {
                    n14 = 1;
                    break;
                }
                case 127: {
                    n14 = 68;
                    break;
                }
                case 128: {
                    n14 = 194;
                    break;
                }
                case 129: {
                    n14 = 169;
                    break;
                }
                case 130: {
                    n14 = 219;
                    break;
                }
                case 131: {
                    n14 = 200;
                    break;
                }
                case 132: {
                    n14 = 161;
                    break;
                }
                case 133: {
                    n14 = 91;
                    break;
                }
                case 134: {
                    n14 = 32;
                    break;
                }
                case 135: {
                    n14 = 99;
                    break;
                }
                case 136: {
                    n14 = 128;
                    break;
                }
                case 137: {
                    n14 = 178;
                    break;
                }
                case 138: {
                    n14 = 44;
                    break;
                }
                case 139: {
                    n14 = 231;
                    break;
                }
                case 140: {
                    n14 = 75;
                    break;
                }
                case 141: {
                    n14 = 47;
                    break;
                }
                case 142: {
                    n14 = 205;
                    break;
                }
                case 143: {
                    n14 = 112;
                    break;
                }
                case 144: {
                    n14 = 243;
                    break;
                }
                case 145: {
                    n14 = 233;
                    break;
                }
                case 146: {
                    n14 = 38;
                    break;
                }
                case 147: {
                    n14 = 7;
                    break;
                }
                case 148: {
                    n14 = 8;
                    break;
                }
                case 149: {
                    n14 = 87;
                    break;
                }
                case 150: {
                    n14 = 104;
                    break;
                }
                case 151: {
                    n14 = 16;
                    break;
                }
                case 152: {
                    n14 = 122;
                    break;
                }
                case 153: {
                    n14 = 165;
                    break;
                }
                case 154: {
                    n14 = 0;
                    break;
                }
                case 155: {
                    n14 = 239;
                    break;
                }
                case 156: {
                    n14 = 242;
                    break;
                }
                case 157: {
                    n14 = 181;
                    break;
                }
                case 158: {
                    n14 = 129;
                    break;
                }
                case 159: {
                    n14 = 189;
                    break;
                }
                case 160: {
                    n14 = 100;
                    break;
                }
                case 161: {
                    n14 = 157;
                    break;
                }
                case 162: {
                    n14 = 45;
                    break;
                }
                case 163: {
                    n14 = 204;
                    break;
                }
                case 164: {
                    n14 = 111;
                    break;
                }
                case 165: {
                    n14 = 251;
                    break;
                }
                case 166: {
                    n14 = 29;
                    break;
                }
                case 167: {
                    n14 = 135;
                    break;
                }
                case 168: {
                    n14 = 229;
                    break;
                }
                case 169: {
                    n14 = 180;
                    break;
                }
                case 170: {
                    n14 = 183;
                    break;
                }
                case 171: {
                    n14 = 136;
                    break;
                }
                case 172: {
                    n14 = 37;
                    break;
                }
                case 173: {
                    n14 = 121;
                    break;
                }
                case 174: {
                    n14 = 133;
                    break;
                }
                case 175: {
                    n14 = 80;
                    break;
                }
                case 176: {
                    n14 = 46;
                    break;
                }
                case 177: {
                    n14 = 159;
                    break;
                }
                case 178: {
                    n14 = 175;
                    break;
                }
                case 179: {
                    n14 = 195;
                    break;
                }
                case 180: {
                    n14 = 54;
                    break;
                }
                case 181: {
                    n14 = 84;
                    break;
                }
                case 182: {
                    n14 = 214;
                    break;
                }
                case 183: {
                    n14 = 55;
                    break;
                }
                case 184: {
                    n14 = 141;
                    break;
                }
                case 185: {
                    n14 = 142;
                    break;
                }
                case 186: {
                    n14 = 176;
                    break;
                }
                case 187: {
                    n14 = 134;
                    break;
                }
                case 188: {
                    n14 = 150;
                    break;
                }
                case 189: {
                    n14 = 27;
                    break;
                }
                case 190: {
                    n14 = 199;
                    break;
                }
                case 191: {
                    n14 = 40;
                    break;
                }
                case 192: {
                    n14 = 71;
                    break;
                }
                case 193: {
                    n14 = 230;
                    break;
                }
                case 194: {
                    n14 = 184;
                    break;
                }
                case 195: {
                    n14 = 206;
                    break;
                }
                case 196: {
                    n14 = 9;
                    break;
                }
                case 197: {
                    n14 = 196;
                    break;
                }
                case 198: {
                    n14 = 174;
                    break;
                }
                case 199: {
                    n14 = 225;
                    break;
                }
                case 200: {
                    n14 = 126;
                    break;
                }
                case 201: {
                    n14 = 203;
                    break;
                }
                case 202: {
                    n14 = 216;
                    break;
                }
                case 203: {
                    n14 = 24;
                    break;
                }
                case 204: {
                    n14 = 163;
                    break;
                }
                case 205: {
                    n14 = 18;
                    break;
                }
                case 206: {
                    n14 = 93;
                    break;
                }
                case 207: {
                    n14 = 67;
                    break;
                }
                case 208: {
                    n14 = 50;
                    break;
                }
                case 209: {
                    n14 = 61;
                    break;
                }
                case 210: {
                    n14 = 107;
                    break;
                }
                case 211: {
                    n14 = 52;
                    break;
                }
                case 212: {
                    n14 = 162;
                    break;
                }
                case 213: {
                    n14 = 25;
                    break;
                }
                case 214: {
                    n14 = 132;
                    break;
                }
                case 215: {
                    n14 = 42;
                    break;
                }
                case 216: {
                    n14 = 14;
                    break;
                }
                case 217: {
                    n14 = 116;
                    break;
                }
                case 218: {
                    n14 = 179;
                    break;
                }
                case 219: {
                    n14 = 220;
                    break;
                }
                case 220: {
                    n14 = 65;
                    break;
                }
                case 221: {
                    n14 = 197;
                    break;
                }
                case 222: {
                    n14 = 202;
                    break;
                }
                case 223: {
                    n14 = 92;
                    break;
                }
                case 224: {
                    n14 = 83;
                    break;
                }
                case 225: {
                    n14 = 246;
                    break;
                }
                case 226: {
                    n14 = 94;
                    break;
                }
                case 227: {
                    n14 = 86;
                    break;
                }
                case 228: {
                    n14 = 5;
                    break;
                }
                case 229: {
                    n14 = 103;
                    break;
                }
                case 230: {
                    n14 = 17;
                    break;
                }
                case 231: {
                    n14 = 48;
                    break;
                }
                case 232: {
                    n14 = 34;
                    break;
                }
                case 233: {
                    n14 = 221;
                    break;
                }
                case 234: {
                    n14 = 12;
                    break;
                }
                case 235: {
                    n14 = 76;
                    break;
                }
                case 236: {
                    n14 = 218;
                    break;
                }
                case 237: {
                    n14 = 21;
                    break;
                }
                case 238: {
                    n14 = 82;
                    break;
                }
                case 239: {
                    n14 = 148;
                    break;
                }
                case 240: {
                    n14 = 109;
                    break;
                }
                case 241: {
                    n14 = 155;
                    break;
                }
                case 242: {
                    n14 = 58;
                    break;
                }
                case 243: {
                    n14 = 90;
                    break;
                }
                case 244: {
                    n14 = 193;
                    break;
                }
                case 245: {
                    n14 = 234;
                    break;
                }
                case 246: {
                    n14 = 49;
                    break;
                }
                case 247: {
                    n14 = 26;
                    break;
                }
                case 248: {
                    n14 = 149;
                    break;
                }
                case 249: {
                    n14 = 182;
                    break;
                }
                case 250: {
                    n14 = 66;
                    break;
                }
                case 251: {
                    n14 = 137;
                    break;
                }
                case 252: {
                    n14 = 120;
                    break;
                }
                case 253: {
                    n14 = 172;
                    break;
                }
                case 254: {
                    n14 = 201;
                    break;
                }
                default: {
                    n14 = 4;
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
            FN.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xEE3;
        if (f[n11] == null) {
            FN.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

