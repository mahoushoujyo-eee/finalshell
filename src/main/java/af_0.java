/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from af
 */
class af_0
implements TreeSelectionListener {
    final aJ x;

    af_0(aJ aJ2) {
        this.x = aJ2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void valueChanged(TreeSelectionEvent var1_1) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        v0 = aA.z();
                        this.x.S = System.currentTimeMillis();
                        var3_2 = ((aJ)this.x).getSelectionPath();
                        var2_3 = v0;
                        var4_4 = null;
                        v1 = var3_2;
                        if (var2_3 != null) ** GOTO lbl13
                        if (v1 != null) {
                            v1 = var3_2.getLastPathComponent();
lbl13:
                            // 2 sources

                            var4_4 = (DefaultMutableTreeNode)v1;
                        } else {
                            var4_4 = (DefaultMutableTreeNode)this.x.p;
                        }
                        v2 = var4_4.getUserObject().getClass().equals(tf_2.class);
                        if (var2_3 != null) break block7;
                        if (!v2) break block8;
                        var5_5 /* !! */  = (tf_2)var4_4.getUserObject();
                        try {
                            v3 = var5_5 /* !! */.k();
                        }
                        catch (InvocationTargetException v4) {
                            throw v4.getTargetException();
                        }
                        this.x.W = v3;
                        if (var2_3 == null) break block9;
                    }
                    v5 = var4_4.getUserObject().getClass();
                    if (var2_3 != null) break block10;
                    v2 = v5.equals(ck_2.class);
                }
                if (!v2) break block9;
                v5 = var4_4.getUserObject();
            }
            var5_5 /* !! */  = (ck_2)v5;
            try {
                v6 = (String)var5_5 /* !! */.d();
            }
            catch (InvocationTargetException v7) {
                throw v7.getTargetException();
            }
            this.x.W = new File(v6).getParent();
        }
    }
}

