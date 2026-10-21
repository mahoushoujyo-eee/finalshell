package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public class TH_2 implements X4 {
   public static TH_2 S;
   public static long a;

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      Ky4[] var4 = ZS.p();
      boolean var10000 = var2 instanceof GenericArrayType;
      if (var4 == null) {
         if (var10000) {
            Type var5;
            label32: {
               var5 = ((GenericArrayType)var2).getGenericComponentType();
               Type var11 = var5;
               if (var4 == null) {
                  if (!(var5 instanceof TypeVariable)) {
                     break label32;
                  }

                  var11 = var5;
               }

               TypeVariable var6 = (TypeVariable)var11;
               var5 = var6.getBounds()[0];
            }

            ArrayList var9 = new ArrayList();
            var1.p(var5, var9);
            java.lang.Class var7 = B8_2.P$Class(var5);
            Object[] var8 = (Object[])Array.newInstance(var7, var9.size());
            var9.toArray(var8);
            return var8;
         }

         if (var4 != null) {
            return var2;
         }

         var10000 = var2 instanceof java.lang.Class;
      }

      if (var10000) {
         if (var4 != null) {
            return var2;
         }

         if (var2 != Object.class) {
            if (var4 != null) {
               return var2;
            }

            if (var2 != Serializable.class) {
               if (var4 != null) {
                  return var2;
               }

               if (var2 != Cloneable.class) {
                  if (var4 != null) {
                     return var2;
                  }

                  if (var2 != Closeable.class) {
                     if (var4 != null) {
                        return var2;
                     }

                     if (var2 != Comparable.class) {
                        return var1.o(var2);
                     }
                  }
               }
            }
         }
      }

      return var1.F(var3);
   }

   @Override
   public int j() {
      return (int)a;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6509822957084724406L;
      long var10002 = -5548857407918584646L ^ var0;
      byte var10001 = -1;
      a = var10002;
      S = new TH_2();
   }
}





