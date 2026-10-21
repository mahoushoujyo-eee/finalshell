package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditTunnelDialog;
import com.finalshell.ui.panel.TunnelList;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QK implements ItemListener {
   final EditTunnelDialog R;
   public static String a;

   QK(EditTunnelDialog var1) {
      this.R = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      boolean var32;
      label15: {
         String var10000 = TunnelList.V();
         var32 = false;
         String var2 = var10000;
         Object var4 = 253158002186314122L;
         Ref.g(253158002186314122L, var4);
         Object var6 = 319966052179776705L;
         boolean var10002 = ((JComboBox)Ref.g(319966052179776705L, var6)).getSelectedItem().equals(a);
         if (var2 != null) {
            if (var10002) {
               var32 = false;
               if (var2 != null) {
                  break label15;
               }
            }

            var10002 = true;
         }

         var32 = var10002;
      }

      Object var8 = 253158002186314122L;
      Ref.g(253158002186314122L, var8);
      Object var10 = 329278972422819942L;
      ((JLabel)Ref.g(329278972422819942L, var10)).setEnabled(var32);
      Object var12 = 253158002186314122L;
      Ref.g(253158002186314122L, var12);
      Object var14 = 492841651621062230L;
      ((JLabel)Ref.g(492841651621062230L, var14)).setEnabled(var32);
      Object var16 = 253158002186314122L;
      Ref.g(253158002186314122L, var16);
      Object var18 = 252123593957137435L;
      ((JTextField)Ref.g(252123593957137435L, var18)).setEnabled(var32);
      Object var20 = 253158002186314122L;
      Ref.g(253158002186314122L, var20);
      Object var22 = 332149350821937177L;
      ((JTextField)Ref.g(332149350821937177L, var22)).setEnabled(var32);
      Object var24 = 253158002186314122L;
      Ref.g(253158002186314122L, var24);
      Object var26 = 252123593957137435L;
      ((JTextField)Ref.g(252123593957137435L, var26)).setEditable(var32);
      Object var28 = 253158002186314122L;
      Ref.g(253158002186314122L, var28);
      Object var30 = 332149350821937177L;
      ((JTextField)Ref.g(332149350821937177L, var30)).setEditable(var32);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ";]&\u001bm\u0012".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 77;
               break;
            case 1:
               var23 = 55;
               break;
            case 2:
               var23 = 64;
               break;
            case 3:
               var23 = 117;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 2;
               break;
            default:
               var23 = 32;
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





