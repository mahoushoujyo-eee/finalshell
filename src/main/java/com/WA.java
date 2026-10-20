/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GR;
import com.cb_1;
import com.u3;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class WA
implements MouseListener,
KeyListener {
    final u3 n;

    protected WA(u3 u32) {
        this.n = u32;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block7: {
            int n10;
            List list;
            block5: {
                boolean bl;
                String[] stringArray;
                block6: {
                    stringArray = cb_1.C();
                    bl = this.n.b();
                    if (stringArray == null) break block6;
                    if (!bl) break block7;
                    bl = GR.rN.J(keyEvent);
                }
                if (!bl) break block7;
                list = this.n.V();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    block10: {
                        block9: {
                            boolean bl2;
                            block8: {
                                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)iterator.next();
                                n10 = this.n.R(defaultMutableTreeNode) ? 1 : 0;
                                if (stringArray == null) break block5;
                                if (stringArray == null) break block8;
                                if (n10 == 0) break block9;
                                bl2 = this.n.N(defaultMutableTreeNode);
                            }
                            if (bl2) break block10;
                        }
                        iterator.remove();
                    }
                    if (stringArray != null) continue;
                }
                n10 = list.size();
            }
            if (n10 > 0) {
                this.n.i(list);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            Rectangle rectangle;
            DefaultMutableTreeNode defaultMutableTreeNode;
            u3 u32;
            DefaultMutableTreeNode defaultMutableTreeNode2;
            block7: {
                boolean bl;
                block6: {
                    boolean bl2;
                    String[] stringArray;
                    block4: {
                        stringArray = cb_1.C();
                        bl2 = this.n.b();
                        if (stringArray == null) break block4;
                        if (!bl2) break block5;
                        bl2 = FN.B(mouseEvent);
                    }
                    if (!bl2 || (defaultMutableTreeNode2 = this.n.q(mouseEvent.getPoint())) == null) break block5;
                    bl = this.n.R(defaultMutableTreeNode2);
                    if (stringArray == null) break block6;
                    if (!bl) break block5;
                    u32 = this.n;
                    defaultMutableTreeNode = defaultMutableTreeNode2;
                    if (stringArray == null) break block7;
                    bl = u32.N(defaultMutableTreeNode);
                }
                if (!bl) break block5;
                u32 = this.n;
                defaultMutableTreeNode = defaultMutableTreeNode2;
            }
            if ((rectangle = u32.O(defaultMutableTreeNode)).contains(mouseEvent.getPoint())) {
                this.n.E(defaultMutableTreeNode2);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}

