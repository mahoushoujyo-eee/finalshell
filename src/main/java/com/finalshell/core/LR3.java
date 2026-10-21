package com.finalshell.core;

import java.awt.Color;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.plaf.ColorUIResource;

public class LR3 implements LazyValue {
   public final String S;
   public final String u;
   public Object[] F;

   public LR3(String var1) {
      this(var1, (String)null);
   }

   public LR3(String var1, String var2) {
      this(var1, var2, null);
   }

   public LR3(String var1, Object[] var2) {
      this(var1, null, var2);
   }

   public LR3(String var1, String var2, Object[] var3) {
   super();
      int[] var10000 = WC_2.V();
      this.S = var1;
      int[] var4 = var10000;
      LR3 var5 = this;
      Object var10001 = var2;
      if (var4 == null) {
         this.u = var2;
         if (var3 == null) {
            return;
         }

         var5 = this;
         var10001 = var3.clone();
      }

      var5.F = (Object[])var10001;
   }

   @Override
   public Object createValue(UIDefaults var1) {
      int[] var2 = WC_2.V();

      try {
         java.lang.Class var3 = java.lang.Class.forName(this.S, true, null);

         label28: {
            LR3 var10000;
            label27: {
               try {
                  var10000 = this;
                  if (var2 != null) {
                     break label27;
                  }

                  if (this.u != null) {
                     break label28;
                  }
               } catch (Exception var6) {
                  throw a(var6);
               }

               var10000 = this;
            }

            java.lang.Class[] var8 = var10000.e(this.F);
            Constructor var9 = var3.getConstructor(var8);
            this.w(var9);
            return var9.newInstance(this.F);
         }

         java.lang.Class[] var4 = this.e(this.F);
         Method var5 = var3.getMethod(this.u, var4);
         this.w(var5);
         return var5.invoke(var3, this.F);
      } catch (Exception var7) {
         return null;
      }
   }

   public void w(AccessibleObject var1) {
      AccessController.doPrivileged(new L02(this, var1));
   }

   public java.lang.Class[] e(Object[] var1) {
      int[] var10000 = WC_2.V();
      java.lang.Class var3 = null;
      int[] var2 = var10000;
      Object[] var5 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return var3;
         }

         var5 = var1;
      }

      var3 = new java.lang.Class[var5.length];
      int var4 = 0;

      while (var4 < var1.length) {
         label54: {
            boolean var6 = var1[var4] instanceof Integer;
            if (var2 == null) {
               if (var6) {
                  ((Object[])var3)[var4] = int.class;
                  if (var2 == null) {
                     break label54;
                  }
               }

               var6 = var1[var4] instanceof Boolean;
            }

            if (var2 == null) {
               if (var6) {
                  ((Object[])var3)[var4] = boolean.class;
                  if (var2 == null) {
                     break label54;
                  }
               }

               var6 = var1[var4] instanceof ColorUIResource;
            }

            if (var6) {
               ((Object[])var3)[var4] = Color.class;
               if (var2 == null) {
                  break label54;
               }
            }

            ((Object[])var3)[var4] = var1[var4].getClass();
         }

         var4++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





