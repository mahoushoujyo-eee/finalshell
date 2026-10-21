package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Y1 {
   public static List B(Object[] var0) {
      ArrayList var1 = new ArrayList(var0.length);
      Collections.addAll(var1, var0);
      return var1;
   }

   public static boolean d(int var0, int[] var1) {
      String var2 = com.FV.D();
      int var10000 = x(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean z(long var0, long[] var2) {
      String var3 = com.FV.D();
      int var10000 = a(var0, var2);
      if (var3 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean v(float var0, float[] var1) {
      String var2 = com.FV.D();
      int var10000 = A(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean f(double var0, double[] var2) {
      String var3 = com.FV.D();
      int var10000 = N(var0, var2);
      if (var3 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean B(char var0, char[] var1) {
      String var2 = com.FV.D();
      int var10000 = a(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean C(byte var0, byte[] var1) {
      String var2 = com.FV.D();
      int var10000 = l(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean L(String var0, String[] var1) {
      String var2 = com.FV.D();
      int var10000 = V(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static boolean g(Object var0, Object[] var1) {
      String var2 = com.FV.D();
      int var10000 = q(var0, var1);
      if (var2 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static int x(int var0, int[] var1) {
      String var10000 = com.FV.D();
      int var3 = 0;
      String var2 = var10000;

      while (true) {
         if (var3 < var1.length) {
            var4 = var1[var3];
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var4;
            }

            if (var4 == var0) {
               return var3;
            }

            var3++;
            if (var2 == null) {
               continue;
            }
         }

         var4 = -1;
         break;
      }

      return var4;
   }

   public static int a(long var0, long[] var2) {
      String var10000 = com.FV.D();
      int var4 = 0;
      String var3 = var10000;

      while (true) {
         if (var4 < var2.length) {
            long var6;
            var5 = (var6 = var2[var4] - var0) == 0L ? 0 : (var6 < 0L ? -1 : 1);
            if (var3 != null) {
               break;
            }

            if (var3 != null) {
               return var5;
            }

            if (var5 == 0) {
               return var4;
            }

            var4++;
            if (var3 == null) {
               continue;
            }
         }

         var5 = -1;
         break;
      }

      return var5;
   }

   public static int A(float var0, float[] var1) {
      String var10000 = com.FV.D();
      int var3 = 0;
      String var2 = var10000;

      while (true) {
         if (var3 < var1.length) {
            float var5;
            var4 = (var5 = var1[var3] - var0) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var4;
            }

            if (var4 == 0) {
               return var3;
            }

            var3++;
            if (var2 == null) {
               continue;
            }
         }

         var4 = -1;
         break;
      }

      return var4;
   }

   public static int N(double var0, double[] var2) {
      String var10000 = com.FV.D();
      int var4 = 0;
      String var3 = var10000;

      while (true) {
         if (var4 < var2.length) {
            double var6;
            var5 = (var6 = var2[var4] - var0) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
            if (var3 != null) {
               break;
            }

            if (var3 != null) {
               return var5;
            }

            if (var5 == 0) {
               return var4;
            }

            var4++;
            if (var3 == null) {
               continue;
            }
         }

         var5 = -1;
         break;
      }

      return var5;
   }

   public static int a(char var0, char[] var1) {
      String var10000 = com.FV.D();
      int var3 = 0;
      String var2 = var10000;

      while (true) {
         if (var3 < var1.length) {
            var4 = var1[var3];
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var4;
            }

            if (var4 == var0) {
               return var3;
            }

            var3++;
            if (var2 == null) {
               continue;
            }
         }

         var4 = -1;
         break;
      }

      return var4;
   }

   public static int l(byte var0, byte[] var1) {
      String var10000 = com.FV.D();
      int var3 = 0;
      String var2 = var10000;

      while (true) {
         if (var3 < var1.length) {
            var4 = var1[var3];
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var4;
            }

            if (var4 == var0) {
               return var3;
            }

            var3++;
            if (var2 == null) {
               continue;
            }
         }

         var4 = -1;
         break;
      }

      return var4;
   }

   public static int V(String var0, String[] var1) {
      return w(var0, var1, false);
   }

   public static int w(String var0, String[] var1, boolean var2) {
      String var10000 = com.FV.D();
      int var4 = 0;

      for (String var3 = var10000; var4 < var1.length; var4++) {
         String var5;
         var5 = var1[var4];
         var10000 = var5;
         label55:
         if (var3 == null) {
            if (var5 == null) {
               var10000 = var0;
               if (var3 != null) {
                  break label55;
               }

               if (var0 == null) {
                  return var4;
               }
            }

            var10000 = var5;
         }

         if (var3 == null) {
            if (var10000 == null) {
               break;
            }

            var10000 = var0;
         }

         if (var10000 != null) {
            byte var7 = var2;
            if (var3 == null) {
               if (var2 != 0) {
                  if (var5.equalsIgnoreCase(var0)) {
                     return var4;
                  }
                  break;
               }

               var7 = var5.equals(var0);
            }

            if (var3 != null) {
               return var7;
            }

            if (var7 != 0) {
               return var4;
            }
         }
         break;
      }

      return -1;
   }

   public static int q(Object var0, Object[] var1) {
      String var10000 = com.FV.D();
      int var3 = 0;

      for (String var2 = var10000; var3 < var1.length; var3++) {
         Object var4;
         var4 = var1[var3];
         var10000 = (String)var4;
         label49:
         if (var2 == null) {
            if (var4 == null) {
               var10000 = (String)var0;
               if (var2 != null) {
                  break label49;
               }

               if (var0 == null) {
                  return var3;
               }
            }

            var10000 = (String)var4;
         }

         if (var2 == null) {
            if (var10000 == null) {
               break;
            }

            var10000 = (String)var0;
         }

         if (var2 == null) {
            if (var10000 == null) {
               break;
            }

            var10000 = (String)var4;
         }

         byte var6 = var10000.equals(var0);
         if (var2 != null) {
            return var6;
         }

         if (var6 != 0) {
            return var3;
         }
         break;
      }

      return -1;
   }

   public static Object[] E(Object[] var0, Object var1) {
      String var10000 = com.FV.D();
      Object[] var3 = R(var0, var0.length - 1);
      byte var4 = 0;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var0.length) {
         label25: {
            int var10001;
            label24: {
               if (var4 == 0) {
                  var10000 = var0;
                  var10001 = var5;
                  if (var2 != null) {
                     break label24;
                  }

                  if (var0[var5] == var1) {
                     var4 = -1;
                     if (var2 == null) {
                        break label25;
                     }
                  }
               }

               var10000 = var3;
               var10001 = var5 + var4;
            }

            ((Object[])var10000)[var10001] = (String)var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static int[] e(int[] var0, int var1) {
      int[] var3 = new int[var0.length - 1];
      String var10000 = com.FV.D();
      int var4 = 0;
      int var5 = 0;
      String var2 = var10000;

      while (var5 < var0.length) {
         label23: {
            label22: {
               int var6 = var5;
               if (var2 == null) {
                  if (var5 != var1) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static float[] k(float[] var0, float var1) {
      float[] var3 = new float[var0.length - 1];
      String var10000 = com.FV.D();
      int var4 = 0;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var0.length) {
         label23: {
            label22: {
               float var7;
               int var6 = (var7 = (float)var5 - var1) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  if (var6 != 0) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static double[] A(double[] var0, double var1) {
      double[] var4 = new double[var0.length - 1];
      int var5 = 0;
      String var10000 = com.FV.D();
      int var6 = 0;
      String var3 = var10000;

      while (var6 < var0.length) {
         label23: {
            label22: {
               double var8;
               int var7 = (var8 = (double)var6 - var1) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
               if (var3 == null) {
                  if (var7 != 0) {
                     break label22;
                  }

                  var7 = -1;
               }

               var5 = var7;
               if (var3 == null) {
                  break label23;
               }
            }

            var4[var6 + var5] = var0[var6];
         }

         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static char[] h(char[] var0, char var1) {
      String var10000 = com.FV.D();
      char[] var3 = new char[var0.length - 1];
      int var4 = 0;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var0.length) {
         label23: {
            label22: {
               int var6 = var5;
               if (var2 == null) {
                  if (var5 != var1) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static byte[] F(byte[] var0, byte var1) {
      byte[] var3 = new byte[var0.length - 1];
      String var10000 = com.FV.D();
      int var4 = 0;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var0.length) {
         label23: {
            label22: {
               int var6 = var5;
               if (var2 == null) {
                  if (var5 != var1) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static boolean[] i(boolean[] var0, int var1) {
      String var10000 = com.FV.D();
      boolean[] var3 = new boolean[var0.length - 1];
      int var4 = 0;
      int var5 = 0;
      String var2 = var10000;

      while (var5 < var0.length) {
         label23: {
            label22: {
               int var6 = var5;
               if (var2 == null) {
                  if (var5 != var1) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static Object[] X(Object[] var0, int var1) {
      String var10000 = com.FV.D();
      Object[] var3 = R(var0, var0.length - 1);
      int var4 = 0;
      int var5 = 0;
      String var2 = var10000;

      while (var5 < var0.length) {
         label23: {
            label22: {
               int var6 = var5;
               if (var2 == null) {
                  if (var5 != var1) {
                     break label22;
                  }

                  var6 = -1;
               }

               var4 = var6;
               if (var2 == null) {
                  break label23;
               }
            }

            var3[var5 + var4] = var0[var5];
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static int[] C(int[] var0, int var1, int var2) {
      int[] var4 = new int[var0.length + 1];
      String var10000 = com.FV.D();
      int var5 = 0;
      int var6 = 0;
      String var3 = var10000;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static float[] g(float[] var0, int var1, float var2) {
      float[] var4 = new float[var0.length + 1];
      String var10000 = com.FV.D();
      int var5 = 0;
      int var6 = 0;
      String var3 = var10000;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static double[] I(double[] var0, int var1, double var2) {
      double[] var5 = new double[var0.length + 1];
      int var6 = 0;
      String var10000 = com.FV.D();
      int var7 = 0;
      String var4 = var10000;

      while (var7 < var0.length) {
         label19: {
            int var8 = var7;
            if (var4 == null) {
               if (var7 != var1) {
                  break label19;
               }

               var5[var7] = var2;
               var8 = 1;
            }

            var6 = var8;
         }

         var5[var7 + var6] = var0[var7];
         var7++;
         if (var4 != null) {
            break;
         }
      }

      return var5;
   }

   public static char[] a(char[] var0, int var1, char var2) {
      char[] var4 = new char[var0.length + 1];
      String var10000 = com.FV.D();
      int var5 = 0;
      int var6 = 0;
      String var3 = var10000;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static byte[] L(byte[] var0, int var1, byte var2) {
      String var10000 = com.FV.D();
      byte[] var4 = new byte[var0.length + 1];
      String var3 = var10000;
      int var5 = 0;
      int var6 = 0;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static boolean[] W(boolean[] var0, int var1, boolean var2) {
      String var10000 = com.FV.D();
      boolean[] var4 = new boolean[var0.length + 1];
      String var3 = var10000;
      int var5 = 0;
      int var6 = 0;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static Object[] a(Object[] var0, int var1, Object var2) {
      String var10000 = com.FV.D();
      Object[] var4 = R(var0, var0.length + 1);
      String var3 = var10000;
      int var5 = 0;
      int var6 = 0;

      while (var6 < var0.length) {
         label19: {
            int var7 = var6;
            if (var3 == null) {
               if (var6 != var1) {
                  break label19;
               }

               var4[var6] = var2;
               var7 = 1;
            }

            var5 = var7;
         }

         var4[var6 + var5] = var0[var6];
         var6++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static Object[] R(Object[] var0, int var1) {
      return T(var0.getClass().getComponentType(), var1);
   }

   public static Object[] T(Class var0, int var1) {
      return (Object[])Array.newInstance(var0, var1);
   }
}





