/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from aq
 */
class aq_0
implements DropTargetListener {
    DropTarget F;
    JTree Z;

    public aq_0(JTree jTree) {
        this.Z = jTree;
        this.F = new DropTarget((JTree)this.Z, this);
    }

    private TreeNode V(DropTargetDragEvent dropTargetDragEvent) {
        Point point = dropTargetDragEvent.getLocation();
        DropTargetContext dropTargetContext = dropTargetDragEvent.getDropTargetContext();
        JTree jTree = (JTree)dropTargetContext.getComponent();
        TreePath treePath = jTree.getClosestPathForLocation(point.x, point.y);
        return (TreeNode)treePath.getLastPathComponent();
    }

    @Override
    public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
        block6: {
            block5: {
                int[] nArray;
                block4: {
                    TreeNode treeNode;
                    try {
                        treeNode = (TreeNode)this.V(dropTargetDragEvent);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    TreeNode treeNode2 = treeNode;
                    nArray = a3.I();
                    if (nArray == null) break block4;
                    if (!treeNode2.isLeaf()) break block5;
                    dropTargetDragEvent.rejectDrag();
                }
                if (nArray != null) break block6;
            }
            dropTargetDragEvent.acceptDrag(dropTargetDragEvent.getDropAction());
        }
    }

    @Override
    public void dragOver(DropTargetDragEvent dropTargetDragEvent) {
        block6: {
            block5: {
                int[] nArray;
                block4: {
                    TreeNode treeNode;
                    try {
                        treeNode = (TreeNode)this.V(dropTargetDragEvent);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    TreeNode treeNode2 = treeNode;
                    nArray = a3.I();
                    if (nArray == null) break block4;
                    if (!treeNode2.isLeaf()) break block5;
                    dropTargetDragEvent.rejectDrag();
                }
                if (nArray != null) break block6;
            }
            dropTargetDragEvent.acceptDrag(dropTargetDragEvent.getDropAction());
        }
    }

    @Override
    public void dragExit(DropTargetEvent dropTargetEvent) {
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
    }

    /*
     * Loose catch block
     */
    @Override
    public void drop(DropTargetDropEvent dropTargetDropEvent) {
        block14: {
            DefaultMutableTreeNode defaultMutableTreeNode;
            JTree jTree;
            int[] nArray;
            block13: {
                block16: {
                    Point point = dropTargetDropEvent.getLocation();
                    DropTargetContext dropTargetContext = dropTargetDropEvent.getDropTargetContext();
                    nArray = a3.I();
                    jTree = (JTree)dropTargetContext.getComponent();
                    TreePath treePath = jTree.getClosestPathForLocation(point.x, point.y);
                    defaultMutableTreeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
                    if (nArray == null) break block16;
                    try {
                        block17: {
                            if (!defaultMutableTreeNode.isLeaf()) break block13;
                            break block17;
                            catch (Exception exception) {
                                throw aq_0.a(exception);
                            }
                        }
                        dropTargetDropEvent.rejectDrop();
                    }
                    catch (Exception exception) {
                        throw aq_0.a(exception);
                    }
                }
                return;
            }
            try {
                Transferable transferable = dropTargetDropEvent.getTransferable();
                DataFlavor[] dataFlavorArray = transferable.getTransferDataFlavors();
                for (int i2 = 0; i2 < dataFlavorArray.length; ++i2) {
                    DataFlavor dataFlavor;
                    Transferable transferable2;
                    block15: {
                        block18: {
                            if (nArray == null) break block14;
                            transferable2 = transferable;
                            dataFlavor = dataFlavorArray[i2];
                            if (nArray == null) break block15;
                            break block18;
                            catch (Exception exception) {
                                throw aq_0.a(exception);
                            }
                        }
                        try {
                            block19: {
                                if (!transferable2.isDataFlavorSupported(dataFlavor)) continue;
                                break block19;
                                catch (Exception exception) {
                                    throw aq_0.a(exception);
                                }
                            }
                            dropTargetDropEvent.acceptDrop(dropTargetDropEvent.getDropAction());
                            transferable2 = transferable;
                            dataFlavor = dataFlavorArray[i2];
                        }
                        catch (Exception exception) {
                            throw aq_0.a(exception);
                        }
                    }
                    TreePath treePath = (TreePath)transferable2.getTransferData(dataFlavor);
                    DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)treePath.getLastPathComponent();
                    DefaultTreeModel defaultTreeModel = (DefaultTreeModel)jTree.getModel();
                    defaultTreeModel.insertNodeInto(defaultMutableTreeNode2, defaultMutableTreeNode, 0);
                    dropTargetDropEvent.dropComplete(true);
                    return;
                }
                dropTargetDropEvent.rejectDrop();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                dropTargetDropEvent.rejectDrop();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

