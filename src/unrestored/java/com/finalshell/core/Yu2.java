package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.Iterator;
import org.icmp4j.j;

public class Yu2 {
   public ArrayList Z = new ArrayList();
   public int H;
   public int c;
   public boolean a;
   public int n;
   public static int[] d;
   public static long b;

   public Yu2() {
      this.c = (int)b;
      D();
      this.a = false;
      this.n = 0;
      if (Ky4.F$arrString() != null) {
         k(new int[5]);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public synchronized void T(j var1) {
      int[] var10000 = D();
      this.Z.add(var1);
      int[] var2 = var10000;
      int var7 = this.Z.size();
      if (var2 != null) {
         if (var7 > this.c) {
            this.Z.remove(0);
         }

         var7 = (this.a) ? 1 : 0;
      }

      label47: {
         label72: {
            if (var2 != null) {
               if (var7 == 0) {
                  var7 = (var1.q$boolean()) ? 1 : 0;
                  if (var2 == null) {
                     break label47;
                  }

                  if (var7 == 0) {
                     break label72;
                  }

                  this.H = var1.r();
                  if (var2 != null) {
                     break label72;
                  }

                  Ky4.K(new String[2]);
               }

               var7 = var1.r();
            }

            if (var2 == null) {
               break label47;
            }

            if (var7 > 0) {
               this.H = var1.r();
            }
         }

         var7 = 0;
      }

      int var3 = var7;
      Iterator var5 = this.Z.iterator();
      int var8;
      if (var2 == null) {
         j var4 = (j)var5.next();
         var8 = var4.r();
         if (var2 != null) {
            if (var8 == 0) {
               var3++;
            }

            var8 = (var5.hasNext()) ? 1 : 0;
         }
      } else {
         var8 = (var5.hasNext()) ? 1 : 0;
      }

      while (true) {
         while (var8 != 0) {
            j var6 = (j)var5.next();
            var8 = var6.r();
            if (var2 != null) {
               if (var8 == 0) {
                  var3++;
               }

               var8 = (var5.hasNext()) ? 1 : 0;
            }
         }

         this.n = var3;
         if (var2 != null) {
            return;
         }

         var8 = (var5.hasNext()) ? 1 : 0;
      }
   }

   public int f() {
      return this.Z.size();
   }

   public ArrayList C() {
      return this.Z;
   }

   public int y() {
      return this.H;
   }

   public void T(int var1) {
      this.H = var1;
   }

   public static void k(int[] var0) {
      d = var0;
   }

   public static int[] D() {
      return d;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (D() == null) {
         k(new int[5]);
      }

      long var0 = 861350464523823344L;
      long var10002 = 720509128154245596L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





