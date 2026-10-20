/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;

/*
 * Renamed from com.Hr
 */
public class hr_0 {
    public float[] j = null;
    public float[] K = null;
    public int d;
    public int F;
    private static final String[] a;
    private static final String[] b;

    public hr_0(int n10, int n11, int n12, int n13) {
        this.d = n10;
        this.F = n11;
        String[] stringArray = W5.q();
        this.j = new float[n10 * n11];
        this.K = new float[n10 * n11];
        int n14 = 0;
        int n15 = 0;
        while (n15 < n10) {
            block5: {
                for (int i2 = 0; i2 < n11; ++i2) {
                    try {
                        this.j[n14] = (float)i2 * (float)(n12 - 1) / (float)(n11 - 1);
                        this.K[n14] = (float)n15 * (float)(n13 - 1) / (float)(n10 - 1);
                        ++n14;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hr_0.a(illegalArgumentException);
                    }
                }
                ++n15;
            }
            if (stringArray != null) continue;
        }
    }

    public void E(int n10) {
        block12: {
            int n11 = (this.d + 1) * this.F;
            float[] fArray = new float[n11];
            String[] stringArray = W5.q();
            float[] fArray2 = new float[n11];
            ++this.d;
            int n12 = 0;
            int n13 = 0;
            for (int i2 = 0; i2 < this.d; ++i2) {
                int n14;
                int n15;
                block16: {
                    block17: {
                        block14: {
                            if (stringArray == null) break block12;
                            for (int i3 = 0; i3 < this.F; ++i3) {
                                int n16;
                                block13: {
                                    int n17 = n13 + i3;
                                    n16 = n12 + i3;
                                    try {
                                        block15: {
                                            try {
                                                try {
                                                    try {
                                                        if (stringArray == null) break block13;
                                                        n15 = i2;
                                                        n14 = n10;
                                                        if (stringArray == null) break block14;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw hr_0.a(illegalArgumentException);
                                                    }
                                                    if (n15 != n14) break block15;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw hr_0.a(illegalArgumentException);
                                                }
                                                fArray[n17] = (this.j[n16] + this.j[n17]) / 2.0f;
                                                fArray2[n17] = (this.K[n16] + this.K[n17]) / 2.0f;
                                                if (stringArray != null) continue;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw hr_0.a(illegalArgumentException);
                                            }
                                        }
                                        fArray[n17] = this.j[n16];
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw hr_0.a(illegalArgumentException);
                                    }
                                }
                                fArray2[n17] = this.K[n16];
                                if (stringArray != null) continue;
                            }
                            n15 = i2;
                            n14 = n10 - 1;
                        }
                        try {
                            if (stringArray == null) break block16;
                            if (n15 == n14) break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hr_0.a(illegalArgumentException);
                        }
                        n12 += this.F;
                    }
                    n15 = n13;
                    n14 = this.F;
                }
                n13 = n15 + n14;
                if (stringArray != null) continue;
            }
            this.j = fArray;
            this.K = fArray2;
        }
    }

    public void f(int n10) {
        block7: {
            int n11 = this.d * (this.F + 1);
            float[] fArray = new float[n11];
            float[] fArray2 = new float[n11];
            ++this.F;
            String[] stringArray = W5.q();
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            block4: while (true) {
                int n15 = n14;
                int n16 = this.d;
                block5: while (n15 < n16) {
                    if (stringArray == null) break block7;
                    for (int i2 = 0; i2 < this.F; ++i2) {
                        block9: {
                            n15 = i2;
                            n16 = n10;
                            if (stringArray == null) continue block5;
                            try {
                                block8: {
                                    try {
                                        if (n15 != n16) break block8;
                                        fArray[n13] = (this.j[n12] + this.j[n12 - 1]) / 2.0f;
                                        fArray2[n13] = (this.K[n12] + this.K[n12 - 1]) / 2.0f;
                                        if (stringArray != null) break block9;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw hr_0.a(illegalArgumentException);
                                    }
                                }
                                fArray[n13] = this.j[n12];
                                fArray2[n13] = this.K[n12];
                                ++n12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hr_0.a(illegalArgumentException);
                            }
                        }
                        ++n13;
                        if (stringArray != null) continue;
                    }
                    ++n14;
                    if (stringArray != null) continue block4;
                }
                break;
            }
            this.j = fArray;
            this.K = fArray2;
        }
    }

