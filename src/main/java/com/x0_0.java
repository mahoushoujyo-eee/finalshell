/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.C;
import com.LK;
import com.a9;
import com.ky_2;
import com.wb_0;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * Renamed from com.x0
 */
public class x0_0
extends C {
    private static final long a;

    public x0_0(String string) {
        this.e(new wb_0(string));
    }

    public x0_0(Class clazz, String string) {
        this.e(new wb_0(clazz, string));
    }

    public x0_0(URL uRL) {
        this.e(new wb_0(uRL));
    }

    public x0_0(Icon icon) {
        this.e(new wb_0(icon));
    }

    public x0_0(ImageIcon imageIcon) {
        this.e(new wb_0(imageIcon));
    }

    public x0_0(Image image) {
        this.e(new wb_0(image));
    }

    public x0_0(BufferedImage bufferedImage) {
        this.e(new wb_0(bufferedImage));
    }

    private void e(wb_0 wb_02) {
        this.setIconImages(a9.e());
        this.setLayout(new BorderLayout());
        ky_2 ky_22 = new ky_2(new LK());
        ky_22.C(Math.max(5, (int)a - wb_02.getWidth()));
        this.add(ky_22);
        ky_22.add(wb_02);
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        this.pack();
        this.U();
        this.setVisible(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2621116915874242962L;
        a = 0xC959D9759D73A1C2L ^ l2;
    }
}

