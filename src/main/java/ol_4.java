import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;

class ol_4 extends AbstractCellEditor implements TreeCellEditor {
   dq_4 u;
   ChangeEvent E;
   JTree k;

   public ol_4(JTree var1) {
      com.c.c(477893946481762014L).set(this, new dq_4());
      com.c.c(490205050813429254L).set(this, null);
      com.c.c(547916730122527627L).set(this, var1);
   }

   @Override
   public Object getCellEditorValue() {
      Method var10000 = (Method)com.c.c(477893946481762014L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(281437538717702050L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var5 = (JCheckBox)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      JCheckBox var1 = var5;
      return new Fp_2(var1.getText(), var1.isSelected());
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      String var10000 = aA.z();
      boolean var3 = false;
      String var2 = var10000;
      boolean var9 = var1 instanceof MouseEvent;
      if (var2 == null) {
         label50:
         if (var9) {
            MouseEvent var4 = (MouseEvent)var1;
            TreePath var5 = ((JTree)com.c.c(547916730122527627L).get(this)).getPathForLocation(var4.getX(), var4.getY());
            var10000 = var5;
            if (var2 == null) {
               if (var5 == null) {
                  break label50;
               }

               var10000 = (String)var5.getLastPathComponent();
            }

            Object var6 = var10000;
            var10000 = (String)var6;
            if (var2 == null) {
               if (var6 == null) {
                  break label50;
               }

               var10000 = (String)var6;
            }

            boolean var13 = var10000 instanceof DefaultMutableTreeNode;
            if (var2 != null) {
               return var13;
            }

            if (var13) {
               label36: {
                  label55: {
                     DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6;
                     Object var8 = var7.getUserObject();
                     var12 = var7.isLeaf();
                     if (var2 == null) {
                        if (!var12) {
                           break label55;
                        }

                        var12 = var8 instanceof Fp_2;
                     }

                     if (var2 != null) {
                        break label36;
                     }

                     if (var12) {
                        var12 = true;
                        break label36;
                     }
                  }

                  var12 = false;
               }

               var3 = var12;
            }
         }

         var9 = var3;
      }

      return var9;
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Method var10000 = (Method)com.c.c(477893946481762014L).get(this);
      Object[] var10001 = com.c.a(var1, var2, true, var4, var5, var6, true);
      Method var10003 = com.c.d(193657442809841628L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (Component)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Component var8 = var12;
      String var13 = aA.z();
      W7 var9 = new W7(this);
      String var7 = var13;
      Component var14 = var8;
      if (var7 == null) {
         if (var8 instanceof JCheckBox) {
            ((JCheckBox)var8).addItemListener(var9);
         }

         var14 = var8;
      }

      return var14;
   }

   static void i(ol_4 var0) {
      var0.fireEditingStopped();
   }
}





