/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.c8_0;
import com.kp_0;
import com.kp_2;
import com.on_0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aL {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(Collection collection) {
        String string = FV.D();
        Collection collection2 = collection;
        if (string == null) {
            if (collection2 == null) return true;
            collection2 = collection;
        }
        boolean bl = collection2.isEmpty();
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List b(List list, int n10) {
        List list2;
        String string = FV.D();
        List list3 = list;
        if (string == null) {
            if (list3.size() <= n10) {
                list2 = list;
                return list2;
            }
            list3 = list;
        }
        list2 = aL.y(list3, 0, n10);
        return list2;
    }

    public static ArrayList y(List list, int n10, int n11) {
        return new ArrayList(list.subList(n10, n11));
    }

    public static ArrayList q(List list, int n10, int n11) {
        ArrayList<Cloneable> arrayList;
        block2: {
            ArrayList<Cloneable> arrayList2 = new ArrayList<Cloneable>(n11 - n10);
            String string = FV.D();
            for (int i2 = n10; i2 < n11; ++i2) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(kp_0.E((Cloneable)list.get(i2)));
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static ArrayList F(Object[] objectArray) {
        ArrayList arrayList = new ArrayList(objectArray.length);
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static ArrayList r(Iterator iterator) {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = new ArrayList();
            String string = FV.D();
            while (iterator.hasNext()) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(iterator.next());
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static boolean Y(Collection collection, Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2 = false;
            Object[] objectArray2 = objectArray;
            int n10 = objectArray2.length;
            int n11 = 0;
            String string = FV.D();
            while (n11 < n10) {
                Object object = objectArray2[n11];
                if (string == null) {
                    bl = collection.contains(object);
                    if (string != null) break block4;
                    if (!bl) {
                        bl2 |= collection.add(object);
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public static boolean l(Collection collection, Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2 = false;
            Object[] objectArray2 = objectArray;
            int n10 = objectArray2.length;
            int n11 = 0;
            String string = FV.D();
            while (n11 < n10) {
                Object object = objectArray2[n11];
                if (string == null) {
                    bl = collection.contains(object);
                    if (string != null) break block4;
                    if (!bl && object != null) {
                        bl2 |= collection.add(object);
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public static boolean D(Collection collection, Collection collection2) {
        boolean bl;
        block3: {
            boolean bl2 = false;
            String string = FV.D();
            for (Object e2 : collection2) {
                bl = collection.contains(e2);
                if (string == null) {
                    if (string == null && !bl) {
                        boolean bl3 = bl2 = bl2 | collection.add(e2);
                    }
                    if (string == null) continue;
                }
                break block3;
            }
            bl = bl2;
        }
        return bl;
    }

    public static boolean W(Collection collection, Collection collection2) {
        boolean bl;
        block5: {
            boolean bl2 = false;
            Iterator iterator = collection2.iterator();
            String string = FV.D();
            while (iterator.hasNext()) {
                block7: {
                    Collection collection3;
                    Object e2;
                    block6: {
                        e2 = iterator.next();
                        collection3 = collection;
                        if (string != null) break block6;
                        bl = collection3.contains(e2);
                        if (string != null) break block5;
                        if (bl) break block7;
                        collection3 = e2;
                    }
                    if (collection3 != null) {
                        bl2 |= collection.add(e2);
                    }
                }
                if (string == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public static boolean T(Collection collection, Object[] objectArray) {
        boolean bl;
        block2: {
            boolean bl2 = false;
            Object[] objectArray2 = objectArray;
            String string = FV.D();
            for (Object object : objectArray2) {
                bl = bl2 | collection.remove(object);
                if (string == null) {
                    bl2 = bl;
                    if (string == null) continue;
                }
                break block2;
            }
            bl = bl2;
        }
        return bl;
    }

    public static ArrayList J(Collection collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    public static ArrayList y(Collection collection) {
        ArrayList<Cloneable> arrayList;
        block3: {
            String string = FV.D();
            if (collection == null) {
                return null;
            }
            ArrayList<Cloneable> arrayList2 = new ArrayList<Cloneable>(collection.size());
            for (Cloneable cloneable : collection) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(kp_0.E(cloneable));
                    if (string == null) continue;
                }
                break block3;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static ArrayList e(Object[] objectArray) {
        ArrayList arrayList = new ArrayList(objectArray.length);
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static ArrayList U(Collection collection) {
        String string = FV.D();
        if (collection == null) {
            return null;
        }
        ArrayList<Cloneable> arrayList = new ArrayList<Cloneable>(collection.size());
        for (Object e2 : collection) {
            block7: {
                boolean bl;
                block8: {
                    block5: {
                        block6: {
                            bl = e2 instanceof Collection;
                            if (string != null) break block5;
                            if (!bl) break block6;
                            arrayList.add(aL.U((Collection)e2));
                            if (string == null) break block7;
                        }
                        bl = e2 instanceof Cloneable;
                    }
                    if (string != null) break block7;
                    if (!bl) break block8;
                    arrayList.add(kp_0.E((Cloneable)e2));
                    if (string == null) break block7;
                }
                bl = arrayList.add((Cloneable)e2);
            }
            if (string == null) continue;
        }
        return arrayList;
    }

    public static List f(List list) {
        List list2;
        block4: {
            String string = FV.D();
            List list3 = list;
            if (string == null) {
                if (list3 == null) {
                    return null;
                }
                list3 = list;
            }
            for (int i2 = (v5903598).size() - 1; i2 >= 0; --i2) {
                list2 = list;
                if (string == null) {
                    Object e2 = list2.get(i2);
                    if (string != null || e2 != null) continue;
                    e2 = list.remove(i2);
                    if (string == null) continue;
                }
                break block4;
            }
            list2 = list;
        }
        return list2;
    }

    /*
     * Exception decompiling
     */
    public static boolean n(List var0, List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static ArrayList t(List list, c8_0 c8_02) {
        ArrayList<String> arrayList;
        block2: {
            ArrayList<String> arrayList2 = new ArrayList<String>(list.size());
            String string = FV.D();
            for (Object e2 : list) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(c8_02.C(e2));
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public static int[] J(List var0) {
        block3: {
            var2_1 = new int[var0.size()];
            var1_3 = FV.D();
            for (var3_2 = 0; var3_2 < var0.size(); ++var3_2) {
                var4_4 = (Integer)var0.get(var3_2);
                v0 = var2_1;
                if (var1_3 != null) break block3;
                v1 = var4_4;
                if (var1_3 != null) ** GOTO lbl11
                if (v1 != null) {
                    v1 = var4_4;
lbl11:
                    // 2 sources

                    v2 = v1;
                } else {
                    v2 = 0;
                }
                v0[var3_2] = v2;
                if (var1_3 == null) continue;
            }
            v0 = var2_1;
        }
        return v0;
    }

    public static ArrayList o(Object[] objectArray) {
        ArrayList arrayList = new ArrayList(objectArray.length);
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static ArrayList y(Deque deque) {
        return new ArrayList(deque);
    }

    public static ArrayList E(Collection collection, on_0 on_02) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        String string = FV.D();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            boolean bl = on_02.n(e2);
            if (string == null && bl) {
                bl = arrayList.add(e2);
            }
            if (string == null) continue;
        }
        return arrayList;
    }

    public static ArrayList t(Map map) {
        return new ArrayList(map.keySet());
    }

    public static ArrayList f(Map map) {
        return new ArrayList(map.values());
    }

    public static ArrayList n(Map map) {
        ArrayList arrayList;
        block4: {
            ArrayList arrayList2 = new ArrayList(0);
            String string = FV.D();
            Iterator iterator = map.entrySet().iterator();
            block0: while (true) {
                boolean bl = iterator.hasNext();
                block1: while (bl) {
                    Map.Entry entry = iterator.next();
                    List list = (List)entry.getValue();
                    arrayList = arrayList2;
                    if (string != null) break block4;
                    arrayList.ensureCapacity(arrayList2.size() + list.size());
                    for (Object e2 : list) {
                        bl = arrayList2.contains(e2);
                        if (string != null) continue block1;
                        if (string == null && !bl) {
                            arrayList2.add(e2);
                        }
                        if (string == null) continue;
                    }
                    if (string == null) continue block0;
                }
                break;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List p(int n10, kp_2 kp_22) {
        ArrayList<Object> arrayList;
        block2: {
            ArrayList<Object> arrayList2 = new ArrayList<Object>(n10);
            String string = FV.D();
            for (int i2 = 0; i2 < n10; ++i2) {
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(kp_22.U(i2));
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }
}

