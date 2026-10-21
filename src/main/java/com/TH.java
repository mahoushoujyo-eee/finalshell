package com;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public class TH implements X4 {
   public static final com.TH S = new com.TH();
   private static final long a;

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      com.ky_4[] var4 = com.zS.p();
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
            Class var7 = com.B8.P(var5);
            Object[] var8 = (Object[])Array.newInstance(var7, var9.size());
            var9.toArray(var8);
            return var8;
         }

         if (var4 != null) {
            return var2;
         }

         var10000 = var2 instanceof Class;
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
      long var0 = 6509822957084724406L;
      long var10002 = -5548857407918584646L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





