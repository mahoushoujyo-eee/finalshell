import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JLabel;

public class bA_3 extends JLabel {
   boolean C;
   boolean E;
   boolean k;
   L9 z;
   private static final long[] a;
   private static final Integer[] b;

   public bA_3() {
      com.c.c(464786085348652427L).setBoolean(this, false);
      com.c.c(392015630954316309L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      bA_3 var37;
      int[] var10000 = L9.X();
      Graphics2D var3 = (Graphics2D)var1;
      int[] var2 = var10000;
      var37 = this;
      label146:
      if (var2 == null) {
         if ((L9)com.c.c(453257004386534821L).get(this) != null) {
            Method var38 = (Method)com.c.c(453257004386534821L).get(this);
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(219753915081057422L);
            Object[] var10002 = var10001;
            var10001 = var38;
            var38 = var10003;

            try {
               var40 = (KV)var38.invoke(var10001, var10002);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            KV var4 = var40;
            if (var2 != null) {
               return;
            }

            if (var4 != null) {
               var37 = this;
               if (var2 != null) {
                  break label146;
               }

               var38 = (Method)com.c.c(453257004386534821L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(564648154927582737L);
               var10002 = var10001;
               var10001 = var38;
               var38 = var10003;

               try {
                  var43 = (String)var38.invoke(var10001, var10002);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               label140:
               if (var43 != null) {
                  boolean var44 = com.c.c(464786085348652427L).getBoolean(this);
                  if (var2 == null) {
                     if (var44) {
                        var10001 = com.c.f();
                        var10003 = com.c.d(332825939301957587L);
                        var10002 = var10001;
                        KV var56 = var4;
                        var38 = var10003;

                        try {
                           var46 = (ArrayList)var38.invoke(var56, var10002);
                        } catch (InvocationTargetException var19) {
                           throw var19.getTargetException();
                        }

                        ArrayList var5 = var46;
                        int var6 = var5.size();
                        int var7 = 0;
                        int var8 = var5.size() - 1;
                        int var9 = this.getWidth();
                        byte var10 = 3;
                        byte var11 = 0;
                        byte var12 = 3;

                        while (var8 > -1 && var8 <= var5.size() - 1) {
                           label154: {
                              org.icmp4j.j var13 = (org.icmp4j.j)var5.get(var8);
                              boolean var14 = false;
                              var9 = this.getWidth() - var7 * var10 - 2;
                              Color var15 = new Color(
                                 a(7905, 5408312571946799138L), a(19171, 6259153862539068461L), a(12125, 3587598472273863056L), a(31186, 6171672549948618521L)
                              );
                              int var47 = var13.r();
                              if (var2 == null) {
                                 if (var47 < 0) {
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

                                 var47 = var9;
                              }

                              if (var47 < var11 && var2 == null) {
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

                     var44 = com.c.c(392015630954316309L).getBoolean(this);
                  }

                  if (var2 == null) {
                     if (var44) {
                        Color var22 = new Color(
                           a(22199, 1131852588013443191L), a(29103, 4954134141137583968L), a(17744, 3612066245606329242L), a(17744, 3612066245606329242L)
                        );
                        var3.setColor(var22);
                        var10001 = com.c.f();
                        var10003 = com.c.d(332825939301957587L);
                        var10002 = var10001;
                        KV var58 = var4;
                        var38 = var10003;

                        try {
                           var49 = (ArrayList)var38.invoke(var58, var10002);
                        } catch (InvocationTargetException var18) {
                           throw var18.getTargetException();
                        }

                        int var25 = var49.size();
                        var10001 = com.c.f();
                        var10003 = com.c.d(183746953072628965L);
                        var10002 = var10001;
                        KV var60 = var4;
                        var38 = var10003;

                        try {
                           var51 = (Integer)var38.invoke(var60, var10002);
                        } catch (InvocationTargetException var17) {
                           throw var17.getTargetException();
                        }

                        label107: {
                           int var27 = var51;
                           float var29 = (float)var27 / (float)var25;
                           byte var32 = 3;
                           byte var34 = 2;
                           byte var35 = 5;
                           int var36 = (int)(((float)this.getWidth() - (float)var35) * var29) + var34;
                           if (var2 == null) {
                              if (var29 > 0.0F) {
                                 var3.fillRect(this.getWidth() - var36, var32, var36, this.getHeight() - 2 * var32);
                                 if (var2 == null) {
                                    break label107;
                                 }
                              }

                              var22 = new Color(
                                 a(12125, 3587598472273863056L), a(18157, 8402803434809575460L), a(12125, 3587598472273863056L), a(23593, 6317014545797894891L)
                              );
                              var3.setColor(var22);
                           }

                           var3.fillRect(this.getWidth() - var36, var32, var36, this.getHeight() - 2 * var32);
                        }

                        if (var2 == null) {
                           break label140;
                        }
                     }

                     var37 = this;
                     if (var2 != null) {
                        break label146;
                     }

                     var44 = com.c.c(260753253443779149L).getBoolean(this);
                  }

                  if (var44) {
                     Color var24 = new Color(
                        a(4814, 2518210588004129798L), a(18157, 8402803434809575460L), a(23593, 6317014545797894891L), a(20222, 5621390007862476857L)
                     );
                     var3.setColor(var24);
                     byte var26 = 3;
                     byte var28 = 2;
                     float var30 = (float)this.getWidth() / 500.0F;
                     var10002 = com.c.f();
                     Method var10004 = com.c.d(520926529036853194L);
                     Object[] var73 = var10002;
                     KV var68 = var4;
                     Method var61 = var10004;

                     try {
                        var62 = (Integer)var61.invoke(var68, var73);
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     int var33 = (int)(var30 * (float)var62 + (float)var28);
                     var3.fillRect(this.getWidth() - var33, var26, var33, this.getHeight() - 2 * var26);
                  }
               }
            }
         }

         var37 = this;
      }

      var37.paint(var1);
   }

   public boolean P() {
      return com.c.c(260753253443779149L).getBoolean(this);
   }

   public void r(boolean var1) {
      com.c.c(260753253443779149L).setBoolean(this, var1);
   }

   public boolean w() {
      return com.c.c(392015630954316309L).getBoolean(this);
   }

   public void X(boolean var1) {
      com.c.c(392015630954316309L).setBoolean(this, var1);
   }

   public boolean v() {
      return com.c.c(464786085348652427L).getBoolean(this);
   }

   public void S(boolean var1) {
      com.c.c(464786085348652427L).setBoolean(this, var1);
   }

   public L9 y() {
      return (L9)com.c.c(453257004386534821L).get(this);
   }

   public void u(L9 var1) {
      com.c.c(453257004386534821L).set(this, var1);
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3787;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





