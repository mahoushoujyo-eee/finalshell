package com;

import java.util.List;
import javax.swing.ListCellRenderer;

public class CC extends com.CI {
   protected boolean h = G0.n;
   private static final String a;
   private static final long b;

   public CC() {
      this(new eR_3());
   }

   public CC(eR_3 var1) {
      this.setModel(var1);
      this.setCellRenderer(new ii_4());
      this.addMouseListener(new com.ol_4(this));
      this.addKeyListener(new XR(this));
   }

   public ii_4 A() {
      String var10000 = com.Co_2.U();
      ListCellRenderer var2 = this.getCellRenderer();
      String var1 = var10000;
      ListCellRenderer var3 = var2;
      if (var1 != null) {
         if (!(var2 instanceof ii_4)) {
            return null;
         }

         var3 = var2;
      }

      return (ii_4)var3;
   }

   public eR_3 A$eR_3() {
      return (eR_3)this.getModel();
   }

   @Override
   protected com.K3 O() {
      return new ws_4();
   }

   public boolean q(int var1) {
      return this.A().o(var1);
   }

   public void x(int var1) {
      this.A().Y(var1);
      this.Y(var1);
   }

   public void h(int var1, boolean var2) {
      String var3 = com.Co_2.U();
      com.CC var10000 = this;
      if (var3 != null) {
         if (!this.A().Z(var1, var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.Y(var1);
   }

   public List R() {
      return this.A().a();
   }

   protected void Y(int var1) {
      label16: {
         String var2 = com.Co_2.U();
         if (var2 != null) {
            if (!_Q.v) {
               break label16;
            }

            com.WC.s(a, b, new iu_4(this, var1));
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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





