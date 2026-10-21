package com.finalshell.ui.panel;

import com.finalshell.core.KV;
import com.finalshell.core.L9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import org.icmp4j.j;

public class BA3 extends JLabel {
   public boolean C;
   public boolean E;
   public boolean k;
   public L9 z;
   public static long[] a;
   public static Integer[] b;

   public BA3() {
      Registry.lookupField(464786085348652427L).setBoolean(this, false);
      Registry.lookupField(392015630954316309L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      int[] var10000 = L9.X();
      Graphics2D var3 = (Graphics2D)var1;
      int[] var2 = var10000;
      if (var2 == null) {
         Object var16 = 453257004386534821L;
         if ((L9)Ref.g(453257004386534821L, var16) != null) {
            Object var18 = 453257004386534821L;
            Ref.g(453257004386534821L, var18);
            KV var10003 = (KV)(Registry.emptyArgs());
            long var21 = 219753915081057422L;
            Object[] var20 = var10003;
            var10003 = Ref.h(219753915081057422L, var20, var21);

            try {
               var10003 = (KV)var10003;
            } catch (InvocationTargetException var39) {
               throw var39.getTargetException();
            }

            KV var4 = var10003;
            if (var2 != null) {
               return;
            }

            if (var4 != null && var2 == null) {
               Object var22 = 453257004386534821L;
               Ref.g(453257004386534821L, var22);
               String var10005 = (String)(Registry.emptyArgs());
               long var25 = 564648154927582737L;
               Object[] var24 = var10005;
               var10005 = Ref.h(564648154927582737L, var24, var25);

               try {
                  var10005 = (String)var10005;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               label140:
               if (var10005 != null) {
                  boolean var59 = Registry.lookupField(464786085348652427L).getBoolean(this);
                  if (var2 == null) {
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
                                 a(7905, 5408312571946799138L), a(19171, 6259153862539068461L), a(12125, 3587598472273863056L), a(31186, 6171672549948618521L)
                              );
                              int var62 = var13.r();
                              if (var2 == null) {
                                 if (var62 < 0) {
                                    var15 = new Color(
                                       a(17211, 6996260651426926071L),
                                       a(24200, 213527780357722185L),
                                       a(12125, 3587598472273863056L),
                                       a(20222, 5621390007862476857L)
                                    );
                                 }

                                 var3.setColor(var15);
                                 var3.fillRect(var9, this.getHeight() - var12, var10, var12);
                                 if (var2 != null) {
                                    break label154;
                                 }

                                 var62 = var9;
                              }

                              if (var62 < var11 && var2 == null) {
                                 break;
                              }

                              var7++;
                              var8--;
                           }

                           if (var2 != null) {
                              break;
                           }
                        }

                        if (var2 == null) {
                           break label140;
                        }
                     }

                     var59 = Registry.lookupField(392015630954316309L).getBoolean(this);
                  }

                  if (var2 == null) {
                     if (var59) {
                        Color var40 = new Color(
                           a(22199, 1131852588013443191L), a(29103, 4954134141137583968L), a(17744, 3612066245606329242L), a(17744, 3612066245606329242L)
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
                           if (var2 == null) {
                              if (var47 > 0.0F) {
                                 var3.fillRect(this.getWidth() - var54, var50, var54, this.getHeight() - 2 * var50);
                                 if (var2 == null) {
                                    break label107;
                                 }
                              }

                              var40 = new Color(
                                 a(12125, 3587598472273863056L), a(18157, 8402803434809575460L), a(12125, 3587598472273863056L), a(23593, 6317014545797894891L)
                              );
                              var3.setColor(var40);
                           }

                           var3.fillRect(this.getWidth() - var54, var50, var54, this.getHeight() - 2 * var50);
                        }

                        if (var2 == null) {
                           break label140;
                        }
                     }

                     if (var2 != null) {
                        break label140;
                     }

                     var59 = Registry.lookupField(260753253443779149L).getBoolean(this);
                  }

                  if (var59) {
                     Color var42 = new Color(
                        a(4814, 2518210588004129798L), a(18157, 8402803434809575460L), a(23593, 6317014545797894891L), a(20222, 5621390007862476857L)
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

   public boolean P() {
      return Registry.lookupField(260753253443779149L).getBoolean(this);
   }

   public void r(boolean var1) {
      Registry.lookupField(260753253443779149L).setBoolean(this, var1);
   }

   public boolean w() {
      return Registry.lookupField(392015630954316309L).getBoolean(this);
   }

   public void X(boolean var1) {
      Registry.lookupField(392015630954316309L).setBoolean(this, var1);
   }

   public boolean v() {
      return Registry.lookupField(464786085348652427L).getBoolean(this);
   }

   public void S(boolean var1) {
      Registry.lookupField(464786085348652427L).setBoolean(this, var1);
   }

   public L9 y() {
      Object var1 = 453257004386534821L;
      return (L9)Ref.g(453257004386534821L, var1);
   }

   public void u(L9 var1) {
      long var3 = 453257004386534821L;
      Ref.s(453257004386534821L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3787;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9151379928032611533L;
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "<+\u008d[Î±{B$¨,s\u0015\u008dG/a'¾\u001aÎGÄ!N'\u008bzø\u009b\u0010G+þdA#%ó!G£\u0094À|!È(\u008b\tR%\u008f\u0098-9â@òãS^AÀ\u0095ùXñÂ-\u001c\u008b\"Odþ\\D^ÙøÞ%i~à\\ü";
      int var5 = "<+\u008d[Î±{B$¨,s\u0015\u008dG/a'¾\u001aÎGÄ!N'\u008bzø\u009b\u0010G+þdA#%ó!G£\u0094À|!È(\u008b\tR%\u008f\u0098-9â@òãS^AÀ\u0095ùXñÂ-\u001c\u008b\"Odþ\\D^ÙøÞ%i~à\\ü"
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

                  var4 = "Zo\u001aya£ÔEç.O}5\u0094Ìb";
                  var5 = "Zo\u001aya£ÔEç.O}5\u0094Ìb".length();
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





