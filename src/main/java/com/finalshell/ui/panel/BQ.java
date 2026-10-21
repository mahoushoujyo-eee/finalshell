package com.finalshell.ui.panel;

import com.finalshell.core.Cn4;
import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.icmp4j.j;

public class BQ extends O {
   boolean X;
   boolean l;
   boolean C;
   Cn4 K;
   public static long[] a;
   public static Integer[] b;

   public BQ() {
      Registry.lookupField(465076998820795390L).setBoolean(this, false);
      Registry.lookupField(541567056484133279L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      int[] var10000 = YQ.m();
      Graphics2D var3 = (Graphics2D)var1;
      int[] var2 = var10000;
      if (var2 != null) {
         Object var16 = 359767349189760149L;
         if ((Cn4)Ref.g(359767349189760149L, var16) != null) {
            Object var18 = 359767349189760149L;
            Ref.g(359767349189760149L, var18);
            KV var10003 = (KV)(Registry.emptyArgs());
            long var21 = 249636090880581982L;
            Object[] var20 = var10003;
            var10003 = Ref.h(249636090880581982L, var20, var21);

            try {
               var10003 = (KV)var10003;
            } catch (InvocationTargetException var39) {
               throw var39.getTargetException();
            }

            KV var4 = var10003;
            if (var2 == null) {
               return;
            }

            if (var4 != null && var2 != null) {
               Object var22 = 359767349189760149L;
               Ref.g(359767349189760149L, var22);
               String var10005 = (String)(Registry.emptyArgs());
               long var25 = 278346905124376511L;
               Object[] var24 = var10005;
               var10005 = Ref.h(278346905124376511L, var24, var25);

               try {
                  var10005 = (String)var10005;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               label140:
               if (var10005 != null) {
                  boolean var59 = Registry.lookupField(465076998820795390L).getBoolean(this);
                  if (var2 != null) {
                     if (var59) {
                        ArrayList var10006 = (ArrayList)(Registry.emptyArgs());
                        long var27 = 332825939301957587L;
                        Object[] var26 = var10006;
                        var10006 = Ref.h(332825939301957587L, var26, var27);

                        try {
                           var10006 = (ArrayList)var10006;
                        } catch (InvocationTargetException var37) {
                           throw var37.getTargetException();
                        }

                        ArrayList var5 = var10006;
                        int var6 = var5.size();
                        int var7 = 0;
                        int var8 = var5.size() - 1;
                        int var9 = this.getWidth();
                        byte var10 = 3;
                        byte var11 = 0;
                        byte var12 = 3;

                        while (var8 > -1 && var8 <= var5.size() - 1) {
                           label154: {
                              j var13 = (j)var5.get(var8);
                              boolean var14 = false;
                              var9 = this.getWidth() - var7 * var10 - 2;
                              Color var15 = new Color(
                                 b(23858, 405101189042242590L), b(32610, 1181630850680694339L), b(95, 4827956972381919608L), b(28022, 1279751076815680592L)
                              );
                              int var62 = var13.r();
                              if (var2 != null) {
                                 if (var62 == 0) {
                                    var15 = new Color(
                                       b(25796, 3786072303137897958L),
                                       b(24356, 2336235377905042954L),
                                       b(95, 4827956972381919608L),
                                       b(4618, 3432835749587733285L)
                                    );
                                 }

                                 var3.setColor(var15);
                                 var3.fillRect(var9, this.getHeight() - var12, var10, var12);
                                 if (var2 == null) {
                                    break label154;
                                 }

                                 var62 = var9;
                              }

                              if (var62 < var11 && var2 != null) {
                                 break;
                              }

                              var7++;
                              var8--;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        if (var2 != null) {
                           break label140;
                        }
                     }

                     var59 = Registry.lookupField(541567056484133279L).getBoolean(this);
                  }

                  if (var2 != null) {
                     if (var59) {
                        Color var40 = new Color(
                           b(14011, 187732484572213147L), b(28447, 243396881608652338L), b(32511, 5936554321999275994L), b(32511, 5936554321999275994L)
                        );
                        var3.setColor(var40);
                        ArrayList var63 = Registry.emptyArgs();
                        long var29 = 332825939301957587L;
                        Object[] var28 = var63;
                        var63 = Ref.h(332825939301957587L, var28, var29);

                        try {
                           var63 = (ArrayList)var63;
                        } catch (InvocationTargetException var36) {
                           throw var36.getTargetException();
                        }

                        int var43 = var63.size();
                        Object[] var10007 = Registry.emptyArgs();
                        long var31 = 183746953072628965L;
                        Object[] var30 = var10007;
                        var10007 = Ref.h(183746953072628965L, var30, var31);

                        try {
                           var67 = (Integer)var10007;
                        } catch (InvocationTargetException var35) {
                           throw var35.getTargetException();
                        }

                        label107: {
                           int var45 = var67;
                           float var47 = (float)var45 / (float)var43;
                           byte var50 = 3;
                           byte var52 = 2;
                           byte var53 = 5;
                           int var54 = (int)(((float)this.getWidth() - (float)var53) * var47) + var52;
                           if (var2 != null) {
                              if (var47 > 0.0F) {
                                 var3.fillRect(this.getWidth() - var54, var50, var54, this.getHeight() - 2 * var50);
                                 if (var2 != null) {
                                    break label107;
                                 }
                              }

                              var40 = new Color(
                                 b(95, 4827956972381919608L), b(5969, 6408181156028468850L), b(95, 4827956972381919608L), b(16392, 6596589606912760098L)
                              );
                              var3.setColor(var40);
                           }

                           var3.fillRect(this.getWidth() - var54, var50, var54, this.getHeight() - 2 * var50);
                        }

                        if (var2 != null) {
                           break label140;
                        }
                     }

                     if (var2 == null) {
                        break label140;
                     }

                     var59 = Registry.lookupField(259126238724376813L).getBoolean(this);
                  }

                  if (var59) {
                     Color var42 = new Color(
                        b(2399, 1371192639364419707L), b(5969, 6408181156028468850L), b(16392, 6596589606912760098L), b(4618, 3432835749587733285L)
                     );
                     var3.setColor(var42);
                     byte var44 = 3;
                     byte var46 = 2;
                     float var48 = (float)this.getWidth() / 500.0F;
                     Object[] var68 = Registry.emptyArgs();
                     long var33 = 520926529036853194L;
                     Object[] var32 = var68;
                     var68 = Ref.h(520926529036853194L, var32, var33);

                     try {
                        var70 = (Integer)var68;
                     } catch (InvocationTargetException var34) {
                        throw var34.getTargetException();
                     }

                     int var51 = (int)(var4 * (float)var70 + (float)var46);
                     var3.fillRect(this.getWidth() - var51, var44, var51, this.getHeight() - 2 * var44);
                  }
               }
            }
         }
      }

      super.paint(var1);
   }

   public boolean S() {
      return Registry.lookupField(259126238724376813L).getBoolean(this);
   }

   public void Z(boolean var1) {
      Registry.lookupField(259126238724376813L).setBoolean(this, var1);
   }

   public boolean j() {
      return Registry.lookupField(541567056484133279L).getBoolean(this);
   }

   public void Q(boolean var1) {
      Registry.lookupField(541567056484133279L).setBoolean(this, var1);
   }

   public boolean G() {
      return Registry.lookupField(465076998820795390L).getBoolean(this);
   }

   public void r(boolean var1) {
      Registry.lookupField(465076998820795390L).setBoolean(this, var1);
   }

   public Cn4 I() {
      Object var1 = 359767349189760149L;
      return (Cn4)Ref.g(359767349189760149L, var1);
   }

   public void P(Cn4 var1) {
      long var3 = 359767349189760149L;
      Ref.s(359767349189760149L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22822;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8490783523893611192L;
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "r\u0003\u0095ù\u0010î¾~Êà¥B\u0097ÚÓ¤üm9'5\u0099ZO\"Z2É\u001eø\u00ad\u001a(\u001dEä¼\u0011·¤hQÂþË\u0006Ä\u0002_RöfÉÑeÜg\u000f3åx\u001c,3\u0016\u00176Í=Ð\fÊ)R\u0095\u0006Ü\u001bA\u000bÉ\t\u009e®h\u0098\u008eÂ";
      int var5 = "r\u0003\u0095ù\u0010î¾~Êà¥B\u0097ÚÓ¤üm9'5\u0099ZO\"Z2É\u001eø\u00ad\u001a(\u001dEä¼\u0011·¤hQÂþË\u0006Ä\u0002_RöfÉÑeÜg\u000f3åx\u001c,3\u0016\u00176Í=Ð\fÊ)R\u0095\u0006Ü\u001bA\u000bÉ\t\u009e®h\u0098\u008eÂ"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[13];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "^lX5eÓ¼\u0006àºÑ¤çz\u0093e";
                  var5 = "^lX5eÓ¼\u0006àºÑ¤çz\u0093e".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





