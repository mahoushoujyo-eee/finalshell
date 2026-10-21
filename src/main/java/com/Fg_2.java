package com;

import javax.swing.event.AncestorEvent;

class Fg_2 extends com.FY {
   final com.k0_2 f;
   private static final String a;

   Fg_2(com.k0_2 var1) {
      this.f = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      com.k0_2 var10000;
      label35: {
         String var2;
         label36: {
            var2 = com.kz_4.M();
            var10000 = this.f;
            if (var2 != null) {
               if (this.f.v != null) {
                  var3 = this.f.v.i();
                  if (var2 == null) {
                     break label36;
                  }

                  if (var3) {
                     this.f.v.Y();
                  }
               }

               var10000 = this.f;
            }

            if (var2 == null) {
               break label35;
            }

            var3 = var10000.j;
         }

         if (var3) {
            this.f.v = new com.WC(a, GO.FK, new com.CU(this));
            this.f.v.u();
            if (var2 != null) {
               return;
            }
         }

         this.f.X = 1.0F;
         var10000 = this.f;
      }

      var10000.repaint();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001a@\u007f\u0017@~\u001c\u001dI|%L<\u001f,Ax\u0018GF\u0010 @o".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 53;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 53;
         var10006 = var0;
      } else {
         var6 = 53;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 53;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 120;
               break;
            case 1:
               var23 = 16;
               break;
            case 2:
               var23 = 40;
               break;
            case 3:
               var23 = 100;
               break;
            case 4:
               var23 = 28;
               break;
            case 5:
               var23 = 39;
               break;
            default:
               var23 = 76;
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





