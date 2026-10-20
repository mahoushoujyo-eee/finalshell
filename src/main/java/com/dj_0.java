/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.RV;
import com.ky_2;
import com.rh_2;
import com.wb_0;
import com.xg_0;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Dj
 */
public class dj_0
extends JComponent {
    protected int I;
    protected int r;
    protected int Z;
    protected BufferedImage f;
    protected BufferedImage M;
    private static final long[] a;
    private static final Integer[] b;

    public dj_0() {
        this(dj_0.a(26174, 1667449126911982065L), dj_0.a(16445, 1822139528243191795L));
    }

    public dj_0(int n10, int n11) {
        this(n10, n11, null);
    }

    public dj_0(int n10, int n11, BufferedImage bufferedImage) {
        this.r = n10;
        this.Z = n11;
        this.I = Math.max(Math.max(n10, n11) / dj_0.a(22144, 7118668849997154633L), 3);
        this.f = bufferedImage;
        this.M = bufferedImage;
        this.P();
        FN.Y(this);
        this.setTransferHandler(new rh_2(this));
    }

    public BufferedImage v() {
        return this.f;
    }

    public BufferedImage a() {
        return this.M;
    }

    public int i() {
        return this.I;
    }

    public void J(int n10) {
        this.I = n10;
        this.P();
    }

    public int L() {
        return this.r;
    }

    public void i(int n10) {
        this.r = n10;
        this.P();
    }

    public int P() {
        return this.Z;
    }

    public void y(int n10) {
        this.Z = n10;
        this.P();
    }

    public void C(BufferedImage bufferedImage) {
        this.f = bufferedImage;
        this.M = bufferedImage;
        this.P();
        this.repaint();
    }

    protected void P() {
        block3: {
            BufferedImage bufferedImage;
            block2: {
                String string = wb_0.m();
                bufferedImage = this.M;
                if (string == null) break block2;
                if (bufferedImage == null) break block3;
                this.M = xg_0.S(this.f, this.r, this.Z);
                bufferedImage = xg_0.m(this.M, 3);
            }
            BufferedImage bufferedImage2 = bufferedImage;
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            RV.X(graphics2D);
            graphics2D.setPaint(Color.WHITE);
            graphics2D.fillRoundRect(0, 0, this.M.getWidth(), this.M.getHeight(), this.I * 2, this.I * 2);
            graphics2D.setComposite(AlphaComposite.getInstance(5));
            graphics2D.drawImage((Image)this.M, 0, 0, null);
            graphics2D.dispose();
            this.M.flush();
            this.M = bufferedImage2;
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        String string = wb_0.m();
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        String string2 = string;
        Object object = RV.X(graphics2D);
        if (this.M != null) {
            graphics2D.drawImage((Image)this.M, this.getWidth() / 2 - this.M.getWidth() / 2 + 1, this.getHeight() / 2 - this.M.getHeight() / 2 + 1, null);
        }
        RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(this.getWidth() / 2 - this.r / 2 + 1, this.getHeight() / 2 - this.Z / 2 + 1, this.r - (this.M == null ? 3 : 1), this.Z - (this.M == null ? 3 : 1), this.I * 2, this.I * 2);
        if (string2 != null) {
            if (this.M == null) {
                graphics2D.setPaint(new Color(dj_0.a(29504, 7582048157992496264L), dj_0.a(4009, 6099193945677582435L), dj_0.a(4009, 6099193945677582435L)));
                graphics2D.fill(double_);
                graphics2D.setStroke(new BasicStroke(2.0f, 1, 1, 1.0f, new float[]{Math.max(5.0f, Math.min((float)(Math.max(this.r, this.Z) / dj_0.a(10533, 1078021828222580462L)), 10.0f)), 8.0f}, 4.0f));
                graphics2D.setPaint(Color.LIGHT_GRAY);
                graphics2D.draw(double_);
            }
            RV.X(graphics2D, object);
        }
        if (ky_2.F() != null) {
            wb_0.W("iQOVKc");
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.r + 2, this.Z + 2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4747364431614770488L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "o\u00ff\u001c\u00f1f\u00ea\u000b\u00d08L\u00a0\u001ba\u00eb\u00ad\u00a9N\u00d3\u00b5K\b\u0000\u00f4{\u00d6\u0095\u0011\u00b7\u0092\u00b4\u00d1B";
                var5_4 = "o\u00ff\u001c\u00f1f\u00ea\u000b\u00d08L\u00a0\u001ba\u00eb\u00ad\u00a9N\u00d3\u00b5K\b\u0000\u00f4{\u00d6\u0095\u0011\u00b7\u0092\u00b4\u00d1B".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = ":\u0005\u00d7\u001c?'D\u0089\u009a\\\u00fe\u0080u\u009a\u00e2\u008b";
                    var5_4 = ":\u0005\u00d7\u001c?'D\u0089\u009a\\\u00fe\u0080u\u009a\u00e2\u008b".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        dj_0.a = var6_1;
        dj_0.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5FCB;
        if (b[n11] == null) {
            dj_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

