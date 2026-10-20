/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

class UY
implements ActionListener {
    final l5_0 b;

    UY(l5_0 l5_02) {
        this.b = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block10: {
            boolean bl;
            block8: {
                Object object;
                block9: {
                    object = ((DefaultMutableTreeNode)this.b.B).getUserObject();
                    String string = aA.z();
                    bl = object.getClass().equals(ck_2.class);
                    if (string != null) break block8;
                    if (!bl) break block9;
                    try {
                        this.b.D.J((DefaultMutableTreeNode)((DefaultMutableTreeNode)this.b.B).getParent());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string == null) break block10;
                }
                bl = object.getClass().equals(tf_2.class);
            }
            if (bl) {
                try {
                    this.b.D.J(this.b.B);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

