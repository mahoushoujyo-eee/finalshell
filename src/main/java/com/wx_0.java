/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.KZ;
import com.ne_1;
import com.wn_2;
import com.xg_0;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Wx
 */
public final class wx_0 {
    private static KZ N;
    private static final String z;
    private static final String b;
    private static Cursor o;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    public static void G(String string) {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(string), null);
        }
        catch (Throwable throwable) {
            ne_1.g(wx_0.class, throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a() {
        DataFlavor dataFlavor;
        Transferable transferable;
        String string;
        Transferable transferable2;
        block7: {
            transferable2 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            string = FV.D();
            try {
                transferable = transferable2;
                if (string != null) break block7;
                if (transferable == null) return null;
            }
            catch (UnsupportedFlavorException unsupportedFlavorException) {
                throw wx_0.a(unsupportedFlavorException);
            }
            transferable = transferable2;
        }
        try {
            dataFlavor = DataFlavor.stringFlavor;
            if (string != null) return (String)transferable.getTransferData(dataFlavor);
            if (!transferable.isDataFlavorSupported(dataFlavor)) return null;
        }
        catch (UnsupportedFlavorException unsupportedFlavorException) {
            throw wx_0.a(unsupportedFlavorException);
        }
        try {
            transferable = transferable2;
            dataFlavor = DataFlavor.stringFlavor;
            return (String)transferable.getTransferData(dataFlavor);
        }
        catch (UnsupportedFlavorException unsupportedFlavorException) {
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static String U() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6277 out of bounds for length 10");
    }

    public static KZ V() {
        String string = FV.D();
        KZ kZ = N;
        if (string == null) {
            if (kZ == null) {
                N = new KZ(wx_0.U());
            }
            kZ = N;
        }
        return kZ;
    }

    public static boolean m(double d2, int n10) {
        String string = FV.D();
        boolean bl = wx_0.V().r(d2, 0, n10);
        if (string == null) {
            bl = bl >= false;
        }
        return bl;
    }

    public static boolean s(double d2, int n10, int n11) {
        String string = FV.D();
        boolean bl = wx_0.V().r(d2, n10, n11);
        if (string == null) {
            bl = bl >= false;
        }
        return bl;
    }

    public static boolean z() {
        String string = FV.D();
        boolean bl = wx_0.V().r(1.6, 0, 0);
        if (string == null) {
            bl = bl >= false;
        }
        return bl;
    }

    public static boolean R() {
        String string = FV.D();
        boolean bl = wx_0.V().r(1.7, 0, 0);
        if (string == null) {
            bl = bl >= false;
        }
        return bl;
    }

    public static boolean L() {
        String string = FV.D();
        boolean bl = wx_0.V().r(1.8, 0, 0);
        if (string == null) {
            bl = bl >= false;
        }
        return bl;
    }

    public static String M() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6300 out of bounds for length 10");
    }

    public static String e() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6303 out of bounds for length 10");
    }

    public static String W() {
        return b;
    }

    public static ImageIcon V() {
        return wx_0.D(true);
    }

    public static ImageIcon D(boolean bl) {
        return wx_0.o(wx_0.a(25711, 4318972295291492889L), bl);
    }

    public static ImageIcon F(int n10) {
        return wx_0.o(n10, true);
    }

    public static ImageIcon o(int n10, boolean bl) {
        block3: {
            int n11;
            block4: {
                int n12;
                block2: {
                    String string = FV.D();
                    n11 = n10;
                    n12 = wx_0.a(25711, 4318972295291492889L);
                    if (string != null) break block2;
                    if (n11 == n12) break block3;
                    n11 = n10;
                    if (string != null) break block4;
                    n12 = wx_0.a(15728, 5905782452459111169L);
                }
                if (n11 == n12) break block3;
                n11 = wx_0.a(25711, 4318972295291492889L);
            }
            n10 = n11;
        }
        String string = wx_0.W();
        String string2 = bl ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6278 out of bounds for length 10" : "";
        return string != null ? new ImageIcon(wx_0.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6299 out of bounds for length 10" + n10 + "/" + string + string2 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6283 out of bounds for length 10")) : null;
    }

    public static boolean t() {
        return b == "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6279 out of bounds for length 10";
    }

    public static boolean E() {
        return b == "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6290 out of bounds for length 10";
    }

    public static boolean O() {
        return b == "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6286 out of bounds for length 10";
    }

    public static boolean G() {
        return b == "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6276 out of bounds for length 10";
    }

    public static String Q() {
        return ManagementFactory.getOperatingSystemMXBean().getArch();
    }

    public static String k() {
        return z;
    }

    public static String A() {
        String string = FV.D();
        boolean bl = wx_0.t();
        if (string == null) {
            if (bl) {
                return "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6289 out of bounds for length 10";
            }
            bl = wx_0.E();
        }
        if (string == null) {
            if (bl) {
                return "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6272 out of bounds for length 10";
            }
            bl = wx_0.O();
        }
        if (string == null) {
            if (bl) {
                return "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6275 out of bounds for length 10";
            }
            bl = wx_0.G();
        }
        if (bl) {
            return "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6282 out of bounds for length 10";
        }
        return null;
    }

    public static String s() {
        return ManagementFactory.getOperatingSystemMXBean().getVersion();
    }

    public static int O() {
        return ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors();
    }

    public static String C() {
        String string = FV.D();
        String string2 = wx_0.b();
        if (string == null) {
            string2 = string2.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6297 out of bounds for length 10") ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6274 out of bounds for length 10" : "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6285 out of bounds for length 10";
        }
        return string2;
    }

    public static String b() {
        return System.getProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6301 out of bounds for length 10");
    }

    public static boolean h() {
        return Toolkit.getDefaultToolkit().getLockingKeyState(wx_0.a(420, 2837723706728660947L));
    }

    public static boolean v() {
        return Toolkit.getDefaultToolkit().getLockingKeyState(wx_0.a(18595, 7286141364776531671L));
    }

    public static boolean r() {
        return Toolkit.getDefaultToolkit().getLockingKeyState(wx_0.a(30253, 4424400099950250072L));
    }

    public static GraphicsConfiguration S() {
        return wx_0.I().getDefaultScreenDevice().getDefaultConfiguration();
    }

    private static GraphicsEnvironment I() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment();
    }

    public static List X() {
        GraphicsEnvironment graphicsEnvironment = wx_0.I();
        String string = FV.D();
        GraphicsDevice[] graphicsDeviceArray = graphicsEnvironment.getScreenDevices();
        GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
        ArrayList<GraphicsDevice> arrayList = new ArrayList<GraphicsDevice>();
        GraphicsDevice[] graphicsDeviceArray2 = graphicsDeviceArray;
        int n10 = graphicsDeviceArray2.length;
        int n11 = 0;
        while (n11 < n10) {
            block3: {
                block4: {
                    GraphicsDevice graphicsDevice2;
                    block5: {
                        graphicsDevice2 = graphicsDeviceArray2[n11];
                        if (string != null) break block3;
                        if (graphicsDevice2.getType() != 0) break block4;
                        if (graphicsDevice2 != graphicsDevice) break block5;
                        arrayList.add(0, graphicsDevice2);
                        if (string == null) break block4;
                    }
                    arrayList.add(graphicsDevice2);
                }
                ++n11;
            }
            if (string == null) continue;
        }
        return arrayList;
    }

    public static Rectangle F(GraphicsConfiguration graphicsConfiguration, boolean bl) {
        block5: {
            GraphicsConfiguration graphicsConfiguration2;
            block4: {
                String string = FV.D();
                graphicsConfiguration2 = graphicsConfiguration;
                if (string != null) break block4;
                if (graphicsConfiguration2 == null) break block5;
                graphicsConfiguration2 = graphicsConfiguration;
            }
            Rectangle rectangle = graphicsConfiguration2.getBounds();
            if (bl) {
                Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
                return new Rectangle(insets.left, insets.top, rectangle.width - insets.left - insets.right, rectangle.height - insets.top - insets.bottom);
            }
            return new Rectangle(0, 0, rectangle.width, rectangle.height);
        }
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static GraphicsDevice M(Rectangle rectangle) {
        GraphicsDevice graphicsDevice;
        block5: {
            int n10 = 0;
            GraphicsDevice graphicsDevice2 = null;
            Iterator iterator = wx_0.X().iterator();
            String string = FV.D();
            while (iterator.hasNext()) {
                block7: {
                    int n11;
                    GraphicsDevice graphicsDevice3;
                    block8: {
                        Rectangle rectangle2;
                        Rectangle rectangle3;
                        block6: {
                            graphicsDevice3 = (GraphicsDevice)iterator.next();
                            GraphicsConfiguration graphicsConfiguration = graphicsDevice3.getDefaultConfiguration();
                            Rectangle rectangle4 = graphicsConfiguration.getBounds();
                            if (string != null) break block5;
                            rectangle3 = rectangle;
                            rectangle2 = rectangle4;
                            if (string != null) break block6;
                            if (!rectangle3.intersects(rectangle2)) break block7;
                            rectangle3 = rectangle;
                            rectangle2 = rectangle4;
                        }
                        Rectangle rectangle5 = rectangle3.intersection(rectangle2);
                        int n12 = rectangle5.width * rectangle5.height;
                        n11 = n10;
                        if (string != null) break block8;
                        if (n11 >= n12) break block7;
                        n11 = n12;
                    }
                    n10 = n11;
                    graphicsDevice2 = graphicsDevice3;
                }
                if (string == null) continue;
            }
            graphicsDevice = graphicsDevice2;
            if (string != null) return graphicsDevice;
            if (graphicsDevice != null) {
                graphicsDevice = graphicsDevice2;
                return graphicsDevice;
            }
        }
        graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        return graphicsDevice;
    }

    public static Cursor h() {
        String string = FV.D();
        Cursor cursor = o;
        if (string == null) {
            if (cursor == null) {
                Dimension dimension = Toolkit.getDefaultToolkit().getBestCursorSize(wx_0.a(4402, 8285658663075688258L), wx_0.a(25711, 4318972295291492889L));
                BufferedImage bufferedImage = xg_0.g(dimension.width, dimension.height, 3);
                o = Toolkit.getDefaultToolkit().createCustomCursor(bufferedImage, new Point(0, 0), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6281 out of bounds for length 10");
            }
            cursor = o;
        }
        return cursor;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[27];
                        var11_1 = 0;
                        var10_2 = "n\u00c9\u00c4=m\u000b\u00a3f\u0095.\u00a9\u00d1\u00f7S\u0010B\u000f\u0016\u00da\u00190\u0019\u00e3\u00b5\u0090niY*\u00f8\u001bBY\u00af;\u008a\u00e8\u0012\u00c1\u008a\u0004\u00ed\rB\b\u0003;\u00d1\u00ea\u0002\u001e9\u0004\b\u008f\u00c9\u009a\u0006\u009d_Sa\u001a\u001c\u0015\u00fe\u0095\u00b4\u0088s\u0087\u0082(+\u0091b\u00ef\u0010~u\u0012\u001bX\u00c2\u00aeK\u0004f\u0080\u0004{\u0002b@\u0014\u00bd\u0087\u00dc\u00ca~\u00cf#!\u001f\u00b0\u00e4\u00df\u00de\u00f7eR\u00cec\u0019\u00b8\u0007+\u00d4n\u00c9{\u00da\u009e\fr\u0093e\u00ee\u001f!\u00d3\u008b\u0006^\u0002\u00c4\bq\u0094\u008fA9|~\u00b2\u0003\u00c73u\u0003\u00b2\u00cd\u008f\u0002S\u000b\u0003c\u00d1\u00cd\t\u000f\u0005\u00b0q\u00c2e\u0094p\u00f9\f3AM\u00b4\u001aj{\u00be\u0007'\u009e\u00e9\u0013\u00fe\u00a2\u00d6\u0011=|7\u00be\u0001\u00ac\u001a,\u00a8\u00efP\u00bf\u00d4\u00a0;\u0007\u001e#\u00c87\u00af\u0005\u0004\u000e\u00dc\u0083\u00b0\u00ec\u00a5a\u008c\u00df\u00e1\u000fZi@\t\u0003\u00d5\u009e\u001b";
                        var12_3 = "n\u00c9\u00c4=m\u000b\u00a3f\u0095.\u00a9\u00d1\u00f7S\u0010B\u000f\u0016\u00da\u00190\u0019\u00e3\u00b5\u0090niY*\u00f8\u001bBY\u00af;\u008a\u00e8\u0012\u00c1\u008a\u0004\u00ed\rB\b\u0003;\u00d1\u00ea\u0002\u001e9\u0004\b\u008f\u00c9\u009a\u0006\u009d_Sa\u001a\u001c\u0015\u00fe\u0095\u00b4\u0088s\u0087\u0082(+\u0091b\u00ef\u0010~u\u0012\u001bX\u00c2\u00aeK\u0004f\u0080\u0004{\u0002b@\u0014\u00bd\u0087\u00dc\u00ca~\u00cf#!\u001f\u00b0\u00e4\u00df\u00de\u00f7eR\u00cec\u0019\u00b8\u0007+\u00d4n\u00c9{\u00da\u009e\fr\u0093e\u00ee\u001f!\u00d3\u008b\u0006^\u0002\u00c4\bq\u0094\u008fA9|~\u00b2\u0003\u00c73u\u0003\u00b2\u00cd\u008f\u0002S\u000b\u0003c\u00d1\u00cd\t\u000f\u0005\u00b0q\u00c2e\u0094p\u00f9\f3AM\u00b4\u001aj{\u00be\u0007'\u009e\u00e9\u0013\u00fe\u00a2\u00d6\u0011=|7\u00be\u0001\u00ac\u001a,\u00a8\u00efP\u00bf\u00d4\u00a0;\u0007\u001e#\u00c87\u00af\u0005\u0004\u000e\u00dc\u0083\u00b0\u00ec\u00a5a\u008c\u00df\u00e1\u000fZi@\t\u0003\u00d5\u009e\u001b".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 110;
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
                            var10_2 = "\u001c\u0000\u0003\u00d1nG\u00ca\u00db\u00c9\u0004\u00d5\u00ba\u0014\u00a1:y\u0099\u0099\u0086\u00e9\u0001*\u0089\u00b6\u00c7\u0003\u00c3\u00e3J";
                            var12_3 = "\u001c\u0000\u0003\u00d1nG\u00ca\u00db\u00c9\u0004\u00d5\u00ba\u0014\u00a1:y\u0099\u0099\u0086\u00e9\u0001*\u0089\u00b6\u00c7\u0003\u00c3\u00e3J".length();
                            var9_4 = 25;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 64;
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
                                    v15 = 39;
                                    break;
                                }
                                case 1: {
                                    v15 = 66;
                                    break;
                                }
                                case 2: {
                                    v15 = 61;
                                    break;
                                }
                                case 3: {
                                    v15 = 91;
                                    break;
                                }
                                case 4: {
                                    v15 = 33;
                                    break;
                                }
                                case 5: {
                                    v15 = 15;
                                    break;
                                }
                                default: {
                                    v15 = 57;
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
                wx_0.a = var13;
                wx_0.c = new String[27];
                var0_7 = 8212708822157540783L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "+\u00edp\u001f\u0082\u00a2K\u00e8\u0017+Q%9\u00d6ufUF\u00b3\u00ca[\u00f0\u00e7\u00a6c\\\u0017\u00eb\u0012.\u0082h";
                var5_11 = "+\u00edp\u001f\u0082\u00a2K\u00e8\u0017+Q%9\u00d6ufUF\u00b3\u00ca[\u00f0\u00e7\u00a6c\\\u0017\u00eb\u0012.\u0082h".length();
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
                    var4_10 = "]\u00b5\u009b_\u00aa\u00a9\u0012\u00fdb\u0089\u0096\u00d1\u009b\u00e5>\u008e";
                    var5_11 = "]\u00b5\u009b_\u00aa\u00a9\u0012\u00fdb\u0089\u0096\u00d1\u009b\u00e5>\u008e".length();
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
        wx_0.d = var6_8;
        wx_0.e = new Integer[6];
        wx_0.z = (String)AccessController.doPrivileged(new wn_2());
        var15_14 = wx_0.z.toLowerCase(Locale.ENGLISH);
        wx_0.b = var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6284 out of bounds for length 10") != false ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6284 out of bounds for length 10" : (var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6296 out of bounds for length 10") != false || var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6287 out of bounds for length 10") != false ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6296 out of bounds for length 10" : (var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6288 out of bounds for length 10") != false || var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6298 out of bounds for length 10") != false ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6273 out of bounds for length 10" : (var15_14.contains("\u0000ERR:ArrayIndexOutOfBoundsException:Index 6280 out of bounds for length 10") != false ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 6302 out of bounds for length 10" : null)));
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x66C3) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 202;
                    break;
                }
                case 1: {
                    n14 = 181;
                    break;
                }
                case 2: {
                    n14 = 101;
                    break;
                }
                case 3: {
                    n14 = 38;
                    break;
                }
                case 4: {
                    n14 = 63;
                    break;
                }
                case 5: {
                    n14 = 120;
                    break;
                }
                case 6: {
                    n14 = 220;
                    break;
                }
                case 7: {
                    n14 = 27;
                    break;
                }
                case 8: {
                    n14 = 211;
                    break;
                }
                case 9: {
                    n14 = 3;
                    break;
                }
                case 10: {
                    n14 = 25;
                    break;
                }
                case 11: {
                    n14 = 224;
                    break;
                }
                case 12: {
                    n14 = 110;
                    break;
                }
                case 13: {
                    n14 = 232;
                    break;
                }
                case 14: {
                    n14 = 182;
                    break;
                }
                case 15: {
                    n14 = 125;
                    break;
                }
                case 16: {
                    n14 = 87;
                    break;
                }
                case 17: {
                    n14 = 105;
                    break;
                }
                case 18: {
                    n14 = 48;
                    break;
                }
                case 19: {
                    n14 = 190;
                    break;
                }
                case 20: {
                    n14 = 223;
                    break;
                }
                case 21: {
                    n14 = 252;
                    break;
                }
                case 22: {
                    n14 = 104;
                    break;
                }
                case 23: {
                    n14 = 4;
                    break;
                }
                case 24: {
                    n14 = 10;
                    break;
                }
                case 25: {
                    n14 = 242;
                    break;
                }
                case 26: {
                    n14 = 60;
                    break;
                }
                case 27: {
                    n14 = 192;
                    break;
                }
                case 28: {
                    n14 = 231;
                    break;
                }
                case 29: {
                    n14 = 249;
                    break;
                }
                case 30: {
                    n14 = 83;
                    break;
                }
                case 31: {
                    n14 = 148;
                    break;
                }
                case 32: {
                    n14 = 42;
                    break;
                }
                case 33: {
                    n14 = 196;
                    break;
                }
                case 34: {
                    n14 = 240;
                    break;
                }
                case 35: {
                    n14 = 158;
                    break;
                }
                case 36: {
                    n14 = 165;
                    break;
                }
                case 37: {
                    n14 = 9;
                    break;
                }
                case 38: {
                    n14 = 179;
                    break;
                }
                case 39: {
                    n14 = 236;
                    break;
                }
                case 40: {
                    n14 = 86;
                    break;
                }
                case 41: {
                    n14 = 229;
                    break;
                }
                case 42: {
                    n14 = 19;
                    break;
                }
                case 43: {
                    n14 = 183;
                    break;
                }
                case 44: {
                    n14 = 30;
                    break;
                }
                case 45: {
                    n14 = 171;
                    break;
                }
                case 46: {
                    n14 = 24;
                    break;
                }
                case 47: {
                    n14 = 59;
                    break;
                }
                case 48: {
                    n14 = 58;
                    break;
                }
                case 49: {
                    n14 = 57;
                    break;
                }
                case 50: {
                    n14 = 238;
                    break;
                }
                case 51: {
                    n14 = 65;
                    break;
                }
                case 52: {
                    n14 = 250;
                    break;
                }
                case 53: {
                    n14 = 241;
                    break;
                }
                case 54: {
                    n14 = 117;
                    break;
                }
                case 55: {
                    n14 = 174;
                    break;
                }
                case 56: {
                    n14 = 49;
                    break;
                }
                case 57: {
                    n14 = 210;
                    break;
                }
                case 58: {
                    n14 = 247;
                    break;
                }
                case 59: {
                    n14 = 7;
                    break;
                }
                case 60: {
                    n14 = 164;
                    break;
                }
                case 61: {
                    n14 = 219;
                    break;
                }
                case 62: {
                    n14 = 92;
                    break;
                }
                case 63: {
                    n14 = 234;
                    break;
                }
                case 64: {
                    n14 = 213;
                    break;
                }
                case 65: {
                    n14 = 188;
                    break;
                }
                case 66: {
                    n14 = 176;
                    break;
                }
                case 67: {
                    n14 = 33;
                    break;
                }
                case 68: {
                    n14 = 14;
                    break;
                }
                case 69: {
                    n14 = 40;
                    break;
                }
                case 70: {
                    n14 = 243;
                    break;
                }
                case 71: {
                    n14 = 124;
                    break;
                }
                case 72: {
                    n14 = 214;
                    break;
                }
                case 73: {
                    n14 = 31;
                    break;
                }
                case 74: {
                    n14 = 56;
                    break;
                }
                case 75: {
                    n14 = 209;
                    break;
                }
                case 76: {
                    n14 = 205;
                    break;
                }
                case 77: {
                    n14 = 199;
                    break;
                }
                case 78: {
                    n14 = 21;
                    break;
                }
                case 79: {
                    n14 = 206;
                    break;
                }
                case 80: {
                    n14 = 227;
                    break;
                }
                case 81: {
                    n14 = 119;
                    break;
                }
                case 82: {
                    n14 = 116;
                    break;
                }
                case 83: {
                    n14 = 72;
                    break;
                }
                case 84: {
                    n14 = 254;
                    break;
                }
                case 85: {
                    n14 = 62;
                    break;
                }
                case 86: {
                    n14 = 47;
                    break;
                }
                case 87: {
                    n14 = 88;
                    break;
                }
                case 88: {
                    n14 = 112;
                    break;
                }
                case 89: {
                    n14 = 131;
                    break;
                }
                case 90: {
                    n14 = 150;
                    break;
                }
                case 91: {
                    n14 = 246;
                    break;
                }
                case 92: {
                    n14 = 28;
                    break;
                }
                case 93: {
                    n14 = 151;
                    break;
                }
                case 94: {
                    n14 = 109;
                    break;
                }
                case 95: {
                    n14 = 103;
                    break;
                }
                case 96: {
                    n14 = 144;
                    break;
                }
                case 97: {
                    n14 = 201;
                    break;
                }
                case 98: {
                    n14 = 76;
                    break;
                }
                case 99: {
                    n14 = 186;
                    break;
                }
                case 100: {
                    n14 = 197;
                    break;
                }
                case 101: {
                    n14 = 29;
                    break;
                }
                case 102: {
                    n14 = 16;
                    break;
                }
                case 103: {
                    n14 = 100;
                    break;
                }
                case 104: {
                    n14 = 230;
                    break;
                }
                case 105: {
                    n14 = 136;
                    break;
                }
                case 106: {
                    n14 = 17;
                    break;
                }
                case 107: {
                    n14 = 189;
                    break;
                }
                case 108: {
                    n14 = 166;
                    break;
                }
                case 109: {
                    n14 = 91;
                    break;
                }
                case 110: {
                    n14 = 102;
                    break;
                }
                case 111: {
                    n14 = 245;
                    break;
                }
                case 112: {
                    n14 = 142;
                    break;
                }
                case 113: {
                    n14 = 39;
                    break;
                }
                case 114: {
                    n14 = 222;
                    break;
                }
                case 115: {
                    n14 = 185;
                    break;
                }
                case 116: {
                    n14 = 44;
                    break;
                }
                case 117: {
                    n14 = 37;
                    break;
                }
                case 118: {
                    n14 = 168;
                    break;
                }
                case 119: {
                    n14 = 81;
                    break;
                }
                case 120: {
                    n14 = 147;
                    break;
                }
                case 121: {
                    n14 = 23;
                    break;
                }
                case 122: {
                    n14 = 77;
                    break;
                }
                case 123: {
                    n14 = 52;
                    break;
                }
                case 124: {
                    n14 = 41;
                    break;
                }
                case 125: {
                    n14 = 121;
                    break;
                }
                case 126: {
                    n14 = 26;
                    break;
                }
                case 127: {
                    n14 = 123;
                    break;
                }
                case 128: {
                    n14 = 0;
                    break;
                }
                case 129: {
                    n14 = 75;
                    break;
                }
                case 130: {
                    n14 = 74;
                    break;
                }
                case 131: {
                    n14 = 5;
                    break;
                }
                case 132: {
                    n14 = 251;
                    break;
                }
                case 133: {
                    n14 = 114;
                    break;
                }
                case 134: {
                    n14 = 139;
                    break;
                }
                case 135: {
                    n14 = 61;
                    break;
                }
                case 136: {
                    n14 = 233;
                    break;
                }
                case 137: {
                    n14 = 108;
                    break;
                }
                case 138: {
                    n14 = 127;
                    break;
                }
                case 139: {
                    n14 = 35;
                    break;
                }
                case 140: {
                    n14 = 70;
                    break;
                }
                case 141: {
                    n14 = 95;
                    break;
                }
                case 142: {
                    n14 = 18;
                    break;
                }
                case 143: {
                    n14 = 195;
                    break;
                }
                case 144: {
                    n14 = 193;
                    break;
                }
                case 145: {
                    n14 = 111;
                    break;
                }
                case 146: {
                    n14 = 20;
                    break;
                }
                case 147: {
                    n14 = 140;
                    break;
                }
                case 148: {
                    n14 = 36;
                    break;
                }
                case 149: {
                    n14 = 173;
                    break;
                }
                case 150: {
                    n14 = 167;
                    break;
                }
                case 151: {
                    n14 = 149;
                    break;
                }
                case 152: {
                    n14 = 225;
                    break;
                }
                case 153: {
                    n14 = 118;
                    break;
                }
                case 154: {
                    n14 = 129;
                    break;
                }
                case 155: {
                    n14 = 126;
                    break;
                }
                case 156: {
                    n14 = 43;
                    break;
                }
                case 157: {
                    n14 = 54;
                    break;
                }
                case 158: {
                    n14 = 146;
                    break;
                }
                case 159: {
                    n14 = 143;
                    break;
                }
                case 160: {
                    n14 = 85;
                    break;
                }
                case 161: {
                    n14 = 200;
                    break;
                }
                case 162: {
                    n14 = 170;
                    break;
                }
                case 163: {
                    n14 = 94;
                    break;
                }
                case 164: {
                    n14 = 194;
                    break;
                }
                case 165: {
                    n14 = 99;
                    break;
                }
                case 166: {
                    n14 = 255;
                    break;
                }
                case 167: {
                    n14 = 215;
                    break;
                }
                case 168: {
                    n14 = 160;
                    break;
                }
                case 169: {
                    n14 = 156;
                    break;
                }
                case 170: {
                    n14 = 46;
                    break;
                }
                case 171: {
                    n14 = 207;
                    break;
                }
                case 172: {
                    n14 = 93;
                    break;
                }
                case 173: {
                    n14 = 98;
                    break;
                }
                case 174: {
                    n14 = 169;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 12;
                    break;
                }
                case 177: {
                    n14 = 6;
                    break;
                }
                case 178: {
                    n14 = 159;
                    break;
                }
                case 179: {
                    n14 = 228;
                    break;
                }
                case 180: {
                    n14 = 64;
                    break;
                }
                case 181: {
                    n14 = 163;
                    break;
                }
                case 182: {
                    n14 = 51;
                    break;
                }
                case 183: {
                    n14 = 221;
                    break;
                }
                case 184: {
                    n14 = 175;
                    break;
                }
                case 185: {
                    n14 = 50;
                    break;
                }
                case 186: {
                    n14 = 132;
                    break;
                }
                case 187: {
                    n14 = 172;
                    break;
                }
                case 188: {
                    n14 = 218;
                    break;
                }
                case 189: {
                    n14 = 8;
                    break;
                }
                case 190: {
                    n14 = 68;
                    break;
                }
                case 191: {
                    n14 = 161;
                    break;
                }
                case 192: {
                    n14 = 253;
                    break;
                }
                case 193: {
                    n14 = 80;
                    break;
                }
                case 194: {
                    n14 = 155;
                    break;
                }
                case 195: {
                    n14 = 66;
                    break;
                }
                case 196: {
                    n14 = 11;
                    break;
                }
                case 197: {
                    n14 = 162;
                    break;
                }
                case 198: {
                    n14 = 187;
                    break;
                }
                case 199: {
                    n14 = 178;
                    break;
                }
                case 200: {
                    n14 = 53;
                    break;
                }
                case 201: {
                    n14 = 198;
                    break;
                }
                case 202: {
                    n14 = 145;
                    break;
                }
                case 203: {
                    n14 = 78;
                    break;
                }
                case 204: {
                    n14 = 128;
                    break;
                }
                case 205: {
                    n14 = 115;
                    break;
                }
                case 206: {
                    n14 = 154;
                    break;
                }
                case 207: {
                    n14 = 248;
                    break;
                }
                case 208: {
                    n14 = 130;
                    break;
                }
                case 209: {
                    n14 = 90;
                    break;
                }
                case 210: {
                    n14 = 55;
                    break;
                }
                case 211: {
                    n14 = 212;
                    break;
                }
                case 212: {
                    n14 = 204;
                    break;
                }
                case 213: {
                    n14 = 141;
                    break;
                }
                case 214: {
                    n14 = 153;
                    break;
                }
                case 215: {
                    n14 = 67;
                    break;
                }
                case 216: {
                    n14 = 84;
                    break;
                }
                case 217: {
                    n14 = 13;
                    break;
                }
                case 218: {
                    n14 = 2;
                    break;
                }
                case 219: {
                    n14 = 97;
                    break;
                }
                case 220: {
                    n14 = 79;
                    break;
                }
                case 221: {
                    n14 = 89;
                    break;
                }
                case 222: {
                    n14 = 107;
                    break;
                }
                case 223: {
                    n14 = 217;
                    break;
                }
                case 224: {
                    n14 = 239;
                    break;
                }
                case 225: {
                    n14 = 22;
                    break;
                }
                case 226: {
                    n14 = 106;
                    break;
                }
                case 227: {
                    n14 = 1;
                    break;
                }
                case 228: {
                    n14 = 73;
                    break;
                }
                case 229: {
                    n14 = 82;
                    break;
                }
                case 230: {
                    n14 = 71;
                    break;
                }
                case 231: {
                    n14 = 69;
                    break;
                }
                case 232: {
                    n14 = 191;
                    break;
                }
                case 233: {
                    n14 = 15;
                    break;
                }
                case 234: {
                    n14 = 216;
                    break;
                }
                case 235: {
                    n14 = 133;
                    break;
                }
                case 236: {
                    n14 = 32;
                    break;
                }
                case 237: {
                    n14 = 152;
                    break;
                }
                case 238: {
                    n14 = 34;
                    break;
                }
                case 239: {
                    n14 = 96;
                    break;
                }
                case 240: {
                    n14 = 138;
                    break;
                }
                case 241: {
                    n14 = 180;
                    break;
                }
                case 242: {
                    n14 = 137;
                    break;
                }
                case 243: {
                    n14 = 177;
                    break;
                }
                case 244: {
                    n14 = 203;
                    break;
                }
                case 245: {
                    n14 = 157;
                    break;
                }
                case 246: {
                    n14 = 135;
                    break;
                }
                case 247: {
                    n14 = 237;
                    break;
                }
                case 248: {
                    n14 = 113;
                    break;
                }
                case 249: {
                    n14 = 226;
                    break;
                }
                case 250: {
                    n14 = 122;
                    break;
                }
                case 251: {
                    n14 = 45;
                    break;
                }
                case 252: {
                    n14 = 208;
                    break;
                }
                case 253: {
                    n14 = 134;
                    break;
                }
                case 254: {
                    n14 = 184;
                    break;
                }
                default: {
                    n14 = 244;
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
            wx_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3E74;
        if (e[n11] == null) {
            wx_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

