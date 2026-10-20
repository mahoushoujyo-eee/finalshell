/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aB;
import com.cd_2;
import com.dm_2;
import com.pc_0;
import com.pw_1;
import java.util.Vector;

/*
 * Renamed from com.rm
 */
class rm_2
implements cd_2 {
    private cd_2 g;
    private Vector v = new Vector();
    private boolean e = false;

    rm_2(cd_2 cd_22) {
        this(cd_22, false);
    }

    rm_2(cd_2 cd_22, boolean bl) {
        this.g = cd_22;
        this.e = bl;
    }

    @Override
    public String r() {
        return this.g.r();
    }

    @Override
    public int p() {
        return this.g.p();
    }

    @Override
    public boolean D(byte[] byArray) {
        return this.g.D(byArray);
    }

    @Override
    public boolean i(byte[] byArray) {
        return this.g.i(byArray);
    }

    @Override
    public void u() {
        this.v.removeAllElements();
        this.g.u();
    }

    @Override
    public Vector e() {
        Vector<aB> vector;
        block5: {
            Vector<aB> vector2;
            boolean bl;
            Vector<aB> vector3;
            block4: {
                vector3 = new Vector<aB>();
                bl = dm_2.F();
                for (int i2 = 0; i2 < this.v.size(); ++i2) {
                    aB aB2 = (aB)this.v.elementAt(i2);
                    vector2 = vector3;
                    if (bl) {
                        vector2.add(aB2);
                        if (bl) continue;
                    }
                    break block4;
                }
                vector2 = this.g.e();
            }
            Vector<aB> vector4 = vector2;
            for (int i3 = 0; i3 < vector4.size(); ++i3) {
                vector = vector3;
                if (bl) {
                    vector.add((aB)vector4.elementAt(i3));
                    if (bl) continue;
                }
                break block5;
            }
            vector = vector3;
        }
        return vector;
    }

    /*
     * Unable to fully structure code
     */
    void N(aB var1_1) {
        block17: {
            block15: {
                block16: {
                    block19: {
                        block18: {
                            var2_2 = dm_2.F();
                            v0 = this;
                            if (!var2_2) break block15;
                            if (v0.e) ** GOTO lbl42
                            break block18;
                            catch (pc_0 v1) {
                                throw rm_2.a(v1);
                            }
                        }
                        v2 = var1_1.f();
                        if (!var2_2) break block16;
                        break block19;
                        catch (pc_0 v3) {
                            throw rm_2.a(v3);
                        }
                    }
                    try {
                        block20: {
                            if (v2) ** GOTO lbl42
                            break block20;
                            catch (pc_0 v4) {
                                throw rm_2.a(v4);
                            }
                        }
                        v2 = var1_1 instanceof pw_1;
                    }
                    catch (pc_0 v5) {
                        throw rm_2.a(v5);
                    }
                }
                try {
                    if (!var2_2) break block17;
                    if (v2) {
                    }
                    ** GOTO lbl42
                }
                catch (pc_0 v6) {
                    throw rm_2.a(v6);
                }
                try {
                    v2 = this.g.D(((pw_1)var1_1).J().T());
                    break block17;
                }
                catch (pc_0 var3_3) {
                    try {
                        if (var2_2) break block17;
lbl42:
                        // 4 sources

                        v0 = this;
                    }
                    catch (pc_0 v7) {
                        throw rm_2.a(v7);
                    }
                }
            }
            v0.v.addElement(var1_1);
        }
    }

    void N() {
        block4: {
            Vector vector;
            boolean bl;
            block3: {
                bl = dm_2.J();
                vector = this.v;
                if (bl) break block3;
                if (vector.size() <= 0) break block4;
                vector = this.v;
            }
            Object[] objectArray = vector.toArray();
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                aB aB2 = (aB)objectArray[i2];
                this.v.removeElement(aB2);
                this.N(aB2);
                if (!bl) continue;
            }
        }
    }

    private static pc_0 a(pc_0 pc_02) {
        return pc_02;
    }
}

