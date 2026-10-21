package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;

public class Ol4 extends AbstractCellEditor implements TreeCellEditor {
   public Dq4_2 u;
   public ChangeEvent E;
   public JTree k;

   public Ol4(JTree var1) {
      Dq4_2 var10001 = new Dq4_2();
      long var3 = 477893946481762014L;
      Dq4_2 var2 = var10001;
      Ref.s(477893946481762014L, var2, var3);
      long var5 = 490205050813429254L;
      Object var4 = null;
      Ref.s(490205050813429254L, var4, var5);
      long var7 = 547916730122527627L;
      Ref.s(547916730122527627L, var1, var7);
   }

   @Override
   public Object getCellEditorValue() {
      Object var3 = 477893946481762014L;
      Ref.g(477893946481762014L, var3);
      JCheckBox var10002 = (JCheckBox)(Registry.emptyArgs());
      long var6 = 281437538717702050L;
      Object var5 = var10002;
      var10002 = Ref.h(281437538717702050L, var5, var6);

      try {
         var10002 = (JCheckBox)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      JCheckBox var1 = var10002;
      return new Fp2(var1.getText(), var1.isSelected());
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      boolean var14;
      String var10000 = com.finalshell.ui.panel.AA.z();
      boolean var3 = false;
      String var2 = var10000;
      boolean var11 = var1 instanceof MouseEvent;
      if (var2 == null) {
         label50:
         if (var11) {
            MouseEvent var4 = (MouseEvent)var1;
            Object var9 = 547916730122527627L;
            TreePath var5 = ((JTree)Ref.g(547916730122527627L, var9)).getPathForLocation(var4.getX(), var4.getY());
            Object var10001 = var5;
            if (var2 == null) {
               if (var5 == null) {
                  break label50;
               }

               var10001 = var5.getLastPathComponent();
            }

            Object var6 = var10001;
            var10001 = var6;
            if (var2 == null) {
               if (var6 == null) {
                  break label50;
               }

               var10001 = var6;
            }

            boolean var13 = var10001 instanceof DefaultMutableTreeNode;
            if (var2 != null) {
               return (boolean)this;
            }

            if (var13) {
               label36: {
                  label55: {
                     DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6;
                     Object var8 = var7.getUserObject();
                     var14 = var7.isLeaf();
                     if (var2 == null) {
                        if (!var14) {
                           break label55;
                        }

                        var14 = var8 instanceof Fp2;
                     }

                     if (var2 != null) {
                        break label36;
                     }

                     if (var14) {
                        var14 = true;
                        break label36;
                     }
                  }

                  var14 = false;
               }

               var3 = var14;
            }
         }

         var11 = var3;
      }

      return var11;
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Object var10 = 477893946481762014L;
      Ref.g(477893946481762014L, var10);
      Component var10002 = (Component)(Registry.packArgs(var1, var2, true, var4, var5, var6, true));
      long var13 = 193657442809841628L;
      Object var12 = var10002;
      var10002 = Ref.h(193657442809841628L, var12, var13);

      try {
         var10002 = (Component)var10002;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Component var8 = var10002;
      String var17 = com.finalshell.ui.panel.AA.z();
      com.finalshell.ui.listener.W7 var9 = new com.finalshell.ui.listener.W7(this);
      String var7 = var17;
      Component var18 = var8;
      if (var7 == null) {
         if (var8 instanceof JCheckBox) {
            ((JCheckBox)var8).addItemListener(var9);
         }

         var18 = var8;
      }

      return var18;
   }

   public static void i(Ol4 var0) {
      var0.fireEditingStopped();
   }
}





