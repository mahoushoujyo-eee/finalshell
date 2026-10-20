/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import com.ky_2;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.F.c;
import org.s.W;

class Q
extends FilterReader {
    final Writer n;
    final boolean w;

    Q(Reader reader, Writer writer, boolean bl) {
        this.n = writer;
        this.w = bl;
        super(reader);
    }

    @Override
    public void close() throws IOException {
        this.in.close();
        this.n.close();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int read() throws IOException {
        block17: {
            block15: {
                block14: {
                    var2_1 = this.in.read();
                    var1_2 = W.v();
                    try {
                        try {
                            try {
                                v0 = var2_1;
                                if (var1_2 == null) break block14;
                                if (v0 == -1) {
                                }
                                ** GOTO lbl40
                            }
                            catch (IOException v1) {
                                throw Q.a(v1);
                            }
                            v2 = this;
                            if (var1_2 == null) break block15;
                        }
                        catch (IOException v3) {
                            throw Q.a(v3);
                        }
                        v0 = (int)v2.w;
                    }
                    catch (IOException v4) {
                        throw Q.a(v4);
                    }
                }
                try {
                    block16: {
                        try {
                            if (v0 == 0) break block16;
                            this.n.close();
                            if (var1_2 != null) break block17;
                        }
                        catch (IOException v5) {
                            throw Q.a(v5);
                        }
                    }
                    v2 = this;
                }
                catch (IOException v6) {
                    throw Q.a(v6);
                }
            }
            try {
                v2.n.flush();
                if (var1_2 != null) break block17;
lbl40:
                // 2 sources

                this.n.write(var2_1);
            }
            catch (IOException v7) {
                throw Q.a(v7);
            }
        }
        return var2_1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int read(@c char[] var1_1, int var2_2, int var3_3) throws IOException {
        block17: {
            block15: {
                block16: {
                    block14: {
                        var5_4 = this.in.read(var1_1, var2_2, var3_3);
                        var4_5 = W.v();
                        try {
                            try {
                                try {
                                    v0 = var5_4;
                                    if (var4_5 == null) break block14;
                                    if (v0 == -1) {
                                    }
                                    ** GOTO lbl41
                                }
                                catch (IOException v1) {
                                    throw Q.a(v1);
                                }
                                v2 = this;
                                if (var4_5 == null) break block15;
                            }
                            catch (IOException v3) {
                                throw Q.a(v3);
                            }
                            v0 = (int)v2.w;
                        }
                        catch (IOException v4) {
                            throw Q.a(v4);
                        }
                    }
                    try {
                        try {
                            if (v0 == 0) break block16;
                            this.n.close();
                            if (var4_5 != null) break block17;
                        }
                        catch (IOException v5) {
                            throw Q.a(v5);
                        }
                        ky_2.K(new String[3]);
                    }
                    catch (IOException v6) {
                        throw Q.a(v6);
                    }
                }
                v2 = this;
            }
            try {
                v2.n.flush();
                if (var4_5 != null) break block17;
lbl41:
                // 2 sources

                this.n.write(var1_1, var2_2, var5_4);
            }
            catch (IOException v7) {
                throw Q.a(v7);
            }
        }
        return var5_4;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

