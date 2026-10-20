/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/*
 * Renamed from com.hy
 */
public class hy_2
extends W5 {
    private BufferedImageOp Z;
    private int s;

    public hy_2(BufferedImageOp bufferedImageOp, int n10) {
        this.Z = bufferedImageOp;
        this.s = n10;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        block2: {
            BufferedImage bufferedImage4 = bufferedImage;
            String[] stringArray = W5.q();
            for (int i2 = 0; i2 < this.s; ++i2) {
                bufferedImage3 = this.Z.filter(bufferedImage4, bufferedImage2);
                if (stringArray != null) {
                    bufferedImage4 = bufferedImage3;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            bufferedImage3 = bufferedImage4;
        }
        return bufferedImage3;
    }
}

