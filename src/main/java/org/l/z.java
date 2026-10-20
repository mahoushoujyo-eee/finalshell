/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import com.ky_2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.l.A;
import org.l.F;
import org.l.W;

class z {
    final Iterator w;
    final Iterator Y;
    final W M;

    z(W w2, File file) {
        block24: {
            this.M = w2;
            boolean bl = F.s();
            File[] fileArray = file.listFiles();
            boolean bl2 = bl;
            try {
                if (fileArray == null) {
                    throw new A(file.getPath());
                }
            }
            catch (A a10) {
                throw z.a(a10);
            }
            ArrayList<File> arrayList = new ArrayList<File>();
            ArrayList<File> arrayList2 = new ArrayList<File>();
            for (File file2 : fileArray) {
                boolean bl3;
                block28: {
                    block25: {
                        block26: {
                            block27: {
                                try {
                                    boolean bl4;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!bl2) break block24;
                                                    bl3 = file2.isDirectory();
                                                    if (!bl2) break block25;
                                                }
                                                catch (A a11) {
                                                    throw z.a(a11);
                                                }
                                                if (!bl3) break block26;
                                            }
                                            catch (A a12) {
                                                throw z.a(a12);
                                            }
                                            bl4 = w2.h.accept(file, file2.getName());
                                            if (!bl2) break block27;
                                        }
                                        catch (A a13) {
                                            throw z.a(a13);
                                        }
                                        if (!bl4) continue;
                                    }
                                    catch (A a14) {
                                        throw z.a(a14);
                                    }
                                    bl4 = arrayList.add(file2);
                                }
                                catch (A a15) {
                                    throw z.a(a15);
                                }
                            }
                            try {
                                if (bl2) continue;
                                ky_2.K(new String[1]);
                            }
                            catch (A a16) {
                                throw z.a(a16);
                            }
                        }
                        bl3 = file2.isFile();
                    }
                    try {
                        try {
                            if (!bl2) break block28;
                            if (!bl3) continue;
                        }
                        catch (A a17) {
                            throw z.a(a17);
                        }
                        bl3 = w2.c.accept(file, file2.getName());
                    }
                    catch (A a18) {
                        throw z.a(a18);
                    }
                }
                try {
                    try {
                        if (!bl2 || !bl3) continue;
                    }
                    catch (A a19) {
                        throw z.a(a19);
                    }
                    bl3 = arrayList2.add(file2);
                }
                catch (A a20) {
                    throw z.a(a20);
                }
            }
            this.w = arrayList.iterator();
            this.Y = arrayList2.iterator();
        }
    }

    private static A a(A a10) {
        return a10;
    }
}

