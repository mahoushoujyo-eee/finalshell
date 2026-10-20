/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashSet;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/*
 * Renamed from fx
 */
public class fx_2 {
    public static int v;
    m6 e;
    public static Font j;
    public static Font U;
    public static Font i;
    public static Font J;
    public static Font D;
    public static Font q;
    public static Font T;
    public static Font n;
    public static Font X;
    public static Font N;
    public static Font a;
    public static Font A;
    public static Font S;
    public static Font B;
    public static Font f;
    public static Font r;
    public static Font b;
    public static Font H;
    public static Font k;
    public static Font M;
    public static Font g;
    public static Font z;
    public static Color p;
    public static Color s;
    public static Color m;
    public static Color R;
    public static Color E;
    public static Color o;
    public static String c;
    Window Q;
    private static final String[] d;
    private static final String[] h;
    private static final long[] l;
    private static final Integer[] t;
    private static final long u;

    public fx_2() {
        long l2 = u;
        Toolkit.getDefaultToolkit().addAWTEventListener(new tm_2(this), l2);
    }

    public void E(String string) {
        try {
            this.e.w(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void L() {
        try {
            this.e.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void J() {
        String[] stringArray = F8.y();
        if (stringArray == null) {
            boolean bl;
            try {
                bl = (Boolean)vk_0.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) {
                try {
                    fx_2.f("TextField.focusInputMap");
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    fx_2.f("TextField.focusInputMap");
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    fx_2.f("TextArea.focusInputMap");
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    fx_2.f("FormattedTextField.focusInputMap");
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            try {
                fx_2.f("PasswordField.focusInputMap");
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        ActionMap actionMap = (ActionMap)UIManager.get("TextField.actionMap");
        this.e = new m6();
        try {
            this.e.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void j() {
        block35: {
            int n10;
            block36: {
                Object object;
                block39: {
                    boolean bl;
                    String string;
                    block42: {
                        HashSet hashSet;
                        String string2;
                        String[] stringArray;
                        block40: {
                            String string3;
                            block37: {
                                Font font;
                                stringArray = F8.y();
                                try {
                                    InputStream inputStream = la_0.class.getResourceAsStream("/fontawesome-webfont.ttf");
                                    font = Font.createFont(0, inputStream);
                                    fx_2.N = font.deriveFont(0, 8.0f);
                                    fx_2.a = font.deriveFont(0, 10.0f);
                                    fx_2.A = font.deriveFont(0, 11.0f);
                                    fx_2.S = font.deriveFont(0, 12.0f);
                                    fx_2.B = font.deriveFont(0, 13.0f);
                                    fx_2.f = font.deriveFont(0, 14.0f);
                                    fx_2.r = font.deriveFont(0, 15.0f);
                                    fx_2.b = font.deriveFont(0, 16.0f);
                                    fx_2.H = font.deriveFont(0, 17.0f);
                                    fx_2.k = font.deriveFont(0, 18.0f);
                                    fx_2.M = font.deriveFont(0, 19.0f);
                                    fx_2.g = font.deriveFont(0, 20.0f);
                                    fx_2.z = font.deriveFont(0, 30.0f);
                                }
                                catch (FontFormatException fontFormatException) {
                                    fontFormatException.printStackTrace();
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                                ToolTipManager.sharedInstance().setInitialDelay(fx_2.a(551, 6111599415947750858L));
                                ToolTipManager.sharedInstance().setDismissDelay(fx_2.a(2851, 1680098619616748760L));
                                fx_2.c = "SimSun";
                                n10 = fx_2.a(15018, 3893654096664941915L);
                                font = new JTextArea().getFont();
                                fx_2.c = font.getName();
                                n10 = font.getSize();
                                try {
                                    boolean bl2;
                                    fx_2.j = font;
                                    if (stringArray != null) break block35;
                                    try {
                                        bl2 = (Boolean)vk_0.s();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (!bl2) break block36;
                                }
                                catch (FontFormatException fontFormatException) {
                                    throw fx_2.a(fontFormatException);
                                }
                                string = "Microsoft YaHei UI";
                                String string4 = "Microsoft YaHei";
                                string3 = "NSimSun";
                                string2 = "SimSun";
                                hashSet = (HashSet)yt_1.j;
                                try {
                                    block38: {
                                        try {
                                            try {
                                                bl = hashSet.contains(string4);
                                                if (stringArray != null) break block37;
                                                if (bl) {
                                                }
                                                break block38;
                                            }
                                            catch (FontFormatException fontFormatException) {
                                                throw fx_2.a(fontFormatException);
                                            }
                                            fx_2.c = string4;
                                            if (stringArray == null) break block39;
                                        }
                                        catch (FontFormatException fontFormatException) {
                                            throw fx_2.a(fontFormatException);
                                        }
                                    }
                                    bl = hashSet.contains(string3);
                                }
                                catch (FontFormatException fontFormatException) {
                                    throw fx_2.a(fontFormatException);
                                }
                            }
                            try {
                                block41: {
                                    try {
                                        try {
                                            if (stringArray != null) break block40;
                                            if (bl) {
                                            }
                                            break block41;
                                        }
                                        catch (FontFormatException fontFormatException) {
                                            throw fx_2.a(fontFormatException);
                                        }
                                        fx_2.c = string3;
                                        if (stringArray == null) break block39;
                                    }
                                    catch (FontFormatException fontFormatException) {
                                        throw fx_2.a(fontFormatException);
                                    }
                                }
                                bl = hashSet.contains(string2);
                            }
                            catch (FontFormatException fontFormatException) {
                                throw fx_2.a(fontFormatException);
                            }
                        }
                        try {
                            block43: {
                                try {
                                    try {
                                        if (stringArray != null) break block42;
                                        if (bl) {
                                        }
                                        break block43;
                                    }
                                    catch (FontFormatException fontFormatException) {
                                        throw fx_2.a(fontFormatException);
                                    }
                                    fx_2.c = string2;
                                    if (stringArray == null) break block39;
                                }
                                catch (FontFormatException fontFormatException) {
                                    throw fx_2.a(fontFormatException);
                                }
                            }
                            bl = hashSet.contains(string);
                        }
                        catch (FontFormatException fontFormatException) {
                            throw fx_2.a(fontFormatException);
                        }
                    }
                    try {
                        if (bl) {
                            fx_2.c = string;
                        }
                    }
                    catch (FontFormatException fontFormatException) {
                        throw fx_2.a(fontFormatException);
                    }
                }
                try {
                    object = lk_0.T(fx_2.c, 0, n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                fx_2.j = object;
            }
            fx_2.U = ((Font)fx_2.j).deriveFont(1, n10);
            fx_2.i = ((Font)fx_2.j).deriveFont(fx_2.a(7907, 8122239910078673181L));
            fx_2.J = ((Font)fx_2.j).deriveFont(fx_2.a(11663, 2896991060058391165L));
            fx_2.D = ((Font)fx_2.j).deriveFont(fx_2.a(19939, 1949074466987844108L));
            fx_2.q = ((Font)fx_2.j).deriveFont(fx_2.a(12791, 5223701907106717197L));
            fx_2.T = ((Font)fx_2.j).deriveFont(fx_2.a(1567, 4946749241001503209L));
            fx_2.n = ((Font)fx_2.j).deriveFont(fx_2.a(22471, 1945943143214266415L));
            fx_2.X = ((Font)fx_2.j).deriveFont(0, n10 - 1);
            try {
                fx_2.g(fx_2.j);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public static void b() {
        FlatLightLaf.setup();
    }

    public static void f(String string) {
        InputMap inputMap = (InputMap)UIManager.get(string);
        inputMap.put(KeyStroke.getKeyStroke(fx_2.a(13311, 1184978355668704282L), fx_2.a(22442, 8972681888753596481L)), "copy-to-clipboard");
        inputMap.put(KeyStroke.getKeyStroke(fx_2.a(15854, 1537326669510562323L), fx_2.a(25986, 8707905483881745003L)), "paste-from-clipboard");
        inputMap.put(KeyStroke.getKeyStroke(fx_2.a(20906, 4029422088455241309L), fx_2.a(25986, 8707905483881745003L)), "cut-to-clipboard");
    }

    public static boolean n(String string) {
        boolean bl = false;
        String[] stringArray = F8.y();
        boolean bl2 = ((HashSet)yt_1.j).contains(string);
        if (stringArray == null) {
            if (bl2) {
                Font font;
                try {
                    font = (Font)lk_0.T((Object)string, 0, fx_2.a(27761, 1997397399076340626L));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Font font2 = font;
                bl = font2.canDisplay((char)fx_2.a(4436, 1528345745248353956L));
            }
            bl2 = bl;
        }
        return bl2;
    }

    private static void g(Font font) {
        FontUIResource fontUIResource = new FontUIResource(font);
        Enumeration enumeration = UIManager.getDefaults().keys();
        String[] stringArray = F8.y();
        while (enumeration.hasMoreElements()) {
            Object object;
            Object k2 = enumeration.nextElement();
            Object object2 = object = UIManager.get(k2);
            if (stringArray == null && object2 instanceof FontUIResource) {
                object2 = UIManager.put(k2, fontUIResource);
            }
            if (stringArray == null) continue;
        }
    }

    public static Font o() {
        return (Font)fx_2.j;
    }

    public static void u(Font font) {
        fx_2.j = font;
    }

    public m6 G() {
        return (m6)this.e;
    }

    public void G(m6 m62) {
        this.e = m62;
    }

    public Window z() {
        return (Window)this.Q;
    }

    public void u(Window window) {
        this.Q = window;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var15 = new String[15];
                            var13_1 = 0;
                            var12_2 = "\u0093t\u00d6\u008c\u00b4\u00e5N\u000e\u00bc\u00fe\bsq@\u0004lr\u0014\u00d4-Le\u00cc-\t:p\u00cdX'\u00b9\u00bd\u00c3\u0005\u00b2\u0016\u009b\u00bd\u0006\u00c3\u0090\u00f7\u00fcv\u009e\u0012\u00e0\u00c6@\u0017U\u00fbxam}\u00f7\u00d7\u0092\u00ed\u001f\u00c0)\u008c\u0007\u00ae\u0083\u00e0\u00dd6X\u00ae\u0006\u00cb\u00ea\u00f6\u00b3Vw\u000fQAv\u00e7\u0093\u00e5\u00a0\u00a2v\u0005\u0094\u00d8\u00fe\f\u0092\u001b\u00d1\u00b0\u00c8\u00d1N\u001e\u001d@MR\u00bb_\u008c\u001bzs]`\u00ea\u00c8\u0011l`\\c-\u00ae\u0017>b\u00ba\b[\u00c4\u00bf\u00d5\u00ce\u00ae\u00aelJEP\u00ae\u00a2<\u00bf\u00db^\u0085\u00cb\u0016\u00c93D\"\u0083\u009aCk\u001b\u009d\u001eGb\u00ab\u00bb\u0092\u00bc}\u00a0o\u00b0\u001c\u0018\u00eb\u00ae\u0003\u00e8\u00ab\u0089\u00c7|\u0086\u00f2Y\u0084\u0090\u0011\u009aM'\u0011\u001d\u0082\u0011\u00bb)0 \u00f9\u0094\u0018\u0084crj\u00b4G\u00d0\u009c\u0081x>\u00f9\u00b8\u00ccCk\u00b0\u00d6\u00ba\u00b9\u00f0\\P\u00cd\u00e3\u00d6~\u009a\u00a2\u0010w\u001eN\u00ccz(\u00a7\u0081\u0084\u008d\u00f8\u00aaX%\u009e\u0019";
                            var14_3 = "\u0093t\u00d6\u008c\u00b4\u00e5N\u000e\u00bc\u00fe\bsq@\u0004lr\u0014\u00d4-Le\u00cc-\t:p\u00cdX'\u00b9\u00bd\u00c3\u0005\u00b2\u0016\u009b\u00bd\u0006\u00c3\u0090\u00f7\u00fcv\u009e\u0012\u00e0\u00c6@\u0017U\u00fbxam}\u00f7\u00d7\u0092\u00ed\u001f\u00c0)\u008c\u0007\u00ae\u0083\u00e0\u00dd6X\u00ae\u0006\u00cb\u00ea\u00f6\u00b3Vw\u000fQAv\u00e7\u0093\u00e5\u00a0\u00a2v\u0005\u0094\u00d8\u00fe\f\u0092\u001b\u00d1\u00b0\u00c8\u00d1N\u001e\u001d@MR\u00bb_\u008c\u001bzs]`\u00ea\u00c8\u0011l`\\c-\u00ae\u0017>b\u00ba\b[\u00c4\u00bf\u00d5\u00ce\u00ae\u00aelJEP\u00ae\u00a2<\u00bf\u00db^\u0085\u00cb\u0016\u00c93D\"\u0083\u009aCk\u001b\u009d\u001eGb\u00ab\u00bb\u0092\u00bc}\u00a0o\u00b0\u001c\u0018\u00eb\u00ae\u0003\u00e8\u00ab\u0089\u00c7|\u0086\u00f2Y\u0084\u0090\u0011\u009aM'\u0011\u001d\u0082\u0011\u00bb)0 \u00f9\u0094\u0018\u0084crj\u00b4G\u00d0\u009c\u0081x>\u00f9\u00b8\u00ccCk\u00b0\u00d6\u00ba\u00b9\u00f0\\P\u00cd\u00e3\u00d6~\u009a\u00a2\u0010w\u001eN\u00ccz(\u00a7\u0081\u0084\u008d\u00f8\u00aaX%\u009e\u0019".length();
                            var11_4 = 17;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 60;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "h&\u00e3\u0013\u00e34;X\u00cd\u008c]\u00bb\u00a7,~\u0010\u00f4x\u00e6\u00c0\u00e6uO\u0013r(\u00a0\u00d2\u008b\f6_lln\u00ab1\u00bfE\u00da/\u00f3\u00df";
                                var14_3 = "h&\u00e3\u0013\u00e34;X\u00cd\u008c]\u00bb\u00a7,~\u0010\u00f4x\u00e6\u00c0\u00e6uO\u0013r(\u00a0\u00d2\u008b\f6_lln\u00ab1\u00bfE\u00da/\u00f3\u00df".length();
                                var11_4 = 23;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 9;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 123;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 34;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 15;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 6;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 103;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 45;
                                        break;
                                    }
                                    default: {
                                        v15 = 104;
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
lbl85:
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
lbl95:
                            // 1 sources

                            ** continue;
                        }
                    }
                    fx_2.d = var15;
                    fx_2.h = new String[15];
                    var2_7 = 770023006329806024L;
                    var8_8 = new long[30];
                    var5_9 = 0;
                    var6_10 = "\u00d9H\u0089\u00caz\u00ef\u00e6\u00e7o\u00b7\u001e\u009bD\u0097\u00a5\u0089\u00b2\u009d\u00da\u0087\u00bdN$\u00eb\u0004F\u00fe<\u0081X\u0017\u00a3nA\u00d2-d\u0005\u00fe\u00ca\u00da]\u001a3\u009c\u00b2\u00be\u00cb\u00c1R5|)\u00f0\u00ae\t\u00c0\u00aa\u00bd6\u00f4&p.\u00fd\u0082*\r:\u00b5\u0011\u009e\u00b2\u00f1\u0098\u0087>\u0016\u009fVp\u00db\u00da\u00b1\u00ab\u00c2\u008a\u008d\u009c\u00c4I\u0094L\u0094\u0099\"!Jl0\u00bc\u00d4:\u0087\u00c8\u00f5\u00ee\u00f9\u00de\u00c7\u00bf\u0001\u00ef\u00d9\u00ccw\u0016\u000f\u000e w\u0083\u0083\u00b5u\u0002@\u0091O\u008e\u00a5\u009cx\u008a\u00c2\u00cb{{E\u008c0\u00cb\u00df\u0000\u0019\b\u00aa8\u00cd\u00e4\u00e8\u00b4\u00d5\u00074%\u00deb\u00f6\u00e8\u00ee^\u00ca\u00bb\u001d\u0097\u00ed\u00c7\u00c28\u00d2\u0001>o$\u00d3o\u00c8\u00d1\u00cer^j\u00a4\u00fba\u00f4C\u00c6\u00c3\u00ce\u008d\u000b\u00a8T\u0015\u001di\u00de\u00a5\u00e7\u0019\u001a\u00bc\u00e9>\u00a6\u009a#\u00c3\u0000%\u00a6\u00ab,AR\u00a3\u00c6\u00e4L\u00df\u00c9\u009e";
                    var7_11 = "\u00d9H\u0089\u00caz\u00ef\u00e6\u00e7o\u00b7\u001e\u009bD\u0097\u00a5\u0089\u00b2\u009d\u00da\u0087\u00bdN$\u00eb\u0004F\u00fe<\u0081X\u0017\u00a3nA\u00d2-d\u0005\u00fe\u00ca\u00da]\u001a3\u009c\u00b2\u00be\u00cb\u00c1R5|)\u00f0\u00ae\t\u00c0\u00aa\u00bd6\u00f4&p.\u00fd\u0082*\r:\u00b5\u0011\u009e\u00b2\u00f1\u0098\u0087>\u0016\u009fVp\u00db\u00da\u00b1\u00ab\u00c2\u008a\u008d\u009c\u00c4I\u0094L\u0094\u0099\"!Jl0\u00bc\u00d4:\u0087\u00c8\u00f5\u00ee\u00f9\u00de\u00c7\u00bf\u0001\u00ef\u00d9\u00ccw\u0016\u000f\u000e w\u0083\u0083\u00b5u\u0002@\u0091O\u008e\u00a5\u009cx\u008a\u00c2\u00cb{{E\u008c0\u00cb\u00df\u0000\u0019\b\u00aa8\u00cd\u00e4\u00e8\u00b4\u00d5\u00074%\u00deb\u00f6\u00e8\u00ee^\u00ca\u00bb\u001d\u0097\u00ed\u00c7\u00c28\u00d2\u0001>o$\u00d3o\u00c8\u00d1\u00cer^j\u00a4\u00fba\u00f4C\u00c6\u00c3\u00ce\u008d\u000b\u00a8T\u0015\u001di\u00de\u00a5\u00e7\u0019\u001a\u00bc\u00e9>\u00a6\u009a#\u00c3\u0000%\u00a6\u00ab,AR\u00a3\u00c6\u00e4L\u00df\u00c9\u009e".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v17 = var8_8;
                        v18 = var5_9++;
                        v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\u00ec\u0010\u0085D\u00f7\u00f9u,\u0012\u00b4B\u00bfYV\"\u00cd";
                        var7_11 = "\u00ec\u0010\u0085D\u00f7\u00f9u,\u0012\u00b4B\u00bfYV\"\u00cd".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v17 = var8_8;
                            v18 = var5_9++;
                            v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var2_7;
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
            fx_2.l = var8_8;
            fx_2.t = new Integer[30];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 8634760969056750070L;
        ** while (true)
        fx_2.u = 8634760969056750054L ^ var0_14;
        fx_2.v = fx_2.a(27174, 4726349126532335066L);
        fx_2.p = new Color(0, 0, 0);
        fx_2.s = new Color(fx_2.a(22512, 960993529667368975L), fx_2.a(5585, 9197729558655498811L), fx_2.a(5585, 9197729558655498811L));
        fx_2.m = new Color(fx_2.a(3379, 8738873055548236509L), fx_2.a(25180, 4036620769912917438L), fx_2.a(21842, 2090933165858503329L));
        fx_2.R = new Color(fx_2.a(24050, 4029305105094947358L), fx_2.a(1329, 4891815149675506376L), fx_2.a(19677, 334602360387871546L));
        fx_2.E = new Color(fx_2.a(27281, 8409522371127281008L), fx_2.a(6983, 3341685706732762303L), fx_2.a(18805, 3587227920034080403L), fx_2.a(31221, 5606823337849787925L));
        fx_2.o = new Color(fx_2.a(10329, 5504029929407301565L));
    }

    private static FontFormatException a(FontFormatException fontFormatException) {
        return fontFormatException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1B20) & 0xFFFF;
        if (h[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 104;
                    break;
                }
                case 1: {
                    n14 = 45;
                    break;
                }
                case 2: {
                    n14 = 137;
                    break;
                }
                case 3: {
                    n14 = 43;
                    break;
                }
                case 4: {
                    n14 = 63;
                    break;
                }
                case 5: {
                    n14 = 89;
                    break;
                }
                case 6: {
                    n14 = 165;
                    break;
                }
                case 7: {
                    n14 = 179;
                    break;
                }
                case 8: {
                    n14 = 197;
                    break;
                }
                case 9: {
                    n14 = 146;
                    break;
                }
                case 10: {
                    n14 = 226;
                    break;
                }
                case 11: {
                    n14 = 194;
                    break;
                }
                case 12: {
                    n14 = 56;
                    break;
                }
                case 13: {
                    n14 = 69;
                    break;
                }
                case 14: {
                    n14 = 201;
                    break;
                }
                case 15: {
                    n14 = 223;
                    break;
                }
                case 16: {
                    n14 = 195;
                    break;
                }
                case 17: {
                    n14 = 55;
                    break;
                }
                case 18: {
                    n14 = 162;
                    break;
                }
                case 19: {
                    n14 = 241;
                    break;
                }
                case 20: {
                    n14 = 235;
                    break;
                }
                case 21: {
                    n14 = 6;
                    break;
                }
                case 22: {
                    n14 = 136;
                    break;
                }
                case 23: {
                    n14 = 52;
                    break;
                }
                case 24: {
                    n14 = 34;
                    break;
                }
                case 25: {
                    n14 = 22;
                    break;
                }
                case 26: {
                    n14 = 78;
                    break;
                }
                case 27: {
                    n14 = 44;
                    break;
                }
                case 28: {
                    n14 = 91;
                    break;
                }
                case 29: {
                    n14 = 17;
                    break;
                }
                case 30: {
                    n14 = 207;
                    break;
                }
                case 31: {
                    n14 = 191;
                    break;
                }
                case 32: {
                    n14 = 185;
                    break;
                }
                case 33: {
                    n14 = 32;
                    break;
                }
                case 34: {
                    n14 = 95;
                    break;
                }
                case 35: {
                    n14 = 10;
                    break;
                }
                case 36: {
                    n14 = 73;
                    break;
                }
                case 37: {
                    n14 = 246;
                    break;
                }
                case 38: {
                    n14 = 121;
                    break;
                }
                case 39: {
                    n14 = 111;
                    break;
                }
                case 40: {
                    n14 = 15;
                    break;
                }
                case 41: {
                    n14 = 193;
                    break;
                }
                case 42: {
                    n14 = 159;
                    break;
                }
                case 43: {
                    n14 = 37;
                    break;
                }
                case 44: {
                    n14 = 70;
                    break;
                }
                case 45: {
                    n14 = 117;
                    break;
                }
                case 46: {
                    n14 = 242;
                    break;
                }
                case 47: {
                    n14 = 225;
                    break;
                }
                case 48: {
                    n14 = 42;
                    break;
                }
                case 49: {
                    n14 = 222;
                    break;
                }
                case 50: {
                    n14 = 11;
                    break;
                }
                case 51: {
                    n14 = 156;
                    break;
                }
                case 52: {
                    n14 = 169;
                    break;
                }
                case 53: {
                    n14 = 39;
                    break;
                }
                case 54: {
                    n14 = 128;
                    break;
                }
                case 55: {
                    n14 = 30;
                    break;
                }
                case 56: {
                    n14 = 238;
                    break;
                }
                case 57: {
                    n14 = 61;
                    break;
                }
                case 58: {
                    n14 = 214;
                    break;
                }
                case 59: {
                    n14 = 127;
                    break;
                }
                case 60: {
                    n14 = 227;
                    break;
                }
                case 61: {
                    n14 = 203;
                    break;
                }
                case 62: {
                    n14 = 168;
                    break;
                }
                case 63: {
                    n14 = 218;
                    break;
                }
                case 64: {
                    n14 = 134;
                    break;
                }
                case 65: {
                    n14 = 19;
                    break;
                }
                case 66: {
                    n14 = 167;
                    break;
                }
                case 67: {
                    n14 = 231;
                    break;
                }
                case 68: {
                    n14 = 212;
                    break;
                }
                case 69: {
                    n14 = 243;
                    break;
                }
                case 70: {
                    n14 = 119;
                    break;
                }
                case 71: {
                    n14 = 76;
                    break;
                }
                case 72: {
                    n14 = 24;
                    break;
                }
                case 73: {
                    n14 = 68;
                    break;
                }
                case 74: {
                    n14 = 209;
                    break;
                }
                case 75: {
                    n14 = 192;
                    break;
                }
                case 76: {
                    n14 = 106;
                    break;
                }
                case 77: {
                    n14 = 188;
                    break;
                }
                case 78: {
                    n14 = 135;
                    break;
                }
                case 79: {
                    n14 = 213;
                    break;
                }
                case 80: {
                    n14 = 163;
                    break;
                }
                case 81: {
                    n14 = 96;
                    break;
                }
                case 82: {
                    n14 = 31;
                    break;
                }
                case 83: {
                    n14 = 180;
                    break;
                }
                case 84: {
                    n14 = 12;
                    break;
                }
                case 85: {
                    n14 = 53;
                    break;
                }
                case 86: {
                    n14 = 253;
                    break;
                }
                case 87: {
                    n14 = 47;
                    break;
                }
                case 88: {
                    n14 = 130;
                    break;
                }
                case 89: {
                    n14 = 103;
                    break;
                }
                case 90: {
                    n14 = 186;
                    break;
                }
                case 91: {
                    n14 = 152;
                    break;
                }
                case 92: {
                    n14 = 205;
                    break;
                }
                case 93: {
                    n14 = 99;
                    break;
                }
                case 94: {
                    n14 = 129;
                    break;
                }
                case 95: {
                    n14 = 90;
                    break;
                }
                case 96: {
                    n14 = 114;
                    break;
                }
                case 97: {
                    n14 = 143;
                    break;
                }
                case 98: {
                    n14 = 102;
                    break;
                }
                case 99: {
                    n14 = 190;
                    break;
                }
                case 100: {
                    n14 = 202;
                    break;
                }
                case 101: {
                    n14 = 198;
                    break;
                }
                case 102: {
                    n14 = 240;
                    break;
                }
                case 103: {
                    n14 = 153;
                    break;
                }
                case 104: {
                    n14 = 87;
                    break;
                }
                case 105: {
                    n14 = 181;
                    break;
                }
                case 106: {
                    n14 = 8;
                    break;
                }
                case 107: {
                    n14 = 158;
                    break;
                }
                case 108: {
                    n14 = 217;
                    break;
                }
                case 109: {
                    n14 = 141;
                    break;
                }
                case 110: {
                    n14 = 79;
                    break;
                }
                case 111: {
                    n14 = 206;
                    break;
                }
                case 112: {
                    n14 = 54;
                    break;
                }
                case 113: {
                    n14 = 154;
                    break;
                }
                case 114: {
                    n14 = 71;
                    break;
                }
                case 115: {
                    n14 = 122;
                    break;
                }
                case 116: {
                    n14 = 48;
                    break;
                }
                case 117: {
                    n14 = 13;
                    break;
                }
                case 118: {
                    n14 = 108;
                    break;
                }
                case 119: {
                    n14 = 236;
                    break;
                }
                case 120: {
                    n14 = 51;
                    break;
                }
                case 121: {
                    n14 = 189;
                    break;
                }
                case 122: {
                    n14 = 105;
                    break;
                }
                case 123: {
                    n14 = 126;
                    break;
                }
                case 124: {
                    n14 = 7;
                    break;
                }
                case 125: {
                    n14 = 140;
                    break;
                }
                case 126: {
                    n14 = 171;
                    break;
                }
                case 127: {
                    n14 = 29;
                    break;
                }
                case 128: {
                    n14 = 182;
                    break;
                }
                case 129: {
                    n14 = 233;
                    break;
                }
                case 130: {
                    n14 = 93;
                    break;
                }
                case 131: {
                    n14 = 1;
                    break;
                }
                case 132: {
                    n14 = 74;
                    break;
                }
                case 133: {
                    n14 = 208;
                    break;
                }
                case 134: {
                    n14 = 170;
                    break;
                }
                case 135: {
                    n14 = 36;
                    break;
                }
                case 136: {
                    n14 = 59;
                    break;
                }
                case 137: {
                    n14 = 254;
                    break;
                }
                case 138: {
                    n14 = 112;
                    break;
                }
                case 139: {
                    n14 = 229;
                    break;
                }
                case 140: {
                    n14 = 247;
                    break;
                }
                case 141: {
                    n14 = 75;
                    break;
                }
                case 142: {
                    n14 = 145;
                    break;
                }
                case 143: {
                    n14 = 161;
                    break;
                }
                case 144: {
                    n14 = 125;
                    break;
                }
                case 145: {
                    n14 = 77;
                    break;
                }
                case 146: {
                    n14 = 16;
                    break;
                }
                case 147: {
                    n14 = 66;
                    break;
                }
                case 148: {
                    n14 = 139;
                    break;
                }
                case 149: {
                    n14 = 64;
                    break;
                }
                case 150: {
                    n14 = 234;
                    break;
                }
                case 151: {
                    n14 = 204;
                    break;
                }
                case 152: {
                    n14 = 123;
                    break;
                }
                case 153: {
                    n14 = 113;
                    break;
                }
                case 154: {
                    n14 = 46;
                    break;
                }
                case 155: {
                    n14 = 244;
                    break;
                }
                case 156: {
                    n14 = 72;
                    break;
                }
                case 157: {
                    n14 = 133;
                    break;
                }
                case 158: {
                    n14 = 220;
                    break;
                }
                case 159: {
                    n14 = 101;
                    break;
                }
                case 160: {
                    n14 = 120;
                    break;
                }
                case 161: {
                    n14 = 124;
                    break;
                }
                case 162: {
                    n14 = 86;
                    break;
                }
                case 163: {
                    n14 = 216;
                    break;
                }
                case 164: {
                    n14 = 160;
                    break;
                }
                case 165: {
                    n14 = 199;
                    break;
                }
                case 166: {
                    n14 = 224;
                    break;
                }
                case 167: {
                    n14 = 215;
                    break;
                }
                case 168: {
                    n14 = 109;
                    break;
                }
                case 169: {
                    n14 = 228;
                    break;
                }
                case 170: {
                    n14 = 150;
                    break;
                }
                case 171: {
                    n14 = 50;
                    break;
                }
                case 172: {
                    n14 = 97;
                    break;
                }
                case 173: {
                    n14 = 118;
                    break;
                }
                case 174: {
                    n14 = 100;
                    break;
                }
                case 175: {
                    n14 = 172;
                    break;
                }
                case 176: {
                    n14 = 26;
                    break;
                }
                case 177: {
                    n14 = 149;
                    break;
                }
                case 178: {
                    n14 = 65;
                    break;
                }
                case 179: {
                    n14 = 4;
                    break;
                }
                case 180: {
                    n14 = 250;
                    break;
                }
                case 181: {
                    n14 = 18;
                    break;
                }
                case 182: {
                    n14 = 175;
                    break;
                }
                case 183: {
                    n14 = 2;
                    break;
                }
                case 184: {
                    n14 = 21;
                    break;
                }
                case 185: {
                    n14 = 62;
                    break;
                }
                case 186: {
                    n14 = 176;
                    break;
                }
                case 187: {
                    n14 = 142;
                    break;
                }
                case 188: {
                    n14 = 151;
                    break;
                }
                case 189: {
                    n14 = 221;
                    break;
                }
                case 190: {
                    n14 = 183;
                    break;
                }
                case 191: {
                    n14 = 27;
                    break;
                }
                case 192: {
                    n14 = 211;
                    break;
                }
                case 193: {
                    n14 = 252;
                    break;
                }
                case 194: {
                    n14 = 132;
                    break;
                }
                case 195: {
                    n14 = 148;
                    break;
                }
                case 196: {
                    n14 = 57;
                    break;
                }
                case 197: {
                    n14 = 28;
                    break;
                }
                case 198: {
                    n14 = 38;
                    break;
                }
                case 199: {
                    n14 = 116;
                    break;
                }
                case 200: {
                    n14 = 110;
                    break;
                }
                case 201: {
                    n14 = 20;
                    break;
                }
                case 202: {
                    n14 = 115;
                    break;
                }
                case 203: {
                    n14 = 49;
                    break;
                }
                case 204: {
                    n14 = 232;
                    break;
                }
                case 205: {
                    n14 = 200;
                    break;
                }
                case 206: {
                    n14 = 157;
                    break;
                }
                case 207: {
                    n14 = 98;
                    break;
                }
                case 208: {
                    n14 = 92;
                    break;
                }
                case 209: {
                    n14 = 251;
                    break;
                }
                case 210: {
                    n14 = 131;
                    break;
                }
                case 211: {
                    n14 = 219;
                    break;
                }
                case 212: {
                    n14 = 144;
                    break;
                }
                case 213: {
                    n14 = 177;
                    break;
                }
                case 214: {
                    n14 = 35;
                    break;
                }
                case 215: {
                    n14 = 147;
                    break;
                }
                case 216: {
                    n14 = 60;
                    break;
                }
                case 217: {
                    n14 = 248;
                    break;
                }
                case 218: {
                    n14 = 178;
                    break;
                }
                case 219: {
                    n14 = 23;
                    break;
                }
                case 220: {
                    n14 = 81;
                    break;
                }
                case 221: {
                    n14 = 88;
                    break;
                }
                case 222: {
                    n14 = 85;
                    break;
                }
                case 223: {
                    n14 = 187;
                    break;
                }
                case 224: {
                    n14 = 155;
                    break;
                }
                case 225: {
                    n14 = 82;
                    break;
                }
                case 226: {
                    n14 = 249;
                    break;
                }
                case 227: {
                    n14 = 83;
                    break;
                }
                case 228: {
                    n14 = 3;
                    break;
                }
                case 229: {
                    n14 = 80;
                    break;
                }
                case 230: {
                    n14 = 25;
                    break;
                }
                case 231: {
                    n14 = 166;
                    break;
                }
                case 232: {
                    n14 = 0;
                    break;
                }
                case 233: {
                    n14 = 94;
                    break;
                }
                case 234: {
                    n14 = 237;
                    break;
                }
                case 235: {
                    n14 = 255;
                    break;
                }
                case 236: {
                    n14 = 230;
                    break;
                }
                case 237: {
                    n14 = 14;
                    break;
                }
                case 238: {
                    n14 = 41;
                    break;
                }
                case 239: {
                    n14 = 58;
                    break;
                }
                case 240: {
                    n14 = 67;
                    break;
                }
                case 241: {
                    n14 = 173;
                    break;
                }
                case 242: {
                    n14 = 40;
                    break;
                }
                case 243: {
                    n14 = 245;
                    break;
                }
                case 244: {
                    n14 = 5;
                    break;
                }
                case 245: {
                    n14 = 33;
                    break;
                }
                case 246: {
                    n14 = 210;
                    break;
                }
                case 247: {
                    n14 = 9;
                    break;
                }
                case 248: {
                    n14 = 239;
                    break;
                }
                case 249: {
                    n14 = 138;
                    break;
                }
                case 250: {
                    n14 = 84;
                    break;
                }
                case 251: {
                    n14 = 196;
                    break;
                }
                case 252: {
                    n14 = 184;
                    break;
                }
                case 253: {
                    n14 = 164;
                    break;
                }
                case 254: {
                    n14 = 174;
                    break;
                }
                default: {
                    n14 = 107;
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
            fx_2.h[n12] = new String(cArray).intern();
        }
        return h[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6FEA;
        if (t[n11] == null) {
            fx_2.t[n11] = (int)(l[n11] ^ l2);
        }
        return t[n11];
    }
}

