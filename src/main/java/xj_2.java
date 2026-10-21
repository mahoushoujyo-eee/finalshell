import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JLabel;

public class xj_2 extends JLabel implements D2 {
   Stroke x;
   Stroke k;
   int r;
   KV w;
   GradientPaint H;
   uI_3 A;
   uI_3 a;
   String z;
   lt_4 Z;
   BufferedImage e;
   Dimension o;
   Stroke R;
   Color Q;
   Color W;
   Color X;
   Color p;
   Color J;
   private static final long[] b;
   private static final Integer[] c;
   private static final long d;

   xj_2() {
      com.c.c(203693946467375876L).set(this, new BasicStroke(1.0F, 0, 2, 0.0F, new float[]{1.0F, 3.0F}, 0.0F));
      com.c.c(555042596625211364L).set(this, new BasicStroke());
      com.c.c(265748865419816880L).setInt(this, a(6062, 2113519868337587071L));
      com.c.c(182979044728031135L).set(this, new uI_3());
      com.c.c(191654938268693494L).set(this, new lt_4(this, this));
      com.c.c(462515155902943522L)
         .set(
            this,
            new GradientPaint(
               0.0F,
               0.0F,
               new Color(a(31275, 4922603460944064251L), a(7690, 4320372905290042066L), a(4200, 4988147908339696815L), 0),
               0.0F,
               (float)this.getHeight(),
               new Color(a(1653, 1586914350257738408L), a(3099, 4556190178524010697L), a(28690, 6163745976245282007L), a(28319, 1387109219823778373L))
            )
         );
      com.c.c(635597926172577928L).set(this, null);
      com.c.c(164654065625191329L).set(this, new Dimension());
      com.c.c(210987156779356239L).set(this, new BasicStroke(2.001F, 0, 2, 0.0F, new float[]{1.0F, 0.0F}, 0.0F));
      com.c.c(455449822049263553L)
         .set(this, new Color(a(23694, 6509328846656325708L), a(918, 7646675054754994002L), a(918, 7646675054754994002L), a(918, 7646675054754994002L)));
      com.c.c(220727372260161709L)
         .set(this, new Color(a(973, 2965697177489577752L), a(5805, 6840397145967952505L), a(9780, 4365790283899548415L), a(23398, 2704152277954351033L)));
      com.c.c(219664831517494633L)
         .set(this, new Color(a(32426, 5962152936759945849L), a(918, 7646675054754994002L), a(5805, 6840397145967952505L), a(32385, 4868675356346378823L)));
      com.c.c(139815103490214858L).set(this, new Color(0, 0, 0, a(16218, 1550401298067434372L)));
      com.c.c(194498005745921357L)
         .set(this, new Color(a(23398, 2704152277954351033L), a(13392, 289604341909692561L), a(918, 7646675054754994002L), a(5805, 6840397145967952505L)));
      Cursor var1 = new Cursor(a(23165, 7396942444530650814L));
      this.setCursor(var1);
      this.addMouseListener(new Kh_2(this));
   }

