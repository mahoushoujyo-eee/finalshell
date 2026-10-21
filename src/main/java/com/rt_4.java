package com;

import com.L.m;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;

public class rt_4 extends AbstractCellEditor implements TableCellEditor, TreeCellEditor {
   protected JComponent G;
   protected xA_3 m;
   protected int B = Sm_2.G;
   private static final String a;

   public rt_4() {
   }

   public rt_4(JTextField var1) {
      this.i(var1);
   }

   public rt_4(JCheckBox var1) {
      this.i(var1);
   }

   public rt_4(JComboBox var1) {
      this.i(var1);
   }

   protected void i(JComponent var1) {
      int[] var10000 = com.WC.V();
      this.G = var1;
      int[] var2 = var10000;
      boolean var7 = var1 instanceof JTextField;
      if (var2 == null) {
         if (var7) {
            JTextField var3 = (JTextField)var1;
            this.m = new x3_2(this, var3);
            var3.addActionListener(this.m);
            if (var2 == null) {
               return;
            }
         }

         var7 = var1 instanceof JCheckBox;
      }

      label45: {
         if (var2 == null) {
            if (var7) {
               JCheckBox var5 = (JCheckBox)var1;
               this.m = new xI_3(this, var5);
               var5.addActionListener(this.m);
               var5.setRequestFocusEnabled(false);
               if (var2 == null) {
                  return;
               }
            }

            var8 = var1;
            if (var2 != null) {
               break label45;
            }

            var7 = var1 instanceof JComboBox;
         }

         if (!var7) {
            return;
         }

         var8 = var1;
      }

      JComboBox var6 = (JComboBox)var8;
      JComboBox var9 = var6;
      if (var2 == null) {
         if (var6.getUI() instanceof m) {
            m var4 = (m)var6.getUI();
            var4.n(false);
         }

         var6.putClientProperty(a, Boolean.TRUE);
         this.m = new xC_3(this, var6);
         var9 = var6;
      }

      var9.addActionListener(this.m);
   }

   public Component l() {
      return this.G;
   }

   public void N(int var1) {
      this.B = var1;
   }

   public int q() {
      return this.B;
   }

   @Override
   public Object getCellEditorValue() {
      return this.m.G();
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      return this.m.T(var1);
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return this.m.P(var1);
   }

   @Override
   public boolean stopCellEditing() {
      return this.m.p();
   }

   @Override
   public void cancelCellEditing() {
      this.m.a();
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      this.m.y(var2);
      return this.G;
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      this.m.y(var2);
      return this.G;
   }

   static void H(rt_4 var0) {
      var0.fireEditingStopped();
   }

   static void u(rt_4 var0) {
      var0.fireEditingCanceled();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "b4\u001ds\u001bK,G\u000f\\w\np\u000fJ\u001b\u0017]\u001cH\u0002m\u0013\u001bj\u0016V".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 23;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      } else {
         var6 = 23;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 63;
               break;
            case 1:
               var23 = 96;
               break;
            case 2:
               var23 = 101;
               break;
            case 3:
               var23 = 9;
               break;
            case 4:
               var23 = 110;
               break;
            case 5:
               var23 = 51;
               break;
            default:
               var23 = 121;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





