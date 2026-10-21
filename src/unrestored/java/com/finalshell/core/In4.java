package com.finalshell.core;

import com.finalshell.ui.model.KO;
import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class In4 {
   public static Logger P;
   public final List e;
   public YP Z;
   public KO n;
   public Im4 K;
   public static String a;
   public static long b;

   public In4(@NotNull YP var1, @NotNull KO var2) {
   super();
      boolean var10000 = YA3.w();
      this.Z = var1;
      this.n = var2;
      this.e = new ArrayList();
      boolean var3 = var10000;
      if (!var3) {
         Ky4.K(new String[4]);
      }
   }

   public void G(@NotNull Im4 var1) {
      this.K = var1;
   }

   public void U(@NotNull Ua2 var1, @NotNull DC3 var2) {
      boolean var3 = YA3.w();
      In4 var10000 = this;
      if (var3) {
         if (this.e.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      var10000.P(var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void P(@NotNull Ua2 var1, @NotNull DC3 var2) {
      Bc2_2 var8;
      int var10000 = (YA3.w()) ? 1 : 0;
      this.K.w();
      boolean var3 = (var10000) != 0;
      boolean var19 = false /* VF: Semaphore variable */;

      label250: {
         try {
            var19 = true;
            int var4 = W(var1, var2);
            var10000 = var4;
            if (var3) {
               if (var4 == -1) {
                  In4 var27 = this;
                  if (var3) {
                     var4 = this.E(this.K.x(), var2);
                     if (var4 == -1) {
                        P.debug(a);
                        var19 = false;
                        break label250;
                     }

                     var27 = this;
                  }

                  var1 = var27.K.x();
               }

               var10000 = var4;
            }

            int var5 = var10000;

            while (var5 > 0 && var1.t(var5 - 1).G()) {
               var5--;
               if (!var3) {
                  break;
               }
            }

            String var6 = this.Z(var1, var5, var4);
            Iterator var7 = this.e.iterator();

            label229:
            while (true) {
               var10000 = (var7.hasNext()) ? 1 : 0;

               label227:
               while (true) {
                  if (var10000 != 0) {
                     var8 = (Bc2_2)var7.next();
                     Ez2 var9 = var8.g(var6);
                     if (!var3) {
                        var19 = false;
                        return;
                     }

                     label240: {
                        Ez2 var29 = var9;
                        if (var3) {
                           if (var9 == null) {
                              break label240;
                           }

                           var29 = var9;
                        }

                        Iterator var10 = var29.A().iterator();

                        label216:
                        while (true) {
                           O2_3 var11;
                           Yw2 var12;
                           while (true) {
                              if (!var10.hasNext()) {
                                 break label216;
                              }

                              var11 = (O2_3)var10.next();
                              var12 = new Yw2(this.Z.K(), this.Z.s(), var11.O(), this.n, null);
                              var10000 = var11.U();
                              if (!var3) {
                                 continue label227;
                              }

                              if (!var3) {
                                 break;
                              }

                              if (var10000 >= 0) {
                                 var10000 = var11.c();
                                 break;
                              }
                           }

                           if (var3) {
                              if (var10000 > var6.length()) {
                                 continue;
                              }

                              var10000 = 0;
                           }

                           label211:
                           while (true) {
                              int var13 = var10000;
                              int var14 = var5;

                              while (true) {
                                 if (var14 > var4) {
                                    break label211;
                                 }

                                 int var15 = Math.max(var13, var11.U());
                                 int var16 = Math.min(var13 + this.K.B$int(), var11.c());
                                 var10000 = var15;
                                 int var10001 = var16;
                                 if (!var3) {
                                    if (var15 > var16) {
                                       continue label216;
                                    }

                                    var10000 = 0;
                                    break;
                                 }

                                 if (var3) {
                                    if (var15 < var16) {
                                       var1.t(var14).W(var15 - var13, new com.finalshell.ui.model.J2(var6.substring(var15, var16)), var12);
                                    }

                                    var10000 = var13;
                                    var10001 = this.K.B$int();
                                 }

                                 var13 = var10000 + var10001;
                                 var14++;
                                 if (!var3) {
                                    break label211;
                                 }
                              }
                           }

                           if (!var3) {
                              break;
                           }
                        }
                     }

                     if (var3) {
                        break;
                     }

                     var19 = false;
                     break label229;
                  }

                  var19 = false;
                  break label229;
               }
            }
         } finally {
            if (var19) {
               this.K.h$void();
            }
         }

         this.K.h$void();
         return;
      }

      this.K.h$void();
   }

   public int E(@NotNull Ua2 var1, @NotNull DC3 var2) {
      boolean var10000 = YA3.w();
      int var4 = Math.max(0, var1.b() - (int)b);
      boolean var3 = var10000;
      int var5 = var1.b() - 1;

      while (var5 >= var4) {
         if (var1.t(var5) == var2) {
            return var5;
         }

         var5--;
         if (!var3) {
            break;
         }
      }

      return -1;
   }

   public static int W(@NotNull Ua2 var0, @NotNull DC3 var1) {
      boolean var10000 = YA3.H();
      int var3 = 0;
      boolean var2 = var10000;

      while (var3 < var0.b()) {
         DC3 var4 = var0.t(var3);
         if (!var2) {
            if (var4 == var1) {
               return var3;
            }

            var3++;
         }

         if (var2) {
            break;
         }
      }

      return -1;
   }

   @NotNull
   public String Z(@NotNull Ua2 var1, int var2, int var3) {
      String var8;
      boolean var10000 = YA3.H();
      StringBuilder var5 = new StringBuilder();
      boolean var4 = var10000;
      int var6 = var2;

      while (true) {
         if (var6 <= var3) {
            var8 = var1.t(var6).V$String();
            if (var4) {
               break;
            }

            Object var7 = var8;
            if (!var4) {
               label27:
               if (var6 < var3) {
                  Object var9 = var7;
                  if (!var4) {
                     if (var7.length() >= this.K.B$int()) {
                        break label27;
                     }

                     var9 = var7 + new com.finalshell.ui.model.J2('\u0000', this.K.B$int() - var7.length());
                  }

                  var7 = var9;
               }

               var5.append((String)var7);
               var6++;
            }

            if (!var4) {
               continue;
            }
         }

         var8 = var5.toString();
         break;
      }

      return var8;
   }

   public void p(@NotNull Bc2_2 var1) {
      this.e.add(var1);
   }

   @NotNull
   public List Y(@NotNull String var1) {
      boolean var10000 = YA3.w();
      ArrayList var3 = new ArrayList();
      boolean var2 = var10000;

      for (Bc2_2 var5 : this.e) {
         Ez2 var6 = var5.g(var1);
         if (var6 != null) {
            var3.addAll(var6.A());
         }

         if (!var2) {
            break;
         }
      }

      if (Ky4.F$arrString() != null) {
         YA3.K(!var2);
      }

      return var3;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u00149\u0000PTA\u001911\u0000Z\u001bYP9=NXTG\u0019;1\u0000UH\u0015I%7\r[HFP9?".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 125;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 125;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 42;
               break;
            case 1:
               var21 = 37;
               break;
            case 2:
               var21 = 19;
               break;
            case 3:
               var21 = 67;
               break;
            case 4:
               var21 = 70;
               break;
            case 5:
               var21 = 72;
               break;
            default:
               var21 = 68;
         }
      } else {
         var13 = 125;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 3828723530021475443L;
            long var12 = 5614940002532988091L ^ var3;
            var8 = -1;
            b = var12;
            P = LoggerFactory.getLogger(In4.class);
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 125;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 42;
               break;
            case 1:
               var21 = 37;
               break;
            case 2:
               var21 = 19;
               break;
            case 3:
               var21 = 67;
               break;
            case 4:
               var21 = 70;
               break;
            case 5:
               var21 = 72;
               break;
            default:
               var21 = 68;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 42;
                  break;
               case 1:
                  var21 = 37;
                  break;
               case 2:
                  var21 = 19;
                  break;
               case 3:
                  var21 = 67;
                  break;
               case 4:
                  var21 = 70;
                  break;
               case 5:
                  var21 = 72;
                  break;
               default:
                  var21 = 68;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 3828723530021475443L;
               long var11 = 5614940002532988091L ^ var0;
               var6 = -1;
               b = var11;
               P = LoggerFactory.getLogger(In4.class);
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 42;
                  break;
               case 1:
                  var21 = 37;
                  break;
               case 2:
                  var21 = 19;
                  break;
               case 3:
                  var21 = 67;
                  break;
               case 4:
                  var21 = 70;
                  break;
               case 5:
                  var21 = 72;
                  break;
               default:
                  var21 = 68;
            }
         }
      }
   }
}





