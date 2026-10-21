package com.finalshell.ui.panel;

import com.finalshell.core.C_Q;
import com.finalshell.core.ER3;
import com.finalshell.core.G0;
import com.finalshell.core.Ii4;
import com.finalshell.core.K3_2;
import com.finalshell.core.WC_2;
import com.finalshell.core.Ws4;
import com.finalshell.ui.listener.Iu4;
import com.finalshell.ui.listener.Ol4;
import com.finalshell.ui.listener.XR;
import java.util.List;
import javax.swing.ListCellRenderer;

public class CC extends CI {
   protected boolean h = G0.n;
   public static String a;
   public static long b;

   public CC() {
      this(new ER3());
   }

   public CC(ER3 var1) {
      this.setModel(var1);
      this.setCellRenderer(new Ii4());
      this.addMouseListener(new Ol4(this));
      this.addKeyListener(new XR(this));
   }

   public Ii4 A$ii_4() {
      String var10000 = Co2.U$String();
      ListCellRenderer var2 = this.getCellRenderer();
      String var1 = var10000;
      ListCellRenderer var3 = var2;
      if (var1 != null) {
         if (!(var2 instanceof Ii4)) {
            return null;
         }

         var3 = var2;
      }

      return (Ii4)var3;
   }

   public ER3 A$eR_3() {
      return (ER3)this.getModel();
   }

   @Override
   protected K3_2 O() {
      return new Ws4();
   }

   public boolean q(int var1) {
      return this.A$eR_3().o(var1);
   }

   public void x(int var1) {
      this.A$eR_3().Y(var1);
      this.Y(var1);
   }

   public void h(int var1, boolean var2) {
      String var3 = Co2.U$String();
      CC var10000 = this;
      if (var3 != null) {
         if (!this.A$eR_3().Z(var1, var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.Y(var1);
   }

   public List R() {
      return this.A$eR_3().a();
   }

   protected void Y(int var1) {
      label16: {
         String var2 = Co2.U$String();
         if (var2 != null) {
            if (!C_Q.v) {
               break label16;
            }

            WC_2.s(a, b, new Iu4(this, var1));
         }

         if (var2 != null) {
            return;
         }
      }

      this.repaint(this.getCellBounds(var1, var1));
   }

   public boolean w() {
      return this.h;
   }

   public void q(boolean var1) {
      this.h = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "S\u001c]\u000f\u001e\u0002`o;P4:\u000eppW^\"\u001f\nbp\u0016M".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 88;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 88;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 33;
               break;
            case 2:
               var21 = 103;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 63;
               break;
            default:
               var21 = 91;
         }
      } else {
         var13 = 88;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 434241459707055769L;
            long var12 = 434241459707055793L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 88;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 33;
               break;
            case 2:
               var21 = 103;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 63;
               break;
            default:
               var21 = 91;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 92;
                  break;
               case 1:
                  var21 = 33;
                  break;
               case 2:
                  var21 = 103;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 63;
                  break;
               default:
                  var21 = 91;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 434241459707055769L;
               long var11 = 434241459707055793L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 92;
                  break;
               case 1:
                  var21 = 33;
                  break;
               case 2:
                  var21 = 103;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 63;
                  break;
               default:
                  var21 = 91;
            }
         }
      }
   }
}





