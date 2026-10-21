package com;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class lz_4 {
   private static final long a;

   public static boolean f(String var0, String var1) {
      return k(var0, var1, null);
   }

   public static boolean k(String var0, String var1, com.FF var2) {
      return c(new File(var0), new File(var1), var2);
   }

   public static boolean B(File var0, File var1) {
      return c(var0, var1, null);
   }

   public static boolean c(File var0, File var1, com.FF var2) {
      String var3 = com.FV.D();

      try {
         ZipFile var4 = new ZipFile(var0);

         label70: {
            com.FF var10000;
            label69: {
               try {
                  var10000 = var2;
                  if (var3 != null) {
                     break label69;
                  }

                  if (var2 == null) {
                     break label70;
                  }
               } catch (Throwable var11) {
                  throw a(var11);
               }

               var10000 = var2;
            }

            var10000.s(var4.size());
         }

         Enumeration var5 = var4.entries();
         int var6 = 0;

         boolean var13;
         while (true) {
            if (var5.hasMoreElements()) {
               ZipEntry var7 = (ZipEntry)var5.nextElement();

               File var8;
               label55: {
                  label54: {
                     try {
                        var13 = var7.isDirectory();
                        if (var3 != null) {
                           break;
                        }

                        if (!var13) {
                           break label54;
                        }
                     } catch (Throwable var10) {
                        throw a(var10);
                     }

                     var8 = new File(var1, var7.getName());
                     var8.mkdirs();
                     if (var3 == null) {
                        break label55;
                     }
                  }

                  var8 = new File(var1, var7.getName());
                  var8.getParentFile().mkdirs();
                  var8.createNewFile();
                  q(var4.getInputStream(var7), new BufferedOutputStream(new FileOutputStream(var8)));
               }

               label46: {
                  label45: {
                     try {
                        var14 = var2;
                        if (var3 != null) {
                           break label45;
                        }

                        if (var2 == null) {
                           break label46;
                        }
                     } catch (Throwable var9) {
                        throw a(var9);
                     }

                     var14 = var2;
                  }

                  var14.e(var7, var8, var6);
                  var6++;
               }

               if (var3 == null) {
                  continue;
               }
            }

            var4.close();
            var13 = true;
            break;
         }

         return var13;
      } catch (Throwable var12) {
         nE_3.g(com.lz_4.class, var12);
         return false;
      }
   }

   public static String a(ZipEntry var0) {
      String var1 = var0.getName();
      return var1.substring(var1.lastIndexOf("/") + 1);
   }

   public static String E(ZipEntry var0) {
      String var1 = var0.getName();
      return var1.substring(0, var1.lastIndexOf("/") + 1);
   }

   private static void q(InputStream var0, OutputStream var1) throws IOException {
      String var10000 = com.FV.D();
      byte[] var3 = new byte[(int)a];
      String var2 = var10000;

      while (true) {
         int var4;
         if ((var4 = var0.read(var3)) >= 0) {
            try {
               var1.write(var3, 0, var4);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            } catch (IOException var5) {
               throw a(var5);
            }
         }

         var0.close();
         var1.close();
         break;
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      long var0 = 4495718024189373762L;
      long var10002 = -6231172318960228030L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





