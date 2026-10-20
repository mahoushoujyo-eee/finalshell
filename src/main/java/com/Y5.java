/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.util.Arrays;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.TreePath;

public class Y5
implements TreeExpansionListener {
    @Override
    public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
        JTree jTree = (JTree)treeExpansionEvent.getSource();
        TreePath treePath = treeExpansionEvent.getPath();
        Object object = treePath.getLastPathComponent();
        if (jTree.getModel().getChildCount(object) == 1) {
            Object[] objectArray = treePath.getPath();
            Object[] objectArray2 = Arrays.copyOf(objectArray, objectArray.length + 1);
            objectArray2[objectArray.length] = jTree.getModel().getChild(object, 0);
            jTree.expandPath(new TreePath(objectArray2));
        }
    }

    @Override
    public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
    }

    public static Y5 H(JTree jTree) {
        Y5.C(jTree);
        Y5 y5 = new Y5();
        jTree.addTreeExpansionListener(y5);
        return y5;
    }

    public static void C(JTree jTree) {
        TreeExpansionListener[] treeExpansionListenerArray = jTree.getTreeExpansionListeners();
        int n10 = treeExpansionListenerArray.length;
        int n11 = 0;
        int[] nArray = WC.V();
        while (n11 < n10) {
            TreeExpansionListener treeExpansionListener = treeExpansionListenerArray[n11];
            if (nArray == null) {
                if (treeExpansionListener instanceof Y5) {
                    jTree.removeTreeExpansionListener(treeExpansionListener);
                }
                ++n11;
            }
            if (nArray == null) continue;
        }
    }

    public static boolean A(JTree jTree) {
        boolean bl;
        block4: {
            TreeExpansionListener[] treeExpansionListenerArray = jTree.getTreeExpansionListeners();
            int n10 = treeExpansionListenerArray.length;
            int n11 = 0;
            int[] nArray = WC.V();
            while (n11 < n10) {
                TreeExpansionListener treeExpansionListener = treeExpansionListenerArray[n11];
                if (nArray == null) {
                    bl = treeExpansionListener instanceof Y5;
                    if (nArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n11;
                }
                if (nArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

