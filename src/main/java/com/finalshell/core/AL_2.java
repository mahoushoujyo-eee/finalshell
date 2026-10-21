package com.finalshell.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class AL_2 {
   public static boolean g(Collection var0) {
      String var1 = FV_2.D();
      Collection var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return true;
         }

         var10000 = var0;
      }

      boolean var2 = var10000.isEmpty();
      return var1 != null ? var2 : var2;
   }

   public static List b(List var0, int var1) {
      String var2 = FV_2.D();
      List var10000 = var0;
      if (var2 == null) {
         if (var0.size() <= var1) {
            return var0;
         }

         var10000 = var0;
      }

      return y(var10000, 0, var1);
   }

   public static ArrayList y(List var0, int var1, int var2) {
      return new ArrayList(var0.subList(var1, var2));
   }

   public static ArrayList q(List var0, int var1, int var2) {
      String var3;
      int var5;
      ArrayList var6;
      String var10000 = FV_2.D();
      ArrayList var4 = new ArrayList(var2 - var1);
      var3 = var10000;
      var5 = var1;

      while (true) {
         if (var5 < var2) {
            var6 = var4;
            if (var3 != null) {
               break;
            }

            var4.add(Kp2.E((Cloneable)var0.get(var5)));
            var5++;
            if (var3 == null) {
               continue;
            }
         }

         var6 = var4;
         break;
      }

      return var6;
   }

   public static ArrayList F(Object[] var0) {
      ArrayList var1 = new ArrayList(var0.length);
      Collections.addAll(var1, var0);
      return var1;
   }

   public static ArrayList r(Iterator var0) {
      ArrayList var3;
      String var10000 = FV_2.D();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;

      while (true) {
         if (var0.hasNext()) {
            var3 = var2;
            if (var1 != null) {
               break;
            }

            var2.add(var0.next());
            if (var1 == null) {
               continue;
            }
         }

         var3 = var2;
         break;
      }

      return var3;
   }

   public static boolean Y(Collection var0, Object[] var1) {
      boolean var3;
      int var6;
      boolean var8;
      String var10000 = FV_2.D();
      var3 = false;
      Object[] var4 = var1;
      int var5 = var1.length;
      var6 = 0;
      String var2 = var10000;

      while (true) {
         if (var6 < var5) {
            Object var7 = var4[var6];
            if (var2 == null) {
               var8 = var0.contains(var7);
               if (var2 != null) {
                  break;
               }

               if (!var8) {
                  var3 |= var0.add(var7);
               }

               var6++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public static boolean l(Collection var0, Object[] var1) {
      boolean var3;
      int var6;
      boolean var8;
      var3 = false;
      String var10000 = FV_2.D();
      Object[] var4 = var1;
      int var5 = var1.length;
      var6 = 0;
      String var2 = var10000;

      while (true) {
         if (var6 < var5) {
            Object var7 = var4[var6];
            if (var2 == null) {
               var8 = var0.contains(var7);
               if (var2 != null) {
                  break;
               }

               if (!var8 && var7 != null) {
                  var3 |= var0.add(var7);
               }

               var6++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public static boolean D(Collection var0, Collection var1) {
      boolean var3;
      Object var5;
      boolean var6;
      String var10000 = FV_2.D();
      var3 = false;
      String var2 = var10000;
      Iterator var4 = var1.iterator();

      while (true) {
         if (var4.hasNext()) {
            var5 = var4.next();
            var6 = var0.contains(var5);
            if (var2 != null) {
               break;
            }

            label21: {
               if (var2 == null) {
                  if (var6) {
                     break label21;
                  }

                  var6 = var3 | var0.add(var5);
               }

               var3 = var6;
            }

            if (var2 == null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public static boolean W(Collection var0, Collection var1) {
      boolean var3;
      Object var5;
      boolean var7;
      String var10000 = FV_2.D();
      var3 = false;
      Iterator var4 = var1.iterator();
      String var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            label24: {
               var5 = var4.next();
               var10000 = (String)(var0);
               if (var2 == null) {
                  var7 = var0.contains(var5);
                  if (var2 != null) {
                     break;
                  }

                  if (var7) {
                     break label24;
                  }

                  var10000 = (String)var5;
               }

               if (var10000 != null) {
                  var3 |= var0.add(var5);
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public static boolean T(Collection var0, Object[] var1) {
      boolean var3;
      int var6;
      boolean var8;
      String var10000 = FV_2.D();
      var3 = false;
      Object[] var4 = var1;
      String var2 = var10000;
      int var5 = var1.length;
      var6 = 0;

      while (true) {
         if (var6 < var5) {
            Object var7 = var4[var6];
            var8 = var3 | var0.remove(var7);
            if (var2 != null) {
               break;
            }

            var3 = var8;
            var6++;
            if (var2 == null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public static ArrayList J(Collection var0) {
      return var0 == null ? null : new ArrayList(var0);
   }

   public static ArrayList y(Collection var0) {
      Iterator var3;
      String var1 = FV_2.D();
      if (var0 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var0.size());
         var3 = var0.iterator();

         ArrayList var10000;
         while (true) {
            if (var3.hasNext()) {
               Cloneable var4 = (Cloneable)var3.next();
               var10000 = var2;
               if (var1 != null) {
                  break;
               }

               var2.add(Kp2.E(var4));
               if (var1 == null) {
                  continue;
               }
            }

            var10000 = var2;
            break;
         }

         return var10000;
      }
   }

   public static ArrayList e(Object[] var0) {
      ArrayList var1 = new ArrayList(var0.length);
      Collections.addAll(var1, var0);
      return var1;
   }

   public static ArrayList U(Collection var0) {
      String var1 = FV_2.D();
      if (var0 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var0.size());

         for (Object var4 : var0) {
            label43: {
               boolean var10000 = var4 instanceof Collection;
               if (var1 == null) {
                  if (var10000) {
                     var2.add(U((Collection)var4));
                     if (var1 == null) {
                        break label43;
                     }
                  }

                  var10000 = var4 instanceof Cloneable;
               }

               label28:
               if (var1 == null) {
                  if (var10000) {
                     var2.add(Kp2.E((Cloneable)var4));
                     if (var1 == null) {
                        break label28;
                     }
                  }

                  var2.add(var4);
               }
            }

            if (var1 != null) {
               break;
            }
         }

         return var2;
      }
   }

   public static List f(List var0) {
      String var1 = FV_2.D();
      List var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      int var2 = var10000.size() - 1;

      while (true) {
         if (var2 >= 0) {
            var10000 = var0;
            if (var1 != null) {
               break;
            }

            if (var1 == null && var0.get(var2) == null) {
               var0.remove(var2);
            }

            var2--;
            if (var1 == null) {
               continue;
            }
         }

         var10000 = var0;
         break;
      }

      return var10000;
   }

   public static boolean n(List var0, List var1) {
      Iterator var3;
      boolean var5;
      String var2;
      List var10000;
      var2 = FV_2.D();
      var10000 = var0;
      label73:
      if (var2 == null) {
         if (var0 == null) {
            var10000 = var1;
            if (var2 != null) {
               break label73;
            }

            if (var1 == null) {
               return true;
            }
         }

         var10000 = var0;
      }

      label66: {
         label76: {
            if (var2 == null) {
               if (var10000 != null) {
                  var10000 = var1;
                  if (var2 != null) {
                     break label66;
                  }

                  if (var1 != null) {
                     break label76;
                  }
               }

               var10000 = var0;
            }

            if (var2 != null) {
               break label66;
            }

            if (var10000 != var1) {
               return false;
            }
         }

         var10000 = var0;
      }

      if (var2 == null) {
         if (var10000.size() != var1.size()) {
            return false;
         }

         var10000 = var0;
      }

      var3 = var10000.iterator();

      while (true) {
         if (var3.hasNext()) {
            Object var4 = var3.next();
            var5 = var1.contains(var4);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (!var5) {
               return false;
            }

            if (var2 == null) {
               continue;
            }
         }

         var5 = true;
         break;
      }

      return var5;
   }

   public static ArrayList t(List var0, C82 var1) {
      ArrayList var3;
      Object var5;
      ArrayList var6;
      String var10000 = FV_2.D();
      var3 = new ArrayList(var0.size());
      String var2 = var10000;
      Iterator var4 = var0.iterator();

      while (true) {
         if (var4.hasNext()) {
            var5 = var4.next();
            var6 = var3;
            if (var2 != null) {
               break;
            }

            var3.add(var1.C(var5));
            if (var2 == null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public static int[] J(List var0) {
      int var3;
      int[] var5;
      int var6;
      String var10000 = FV_2.D();
      int[] var2 = new int[var0.size()];
      var3 = 0;
      String var1 = var10000;

      while (true) {
         if (var3 < var0.size()) {
            Integer var4 = (Integer)var0.get(var3);
            var5 = var2;
            if (var1 != null) {
               break;
            }

            label22: {
               Integer var10002 = var4;
               if (var1 == null) {
                  if (var4 == null) {
                     var6 = 0;
                     break label22;
                  }

                  var10002 = var4;
               }

               var6 = var10002;
            }

            var2[var3] = var6;
            var3++;
            if (var1 == null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public static ArrayList o(Object[] var0) {
      ArrayList var1 = new ArrayList(var0.length);
      Collections.addAll(var1, var0);
      return var1;
   }

   public static ArrayList y(Deque var0) {
      return new ArrayList(var0);
   }

   public static ArrayList E(Collection var0, On2 var1) {
      ArrayList var3;
      Object var5;
      var3 = new ArrayList(var0.size());
      String var10000 = FV_2.D();
      Iterator var4 = var0.iterator();
      String var2 = var10000;

      while (var4.hasNext()) {
         var5 = var4.next();
         if (var2 == null && var1.n(var5)) {
            var3.add(var5);
         }

         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public static ArrayList t(Map var0) {
      return new ArrayList(var0.keySet());
   }

   public static ArrayList f(Map var0) {
      return new ArrayList(var0.values());
   }

   public static ArrayList n(Map var0) {
      Iterator var3;
      List var5;
      boolean var8;
      String var10000 = FV_2.D();
      ArrayList var2 = new ArrayList(0);
      String var1 = var10000;
      var3 = var0.entrySet().iterator();

      label44:
      while (true) {
         var8 = var3.hasNext();

         label41:
         while (var8) {
            Entry var4 = (Entry)var3.next();
            var5 = (List)var4.getValue();
            if (var1 != null) {
               return var2;
            }

            var2.ensureCapacity(var2.size() + var5.size());

            for (Object var7 : var5) {
               var8 = var2.contains(var7);
               if (var1 != null) {
                  continue label41;
               }

               if (var1 == null && !var8) {
                  var2.add(var7);
               }

               if (var1 != null) {
                  break;
               }
            }

            if (var1 == null) {
               continue label44;
            }
            break;
         }

         return var2;
      }
   }

   public static List p(int var0, Kp4 var1) {
      ArrayList var3;
      ArrayList var5;
      String var10000 = FV_2.D();
      var3 = new ArrayList(var0);
      String var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var0) {
            var5 = var3;
            if (var2 != null) {
               break;
            }

            var3.add(var1.U(var4));
            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }
}





