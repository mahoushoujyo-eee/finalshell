package com;

import java.awt.Component;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class c4_2 implements p6_2 {
   private boolean e = true;
   private boolean M;
   private List W;
   private static int[] j;

   public c4_2() {
      this(true);
   }

   public c4_2(boolean var1) {
      this.M = var1;
   }

   @Override
   public boolean z() {
      return this.e;
   }

   public void q(boolean var1) {
      this.e = var1;
   }

   @Override
   public boolean h(Component var1, Component var2) {
      int[] var3;
      label106: {
         var3 = g();
         boolean var10000 = this.d();
         if (var3 == null) {
            if (!var10000) {
               break label106;
            }

            var10000 = com.FN.a(var2, var1);
         }

         if (var3 != null) {
            return var10000;
         }

         if (var10000) {
            return true;
         }

         List var10 = this.W;
         if (var3 == null) {
            if (this.W == null) {
               return false;
            }

            var10 = this.W;
         }

         Iterator var4 = var10.iterator();

         while (var4.hasNext()) {
            WeakReference var5 = (WeakReference)var4.next();
            Component var6 = (Component)var5.get();
            if (var3 != null) {
               return false;
            }

            label108: {
               Component var11 = var6;
               if (var3 == null) {
                  if (var6 == null) {
                     var4.remove();
                     if (var3 == null) {
                        break label108;
                     }
                  }

                  var11 = var6;
               }

               var10000 = com.FN.a(var11, var1);
               if (var3 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            if (var3 != null) {
               break;
            }
         }

         if (var3 == null) {
            return false;
         }
      }

      if (var2 == var1) {
         return true;
      } else {
         List var13 = this.W;
         if (var3 == null) {
            if (this.W == null) {
               return false;
            }

            var13 = this.W;
         }

         Iterator var7 = var13.iterator();

         while (var7.hasNext()) {
            label53: {
               WeakReference var8 = (WeakReference)var7.next();
               Component var9 = (Component)var8.get();
               Component var14 = var9;
               if (var3 == null) {
                  if (var9 == null) {
                     var7.remove();
                     if (var3 == null) {
                        break label53;
                     }
                  }

                  var14 = var9;
               }

               if (var14 == var1) {
                  return true;
               }
            }

            if (var3 != null) {
               break;
            }
         }

         return false;
      }
   }

   public boolean d() {
      return this.M;
   }

   public void R(boolean var1) {
      this.M = var1;
   }

   public List t() {
      ArrayList var2 = new ArrayList(this.W.size());
      int[] var10000 = g();
      Iterator var3 = this.W.iterator();
      int[] var1 = var10000;

      while (var3.hasNext()) {
         label23: {
            Component var5;
            label22: {
               WeakReference var4 = (WeakReference)var3.next();
               var5 = (Component)var4.get();
               if (var1 == null) {
                  if (var5 != null) {
                     break label22;
                  }

                  var3.remove();
               }

               if (var1 == null) {
                  break label23;
               }
            }

            var2.add(var5);
         }

         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public List f() {
      return this.W;
   }

   public void N(List var1) {
      int[] var10000 = g();
      Iterator var3 = var1.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         Component var4 = (Component)var3.next();
         this.p(var4);
         if (var2 != null) {
            break;
         }
      }
   }

   public void p(Component var1) {
      int[] var2 = g();
      List var10000 = this.W;
      if (var2 == null) {
         if (this.W == null) {
            this.W = new ArrayList(1);
         }

         var10000 = this.W;
      }

      var10000.add(new WeakReference(var1));
   }

   public void C(Component var1) {
      int[] var2 = g();
      List var10000 = this.W;
      if (var2 == null) {
         if (this.W == null) {
            return;
         }

         var10000 = this.W;
      }

      Iterator var3 = var10000.iterator();

      while (var3.hasNext()) {
         label27: {
            label26: {
               WeakReference var4 = (WeakReference)var3.next();
               Component var5 = (Component)var4.get();
               Component var6 = var5;
               if (var2 == null) {
                  if (var5 == null) {
                     break label26;
                  }

                  var6 = var5;
               }

               if (var6 != var1) {
                  break label27;
               }
            }

            var3.remove();
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public static void E(int[] var0) {
      j = var0;
   }

   public static int[] g() {
      return j;
   }

   static {
      if (g() != null) {
         E(new int[3]);
      }
   }
}





