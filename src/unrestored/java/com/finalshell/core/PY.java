package com.finalshell.core;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;
import java.util.WeakHashMap;

public final class PY {
   public static Map h;
   public static Map y;
   public static Map W;

   public static int f(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)h.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.width;
   }

   public static Component Q(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)h.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(var1, -1);
            h.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.width = var1;
      return var0;
   }

   public static int m(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)h.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.height;
   }

   public static Component j(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)h.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(-1, var1);
            h.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.height = var1;
      return var0;
   }

   public static int S(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)y.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.width;
   }

   public static Component N(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)y.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(var1, -1);
            y.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.width = var1;
      return var0;
   }

   public static int Z(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)y.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.height;
   }

   public static Component w(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)y.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(-1, var1);
            y.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.height = var1;
      return var0;
   }

   public static int J(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)W.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.width;
   }

   public static Component b(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)W.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(var1, -1);
            W.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.width = var1;
      return var0;
   }

   public static int i(Component var0) {
      String var10000 = FV_2.D();
      Dimension var2 = (Dimension)W.get(var0);
      String var1 = var10000;
      Dimension var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return -1;
         }

         var3 = var2;
      }

      return var3.height;
   }

   public static Component y(Component var0, int var1) {
      String var10000 = FV_2.D();
      Dimension var3 = (Dimension)W.get(var0);
      String var2 = var10000;
      Dimension var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new Dimension(-1, var1);
            W.put(var0, var3);
            if (var2 == null) {
               return var0;
            }
         }

         var4 = var3;
      }

      var4.height = var1;
      return var0;
   }

   public static Dimension W(Component var0, Dimension var1) {
      String var2;
      Dimension var3;
      Dimension var4;
      Dimension var5;
      Dimension var6;
      Dimension var7;
      label95: {
         label104: {
            String var10000 = FV_2.D();
            var3 = (Dimension)h.get(var0);
            var2 = var10000;
            var4 = (Dimension)y.get(var0);
            var5 = (Dimension)W.get(var0);
            var6 = new Dimension(var1);
            var7 = var3;
            label93:
            if (var2 == null) {
               if (var3 != null) {
                  var7 = var3;
                  if (var2 != null) {
                     break label93;
                  }

                  if (var3.width != -1) {
                     var6.width = var3.width;
                     if (var2 == null) {
                        break label104;
                     }
                  }
               }

               var7 = var4;
            }

            label82:
            if (var2 == null) {
               if (var7 != null) {
                  var7 = var4;
                  if (var2 != null) {
                     break label82;
                  }

                  if (var4.width != -1) {
                     var6.width = Math.max(var4.width, var6.width);
                  }
               }

               var7 = var5;
            }

            if (var2 != null) {
               break label95;
            }

            if (var7 != null) {
               var7 = var5;
               if (var2 != null) {
                  break label95;
               }

               if (var5.width != -1) {
                  var6.width = Math.min(var6.width, var5.width);
               }
            }
         }

         var7 = var3;
      }

      label67:
      if (var2 == null) {
         if (var7 != null) {
            var7 = var3;
            if (var2 != null) {
               break label67;
            }

            if (var3.height != -1) {
               var6.height = var3.height;
               if (var2 == null) {
                  return var6;
               }
            }
         }

         var7 = var4;
      }

      label56:
      if (var2 == null) {
         if (var7 != null) {
            var7 = var4;
            if (var2 != null) {
               break label56;
            }

            if (var4.height != -1) {
               var6.height = Math.max(var4.height, var6.height);
            }
         }

         var7 = var5;
      }

      if (var2 != null) {
         return var7;
      } else {
         if (var7 != null) {
            if (var2 != null) {
               return var5;
            }

            if (var5.height != -1) {
               var6.height = Math.min(var6.height, var5.height);
            }
         }

         return var6;
      }
   }

   public static Component O(Component var0, int var1, int var2) {
      var0.setPreferredSize(new Dimension(var1, var2));
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      h = new WeakHashMap();
      y = new WeakHashMap();
      W = new WeakHashMap();
   }
}





