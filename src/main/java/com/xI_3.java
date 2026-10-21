package com;

import javax.swing.JCheckBox;

class xI_3 extends xA_3 {
   final JCheckBox N;
   final rt_4 V;
   private static final String a;

   xI_3(rt_4 var1, JCheckBox var2) {
      super(var1);
      this.V = var1;
      this.N = var2;
   }

   @Override
   public void y(Object var1) {
      boolean var3;
      label25: {
         int[] var10000 = com.WC.V();
         var3 = false;
         int[] var2 = var10000;
         boolean var4 = var1 instanceof Boolean;
         if (var2 == null) {
            if (var4) {
               var3 = (Boolean)var1;
               if (var2 == null) {
                  break label25;
               }
            }

            var4 = var1 instanceof String;
         }

         if (var2 == null) {
            if (!var4) {
               break label25;
            }

            var4 = var1.equals(a);
         }

         var3 = var4;
      }

      this.N.setSelected(var3);
   }

   @Override
   public Object G() {
      return this.N.isSelected();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "^VN\u001b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 5;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 5;
         var10006 = var0;
      } else {
         var6 = 5;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 5;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 47;
               break;
            case 1:
               var23 = 33;
               break;
            case 2:
               var23 = 62;
               break;
            case 3:
               var23 = 123;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 92;
               break;
            default:
               var23 = 124;
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





