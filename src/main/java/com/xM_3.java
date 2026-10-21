package com;

import java.lang.reflect.Type;

public class xM_3 {
   public Object T;
   public final xM_3 G;
   public final Object Y;
   public final int p;
   public Type F;
   private transient String H;

   public xM_3(xM_3 var1, Object var2, Object var3) {
      int var5;
      label14: {
         boolean var10000 = com.yn_4.Y();
         super();
         boolean var4 = var10000;
         this.G = var1;
         this.T = var2;
         this.Y = var3;
         xM_3 var10001 = var1;
         if (var4) {
            if (var1 == null) {
               var5 = 0;
               break label14;
            }

            var10001 = var1;
         }

         var5 = var10001.p + 1;
      }

      this.p = var5;
   }

   @Override
   public String toString() {
      boolean var1 = com.yn_4.o();
      String var10000 = this.H;
      if (!var1) {
         label23:
         if (this.H == null) {
            label36: {
               Object var2 = this.G;
               if (!var1) {
                  if (this.G == null) {
                     this.H = "$";
                     if (!var1) {
                        break label23;
                     }
                  }

                  var3 = this;
                  if (var1) {
                     break label36;
                  }

                  var2 = this.Y;
               }

               if (var2 instanceof Integer) {
                  this.H = this.G.toString() + "[" + this.Y + "]";
                  if (!var1) {
                     break label23;
                  }
               }

               var3 = this;
            }

            var3.H = this.G.toString() + "." + this.Y;
         }

         var10000 = this.H;
      }

      return var10000;
   }
}





