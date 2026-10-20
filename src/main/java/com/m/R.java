/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.K;
import com.m.s;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreePath;

public class R
implements MouseMotionListener {
    private JTree a;

    public R(JTree jTree) {
        this.a = jTree;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        block5: {
            block12: {
                String string;
                block11: {
                    block7: {
                        block10: {
                            block9: {
                                block8: {
                                    int n10;
                                    block6: {
                                        JTree jTree;
                                        block4: {
                                            string = s.d();
                                            jTree = this.a;
                                            if (string == null) break block4;
                                            if (!jTree.isEnabled()) break block5;
                                            jTree = this.a;
                                        }
                                        TreeUI treeUI = jTree.getUI();
                                        int n11 = treeUI instanceof K;
                                        if (string == null) break block6;
                                        if (n11 == 0) break block7;
                                        n11 = n10 = ((K)treeUI).Y(mouseEvent.getPoint());
                                    }
                                    if (string == null) break block8;
                                    if (n10 == -1) break block9;
                                    this.a.setSelectionRow(n10);
                                }
                                if (string != null) break block10;
                            }
                            this.a.clearSelection();
                        }
                        if (string != null) break block5;
                    }
                    TreePath treePath = this.a.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                    if (string == null) break block11;
                    if (treePath == null) break block12;
                    this.a.setSelectionPath(treePath);
                }
                if (string != null) break block5;
            }
            this.a.clearSelection();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    public static R E(JTree jTree) {
        R.s(jTree);
        R r2 = new R(jTree);
        jTree.addMouseMotionListener(r2);
        return r2;
    }

    public static void s(JTree jTree) {
        MouseMotionListener[] mouseMotionListenerArray = jTree.getMouseMotionListeners();
        String string = s.d();
        int n10 = mouseMotionListenerArray.length;
        int n11 = 0;
        while (n11 < n10) {
            MouseMotionListener mouseMotionListener = mouseMotionListenerArray[n11];
            if (string != null) {
                if (mouseMotionListener instanceof R) {
                    jTree.removeMouseMotionListener(mouseMotionListener);
                }
                ++n11;
            }
            if (string != null) continue;
        }
    }

    public static boolean t(JTree jTree) {
        boolean bl;
        block4: {
            MouseMotionListener[] mouseMotionListenerArray = jTree.getMouseMotionListeners();
            String string = s.d();
            int n10 = mouseMotionListenerArray.length;
            int n11 = 0;
            while (n11 < n10) {
                MouseMotionListener mouseMotionListener = mouseMotionListenerArray[n11];
                if (string != null) {
                    bl = mouseMotionListener instanceof R;
                    if (string == null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n11;
                }
                if (string != null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

