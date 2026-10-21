package com.finalshell.core;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public final class No4 {
   public static long a;

   public static String O(URL var0) {
      try {
         return var0.toURI().toASCIIString();
      } catch (URISyntaxException var2) {
         return var0.toExternalForm();
      }
   }

   public static URL h(String var0) {
      try {
         return new URL(var0);
      } catch (MalformedURLException var2) {
         return null;
      }
   }

   public static URI L(String var0) {
      URL var3;
      String var10000 = FV_2.D();
      URL var2 = h(var0);
      String var1 = var10000;
      var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return A(var3);
   }

   public static URI A(URL var0) {
      String var1 = FV_2.D();

      try {
         try {
            if (var1 != null) {
               return var0.toURI();
            }

            if (var0 == null) {
               return null;
            }
         } catch (URISyntaxException var3) {
            throw a(var3);
         }

         return var0.toURI();
      } catch (URISyntaxException var4) {
         return null;
      }
   }

   public static String t(String var0) {
      URL var3;
      String var10000 = FV_2.D();
      URL var2 = h(var0);
      String var1 = var10000;
      var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return var3.getHost();
   }

   public static int D(String var0) {
      URL var3;
      String var10000 = FV_2.D();
      URL var2 = h(var0);
      String var1 = var10000;
      var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.getPort();
   }

   public static String O(String var0) {
      StringBuilder var3;
      String var10000 = FV_2.D();
      URL var2 = h(var0);
      String var1 = var10000;
      if (var2 != null) {
         String var5;
         label21: {
            label20: {
               var3 = new StringBuilder().append(var2.getHost());
               int var10001 = var2.getPort();
               int var10002 = (int)a;
               if (var1 == null) {
                  if (var10001 == var10002) {
                     break label20;
                  }

                  var10001 = var2.getPort();
                  var10002 = -1;
               }

               if (var10001 != var10002) {
                  var5 = ":" + var2.getPort();
                  break label21;
               }
            }

            var5 = "";
         }

         var10000 = var3.append(var5).toString();
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public static String H(String var0, String var1) {
      String var2;
      boolean var5;
      boolean var6;
      String var10000 = FV_2.D();
      String var3 = "/";
      var2 = var10000;
      boolean var4 = var0.endsWith("/");
      var5 = var1.startsWith("/");
      var6 = var4;
      label29:
      if (var2 == null) {
         if (var4) {
            var6 = var5;
            if (var2 != null) {
               break label29;
            }

            if (var5) {
               return var0 + var1.substring(1);
            }
         }

         var6 = var4;
      }

      if (var2 == null) {
         if (var6) {
            return var0 + var1;
         }

         var6 = var5;
      }

      return !var6 ? var0 + "/" + var1 : var0 + var1;
   }

   public static URISyntaxException a(URISyntaxException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4312746438832228035L;
      long var10002 = -1283973887797950829L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





