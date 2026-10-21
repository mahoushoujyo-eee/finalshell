package com.finalshell.core;

import com.finalshell.ui.model.EP;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Nv4 {
   public List J = null;
   public List s = null;
   public List m = null;
   public List p = null;
   public List U = null;
   public List K = null;
   public List d = null;
   public List x = null;
   public boolean Q = true;
   public static String o;

   public List z() {
      String var1 = o();
      List var10000 = this.J;
      if (var1 != null) {
         if (this.J == null) {
            this.J = new ArrayList();
            this.Q = false;
         }

         var10000 = this.J;
      }

      return var10000;
   }

   public List K() {
      String var1 = o();
      List var10000 = this.s;
      if (var1 != null) {
         if (this.s == null) {
            this.s = new ArrayList();
            this.Q = false;
         }

         var10000 = this.s;
      }

      return var10000;
   }

   public List Y() {
      String var1 = o();
      List var10000 = this.U;
      if (var1 != null) {
         if (this.U == null) {
            this.U = new ArrayList();
            this.Q = false;
         }

         var10000 = this.U;
      }

      return var10000;
   }

   public List d() {
      String var1 = o();
      List var10000 = this.K;
      if (var1 != null) {
         if (this.K == null) {
            this.K = new ArrayList();
            this.Q = false;
         }

         var10000 = this.K;
      }

      return var10000;
   }

   public List Z() {
      String var1 = o();
      List var10000 = this.d;
      if (var1 != null) {
         if (this.d == null) {
            this.d = new ArrayList();
            this.Q = false;
         }

         var10000 = this.d;
      }

      return var10000;
   }

   public List w() {
      String var1 = o();
      List var10000 = this.m;
      if (var1 != null) {
         if (this.m == null) {
            this.m = new ArrayList();
            this.Q = false;
         }

         var10000 = this.m;
      }

      return var10000;
   }

   public List p() {
      String var1 = o();
      List var10000 = this.x;
      if (var1 != null) {
         if (this.x == null) {
            this.x = new ArrayList();
            this.Q = false;
         }

         var10000 = this.x;
      }

      return var10000;
   }

   public List A() {
      String var1 = o();
      List var10000 = this.p;
      if (var1 != null) {
         if (this.p == null) {
            this.p = new ArrayList();
            this.Q = false;
         }

         var10000 = this.p;
      }

      return var10000;
   }

   public void a(Wr4 var1) {
      String var2 = o();
      Wr4 var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      boolean var3 = var10000 instanceof CW3;
      if (var2 != null) {
         if (var3) {
            this.d().add((CW3)var1);
         }

         var3 = var1 instanceof WX_2;
      }

      if (var2 != null) {
         if (var3) {
            this.Y().add((WX_2)var1);
         }

         var3 = var1 instanceof N9;
      }

      if (var2 != null) {
         if (var3) {
            this.A().add((N9)var1);
         }

         var3 = var1 instanceof K2_2;
      }

      if (var2 != null) {
         if (var3) {
            this.p().add((K2_2)var1);
         }

         var3 = var1 instanceof KK_2;
      }

      if (var2 != null) {
         if (var3) {
            this.w().add((KK_2)var1);
         }

         var3 = var1 instanceof IK;
      }

      if (var2 != null) {
         if (var3) {
            this.z().add((IK)var1);
         }

         var3 = var1 instanceof H2;
      }

      if (var2 != null) {
         if (var3) {
            this.K().add((H2)var1);
         }

         var3 = var1 instanceof Wy4;
      }

      if (var2 != null && var3) {
         this.Z().add((Wy4)var1);
      }
   }

   public boolean O(NL3 var1, Object var2, String var3) {
      String var4 = o();
      List var10000 = var1.K;
      if (var4 != null) {
         if (var1.K != null) {
            for (CW3 var6 : var1.K) {
               boolean var9 = var6.G(var1, var2, var3);
               if (var4 == null) {
                  return var9;
               }

               if (var4 == null) {
                  return var9;
               }

               if (!var9) {
                  return false;
               }

               if (var4 == null) {
                  break;
               }
            }
         }

         var10000 = this.K;
      }

      if (var4 != null) {
         if (var10000 == null) {
            return true;
         }

         var10000 = this.K;
      }

      for (CW3 var8 : var10000) {
         boolean var10 = var8.G(var1, var2, var3);
         if (var4 == null) {
            return var10;
         }

         if (var4 == null) {
            return var10;
         }

         if (!var10) {
            return false;
         }

         if (var4 == null) {
            break;
         }
      }

      return true;
   }

   public boolean d(NL3 var1, Object var2, String var3, Object var4) {
      String var5 = o();
      List var10000 = var1.m;
      if (var5 != null) {
         if (var1.m != null) {
            for (KK_2 var7 : var1.m) {
               boolean var10 = var7.P(var2, var3, var4);
               if (var5 == null) {
                  return var10;
               }

               if (var5 == null) {
                  return var10;
               }

               if (!var10) {
                  return false;
               }

               if (var5 == null) {
                  break;
               }
            }
         }

         var10000 = this.m;
      }

      if (var5 != null) {
         if (var10000 == null) {
            return true;
         }

         var10000 = this.m;
      }

      for (KK_2 var9 : var10000) {
         boolean var11 = var9.P(var2, var3, var4);
         if (var5 == null) {
            return var11;
         }

         if (var5 == null) {
            return var11;
         }

         if (!var11) {
            return false;
         }

         if (var5 == null) {
            break;
         }
      }

      return true;
   }

   public String i(NL3 var1, Object var2, String var3, Object var4) {
      String var5 = o();
      List var10000 = var1.U;
      if (var5 != null) {
         if (var1.U != null) {
            for (WX_2 var7 : var1.U) {
               var3 = var7.g(var2, var3, var4);
               if (var5 == null) {
                  return var3;
               }

               if (var5 == null) {
                  break;
               }
            }
         }

         var10000 = this.U;
      }

      if (var5 != null) {
         if (var10000 == null) {
            return var3;
         }

         var10000 = this.U;
      }

      for (WX_2 var9 : var10000) {
         String var10 = var9.g(var2, var3, var4);
         if (var5 == null) {
            return var10;
         }

         var3 = var10;
         if (var5 == null) {
            break;
         }
      }

      return var3;
   }

   public Object c(NL3 var1, DL3 var2, Object var3, String var4, Object var5) {
      return this.L(var1, var2, var3, var4, var5, 0);
   }

   public Object L(NL3 var1, DL3 var2, Object var3, String var4, Object var5, int var6) {
      String var7;
      var7 = o();
      label167:
      if (var5 != null) {
         DL3 var19;
         label165: {
            label184: {
               boolean var10000 = EP.a(var1.w.q, var6, EP.WriteNonStringValueAsString);
               if (var7 != null) {
                  if (!var10000) {
                     var19 = var2;
                     if (var7 == null) {
                        break label165;
                     }

                     if (var2 == null) {
                        break label184;
                     }

                     var19 = var2;
                     if (var7 == null) {
                        break label165;
                     }

                     if ((var2.y$int() & EP.WriteNonStringValueAsString.mask) == 0) {
                        break label184;
                     }
                  }

                  var10000 = var5 instanceof Number;
               }

               label153: {
                  if (var7 != null) {
                     if (var10000) {
                        break label153;
                     }

                     var10000 = var5 instanceof Boolean;
                  }

                  if (!var10000) {
                     break label184;
                  }
               }

               String var8;
               var8 = null;
               label144:
               if (var5 instanceof Number) {
                  var19 = var2;
                  if (var7 != null) {
                     if (var2 == null) {
                        break label144;
                     }

                     var19 = var2;
                  }

                  var8 = var19.Y();
               }

               label137: {
                  String var21 = var8;
                  if (var7 != null) {
                     if (var8 != null) {
                        var5 = new DecimalFormat(var8).format(var5);
                        if (var7 != null) {
                           break label137;
                        }
                     }

                     var21 = var5.toString();
                  }

                  var5 = var21;
               }

               if (var7 != null) {
                  break label167;
               }
            }

            var19 = var2;
         }

         if (var7 != null) {
            if (var19 == null) {
               break label167;
            }

            var19 = var2;
         }

         if (var7 != null) {
            if (!var19.U()) {
               break label167;
            }

            var19 = (DL3)var5;
         }

         String var11 = (String)var19;
         var5 = Ok2.X(var11);
      }

      List var22 = var1.p;
      if (var7 != null) {
         if (var1.p != null) {
            for (N9 var9 : var1.p) {
               var5 = var9.q(var3, var4, var5);
               if (var7 == null) {
                  break;
               }
            }
         }

         var22 = this.p;
      }

      label102: {
         label176: {
            List var13 = var22;
            var22 = var13;
            if (var7 != null) {
               if (var13 != null) {
                  for (N9 var10 : var13) {
                     var5 = var10.q(var3, var4, var5);
                     if (var7 == null) {
                        break label176;
                     }

                     if (var7 == null) {
                        break;
                     }
                  }
               }

               var22 = var1.x;
            }

            if (var7 == null) {
               break label102;
            }

            if (var22 != null) {
               for (K2_2 var17 : var1.x) {
                  var5 = var17.F(var2, var3, var4, var5);
                  if (var7 == null) {
                     return var5;
                  }

                  if (var7 == null) {
                     break;
                  }
               }
            }
         }

         var22 = this.x;
      }

      if (var7 == null) {
         return var22;
      } else {
         if (var22 != null) {
            for (K2_2 var18 : this.x) {
               var22 = (List)var18.F(var2, var3, var4, var5);
               if (var7 == null) {
                  return var22;
               }

               var5 = var22;
               if (var7 == null) {
                  break;
               }
            }
         }

         return var5;
      }
   }

   public boolean q(NL3 var1) {
      String var2 = o();
      boolean var10000 = var1.w.D;
      if (var2 != null) {
         if (!var1.w.D) {
            return false;
         }

         var10000 = this.Q;
      }

      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = var1.Q;
      }

      return var2 == null ? var10000 : var10000;
   }

   public static void J(String var0) {
      o = var0;
   }

   public static String o() {
      return o;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (o() == null) {
         J("b2xtYb");
      }
   }
}





