package com.finalshell.ui.panel;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import javax.swing.JComponent;
import javax.swing.tree.DefaultMutableTreeNode;
import net.miginfocom.swing.MigLayout;

public abstract class Z7 extends JComponent {
   String h;
   DefaultMutableTreeNode c;
   public static int K;
   public static String e;

   public Z7() {
      this.setLayout(new MigLayout(e));
      this.setName(this.getClass().getName());
   }

   public abstract void A(Lv4_2 var1);

   public abstract Vg2 c();

   public abstract void F(Lv4_2 var1);

   public String l() {
      Object var1 = 570339079906001280L;
      return (String)Ref.g(570339079906001280L, var1);
   }

   public void A(String var1) {
      long var3 = 570339079906001280L;
      Ref.s(570339079906001280L, var1, var3);
   }

   public DefaultMutableTreeNode B() {
      Object var1 = 628070978214068535L;
      return (DefaultMutableTreeNode)Ref.g(628070978214068535L, var1);
   }

   public void Q(DefaultMutableTreeNode var1) {
      long var3 = 628070978214068535L;
      Ref.s(628070978214068535L, var1, var3);
   }

   public static void z(int var0) {
      K = var0;
   }

   public static int M() {
      return K;
   }

   public static int m() {
      int var0 = M();
      return var0 == 0 ? 125 : 0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (m() == 0) {
         z(106);
      }

      char[] var10003 = "'Gy\u0005+\u0011w\u007f\u0019*QoBf~\t;P".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 122;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      } else {
         var6 = 122;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            e = var9;
            return;
         }

         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 52;
               break;
            case 1:
               var23 = 83;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 26;
               break;
            case 4:
               var23 = 37;
               break;
            case 5:
               var23 = 24;
               break;
            default:
               var23 = 45;
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
               e = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





