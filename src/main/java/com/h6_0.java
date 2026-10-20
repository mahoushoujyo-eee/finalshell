/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/*
 * Renamed from com.h6
 */
public class h6_0
extends W5 {
    private BufferedImageOp m;
    private BufferedImageOp d;

    public h6_0(BufferedImageOp bufferedImageOp, BufferedImageOp bufferedImageOp2) {
        this.m = bufferedImageOp;
        this.d = bufferedImageOp2;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3 = this.m.filter(bufferedImage, bufferedImage2);
        bufferedImage3 = this.d.filter(bufferedImage3, bufferedImage2);
        return bufferedImage3;
    }
}

