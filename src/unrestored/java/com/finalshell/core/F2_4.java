package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public abstract class F2_4 implements E22 {
   public static String a;

   @Override
   public abstract void Y(@C_9 String var1, Reader var2) throws B2_5, IOException;

   @Override
   public final void f(Reader var1) throws B2_5, IOException {
      this.Y(null, var1);
   }

   @Override
   public final void i(InputStream var1) throws B2_5, IOException {
      this.f(null, var1);
   }

   @Override
   public final void f(@C_9 String var1, InputStream var2) throws B2_5, IOException {
      this.d(var1, var2, null);
   }

   @Override
   public final void V(InputStream var1, @C_9 String var2) throws B2_5, IOException {
      F2_4 var10000;
      InputStreamReader var10001;
      label16: {
         try {
            var10000 = this;
            if (var2 == null) {
               var10001 = new InputStreamReader(var1);
               break label16;
            }
         } catch (B2_5 var3) {
            throw b(var3);
         }

         var10001 = new InputStreamReader(var1, var2);
      }

      var10000.f(var10001);
   }

   @Override
   public final void d(@C_9 String var1, InputStream var2, @C_9 String var3) throws B2_5, IOException {
      F2_4 var10000;
      String var10001;
      InputStreamReader var10002;
      label16: {
         try {
            var10000 = this;
            var10001 = var1;
            if (var3 == null) {
               var10002 = new InputStreamReader(var2);
               break label16;
            }
         } catch (B2_5 var4) {
            throw b(var4);
         }

         var10002 = new InputStreamReader(var2, var3);
      }

      var10000.Y(var10001, var10002);
   }

   @Override
   public final void D(String var1) throws B2_5 {
      this.E((String)null, var1);
   }

   @Override
   public final void E(@C_9 String var1, String var2) throws B2_5 {
      try {
         this.Y(var1, new StringReader(var2));
      } catch (IOException var4) {
         var4.printStackTrace();
         throw new RuntimeException(a);
      }
   }

   @Override
   public final void O(File var1) throws B2_5, IOException {
      this.o(var1, null);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public final void o(File var1, @C_9 String var2) throws B2_5, IOException {
      Ky4[] var10000 = D22_2.b();
      FileInputStream var4 = new FileInputStream(var1);
      Ky4[] var3 = var10000;

      try {
         String var24;
         InputStreamReader var10002;
         label104: {
            try {
               var22 = this;
               var24 = var1.getAbsolutePath();
               if (var2 == null) {
                  var10002 = new InputStreamReader(var4);
                  break label104;
               }
            } catch (IOException var19) {
      FileInputStream var21;
               throw b(var19);
            }

            var10002 = new InputStreamReader(var4, var2);
         }

         var22.Y(var24, var10002);
         var4.close();
         var4 = null;
      } finally {
         label95: {
            label94: {
               try {
                  var21 = var4;
                  if (var3 == null) {
                     break label94;
                  }

                  if (var4 == null) {
                     break label95;
                  }
               } catch (IOException var18) {
                  throw b(var18);
               }

               try {
                  var21 = var4;
               } catch (IOException var17) {
                  boolean var10001 = false;
                  break label95;
               }
            }

            try {
               var21.close();
            } catch (IOException var16) {
               boolean var23 = false;
            }
         }
      }
   }

   @Override
   public final void c(String var1) throws B2_5, IOException {
      this.r(var1, null);
   }

   @Override
   public final void r(String var1, @C_9 String var2) throws B2_5, IOException {
      this.o(new File(var1), var2);
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ">x@i|o\u0007\u001f_a4\u000eY\u0012\tS}s(T\u0001\u0002A|s\u0015s6\u0015Uj#(U\u001c\u0003".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 13;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 13;
         var10006 = var0;
      } else {
         var6 = 13;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 13;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 96;
               break;
            case 1:
               var23 = 59;
               break;
            case 2:
               var23 = 2;
               break;
            case 3:
               var23 = 94;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 49;
               break;
            default:
               var23 = 126;
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
   private static Object var21;
}