    public void r(int n10) {
        block7: {
            int n11 = (this.d - 1) * this.F;
            float[] fArray = new float[n11];
            float[] fArray2 = new float[n11];
            String[] stringArray = W5.q();
            --this.d;
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            while (n14 < this.d) {
                block8: {
                    int n15;
                    int n16;
                    block9: {
                        block10: {
                            if (stringArray == null) break block7;
                            for (int i2 = 0; i2 < this.F; ++i2) {
                                int n17 = n13 + i2;
                                int n18 = n12 + i2;
                                try {
                                    fArray[n17] = this.j[n18];
                                    fArray2[n17] = this.K[n18];
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                        break;
                                    }
                                    break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hr_0.a(illegalArgumentException);
                                }
                            }
                            try {
                                n16 = n14;
                                n15 = n10 - 1;
                                if (stringArray == null) break block9;
                                if (n16 != n15) break block10;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hr_0.a(illegalArgumentException);
                            }
                            n12 += this.F;
                        }
                        n12 += this.F;
                        n16 = n13;
                        n15 = this.F;
                    }
                    n13 = n16 + n15;
                    ++n14;
                }
                if (stringArray != null) continue;
            }
            this.j = fArray;
            this.K = fArray2;
        }
    }

    public void b(int n10) {
        block6: {
            int n11 = this.d * (this.F + 1);
            float[] fArray = new float[n11];
            float[] fArray2 = new float[n11];
            --this.F;
            String[] stringArray = W5.q();
            int n12 = 0;
            block2: while (true) {
                int n13 = n12;
                int n14 = this.d;
                block3: while (n13 < n14) {
                    int n15 = n12 * (this.F + 1);
                    int n16 = n12 * this.F;
                    if (stringArray == null) break block6;
                    int n17 = 0;
                    while (n17 < this.F) {
                        block7: {
                            try {
                                fArray[n16] = this.j[n15];
                                fArray2[n16] = this.K[n15];
                                if (stringArray == null) break block7;
                                n13 = n17;
                                n14 = n10 - 1;
                                if (stringArray == null) continue block3;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hr_0.a(illegalArgumentException);
                            }
                            if (n13 == n14) {
                                ++n15;
                            }
                            ++n15;
                            ++n16;
                            ++n17;
                        }
                        if (stringArray != null) continue;
                    }
                    ++n12;
                    if (stringArray != null) continue block2;
                }
                break;
            }
            this.j = fArray;
            this.K = fArray2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void O(float f10, hr_0 hr_02, hr_0 hr_03) {
        int n10;
        String[] stringArray;
        block26: {
            int n11;
            block25: {
                block23: {
                    block24: {
                        block22: {
                            stringArray = W5.q();
                            try {
                                try {
                                    n10 = this.d;
                                    n11 = hr_02.d;
                                    if (stringArray == null) break block22;
                                    if (n10 != n11) throw new IllegalArgumentException(hr_0.a(30714, 5371));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hr_0.a(illegalArgumentException);
                                }
                                n10 = this.F;
                                n11 = hr_02.F;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hr_0.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (stringArray == null) break block23;
                                if (n10 == n11) break block24;
                                throw new IllegalArgumentException(hr_0.a(30714, 5371));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hr_0.a(illegalArgumentException);
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hr_0.a(illegalArgumentException);
                        }
                    }
                    n10 = this.d;
                    n11 = hr_03.d;
                }
                try {
                    try {
                        try {
                            if (stringArray == null) break block25;
                            if (n10 != n11) throw new IllegalArgumentException(hr_0.a(30715, 3410));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hr_0.a(illegalArgumentException);
                        }
                        n10 = this.F;
                        if (stringArray == null) break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hr_0.a(illegalArgumentException);
                    }
                    n11 = hr_03.F;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw hr_0.a(illegalArgumentException);
                }
            }
            try {
                if (n10 != n11) {
                    throw new IllegalArgumentException(hr_0.a(30715, 3410));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw hr_0.a(illegalArgumentException);
            }
            n10 = 0;
        }
        int n12 = n10;
        int n13 = 0;
        while (n13 < this.d) {
            block27: {
                for (int i2 = 0; i2 < this.F; ++i2) {
                    try {
                        hr_03.j[n12] = NM.J(f10, this.j[n12], hr_02.j[n12]);
                        hr_03.K[n12] = NM.J(f10, this.K[n12], hr_02.K[n12]);
                        ++n12;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                            break;
                        }
                        break block27;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hr_0.a(illegalArgumentException);
                    }
                }
                ++n13;
            }
            if (stringArray != null) continue;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void l(int[] nArray, int n10, int n11, hr_0 hr_02, hr_0 hr_03, int[] nArray2) {
        String[] stringArray = W5.q();
        try {
            int n12;
            int[] nArray3;
            int n13;
            int n14;
            hr_0 hr_04;
            int n15;
            int n16;
            float[] fArray;
            float[] fArray2;
            float[] fArray3;
            block54: {
                block53: {
                    int n17;
                    int n18;
                    block50: {
                        int n19;
                        float[] fArray4;
                        block47: {
                            int n20;
                            int n21;
                            int n22;
                            block45: {
                                block46: {
                                    block44: {
                                        n22 = hr_02.d;
                                        n21 = hr_03.d;
                                        if (stringArray == null) break block44;
                                        try {
                                            block56: {
                                                if (n22 != n21) throw new IllegalArgumentException(hr_0.a(30712, 19153));
                                                break block56;
                                                catch (Exception exception) {
                                                    throw hr_0.a(exception);
                                                }
                                            }
                                            n22 = hr_02.F;
                                            n21 = hr_03.F;
                                        }
                                        catch (Exception exception) {
                                            throw hr_0.a(exception);
                                        }
                                    }
                                    if (stringArray == null) break block45;
                                    try {
                                        if (n22 == n21) break block46;
                                        throw new IllegalArgumentException(hr_0.a(30712, 19153));
                                        catch (Exception exception) {
                                            throw hr_0.a(exception);
                                        }
                                    }
                                    catch (Exception exception) {
                                        throw hr_0.a(exception);
                                    }
                                }
                                n22 = n10;
                                n21 = n11;
                            }
                            int n23 = Math.max(n22, n21);
                            fArray3 = new float[n23];
                            fArray2 = new float[n23];
                            fArray = new float[n23 + 1];
                            fArray4 = new float[n23 + 1];
                            n16 = hr_02.F;
                            n15 = hr_02.d;
                            hr_04 = new hr_0(n11, n16, 1, 1);
                            n19 = 0;
                            while (n19 < n16) {
                                block49: {
                                    block48: {
                                        n14 = n19;
                                        n20 = 0;
                                        if (stringArray == null) break block47;
                                        for (n13 = v3664128; n13 < n15; ++n13) {
                                            fArray3[n13] = hr_02.j[n14];
                                            fArray2[n13] = hr_02.K[n14];
                                            n14 += n16;
                                            try {
                                                if (stringArray != null) {
                                                    if (stringArray != null) continue;
                                                    break;
                                                }
                                                break block48;
                                            }
                                            catch (Exception exception) {
                                                throw hr_0.a(exception);
                                            }
                                        }
                                        this.D(fArray2, fArray3, 0, n15, fArray4, 0, n11);
                                        n14 = n19;
                                    }
                                    for (n18 = 0; n18 < n11; ++n18) {
                                        hr_04.j[n14] = fArray4[n18];
                                        n14 += n16;
                                        try {
                                            if (stringArray != null) {
                                                if (stringArray != null) continue;
                                                break;
                                            }
                                            break block49;
                                        }
                                        catch (Exception exception) {
                                            throw hr_0.a(exception);
                                        }
                                    }
                                    ++n19;
                                }
                                if (stringArray != null) continue;
                            }
                            n20 = n19 = 0;
                        }
                        while (n19 < n16) {
                            block52: {
                                block51: {
                                    n14 = n19;
                                    n17 = 0;
                                    if (stringArray == null) break block50;
                                    for (n13 = v3664179; n13 < n15; ++n13) {
                                        fArray3[n13] = hr_03.j[n14];
                                        fArray2[n13] = hr_03.K[n14];
                                        n14 += n16;
                                        try {
                                            if (stringArray != null) {
                                                if (stringArray != null) continue;
                                                break;
                                            }
                                            break block51;
                                        }
                                        catch (Exception exception) {
                                            throw hr_0.a(exception);
                                        }
                                    }
                                    this.D(fArray2, fArray3, 0, n15, fArray4, 0, n11);
                                    n14 = n19;
                                }
                                for (n18 = 0; n18 < n11; ++n18) {
                                    hr_04.K[n14] = fArray4[n18];
                                    n14 += n16;
                                    try {
                                        if (stringArray != null) {
                                            if (stringArray != null) continue;
                                            break;
                                        }
                                        break block52;
                                    }
                                    catch (Exception exception) {
                                        throw hr_0.a(exception);
                                    }
                                }
                                ++n19;
                            }
                            if (stringArray != null) continue;
                        }
                        n17 = n11 * n10;
                    }
                    nArray3 = new int[n17];
                    n14 = 0;
                    for (n18 = 0; n18 < n11; ++n18) {
                        this.D(hr_04.j, hr_04.K, n14, n16, fArray, 0, n10);
                        fArray[n10] = n10;
                        NM.K(nArray, nArray3, n10, n18 * n10, 1, fArray);
                        n14 += n16;
                        try {
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                                break;
                            }
                            break block53;
                        }
                        catch (Exception exception) {
                            throw hr_0.a(exception);
                        }
                    }
                    hr_04 = new hr_0(n15, n10, 1, 1);
                    n14 = 0;
                }
                n12 = 0;
                for (n13 = 0; n13 < n15; ++n13) {
                    this.D(hr_02.j, hr_02.K, n14, n16, hr_04.j, n12, n10);
                    n14 += n16;
                    n12 += n10;
                    try {
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                            break;
                        }
                        break block54;
                    }
                    catch (Exception exception) {
                        throw hr_0.a(exception);
                    }
                }
                n14 = 0;
                n12 = 0;
            }
            for (n13 = 0; n13 < n15; ++n13) {
                this.D(hr_03.j, hr_03.K, n14, n16, hr_04.K, n12, n10);
                n14 += n16;
                n12 += n10;
                try {
                    if (stringArray == null) return;
                    if (stringArray != null) continue;
                    break;
                }
                catch (Exception exception) {
                    throw hr_0.a(exception);
                }
            }
            int n24 = 0;
            while (n24 < n10) {
                block55: {
                    int n25 = n24;
                    if (stringArray == null) return;
                    for (n13 = 0; n13 < n15; ++n13) {
                        fArray3[n13] = hr_04.j[n25];
                        fArray2[n13] = hr_04.K[n25];
                        n25 += n10;
                        try {
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                                break;
                            }
                            break block55;
                        }
                        catch (Exception exception) {
                            throw hr_0.a(exception);
                        }
                    }
                    this.D(fArray3, fArray2, 0, n15, fArray, 0, n11);
                    fArray[n11] = n11;
                    NM.K(nArray3, nArray2, n11, n24, n10, fArray);
                    ++n24;
                }
                if (stringArray != null) continue;
                return;
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void D(float[] fArray, float[] fArray2, int n10, int n11, float[] fArray3, int n12, int n13) {
        float f10;
        int n14 = n10;
        int n15 = n10 + n11 - 1;
        float f11 = fArray[n14];
        float f12 = f10 = fArray2[n14];
        float f13 = f10;
        float f14 = fArray[n14 + 1];
        float f15 = fArray2[n14 + 1];
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < n13; ++i2) {
            int n16;
            block11: {
                block12: {
                    block15: {
                        int n17;
                        int n18;
                        block13: {
                            block14: {
                                try {
                                    try {
                                        try {
                                            n16 = n14;
                                            if (stringArray == null) break block11;
                                            if (n16 > n15) break block12;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw hr_0.a(illegalArgumentException);
                                        }
                                        float f16 = (float)i2 - fArray[n14];
                                        n16 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                        if (stringArray == null) break block11;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw hr_0.a(illegalArgumentException);
                                    }
                                    if (n16 <= 0) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hr_0.a(illegalArgumentException);
                                }
                                f13 = f12;
                                f12 = f10;
                                f10 = f15;
                                f11 = fArray[n14];
                                try {
                                    n18 = ++n14;
                                    n17 = n15;
                                    if (stringArray == null) break block13;
                                    if (n18 > n17) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hr_0.a(illegalArgumentException);
                                }
                                f14 = fArray[n14];
                            }
                            n18 = n14;
                            n17 = n15;
                        }
                        if (n18 >= n17) break block15;
                        f15 = fArray2[n14 + 1];
                        if (stringArray != null) break block12;
                    }
                    f15 = f10;
                }
                n16 = i2;
            }
            float f17 = ((float)n16 - f11) / (f14 - f11);
            float f18 = -0.5f * f13 + 1.5f * f12 + -1.5f * f10 + 0.5f * f15;
            float f19 = 1.0f * f13 + -2.5f * f12 + 2.0f * f10 + -0.5f * f15;
            float f20 = -0.5f * f13 + 0.5f * f10;
            float f21 = 1.0f * f12;
            fArray3[n12 + i2] = ((f18 * f17 + f19) * f17 + f20) * f17 + f21;
            if (stringArray != null) continue;
        }
    }

    protected void G(float[] fArray, float[] fArray2, int n10, float[] fArray3, int n11, int n12) {
        int n13 = n10;
        float f10 = fArray[n13];
        String[] stringArray = W5.q();
        float f11 = fArray2[n13];
        float f12 = fArray[n13 + 1];
        float f13 = fArray2[n13 + 1];
        for (int i2 = 0; i2 < n12; ++i2) {
            float f14;
            block3: {
                block4: {
                    try {
                        float f15 = (float)i2 - fArray[n13];
                        f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                        if (stringArray == null) break block3;
                        if (f14 <= 0) break block4;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hr_0.a(illegalArgumentException);
                    }
                    f10 = fArray[n13];
                    f11 = fArray2[n13];
                    f12 = fArray[++n13];
                    f13 = fArray2[n13];
                }
                f14 = i2;
            }
            float f16 = ((float)f14 - f10) / (f12 - f10);
            fArray3[n11 + i2] = f11 + f16 * (f13 - f11);
            if (stringArray != null) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\u0002'\u0094kn^\u009f\u009d\u00de&'\f\u00cfg\u00ba\u00ff\u007f\u00a5|\u00fag\u008b)\u000f\f\u008d\u00f7aM\u00c57\bz\u00c7`\u00bb\u00e8B/k\u00aeV+\"\u00e5\u00903\u00eeU\u008f\u00fc\u00dc\ng\u0084\u00cc\u00dd\u00a1T,\u00ace_X%D\u00c2_J\u00a9(f/\u00fe\u00b8T\u00a5[\u0018\u00b1<\u00c0\u008e\u0015\u008d\u001a0\u009b\u0000\u00a7\u008f\b\u00c2S\u000eGT\u0014B\u00a9\u00aev\u00c6\u00e6\u0082O\u001e\u0001\u0017\u00e5\u009a\u0095\u00f5\u0080\u00f4&\u0085.\u00e7\u009d;\u0083\u00175\u0091\u0001\u00da\u0018\u009b~\u009d>\u00ab\u00a2Y";
            var4_3 = "\u0002'\u0094kn^\u009f\u009d\u00de&'\f\u00cfg\u00ba\u00ff\u007f\u00a5|\u00fag\u008b)\u000f\f\u008d\u00f7aM\u00c57\bz\u00c7`\u00bb\u00e8B/k\u00aeV+\"\u00e5\u00903\u00eeU\u008f\u00fc\u00dc\ng\u0084\u00cc\u00dd\u00a1T,\u00ace_X%D\u00c2_J\u00a9(f/\u00fe\u00b8T\u00a5[\u0018\u00b1<\u00c0\u008e\u0015\u008d\u001a0\u009b\u0000\u00a7\u008f\b\u00c2S\u000eGT\u0014B\u00a9\u00aev\u00c6\u00e6\u0082O\u001e\u0001\u0017\u00e5\u009a\u0095\u00f5\u0080\u00f4&\u0085.\u00e7\u009d;\u0083\u00175\u0091\u0001\u00da\u0018\u009b~\u009d>\u00ab\u00a2Y".length();
            var1_4 = 42;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 76;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 50;
                            break;
                        }
                        case 1: {
                            v11 = 44;
                            break;
                        }
                        case 2: {
                            v11 = 63;
                            break;
                        }
                        case 3: {
                            v11 = 63;
                            break;
                        }
                        case 4: {
                            v11 = 102;
                            break;
                        }
                        case 5: {
                            v11 = 72;
                            break;
                        }
                        default: {
                            v11 = 116;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        hr_0.a = var5;
        hr_0.b = new String[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x77FA) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 144;
                    break;
                }
                case 1: {
                    n14 = 8;
                    break;
                }
                case 2: {
                    n14 = 147;
                    break;
                }
                case 3: {
                    n14 = 237;
                    break;
                }
                case 4: {
                    n14 = 29;
                    break;
                }
                case 5: {
                    n14 = 141;
                    break;
                }
                case 6: {
                    n14 = 77;
                    break;
                }
                case 7: {
                    n14 = 57;
                    break;
                }
                case 8: {
                    n14 = 233;
                    break;
                }
                case 9: {
                    n14 = 62;
                    break;
                }
                case 10: {
                    n14 = 44;
                    break;
                }
                case 11: {
                    n14 = 101;
                    break;
                }
                case 12: {
                    n14 = 139;
                    break;
                }
                case 13: {
                    n14 = 247;
                    break;
                }
                case 14: {
                    n14 = 198;
                    break;
                }
                case 15: {
                    n14 = 136;
                    break;
                }
                case 16: {
                    n14 = 145;
                    break;
                }
                case 17: {
                    n14 = 185;
                    break;
                }
                case 18: {
                    n14 = 73;
                    break;
                }
                case 19: {
                    n14 = 28;
                    break;
                }
                case 20: {
                    n14 = 103;
                    break;
                }
                case 21: {
                    n14 = 204;
                    break;
                }
                case 22: {
                    n14 = 154;
                    break;
                }
                case 23: {
                    n14 = 67;
                    break;
                }
                case 24: {
                    n14 = 115;
                    break;
                }
                case 25: {
                    n14 = 34;
                    break;
                }
                case 26: {
                    n14 = 68;
                    break;
                }
                case 27: {
                    n14 = 2;
                    break;
                }
                case 28: {
                    n14 = 93;
                    break;
                }
                case 29: {
                    n14 = 200;
                    break;
                }
                case 30: {
                    n14 = 108;
                    break;
                }
                case 31: {
                    n14 = 249;
                    break;
                }
                case 32: {
                    n14 = 135;
                    break;
                }
                case 33: {
                    n14 = 222;
                    break;
                }
                case 34: {
                    n14 = 146;
                    break;
                }
                case 35: {
                    n14 = 31;
                    break;
                }
                case 36: {
                    n14 = 114;
                    break;
                }
                case 37: {
                    n14 = 184;
                    break;
                }
                case 38: {
                    n14 = 7;
                    break;
                }
                case 39: {
                    n14 = 109;
                    break;
                }
                case 40: {
                    n14 = 100;
                    break;
                }
                case 41: {
                    n14 = 148;
                    break;
                }
                case 42: {
                    n14 = 163;
                    break;
                }
                case 43: {
                    n14 = 164;
                    break;
                }
                case 44: {
                    n14 = 95;
                    break;
                }
                case 45: {
                    n14 = 209;
                    break;
                }
                case 46: {
                    n14 = 5;
                    break;
                }
                case 47: {
                    n14 = 235;
                    break;
                }
                case 48: {
                    n14 = 129;
                    break;
                }
                case 49: {
                    n14 = 215;
                    break;
                }
                case 50: {
                    n14 = 166;
                    break;
                }
                case 51: {
                    n14 = 112;
                    break;
                }
                case 52: {
                    n14 = 190;
                    break;
                }
                case 53: {
                    n14 = 52;
                    break;
                }
                case 54: {
                    n14 = 0;
                    break;
                }
                case 55: {
                    n14 = 38;
                    break;
                }
                case 56: {
                    n14 = 78;
                    break;
                }
                case 57: {
                    n14 = 138;
                    break;
                }
                case 58: {
                    n14 = 241;
                    break;
                }
                case 59: {
                    n14 = 150;
                    break;
                }
                case 60: {
                    n14 = 113;
                    break;
                }
                case 61: {
                    n14 = 81;
                    break;
                }
                case 62: {
                    n14 = 234;
                    break;
                }
                case 63: {
                    n14 = 19;
                    break;
                }
                case 64: {
                    n14 = 238;
                    break;
                }
                case 65: {
                    n14 = 111;
                    break;
                }
                case 66: {
                    n14 = 216;
                    break;
                }
                case 67: {
                    n14 = 82;
                    break;
                }
                case 68: {
                    n14 = 13;
                    break;
                }
                case 69: {
                    n14 = 173;
                    break;
                }
                case 70: {
                    n14 = 96;
                    break;
                }
                case 71: {
                    n14 = 194;
                    break;
                }
                case 72: {
                    n14 = 14;
                    break;
                }
                case 73: {
                    n14 = 42;
                    break;
                }
                case 74: {
                    n14 = 214;
                    break;
                }
                case 75: {
                    n14 = 140;
                    break;
                }
                case 76: {
                    n14 = 179;
                    break;
                }
                case 77: {
                    n14 = 119;
                    break;
                }
                case 78: {
                    n14 = 120;
                    break;
                }
                case 79: {
                    n14 = 86;
                    break;
                }
                case 80: {
                    n14 = 253;
                    break;
                }
                case 81: {
                    n14 = 70;
                    break;
                }
                case 82: {
                    n14 = 105;
                    break;
                }
                case 83: {
                    n14 = 165;
                    break;
                }
                case 84: {
                    n14 = 25;
                    break;
                }
                case 85: {
                    n14 = 207;
                    break;
                }
                case 86: {
                    n14 = 226;
                    break;
                }
                case 87: {
                    n14 = 74;
                    break;
                }
                case 88: {
                    n14 = 53;
                    break;
                }
                case 89: {
                    n14 = 49;
                    break;
                }
                case 90: {
                    n14 = 169;
                    break;
                }
                case 91: {
                    n14 = 66;
                    break;
                }
                case 92: {
                    n14 = 35;
                    break;
                }
                case 93: {
                    n14 = 149;
                    break;
                }
                case 94: {
                    n14 = 186;
                    break;
                }
                case 95: {
                    n14 = 171;
                    break;
                }
                case 96: {
                    n14 = 3;
                    break;
                }
                case 97: {
                    n14 = 191;
                    break;
                }
                case 98: {
                    n14 = 43;
                    break;
                }
                case 99: {
                    n14 = 99;
                    break;
                }
                case 100: {
                    n14 = 56;
                    break;
                }
                case 101: {
                    n14 = 72;
                    break;
                }
                case 102: {
                    n14 = 143;
                    break;
                }
                case 103: {
                    n14 = 161;
                    break;
                }
                case 104: {
                    n14 = 98;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 51;
                    break;
                }
                case 107: {
                    n14 = 242;
                    break;
                }
                case 108: {
                    n14 = 252;
                    break;
                }
                case 109: {
                    n14 = 243;
                    break;
                }
                case 110: {
                    n14 = 26;
                    break;
                }
                case 111: {
                    n14 = 122;
                    break;
                }
                case 112: {
                    n14 = 89;
                    break;
                }
                case 113: {
                    n14 = 239;
                    break;
                }
                case 114: {
                    n14 = 223;
                    break;
                }
                case 115: {
                    n14 = 181;
                    break;
                }
                case 116: {
                    n14 = 251;
                    break;
                }
                case 117: {
                    n14 = 76;
                    break;
                }
                case 118: {
                    n14 = 128;
                    break;
                }
                case 119: {
                    n14 = 157;
                    break;
                }
                case 120: {
                    n14 = 228;
                    break;
                }
                case 121: {
                    n14 = 199;
                    break;
                }
                case 122: {
                    n14 = 39;
                    break;
                }
                case 123: {
                    n14 = 30;
                    break;
                }
                case 124: {
                    n14 = 236;
                    break;
                }
                case 125: {
                    n14 = 195;
                    break;
                }
                case 126: {
                    n14 = 69;
                    break;
                }
                case 127: {
                    n14 = 188;
                    break;
                }
                case 128: {
                    n14 = 102;
                    break;
                }
                case 129: {
                    n14 = 91;
                    break;
                }
                case 130: {
                    n14 = 172;
                    break;
                }
                case 131: {
                    n14 = 240;
                    break;
                }
                case 132: {
                    n14 = 224;
                    break;
                }
                case 133: {
                    n14 = 210;
                    break;
                }
                case 134: {
                    n14 = 110;
                    break;
                }
                case 135: {
                    n14 = 217;
                    break;
                }
                case 136: {
                    n14 = 117;
                    break;
                }
                case 137: {
                    n14 = 41;
                    break;
                }
                case 138: {
                    n14 = 106;
                    break;
                }
                case 139: {
                    n14 = 133;
                    break;
                }
                case 140: {
                    n14 = 211;
                    break;
                }
                case 141: {
                    n14 = 174;
                    break;
                }
                case 142: {
                    n14 = 250;
                    break;
                }
                case 143: {
                    n14 = 65;
                    break;
                }
                case 144: {
                    n14 = 248;
                    break;
                }
                case 145: {
                    n14 = 64;
                    break;
                }
                case 146: {
                    n14 = 232;
                    break;
                }
                case 147: {
                    n14 = 178;
                    break;
                }
                case 148: {
                    n14 = 208;
                    break;
                }
                case 149: {
                    n14 = 196;
                    break;
                }
                case 150: {
                    n14 = 79;
                    break;
                }
                case 151: {
                    n14 = 153;
                    break;
                }
                case 152: {
                    n14 = 61;
                    break;
                }
                case 153: {
                    n14 = 205;
                    break;
                }
                case 154: {
                    n14 = 231;
                    break;
                }
                case 155: {
                    n14 = 227;
                    break;
                }
                case 156: {
                    n14 = 87;
                    break;
                }
                case 157: {
                    n14 = 180;
                    break;
                }
                case 158: {
                    n14 = 54;
                    break;
                }
                case 159: {
                    n14 = 182;
                    break;
                }
                case 160: {
                    n14 = 246;
                    break;
                }
                case 161: {
                    n14 = 193;
                    break;
                }
                case 162: {
                    n14 = 167;
                    break;
                }
                case 163: {
                    n14 = 4;
                    break;
                }
                case 164: {
                    n14 = 254;
                    break;
                }
                case 165: {
                    n14 = 94;
                    break;
                }
                case 166: {
                    n14 = 63;
                    break;
                }
                case 167: {
                    n14 = 75;
                    break;
                }
                case 168: {
                    n14 = 6;
                    break;
                }
                case 169: {
                    n14 = 10;
                    break;
                }
                case 170: {
                    n14 = 32;
                    break;
                }
                case 171: {
                    n14 = 24;
                    break;
                }
                case 172: {
                    n14 = 177;
                    break;
                }
                case 173: {
                    n14 = 131;
                    break;
                }
                case 174: {
                    n14 = 221;
                    break;
                }
                case 175: {
                    n14 = 220;
                    break;
                }
                case 176: {
                    n14 = 45;
                    break;
                }
                case 177: {
                    n14 = 85;
                    break;
                }
                case 178: {
                    n14 = 88;
                    break;
                }
                case 179: {
                    n14 = 155;
                    break;
                }
                case 180: {
                    n14 = 118;
                    break;
                }
                case 181: {
                    n14 = 197;
                    break;
                }
                case 182: {
                    n14 = 189;
                    break;
                }
                case 183: {
                    n14 = 37;
                    break;
                }
                case 184: {
                    n14 = 104;
                    break;
                }
                case 185: {
                    n14 = 201;
                    break;
                }
                case 186: {
                    n14 = 21;
                    break;
                }
                case 187: {
                    n14 = 23;
                    break;
                }
                case 188: {
                    n14 = 176;
                    break;
                }
                case 189: {
                    n14 = 151;
                    break;
                }
                case 190: {
                    n14 = 244;
                    break;
                }
                case 191: {
                    n14 = 212;
                    break;
                }
                case 192: {
                    n14 = 127;
                    break;
                }
                case 193: {
                    n14 = 206;
                    break;
                }
                case 194: {
                    n14 = 219;
                    break;
                }
                case 195: {
                    n14 = 107;
                    break;
                }
                case 196: {
                    n14 = 15;
                    break;
                }
                case 197: {
                    n14 = 97;
                    break;
                }
                case 198: {
                    n14 = 142;
                    break;
                }
                case 199: {
                    n14 = 130;
                    break;
                }
                case 200: {
                    n14 = 162;
                    break;
                }
                case 201: {
                    n14 = 33;
                    break;
                }
                case 202: {
                    n14 = 116;
                    break;
                }
                case 203: {
                    n14 = 84;
                    break;
                }
                case 204: {
                    n14 = 83;
                    break;
                }
                case 205: {
                    n14 = 203;
                    break;
                }
                case 206: {
                    n14 = 121;
                    break;
                }
                case 207: {
                    n14 = 27;
                    break;
                }
                case 208: {
                    n14 = 90;
                    break;
                }
                case 209: {
                    n14 = 137;
                    break;
                }
                case 210: {
                    n14 = 213;
                    break;
                }
                case 211: {
                    n14 = 218;
                    break;
                }
                case 212: {
                    n14 = 158;
                    break;
                }
                case 213: {
                    n14 = 225;
                    break;
                }
                case 214: {
                    n14 = 47;
                    break;
                }
                case 215: {
                    n14 = 50;
                    break;
                }
                case 216: {
                    n14 = 20;
                    break;
                }
                case 217: {
                    n14 = 125;
                    break;
                }
                case 218: {
                    n14 = 48;
                    break;
                }
                case 219: {
                    n14 = 22;
                    break;
                }
                case 220: {
                    n14 = 80;
                    break;
                }
                case 221: {
                    n14 = 12;
                    break;
                }
                case 222: {
                    n14 = 255;
                    break;
                }
                case 223: {
                    n14 = 46;
                    break;
                }
                case 224: {
                    n14 = 36;
                    break;
                }
                case 225: {
                    n14 = 55;
                    break;
                }
                case 226: {
                    n14 = 16;
                    break;
                }
                case 227: {
                    n14 = 168;
                    break;
                }
                case 228: {
                    n14 = 183;
                    break;
                }
                case 229: {
                    n14 = 59;
                    break;
                }
                case 230: {
                    n14 = 11;
                    break;
                }
                case 231: {
                    n14 = 132;
                    break;
                }
                case 232: {
                    n14 = 134;
                    break;
                }
                case 233: {
                    n14 = 230;
                    break;
                }
                case 234: {
                    n14 = 126;
                    break;
                }
                case 235: {
                    n14 = 152;
                    break;
                }
                case 236: {
                    n14 = 71;
                    break;
                }
                case 237: {
                    n14 = 60;
                    break;
                }
                case 238: {
                    n14 = 156;
                    break;
                }
                case 239: {
                    n14 = 124;
                    break;
                }
                case 240: {
                    n14 = 123;
                    break;
                }
                case 241: {
                    n14 = 58;
                    break;
                }
                case 242: {
                    n14 = 17;
                    break;
                }
                case 243: {
                    n14 = 192;
                    break;
                }
                case 244: {
                    n14 = 160;
                    break;
                }
                case 245: {
                    n14 = 18;
                    break;
                }
                case 246: {
                    n14 = 92;
                    break;
                }
                case 247: {
                    n14 = 202;
                    break;
                }
                case 248: {
                    n14 = 187;
                    break;
                }
                case 249: {
                    n14 = 175;
                    break;
                }
                case 250: {
                    n14 = 1;
                    break;
                }
                case 251: {
                    n14 = 229;
                    break;
                }
                case 252: {
                    n14 = 170;
                    break;
                }
                case 253: {
                    n14 = 9;
                    break;
                }
                case 254: {
                    n14 = 40;
                    break;
                }
                default: {
                    n14 = 159;
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
            hr_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