   public void p(KV var1, uI_3 var2, String var3) {
      com.c.c(445558421278779817L).set(this, var1);
      com.c.c(362540202329407130L).set(this, var3);
      com.c.c(452535993975552787L).set(this, var2);
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      label29: {
         String[] var2 = KV.b();
         if (var2 == null) {
            if (!com.c.c(413132319533195410L).getBoolean(null)) {
               break label29;
            }

            Method var10000 = (Method)com.c.c(191654938268693494L).get(this);
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(478374544918577864L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            var10000 = var10003;

            try {
               var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         if (var2 == null) {
            return;
         }
      }

      Object[] var8 = com.c.a(var1);
      Method var11 = com.c.d(385580207220951289L);
      Object[] var10 = var8;
      xj_2 var9 = this;
      Method var6 = var11;

      try {
         var6.invoke(var9, var10);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void h(Graphics var1) {
      int var3 = (int)((float)this.getHeight() / 3.0F);
      String[] var10000 = KV.b();
      int var4 = a(25240, 2436569347552998993L);
      String[] var2 = var10000;
      Graphics2D var5 = (Graphics2D)var1;
      var5.setPaint((GradientPaint)com.c.c(462515155902943522L).get(this));
      var5.fillRect(0, 0, this.getWidth(), this.getHeight());
      xj_2 var37 = this;
      if (var2 == null) {
         if ((KV)com.c.c(445558421278779817L).get(this) == null) {
            return;
         }

         var37 = this;
      }

      uI_3 var6;
      label198: {
         var6 = (uI_3)com.c.c(452535993975552787L).get(var37);
         uI_3 var38 = var6;
         if (var2 == null) {
            if (var6 != null) {
               break label198;
            }

            var38 = (uI_3)com.c.c(182979044728031135L).get(this);
         }

         var6 = var38;
      }

      long var7 = d;
      int var9 = 0;
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(612241643327702351L);
      Object[] var10002 = var10001;
      uI_3 var52 = var6;
      Method var39 = var10003;

      try {
         var40 = (ArrayList)var39.invoke(var52, var10002);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      ArrayList var10 = var40;
      int var11 = 0;

      while (true) {
         if (var11 < var10.size()) {
            var41 = var11;
            if (var2 != null) {
               break;
            }

            label186:
            if (var11 <= (this.getWidth() - var4) / com.c.c(265748865419816880L).getInt(this) || var2 != null) {
               label203: {
                  long var12 = (Long)var10.get(var10.size() - var11 - 1);
                  long var63;
                  int var42 = (var63 = var12 - var7) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var42 > 0) {
                        var7 = var12;
                     }

                     var9++;
                     if (var2 != null) {
                        break label203;
                     }

                     var42 = var9;
                  }

                  if (var42 > (this.getWidth() - var4) / com.c.c(265748865419816880L).getInt(this) && var2 == null) {
                     break label186;
                  }

                  var11++;
               }

               if (var2 == null) {
                  continue;
               }
            }
         }

         var41 = 0;
         break;
      }

      var9 = var41;
      var10001 = com.c.f();
      var10003 = com.c.d(413348846341046535L);
      var10002 = var10001;
      uI_3 var54 = var6;
      Method var43 = var10003;

      try {
         var44 = (ArrayList)var43.invoke(var54, var10002);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      ArrayList var27 = var44;
      int var28 = 0;

      while (true) {
         if (var28 < var27.size()) {
            var45 = var28;
            var55 = (this.getWidth() - var4) / com.c.c(265748865419816880L).getInt(this);
            if (var2 != null) {
               break;
            }

            label162:
            if (var28 <= var55 || var2 != null) {
               label206: {
                  long var13 = (Long)var27.get(var27.size() - var28 - 1);
                  long var64;
                  int var46 = (var64 = var13 - var7) == 0L ? 0 : (var64 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var46 > 0) {
                        var7 = var13;
                     }

                     var9++;
                     if (var2 != null) {
                        break label206;
                     }

                     var46 = var9;
                  }

                  if (var46 > (this.getWidth() - var4) / com.c.c(265748865419816880L).getInt(this) && var2 == null) {
                     break label162;
                  }

                  var28++;
               }

               if (var2 == null) {
                  continue;
               }
            }
         }

         var45 = this.getHeight();
         var55 = var3;
         break;
      }

      var28 = var45 - var55;
      var5.setStroke((Stroke)com.c.c(203693946467375876L).get(this));

      while (true) {
         var5.setColor((Color)com.c.c(455449822049263553L).get(this));
         var5.drawLine(this.getWidth(), var28, var4 - 5, var28);
         var5.setFont((Font)com.c.c(593752358540399204L).get(null));
         var5.setColor(Color.white);
         var28 -= var3;
         int var47;
         if (var28 > 0) {
            var47 = var28;
            if (var2 == null) {
               if (var28 <= 3) {
                  var28 = 1;
               }

               var47 = var28;
            }
         } else {
            var47 = var28;
         }

         while (var47 < 0) {
            if (var2 == null) {
               int var31 = 0;
               int var14 = var10.size() - 1;
               int var15 = this.getWidth();
               var5.setStroke((Stroke)com.c.c(210987156779356239L).get(this));

               while (true) {
                  if (var14 > -1) {
                     var48 = var14;
                     var56 = var10.size() - 1;
                     if (var2 != null || var2 != null) {
                        break;
                     }

                     label125:
                     if (var14 <= var56) {
                        long var16 = (Long)var10.get(var14);
                        long var18 = (Long)var27.get(var14);
                        byte var20 = 1;
                        var15 = this.getWidth() - var31 * com.c.c(265748865419816880L).getInt(this) - 2;
                        int var21 = (int)((float)this.getHeight() * ((float)var18 / (float)var7));
                        int var22 = this.getHeight() - var21;
                        var5.setColor((Color)com.c.c(219664831517494633L).get(this));
                        var5.drawLine(var15, this.getHeight() - var20, var15, var22 - var20);
                        var21 = (int)((float)this.getHeight() * ((float)var16 / (float)var7));
                        var22 = this.getHeight() - var21;
                        var5.setColor((Color)com.c.c(220727372260161709L).get(this));
                        var5.drawLine(var15, this.getHeight() - var20, var15, var22 - var20);
                        if (var2 == null) {
                           if (var15 < var4 && var2 == null) {
                              break label125;
                           }

                           var31++;
                           var14--;
                        }

                        if (var2 == null) {
                           continue;
                        }
                     }
                  }

                  var5.setStroke((Stroke)com.c.c(555042596625211364L).get(this));
                  var48 = this.getHeight();
                  var56 = var3;
                  break;
               }

               var28 = var48 - var56;
               var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

               do {
                  int var33 = this.getHeight() - var28;
                  int var17 = (int)((float)var33 * ((float)var7 / (float)this.getHeight()));
                  var5.setFont((Font)com.c.c(593752358540399204L).get(null));
                  var5.setColor(
                     new Color(a(16507, 4264158472167838899L), a(3099, 4556190178524010697L), a(3099, 4556190178524010697L), a(2062, 6319721500193692889L))
                  );
                  Object[] var49 = com.c.e((long)var17);
                  Method var50 = com.c.d(148259110884974759L);
                  var10002 = var49;
                  var10001 = null;

                  try {
                     var10000 = (String)var50.invoke(var10001, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  String var34 = var10000;
                  var5.setColor((Color)com.c.c(139815103490214858L).get(this));
                  var5.drawString(var34, 3, var28 + a(9028, 4038164815051995032L));
                  var28 -= var3;
                  if (var28 <= a(6596, 212298015292099844L)) {
                     if (var2 != null) {
                        continue;
                     }

                     var28 += 2;
                  }

                  if (var28 < 0 && var2 == null) {
                     break;
                  }
               } while (var2 == null);

               var5.setStroke((Stroke)com.c.c(555042596625211364L).get(this));
               var5.setColor((Color)com.c.c(194498005745921357L).get(this));
               var5.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
               var5.setColor(new Color(a(27039, 9185965785020595526L), a(21561, 4895245156347363554L), a(32717, 7114266256672353051L)));
               var5.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
               return;
            }

            var47 = var28;
         }
      }
   }

   static {
      long var2 = 7486166598590862314L;
      long[] var8 = new long[27];
      int var5 = 0;
      String var6 = "<;1\u009d÷\u0099\u0010\u0097Ø\u0000ZUåÊýÜ@ÅákrGùi\u0099FØ¸Fk\u000bÜ\u0001û\u0090\u0095\u0011Â\u0004æ\u0003Ñ-½þc\u0011÷Ç\u0088\u0099\u0098<\u0016\u008fWµF°ô\fçø\u0017\tG\f³éln~\u008eù¯´ûn\u0019Í¹T?á>îSéu¤\u0088KÞ$éé\u008d\u0005$+>r\u0001£NVP¿·À¤u\u0097\u0006U\u0095Ìo\\\u0015F\u0012°¹\u0080ú8\u0088ª&\u0081\u0087ò\u00973ù\u0007\rÔ¬*f\u009eäX\u001eHµÈ%]X\u0083\u0099õ\u0004¹@[0ìÂ1üQ°÷Ç\u001c\u009fàCiä\u0004.\u0085.:Ú\u0085Õ\u0017°\u000e?´ÂSÞyÕ^\u0006B\u0018Ùçe\u0098";
      int var7 = "<;1\u009d÷\u0099\u0010\u0097Ø\u0000ZUåÊýÜ@ÅákrGùi\u0099FØ¸Fk\u000bÜ\u0001û\u0090\u0095\u0011Â\u0004æ\u0003Ñ-½þc\u0011÷Ç\u0088\u0099\u0098<\u0016\u008fWµF°ô\fçø\u0017\tG\f³éln~\u008eù¯´ûn\u0019Í¹T?á>îSéu¤\u0088KÞ$éé\u008d\u0005$+>r\u0001£NVP¿·À¤u\u0097\u0006U\u0095Ìo\\\u0015F\u0012°¹\u0080ú8\u0088ª&\u0081\u0087ò\u00973ù\u0007\rÔ¬*f\u009eäX\u001eHµÈ%]X\u0083\u0099õ\u0004¹@[0ìÂ1üQ°÷Ç\u001c\u009fàCiä\u0004.\u0085.:Ú\u0085Õ\u0017°\u000e?´ÂSÞyÕ^\u0006B\u0018Ùçe\u0098"
         .length();
      byte var4 = 0;

      label20:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var10000 = var8;
         var10001 = var5++;
         long var10002 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var17 = var10002 ^ var2;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var17;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[27];
                     long var0 = 2403478032287123105L;
                     var10002 = 2403478032287123115L ^ var0;
                     byte var13 = -1;
                     d = var10002;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var17;
                  if (var4 < var7) {
                     continue label20;
                  }

                  var6 = "\u0018¹\u0019V\u0011îG¦ø\u001d[;}È!\u0001";
                  var7 = "\u0018¹\u0019V\u0011îG¦ø\u001d[;}È!\u0001".length();
                  var4 = 0;
            }

            byte var12 = var4;
            var4 += 8;
            var9 = var6.substring(var12, var4).getBytes("ISO-8859-1");
            var10000 = var8;
            var10001 = var5++;
            var10002 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5329;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





