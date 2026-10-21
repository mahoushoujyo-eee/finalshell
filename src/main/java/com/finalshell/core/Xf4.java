package com.finalshell.core;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class Xf4 implements GenericArrayType {
   public final Type O;
   public static String a;

   public Xf4(Type var1) {
   super();
      int var10000 = Ph2.w();
      int var2 = var10000;
      if (var2 != 0) {
         if (!k && var1 == null) {
            throw new AssertionError();
         }

         this.O = var1;
      }
   }

   @Override
   public Type getGenericComponentType() {
      return this.O;
   }

   @Override
   public String toString() {
      StringBuilder var3;
      label17: {
         Type var2;
         label16: {
            int var10000 = Ph2.u();
            var2 = this.getGenericComponentType();
            int var1 = var10000;
            var3 = new StringBuilder();
            if (var1 == 0) {
               if (!(var2 instanceof java.lang.Class)) {
                  break label16;
               }

               var3.append(((java.lang.Class)var2).getName());
            }

            if (var1 == 0) {
               break label17;
            }
         }

         var3.append(var2.toString());
      }

      var3.append(a);
      return var3.toString();
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = Ph2.w();
      boolean var10000 = var1 instanceof GenericArrayType;
      if (var2 != 0) {
         if (var10000) {
            GenericArrayType var3 = (GenericArrayType)var1;
            return this.O.equals(var3.getGenericComponentType());
         }

         var10000 = false;
      }

      return var10000;
   }

   @Override
   public int hashCode() {
      return this.O.hashCode();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "J%".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 96;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 96;
         var10006 = var0;
      } else {
         var6 = 96;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            k = !Xf4.class.desiredAssertionStatus();
            return;
         }

         var10005 = var10003;
         var10 = 96;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 113;
               break;
            case 1:
               var23 = 24;
               break;
            case 2:
               var23 = 120;
               break;
            case 3:
               var23 = 48;
               break;
            case 4:
               var23 = 55;
               break;
            case 5:
               var23 = 70;
               break;
            default:
               var23 = 96;
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
               k = !Xf4.class.desiredAssertionStatus();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





