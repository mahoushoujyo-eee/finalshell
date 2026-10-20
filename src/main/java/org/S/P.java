/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.F.F;
import org.s.W;

class P
extends FilterReader {
    private boolean M;
    final Runnable K;

    P(Reader reader, Runnable runnable) {
        this.K = runnable;
        super(reader);
    }

    @Override
    public int read() throws IOException {
        this.l();
        return super.read();
    }

    @Override
    @F(value=false)
    public int read(char[] cArray, int n10, int n11) throws IOException {
        this.l();
        return super.read(cArray, n10, n11);
    }

    @Override
    public long skip(long l2) throws IOException {
        this.l();
        return super.skip(l2);
    }

    private void l() {
        block3: {
            block2: {
                String string = W.v();
                P p2 = this;
                if (string == null) break block2;
                if (p2.M) break block3;
                this.K.run();
                p2 = this;
            }
            p2.M = true;
        }
    }
}

