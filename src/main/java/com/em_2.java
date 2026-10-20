/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.nio.ByteBuffer;

/*
 * Renamed from com.em
 */
public class em_2 {
    public byte[] g;
    public int N;
    public int R;

    public ByteBuffer m() {
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.g);
        byteBuffer.limit(this.N);
        byteBuffer.position(this.R);
        return byteBuffer;
    }
}

